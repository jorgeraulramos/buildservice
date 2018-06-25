package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityYearModelException;
import com.consistent.ucwrt.model.EntityYearModel;
import com.consistent.ucwrt.model.impl.EntityYearModelImpl;
import com.consistent.ucwrt.model.impl.EntityYearModelModelImpl;
import com.consistent.ucwrt.service.persistence.EntityYearModelPersistence;

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
 * The persistence implementation for the entity year model service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelPersistence
 * @see EntityYearModelUtil
 * @generated
 */
public class EntityYearModelPersistenceImpl extends BasePersistenceImpl<EntityYearModel>
    implements EntityYearModelPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityYearModelUtil} to access the entity year model persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityYearModelImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelModelImpl.FINDER_CACHE_ENABLED,
            EntityYearModelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelModelImpl.FINDER_CACHE_ENABLED,
            EntityYearModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYYEARMODEL = "SELECT entityYearModel FROM EntityYearModel entityYearModel";
    private static final String _SQL_COUNT_ENTITYYEARMODEL = "SELECT COUNT(entityYearModel) FROM EntityYearModel entityYearModel";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityYearModel.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityYearModel exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityYearModelPersistenceImpl.class);
    private static EntityYearModel _nullEntityYearModel = new EntityYearModelImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityYearModel> toCacheModel() {
                return _nullEntityYearModelCacheModel;
            }
        };

    private static CacheModel<EntityYearModel> _nullEntityYearModelCacheModel = new CacheModel<EntityYearModel>() {
            @Override
            public EntityYearModel toEntityModel() {
                return _nullEntityYearModel;
            }
        };

    public EntityYearModelPersistenceImpl() {
        setModelClass(EntityYearModel.class);
    }

    /**
     * Caches the entity year model in the entity cache if it is enabled.
     *
     * @param entityYearModel the entity year model
     */
    @Override
    public void cacheResult(EntityYearModel entityYearModel) {
        EntityCacheUtil.putResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelImpl.class, entityYearModel.getPrimaryKey(),
            entityYearModel);

        entityYearModel.resetOriginalValues();
    }

    /**
     * Caches the entity year models in the entity cache if it is enabled.
     *
     * @param entityYearModels the entity year models
     */
    @Override
    public void cacheResult(List<EntityYearModel> entityYearModels) {
        for (EntityYearModel entityYearModel : entityYearModels) {
            if (EntityCacheUtil.getResult(
                        EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
                        EntityYearModelImpl.class,
                        entityYearModel.getPrimaryKey()) == null) {
                cacheResult(entityYearModel);
            } else {
                entityYearModel.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity year models.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityYearModelImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityYearModelImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity year model.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityYearModel entityYearModel) {
        EntityCacheUtil.removeResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelImpl.class, entityYearModel.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityYearModel> entityYearModels) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityYearModel entityYearModel : entityYearModels) {
            EntityCacheUtil.removeResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
                EntityYearModelImpl.class, entityYearModel.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity year model with the primary key. Does not add the entity year model to the database.
     *
     * @param yearModel the primary key for the new entity year model
     * @return the new entity year model
     */
    @Override
    public EntityYearModel create(int yearModel) {
        EntityYearModel entityYearModel = new EntityYearModelImpl();

        entityYearModel.setNew(true);
        entityYearModel.setPrimaryKey(yearModel);

        return entityYearModel;
    }

    /**
     * Removes the entity year model with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param yearModel the primary key of the entity year model
     * @return the entity year model that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelException if a entity year model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModel remove(int yearModel)
        throws NoSuchEntityYearModelException, SystemException {
        return remove((Serializable) yearModel);
    }

    /**
     * Removes the entity year model with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity year model
     * @return the entity year model that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelException if a entity year model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModel remove(Serializable primaryKey)
        throws NoSuchEntityYearModelException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityYearModel entityYearModel = (EntityYearModel) session.get(EntityYearModelImpl.class,
                    primaryKey);

            if (entityYearModel == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityYearModelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityYearModel);
        } catch (NoSuchEntityYearModelException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityYearModel removeImpl(EntityYearModel entityYearModel)
        throws SystemException {
        entityYearModel = toUnwrappedModel(entityYearModel);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityYearModel)) {
                entityYearModel = (EntityYearModel) session.get(EntityYearModelImpl.class,
                        entityYearModel.getPrimaryKeyObj());
            }

            if (entityYearModel != null) {
                session.delete(entityYearModel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityYearModel != null) {
            clearCache(entityYearModel);
        }

        return entityYearModel;
    }

    @Override
    public EntityYearModel updateImpl(
        com.consistent.ucwrt.model.EntityYearModel entityYearModel)
        throws SystemException {
        entityYearModel = toUnwrappedModel(entityYearModel);

        boolean isNew = entityYearModel.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityYearModel.isNew()) {
                session.save(entityYearModel);

                entityYearModel.setNew(false);
            } else {
                session.merge(entityYearModel);
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

        EntityCacheUtil.putResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelImpl.class, entityYearModel.getPrimaryKey(),
            entityYearModel);

        return entityYearModel;
    }

    protected EntityYearModel toUnwrappedModel(EntityYearModel entityYearModel) {
        if (entityYearModel instanceof EntityYearModelImpl) {
            return entityYearModel;
        }

        EntityYearModelImpl entityYearModelImpl = new EntityYearModelImpl();

        entityYearModelImpl.setNew(entityYearModel.isNew());
        entityYearModelImpl.setPrimaryKey(entityYearModel.getPrimaryKey());

        entityYearModelImpl.setYearModel(entityYearModel.getYearModel());
        entityYearModelImpl.setYearModelRegistrationDate(entityYearModel.getYearModelRegistrationDate());
        entityYearModelImpl.setYearModelRegisterData(entityYearModel.getYearModelRegisterData());
        entityYearModelImpl.setYModelResponsibleUser(entityYearModel.getYModelResponsibleUser());
        entityYearModelImpl.setYearModelDescription(entityYearModel.getYearModelDescription());

        return entityYearModelImpl;
    }

    /**
     * Returns the entity year model with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity year model
     * @return the entity year model
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelException if a entity year model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModel findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityYearModelException, SystemException {
        EntityYearModel entityYearModel = fetchByPrimaryKey(primaryKey);

        if (entityYearModel == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityYearModelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityYearModel;
    }

    /**
     * Returns the entity year model with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityYearModelException} if it could not be found.
     *
     * @param yearModel the primary key of the entity year model
     * @return the entity year model
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelException if a entity year model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModel findByPrimaryKey(int yearModel)
        throws NoSuchEntityYearModelException, SystemException {
        return findByPrimaryKey((Serializable) yearModel);
    }

    /**
     * Returns the entity year model with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity year model
     * @return the entity year model, or <code>null</code> if a entity year model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModel fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityYearModel entityYearModel = (EntityYearModel) EntityCacheUtil.getResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
                EntityYearModelImpl.class, primaryKey);

        if (entityYearModel == _nullEntityYearModel) {
            return null;
        }

        if (entityYearModel == null) {
            Session session = null;

            try {
                session = openSession();

                entityYearModel = (EntityYearModel) session.get(EntityYearModelImpl.class,
                        primaryKey);

                if (entityYearModel != null) {
                    cacheResult(entityYearModel);
                } else {
                    EntityCacheUtil.putResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
                        EntityYearModelImpl.class, primaryKey,
                        _nullEntityYearModel);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityYearModelModelImpl.ENTITY_CACHE_ENABLED,
                    EntityYearModelImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityYearModel;
    }

    /**
     * Returns the entity year model with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param yearModel the primary key of the entity year model
     * @return the entity year model, or <code>null</code> if a entity year model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModel fetchByPrimaryKey(int yearModel)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) yearModel);
    }

    /**
     * Returns all the entity year models.
     *
     * @return the entity year models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityYearModel> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity year models.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity year models
     * @param end the upper bound of the range of entity year models (not inclusive)
     * @return the range of entity year models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityYearModel> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity year models.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity year models
     * @param end the upper bound of the range of entity year models (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity year models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityYearModel> findAll(int start, int end,
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

        List<EntityYearModel> list = (List<EntityYearModel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYYEARMODEL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYYEARMODEL;

                if (pagination) {
                    sql = sql.concat(EntityYearModelModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityYearModel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityYearModel>(list);
                } else {
                    list = (List<EntityYearModel>) QueryUtil.list(q,
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
     * Removes all the entity year models from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityYearModel entityYearModel : findAll()) {
            remove(entityYearModel);
        }
    }

    /**
     * Returns the number of entity year models.
     *
     * @return the number of entity year models
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYYEARMODEL);

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
     * Initializes the entity year model persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityYearModel")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityYearModel>> listenersList = new ArrayList<ModelListener<EntityYearModel>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityYearModel>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityYearModelImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
