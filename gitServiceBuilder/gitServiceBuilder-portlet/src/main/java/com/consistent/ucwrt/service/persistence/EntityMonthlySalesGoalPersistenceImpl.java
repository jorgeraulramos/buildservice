package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException;
import com.consistent.ucwrt.model.EntityMonthlySalesGoal;
import com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalImpl;
import com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl;
import com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPersistence;

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
 * The persistence implementation for the entity monthly sales goal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalPersistence
 * @see EntityMonthlySalesGoalUtil
 * @generated
 */
public class EntityMonthlySalesGoalPersistenceImpl extends BasePersistenceImpl<EntityMonthlySalesGoal>
    implements EntityMonthlySalesGoalPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityMonthlySalesGoalUtil} to access the entity monthly sales goal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityMonthlySalesGoalImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
            EntityMonthlySalesGoalModelImpl.FINDER_CACHE_ENABLED,
            EntityMonthlySalesGoalImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
            EntityMonthlySalesGoalModelImpl.FINDER_CACHE_ENABLED,
            EntityMonthlySalesGoalImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
            EntityMonthlySalesGoalModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYMONTHLYSALESGOAL = "SELECT entityMonthlySalesGoal FROM EntityMonthlySalesGoal entityMonthlySalesGoal";
    private static final String _SQL_COUNT_ENTITYMONTHLYSALESGOAL = "SELECT COUNT(entityMonthlySalesGoal) FROM EntityMonthlySalesGoal entityMonthlySalesGoal";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityMonthlySalesGoal.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityMonthlySalesGoal exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityMonthlySalesGoalPersistenceImpl.class);
    private static EntityMonthlySalesGoal _nullEntityMonthlySalesGoal = new EntityMonthlySalesGoalImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityMonthlySalesGoal> toCacheModel() {
                return _nullEntityMonthlySalesGoalCacheModel;
            }
        };

    private static CacheModel<EntityMonthlySalesGoal> _nullEntityMonthlySalesGoalCacheModel =
        new CacheModel<EntityMonthlySalesGoal>() {
            @Override
            public EntityMonthlySalesGoal toEntityModel() {
                return _nullEntityMonthlySalesGoal;
            }
        };

    public EntityMonthlySalesGoalPersistenceImpl() {
        setModelClass(EntityMonthlySalesGoal.class);
    }

    /**
     * Caches the entity monthly sales goal in the entity cache if it is enabled.
     *
     * @param entityMonthlySalesGoal the entity monthly sales goal
     */
    @Override
    public void cacheResult(EntityMonthlySalesGoal entityMonthlySalesGoal) {
        EntityCacheUtil.putResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
            EntityMonthlySalesGoalImpl.class,
            entityMonthlySalesGoal.getPrimaryKey(), entityMonthlySalesGoal);

        entityMonthlySalesGoal.resetOriginalValues();
    }

    /**
     * Caches the entity monthly sales goals in the entity cache if it is enabled.
     *
     * @param entityMonthlySalesGoals the entity monthly sales goals
     */
    @Override
    public void cacheResult(
        List<EntityMonthlySalesGoal> entityMonthlySalesGoals) {
        for (EntityMonthlySalesGoal entityMonthlySalesGoal : entityMonthlySalesGoals) {
            if (EntityCacheUtil.getResult(
                        EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
                        EntityMonthlySalesGoalImpl.class,
                        entityMonthlySalesGoal.getPrimaryKey()) == null) {
                cacheResult(entityMonthlySalesGoal);
            } else {
                entityMonthlySalesGoal.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity monthly sales goals.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityMonthlySalesGoalImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityMonthlySalesGoalImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity monthly sales goal.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityMonthlySalesGoal entityMonthlySalesGoal) {
        EntityCacheUtil.removeResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
            EntityMonthlySalesGoalImpl.class,
            entityMonthlySalesGoal.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityMonthlySalesGoal> entityMonthlySalesGoals) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityMonthlySalesGoal entityMonthlySalesGoal : entityMonthlySalesGoals) {
            EntityCacheUtil.removeResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
                EntityMonthlySalesGoalImpl.class,
                entityMonthlySalesGoal.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity monthly sales goal with the primary key. Does not add the entity monthly sales goal to the database.
     *
     * @param entityMonthlySalesGoalPK the primary key for the new entity monthly sales goal
     * @return the new entity monthly sales goal
     */
    @Override
    public EntityMonthlySalesGoal create(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK) {
        EntityMonthlySalesGoal entityMonthlySalesGoal = new EntityMonthlySalesGoalImpl();

        entityMonthlySalesGoal.setNew(true);
        entityMonthlySalesGoal.setPrimaryKey(entityMonthlySalesGoalPK);

        return entityMonthlySalesGoal;
    }

    /**
     * Removes the entity monthly sales goal with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
     * @return the entity monthly sales goal that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMonthlySalesGoal remove(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws NoSuchEntityMonthlySalesGoalException, SystemException {
        return remove((Serializable) entityMonthlySalesGoalPK);
    }

    /**
     * Removes the entity monthly sales goal with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity monthly sales goal
     * @return the entity monthly sales goal that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMonthlySalesGoal remove(Serializable primaryKey)
        throws NoSuchEntityMonthlySalesGoalException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityMonthlySalesGoal entityMonthlySalesGoal = (EntityMonthlySalesGoal) session.get(EntityMonthlySalesGoalImpl.class,
                    primaryKey);

            if (entityMonthlySalesGoal == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityMonthlySalesGoalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityMonthlySalesGoal);
        } catch (NoSuchEntityMonthlySalesGoalException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityMonthlySalesGoal removeImpl(
        EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws SystemException {
        entityMonthlySalesGoal = toUnwrappedModel(entityMonthlySalesGoal);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityMonthlySalesGoal)) {
                entityMonthlySalesGoal = (EntityMonthlySalesGoal) session.get(EntityMonthlySalesGoalImpl.class,
                        entityMonthlySalesGoal.getPrimaryKeyObj());
            }

            if (entityMonthlySalesGoal != null) {
                session.delete(entityMonthlySalesGoal);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityMonthlySalesGoal != null) {
            clearCache(entityMonthlySalesGoal);
        }

        return entityMonthlySalesGoal;
    }

    @Override
    public EntityMonthlySalesGoal updateImpl(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws SystemException {
        entityMonthlySalesGoal = toUnwrappedModel(entityMonthlySalesGoal);

        boolean isNew = entityMonthlySalesGoal.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityMonthlySalesGoal.isNew()) {
                session.save(entityMonthlySalesGoal);

                entityMonthlySalesGoal.setNew(false);
            } else {
                session.merge(entityMonthlySalesGoal);
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

        EntityCacheUtil.putResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
            EntityMonthlySalesGoalImpl.class,
            entityMonthlySalesGoal.getPrimaryKey(), entityMonthlySalesGoal);

        return entityMonthlySalesGoal;
    }

    protected EntityMonthlySalesGoal toUnwrappedModel(
        EntityMonthlySalesGoal entityMonthlySalesGoal) {
        if (entityMonthlySalesGoal instanceof EntityMonthlySalesGoalImpl) {
            return entityMonthlySalesGoal;
        }

        EntityMonthlySalesGoalImpl entityMonthlySalesGoalImpl = new EntityMonthlySalesGoalImpl();

        entityMonthlySalesGoalImpl.setNew(entityMonthlySalesGoal.isNew());
        entityMonthlySalesGoalImpl.setPrimaryKey(entityMonthlySalesGoal.getPrimaryKey());

        entityMonthlySalesGoalImpl.setYear(entityMonthlySalesGoal.getYear());
        entityMonthlySalesGoalImpl.setDealerId(entityMonthlySalesGoal.getDealerId());
        entityMonthlySalesGoalImpl.setBusinessBrandName(entityMonthlySalesGoal.getBusinessBrandName());
        entityMonthlySalesGoalImpl.setDescriptionMonthlyGoal(entityMonthlySalesGoal.getDescriptionMonthlyGoal());
        entityMonthlySalesGoalImpl.setObjectiveAnnual(entityMonthlySalesGoal.getObjectiveAnnual());
        entityMonthlySalesGoalImpl.setJanuaryGoal(entityMonthlySalesGoal.getJanuaryGoal());
        entityMonthlySalesGoalImpl.setFebruaryGoal(entityMonthlySalesGoal.getFebruaryGoal());
        entityMonthlySalesGoalImpl.setMarchGoal(entityMonthlySalesGoal.getMarchGoal());
        entityMonthlySalesGoalImpl.setAprilGoal(entityMonthlySalesGoal.getAprilGoal());
        entityMonthlySalesGoalImpl.setMayGoal(entityMonthlySalesGoal.getMayGoal());
        entityMonthlySalesGoalImpl.setJuneGoal(entityMonthlySalesGoal.getJuneGoal());
        entityMonthlySalesGoalImpl.setJulyGoal(entityMonthlySalesGoal.getJulyGoal());
        entityMonthlySalesGoalImpl.setAugustGoal(entityMonthlySalesGoal.getAugustGoal());
        entityMonthlySalesGoalImpl.setSeptemberGoal(entityMonthlySalesGoal.getSeptemberGoal());
        entityMonthlySalesGoalImpl.setOctoberGoal(entityMonthlySalesGoal.getOctoberGoal());
        entityMonthlySalesGoalImpl.setNovemberGoal(entityMonthlySalesGoal.getNovemberGoal());
        entityMonthlySalesGoalImpl.setDecemberGoal(entityMonthlySalesGoal.getDecemberGoal());

        return entityMonthlySalesGoalImpl;
    }

    /**
     * Returns the entity monthly sales goal with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity monthly sales goal
     * @return the entity monthly sales goal
     * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMonthlySalesGoal findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityMonthlySalesGoalException, SystemException {
        EntityMonthlySalesGoal entityMonthlySalesGoal = fetchByPrimaryKey(primaryKey);

        if (entityMonthlySalesGoal == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityMonthlySalesGoalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityMonthlySalesGoal;
    }

    /**
     * Returns the entity monthly sales goal with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException} if it could not be found.
     *
     * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
     * @return the entity monthly sales goal
     * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMonthlySalesGoal findByPrimaryKey(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws NoSuchEntityMonthlySalesGoalException, SystemException {
        return findByPrimaryKey((Serializable) entityMonthlySalesGoalPK);
    }

    /**
     * Returns the entity monthly sales goal with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity monthly sales goal
     * @return the entity monthly sales goal, or <code>null</code> if a entity monthly sales goal with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMonthlySalesGoal fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityMonthlySalesGoal entityMonthlySalesGoal = (EntityMonthlySalesGoal) EntityCacheUtil.getResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
                EntityMonthlySalesGoalImpl.class, primaryKey);

        if (entityMonthlySalesGoal == _nullEntityMonthlySalesGoal) {
            return null;
        }

        if (entityMonthlySalesGoal == null) {
            Session session = null;

            try {
                session = openSession();

                entityMonthlySalesGoal = (EntityMonthlySalesGoal) session.get(EntityMonthlySalesGoalImpl.class,
                        primaryKey);

                if (entityMonthlySalesGoal != null) {
                    cacheResult(entityMonthlySalesGoal);
                } else {
                    EntityCacheUtil.putResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
                        EntityMonthlySalesGoalImpl.class, primaryKey,
                        _nullEntityMonthlySalesGoal);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityMonthlySalesGoalModelImpl.ENTITY_CACHE_ENABLED,
                    EntityMonthlySalesGoalImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityMonthlySalesGoal;
    }

    /**
     * Returns the entity monthly sales goal with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
     * @return the entity monthly sales goal, or <code>null</code> if a entity monthly sales goal with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMonthlySalesGoal fetchByPrimaryKey(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) entityMonthlySalesGoalPK);
    }

    /**
     * Returns all the entity monthly sales goals.
     *
     * @return the entity monthly sales goals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMonthlySalesGoal> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity monthly sales goals.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity monthly sales goals
     * @param end the upper bound of the range of entity monthly sales goals (not inclusive)
     * @return the range of entity monthly sales goals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMonthlySalesGoal> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity monthly sales goals.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity monthly sales goals
     * @param end the upper bound of the range of entity monthly sales goals (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity monthly sales goals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMonthlySalesGoal> findAll(int start, int end,
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

        List<EntityMonthlySalesGoal> list = (List<EntityMonthlySalesGoal>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYMONTHLYSALESGOAL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYMONTHLYSALESGOAL;

                if (pagination) {
                    sql = sql.concat(EntityMonthlySalesGoalModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityMonthlySalesGoal>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityMonthlySalesGoal>(list);
                } else {
                    list = (List<EntityMonthlySalesGoal>) QueryUtil.list(q,
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
     * Removes all the entity monthly sales goals from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityMonthlySalesGoal entityMonthlySalesGoal : findAll()) {
            remove(entityMonthlySalesGoal);
        }
    }

    /**
     * Returns the number of entity monthly sales goals.
     *
     * @return the number of entity monthly sales goals
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYMONTHLYSALESGOAL);

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
     * Initializes the entity monthly sales goal persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityMonthlySalesGoal")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityMonthlySalesGoal>> listenersList = new ArrayList<ModelListener<EntityMonthlySalesGoal>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityMonthlySalesGoal>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityMonthlySalesGoalImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
