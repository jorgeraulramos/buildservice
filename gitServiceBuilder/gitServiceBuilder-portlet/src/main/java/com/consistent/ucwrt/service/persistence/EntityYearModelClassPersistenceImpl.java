package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityYearModelClassException;
import com.consistent.ucwrt.model.EntityYearModelClass;
import com.consistent.ucwrt.model.impl.EntityYearModelClassImpl;
import com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl;
import com.consistent.ucwrt.service.persistence.EntityYearModelClassPersistence;

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
 * The persistence implementation for the entity year model class service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClassPersistence
 * @see EntityYearModelClassUtil
 * @generated
 */
public class EntityYearModelClassPersistenceImpl extends BasePersistenceImpl<EntityYearModelClass>
    implements EntityYearModelClassPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityYearModelClassUtil} to access the entity year model class persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityYearModelClassImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelClassModelImpl.FINDER_CACHE_ENABLED,
            EntityYearModelClassImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelClassModelImpl.FINDER_CACHE_ENABLED,
            EntityYearModelClassImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelClassModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYYEARMODELCLASS = "SELECT entityYearModelClass FROM EntityYearModelClass entityYearModelClass";
    private static final String _SQL_COUNT_ENTITYYEARMODELCLASS = "SELECT COUNT(entityYearModelClass) FROM EntityYearModelClass entityYearModelClass";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityYearModelClass.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityYearModelClass exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityYearModelClassPersistenceImpl.class);
    private static EntityYearModelClass _nullEntityYearModelClass = new EntityYearModelClassImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityYearModelClass> toCacheModel() {
                return _nullEntityYearModelClassCacheModel;
            }
        };

    private static CacheModel<EntityYearModelClass> _nullEntityYearModelClassCacheModel =
        new CacheModel<EntityYearModelClass>() {
            @Override
            public EntityYearModelClass toEntityModel() {
                return _nullEntityYearModelClass;
            }
        };

    public EntityYearModelClassPersistenceImpl() {
        setModelClass(EntityYearModelClass.class);
    }

    /**
     * Caches the entity year model class in the entity cache if it is enabled.
     *
     * @param entityYearModelClass the entity year model class
     */
    @Override
    public void cacheResult(EntityYearModelClass entityYearModelClass) {
        EntityCacheUtil.putResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelClassImpl.class,
            entityYearModelClass.getPrimaryKey(), entityYearModelClass);

        entityYearModelClass.resetOriginalValues();
    }

    /**
     * Caches the entity year model classes in the entity cache if it is enabled.
     *
     * @param entityYearModelClasses the entity year model classes
     */
    @Override
    public void cacheResult(List<EntityYearModelClass> entityYearModelClasses) {
        for (EntityYearModelClass entityYearModelClass : entityYearModelClasses) {
            if (EntityCacheUtil.getResult(
                        EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
                        EntityYearModelClassImpl.class,
                        entityYearModelClass.getPrimaryKey()) == null) {
                cacheResult(entityYearModelClass);
            } else {
                entityYearModelClass.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity year model classes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityYearModelClassImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityYearModelClassImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity year model class.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityYearModelClass entityYearModelClass) {
        EntityCacheUtil.removeResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelClassImpl.class, entityYearModelClass.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityYearModelClass> entityYearModelClasses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityYearModelClass entityYearModelClass : entityYearModelClasses) {
            EntityCacheUtil.removeResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
                EntityYearModelClassImpl.class,
                entityYearModelClass.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity year model class with the primary key. Does not add the entity year model class to the database.
     *
     * @param entityYearModelClassPK the primary key for the new entity year model class
     * @return the new entity year model class
     */
    @Override
    public EntityYearModelClass create(
        EntityYearModelClassPK entityYearModelClassPK) {
        EntityYearModelClass entityYearModelClass = new EntityYearModelClassImpl();

        entityYearModelClass.setNew(true);
        entityYearModelClass.setPrimaryKey(entityYearModelClassPK);

        return entityYearModelClass;
    }

    /**
     * Removes the entity year model class with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityYearModelClassPK the primary key of the entity year model class
     * @return the entity year model class that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModelClass remove(
        EntityYearModelClassPK entityYearModelClassPK)
        throws NoSuchEntityYearModelClassException, SystemException {
        return remove((Serializable) entityYearModelClassPK);
    }

    /**
     * Removes the entity year model class with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity year model class
     * @return the entity year model class that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModelClass remove(Serializable primaryKey)
        throws NoSuchEntityYearModelClassException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityYearModelClass entityYearModelClass = (EntityYearModelClass) session.get(EntityYearModelClassImpl.class,
                    primaryKey);

            if (entityYearModelClass == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityYearModelClassException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityYearModelClass);
        } catch (NoSuchEntityYearModelClassException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityYearModelClass removeImpl(
        EntityYearModelClass entityYearModelClass) throws SystemException {
        entityYearModelClass = toUnwrappedModel(entityYearModelClass);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityYearModelClass)) {
                entityYearModelClass = (EntityYearModelClass) session.get(EntityYearModelClassImpl.class,
                        entityYearModelClass.getPrimaryKeyObj());
            }

            if (entityYearModelClass != null) {
                session.delete(entityYearModelClass);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityYearModelClass != null) {
            clearCache(entityYearModelClass);
        }

        return entityYearModelClass;
    }

    @Override
    public EntityYearModelClass updateImpl(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass)
        throws SystemException {
        entityYearModelClass = toUnwrappedModel(entityYearModelClass);

        boolean isNew = entityYearModelClass.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityYearModelClass.isNew()) {
                session.save(entityYearModelClass);

                entityYearModelClass.setNew(false);
            } else {
                session.merge(entityYearModelClass);
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

        EntityCacheUtil.putResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityYearModelClassImpl.class,
            entityYearModelClass.getPrimaryKey(), entityYearModelClass);

        return entityYearModelClass;
    }

    protected EntityYearModelClass toUnwrappedModel(
        EntityYearModelClass entityYearModelClass) {
        if (entityYearModelClass instanceof EntityYearModelClassImpl) {
            return entityYearModelClass;
        }

        EntityYearModelClassImpl entityYearModelClassImpl = new EntityYearModelClassImpl();

        entityYearModelClassImpl.setNew(entityYearModelClass.isNew());
        entityYearModelClassImpl.setPrimaryKey(entityYearModelClass.getPrimaryKey());

        entityYearModelClassImpl.setClassId(entityYearModelClass.getClassId());
        entityYearModelClassImpl.setYearModel(entityYearModelClass.getYearModel());
        entityYearModelClassImpl.setStartKilometer(entityYearModelClass.getStartKilometer());
        entityYearModelClassImpl.setFinishKilometers(entityYearModelClass.getFinishKilometers());
        entityYearModelClassImpl.setPrice(entityYearModelClass.getPrice());

        return entityYearModelClassImpl;
    }

    /**
     * Returns the entity year model class with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity year model class
     * @return the entity year model class
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModelClass findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityYearModelClassException, SystemException {
        EntityYearModelClass entityYearModelClass = fetchByPrimaryKey(primaryKey);

        if (entityYearModelClass == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityYearModelClassException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityYearModelClass;
    }

    /**
     * Returns the entity year model class with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityYearModelClassException} if it could not be found.
     *
     * @param entityYearModelClassPK the primary key of the entity year model class
     * @return the entity year model class
     * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModelClass findByPrimaryKey(
        EntityYearModelClassPK entityYearModelClassPK)
        throws NoSuchEntityYearModelClassException, SystemException {
        return findByPrimaryKey((Serializable) entityYearModelClassPK);
    }

    /**
     * Returns the entity year model class with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity year model class
     * @return the entity year model class, or <code>null</code> if a entity year model class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModelClass fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityYearModelClass entityYearModelClass = (EntityYearModelClass) EntityCacheUtil.getResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
                EntityYearModelClassImpl.class, primaryKey);

        if (entityYearModelClass == _nullEntityYearModelClass) {
            return null;
        }

        if (entityYearModelClass == null) {
            Session session = null;

            try {
                session = openSession();

                entityYearModelClass = (EntityYearModelClass) session.get(EntityYearModelClassImpl.class,
                        primaryKey);

                if (entityYearModelClass != null) {
                    cacheResult(entityYearModelClass);
                } else {
                    EntityCacheUtil.putResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
                        EntityYearModelClassImpl.class, primaryKey,
                        _nullEntityYearModelClass);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityYearModelClassModelImpl.ENTITY_CACHE_ENABLED,
                    EntityYearModelClassImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityYearModelClass;
    }

    /**
     * Returns the entity year model class with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityYearModelClassPK the primary key of the entity year model class
     * @return the entity year model class, or <code>null</code> if a entity year model class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityYearModelClass fetchByPrimaryKey(
        EntityYearModelClassPK entityYearModelClassPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) entityYearModelClassPK);
    }

    /**
     * Returns all the entity year model classes.
     *
     * @return the entity year model classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityYearModelClass> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity year model classes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity year model classes
     * @param end the upper bound of the range of entity year model classes (not inclusive)
     * @return the range of entity year model classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityYearModelClass> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity year model classes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity year model classes
     * @param end the upper bound of the range of entity year model classes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity year model classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityYearModelClass> findAll(int start, int end,
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

        List<EntityYearModelClass> list = (List<EntityYearModelClass>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYYEARMODELCLASS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYYEARMODELCLASS;

                if (pagination) {
                    sql = sql.concat(EntityYearModelClassModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityYearModelClass>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityYearModelClass>(list);
                } else {
                    list = (List<EntityYearModelClass>) QueryUtil.list(q,
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
     * Removes all the entity year model classes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityYearModelClass entityYearModelClass : findAll()) {
            remove(entityYearModelClass);
        }
    }

    /**
     * Returns the number of entity year model classes.
     *
     * @return the number of entity year model classes
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYYEARMODELCLASS);

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
     * Initializes the entity year model class persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityYearModelClass")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityYearModelClass>> listenersList = new ArrayList<ModelListener<EntityYearModelClass>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityYearModelClass>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityYearModelClassImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
