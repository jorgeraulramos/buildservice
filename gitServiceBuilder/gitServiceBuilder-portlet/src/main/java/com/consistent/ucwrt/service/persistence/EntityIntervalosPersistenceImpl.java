package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityIntervalosException;
import com.consistent.ucwrt.model.EntityIntervalos;
import com.consistent.ucwrt.model.impl.EntityIntervalosImpl;
import com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl;
import com.consistent.ucwrt.service.persistence.EntityIntervalosPersistence;

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
 * The persistence implementation for the entity intervalos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityIntervalosPersistence
 * @see EntityIntervalosUtil
 * @generated
 */
public class EntityIntervalosPersistenceImpl extends BasePersistenceImpl<EntityIntervalos>
    implements EntityIntervalosPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityIntervalosUtil} to access the entity intervalos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityIntervalosImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
            EntityIntervalosModelImpl.FINDER_CACHE_ENABLED,
            EntityIntervalosImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
            EntityIntervalosModelImpl.FINDER_CACHE_ENABLED,
            EntityIntervalosImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
            EntityIntervalosModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYINTERVALOS = "SELECT entityIntervalos FROM EntityIntervalos entityIntervalos";
    private static final String _SQL_COUNT_ENTITYINTERVALOS = "SELECT COUNT(entityIntervalos) FROM EntityIntervalos entityIntervalos";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityIntervalos.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityIntervalos exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityIntervalosPersistenceImpl.class);
    private static EntityIntervalos _nullEntityIntervalos = new EntityIntervalosImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityIntervalos> toCacheModel() {
                return _nullEntityIntervalosCacheModel;
            }
        };

    private static CacheModel<EntityIntervalos> _nullEntityIntervalosCacheModel = new CacheModel<EntityIntervalos>() {
            @Override
            public EntityIntervalos toEntityModel() {
                return _nullEntityIntervalos;
            }
        };

    public EntityIntervalosPersistenceImpl() {
        setModelClass(EntityIntervalos.class);
    }

    /**
     * Caches the entity intervalos in the entity cache if it is enabled.
     *
     * @param entityIntervalos the entity intervalos
     */
    @Override
    public void cacheResult(EntityIntervalos entityIntervalos) {
        EntityCacheUtil.putResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
            EntityIntervalosImpl.class, entityIntervalos.getPrimaryKey(),
            entityIntervalos);

        entityIntervalos.resetOriginalValues();
    }

    /**
     * Caches the entity intervaloses in the entity cache if it is enabled.
     *
     * @param entityIntervaloses the entity intervaloses
     */
    @Override
    public void cacheResult(List<EntityIntervalos> entityIntervaloses) {
        for (EntityIntervalos entityIntervalos : entityIntervaloses) {
            if (EntityCacheUtil.getResult(
                        EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
                        EntityIntervalosImpl.class,
                        entityIntervalos.getPrimaryKey()) == null) {
                cacheResult(entityIntervalos);
            } else {
                entityIntervalos.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity intervaloses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityIntervalosImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityIntervalosImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity intervalos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityIntervalos entityIntervalos) {
        EntityCacheUtil.removeResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
            EntityIntervalosImpl.class, entityIntervalos.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityIntervalos> entityIntervaloses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityIntervalos entityIntervalos : entityIntervaloses) {
            EntityCacheUtil.removeResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
                EntityIntervalosImpl.class, entityIntervalos.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity intervalos with the primary key. Does not add the entity intervalos to the database.
     *
     * @param entityIntervalosPK the primary key for the new entity intervalos
     * @return the new entity intervalos
     */
    @Override
    public EntityIntervalos create(EntityIntervalosPK entityIntervalosPK) {
        EntityIntervalos entityIntervalos = new EntityIntervalosImpl();

        entityIntervalos.setNew(true);
        entityIntervalos.setPrimaryKey(entityIntervalosPK);

        return entityIntervalos;
    }

    /**
     * Removes the entity intervalos with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityIntervalosPK the primary key of the entity intervalos
     * @return the entity intervalos that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityIntervalosException if a entity intervalos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityIntervalos remove(EntityIntervalosPK entityIntervalosPK)
        throws NoSuchEntityIntervalosException, SystemException {
        return remove((Serializable) entityIntervalosPK);
    }

    /**
     * Removes the entity intervalos with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity intervalos
     * @return the entity intervalos that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityIntervalosException if a entity intervalos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityIntervalos remove(Serializable primaryKey)
        throws NoSuchEntityIntervalosException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityIntervalos entityIntervalos = (EntityIntervalos) session.get(EntityIntervalosImpl.class,
                    primaryKey);

            if (entityIntervalos == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityIntervalosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityIntervalos);
        } catch (NoSuchEntityIntervalosException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityIntervalos removeImpl(EntityIntervalos entityIntervalos)
        throws SystemException {
        entityIntervalos = toUnwrappedModel(entityIntervalos);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityIntervalos)) {
                entityIntervalos = (EntityIntervalos) session.get(EntityIntervalosImpl.class,
                        entityIntervalos.getPrimaryKeyObj());
            }

            if (entityIntervalos != null) {
                session.delete(entityIntervalos);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityIntervalos != null) {
            clearCache(entityIntervalos);
        }

        return entityIntervalos;
    }

    @Override
    public EntityIntervalos updateImpl(
        com.consistent.ucwrt.model.EntityIntervalos entityIntervalos)
        throws SystemException {
        entityIntervalos = toUnwrappedModel(entityIntervalos);

        boolean isNew = entityIntervalos.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityIntervalos.isNew()) {
                session.save(entityIntervalos);

                entityIntervalos.setNew(false);
            } else {
                session.merge(entityIntervalos);
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

        EntityCacheUtil.putResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
            EntityIntervalosImpl.class, entityIntervalos.getPrimaryKey(),
            entityIntervalos);

        return entityIntervalos;
    }

    protected EntityIntervalos toUnwrappedModel(
        EntityIntervalos entityIntervalos) {
        if (entityIntervalos instanceof EntityIntervalosImpl) {
            return entityIntervalos;
        }

        EntityIntervalosImpl entityIntervalosImpl = new EntityIntervalosImpl();

        entityIntervalosImpl.setNew(entityIntervalos.isNew());
        entityIntervalosImpl.setPrimaryKey(entityIntervalos.getPrimaryKey());

        entityIntervalosImpl.setStartKilometer(entityIntervalos.getStartKilometer());
        entityIntervalosImpl.setFinishKilometers(entityIntervalos.getFinishKilometers());

        return entityIntervalosImpl;
    }

    /**
     * Returns the entity intervalos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity intervalos
     * @return the entity intervalos
     * @throws com.consistent.ucwrt.NoSuchEntityIntervalosException if a entity intervalos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityIntervalos findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityIntervalosException, SystemException {
        EntityIntervalos entityIntervalos = fetchByPrimaryKey(primaryKey);

        if (entityIntervalos == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityIntervalosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityIntervalos;
    }

    /**
     * Returns the entity intervalos with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityIntervalosException} if it could not be found.
     *
     * @param entityIntervalosPK the primary key of the entity intervalos
     * @return the entity intervalos
     * @throws com.consistent.ucwrt.NoSuchEntityIntervalosException if a entity intervalos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityIntervalos findByPrimaryKey(
        EntityIntervalosPK entityIntervalosPK)
        throws NoSuchEntityIntervalosException, SystemException {
        return findByPrimaryKey((Serializable) entityIntervalosPK);
    }

    /**
     * Returns the entity intervalos with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity intervalos
     * @return the entity intervalos, or <code>null</code> if a entity intervalos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityIntervalos fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityIntervalos entityIntervalos = (EntityIntervalos) EntityCacheUtil.getResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
                EntityIntervalosImpl.class, primaryKey);

        if (entityIntervalos == _nullEntityIntervalos) {
            return null;
        }

        if (entityIntervalos == null) {
            Session session = null;

            try {
                session = openSession();

                entityIntervalos = (EntityIntervalos) session.get(EntityIntervalosImpl.class,
                        primaryKey);

                if (entityIntervalos != null) {
                    cacheResult(entityIntervalos);
                } else {
                    EntityCacheUtil.putResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
                        EntityIntervalosImpl.class, primaryKey,
                        _nullEntityIntervalos);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityIntervalosModelImpl.ENTITY_CACHE_ENABLED,
                    EntityIntervalosImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityIntervalos;
    }

    /**
     * Returns the entity intervalos with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityIntervalosPK the primary key of the entity intervalos
     * @return the entity intervalos, or <code>null</code> if a entity intervalos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityIntervalos fetchByPrimaryKey(
        EntityIntervalosPK entityIntervalosPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) entityIntervalosPK);
    }

    /**
     * Returns all the entity intervaloses.
     *
     * @return the entity intervaloses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityIntervalos> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity intervaloses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity intervaloses
     * @param end the upper bound of the range of entity intervaloses (not inclusive)
     * @return the range of entity intervaloses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityIntervalos> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity intervaloses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity intervaloses
     * @param end the upper bound of the range of entity intervaloses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity intervaloses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityIntervalos> findAll(int start, int end,
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

        List<EntityIntervalos> list = (List<EntityIntervalos>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYINTERVALOS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYINTERVALOS;

                if (pagination) {
                    sql = sql.concat(EntityIntervalosModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityIntervalos>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityIntervalos>(list);
                } else {
                    list = (List<EntityIntervalos>) QueryUtil.list(q,
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
     * Removes all the entity intervaloses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityIntervalos entityIntervalos : findAll()) {
            remove(entityIntervalos);
        }
    }

    /**
     * Returns the number of entity intervaloses.
     *
     * @return the number of entity intervaloses
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYINTERVALOS);

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
     * Initializes the entity intervalos persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityIntervalos")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityIntervalos>> listenersList = new ArrayList<ModelListener<EntityIntervalos>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityIntervalos>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityIntervalosImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
