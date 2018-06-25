package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityGParameterException;
import com.consistent.ucwrt.model.EntityGParameter;
import com.consistent.ucwrt.model.impl.EntityGParameterImpl;
import com.consistent.ucwrt.model.impl.EntityGParameterModelImpl;
import com.consistent.ucwrt.service.persistence.EntityGParameterPersistence;

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
 * The persistence implementation for the entity g parameter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameterPersistence
 * @see EntityGParameterUtil
 * @generated
 */
public class EntityGParameterPersistenceImpl extends BasePersistenceImpl<EntityGParameter>
    implements EntityGParameterPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityGParameterUtil} to access the entity g parameter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityGParameterImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
            EntityGParameterModelImpl.FINDER_CACHE_ENABLED,
            EntityGParameterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
            EntityGParameterModelImpl.FINDER_CACHE_ENABLED,
            EntityGParameterImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
            EntityGParameterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYGPARAMETER = "SELECT entityGParameter FROM EntityGParameter entityGParameter";
    private static final String _SQL_COUNT_ENTITYGPARAMETER = "SELECT COUNT(entityGParameter) FROM EntityGParameter entityGParameter";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityGParameter.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityGParameter exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityGParameterPersistenceImpl.class);
    private static EntityGParameter _nullEntityGParameter = new EntityGParameterImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityGParameter> toCacheModel() {
                return _nullEntityGParameterCacheModel;
            }
        };

    private static CacheModel<EntityGParameter> _nullEntityGParameterCacheModel = new CacheModel<EntityGParameter>() {
            @Override
            public EntityGParameter toEntityModel() {
                return _nullEntityGParameter;
            }
        };

    public EntityGParameterPersistenceImpl() {
        setModelClass(EntityGParameter.class);
    }

    /**
     * Caches the entity g parameter in the entity cache if it is enabled.
     *
     * @param entityGParameter the entity g parameter
     */
    @Override
    public void cacheResult(EntityGParameter entityGParameter) {
        EntityCacheUtil.putResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
            EntityGParameterImpl.class, entityGParameter.getPrimaryKey(),
            entityGParameter);

        entityGParameter.resetOriginalValues();
    }

    /**
     * Caches the entity g parameters in the entity cache if it is enabled.
     *
     * @param entityGParameters the entity g parameters
     */
    @Override
    public void cacheResult(List<EntityGParameter> entityGParameters) {
        for (EntityGParameter entityGParameter : entityGParameters) {
            if (EntityCacheUtil.getResult(
                        EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
                        EntityGParameterImpl.class,
                        entityGParameter.getPrimaryKey()) == null) {
                cacheResult(entityGParameter);
            } else {
                entityGParameter.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity g parameters.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityGParameterImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityGParameterImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity g parameter.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityGParameter entityGParameter) {
        EntityCacheUtil.removeResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
            EntityGParameterImpl.class, entityGParameter.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityGParameter> entityGParameters) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityGParameter entityGParameter : entityGParameters) {
            EntityCacheUtil.removeResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
                EntityGParameterImpl.class, entityGParameter.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity g parameter with the primary key. Does not add the entity g parameter to the database.
     *
     * @param parameterName the primary key for the new entity g parameter
     * @return the new entity g parameter
     */
    @Override
    public EntityGParameter create(String parameterName) {
        EntityGParameter entityGParameter = new EntityGParameterImpl();

        entityGParameter.setNew(true);
        entityGParameter.setPrimaryKey(parameterName);

        return entityGParameter;
    }

    /**
     * Removes the entity g parameter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param parameterName the primary key of the entity g parameter
     * @return the entity g parameter that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityGParameterException if a entity g parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityGParameter remove(String parameterName)
        throws NoSuchEntityGParameterException, SystemException {
        return remove((Serializable) parameterName);
    }

    /**
     * Removes the entity g parameter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity g parameter
     * @return the entity g parameter that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityGParameterException if a entity g parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityGParameter remove(Serializable primaryKey)
        throws NoSuchEntityGParameterException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityGParameter entityGParameter = (EntityGParameter) session.get(EntityGParameterImpl.class,
                    primaryKey);

            if (entityGParameter == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityGParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityGParameter);
        } catch (NoSuchEntityGParameterException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityGParameter removeImpl(EntityGParameter entityGParameter)
        throws SystemException {
        entityGParameter = toUnwrappedModel(entityGParameter);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityGParameter)) {
                entityGParameter = (EntityGParameter) session.get(EntityGParameterImpl.class,
                        entityGParameter.getPrimaryKeyObj());
            }

            if (entityGParameter != null) {
                session.delete(entityGParameter);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityGParameter != null) {
            clearCache(entityGParameter);
        }

        return entityGParameter;
    }

    @Override
    public EntityGParameter updateImpl(
        com.consistent.ucwrt.model.EntityGParameter entityGParameter)
        throws SystemException {
        entityGParameter = toUnwrappedModel(entityGParameter);

        boolean isNew = entityGParameter.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityGParameter.isNew()) {
                session.save(entityGParameter);

                entityGParameter.setNew(false);
            } else {
                session.merge(entityGParameter);
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

        EntityCacheUtil.putResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
            EntityGParameterImpl.class, entityGParameter.getPrimaryKey(),
            entityGParameter);

        return entityGParameter;
    }

    protected EntityGParameter toUnwrappedModel(
        EntityGParameter entityGParameter) {
        if (entityGParameter instanceof EntityGParameterImpl) {
            return entityGParameter;
        }

        EntityGParameterImpl entityGParameterImpl = new EntityGParameterImpl();

        entityGParameterImpl.setNew(entityGParameter.isNew());
        entityGParameterImpl.setPrimaryKey(entityGParameter.getPrimaryKey());

        entityGParameterImpl.setParameterName(entityGParameter.getParameterName());
        entityGParameterImpl.setValue(entityGParameter.getValue());
        entityGParameterImpl.setDescription(entityGParameter.getDescription());

        return entityGParameterImpl;
    }

    /**
     * Returns the entity g parameter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity g parameter
     * @return the entity g parameter
     * @throws com.consistent.ucwrt.NoSuchEntityGParameterException if a entity g parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityGParameter findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityGParameterException, SystemException {
        EntityGParameter entityGParameter = fetchByPrimaryKey(primaryKey);

        if (entityGParameter == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityGParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityGParameter;
    }

    /**
     * Returns the entity g parameter with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityGParameterException} if it could not be found.
     *
     * @param parameterName the primary key of the entity g parameter
     * @return the entity g parameter
     * @throws com.consistent.ucwrt.NoSuchEntityGParameterException if a entity g parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityGParameter findByPrimaryKey(String parameterName)
        throws NoSuchEntityGParameterException, SystemException {
        return findByPrimaryKey((Serializable) parameterName);
    }

    /**
     * Returns the entity g parameter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity g parameter
     * @return the entity g parameter, or <code>null</code> if a entity g parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityGParameter fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityGParameter entityGParameter = (EntityGParameter) EntityCacheUtil.getResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
                EntityGParameterImpl.class, primaryKey);

        if (entityGParameter == _nullEntityGParameter) {
            return null;
        }

        if (entityGParameter == null) {
            Session session = null;

            try {
                session = openSession();

                entityGParameter = (EntityGParameter) session.get(EntityGParameterImpl.class,
                        primaryKey);

                if (entityGParameter != null) {
                    cacheResult(entityGParameter);
                } else {
                    EntityCacheUtil.putResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
                        EntityGParameterImpl.class, primaryKey,
                        _nullEntityGParameter);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityGParameterModelImpl.ENTITY_CACHE_ENABLED,
                    EntityGParameterImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityGParameter;
    }

    /**
     * Returns the entity g parameter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param parameterName the primary key of the entity g parameter
     * @return the entity g parameter, or <code>null</code> if a entity g parameter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityGParameter fetchByPrimaryKey(String parameterName)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) parameterName);
    }

    /**
     * Returns all the entity g parameters.
     *
     * @return the entity g parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityGParameter> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity g parameters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity g parameters
     * @param end the upper bound of the range of entity g parameters (not inclusive)
     * @return the range of entity g parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityGParameter> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity g parameters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity g parameters
     * @param end the upper bound of the range of entity g parameters (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity g parameters
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityGParameter> findAll(int start, int end,
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

        List<EntityGParameter> list = (List<EntityGParameter>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYGPARAMETER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYGPARAMETER;

                if (pagination) {
                    sql = sql.concat(EntityGParameterModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityGParameter>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityGParameter>(list);
                } else {
                    list = (List<EntityGParameter>) QueryUtil.list(q,
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
     * Removes all the entity g parameters from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityGParameter entityGParameter : findAll()) {
            remove(entityGParameter);
        }
    }

    /**
     * Returns the number of entity g parameters.
     *
     * @return the number of entity g parameters
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYGPARAMETER);

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
     * Initializes the entity g parameter persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityGParameter")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityGParameter>> listenersList = new ArrayList<ModelListener<EntityGParameter>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityGParameter>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityGParameterImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
