package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityEventException;
import com.consistent.ucwrt.model.EntityEvent;
import com.consistent.ucwrt.model.impl.EntityEventImpl;
import com.consistent.ucwrt.model.impl.EntityEventModelImpl;
import com.consistent.ucwrt.service.persistence.EntityEventPersistence;

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
 * The persistence implementation for the entity event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEventPersistence
 * @see EntityEventUtil
 * @generated
 */
public class EntityEventPersistenceImpl extends BasePersistenceImpl<EntityEvent>
    implements EntityEventPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityEventUtil} to access the entity event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityEventImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
            EntityEventModelImpl.FINDER_CACHE_ENABLED, EntityEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
            EntityEventModelImpl.FINDER_CACHE_ENABLED, EntityEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
            EntityEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYEVENT = "SELECT entityEvent FROM EntityEvent entityEvent";
    private static final String _SQL_COUNT_ENTITYEVENT = "SELECT COUNT(entityEvent) FROM EntityEvent entityEvent";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityEvent.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityEvent exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityEventPersistenceImpl.class);
    private static EntityEvent _nullEntityEvent = new EntityEventImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityEvent> toCacheModel() {
                return _nullEntityEventCacheModel;
            }
        };

    private static CacheModel<EntityEvent> _nullEntityEventCacheModel = new CacheModel<EntityEvent>() {
            @Override
            public EntityEvent toEntityModel() {
                return _nullEntityEvent;
            }
        };

    public EntityEventPersistenceImpl() {
        setModelClass(EntityEvent.class);
    }

    /**
     * Caches the entity event in the entity cache if it is enabled.
     *
     * @param entityEvent the entity event
     */
    @Override
    public void cacheResult(EntityEvent entityEvent) {
        EntityCacheUtil.putResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
            EntityEventImpl.class, entityEvent.getPrimaryKey(), entityEvent);

        entityEvent.resetOriginalValues();
    }

    /**
     * Caches the entity events in the entity cache if it is enabled.
     *
     * @param entityEvents the entity events
     */
    @Override
    public void cacheResult(List<EntityEvent> entityEvents) {
        for (EntityEvent entityEvent : entityEvents) {
            if (EntityCacheUtil.getResult(
                        EntityEventModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEventImpl.class, entityEvent.getPrimaryKey()) == null) {
                cacheResult(entityEvent);
            } else {
                entityEvent.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity events.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityEventImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityEventImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity event.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityEvent entityEvent) {
        EntityCacheUtil.removeResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
            EntityEventImpl.class, entityEvent.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityEvent> entityEvents) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityEvent entityEvent : entityEvents) {
            EntityCacheUtil.removeResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
                EntityEventImpl.class, entityEvent.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity event with the primary key. Does not add the entity event to the database.
     *
     * @param eventId the primary key for the new entity event
     * @return the new entity event
     */
    @Override
    public EntityEvent create(int eventId) {
        EntityEvent entityEvent = new EntityEventImpl();

        entityEvent.setNew(true);
        entityEvent.setPrimaryKey(eventId);

        return entityEvent;
    }

    /**
     * Removes the entity event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param eventId the primary key of the entity event
     * @return the entity event that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEventException if a entity event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEvent remove(int eventId)
        throws NoSuchEntityEventException, SystemException {
        return remove((Serializable) eventId);
    }

    /**
     * Removes the entity event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity event
     * @return the entity event that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEventException if a entity event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEvent remove(Serializable primaryKey)
        throws NoSuchEntityEventException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityEvent entityEvent = (EntityEvent) session.get(EntityEventImpl.class,
                    primaryKey);

            if (entityEvent == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityEvent);
        } catch (NoSuchEntityEventException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityEvent removeImpl(EntityEvent entityEvent)
        throws SystemException {
        entityEvent = toUnwrappedModel(entityEvent);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityEvent)) {
                entityEvent = (EntityEvent) session.get(EntityEventImpl.class,
                        entityEvent.getPrimaryKeyObj());
            }

            if (entityEvent != null) {
                session.delete(entityEvent);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityEvent != null) {
            clearCache(entityEvent);
        }

        return entityEvent;
    }

    @Override
    public EntityEvent updateImpl(
        com.consistent.ucwrt.model.EntityEvent entityEvent)
        throws SystemException {
        entityEvent = toUnwrappedModel(entityEvent);

        boolean isNew = entityEvent.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityEvent.isNew()) {
                session.save(entityEvent);

                entityEvent.setNew(false);
            } else {
                session.merge(entityEvent);
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

        EntityCacheUtil.putResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
            EntityEventImpl.class, entityEvent.getPrimaryKey(), entityEvent);

        return entityEvent;
    }

    protected EntityEvent toUnwrappedModel(EntityEvent entityEvent) {
        if (entityEvent instanceof EntityEventImpl) {
            return entityEvent;
        }

        EntityEventImpl entityEventImpl = new EntityEventImpl();

        entityEventImpl.setNew(entityEvent.isNew());
        entityEventImpl.setPrimaryKey(entityEvent.getPrimaryKey());

        entityEventImpl.setEventId(entityEvent.getEventId());
        entityEventImpl.setEventName(entityEvent.getEventName());

        return entityEventImpl;
    }

    /**
     * Returns the entity event with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity event
     * @return the entity event
     * @throws com.consistent.ucwrt.NoSuchEntityEventException if a entity event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEvent findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityEventException, SystemException {
        EntityEvent entityEvent = fetchByPrimaryKey(primaryKey);

        if (entityEvent == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityEvent;
    }

    /**
     * Returns the entity event with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEventException} if it could not be found.
     *
     * @param eventId the primary key of the entity event
     * @return the entity event
     * @throws com.consistent.ucwrt.NoSuchEntityEventException if a entity event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEvent findByPrimaryKey(int eventId)
        throws NoSuchEntityEventException, SystemException {
        return findByPrimaryKey((Serializable) eventId);
    }

    /**
     * Returns the entity event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity event
     * @return the entity event, or <code>null</code> if a entity event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEvent fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityEvent entityEvent = (EntityEvent) EntityCacheUtil.getResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
                EntityEventImpl.class, primaryKey);

        if (entityEvent == _nullEntityEvent) {
            return null;
        }

        if (entityEvent == null) {
            Session session = null;

            try {
                session = openSession();

                entityEvent = (EntityEvent) session.get(EntityEventImpl.class,
                        primaryKey);

                if (entityEvent != null) {
                    cacheResult(entityEvent);
                } else {
                    EntityCacheUtil.putResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEventImpl.class, primaryKey, _nullEntityEvent);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityEventModelImpl.ENTITY_CACHE_ENABLED,
                    EntityEventImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityEvent;
    }

    /**
     * Returns the entity event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param eventId the primary key of the entity event
     * @return the entity event, or <code>null</code> if a entity event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEvent fetchByPrimaryKey(int eventId) throws SystemException {
        return fetchByPrimaryKey((Serializable) eventId);
    }

    /**
     * Returns all the entity events.
     *
     * @return the entity events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEvent> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity events.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity events
     * @param end the upper bound of the range of entity events (not inclusive)
     * @return the range of entity events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEvent> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity events.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity events
     * @param end the upper bound of the range of entity events (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEvent> findAll(int start, int end,
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

        List<EntityEvent> list = (List<EntityEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYEVENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYEVENT;

                if (pagination) {
                    sql = sql.concat(EntityEventModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityEvent>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityEvent>(list);
                } else {
                    list = (List<EntityEvent>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity events from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityEvent entityEvent : findAll()) {
            remove(entityEvent);
        }
    }

    /**
     * Returns the number of entity events.
     *
     * @return the number of entity events
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYEVENT);

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
     * Initializes the entity event persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityEvent")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityEvent>> listenersList = new ArrayList<ModelListener<EntityEvent>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityEvent>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityEventImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
