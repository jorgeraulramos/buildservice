package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntitySalesPlaceException;
import com.consistent.ucwrt.model.EntitySalesPlace;
import com.consistent.ucwrt.model.impl.EntitySalesPlaceImpl;
import com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl;
import com.consistent.ucwrt.service.persistence.EntitySalesPlacePersistence;

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
 * The persistence implementation for the entity sales place service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlacePersistence
 * @see EntitySalesPlaceUtil
 * @generated
 */
public class EntitySalesPlacePersistenceImpl extends BasePersistenceImpl<EntitySalesPlace>
    implements EntitySalesPlacePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntitySalesPlaceUtil} to access the entity sales place persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntitySalesPlaceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
            EntitySalesPlaceModelImpl.FINDER_CACHE_ENABLED,
            EntitySalesPlaceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
            EntitySalesPlaceModelImpl.FINDER_CACHE_ENABLED,
            EntitySalesPlaceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
            EntitySalesPlaceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYSALESPLACE = "SELECT entitySalesPlace FROM EntitySalesPlace entitySalesPlace";
    private static final String _SQL_COUNT_ENTITYSALESPLACE = "SELECT COUNT(entitySalesPlace) FROM EntitySalesPlace entitySalesPlace";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entitySalesPlace.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntitySalesPlace exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntitySalesPlacePersistenceImpl.class);
    private static EntitySalesPlace _nullEntitySalesPlace = new EntitySalesPlaceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntitySalesPlace> toCacheModel() {
                return _nullEntitySalesPlaceCacheModel;
            }
        };

    private static CacheModel<EntitySalesPlace> _nullEntitySalesPlaceCacheModel = new CacheModel<EntitySalesPlace>() {
            @Override
            public EntitySalesPlace toEntityModel() {
                return _nullEntitySalesPlace;
            }
        };

    public EntitySalesPlacePersistenceImpl() {
        setModelClass(EntitySalesPlace.class);
    }

    /**
     * Caches the entity sales place in the entity cache if it is enabled.
     *
     * @param entitySalesPlace the entity sales place
     */
    @Override
    public void cacheResult(EntitySalesPlace entitySalesPlace) {
        EntityCacheUtil.putResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
            EntitySalesPlaceImpl.class, entitySalesPlace.getPrimaryKey(),
            entitySalesPlace);

        entitySalesPlace.resetOriginalValues();
    }

    /**
     * Caches the entity sales places in the entity cache if it is enabled.
     *
     * @param entitySalesPlaces the entity sales places
     */
    @Override
    public void cacheResult(List<EntitySalesPlace> entitySalesPlaces) {
        for (EntitySalesPlace entitySalesPlace : entitySalesPlaces) {
            if (EntityCacheUtil.getResult(
                        EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySalesPlaceImpl.class,
                        entitySalesPlace.getPrimaryKey()) == null) {
                cacheResult(entitySalesPlace);
            } else {
                entitySalesPlace.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity sales places.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntitySalesPlaceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntitySalesPlaceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity sales place.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntitySalesPlace entitySalesPlace) {
        EntityCacheUtil.removeResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
            EntitySalesPlaceImpl.class, entitySalesPlace.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntitySalesPlace> entitySalesPlaces) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntitySalesPlace entitySalesPlace : entitySalesPlaces) {
            EntityCacheUtil.removeResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
                EntitySalesPlaceImpl.class, entitySalesPlace.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity sales place with the primary key. Does not add the entity sales place to the database.
     *
     * @param salesPlaceId the primary key for the new entity sales place
     * @return the new entity sales place
     */
    @Override
    public EntitySalesPlace create(int salesPlaceId) {
        EntitySalesPlace entitySalesPlace = new EntitySalesPlaceImpl();

        entitySalesPlace.setNew(true);
        entitySalesPlace.setPrimaryKey(salesPlaceId);

        return entitySalesPlace;
    }

    /**
     * Removes the entity sales place with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param salesPlaceId the primary key of the entity sales place
     * @return the entity sales place that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySalesPlace remove(int salesPlaceId)
        throws NoSuchEntitySalesPlaceException, SystemException {
        return remove((Serializable) salesPlaceId);
    }

    /**
     * Removes the entity sales place with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity sales place
     * @return the entity sales place that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySalesPlace remove(Serializable primaryKey)
        throws NoSuchEntitySalesPlaceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntitySalesPlace entitySalesPlace = (EntitySalesPlace) session.get(EntitySalesPlaceImpl.class,
                    primaryKey);

            if (entitySalesPlace == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntitySalesPlaceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entitySalesPlace);
        } catch (NoSuchEntitySalesPlaceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntitySalesPlace removeImpl(EntitySalesPlace entitySalesPlace)
        throws SystemException {
        entitySalesPlace = toUnwrappedModel(entitySalesPlace);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entitySalesPlace)) {
                entitySalesPlace = (EntitySalesPlace) session.get(EntitySalesPlaceImpl.class,
                        entitySalesPlace.getPrimaryKeyObj());
            }

            if (entitySalesPlace != null) {
                session.delete(entitySalesPlace);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entitySalesPlace != null) {
            clearCache(entitySalesPlace);
        }

        return entitySalesPlace;
    }

    @Override
    public EntitySalesPlace updateImpl(
        com.consistent.ucwrt.model.EntitySalesPlace entitySalesPlace)
        throws SystemException {
        entitySalesPlace = toUnwrappedModel(entitySalesPlace);

        boolean isNew = entitySalesPlace.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entitySalesPlace.isNew()) {
                session.save(entitySalesPlace);

                entitySalesPlace.setNew(false);
            } else {
                session.merge(entitySalesPlace);
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

        EntityCacheUtil.putResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
            EntitySalesPlaceImpl.class, entitySalesPlace.getPrimaryKey(),
            entitySalesPlace);

        return entitySalesPlace;
    }

    protected EntitySalesPlace toUnwrappedModel(
        EntitySalesPlace entitySalesPlace) {
        if (entitySalesPlace instanceof EntitySalesPlaceImpl) {
            return entitySalesPlace;
        }

        EntitySalesPlaceImpl entitySalesPlaceImpl = new EntitySalesPlaceImpl();

        entitySalesPlaceImpl.setNew(entitySalesPlace.isNew());
        entitySalesPlaceImpl.setPrimaryKey(entitySalesPlace.getPrimaryKey());

        entitySalesPlaceImpl.setSalesPlaceId(entitySalesPlace.getSalesPlaceId());
        entitySalesPlaceImpl.setSalePlaceName(entitySalesPlace.getSalePlaceName());

        return entitySalesPlaceImpl;
    }

    /**
     * Returns the entity sales place with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity sales place
     * @return the entity sales place
     * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySalesPlace findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntitySalesPlaceException, SystemException {
        EntitySalesPlace entitySalesPlace = fetchByPrimaryKey(primaryKey);

        if (entitySalesPlace == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntitySalesPlaceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entitySalesPlace;
    }

    /**
     * Returns the entity sales place with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySalesPlaceException} if it could not be found.
     *
     * @param salesPlaceId the primary key of the entity sales place
     * @return the entity sales place
     * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySalesPlace findByPrimaryKey(int salesPlaceId)
        throws NoSuchEntitySalesPlaceException, SystemException {
        return findByPrimaryKey((Serializable) salesPlaceId);
    }

    /**
     * Returns the entity sales place with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity sales place
     * @return the entity sales place, or <code>null</code> if a entity sales place with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySalesPlace fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntitySalesPlace entitySalesPlace = (EntitySalesPlace) EntityCacheUtil.getResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
                EntitySalesPlaceImpl.class, primaryKey);

        if (entitySalesPlace == _nullEntitySalesPlace) {
            return null;
        }

        if (entitySalesPlace == null) {
            Session session = null;

            try {
                session = openSession();

                entitySalesPlace = (EntitySalesPlace) session.get(EntitySalesPlaceImpl.class,
                        primaryKey);

                if (entitySalesPlace != null) {
                    cacheResult(entitySalesPlace);
                } else {
                    EntityCacheUtil.putResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySalesPlaceImpl.class, primaryKey,
                        _nullEntitySalesPlace);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntitySalesPlaceModelImpl.ENTITY_CACHE_ENABLED,
                    EntitySalesPlaceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entitySalesPlace;
    }

    /**
     * Returns the entity sales place with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param salesPlaceId the primary key of the entity sales place
     * @return the entity sales place, or <code>null</code> if a entity sales place with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySalesPlace fetchByPrimaryKey(int salesPlaceId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) salesPlaceId);
    }

    /**
     * Returns all the entity sales places.
     *
     * @return the entity sales places
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySalesPlace> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity sales places.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity sales places
     * @param end the upper bound of the range of entity sales places (not inclusive)
     * @return the range of entity sales places
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySalesPlace> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity sales places.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity sales places
     * @param end the upper bound of the range of entity sales places (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity sales places
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySalesPlace> findAll(int start, int end,
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

        List<EntitySalesPlace> list = (List<EntitySalesPlace>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYSALESPLACE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYSALESPLACE;

                if (pagination) {
                    sql = sql.concat(EntitySalesPlaceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntitySalesPlace>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntitySalesPlace>(list);
                } else {
                    list = (List<EntitySalesPlace>) QueryUtil.list(q,
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
     * Removes all the entity sales places from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntitySalesPlace entitySalesPlace : findAll()) {
            remove(entitySalesPlace);
        }
    }

    /**
     * Returns the number of entity sales places.
     *
     * @return the number of entity sales places
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYSALESPLACE);

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
     * Initializes the entity sales place persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntitySalesPlace")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntitySalesPlace>> listenersList = new ArrayList<ModelListener<EntitySalesPlace>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntitySalesPlace>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntitySalesPlaceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
