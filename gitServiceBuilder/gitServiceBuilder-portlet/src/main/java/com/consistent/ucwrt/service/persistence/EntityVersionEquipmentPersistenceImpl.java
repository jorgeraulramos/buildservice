package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityVersionEquipmentException;
import com.consistent.ucwrt.model.EntityVersionEquipment;
import com.consistent.ucwrt.model.impl.EntityVersionEquipmentImpl;
import com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl;
import com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the entity version equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentPersistence
 * @see EntityVersionEquipmentUtil
 * @generated
 */
public class EntityVersionEquipmentPersistenceImpl extends BasePersistenceImpl<EntityVersionEquipment>
    implements EntityVersionEquipmentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityVersionEquipmentUtil} to access the entity version equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityVersionEquipmentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionEquipmentModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionEquipmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionEquipmentModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionEquipmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYVERSIONEQUIPMENT = "SELECT entityVersionEquipment FROM EntityVersionEquipment entityVersionEquipment";
    private static final String _SQL_COUNT_ENTITYVERSIONEQUIPMENT = "SELECT COUNT(entityVersionEquipment) FROM EntityVersionEquipment entityVersionEquipment";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityVersionEquipment.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityVersionEquipment exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityVersionEquipmentPersistenceImpl.class);
    private static EntityVersionEquipment _nullEntityVersionEquipment = new EntityVersionEquipmentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityVersionEquipment> toCacheModel() {
                return _nullEntityVersionEquipmentCacheModel;
            }
        };

    private static CacheModel<EntityVersionEquipment> _nullEntityVersionEquipmentCacheModel =
        new CacheModel<EntityVersionEquipment>() {
            @Override
            public EntityVersionEquipment toEntityModel() {
                return _nullEntityVersionEquipment;
            }
        };

    public EntityVersionEquipmentPersistenceImpl() {
        setModelClass(EntityVersionEquipment.class);
    }

    /**
     * Caches the entity version equipment in the entity cache if it is enabled.
     *
     * @param entityVersionEquipment the entity version equipment
     */
    @Override
    public void cacheResult(EntityVersionEquipment entityVersionEquipment) {
        EntityCacheUtil.putResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionEquipmentImpl.class,
            entityVersionEquipment.getPrimaryKey(), entityVersionEquipment);

        entityVersionEquipment.resetOriginalValues();
    }

    /**
     * Caches the entity version equipments in the entity cache if it is enabled.
     *
     * @param entityVersionEquipments the entity version equipments
     */
    @Override
    public void cacheResult(
        List<EntityVersionEquipment> entityVersionEquipments) {
        for (EntityVersionEquipment entityVersionEquipment : entityVersionEquipments) {
            if (EntityCacheUtil.getResult(
                        EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityVersionEquipmentImpl.class,
                        entityVersionEquipment.getPrimaryKey()) == null) {
                cacheResult(entityVersionEquipment);
            } else {
                entityVersionEquipment.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity version equipments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityVersionEquipmentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityVersionEquipmentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity version equipment.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityVersionEquipment entityVersionEquipment) {
        EntityCacheUtil.removeResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionEquipmentImpl.class,
            entityVersionEquipment.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityVersionEquipment> entityVersionEquipments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityVersionEquipment entityVersionEquipment : entityVersionEquipments) {
            EntityCacheUtil.removeResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                EntityVersionEquipmentImpl.class,
                entityVersionEquipment.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity version equipment with the primary key. Does not add the entity version equipment to the database.
     *
     * @param entityVersionEquipmentPK the primary key for the new entity version equipment
     * @return the new entity version equipment
     */
    @Override
    public EntityVersionEquipment create(
        EntityVersionEquipmentPK entityVersionEquipmentPK) {
        EntityVersionEquipment entityVersionEquipment = new EntityVersionEquipmentImpl();

        entityVersionEquipment.setNew(true);
        entityVersionEquipment.setPrimaryKey(entityVersionEquipmentPK);

        return entityVersionEquipment;
    }

    /**
     * Removes the entity version equipment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityVersionEquipmentPK the primary key of the entity version equipment
     * @return the entity version equipment that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionEquipment remove(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws NoSuchEntityVersionEquipmentException, SystemException {
        return remove((Serializable) entityVersionEquipmentPK);
    }

    /**
     * Removes the entity version equipment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity version equipment
     * @return the entity version equipment that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionEquipment remove(Serializable primaryKey)
        throws NoSuchEntityVersionEquipmentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityVersionEquipment entityVersionEquipment = (EntityVersionEquipment) session.get(EntityVersionEquipmentImpl.class,
                    primaryKey);

            if (entityVersionEquipment == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityVersionEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityVersionEquipment);
        } catch (NoSuchEntityVersionEquipmentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityVersionEquipment removeImpl(
        EntityVersionEquipment entityVersionEquipment)
        throws SystemException {
        entityVersionEquipment = toUnwrappedModel(entityVersionEquipment);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityVersionEquipment)) {
                entityVersionEquipment = (EntityVersionEquipment) session.get(EntityVersionEquipmentImpl.class,
                        entityVersionEquipment.getPrimaryKeyObj());
            }

            if (entityVersionEquipment != null) {
                session.delete(entityVersionEquipment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityVersionEquipment != null) {
            clearCache(entityVersionEquipment);
        }

        return entityVersionEquipment;
    }

    @Override
    public EntityVersionEquipment updateImpl(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws SystemException {
        entityVersionEquipment = toUnwrappedModel(entityVersionEquipment);

        boolean isNew = entityVersionEquipment.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityVersionEquipment.isNew()) {
                session.save(entityVersionEquipment);

                entityVersionEquipment.setNew(false);
            } else {
                session.merge(entityVersionEquipment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionEquipmentImpl.class,
            entityVersionEquipment.getPrimaryKey(), entityVersionEquipment);

        return entityVersionEquipment;
    }

    protected EntityVersionEquipment toUnwrappedModel(
        EntityVersionEquipment entityVersionEquipment) {
        if (entityVersionEquipment instanceof EntityVersionEquipmentImpl) {
            return entityVersionEquipment;
        }

        EntityVersionEquipmentImpl entityVersionEquipmentImpl = new EntityVersionEquipmentImpl();

        entityVersionEquipmentImpl.setNew(entityVersionEquipment.isNew());
        entityVersionEquipmentImpl.setPrimaryKey(entityVersionEquipment.getPrimaryKey());

        entityVersionEquipmentImpl.setEquipmentId(entityVersionEquipment.getEquipmentId());
        entityVersionEquipmentImpl.setVersionId(entityVersionEquipment.getVersionId());
        entityVersionEquipmentImpl.setModelId(entityVersionEquipment.getModelId());
        entityVersionEquipmentImpl.setBrandName(entityVersionEquipment.getBrandName());
        entityVersionEquipmentImpl.setYearModel(entityVersionEquipment.getYearModel());

        return entityVersionEquipmentImpl;
    }

    /**
     * Returns the entity version equipment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity version equipment
     * @return the entity version equipment
     * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionEquipment findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityVersionEquipmentException, SystemException {
        EntityVersionEquipment entityVersionEquipment = fetchByPrimaryKey(primaryKey);

        if (entityVersionEquipment == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityVersionEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityVersionEquipment;
    }

    /**
     * Returns the entity version equipment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionEquipmentException} if it could not be found.
     *
     * @param entityVersionEquipmentPK the primary key of the entity version equipment
     * @return the entity version equipment
     * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionEquipment findByPrimaryKey(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws NoSuchEntityVersionEquipmentException, SystemException {
        return findByPrimaryKey((Serializable) entityVersionEquipmentPK);
    }

    /**
     * Returns the entity version equipment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity version equipment
     * @return the entity version equipment, or <code>null</code> if a entity version equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionEquipment fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityVersionEquipment entityVersionEquipment = (EntityVersionEquipment) EntityCacheUtil.getResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                EntityVersionEquipmentImpl.class, primaryKey);

        if (entityVersionEquipment == _nullEntityVersionEquipment) {
            return null;
        }

        if (entityVersionEquipment == null) {
            Session session = null;

            try {
                session = openSession();

                entityVersionEquipment = (EntityVersionEquipment) session.get(EntityVersionEquipmentImpl.class,
                        primaryKey);

                if (entityVersionEquipment != null) {
                    cacheResult(entityVersionEquipment);
                } else {
                    EntityCacheUtil.putResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityVersionEquipmentImpl.class, primaryKey,
                        _nullEntityVersionEquipment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityVersionEquipmentModelImpl.ENTITY_CACHE_ENABLED,
                    EntityVersionEquipmentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityVersionEquipment;
    }

    /**
     * Returns the entity version equipment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityVersionEquipmentPK the primary key of the entity version equipment
     * @return the entity version equipment, or <code>null</code> if a entity version equipment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionEquipment fetchByPrimaryKey(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) entityVersionEquipmentPK);
    }

    /**
     * Returns all the entity version equipments.
     *
     * @return the entity version equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionEquipment> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity version equipments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity version equipments
     * @param end the upper bound of the range of entity version equipments (not inclusive)
     * @return the range of entity version equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionEquipment> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity version equipments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity version equipments
     * @param end the upper bound of the range of entity version equipments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity version equipments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionEquipment> findAll(int start, int end,
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

        List<EntityVersionEquipment> list = (List<EntityVersionEquipment>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYVERSIONEQUIPMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYVERSIONEQUIPMENT;

                if (pagination) {
                    sql = sql.concat(EntityVersionEquipmentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityVersionEquipment>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityVersionEquipment>(list);
                } else {
                    list = (List<EntityVersionEquipment>) QueryUtil.list(q,
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
     * Removes all the entity version equipments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityVersionEquipment entityVersionEquipment : findAll()) {
            remove(entityVersionEquipment);
        }
    }

    /**
     * Returns the number of entity version equipments.
     *
     * @return the number of entity version equipments
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYVERSIONEQUIPMENT);

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
     * Initializes the entity version equipment persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityVersionEquipment")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityVersionEquipment>> listenersList = new ArrayList<ModelListener<EntityVersionEquipment>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityVersionEquipment>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityVersionEquipmentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
