package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException;
import com.consistent.ucwrt.model.EntitySourceOfSupply;
import com.consistent.ucwrt.model.impl.EntitySourceOfSupplyImpl;
import com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl;
import com.consistent.ucwrt.service.persistence.EntitySourceOfSupplyPersistence;

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
 * The persistence implementation for the entity source of supply service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupplyPersistence
 * @see EntitySourceOfSupplyUtil
 * @generated
 */
public class EntitySourceOfSupplyPersistenceImpl extends BasePersistenceImpl<EntitySourceOfSupply>
    implements EntitySourceOfSupplyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntitySourceOfSupplyUtil} to access the entity source of supply persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntitySourceOfSupplyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
            EntitySourceOfSupplyModelImpl.FINDER_CACHE_ENABLED,
            EntitySourceOfSupplyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
            EntitySourceOfSupplyModelImpl.FINDER_CACHE_ENABLED,
            EntitySourceOfSupplyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
            EntitySourceOfSupplyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYSOURCEOFSUPPLY = "SELECT entitySourceOfSupply FROM EntitySourceOfSupply entitySourceOfSupply";
    private static final String _SQL_COUNT_ENTITYSOURCEOFSUPPLY = "SELECT COUNT(entitySourceOfSupply) FROM EntitySourceOfSupply entitySourceOfSupply";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entitySourceOfSupply.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntitySourceOfSupply exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntitySourceOfSupplyPersistenceImpl.class);
    private static EntitySourceOfSupply _nullEntitySourceOfSupply = new EntitySourceOfSupplyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntitySourceOfSupply> toCacheModel() {
                return _nullEntitySourceOfSupplyCacheModel;
            }
        };

    private static CacheModel<EntitySourceOfSupply> _nullEntitySourceOfSupplyCacheModel =
        new CacheModel<EntitySourceOfSupply>() {
            @Override
            public EntitySourceOfSupply toEntityModel() {
                return _nullEntitySourceOfSupply;
            }
        };

    public EntitySourceOfSupplyPersistenceImpl() {
        setModelClass(EntitySourceOfSupply.class);
    }

    /**
     * Caches the entity source of supply in the entity cache if it is enabled.
     *
     * @param entitySourceOfSupply the entity source of supply
     */
    @Override
    public void cacheResult(EntitySourceOfSupply entitySourceOfSupply) {
        EntityCacheUtil.putResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
            EntitySourceOfSupplyImpl.class,
            entitySourceOfSupply.getPrimaryKey(), entitySourceOfSupply);

        entitySourceOfSupply.resetOriginalValues();
    }

    /**
     * Caches the entity source of supplies in the entity cache if it is enabled.
     *
     * @param entitySourceOfSupplies the entity source of supplies
     */
    @Override
    public void cacheResult(List<EntitySourceOfSupply> entitySourceOfSupplies) {
        for (EntitySourceOfSupply entitySourceOfSupply : entitySourceOfSupplies) {
            if (EntityCacheUtil.getResult(
                        EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySourceOfSupplyImpl.class,
                        entitySourceOfSupply.getPrimaryKey()) == null) {
                cacheResult(entitySourceOfSupply);
            } else {
                entitySourceOfSupply.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity source of supplies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntitySourceOfSupplyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntitySourceOfSupplyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity source of supply.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntitySourceOfSupply entitySourceOfSupply) {
        EntityCacheUtil.removeResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
            EntitySourceOfSupplyImpl.class, entitySourceOfSupply.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntitySourceOfSupply> entitySourceOfSupplies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntitySourceOfSupply entitySourceOfSupply : entitySourceOfSupplies) {
            EntityCacheUtil.removeResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
                EntitySourceOfSupplyImpl.class,
                entitySourceOfSupply.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity source of supply with the primary key. Does not add the entity source of supply to the database.
     *
     * @param sourceSupplyId the primary key for the new entity source of supply
     * @return the new entity source of supply
     */
    @Override
    public EntitySourceOfSupply create(int sourceSupplyId) {
        EntitySourceOfSupply entitySourceOfSupply = new EntitySourceOfSupplyImpl();

        entitySourceOfSupply.setNew(true);
        entitySourceOfSupply.setPrimaryKey(sourceSupplyId);

        return entitySourceOfSupply;
    }

    /**
     * Removes the entity source of supply with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param sourceSupplyId the primary key of the entity source of supply
     * @return the entity source of supply that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySourceOfSupply remove(int sourceSupplyId)
        throws NoSuchEntitySourceOfSupplyException, SystemException {
        return remove((Serializable) sourceSupplyId);
    }

    /**
     * Removes the entity source of supply with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity source of supply
     * @return the entity source of supply that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySourceOfSupply remove(Serializable primaryKey)
        throws NoSuchEntitySourceOfSupplyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntitySourceOfSupply entitySourceOfSupply = (EntitySourceOfSupply) session.get(EntitySourceOfSupplyImpl.class,
                    primaryKey);

            if (entitySourceOfSupply == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntitySourceOfSupplyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entitySourceOfSupply);
        } catch (NoSuchEntitySourceOfSupplyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntitySourceOfSupply removeImpl(
        EntitySourceOfSupply entitySourceOfSupply) throws SystemException {
        entitySourceOfSupply = toUnwrappedModel(entitySourceOfSupply);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entitySourceOfSupply)) {
                entitySourceOfSupply = (EntitySourceOfSupply) session.get(EntitySourceOfSupplyImpl.class,
                        entitySourceOfSupply.getPrimaryKeyObj());
            }

            if (entitySourceOfSupply != null) {
                session.delete(entitySourceOfSupply);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entitySourceOfSupply != null) {
            clearCache(entitySourceOfSupply);
        }

        return entitySourceOfSupply;
    }

    @Override
    public EntitySourceOfSupply updateImpl(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply)
        throws SystemException {
        entitySourceOfSupply = toUnwrappedModel(entitySourceOfSupply);

        boolean isNew = entitySourceOfSupply.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entitySourceOfSupply.isNew()) {
                session.save(entitySourceOfSupply);

                entitySourceOfSupply.setNew(false);
            } else {
                session.merge(entitySourceOfSupply);
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

        EntityCacheUtil.putResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
            EntitySourceOfSupplyImpl.class,
            entitySourceOfSupply.getPrimaryKey(), entitySourceOfSupply);

        return entitySourceOfSupply;
    }

    protected EntitySourceOfSupply toUnwrappedModel(
        EntitySourceOfSupply entitySourceOfSupply) {
        if (entitySourceOfSupply instanceof EntitySourceOfSupplyImpl) {
            return entitySourceOfSupply;
        }

        EntitySourceOfSupplyImpl entitySourceOfSupplyImpl = new EntitySourceOfSupplyImpl();

        entitySourceOfSupplyImpl.setNew(entitySourceOfSupply.isNew());
        entitySourceOfSupplyImpl.setPrimaryKey(entitySourceOfSupply.getPrimaryKey());

        entitySourceOfSupplyImpl.setSourceSupplyId(entitySourceOfSupply.getSourceSupplyId());
        entitySourceOfSupplyImpl.setSourceOfSupply(entitySourceOfSupply.getSourceOfSupply());

        return entitySourceOfSupplyImpl;
    }

    /**
     * Returns the entity source of supply with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity source of supply
     * @return the entity source of supply
     * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySourceOfSupply findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntitySourceOfSupplyException, SystemException {
        EntitySourceOfSupply entitySourceOfSupply = fetchByPrimaryKey(primaryKey);

        if (entitySourceOfSupply == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntitySourceOfSupplyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entitySourceOfSupply;
    }

    /**
     * Returns the entity source of supply with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException} if it could not be found.
     *
     * @param sourceSupplyId the primary key of the entity source of supply
     * @return the entity source of supply
     * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySourceOfSupply findByPrimaryKey(int sourceSupplyId)
        throws NoSuchEntitySourceOfSupplyException, SystemException {
        return findByPrimaryKey((Serializable) sourceSupplyId);
    }

    /**
     * Returns the entity source of supply with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity source of supply
     * @return the entity source of supply, or <code>null</code> if a entity source of supply with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySourceOfSupply fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntitySourceOfSupply entitySourceOfSupply = (EntitySourceOfSupply) EntityCacheUtil.getResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
                EntitySourceOfSupplyImpl.class, primaryKey);

        if (entitySourceOfSupply == _nullEntitySourceOfSupply) {
            return null;
        }

        if (entitySourceOfSupply == null) {
            Session session = null;

            try {
                session = openSession();

                entitySourceOfSupply = (EntitySourceOfSupply) session.get(EntitySourceOfSupplyImpl.class,
                        primaryKey);

                if (entitySourceOfSupply != null) {
                    cacheResult(entitySourceOfSupply);
                } else {
                    EntityCacheUtil.putResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySourceOfSupplyImpl.class, primaryKey,
                        _nullEntitySourceOfSupply);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntitySourceOfSupplyModelImpl.ENTITY_CACHE_ENABLED,
                    EntitySourceOfSupplyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entitySourceOfSupply;
    }

    /**
     * Returns the entity source of supply with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param sourceSupplyId the primary key of the entity source of supply
     * @return the entity source of supply, or <code>null</code> if a entity source of supply with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySourceOfSupply fetchByPrimaryKey(int sourceSupplyId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) sourceSupplyId);
    }

    /**
     * Returns all the entity source of supplies.
     *
     * @return the entity source of supplies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySourceOfSupply> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity source of supplies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity source of supplies
     * @param end the upper bound of the range of entity source of supplies (not inclusive)
     * @return the range of entity source of supplies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySourceOfSupply> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity source of supplies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity source of supplies
     * @param end the upper bound of the range of entity source of supplies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity source of supplies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySourceOfSupply> findAll(int start, int end,
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

        List<EntitySourceOfSupply> list = (List<EntitySourceOfSupply>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYSOURCEOFSUPPLY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYSOURCEOFSUPPLY;

                if (pagination) {
                    sql = sql.concat(EntitySourceOfSupplyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntitySourceOfSupply>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntitySourceOfSupply>(list);
                } else {
                    list = (List<EntitySourceOfSupply>) QueryUtil.list(q,
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
     * Removes all the entity source of supplies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntitySourceOfSupply entitySourceOfSupply : findAll()) {
            remove(entitySourceOfSupply);
        }
    }

    /**
     * Returns the number of entity source of supplies.
     *
     * @return the number of entity source of supplies
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYSOURCEOFSUPPLY);

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
     * Initializes the entity source of supply persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntitySourceOfSupply")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntitySourceOfSupply>> listenersList = new ArrayList<ModelListener<EntitySourceOfSupply>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntitySourceOfSupply>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntitySourceOfSupplyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
