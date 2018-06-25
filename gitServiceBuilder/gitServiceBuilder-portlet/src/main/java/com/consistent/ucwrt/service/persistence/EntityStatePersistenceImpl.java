package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityStateException;
import com.consistent.ucwrt.model.EntityState;
import com.consistent.ucwrt.model.impl.EntityStateImpl;
import com.consistent.ucwrt.model.impl.EntityStateModelImpl;
import com.consistent.ucwrt.service.persistence.EntityStatePersistence;

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
 * The persistence implementation for the entity state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatePersistence
 * @see EntityStateUtil
 * @generated
 */
public class EntityStatePersistenceImpl extends BasePersistenceImpl<EntityState>
    implements EntityStatePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityStateUtil} to access the entity state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityStateImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
            EntityStateModelImpl.FINDER_CACHE_ENABLED, EntityStateImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
            EntityStateModelImpl.FINDER_CACHE_ENABLED, EntityStateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
            EntityStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYSTATE = "SELECT entityState FROM EntityState entityState";
    private static final String _SQL_COUNT_ENTITYSTATE = "SELECT COUNT(entityState) FROM EntityState entityState";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityState.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityState exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityStatePersistenceImpl.class);
    private static EntityState _nullEntityState = new EntityStateImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityState> toCacheModel() {
                return _nullEntityStateCacheModel;
            }
        };

    private static CacheModel<EntityState> _nullEntityStateCacheModel = new CacheModel<EntityState>() {
            @Override
            public EntityState toEntityModel() {
                return _nullEntityState;
            }
        };

    public EntityStatePersistenceImpl() {
        setModelClass(EntityState.class);
    }

    /**
     * Caches the entity state in the entity cache if it is enabled.
     *
     * @param entityState the entity state
     */
    @Override
    public void cacheResult(EntityState entityState) {
        EntityCacheUtil.putResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
            EntityStateImpl.class, entityState.getPrimaryKey(), entityState);

        entityState.resetOriginalValues();
    }

    /**
     * Caches the entity states in the entity cache if it is enabled.
     *
     * @param entityStates the entity states
     */
    @Override
    public void cacheResult(List<EntityState> entityStates) {
        for (EntityState entityState : entityStates) {
            if (EntityCacheUtil.getResult(
                        EntityStateModelImpl.ENTITY_CACHE_ENABLED,
                        EntityStateImpl.class, entityState.getPrimaryKey()) == null) {
                cacheResult(entityState);
            } else {
                entityState.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity states.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityStateImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityStateImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity state.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityState entityState) {
        EntityCacheUtil.removeResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
            EntityStateImpl.class, entityState.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityState> entityStates) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityState entityState : entityStates) {
            EntityCacheUtil.removeResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
                EntityStateImpl.class, entityState.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity state with the primary key. Does not add the entity state to the database.
     *
     * @param stateId the primary key for the new entity state
     * @return the new entity state
     */
    @Override
    public EntityState create(int stateId) {
        EntityState entityState = new EntityStateImpl();

        entityState.setNew(true);
        entityState.setPrimaryKey(stateId);

        return entityState;
    }

    /**
     * Removes the entity state with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param stateId the primary key of the entity state
     * @return the entity state that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityStateException if a entity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityState remove(int stateId)
        throws NoSuchEntityStateException, SystemException {
        return remove((Serializable) stateId);
    }

    /**
     * Removes the entity state with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity state
     * @return the entity state that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityStateException if a entity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityState remove(Serializable primaryKey)
        throws NoSuchEntityStateException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityState entityState = (EntityState) session.get(EntityStateImpl.class,
                    primaryKey);

            if (entityState == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityState);
        } catch (NoSuchEntityStateException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityState removeImpl(EntityState entityState)
        throws SystemException {
        entityState = toUnwrappedModel(entityState);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityState)) {
                entityState = (EntityState) session.get(EntityStateImpl.class,
                        entityState.getPrimaryKeyObj());
            }

            if (entityState != null) {
                session.delete(entityState);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityState != null) {
            clearCache(entityState);
        }

        return entityState;
    }

    @Override
    public EntityState updateImpl(
        com.consistent.ucwrt.model.EntityState entityState)
        throws SystemException {
        entityState = toUnwrappedModel(entityState);

        boolean isNew = entityState.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityState.isNew()) {
                session.save(entityState);

                entityState.setNew(false);
            } else {
                session.merge(entityState);
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

        EntityCacheUtil.putResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
            EntityStateImpl.class, entityState.getPrimaryKey(), entityState);

        return entityState;
    }

    protected EntityState toUnwrappedModel(EntityState entityState) {
        if (entityState instanceof EntityStateImpl) {
            return entityState;
        }

        EntityStateImpl entityStateImpl = new EntityStateImpl();

        entityStateImpl.setNew(entityState.isNew());
        entityStateImpl.setPrimaryKey(entityState.getPrimaryKey());

        entityStateImpl.setStateId(entityState.getStateId());
        entityStateImpl.setStateName(entityState.getStateName());
        entityStateImpl.setCapitalName(entityState.getCapitalName());

        return entityStateImpl;
    }

    /**
     * Returns the entity state with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity state
     * @return the entity state
     * @throws com.consistent.ucwrt.NoSuchEntityStateException if a entity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityState findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityStateException, SystemException {
        EntityState entityState = fetchByPrimaryKey(primaryKey);

        if (entityState == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityState;
    }

    /**
     * Returns the entity state with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityStateException} if it could not be found.
     *
     * @param stateId the primary key of the entity state
     * @return the entity state
     * @throws com.consistent.ucwrt.NoSuchEntityStateException if a entity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityState findByPrimaryKey(int stateId)
        throws NoSuchEntityStateException, SystemException {
        return findByPrimaryKey((Serializable) stateId);
    }

    /**
     * Returns the entity state with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity state
     * @return the entity state, or <code>null</code> if a entity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityState fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityState entityState = (EntityState) EntityCacheUtil.getResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
                EntityStateImpl.class, primaryKey);

        if (entityState == _nullEntityState) {
            return null;
        }

        if (entityState == null) {
            Session session = null;

            try {
                session = openSession();

                entityState = (EntityState) session.get(EntityStateImpl.class,
                        primaryKey);

                if (entityState != null) {
                    cacheResult(entityState);
                } else {
                    EntityCacheUtil.putResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
                        EntityStateImpl.class, primaryKey, _nullEntityState);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityStateModelImpl.ENTITY_CACHE_ENABLED,
                    EntityStateImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityState;
    }

    /**
     * Returns the entity state with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param stateId the primary key of the entity state
     * @return the entity state, or <code>null</code> if a entity state with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityState fetchByPrimaryKey(int stateId) throws SystemException {
        return fetchByPrimaryKey((Serializable) stateId);
    }

    /**
     * Returns all the entity states.
     *
     * @return the entity states
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityState> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity states.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity states
     * @param end the upper bound of the range of entity states (not inclusive)
     * @return the range of entity states
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityState> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity states.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity states
     * @param end the upper bound of the range of entity states (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity states
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityState> findAll(int start, int end,
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

        List<EntityState> list = (List<EntityState>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYSTATE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYSTATE;

                if (pagination) {
                    sql = sql.concat(EntityStateModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityState>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityState>(list);
                } else {
                    list = (List<EntityState>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity states from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityState entityState : findAll()) {
            remove(entityState);
        }
    }

    /**
     * Returns the number of entity states.
     *
     * @return the number of entity states
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYSTATE);

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
     * Initializes the entity state persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityState")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityState>> listenersList = new ArrayList<ModelListener<EntityState>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityState>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityStateImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
