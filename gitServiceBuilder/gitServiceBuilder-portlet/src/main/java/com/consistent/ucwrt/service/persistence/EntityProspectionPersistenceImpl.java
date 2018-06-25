package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityProspectionException;
import com.consistent.ucwrt.model.EntityProspection;
import com.consistent.ucwrt.model.impl.EntityProspectionImpl;
import com.consistent.ucwrt.model.impl.EntityProspectionModelImpl;
import com.consistent.ucwrt.service.persistence.EntityProspectionPersistence;

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
 * The persistence implementation for the entity prospection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspectionPersistence
 * @see EntityProspectionUtil
 * @generated
 */
public class EntityProspectionPersistenceImpl extends BasePersistenceImpl<EntityProspection>
    implements EntityProspectionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityProspectionUtil} to access the entity prospection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityProspectionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
            EntityProspectionModelImpl.FINDER_CACHE_ENABLED,
            EntityProspectionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
            EntityProspectionModelImpl.FINDER_CACHE_ENABLED,
            EntityProspectionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
            EntityProspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYPROSPECTION = "SELECT entityProspection FROM EntityProspection entityProspection";
    private static final String _SQL_COUNT_ENTITYPROSPECTION = "SELECT COUNT(entityProspection) FROM EntityProspection entityProspection";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityProspection.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityProspection exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityProspectionPersistenceImpl.class);
    private static EntityProspection _nullEntityProspection = new EntityProspectionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityProspection> toCacheModel() {
                return _nullEntityProspectionCacheModel;
            }
        };

    private static CacheModel<EntityProspection> _nullEntityProspectionCacheModel =
        new CacheModel<EntityProspection>() {
            @Override
            public EntityProspection toEntityModel() {
                return _nullEntityProspection;
            }
        };

    public EntityProspectionPersistenceImpl() {
        setModelClass(EntityProspection.class);
    }

    /**
     * Caches the entity prospection in the entity cache if it is enabled.
     *
     * @param entityProspection the entity prospection
     */
    @Override
    public void cacheResult(EntityProspection entityProspection) {
        EntityCacheUtil.putResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
            EntityProspectionImpl.class, entityProspection.getPrimaryKey(),
            entityProspection);

        entityProspection.resetOriginalValues();
    }

    /**
     * Caches the entity prospections in the entity cache if it is enabled.
     *
     * @param entityProspections the entity prospections
     */
    @Override
    public void cacheResult(List<EntityProspection> entityProspections) {
        for (EntityProspection entityProspection : entityProspections) {
            if (EntityCacheUtil.getResult(
                        EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
                        EntityProspectionImpl.class,
                        entityProspection.getPrimaryKey()) == null) {
                cacheResult(entityProspection);
            } else {
                entityProspection.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity prospections.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityProspectionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityProspectionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity prospection.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityProspection entityProspection) {
        EntityCacheUtil.removeResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
            EntityProspectionImpl.class, entityProspection.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityProspection> entityProspections) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityProspection entityProspection : entityProspections) {
            EntityCacheUtil.removeResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
                EntityProspectionImpl.class, entityProspection.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity prospection with the primary key. Does not add the entity prospection to the database.
     *
     * @param prospectionId the primary key for the new entity prospection
     * @return the new entity prospection
     */
    @Override
    public EntityProspection create(int prospectionId) {
        EntityProspection entityProspection = new EntityProspectionImpl();

        entityProspection.setNew(true);
        entityProspection.setPrimaryKey(prospectionId);

        return entityProspection;
    }

    /**
     * Removes the entity prospection with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param prospectionId the primary key of the entity prospection
     * @return the entity prospection that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityProspection remove(int prospectionId)
        throws NoSuchEntityProspectionException, SystemException {
        return remove((Serializable) prospectionId);
    }

    /**
     * Removes the entity prospection with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity prospection
     * @return the entity prospection that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityProspection remove(Serializable primaryKey)
        throws NoSuchEntityProspectionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityProspection entityProspection = (EntityProspection) session.get(EntityProspectionImpl.class,
                    primaryKey);

            if (entityProspection == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityProspectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityProspection);
        } catch (NoSuchEntityProspectionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityProspection removeImpl(EntityProspection entityProspection)
        throws SystemException {
        entityProspection = toUnwrappedModel(entityProspection);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityProspection)) {
                entityProspection = (EntityProspection) session.get(EntityProspectionImpl.class,
                        entityProspection.getPrimaryKeyObj());
            }

            if (entityProspection != null) {
                session.delete(entityProspection);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityProspection != null) {
            clearCache(entityProspection);
        }

        return entityProspection;
    }

    @Override
    public EntityProspection updateImpl(
        com.consistent.ucwrt.model.EntityProspection entityProspection)
        throws SystemException {
        entityProspection = toUnwrappedModel(entityProspection);

        boolean isNew = entityProspection.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityProspection.isNew()) {
                session.save(entityProspection);

                entityProspection.setNew(false);
            } else {
                session.merge(entityProspection);
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

        EntityCacheUtil.putResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
            EntityProspectionImpl.class, entityProspection.getPrimaryKey(),
            entityProspection);

        return entityProspection;
    }

    protected EntityProspection toUnwrappedModel(
        EntityProspection entityProspection) {
        if (entityProspection instanceof EntityProspectionImpl) {
            return entityProspection;
        }

        EntityProspectionImpl entityProspectionImpl = new EntityProspectionImpl();

        entityProspectionImpl.setNew(entityProspection.isNew());
        entityProspectionImpl.setPrimaryKey(entityProspection.getPrimaryKey());

        entityProspectionImpl.setProspectionId(entityProspection.getProspectionId());
        entityProspectionImpl.setProspectionName(entityProspection.getProspectionName());
        entityProspectionImpl.setEventId(entityProspection.getEventId());

        return entityProspectionImpl;
    }

    /**
     * Returns the entity prospection with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity prospection
     * @return the entity prospection
     * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityProspection findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityProspectionException, SystemException {
        EntityProspection entityProspection = fetchByPrimaryKey(primaryKey);

        if (entityProspection == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityProspectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityProspection;
    }

    /**
     * Returns the entity prospection with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityProspectionException} if it could not be found.
     *
     * @param prospectionId the primary key of the entity prospection
     * @return the entity prospection
     * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityProspection findByPrimaryKey(int prospectionId)
        throws NoSuchEntityProspectionException, SystemException {
        return findByPrimaryKey((Serializable) prospectionId);
    }

    /**
     * Returns the entity prospection with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity prospection
     * @return the entity prospection, or <code>null</code> if a entity prospection with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityProspection fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityProspection entityProspection = (EntityProspection) EntityCacheUtil.getResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
                EntityProspectionImpl.class, primaryKey);

        if (entityProspection == _nullEntityProspection) {
            return null;
        }

        if (entityProspection == null) {
            Session session = null;

            try {
                session = openSession();

                entityProspection = (EntityProspection) session.get(EntityProspectionImpl.class,
                        primaryKey);

                if (entityProspection != null) {
                    cacheResult(entityProspection);
                } else {
                    EntityCacheUtil.putResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
                        EntityProspectionImpl.class, primaryKey,
                        _nullEntityProspection);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityProspectionModelImpl.ENTITY_CACHE_ENABLED,
                    EntityProspectionImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityProspection;
    }

    /**
     * Returns the entity prospection with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param prospectionId the primary key of the entity prospection
     * @return the entity prospection, or <code>null</code> if a entity prospection with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityProspection fetchByPrimaryKey(int prospectionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) prospectionId);
    }

    /**
     * Returns all the entity prospections.
     *
     * @return the entity prospections
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityProspection> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity prospections.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity prospections
     * @param end the upper bound of the range of entity prospections (not inclusive)
     * @return the range of entity prospections
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityProspection> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity prospections.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity prospections
     * @param end the upper bound of the range of entity prospections (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity prospections
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityProspection> findAll(int start, int end,
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

        List<EntityProspection> list = (List<EntityProspection>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYPROSPECTION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYPROSPECTION;

                if (pagination) {
                    sql = sql.concat(EntityProspectionModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityProspection>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityProspection>(list);
                } else {
                    list = (List<EntityProspection>) QueryUtil.list(q,
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
     * Removes all the entity prospections from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityProspection entityProspection : findAll()) {
            remove(entityProspection);
        }
    }

    /**
     * Returns the number of entity prospections.
     *
     * @return the number of entity prospections
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYPROSPECTION);

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
     * Initializes the entity prospection persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityProspection")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityProspection>> listenersList = new ArrayList<ModelListener<EntityProspection>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityProspection>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityProspectionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
