package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityBusinessBrandException;
import com.consistent.ucwrt.model.EntityBusinessBrand;
import com.consistent.ucwrt.model.impl.EntityBusinessBrandImpl;
import com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl;
import com.consistent.ucwrt.service.persistence.EntityBusinessBrandPersistence;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entity business brand service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBusinessBrandPersistence
 * @see EntityBusinessBrandUtil
 * @generated
 */
public class EntityBusinessBrandPersistenceImpl extends BasePersistenceImpl<EntityBusinessBrand>
    implements EntityBusinessBrandPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityBusinessBrandUtil} to access the entity business brand persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityBusinessBrandImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandModelImpl.FINDER_CACHE_ENABLED,
            EntityBusinessBrandImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandModelImpl.FINDER_CACHE_ENABLED,
            EntityBusinessBrandImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME =
        new FinderPath(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandModelImpl.FINDER_CACHE_ENABLED,
            EntityBusinessBrandImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByBusinessBrandByBusinessBrandName",
            new String[] { String.class.getName() },
            EntityBusinessBrandModelImpl.BUSINESSBRANDNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BUSINESSBRANDBYBUSINESSBRANDNAME =
        new FinderPath(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByBusinessBrandByBusinessBrandName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_1 =
        "entityBusinessBrand.businessBrandName IS NULL";
    private static final String _FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_2 =
        "entityBusinessBrand.businessBrandName = ?";
    private static final String _FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_3 =
        "(entityBusinessBrand.businessBrandName IS NULL OR entityBusinessBrand.businessBrandName = '')";
    private static final String _SQL_SELECT_ENTITYBUSINESSBRAND = "SELECT entityBusinessBrand FROM EntityBusinessBrand entityBusinessBrand";
    private static final String _SQL_SELECT_ENTITYBUSINESSBRAND_WHERE = "SELECT entityBusinessBrand FROM EntityBusinessBrand entityBusinessBrand WHERE ";
    private static final String _SQL_COUNT_ENTITYBUSINESSBRAND = "SELECT COUNT(entityBusinessBrand) FROM EntityBusinessBrand entityBusinessBrand";
    private static final String _SQL_COUNT_ENTITYBUSINESSBRAND_WHERE = "SELECT COUNT(entityBusinessBrand) FROM EntityBusinessBrand entityBusinessBrand WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityBusinessBrand.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityBusinessBrand exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityBusinessBrand exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityBusinessBrandPersistenceImpl.class);
    private static EntityBusinessBrand _nullEntityBusinessBrand = new EntityBusinessBrandImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityBusinessBrand> toCacheModel() {
                return _nullEntityBusinessBrandCacheModel;
            }
        };

    private static CacheModel<EntityBusinessBrand> _nullEntityBusinessBrandCacheModel =
        new CacheModel<EntityBusinessBrand>() {
            @Override
            public EntityBusinessBrand toEntityModel() {
                return _nullEntityBusinessBrand;
            }
        };

    public EntityBusinessBrandPersistenceImpl() {
        setModelClass(EntityBusinessBrand.class);
    }

    /**
     * Returns the entity business brand where businessBrandName = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityBusinessBrandException} if it could not be found.
     *
     * @param businessBrandName the business brand name
     * @return the matching entity business brand
     * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a matching entity business brand could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand findByBusinessBrandByBusinessBrandName(
        String businessBrandName)
        throws NoSuchEntityBusinessBrandException, SystemException {
        EntityBusinessBrand entityBusinessBrand = fetchByBusinessBrandByBusinessBrandName(businessBrandName);

        if (entityBusinessBrand == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("businessBrandName=");
            msg.append(businessBrandName);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityBusinessBrandException(msg.toString());
        }

        return entityBusinessBrand;
    }

    /**
     * Returns the entity business brand where businessBrandName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param businessBrandName the business brand name
     * @return the matching entity business brand, or <code>null</code> if a matching entity business brand could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand fetchByBusinessBrandByBusinessBrandName(
        String businessBrandName) throws SystemException {
        return fetchByBusinessBrandByBusinessBrandName(businessBrandName, true);
    }

    /**
     * Returns the entity business brand where businessBrandName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param businessBrandName the business brand name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity business brand, or <code>null</code> if a matching entity business brand could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand fetchByBusinessBrandByBusinessBrandName(
        String businessBrandName, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { businessBrandName };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                    finderArgs, this);
        }

        if (result instanceof EntityBusinessBrand) {
            EntityBusinessBrand entityBusinessBrand = (EntityBusinessBrand) result;

            if (!Validator.equals(businessBrandName,
                        entityBusinessBrand.getBusinessBrandName())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_ENTITYBUSINESSBRAND_WHERE);

            boolean bindBusinessBrandName = false;

            if (businessBrandName == null) {
                query.append(_FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_1);
            } else if (businessBrandName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_3);
            } else {
                bindBusinessBrandName = true;

                query.append(_FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBusinessBrandName) {
                    qPos.add(businessBrandName);
                }

                List<EntityBusinessBrand> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "EntityBusinessBrandPersistenceImpl.fetchByBusinessBrandByBusinessBrandName(String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    EntityBusinessBrand entityBusinessBrand = list.get(0);

                    result = entityBusinessBrand;

                    cacheResult(entityBusinessBrand);

                    if ((entityBusinessBrand.getBusinessBrandName() == null) ||
                            !entityBusinessBrand.getBusinessBrandName()
                                                    .equals(businessBrandName)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                            finderArgs, entityBusinessBrand);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityBusinessBrand) result;
        }
    }

    /**
     * Removes the entity business brand where businessBrandName = &#63; from the database.
     *
     * @param businessBrandName the business brand name
     * @return the entity business brand that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand removeByBusinessBrandByBusinessBrandName(
        String businessBrandName)
        throws NoSuchEntityBusinessBrandException, SystemException {
        EntityBusinessBrand entityBusinessBrand = findByBusinessBrandByBusinessBrandName(businessBrandName);

        return remove(entityBusinessBrand);
    }

    /**
     * Returns the number of entity business brands where businessBrandName = &#63;.
     *
     * @param businessBrandName the business brand name
     * @return the number of matching entity business brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBusinessBrandByBusinessBrandName(String businessBrandName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BUSINESSBRANDBYBUSINESSBRANDNAME;

        Object[] finderArgs = new Object[] { businessBrandName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYBUSINESSBRAND_WHERE);

            boolean bindBusinessBrandName = false;

            if (businessBrandName == null) {
                query.append(_FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_1);
            } else if (businessBrandName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_3);
            } else {
                bindBusinessBrandName = true;

                query.append(_FINDER_COLUMN_BUSINESSBRANDBYBUSINESSBRANDNAME_BUSINESSBRANDNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBusinessBrandName) {
                    qPos.add(businessBrandName);
                }

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
     * Caches the entity business brand in the entity cache if it is enabled.
     *
     * @param entityBusinessBrand the entity business brand
     */
    @Override
    public void cacheResult(EntityBusinessBrand entityBusinessBrand) {
        EntityCacheUtil.putResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandImpl.class, entityBusinessBrand.getPrimaryKey(),
            entityBusinessBrand);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
            new Object[] { entityBusinessBrand.getBusinessBrandName() },
            entityBusinessBrand);

        entityBusinessBrand.resetOriginalValues();
    }

    /**
     * Caches the entity business brands in the entity cache if it is enabled.
     *
     * @param entityBusinessBrands the entity business brands
     */
    @Override
    public void cacheResult(List<EntityBusinessBrand> entityBusinessBrands) {
        for (EntityBusinessBrand entityBusinessBrand : entityBusinessBrands) {
            if (EntityCacheUtil.getResult(
                        EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
                        EntityBusinessBrandImpl.class,
                        entityBusinessBrand.getPrimaryKey()) == null) {
                cacheResult(entityBusinessBrand);
            } else {
                entityBusinessBrand.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity business brands.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityBusinessBrandImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityBusinessBrandImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity business brand.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityBusinessBrand entityBusinessBrand) {
        EntityCacheUtil.removeResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandImpl.class, entityBusinessBrand.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(entityBusinessBrand);
    }

    @Override
    public void clearCache(List<EntityBusinessBrand> entityBusinessBrands) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityBusinessBrand entityBusinessBrand : entityBusinessBrands) {
            EntityCacheUtil.removeResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
                EntityBusinessBrandImpl.class,
                entityBusinessBrand.getPrimaryKey());

            clearUniqueFindersCache(entityBusinessBrand);
        }
    }

    protected void cacheUniqueFindersCache(
        EntityBusinessBrand entityBusinessBrand) {
        if (entityBusinessBrand.isNew()) {
            Object[] args = new Object[] {
                    entityBusinessBrand.getBusinessBrandName()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                args, entityBusinessBrand);
        } else {
            EntityBusinessBrandModelImpl entityBusinessBrandModelImpl = (EntityBusinessBrandModelImpl) entityBusinessBrand;

            if ((entityBusinessBrandModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityBusinessBrand.getBusinessBrandName()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                    args, entityBusinessBrand);
            }
        }
    }

    protected void clearUniqueFindersCache(
        EntityBusinessBrand entityBusinessBrand) {
        EntityBusinessBrandModelImpl entityBusinessBrandModelImpl = (EntityBusinessBrandModelImpl) entityBusinessBrand;

        Object[] args = new Object[] { entityBusinessBrand.getBusinessBrandName() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
            args);

        if ((entityBusinessBrandModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME.getColumnBitmask()) != 0) {
            args = new Object[] {
                    entityBusinessBrandModelImpl.getOriginalBusinessBrandName()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BUSINESSBRANDBYBUSINESSBRANDNAME,
                args);
        }
    }

    /**
     * Creates a new entity business brand with the primary key. Does not add the entity business brand to the database.
     *
     * @param businessBrandName the primary key for the new entity business brand
     * @return the new entity business brand
     */
    @Override
    public EntityBusinessBrand create(String businessBrandName) {
        EntityBusinessBrand entityBusinessBrand = new EntityBusinessBrandImpl();

        entityBusinessBrand.setNew(true);
        entityBusinessBrand.setPrimaryKey(businessBrandName);

        return entityBusinessBrand;
    }

    /**
     * Removes the entity business brand with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param businessBrandName the primary key of the entity business brand
     * @return the entity business brand that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a entity business brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand remove(String businessBrandName)
        throws NoSuchEntityBusinessBrandException, SystemException {
        return remove((Serializable) businessBrandName);
    }

    /**
     * Removes the entity business brand with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity business brand
     * @return the entity business brand that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a entity business brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand remove(Serializable primaryKey)
        throws NoSuchEntityBusinessBrandException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityBusinessBrand entityBusinessBrand = (EntityBusinessBrand) session.get(EntityBusinessBrandImpl.class,
                    primaryKey);

            if (entityBusinessBrand == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityBusinessBrandException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityBusinessBrand);
        } catch (NoSuchEntityBusinessBrandException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityBusinessBrand removeImpl(
        EntityBusinessBrand entityBusinessBrand) throws SystemException {
        entityBusinessBrand = toUnwrappedModel(entityBusinessBrand);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityBusinessBrand)) {
                entityBusinessBrand = (EntityBusinessBrand) session.get(EntityBusinessBrandImpl.class,
                        entityBusinessBrand.getPrimaryKeyObj());
            }

            if (entityBusinessBrand != null) {
                session.delete(entityBusinessBrand);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityBusinessBrand != null) {
            clearCache(entityBusinessBrand);
        }

        return entityBusinessBrand;
    }

    @Override
    public EntityBusinessBrand updateImpl(
        com.consistent.ucwrt.model.EntityBusinessBrand entityBusinessBrand)
        throws SystemException {
        entityBusinessBrand = toUnwrappedModel(entityBusinessBrand);

        boolean isNew = entityBusinessBrand.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityBusinessBrand.isNew()) {
                session.save(entityBusinessBrand);

                entityBusinessBrand.setNew(false);
            } else {
                session.merge(entityBusinessBrand);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityBusinessBrandModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
            EntityBusinessBrandImpl.class, entityBusinessBrand.getPrimaryKey(),
            entityBusinessBrand);

        clearUniqueFindersCache(entityBusinessBrand);
        cacheUniqueFindersCache(entityBusinessBrand);

        return entityBusinessBrand;
    }

    protected EntityBusinessBrand toUnwrappedModel(
        EntityBusinessBrand entityBusinessBrand) {
        if (entityBusinessBrand instanceof EntityBusinessBrandImpl) {
            return entityBusinessBrand;
        }

        EntityBusinessBrandImpl entityBusinessBrandImpl = new EntityBusinessBrandImpl();

        entityBusinessBrandImpl.setNew(entityBusinessBrand.isNew());
        entityBusinessBrandImpl.setPrimaryKey(entityBusinessBrand.getPrimaryKey());

        entityBusinessBrandImpl.setBusinessBrandName(entityBusinessBrand.getBusinessBrandName());
        entityBusinessBrandImpl.setDescriptionBusinessBrand(entityBusinessBrand.getDescriptionBusinessBrand());

        return entityBusinessBrandImpl;
    }

    /**
     * Returns the entity business brand with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity business brand
     * @return the entity business brand
     * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a entity business brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityBusinessBrandException, SystemException {
        EntityBusinessBrand entityBusinessBrand = fetchByPrimaryKey(primaryKey);

        if (entityBusinessBrand == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityBusinessBrandException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityBusinessBrand;
    }

    /**
     * Returns the entity business brand with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityBusinessBrandException} if it could not be found.
     *
     * @param businessBrandName the primary key of the entity business brand
     * @return the entity business brand
     * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a entity business brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand findByPrimaryKey(String businessBrandName)
        throws NoSuchEntityBusinessBrandException, SystemException {
        return findByPrimaryKey((Serializable) businessBrandName);
    }

    /**
     * Returns the entity business brand with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity business brand
     * @return the entity business brand, or <code>null</code> if a entity business brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityBusinessBrand entityBusinessBrand = (EntityBusinessBrand) EntityCacheUtil.getResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
                EntityBusinessBrandImpl.class, primaryKey);

        if (entityBusinessBrand == _nullEntityBusinessBrand) {
            return null;
        }

        if (entityBusinessBrand == null) {
            Session session = null;

            try {
                session = openSession();

                entityBusinessBrand = (EntityBusinessBrand) session.get(EntityBusinessBrandImpl.class,
                        primaryKey);

                if (entityBusinessBrand != null) {
                    cacheResult(entityBusinessBrand);
                } else {
                    EntityCacheUtil.putResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
                        EntityBusinessBrandImpl.class, primaryKey,
                        _nullEntityBusinessBrand);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityBusinessBrandModelImpl.ENTITY_CACHE_ENABLED,
                    EntityBusinessBrandImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityBusinessBrand;
    }

    /**
     * Returns the entity business brand with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param businessBrandName the primary key of the entity business brand
     * @return the entity business brand, or <code>null</code> if a entity business brand with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityBusinessBrand fetchByPrimaryKey(String businessBrandName)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) businessBrandName);
    }

    /**
     * Returns all the entity business brands.
     *
     * @return the entity business brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityBusinessBrand> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity business brands.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity business brands
     * @param end the upper bound of the range of entity business brands (not inclusive)
     * @return the range of entity business brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityBusinessBrand> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity business brands.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity business brands
     * @param end the upper bound of the range of entity business brands (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity business brands
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityBusinessBrand> findAll(int start, int end,
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

        List<EntityBusinessBrand> list = (List<EntityBusinessBrand>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYBUSINESSBRAND);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYBUSINESSBRAND;

                if (pagination) {
                    sql = sql.concat(EntityBusinessBrandModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityBusinessBrand>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityBusinessBrand>(list);
                } else {
                    list = (List<EntityBusinessBrand>) QueryUtil.list(q,
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
     * Removes all the entity business brands from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityBusinessBrand entityBusinessBrand : findAll()) {
            remove(entityBusinessBrand);
        }
    }

    /**
     * Returns the number of entity business brands.
     *
     * @return the number of entity business brands
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYBUSINESSBRAND);

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
     * Initializes the entity business brand persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityBusinessBrand")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityBusinessBrand>> listenersList = new ArrayList<ModelListener<EntityBusinessBrand>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityBusinessBrand>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityBusinessBrandImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
