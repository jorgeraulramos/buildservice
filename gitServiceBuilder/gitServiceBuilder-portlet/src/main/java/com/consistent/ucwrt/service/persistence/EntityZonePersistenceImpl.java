package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityZoneException;
import com.consistent.ucwrt.model.EntityZone;
import com.consistent.ucwrt.model.impl.EntityZoneImpl;
import com.consistent.ucwrt.model.impl.EntityZoneModelImpl;
import com.consistent.ucwrt.service.persistence.EntityZonePersistence;

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
 * The persistence implementation for the entity zone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityZonePersistence
 * @see EntityZoneUtil
 * @generated
 */
public class EntityZonePersistenceImpl extends BasePersistenceImpl<EntityZone>
    implements EntityZonePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityZoneUtil} to access the entity zone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityZoneImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
            EntityZoneModelImpl.FINDER_CACHE_ENABLED, EntityZoneImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
            EntityZoneModelImpl.FINDER_CACHE_ENABLED, EntityZoneImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
            EntityZoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYZONE = "SELECT entityZone FROM EntityZone entityZone";
    private static final String _SQL_COUNT_ENTITYZONE = "SELECT COUNT(entityZone) FROM EntityZone entityZone";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityZone.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityZone exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityZonePersistenceImpl.class);
    private static EntityZone _nullEntityZone = new EntityZoneImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityZone> toCacheModel() {
                return _nullEntityZoneCacheModel;
            }
        };

    private static CacheModel<EntityZone> _nullEntityZoneCacheModel = new CacheModel<EntityZone>() {
            @Override
            public EntityZone toEntityModel() {
                return _nullEntityZone;
            }
        };

    public EntityZonePersistenceImpl() {
        setModelClass(EntityZone.class);
    }

    /**
     * Caches the entity zone in the entity cache if it is enabled.
     *
     * @param entityZone the entity zone
     */
    @Override
    public void cacheResult(EntityZone entityZone) {
        EntityCacheUtil.putResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
            EntityZoneImpl.class, entityZone.getPrimaryKey(), entityZone);

        entityZone.resetOriginalValues();
    }

    /**
     * Caches the entity zones in the entity cache if it is enabled.
     *
     * @param entityZones the entity zones
     */
    @Override
    public void cacheResult(List<EntityZone> entityZones) {
        for (EntityZone entityZone : entityZones) {
            if (EntityCacheUtil.getResult(
                        EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
                        EntityZoneImpl.class, entityZone.getPrimaryKey()) == null) {
                cacheResult(entityZone);
            } else {
                entityZone.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity zones.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityZoneImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityZoneImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity zone.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityZone entityZone) {
        EntityCacheUtil.removeResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
            EntityZoneImpl.class, entityZone.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityZone> entityZones) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityZone entityZone : entityZones) {
            EntityCacheUtil.removeResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
                EntityZoneImpl.class, entityZone.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity zone with the primary key. Does not add the entity zone to the database.
     *
     * @param zoneName the primary key for the new entity zone
     * @return the new entity zone
     */
    @Override
    public EntityZone create(String zoneName) {
        EntityZone entityZone = new EntityZoneImpl();

        entityZone.setNew(true);
        entityZone.setPrimaryKey(zoneName);

        return entityZone;
    }

    /**
     * Removes the entity zone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param zoneName the primary key of the entity zone
     * @return the entity zone that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityZone remove(String zoneName)
        throws NoSuchEntityZoneException, SystemException {
        return remove((Serializable) zoneName);
    }

    /**
     * Removes the entity zone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity zone
     * @return the entity zone that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityZone remove(Serializable primaryKey)
        throws NoSuchEntityZoneException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityZone entityZone = (EntityZone) session.get(EntityZoneImpl.class,
                    primaryKey);

            if (entityZone == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityZoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityZone);
        } catch (NoSuchEntityZoneException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityZone removeImpl(EntityZone entityZone)
        throws SystemException {
        entityZone = toUnwrappedModel(entityZone);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityZone)) {
                entityZone = (EntityZone) session.get(EntityZoneImpl.class,
                        entityZone.getPrimaryKeyObj());
            }

            if (entityZone != null) {
                session.delete(entityZone);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityZone != null) {
            clearCache(entityZone);
        }

        return entityZone;
    }

    @Override
    public EntityZone updateImpl(
        com.consistent.ucwrt.model.EntityZone entityZone)
        throws SystemException {
        entityZone = toUnwrappedModel(entityZone);

        boolean isNew = entityZone.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityZone.isNew()) {
                session.save(entityZone);

                entityZone.setNew(false);
            } else {
                session.merge(entityZone);
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

        EntityCacheUtil.putResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
            EntityZoneImpl.class, entityZone.getPrimaryKey(), entityZone);

        return entityZone;
    }

    protected EntityZone toUnwrappedModel(EntityZone entityZone) {
        if (entityZone instanceof EntityZoneImpl) {
            return entityZone;
        }

        EntityZoneImpl entityZoneImpl = new EntityZoneImpl();

        entityZoneImpl.setNew(entityZone.isNew());
        entityZoneImpl.setPrimaryKey(entityZone.getPrimaryKey());

        entityZoneImpl.setZoneName(entityZone.getZoneName());
        entityZoneImpl.setDescriptionZone(entityZone.getDescriptionZone());
        entityZoneImpl.setUserZoneManager(entityZone.getUserZoneManager());
        entityZoneImpl.setUserSalesAreaManager(entityZone.getUserSalesAreaManager());
        entityZoneImpl.setUserRegionalAreaManager(entityZone.getUserRegionalAreaManager());

        return entityZoneImpl;
    }

    /**
     * Returns the entity zone with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity zone
     * @return the entity zone
     * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityZone findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityZoneException, SystemException {
        EntityZone entityZone = fetchByPrimaryKey(primaryKey);

        if (entityZone == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityZoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityZone;
    }

    /**
     * Returns the entity zone with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityZoneException} if it could not be found.
     *
     * @param zoneName the primary key of the entity zone
     * @return the entity zone
     * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityZone findByPrimaryKey(String zoneName)
        throws NoSuchEntityZoneException, SystemException {
        return findByPrimaryKey((Serializable) zoneName);
    }

    /**
     * Returns the entity zone with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity zone
     * @return the entity zone, or <code>null</code> if a entity zone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityZone fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityZone entityZone = (EntityZone) EntityCacheUtil.getResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
                EntityZoneImpl.class, primaryKey);

        if (entityZone == _nullEntityZone) {
            return null;
        }

        if (entityZone == null) {
            Session session = null;

            try {
                session = openSession();

                entityZone = (EntityZone) session.get(EntityZoneImpl.class,
                        primaryKey);

                if (entityZone != null) {
                    cacheResult(entityZone);
                } else {
                    EntityCacheUtil.putResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
                        EntityZoneImpl.class, primaryKey, _nullEntityZone);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityZoneModelImpl.ENTITY_CACHE_ENABLED,
                    EntityZoneImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityZone;
    }

    /**
     * Returns the entity zone with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param zoneName the primary key of the entity zone
     * @return the entity zone, or <code>null</code> if a entity zone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityZone fetchByPrimaryKey(String zoneName)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) zoneName);
    }

    /**
     * Returns all the entity zones.
     *
     * @return the entity zones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityZone> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity zones.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityZoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity zones
     * @param end the upper bound of the range of entity zones (not inclusive)
     * @return the range of entity zones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityZone> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity zones.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityZoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity zones
     * @param end the upper bound of the range of entity zones (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity zones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityZone> findAll(int start, int end,
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

        List<EntityZone> list = (List<EntityZone>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYZONE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYZONE;

                if (pagination) {
                    sql = sql.concat(EntityZoneModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityZone>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityZone>(list);
                } else {
                    list = (List<EntityZone>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity zones from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityZone entityZone : findAll()) {
            remove(entityZone);
        }
    }

    /**
     * Returns the number of entity zones.
     *
     * @return the number of entity zones
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYZONE);

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
     * Initializes the entity zone persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityZone")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityZone>> listenersList = new ArrayList<ModelListener<EntityZone>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityZone>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityZoneImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
