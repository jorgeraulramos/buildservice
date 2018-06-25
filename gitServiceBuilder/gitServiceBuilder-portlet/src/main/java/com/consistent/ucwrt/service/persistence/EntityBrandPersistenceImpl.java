package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityBrandException;
import com.consistent.ucwrt.model.EntityBrand;
import com.consistent.ucwrt.model.impl.EntityBrandImpl;
import com.consistent.ucwrt.model.impl.EntityBrandModelImpl;
import com.consistent.ucwrt.service.persistence.EntityBrandPersistence;

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
 * The persistence implementation for the entity brand service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrandPersistence
 * @see EntityBrandUtil
 * @generated
 */
public class EntityBrandPersistenceImpl extends BasePersistenceImpl<EntityBrand>
    implements EntityBrandPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityBrandUtil} to access the entity brand persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityBrandImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandModelImpl.FINDER_CACHE_ENABLED, EntityBrandImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandModelImpl.FINDER_CACHE_ENABLED, EntityBrandImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_FINDBRAND = new FinderPath(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandModelImpl.FINDER_CACHE_ENABLED, EntityBrandImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByfindBrand",
            new String[] { Integer.class.getName() },
            EntityBrandModelImpl.BRANDID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FINDBRAND = new FinderPath(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfindBrand",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_FINDBRAND_BRANDID_2 = "entityBrand.brandId = ?";
    private static final String _SQL_SELECT_ENTITYBRAND = "SELECT entityBrand FROM EntityBrand entityBrand";
    private static final String _SQL_SELECT_ENTITYBRAND_WHERE = "SELECT entityBrand FROM EntityBrand entityBrand WHERE ";
    private static final String _SQL_COUNT_ENTITYBRAND = "SELECT COUNT(entityBrand) FROM EntityBrand entityBrand";
    private static final String _SQL_COUNT_ENTITYBRAND_WHERE = "SELECT COUNT(entityBrand) FROM EntityBrand entityBrand WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityBrand.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityBrand exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityBrand exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityBrandPersistenceImpl.class);
    private static EntityBrand _nullEntityBrand = new EntityBrandImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityBrand> toCacheModel() {
                return _nullEntityBrandCacheModel;
            }
        };

    private static CacheModel<EntityBrand> _nullEntityBrandCacheModel = new CacheModel<EntityBrand>() {
            @Override
            public EntityBrand toEntityModel() {
                return _nullEntityBrand;
            }
        };

    public EntityBrandPersistenceImpl() {
        setModelClass(EntityBrand.class);
    }

    /**
     * Returns the entity brand where brandId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityBrandException} if it could not be found.
     *
     * @param brandId the brand ID
     * @return the matching entity brand
     * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a matching entity brand could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand findByfindBrand(int brandId)
        throws NoSuchEntityBrandException, SystemException {
        EntityBrand entityBrand = fetchByfindBrand(brandId);

        if (entityBrand == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("brandId=");
            msg.append(brandId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityBrandException(msg.toString());
        }

        return entityBrand;
    }

    /**
     * Returns the entity brand where brandId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param brandId the brand ID
     * @return the matching entity brand, or <code>null</code> if a matching entity brand could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand fetchByfindBrand(int brandId) throws SystemException {
        return fetchByfindBrand(brandId, true);
    }

    /**
     * Returns the entity brand where brandId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param brandId the brand ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity brand, or <code>null</code> if a matching entity brand could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand fetchByfindBrand(int brandId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { brandId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FINDBRAND,
                    finderArgs, this);
        }

        if (result instanceof EntityBrand) {
            EntityBrand entityBrand = (EntityBrand) result;

            if ((brandId != entityBrand.getBrandId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_ENTITYBRAND_WHERE);

            query.append(_FINDER_COLUMN_FINDBRAND_BRANDID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

                List<EntityBrand> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDBRAND,
                        finderArgs, list);
                } else {
                    EntityBrand entityBrand = list.get(0);

                    result = entityBrand;

                    cacheResult(entityBrand);

                    if ((entityBrand.getBrandId() != brandId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDBRAND,
                            finderArgs, entityBrand);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDBRAND,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityBrand) result;
        }
    }

    /**
     * Removes the entity brand where brandId = &#63; from the database.
     *
     * @param brandId the brand ID
     * @return the entity brand that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand removeByfindBrand(int brandId)
        throws NoSuchEntityBrandException, SystemException {
        EntityBrand entityBrand = findByfindBrand(brandId);

        return remove(entityBrand);
    }

    /**
     * Returns the number of entity brands where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @return the number of matching entity brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfindBrand(int brandId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDBRAND;

        Object[] finderArgs = new Object[] { brandId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYBRAND_WHERE);

            query.append(_FINDER_COLUMN_FINDBRAND_BRANDID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

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
     * Caches the entity brand in the entity cache if it is enabled.
     *
     * @param entityBrand the entity brand
     */
    @Override
    public void cacheResult(EntityBrand entityBrand) {
        EntityCacheUtil.putResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandImpl.class, entityBrand.getPrimaryKey(), entityBrand);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDBRAND,
            new Object[] { entityBrand.getBrandId() }, entityBrand);

        entityBrand.resetOriginalValues();
    }

    /**
     * Caches the entity brands in the entity cache if it is enabled.
     *
     * @param entityBrands the entity brands
     */
    @Override
    public void cacheResult(List<EntityBrand> entityBrands) {
        for (EntityBrand entityBrand : entityBrands) {
            if (EntityCacheUtil.getResult(
                        EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
                        EntityBrandImpl.class, entityBrand.getPrimaryKey()) == null) {
                cacheResult(entityBrand);
            } else {
                entityBrand.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity brands.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityBrandImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityBrandImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity brand.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityBrand entityBrand) {
        EntityCacheUtil.removeResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandImpl.class, entityBrand.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(entityBrand);
    }

    @Override
    public void clearCache(List<EntityBrand> entityBrands) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityBrand entityBrand : entityBrands) {
            EntityCacheUtil.removeResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
                EntityBrandImpl.class, entityBrand.getPrimaryKey());

            clearUniqueFindersCache(entityBrand);
        }
    }

    protected void cacheUniqueFindersCache(EntityBrand entityBrand) {
        if (entityBrand.isNew()) {
            Object[] args = new Object[] { entityBrand.getBrandId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDBRAND, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDBRAND, args,
                entityBrand);
        } else {
            EntityBrandModelImpl entityBrandModelImpl = (EntityBrandModelImpl) entityBrand;

            if ((entityBrandModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_FINDBRAND.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { entityBrand.getBrandId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDBRAND, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDBRAND, args,
                    entityBrand);
            }
        }
    }

    protected void clearUniqueFindersCache(EntityBrand entityBrand) {
        EntityBrandModelImpl entityBrandModelImpl = (EntityBrandModelImpl) entityBrand;

        Object[] args = new Object[] { entityBrand.getBrandId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBRAND, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDBRAND, args);

        if ((entityBrandModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_FINDBRAND.getColumnBitmask()) != 0) {
            args = new Object[] { entityBrandModelImpl.getOriginalBrandId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDBRAND, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDBRAND, args);
        }
    }

    /**
     * Creates a new entity brand with the primary key. Does not add the entity brand to the database.
     *
     * @param brandId the primary key for the new entity brand
     * @return the new entity brand
     */
    @Override
    public EntityBrand create(int brandId) {
        EntityBrand entityBrand = new EntityBrandImpl();

        entityBrand.setNew(true);
        entityBrand.setPrimaryKey(brandId);

        return entityBrand;
    }

    /**
     * Removes the entity brand with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param brandId the primary key of the entity brand
     * @return the entity brand that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand remove(int brandId)
        throws NoSuchEntityBrandException, SystemException {
        return remove((Serializable) brandId);
    }

    /**
     * Removes the entity brand with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity brand
     * @return the entity brand that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand remove(Serializable primaryKey)
        throws NoSuchEntityBrandException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityBrand entityBrand = (EntityBrand) session.get(EntityBrandImpl.class,
                    primaryKey);

            if (entityBrand == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityBrandException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityBrand);
        } catch (NoSuchEntityBrandException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityBrand removeImpl(EntityBrand entityBrand)
        throws SystemException {
        entityBrand = toUnwrappedModel(entityBrand);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityBrand)) {
                entityBrand = (EntityBrand) session.get(EntityBrandImpl.class,
                        entityBrand.getPrimaryKeyObj());
            }

            if (entityBrand != null) {
                session.delete(entityBrand);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityBrand != null) {
            clearCache(entityBrand);
        }

        return entityBrand;
    }

    @Override
    public EntityBrand updateImpl(
        com.consistent.ucwrt.model.EntityBrand entityBrand)
        throws SystemException {
        entityBrand = toUnwrappedModel(entityBrand);

        boolean isNew = entityBrand.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityBrand.isNew()) {
                session.save(entityBrand);

                entityBrand.setNew(false);
            } else {
                session.merge(entityBrand);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityBrandModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBrandImpl.class, entityBrand.getPrimaryKey(), entityBrand);

        clearUniqueFindersCache(entityBrand);
        cacheUniqueFindersCache(entityBrand);

        return entityBrand;
    }

    protected EntityBrand toUnwrappedModel(EntityBrand entityBrand) {
        if (entityBrand instanceof EntityBrandImpl) {
            return entityBrand;
        }

        EntityBrandImpl entityBrandImpl = new EntityBrandImpl();

        entityBrandImpl.setNew(entityBrand.isNew());
        entityBrandImpl.setPrimaryKey(entityBrand.getPrimaryKey());

        entityBrandImpl.setBrandId(entityBrand.getBrandId());
        entityBrandImpl.setBrandName(entityBrand.getBrandName());
        entityBrandImpl.setBrandDescription(entityBrand.getBrandDescription());
        entityBrandImpl.setBrandRegistrationDate(entityBrand.getBrandRegistrationDate());
        entityBrandImpl.setRegisterData(entityBrand.getRegisterData());
        entityBrandImpl.setResponsibleUser(entityBrand.getResponsibleUser());

        return entityBrandImpl;
    }

    /**
     * Returns the entity brand with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity brand
     * @return the entity brand
     * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityBrandException, SystemException {
        EntityBrand entityBrand = fetchByPrimaryKey(primaryKey);

        if (entityBrand == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityBrandException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityBrand;
    }

    /**
     * Returns the entity brand with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityBrandException} if it could not be found.
     *
     * @param brandId the primary key of the entity brand
     * @return the entity brand
     * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand findByPrimaryKey(int brandId)
        throws NoSuchEntityBrandException, SystemException {
        return findByPrimaryKey((Serializable) brandId);
    }

    /**
     * Returns the entity brand with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity brand
     * @return the entity brand, or <code>null</code> if a entity brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityBrand entityBrand = (EntityBrand) EntityCacheUtil.getResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
                EntityBrandImpl.class, primaryKey);

        if (entityBrand == _nullEntityBrand) {
            return null;
        }

        if (entityBrand == null) {
            Session session = null;

            try {
                session = openSession();

                entityBrand = (EntityBrand) session.get(EntityBrandImpl.class,
                        primaryKey);

                if (entityBrand != null) {
                    cacheResult(entityBrand);
                } else {
                    EntityCacheUtil.putResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
                        EntityBrandImpl.class, primaryKey, _nullEntityBrand);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityBrandModelImpl.ENTITY_CACHE_ENABLED,
                    EntityBrandImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityBrand;
    }

    /**
     * Returns the entity brand with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param brandId the primary key of the entity brand
     * @return the entity brand, or <code>null</code> if a entity brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBrand fetchByPrimaryKey(int brandId) throws SystemException {
        return fetchByPrimaryKey((Serializable) brandId);
    }

    /**
     * Returns all the entity brands.
     *
     * @return the entity brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityBrand> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity brands.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity brands
     * @param end the upper bound of the range of entity brands (not inclusive)
     * @return the range of entity brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityBrand> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity brands.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity brands
     * @param end the upper bound of the range of entity brands (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityBrand> findAll(int start, int end,
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

        List<EntityBrand> list = (List<EntityBrand>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYBRAND);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYBRAND;

                if (pagination) {
                    sql = sql.concat(EntityBrandModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityBrand>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityBrand>(list);
                } else {
                    list = (List<EntityBrand>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the entity brands from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityBrand entityBrand : findAll()) {
            remove(entityBrand);
        }
    }

    /**
     * Returns the number of entity brands.
     *
     * @return the number of entity brands
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYBRAND);

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
     * Initializes the entity brand persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityBrand")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityBrand>> listenersList = new ArrayList<ModelListener<EntityBrand>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityBrand>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityBrandImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
