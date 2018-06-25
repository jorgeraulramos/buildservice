package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityDepartmentException;
import com.consistent.ucwrt.model.EntityDepartment;
import com.consistent.ucwrt.model.impl.EntityDepartmentImpl;
import com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl;
import com.consistent.ucwrt.service.persistence.EntityDepartmentPersistence;

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
 * The persistence implementation for the entity department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartmentPersistence
 * @see EntityDepartmentUtil
 * @generated
 */
public class EntityDepartmentPersistenceImpl extends BasePersistenceImpl<EntityDepartment>
    implements EntityDepartmentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityDepartmentUtil} to access the entity department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityDepartmentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityDepartmentModelImpl.FINDER_CACHE_ENABLED,
            EntityDepartmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityDepartmentModelImpl.FINDER_CACHE_ENABLED,
            EntityDepartmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityDepartmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYDEPARTMENT = "SELECT entityDepartment FROM EntityDepartment entityDepartment";
    private static final String _SQL_COUNT_ENTITYDEPARTMENT = "SELECT COUNT(entityDepartment) FROM EntityDepartment entityDepartment";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityDepartment.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityDepartment exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityDepartmentPersistenceImpl.class);
    private static EntityDepartment _nullEntityDepartment = new EntityDepartmentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityDepartment> toCacheModel() {
                return _nullEntityDepartmentCacheModel;
            }
        };

    private static CacheModel<EntityDepartment> _nullEntityDepartmentCacheModel = new CacheModel<EntityDepartment>() {
            @Override
            public EntityDepartment toEntityModel() {
                return _nullEntityDepartment;
            }
        };

    public EntityDepartmentPersistenceImpl() {
        setModelClass(EntityDepartment.class);
    }

    /**
     * Caches the entity department in the entity cache if it is enabled.
     *
     * @param entityDepartment the entity department
     */
    @Override
    public void cacheResult(EntityDepartment entityDepartment) {
        EntityCacheUtil.putResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityDepartmentImpl.class, entityDepartment.getPrimaryKey(),
            entityDepartment);

        entityDepartment.resetOriginalValues();
    }

    /**
     * Caches the entity departments in the entity cache if it is enabled.
     *
     * @param entityDepartments the entity departments
     */
    @Override
    public void cacheResult(List<EntityDepartment> entityDepartments) {
        for (EntityDepartment entityDepartment : entityDepartments) {
            if (EntityCacheUtil.getResult(
                        EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityDepartmentImpl.class,
                        entityDepartment.getPrimaryKey()) == null) {
                cacheResult(entityDepartment);
            } else {
                entityDepartment.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity departments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityDepartmentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityDepartmentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity department.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityDepartment entityDepartment) {
        EntityCacheUtil.removeResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityDepartmentImpl.class, entityDepartment.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityDepartment> entityDepartments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityDepartment entityDepartment : entityDepartments) {
            EntityCacheUtil.removeResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
                EntityDepartmentImpl.class, entityDepartment.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity department with the primary key. Does not add the entity department to the database.
     *
     * @param entityDepartmentPK the primary key for the new entity department
     * @return the new entity department
     */
    @Override
    public EntityDepartment create(EntityDepartmentPK entityDepartmentPK) {
        EntityDepartment entityDepartment = new EntityDepartmentImpl();

        entityDepartment.setNew(true);
        entityDepartment.setPrimaryKey(entityDepartmentPK);

        return entityDepartment;
    }

    /**
     * Removes the entity department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityDepartmentPK the primary key of the entity department
     * @return the entity department that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDepartment remove(EntityDepartmentPK entityDepartmentPK)
        throws NoSuchEntityDepartmentException, SystemException {
        return remove((Serializable) entityDepartmentPK);
    }

    /**
     * Removes the entity department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity department
     * @return the entity department that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDepartment remove(Serializable primaryKey)
        throws NoSuchEntityDepartmentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityDepartment entityDepartment = (EntityDepartment) session.get(EntityDepartmentImpl.class,
                    primaryKey);

            if (entityDepartment == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityDepartment);
        } catch (NoSuchEntityDepartmentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityDepartment removeImpl(EntityDepartment entityDepartment)
        throws SystemException {
        entityDepartment = toUnwrappedModel(entityDepartment);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityDepartment)) {
                entityDepartment = (EntityDepartment) session.get(EntityDepartmentImpl.class,
                        entityDepartment.getPrimaryKeyObj());
            }

            if (entityDepartment != null) {
                session.delete(entityDepartment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityDepartment != null) {
            clearCache(entityDepartment);
        }

        return entityDepartment;
    }

    @Override
    public EntityDepartment updateImpl(
        com.consistent.ucwrt.model.EntityDepartment entityDepartment)
        throws SystemException {
        entityDepartment = toUnwrappedModel(entityDepartment);

        boolean isNew = entityDepartment.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityDepartment.isNew()) {
                session.save(entityDepartment);

                entityDepartment.setNew(false);
            } else {
                session.merge(entityDepartment);
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

        EntityCacheUtil.putResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
            EntityDepartmentImpl.class, entityDepartment.getPrimaryKey(),
            entityDepartment);

        return entityDepartment;
    }

    protected EntityDepartment toUnwrappedModel(
        EntityDepartment entityDepartment) {
        if (entityDepartment instanceof EntityDepartmentImpl) {
            return entityDepartment;
        }

        EntityDepartmentImpl entityDepartmentImpl = new EntityDepartmentImpl();

        entityDepartmentImpl.setNew(entityDepartment.isNew());
        entityDepartmentImpl.setPrimaryKey(entityDepartment.getPrimaryKey());

        entityDepartmentImpl.setDepartmentId(entityDepartment.getDepartmentId());
        entityDepartmentImpl.setDepartmentName(entityDepartment.getDepartmentName());

        return entityDepartmentImpl;
    }

    /**
     * Returns the entity department with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity department
     * @return the entity department
     * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDepartment findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityDepartmentException, SystemException {
        EntityDepartment entityDepartment = fetchByPrimaryKey(primaryKey);

        if (entityDepartment == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityDepartment;
    }

    /**
     * Returns the entity department with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityDepartmentException} if it could not be found.
     *
     * @param entityDepartmentPK the primary key of the entity department
     * @return the entity department
     * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDepartment findByPrimaryKey(
        EntityDepartmentPK entityDepartmentPK)
        throws NoSuchEntityDepartmentException, SystemException {
        return findByPrimaryKey((Serializable) entityDepartmentPK);
    }

    /**
     * Returns the entity department with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity department
     * @return the entity department, or <code>null</code> if a entity department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDepartment fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityDepartment entityDepartment = (EntityDepartment) EntityCacheUtil.getResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
                EntityDepartmentImpl.class, primaryKey);

        if (entityDepartment == _nullEntityDepartment) {
            return null;
        }

        if (entityDepartment == null) {
            Session session = null;

            try {
                session = openSession();

                entityDepartment = (EntityDepartment) session.get(EntityDepartmentImpl.class,
                        primaryKey);

                if (entityDepartment != null) {
                    cacheResult(entityDepartment);
                } else {
                    EntityCacheUtil.putResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityDepartmentImpl.class, primaryKey,
                        _nullEntityDepartment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityDepartmentModelImpl.ENTITY_CACHE_ENABLED,
                    EntityDepartmentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityDepartment;
    }

    /**
     * Returns the entity department with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityDepartmentPK the primary key of the entity department
     * @return the entity department, or <code>null</code> if a entity department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDepartment fetchByPrimaryKey(
        EntityDepartmentPK entityDepartmentPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) entityDepartmentPK);
    }

    /**
     * Returns all the entity departments.
     *
     * @return the entity departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDepartment> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity departments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity departments
     * @param end the upper bound of the range of entity departments (not inclusive)
     * @return the range of entity departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDepartment> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity departments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity departments
     * @param end the upper bound of the range of entity departments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDepartment> findAll(int start, int end,
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

        List<EntityDepartment> list = (List<EntityDepartment>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYDEPARTMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYDEPARTMENT;

                if (pagination) {
                    sql = sql.concat(EntityDepartmentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityDepartment>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityDepartment>(list);
                } else {
                    list = (List<EntityDepartment>) QueryUtil.list(q,
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
     * Removes all the entity departments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityDepartment entityDepartment : findAll()) {
            remove(entityDepartment);
        }
    }

    /**
     * Returns the number of entity departments.
     *
     * @return the number of entity departments
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYDEPARTMENT);

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
     * Initializes the entity department persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityDepartment")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityDepartment>> listenersList = new ArrayList<ModelListener<EntityDepartment>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityDepartment>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityDepartmentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
