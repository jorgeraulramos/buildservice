package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityEmploymentException;
import com.consistent.ucwrt.model.EntityEmployment;
import com.consistent.ucwrt.model.impl.EntityEmploymentImpl;
import com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl;
import com.consistent.ucwrt.service.persistence.EntityEmploymentPersistence;

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
 * The persistence implementation for the entity employment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmploymentPersistence
 * @see EntityEmploymentUtil
 * @generated
 */
public class EntityEmploymentPersistenceImpl extends BasePersistenceImpl<EntityEmployment>
    implements EntityEmploymentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityEmploymentUtil} to access the entity employment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityEmploymentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmploymentModelImpl.FINDER_CACHE_ENABLED,
            EntityEmploymentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmploymentModelImpl.FINDER_CACHE_ENABLED,
            EntityEmploymentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmploymentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYEMPLOYMENT = "SELECT entityEmployment FROM EntityEmployment entityEmployment";
    private static final String _SQL_COUNT_ENTITYEMPLOYMENT = "SELECT COUNT(entityEmployment) FROM EntityEmployment entityEmployment";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityEmployment.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityEmployment exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityEmploymentPersistenceImpl.class);
    private static EntityEmployment _nullEntityEmployment = new EntityEmploymentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityEmployment> toCacheModel() {
                return _nullEntityEmploymentCacheModel;
            }
        };

    private static CacheModel<EntityEmployment> _nullEntityEmploymentCacheModel = new CacheModel<EntityEmployment>() {
            @Override
            public EntityEmployment toEntityModel() {
                return _nullEntityEmployment;
            }
        };

    public EntityEmploymentPersistenceImpl() {
        setModelClass(EntityEmployment.class);
    }

    /**
     * Caches the entity employment in the entity cache if it is enabled.
     *
     * @param entityEmployment the entity employment
     */
    @Override
    public void cacheResult(EntityEmployment entityEmployment) {
        EntityCacheUtil.putResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmploymentImpl.class, entityEmployment.getPrimaryKey(),
            entityEmployment);

        entityEmployment.resetOriginalValues();
    }

    /**
     * Caches the entity employments in the entity cache if it is enabled.
     *
     * @param entityEmployments the entity employments
     */
    @Override
    public void cacheResult(List<EntityEmployment> entityEmployments) {
        for (EntityEmployment entityEmployment : entityEmployments) {
            if (EntityCacheUtil.getResult(
                        EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEmploymentImpl.class,
                        entityEmployment.getPrimaryKey()) == null) {
                cacheResult(entityEmployment);
            } else {
                entityEmployment.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity employments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityEmploymentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityEmploymentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity employment.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityEmployment entityEmployment) {
        EntityCacheUtil.removeResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmploymentImpl.class, entityEmployment.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityEmployment> entityEmployments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityEmployment entityEmployment : entityEmployments) {
            EntityCacheUtil.removeResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
                EntityEmploymentImpl.class, entityEmployment.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity employment with the primary key. Does not add the entity employment to the database.
     *
     * @param entityEmploymentPK the primary key for the new entity employment
     * @return the new entity employment
     */
    @Override
    public EntityEmployment create(EntityEmploymentPK entityEmploymentPK) {
        EntityEmployment entityEmployment = new EntityEmploymentImpl();

        entityEmployment.setNew(true);
        entityEmployment.setPrimaryKey(entityEmploymentPK);

        return entityEmployment;
    }

    /**
     * Removes the entity employment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityEmploymentPK the primary key of the entity employment
     * @return the entity employment that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployment remove(EntityEmploymentPK entityEmploymentPK)
        throws NoSuchEntityEmploymentException, SystemException {
        return remove((Serializable) entityEmploymentPK);
    }

    /**
     * Removes the entity employment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity employment
     * @return the entity employment that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployment remove(Serializable primaryKey)
        throws NoSuchEntityEmploymentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityEmployment entityEmployment = (EntityEmployment) session.get(EntityEmploymentImpl.class,
                    primaryKey);

            if (entityEmployment == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityEmploymentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityEmployment);
        } catch (NoSuchEntityEmploymentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityEmployment removeImpl(EntityEmployment entityEmployment)
        throws SystemException {
        entityEmployment = toUnwrappedModel(entityEmployment);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityEmployment)) {
                entityEmployment = (EntityEmployment) session.get(EntityEmploymentImpl.class,
                        entityEmployment.getPrimaryKeyObj());
            }

            if (entityEmployment != null) {
                session.delete(entityEmployment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityEmployment != null) {
            clearCache(entityEmployment);
        }

        return entityEmployment;
    }

    @Override
    public EntityEmployment updateImpl(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment)
        throws SystemException {
        entityEmployment = toUnwrappedModel(entityEmployment);

        boolean isNew = entityEmployment.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityEmployment.isNew()) {
                session.save(entityEmployment);

                entityEmployment.setNew(false);
            } else {
                session.merge(entityEmployment);
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

        EntityCacheUtil.putResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmploymentImpl.class, entityEmployment.getPrimaryKey(),
            entityEmployment);

        return entityEmployment;
    }

    protected EntityEmployment toUnwrappedModel(
        EntityEmployment entityEmployment) {
        if (entityEmployment instanceof EntityEmploymentImpl) {
            return entityEmployment;
        }

        EntityEmploymentImpl entityEmploymentImpl = new EntityEmploymentImpl();

        entityEmploymentImpl.setNew(entityEmployment.isNew());
        entityEmploymentImpl.setPrimaryKey(entityEmployment.getPrimaryKey());

        entityEmploymentImpl.setEmploymentId(entityEmployment.getEmploymentId());
        entityEmploymentImpl.setEmploymentName(entityEmployment.getEmploymentName());

        return entityEmploymentImpl;
    }

    /**
     * Returns the entity employment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity employment
     * @return the entity employment
     * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployment findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityEmploymentException, SystemException {
        EntityEmployment entityEmployment = fetchByPrimaryKey(primaryKey);

        if (entityEmployment == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityEmploymentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityEmployment;
    }

    /**
     * Returns the entity employment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEmploymentException} if it could not be found.
     *
     * @param entityEmploymentPK the primary key of the entity employment
     * @return the entity employment
     * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployment findByPrimaryKey(
        EntityEmploymentPK entityEmploymentPK)
        throws NoSuchEntityEmploymentException, SystemException {
        return findByPrimaryKey((Serializable) entityEmploymentPK);
    }

    /**
     * Returns the entity employment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity employment
     * @return the entity employment, or <code>null</code> if a entity employment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployment fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityEmployment entityEmployment = (EntityEmployment) EntityCacheUtil.getResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
                EntityEmploymentImpl.class, primaryKey);

        if (entityEmployment == _nullEntityEmployment) {
            return null;
        }

        if (entityEmployment == null) {
            Session session = null;

            try {
                session = openSession();

                entityEmployment = (EntityEmployment) session.get(EntityEmploymentImpl.class,
                        primaryKey);

                if (entityEmployment != null) {
                    cacheResult(entityEmployment);
                } else {
                    EntityCacheUtil.putResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEmploymentImpl.class, primaryKey,
                        _nullEntityEmployment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityEmploymentModelImpl.ENTITY_CACHE_ENABLED,
                    EntityEmploymentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityEmployment;
    }

    /**
     * Returns the entity employment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityEmploymentPK the primary key of the entity employment
     * @return the entity employment, or <code>null</code> if a entity employment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployment fetchByPrimaryKey(
        EntityEmploymentPK entityEmploymentPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) entityEmploymentPK);
    }

    /**
     * Returns all the entity employments.
     *
     * @return the entity employments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployment> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity employments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity employments
     * @param end the upper bound of the range of entity employments (not inclusive)
     * @return the range of entity employments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployment> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity employments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity employments
     * @param end the upper bound of the range of entity employments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity employments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployment> findAll(int start, int end,
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

        List<EntityEmployment> list = (List<EntityEmployment>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYEMPLOYMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYEMPLOYMENT;

                if (pagination) {
                    sql = sql.concat(EntityEmploymentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityEmployment>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityEmployment>(list);
                } else {
                    list = (List<EntityEmployment>) QueryUtil.list(q,
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
     * Removes all the entity employments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityEmployment entityEmployment : findAll()) {
            remove(entityEmployment);
        }
    }

    /**
     * Returns the number of entity employments.
     *
     * @return the number of entity employments
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYEMPLOYMENT);

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
     * Initializes the entity employment persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityEmployment")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityEmployment>> listenersList = new ArrayList<ModelListener<EntityEmployment>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityEmployment>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityEmploymentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
