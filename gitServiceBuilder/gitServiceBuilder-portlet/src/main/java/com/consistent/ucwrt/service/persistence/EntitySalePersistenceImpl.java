package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntitySaleException;
import com.consistent.ucwrt.model.EntitySale;
import com.consistent.ucwrt.model.impl.EntitySaleImpl;
import com.consistent.ucwrt.model.impl.EntitySaleModelImpl;
import com.consistent.ucwrt.service.persistence.EntitySalePersistence;

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
 * The persistence implementation for the entity sale service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalePersistence
 * @see EntitySaleUtil
 * @generated
 */
public class EntitySalePersistenceImpl extends BasePersistenceImpl<EntitySale>
    implements EntitySalePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntitySaleUtil} to access the entity sale persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntitySaleImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
            EntitySaleModelImpl.FINDER_CACHE_ENABLED, EntitySaleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
            EntitySaleModelImpl.FINDER_CACHE_ENABLED, EntitySaleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
            EntitySaleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYSALE = "SELECT entitySale FROM EntitySale entitySale";
    private static final String _SQL_COUNT_ENTITYSALE = "SELECT COUNT(entitySale) FROM EntitySale entitySale";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entitySale.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntitySale exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntitySalePersistenceImpl.class);
    private static EntitySale _nullEntitySale = new EntitySaleImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntitySale> toCacheModel() {
                return _nullEntitySaleCacheModel;
            }
        };

    private static CacheModel<EntitySale> _nullEntitySaleCacheModel = new CacheModel<EntitySale>() {
            @Override
            public EntitySale toEntityModel() {
                return _nullEntitySale;
            }
        };

    public EntitySalePersistenceImpl() {
        setModelClass(EntitySale.class);
    }

    /**
     * Caches the entity sale in the entity cache if it is enabled.
     *
     * @param entitySale the entity sale
     */
    @Override
    public void cacheResult(EntitySale entitySale) {
        EntityCacheUtil.putResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
            EntitySaleImpl.class, entitySale.getPrimaryKey(), entitySale);

        entitySale.resetOriginalValues();
    }

    /**
     * Caches the entity sales in the entity cache if it is enabled.
     *
     * @param entitySales the entity sales
     */
    @Override
    public void cacheResult(List<EntitySale> entitySales) {
        for (EntitySale entitySale : entitySales) {
            if (EntityCacheUtil.getResult(
                        EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySaleImpl.class, entitySale.getPrimaryKey()) == null) {
                cacheResult(entitySale);
            } else {
                entitySale.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity sales.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntitySaleImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntitySaleImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity sale.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntitySale entitySale) {
        EntityCacheUtil.removeResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
            EntitySaleImpl.class, entitySale.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntitySale> entitySales) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntitySale entitySale : entitySales) {
            EntityCacheUtil.removeResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
                EntitySaleImpl.class, entitySale.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity sale with the primary key. Does not add the entity sale to the database.
     *
     * @param saleId the primary key for the new entity sale
     * @return the new entity sale
     */
    @Override
    public EntitySale create(int saleId) {
        EntitySale entitySale = new EntitySaleImpl();

        entitySale.setNew(true);
        entitySale.setPrimaryKey(saleId);

        return entitySale;
    }

    /**
     * Removes the entity sale with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param saleId the primary key of the entity sale
     * @return the entity sale that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySale remove(int saleId)
        throws NoSuchEntitySaleException, SystemException {
        return remove((Serializable) saleId);
    }

    /**
     * Removes the entity sale with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity sale
     * @return the entity sale that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySale remove(Serializable primaryKey)
        throws NoSuchEntitySaleException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntitySale entitySale = (EntitySale) session.get(EntitySaleImpl.class,
                    primaryKey);

            if (entitySale == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntitySaleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entitySale);
        } catch (NoSuchEntitySaleException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntitySale removeImpl(EntitySale entitySale)
        throws SystemException {
        entitySale = toUnwrappedModel(entitySale);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entitySale)) {
                entitySale = (EntitySale) session.get(EntitySaleImpl.class,
                        entitySale.getPrimaryKeyObj());
            }

            if (entitySale != null) {
                session.delete(entitySale);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entitySale != null) {
            clearCache(entitySale);
        }

        return entitySale;
    }

    @Override
    public EntitySale updateImpl(
        com.consistent.ucwrt.model.EntitySale entitySale)
        throws SystemException {
        entitySale = toUnwrappedModel(entitySale);

        boolean isNew = entitySale.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entitySale.isNew()) {
                session.save(entitySale);

                entitySale.setNew(false);
            } else {
                session.merge(entitySale);
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

        EntityCacheUtil.putResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
            EntitySaleImpl.class, entitySale.getPrimaryKey(), entitySale);

        return entitySale;
    }

    protected EntitySale toUnwrappedModel(EntitySale entitySale) {
        if (entitySale instanceof EntitySaleImpl) {
            return entitySale;
        }

        EntitySaleImpl entitySaleImpl = new EntitySaleImpl();

        entitySaleImpl.setNew(entitySale.isNew());
        entitySaleImpl.setPrimaryKey(entitySale.getPrimaryKey());

        entitySaleImpl.setSaleId(entitySale.getSaleId());
        entitySaleImpl.setConfirmBySale(entitySale.getConfirmBySale());
        entitySaleImpl.setDeliveryDate(entitySale.getDeliveryDate());
        entitySaleImpl.setAssurantCertificate(entitySale.getAssurantCertificate());
        entitySaleImpl.setExtendedWarranty(entitySale.getExtendedWarranty());
        entitySaleImpl.setRealGrossProfit(entitySale.getRealGrossProfit());
        entitySaleImpl.setFinalSalePrice(entitySale.getFinalSalePrice());
        entitySaleImpl.setClientId(entitySale.getClientId());
        entitySaleImpl.setEmployeeId(entitySale.getEmployeeId());
        entitySaleImpl.setSalesPlaceId(entitySale.getSalesPlaceId());
        entitySaleImpl.setProspectionId(entitySale.getProspectionId());
        entitySaleImpl.setWayPayId(entitySale.getWayPayId());

        return entitySaleImpl;
    }

    /**
     * Returns the entity sale with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity sale
     * @return the entity sale
     * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySale findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntitySaleException, SystemException {
        EntitySale entitySale = fetchByPrimaryKey(primaryKey);

        if (entitySale == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntitySaleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entitySale;
    }

    /**
     * Returns the entity sale with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySaleException} if it could not be found.
     *
     * @param saleId the primary key of the entity sale
     * @return the entity sale
     * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySale findByPrimaryKey(int saleId)
        throws NoSuchEntitySaleException, SystemException {
        return findByPrimaryKey((Serializable) saleId);
    }

    /**
     * Returns the entity sale with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity sale
     * @return the entity sale, or <code>null</code> if a entity sale with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySale fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntitySale entitySale = (EntitySale) EntityCacheUtil.getResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
                EntitySaleImpl.class, primaryKey);

        if (entitySale == _nullEntitySale) {
            return null;
        }

        if (entitySale == null) {
            Session session = null;

            try {
                session = openSession();

                entitySale = (EntitySale) session.get(EntitySaleImpl.class,
                        primaryKey);

                if (entitySale != null) {
                    cacheResult(entitySale);
                } else {
                    EntityCacheUtil.putResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySaleImpl.class, primaryKey, _nullEntitySale);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntitySaleModelImpl.ENTITY_CACHE_ENABLED,
                    EntitySaleImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entitySale;
    }

    /**
     * Returns the entity sale with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param saleId the primary key of the entity sale
     * @return the entity sale, or <code>null</code> if a entity sale with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySale fetchByPrimaryKey(int saleId) throws SystemException {
        return fetchByPrimaryKey((Serializable) saleId);
    }

    /**
     * Returns all the entity sales.
     *
     * @return the entity sales
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySale> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity sales.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity sales
     * @param end the upper bound of the range of entity sales (not inclusive)
     * @return the range of entity sales
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySale> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity sales.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity sales
     * @param end the upper bound of the range of entity sales (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity sales
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySale> findAll(int start, int end,
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

        List<EntitySale> list = (List<EntitySale>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYSALE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYSALE;

                if (pagination) {
                    sql = sql.concat(EntitySaleModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntitySale>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntitySale>(list);
                } else {
                    list = (List<EntitySale>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity sales from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntitySale entitySale : findAll()) {
            remove(entitySale);
        }
    }

    /**
     * Returns the number of entity sales.
     *
     * @return the number of entity sales
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYSALE);

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
     * Initializes the entity sale persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntitySale")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntitySale>> listenersList = new ArrayList<ModelListener<EntitySale>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntitySale>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntitySaleImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
