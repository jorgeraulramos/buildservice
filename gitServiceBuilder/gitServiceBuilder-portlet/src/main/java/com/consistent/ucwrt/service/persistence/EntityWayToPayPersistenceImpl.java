package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityWayToPayException;
import com.consistent.ucwrt.model.EntityWayToPay;
import com.consistent.ucwrt.model.impl.EntityWayToPayImpl;
import com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl;
import com.consistent.ucwrt.service.persistence.EntityWayToPayPersistence;

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
 * The persistence implementation for the entity way to pay service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPayPersistence
 * @see EntityWayToPayUtil
 * @generated
 */
public class EntityWayToPayPersistenceImpl extends BasePersistenceImpl<EntityWayToPay>
    implements EntityWayToPayPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityWayToPayUtil} to access the entity way to pay persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityWayToPayImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
            EntityWayToPayModelImpl.FINDER_CACHE_ENABLED,
            EntityWayToPayImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
            EntityWayToPayModelImpl.FINDER_CACHE_ENABLED,
            EntityWayToPayImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
            EntityWayToPayModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYWAYTOPAY = "SELECT entityWayToPay FROM EntityWayToPay entityWayToPay";
    private static final String _SQL_COUNT_ENTITYWAYTOPAY = "SELECT COUNT(entityWayToPay) FROM EntityWayToPay entityWayToPay";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityWayToPay.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityWayToPay exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityWayToPayPersistenceImpl.class);
    private static EntityWayToPay _nullEntityWayToPay = new EntityWayToPayImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityWayToPay> toCacheModel() {
                return _nullEntityWayToPayCacheModel;
            }
        };

    private static CacheModel<EntityWayToPay> _nullEntityWayToPayCacheModel = new CacheModel<EntityWayToPay>() {
            @Override
            public EntityWayToPay toEntityModel() {
                return _nullEntityWayToPay;
            }
        };

    public EntityWayToPayPersistenceImpl() {
        setModelClass(EntityWayToPay.class);
    }

    /**
     * Caches the entity way to pay in the entity cache if it is enabled.
     *
     * @param entityWayToPay the entity way to pay
     */
    @Override
    public void cacheResult(EntityWayToPay entityWayToPay) {
        EntityCacheUtil.putResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
            EntityWayToPayImpl.class, entityWayToPay.getPrimaryKey(),
            entityWayToPay);

        entityWayToPay.resetOriginalValues();
    }

    /**
     * Caches the entity way to paies in the entity cache if it is enabled.
     *
     * @param entityWayToPaies the entity way to paies
     */
    @Override
    public void cacheResult(List<EntityWayToPay> entityWayToPaies) {
        for (EntityWayToPay entityWayToPay : entityWayToPaies) {
            if (EntityCacheUtil.getResult(
                        EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
                        EntityWayToPayImpl.class, entityWayToPay.getPrimaryKey()) == null) {
                cacheResult(entityWayToPay);
            } else {
                entityWayToPay.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity way to paies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityWayToPayImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityWayToPayImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity way to pay.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityWayToPay entityWayToPay) {
        EntityCacheUtil.removeResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
            EntityWayToPayImpl.class, entityWayToPay.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityWayToPay> entityWayToPaies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityWayToPay entityWayToPay : entityWayToPaies) {
            EntityCacheUtil.removeResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
                EntityWayToPayImpl.class, entityWayToPay.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity way to pay with the primary key. Does not add the entity way to pay to the database.
     *
     * @param wayPayId the primary key for the new entity way to pay
     * @return the new entity way to pay
     */
    @Override
    public EntityWayToPay create(int wayPayId) {
        EntityWayToPay entityWayToPay = new EntityWayToPayImpl();

        entityWayToPay.setNew(true);
        entityWayToPay.setPrimaryKey(wayPayId);

        return entityWayToPay;
    }

    /**
     * Removes the entity way to pay with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param wayPayId the primary key of the entity way to pay
     * @return the entity way to pay that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityWayToPay remove(int wayPayId)
        throws NoSuchEntityWayToPayException, SystemException {
        return remove((Serializable) wayPayId);
    }

    /**
     * Removes the entity way to pay with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity way to pay
     * @return the entity way to pay that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityWayToPay remove(Serializable primaryKey)
        throws NoSuchEntityWayToPayException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityWayToPay entityWayToPay = (EntityWayToPay) session.get(EntityWayToPayImpl.class,
                    primaryKey);

            if (entityWayToPay == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityWayToPayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityWayToPay);
        } catch (NoSuchEntityWayToPayException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityWayToPay removeImpl(EntityWayToPay entityWayToPay)
        throws SystemException {
        entityWayToPay = toUnwrappedModel(entityWayToPay);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityWayToPay)) {
                entityWayToPay = (EntityWayToPay) session.get(EntityWayToPayImpl.class,
                        entityWayToPay.getPrimaryKeyObj());
            }

            if (entityWayToPay != null) {
                session.delete(entityWayToPay);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityWayToPay != null) {
            clearCache(entityWayToPay);
        }

        return entityWayToPay;
    }

    @Override
    public EntityWayToPay updateImpl(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay)
        throws SystemException {
        entityWayToPay = toUnwrappedModel(entityWayToPay);

        boolean isNew = entityWayToPay.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityWayToPay.isNew()) {
                session.save(entityWayToPay);

                entityWayToPay.setNew(false);
            } else {
                session.merge(entityWayToPay);
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

        EntityCacheUtil.putResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
            EntityWayToPayImpl.class, entityWayToPay.getPrimaryKey(),
            entityWayToPay);

        return entityWayToPay;
    }

    protected EntityWayToPay toUnwrappedModel(EntityWayToPay entityWayToPay) {
        if (entityWayToPay instanceof EntityWayToPayImpl) {
            return entityWayToPay;
        }

        EntityWayToPayImpl entityWayToPayImpl = new EntityWayToPayImpl();

        entityWayToPayImpl.setNew(entityWayToPay.isNew());
        entityWayToPayImpl.setPrimaryKey(entityWayToPay.getPrimaryKey());

        entityWayToPayImpl.setWayPayId(entityWayToPay.getWayPayId());
        entityWayToPayImpl.setPayName(entityWayToPay.getPayName());

        return entityWayToPayImpl;
    }

    /**
     * Returns the entity way to pay with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity way to pay
     * @return the entity way to pay
     * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityWayToPay findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityWayToPayException, SystemException {
        EntityWayToPay entityWayToPay = fetchByPrimaryKey(primaryKey);

        if (entityWayToPay == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityWayToPayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityWayToPay;
    }

    /**
     * Returns the entity way to pay with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityWayToPayException} if it could not be found.
     *
     * @param wayPayId the primary key of the entity way to pay
     * @return the entity way to pay
     * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityWayToPay findByPrimaryKey(int wayPayId)
        throws NoSuchEntityWayToPayException, SystemException {
        return findByPrimaryKey((Serializable) wayPayId);
    }

    /**
     * Returns the entity way to pay with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity way to pay
     * @return the entity way to pay, or <code>null</code> if a entity way to pay with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityWayToPay fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityWayToPay entityWayToPay = (EntityWayToPay) EntityCacheUtil.getResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
                EntityWayToPayImpl.class, primaryKey);

        if (entityWayToPay == _nullEntityWayToPay) {
            return null;
        }

        if (entityWayToPay == null) {
            Session session = null;

            try {
                session = openSession();

                entityWayToPay = (EntityWayToPay) session.get(EntityWayToPayImpl.class,
                        primaryKey);

                if (entityWayToPay != null) {
                    cacheResult(entityWayToPay);
                } else {
                    EntityCacheUtil.putResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
                        EntityWayToPayImpl.class, primaryKey,
                        _nullEntityWayToPay);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityWayToPayModelImpl.ENTITY_CACHE_ENABLED,
                    EntityWayToPayImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityWayToPay;
    }

    /**
     * Returns the entity way to pay with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param wayPayId the primary key of the entity way to pay
     * @return the entity way to pay, or <code>null</code> if a entity way to pay with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityWayToPay fetchByPrimaryKey(int wayPayId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) wayPayId);
    }

    /**
     * Returns all the entity way to paies.
     *
     * @return the entity way to paies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityWayToPay> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity way to paies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity way to paies
     * @param end the upper bound of the range of entity way to paies (not inclusive)
     * @return the range of entity way to paies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityWayToPay> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity way to paies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity way to paies
     * @param end the upper bound of the range of entity way to paies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity way to paies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityWayToPay> findAll(int start, int end,
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

        List<EntityWayToPay> list = (List<EntityWayToPay>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYWAYTOPAY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYWAYTOPAY;

                if (pagination) {
                    sql = sql.concat(EntityWayToPayModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityWayToPay>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityWayToPay>(list);
                } else {
                    list = (List<EntityWayToPay>) QueryUtil.list(q,
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
     * Removes all the entity way to paies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityWayToPay entityWayToPay : findAll()) {
            remove(entityWayToPay);
        }
    }

    /**
     * Returns the number of entity way to paies.
     *
     * @return the number of entity way to paies
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYWAYTOPAY);

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
     * Initializes the entity way to pay persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityWayToPay")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityWayToPay>> listenersList = new ArrayList<ModelListener<EntityWayToPay>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityWayToPay>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityWayToPayImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
