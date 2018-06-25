package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityEquipmentException;
import com.consistent.ucwrt.model.EntityEquipment;
import com.consistent.ucwrt.model.impl.EntityEquipmentImpl;
import com.consistent.ucwrt.model.impl.EntityEquipmentModelImpl;
import com.consistent.ucwrt.service.persistence.EntityEquipmentPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entity equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEquipmentPersistence
 * @see EntityEquipmentUtil
 * @generated
 */
public class EntityEquipmentPersistenceImpl extends BasePersistenceImpl<EntityEquipment>
    implements EntityEquipmentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityEquipmentUtil} to access the entity equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityEquipmentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentModelImpl.FINDER_CACHE_ENABLED,
            EntityEquipmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentModelImpl.FINDER_CACHE_ENABLED,
            EntityEquipmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_EQUIPMENTBYID = new FinderPath(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentModelImpl.FINDER_CACHE_ENABLED,
            EntityEquipmentImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByEquipmentById", new String[] { Integer.class.getName() },
            EntityEquipmentModelImpl.EQUIPMENTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EQUIPMENTBYID = new FinderPath(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEquipmentById",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_EQUIPMENTBYID_EQUIPMENTID_2 = "entityEquipment.equipmentId = ?";
    private static final String _SQL_SELECT_ENTITYEQUIPMENT = "SELECT entityEquipment FROM EntityEquipment entityEquipment";
    private static final String _SQL_SELECT_ENTITYEQUIPMENT_WHERE = "SELECT entityEquipment FROM EntityEquipment entityEquipment WHERE ";
    private static final String _SQL_COUNT_ENTITYEQUIPMENT = "SELECT COUNT(entityEquipment) FROM EntityEquipment entityEquipment";
    private static final String _SQL_COUNT_ENTITYEQUIPMENT_WHERE = "SELECT COUNT(entityEquipment) FROM EntityEquipment entityEquipment WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityEquipment.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityEquipment exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityEquipment exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityEquipmentPersistenceImpl.class);
    private static EntityEquipment _nullEntityEquipment = new EntityEquipmentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityEquipment> toCacheModel() {
                return _nullEntityEquipmentCacheModel;
            }
        };

    private static CacheModel<EntityEquipment> _nullEntityEquipmentCacheModel = new CacheModel<EntityEquipment>() {
            @Override
            public EntityEquipment toEntityModel() {
                return _nullEntityEquipment;
            }
        };

    public EntityEquipmentPersistenceImpl() {
        setModelClass(EntityEquipment.class);
    }

    /**
     * Returns the entity equipment where equipmentId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityEquipmentException} if it could not be found.
     *
     * @param equipmentId the equipment ID
     * @return the matching entity equipment
     * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a matching entity equipment could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment findByEquipmentById(int equipmentId)
        throws NoSuchEntityEquipmentException, SystemException {
        EntityEquipment entityEquipment = fetchByEquipmentById(equipmentId);

        if (entityEquipment == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("equipmentId=");
            msg.append(equipmentId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityEquipmentException(msg.toString());
        }

        return entityEquipment;
    }

    /**
     * Returns the entity equipment where equipmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param equipmentId the equipment ID
     * @return the matching entity equipment, or <code>null</code> if a matching entity equipment could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment fetchByEquipmentById(int equipmentId)
        throws SystemException {
        return fetchByEquipmentById(equipmentId, true);
    }

    /**
     * Returns the entity equipment where equipmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param equipmentId the equipment ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity equipment, or <code>null</code> if a matching entity equipment could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment fetchByEquipmentById(int equipmentId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { equipmentId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
                    finderArgs, this);
        }

        if (result instanceof EntityEquipment) {
            EntityEquipment entityEquipment = (EntityEquipment) result;

            if ((equipmentId != entityEquipment.getEquipmentId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_ENTITYEQUIPMENT_WHERE);

            query.append(_FINDER_COLUMN_EQUIPMENTBYID_EQUIPMENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(equipmentId);

                List<EntityEquipment> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
                        finderArgs, list);
                } else {
                    EntityEquipment entityEquipment = list.get(0);

                    result = entityEquipment;

                    cacheResult(entityEquipment);

                    if ((entityEquipment.getEquipmentId() != equipmentId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
                            finderArgs, entityEquipment);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityEquipment) result;
        }
    }

    /**
     * Removes the entity equipment where equipmentId = &#63; from the database.
     *
     * @param equipmentId the equipment ID
     * @return the entity equipment that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment removeByEquipmentById(int equipmentId)
        throws NoSuchEntityEquipmentException, SystemException {
        EntityEquipment entityEquipment = findByEquipmentById(equipmentId);

        return remove(entityEquipment);
    }

    /**
     * Returns the number of entity equipments where equipmentId = &#63;.
     *
     * @param equipmentId the equipment ID
     * @return the number of matching entity equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEquipmentById(int equipmentId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_EQUIPMENTBYID;

        Object[] finderArgs = new Object[] { equipmentId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYEQUIPMENT_WHERE);

            query.append(_FINDER_COLUMN_EQUIPMENTBYID_EQUIPMENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(equipmentId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the entity equipment in the entity cache if it is enabled.
     *
     * @param entityEquipment the entity equipment
     */
    @Override
    public void cacheResult(EntityEquipment entityEquipment) {
        EntityCacheUtil.putResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentImpl.class, entityEquipment.getPrimaryKey(),
            entityEquipment);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
            new Object[] { entityEquipment.getEquipmentId() }, entityEquipment);

        entityEquipment.resetOriginalValues();
    }

    /**
     * Caches the entity equipments in the entity cache if it is enabled.
     *
     * @param entityEquipments the entity equipments
     */
    @Override
    public void cacheResult(List<EntityEquipment> entityEquipments) {
        for (EntityEquipment entityEquipment : entityEquipments) {
            if (EntityCacheUtil.getResult(
                        EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEquipmentImpl.class,
                        entityEquipment.getPrimaryKey()) == null) {
                cacheResult(entityEquipment);
            } else {
                entityEquipment.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity equipments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityEquipmentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityEquipmentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity equipment.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityEquipment entityEquipment) {
        EntityCacheUtil.removeResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentImpl.class, entityEquipment.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(entityEquipment);
    }

    @Override
    public void clearCache(List<EntityEquipment> entityEquipments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityEquipment entityEquipment : entityEquipments) {
            EntityCacheUtil.removeResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                EntityEquipmentImpl.class, entityEquipment.getPrimaryKey());

            clearUniqueFindersCache(entityEquipment);
        }
    }

    protected void cacheUniqueFindersCache(EntityEquipment entityEquipment) {
        if (entityEquipment.isNew()) {
            Object[] args = new Object[] { entityEquipment.getEquipmentId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EQUIPMENTBYID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID, args,
                entityEquipment);
        } else {
            EntityEquipmentModelImpl entityEquipmentModelImpl = (EntityEquipmentModelImpl) entityEquipment;

            if ((entityEquipmentModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_EQUIPMENTBYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { entityEquipment.getEquipmentId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EQUIPMENTBYID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
                    args, entityEquipment);
            }
        }
    }

    protected void clearUniqueFindersCache(EntityEquipment entityEquipment) {
        EntityEquipmentModelImpl entityEquipmentModelImpl = (EntityEquipmentModelImpl) entityEquipment;

        Object[] args = new Object[] { entityEquipment.getEquipmentId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EQUIPMENTBYID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID, args);

        if ((entityEquipmentModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_EQUIPMENTBYID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    entityEquipmentModelImpl.getOriginalEquipmentId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EQUIPMENTBYID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EQUIPMENTBYID,
                args);
        }
    }

    /**
     * Creates a new entity equipment with the primary key. Does not add the entity equipment to the database.
     *
     * @param equipmentId the primary key for the new entity equipment
     * @return the new entity equipment
     */
    @Override
    public EntityEquipment create(int equipmentId) {
        EntityEquipment entityEquipment = new EntityEquipmentImpl();

        entityEquipment.setNew(true);
        entityEquipment.setPrimaryKey(equipmentId);

        return entityEquipment;
    }

    /**
     * Removes the entity equipment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param equipmentId the primary key of the entity equipment
     * @return the entity equipment that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a entity equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment remove(int equipmentId)
        throws NoSuchEntityEquipmentException, SystemException {
        return remove((Serializable) equipmentId);
    }

    /**
     * Removes the entity equipment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity equipment
     * @return the entity equipment that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a entity equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment remove(Serializable primaryKey)
        throws NoSuchEntityEquipmentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityEquipment entityEquipment = (EntityEquipment) session.get(EntityEquipmentImpl.class,
                    primaryKey);

            if (entityEquipment == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityEquipment);
        } catch (NoSuchEntityEquipmentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityEquipment removeImpl(EntityEquipment entityEquipment)
        throws SystemException {
        entityEquipment = toUnwrappedModel(entityEquipment);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityEquipment)) {
                entityEquipment = (EntityEquipment) session.get(EntityEquipmentImpl.class,
                        entityEquipment.getPrimaryKeyObj());
            }

            if (entityEquipment != null) {
                session.delete(entityEquipment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityEquipment != null) {
            clearCache(entityEquipment);
        }

        return entityEquipment;
    }

    @Override
    public EntityEquipment updateImpl(
        com.consistent.ucwrt.model.EntityEquipment entityEquipment)
        throws SystemException {
        entityEquipment = toUnwrappedModel(entityEquipment);

        boolean isNew = entityEquipment.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityEquipment.isNew()) {
                session.save(entityEquipment);

                entityEquipment.setNew(false);
            } else {
                session.merge(entityEquipment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEquipmentImpl.class, entityEquipment.getPrimaryKey(),
            entityEquipment);

        clearUniqueFindersCache(entityEquipment);
        cacheUniqueFindersCache(entityEquipment);

        return entityEquipment;
    }

    protected EntityEquipment toUnwrappedModel(EntityEquipment entityEquipment) {
        if (entityEquipment instanceof EntityEquipmentImpl) {
            return entityEquipment;
        }

        EntityEquipmentImpl entityEquipmentImpl = new EntityEquipmentImpl();

        entityEquipmentImpl.setNew(entityEquipment.isNew());
        entityEquipmentImpl.setPrimaryKey(entityEquipment.getPrimaryKey());

        entityEquipmentImpl.setEquipmentId(entityEquipment.getEquipmentId());
        entityEquipmentImpl.setEquipmentDescription(entityEquipment.getEquipmentDescription());
        entityEquipmentImpl.setEquipmentPurchasePrice(entityEquipment.getEquipmentPurchasePrice());
        entityEquipmentImpl.setEquipmentPurchasePriceDll(entityEquipment.getEquipmentPurchasePriceDll());
        entityEquipmentImpl.setEquipmentSalePrice(entityEquipment.getEquipmentSalePrice());
        entityEquipmentImpl.setStatus(entityEquipment.getStatus());
        entityEquipmentImpl.setModelId(entityEquipment.getModelId());
        entityEquipmentImpl.setBrandId(entityEquipment.getBrandId());
        entityEquipmentImpl.setYearModel(entityEquipment.getYearModel());

        return entityEquipmentImpl;
    }

    /**
     * Returns the entity equipment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity equipment
     * @return the entity equipment
     * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a entity equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityEquipmentException, SystemException {
        EntityEquipment entityEquipment = fetchByPrimaryKey(primaryKey);

        if (entityEquipment == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityEquipment;
    }

    /**
     * Returns the entity equipment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEquipmentException} if it could not be found.
     *
     * @param equipmentId the primary key of the entity equipment
     * @return the entity equipment
     * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a entity equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment findByPrimaryKey(int equipmentId)
        throws NoSuchEntityEquipmentException, SystemException {
        return findByPrimaryKey((Serializable) equipmentId);
    }

    /**
     * Returns the entity equipment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity equipment
     * @return the entity equipment, or <code>null</code> if a entity equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityEquipment entityEquipment = (EntityEquipment) EntityCacheUtil.getResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                EntityEquipmentImpl.class, primaryKey);

        if (entityEquipment == _nullEntityEquipment) {
            return null;
        }

        if (entityEquipment == null) {
            Session session = null;

            try {
                session = openSession();

                entityEquipment = (EntityEquipment) session.get(EntityEquipmentImpl.class,
                        primaryKey);

                if (entityEquipment != null) {
                    cacheResult(entityEquipment);
                } else {
                    EntityCacheUtil.putResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEquipmentImpl.class, primaryKey,
                        _nullEntityEquipment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                    EntityEquipmentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityEquipment;
    }

    /**
     * Returns the entity equipment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param equipmentId the primary key of the entity equipment
     * @return the entity equipment, or <code>null</code> if a entity equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEquipment fetchByPrimaryKey(int equipmentId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) equipmentId);
    }

    /**
     * Returns all the entity equipments.
     *
     * @return the entity equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEquipment> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity equipments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity equipments
     * @param end the upper bound of the range of entity equipments (not inclusive)
     * @return the range of entity equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEquipment> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity equipments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity equipments
     * @param end the upper bound of the range of entity equipments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEquipment> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<EntityEquipment> list = (List<EntityEquipment>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYEQUIPMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYEQUIPMENT;

                if (pagination) {
                    sql = sql.concat(EntityEquipmentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityEquipment>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityEquipment>(list);
                } else {
                    list = (List<EntityEquipment>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the entity equipments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityEquipment entityEquipment : findAll()) {
            remove(entityEquipment);
        }
    }

    /**
     * Returns the number of entity equipments.
     *
     * @return the number of entity equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ENTITYEQUIPMENT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the entity equipment persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityEquipment")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityEquipment>> listenersList = new ArrayList<ModelListener<EntityEquipment>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityEquipment>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityEquipmentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
