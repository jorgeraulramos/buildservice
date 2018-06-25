package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityInventoryClasificationException;
import com.consistent.ucwrt.model.EntityInventoryClasification;
import com.consistent.ucwrt.model.impl.EntityInventoryClasificationImpl;
import com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl;
import com.consistent.ucwrt.service.persistence.EntityInventoryClasificationPersistence;

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
 * The persistence implementation for the entity inventory clasification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryClasificationPersistence
 * @see EntityInventoryClasificationUtil
 * @generated
 */
public class EntityInventoryClasificationPersistenceImpl
    extends BasePersistenceImpl<EntityInventoryClasification>
    implements EntityInventoryClasificationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityInventoryClasificationUtil} to access the entity inventory clasification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityInventoryClasificationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryClasificationModelImpl.FINDER_CACHE_ENABLED,
            EntityInventoryClasificationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryClasificationModelImpl.FINDER_CACHE_ENABLED,
            EntityInventoryClasificationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryClasificationModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    private static final String _SQL_SELECT_ENTITYINVENTORYCLASIFICATION = "SELECT entityInventoryClasification FROM EntityInventoryClasification entityInventoryClasification";
    private static final String _SQL_COUNT_ENTITYINVENTORYCLASIFICATION = "SELECT COUNT(entityInventoryClasification) FROM EntityInventoryClasification entityInventoryClasification";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityInventoryClasification.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityInventoryClasification exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityInventoryClasificationPersistenceImpl.class);
    private static EntityInventoryClasification _nullEntityInventoryClasification =
        new EntityInventoryClasificationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityInventoryClasification> toCacheModel() {
                return _nullEntityInventoryClasificationCacheModel;
            }
        };

    private static CacheModel<EntityInventoryClasification> _nullEntityInventoryClasificationCacheModel =
        new CacheModel<EntityInventoryClasification>() {
            @Override
            public EntityInventoryClasification toEntityModel() {
                return _nullEntityInventoryClasification;
            }
        };

    public EntityInventoryClasificationPersistenceImpl() {
        setModelClass(EntityInventoryClasification.class);
    }

    /**
     * Caches the entity inventory clasification in the entity cache if it is enabled.
     *
     * @param entityInventoryClasification the entity inventory clasification
     */
    @Override
    public void cacheResult(
        EntityInventoryClasification entityInventoryClasification) {
        EntityCacheUtil.putResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryClasificationImpl.class,
            entityInventoryClasification.getPrimaryKey(),
            entityInventoryClasification);

        entityInventoryClasification.resetOriginalValues();
    }

    /**
     * Caches the entity inventory clasifications in the entity cache if it is enabled.
     *
     * @param entityInventoryClasifications the entity inventory clasifications
     */
    @Override
    public void cacheResult(
        List<EntityInventoryClasification> entityInventoryClasifications) {
        for (EntityInventoryClasification entityInventoryClasification : entityInventoryClasifications) {
            if (EntityCacheUtil.getResult(
                        EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
                        EntityInventoryClasificationImpl.class,
                        entityInventoryClasification.getPrimaryKey()) == null) {
                cacheResult(entityInventoryClasification);
            } else {
                entityInventoryClasification.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity inventory clasifications.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityInventoryClasificationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityInventoryClasificationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity inventory clasification.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(
        EntityInventoryClasification entityInventoryClasification) {
        EntityCacheUtil.removeResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryClasificationImpl.class,
            entityInventoryClasification.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<EntityInventoryClasification> entityInventoryClasifications) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityInventoryClasification entityInventoryClasification : entityInventoryClasifications) {
            EntityCacheUtil.removeResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
                EntityInventoryClasificationImpl.class,
                entityInventoryClasification.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity inventory clasification with the primary key. Does not add the entity inventory clasification to the database.
     *
     * @param inventoryClasificationId the primary key for the new entity inventory clasification
     * @return the new entity inventory clasification
     */
    @Override
    public EntityInventoryClasification create(int inventoryClasificationId) {
        EntityInventoryClasification entityInventoryClasification = new EntityInventoryClasificationImpl();

        entityInventoryClasification.setNew(true);
        entityInventoryClasification.setPrimaryKey(inventoryClasificationId);

        return entityInventoryClasification;
    }

    /**
     * Removes the entity inventory clasification with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param inventoryClasificationId the primary key of the entity inventory clasification
     * @return the entity inventory clasification that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException if a entity inventory clasification with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventoryClasification remove(int inventoryClasificationId)
        throws NoSuchEntityInventoryClasificationException, SystemException {
        return remove((Serializable) inventoryClasificationId);
    }

    /**
     * Removes the entity inventory clasification with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity inventory clasification
     * @return the entity inventory clasification that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException if a entity inventory clasification with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventoryClasification remove(Serializable primaryKey)
        throws NoSuchEntityInventoryClasificationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityInventoryClasification entityInventoryClasification = (EntityInventoryClasification) session.get(EntityInventoryClasificationImpl.class,
                    primaryKey);

            if (entityInventoryClasification == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityInventoryClasificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityInventoryClasification);
        } catch (NoSuchEntityInventoryClasificationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityInventoryClasification removeImpl(
        EntityInventoryClasification entityInventoryClasification)
        throws SystemException {
        entityInventoryClasification = toUnwrappedModel(entityInventoryClasification);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityInventoryClasification)) {
                entityInventoryClasification = (EntityInventoryClasification) session.get(EntityInventoryClasificationImpl.class,
                        entityInventoryClasification.getPrimaryKeyObj());
            }

            if (entityInventoryClasification != null) {
                session.delete(entityInventoryClasification);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityInventoryClasification != null) {
            clearCache(entityInventoryClasification);
        }

        return entityInventoryClasification;
    }

    @Override
    public EntityInventoryClasification updateImpl(
        com.consistent.ucwrt.model.EntityInventoryClasification entityInventoryClasification)
        throws SystemException {
        entityInventoryClasification = toUnwrappedModel(entityInventoryClasification);

        boolean isNew = entityInventoryClasification.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityInventoryClasification.isNew()) {
                session.save(entityInventoryClasification);

                entityInventoryClasification.setNew(false);
            } else {
                session.merge(entityInventoryClasification);
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

        EntityCacheUtil.putResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryClasificationImpl.class,
            entityInventoryClasification.getPrimaryKey(),
            entityInventoryClasification);

        return entityInventoryClasification;
    }

    protected EntityInventoryClasification toUnwrappedModel(
        EntityInventoryClasification entityInventoryClasification) {
        if (entityInventoryClasification instanceof EntityInventoryClasificationImpl) {
            return entityInventoryClasification;
        }

        EntityInventoryClasificationImpl entityInventoryClasificationImpl = new EntityInventoryClasificationImpl();

        entityInventoryClasificationImpl.setNew(entityInventoryClasification.isNew());
        entityInventoryClasificationImpl.setPrimaryKey(entityInventoryClasification.getPrimaryKey());

        entityInventoryClasificationImpl.setInventoryClasificationId(entityInventoryClasification.getInventoryClasificationId());
        entityInventoryClasificationImpl.setInventoryClasification(entityInventoryClasification.getInventoryClasification());

        return entityInventoryClasificationImpl;
    }

    /**
     * Returns the entity inventory clasification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity inventory clasification
     * @return the entity inventory clasification
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException if a entity inventory clasification with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventoryClasification findByPrimaryKey(
        Serializable primaryKey)
        throws NoSuchEntityInventoryClasificationException, SystemException {
        EntityInventoryClasification entityInventoryClasification = fetchByPrimaryKey(primaryKey);

        if (entityInventoryClasification == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityInventoryClasificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityInventoryClasification;
    }

    /**
     * Returns the entity inventory clasification with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityInventoryClasificationException} if it could not be found.
     *
     * @param inventoryClasificationId the primary key of the entity inventory clasification
     * @return the entity inventory clasification
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException if a entity inventory clasification with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventoryClasification findByPrimaryKey(
        int inventoryClasificationId)
        throws NoSuchEntityInventoryClasificationException, SystemException {
        return findByPrimaryKey((Serializable) inventoryClasificationId);
    }

    /**
     * Returns the entity inventory clasification with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity inventory clasification
     * @return the entity inventory clasification, or <code>null</code> if a entity inventory clasification with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventoryClasification fetchByPrimaryKey(
        Serializable primaryKey) throws SystemException {
        EntityInventoryClasification entityInventoryClasification = (EntityInventoryClasification) EntityCacheUtil.getResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
                EntityInventoryClasificationImpl.class, primaryKey);

        if (entityInventoryClasification == _nullEntityInventoryClasification) {
            return null;
        }

        if (entityInventoryClasification == null) {
            Session session = null;

            try {
                session = openSession();

                entityInventoryClasification = (EntityInventoryClasification) session.get(EntityInventoryClasificationImpl.class,
                        primaryKey);

                if (entityInventoryClasification != null) {
                    cacheResult(entityInventoryClasification);
                } else {
                    EntityCacheUtil.putResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
                        EntityInventoryClasificationImpl.class, primaryKey,
                        _nullEntityInventoryClasification);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityInventoryClasificationModelImpl.ENTITY_CACHE_ENABLED,
                    EntityInventoryClasificationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityInventoryClasification;
    }

    /**
     * Returns the entity inventory clasification with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param inventoryClasificationId the primary key of the entity inventory clasification
     * @return the entity inventory clasification, or <code>null</code> if a entity inventory clasification with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventoryClasification fetchByPrimaryKey(
        int inventoryClasificationId) throws SystemException {
        return fetchByPrimaryKey((Serializable) inventoryClasificationId);
    }

    /**
     * Returns all the entity inventory clasifications.
     *
     * @return the entity inventory clasifications
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventoryClasification> findAll()
        throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity inventory clasifications.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity inventory clasifications
     * @param end the upper bound of the range of entity inventory clasifications (not inclusive)
     * @return the range of entity inventory clasifications
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventoryClasification> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity inventory clasifications.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity inventory clasifications
     * @param end the upper bound of the range of entity inventory clasifications (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity inventory clasifications
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventoryClasification> findAll(int start, int end,
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

        List<EntityInventoryClasification> list = (List<EntityInventoryClasification>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYINVENTORYCLASIFICATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYINVENTORYCLASIFICATION;

                if (pagination) {
                    sql = sql.concat(EntityInventoryClasificationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityInventoryClasification>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityInventoryClasification>(list);
                } else {
                    list = (List<EntityInventoryClasification>) QueryUtil.list(q,
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
     * Removes all the entity inventory clasifications from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityInventoryClasification entityInventoryClasification : findAll()) {
            remove(entityInventoryClasification);
        }
    }

    /**
     * Returns the number of entity inventory clasifications.
     *
     * @return the number of entity inventory clasifications
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYINVENTORYCLASIFICATION);

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
     * Initializes the entity inventory clasification persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityInventoryClasification")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityInventoryClasification>> listenersList = new ArrayList<ModelListener<EntityInventoryClasification>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityInventoryClasification>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityInventoryClasificationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
