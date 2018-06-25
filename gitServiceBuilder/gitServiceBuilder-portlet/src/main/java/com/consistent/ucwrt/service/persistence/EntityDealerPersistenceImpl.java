package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityDealerException;
import com.consistent.ucwrt.model.EntityDealer;
import com.consistent.ucwrt.model.impl.EntityDealerImpl;
import com.consistent.ucwrt.model.impl.EntityDealerModelImpl;
import com.consistent.ucwrt.service.persistence.EntityDealerPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entity dealer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealerPersistence
 * @see EntityDealerUtil
 * @generated
 */
public class EntityDealerPersistenceImpl extends BasePersistenceImpl<EntityDealer>
    implements EntityDealerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityDealerUtil} to access the entity dealer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityDealerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerModelImpl.FINDER_CACHE_ENABLED, EntityDealerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerModelImpl.FINDER_CACHE_ENABLED, EntityDealerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEALERBYDEALERID =
        new FinderPath(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerModelImpl.FINDER_CACHE_ENABLED, EntityDealerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDealerByDealerId",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEALERBYDEALERID =
        new FinderPath(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerModelImpl.FINDER_CACHE_ENABLED, EntityDealerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByDealerByDealerId", new String[] { String.class.getName() },
            EntityDealerModelImpl.DEALERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEALERBYDEALERID = new FinderPath(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByDealerByDealerId", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_DEALERBYDEALERID_DEALERID_1 = "entityDealer.dealerId IS NULL";
    private static final String _FINDER_COLUMN_DEALERBYDEALERID_DEALERID_2 = "entityDealer.dealerId = ?";
    private static final String _FINDER_COLUMN_DEALERBYDEALERID_DEALERID_3 = "(entityDealer.dealerId IS NULL OR entityDealer.dealerId = '')";
    private static final String _SQL_SELECT_ENTITYDEALER = "SELECT entityDealer FROM EntityDealer entityDealer";
    private static final String _SQL_SELECT_ENTITYDEALER_WHERE = "SELECT entityDealer FROM EntityDealer entityDealer WHERE ";
    private static final String _SQL_COUNT_ENTITYDEALER = "SELECT COUNT(entityDealer) FROM EntityDealer entityDealer";
    private static final String _SQL_COUNT_ENTITYDEALER_WHERE = "SELECT COUNT(entityDealer) FROM EntityDealer entityDealer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityDealer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityDealer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityDealer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityDealerPersistenceImpl.class);
    private static EntityDealer _nullEntityDealer = new EntityDealerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityDealer> toCacheModel() {
                return _nullEntityDealerCacheModel;
            }
        };

    private static CacheModel<EntityDealer> _nullEntityDealerCacheModel = new CacheModel<EntityDealer>() {
            @Override
            public EntityDealer toEntityModel() {
                return _nullEntityDealer;
            }
        };

    public EntityDealerPersistenceImpl() {
        setModelClass(EntityDealer.class);
    }

    /**
     * Returns all the entity dealers where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @return the matching entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDealer> findByDealerByDealerId(String dealerId)
        throws SystemException {
        return findByDealerByDealerId(dealerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity dealers where dealerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param start the lower bound of the range of entity dealers
     * @param end the upper bound of the range of entity dealers (not inclusive)
     * @return the range of matching entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDealer> findByDealerByDealerId(String dealerId,
        int start, int end) throws SystemException {
        return findByDealerByDealerId(dealerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity dealers where dealerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param start the lower bound of the range of entity dealers
     * @param end the upper bound of the range of entity dealers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDealer> findByDealerByDealerId(String dealerId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEALERBYDEALERID;
            finderArgs = new Object[] { dealerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEALERBYDEALERID;
            finderArgs = new Object[] { dealerId, start, end, orderByComparator };
        }

        List<EntityDealer> list = (List<EntityDealer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityDealer entityDealer : list) {
                if (!Validator.equals(dealerId, entityDealer.getDealerId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_ENTITYDEALER_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_DEALERBYDEALERID_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DEALERBYDEALERID_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_DEALERBYDEALERID_DEALERID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityDealerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDealerId) {
                    qPos.add(dealerId);
                }

                if (!pagination) {
                    list = (List<EntityDealer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityDealer>(list);
                } else {
                    list = (List<EntityDealer>) QueryUtil.list(q, getDialect(),
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
     * Returns the first entity dealer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity dealer
     * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a matching entity dealer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer findByDealerByDealerId_First(String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityDealerException, SystemException {
        EntityDealer entityDealer = fetchByDealerByDealerId_First(dealerId,
                orderByComparator);

        if (entityDealer != null) {
            return entityDealer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityDealerException(msg.toString());
    }

    /**
     * Returns the first entity dealer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity dealer, or <code>null</code> if a matching entity dealer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer fetchByDealerByDealerId_First(String dealerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityDealer> list = findByDealerByDealerId(dealerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity dealer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity dealer
     * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a matching entity dealer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer findByDealerByDealerId_Last(String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityDealerException, SystemException {
        EntityDealer entityDealer = fetchByDealerByDealerId_Last(dealerId,
                orderByComparator);

        if (entityDealer != null) {
            return entityDealer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityDealerException(msg.toString());
    }

    /**
     * Returns the last entity dealer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity dealer, or <code>null</code> if a matching entity dealer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer fetchByDealerByDealerId_Last(String dealerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByDealerByDealerId(dealerId);

        if (count == 0) {
            return null;
        }

        List<EntityDealer> list = findByDealerByDealerId(dealerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the entity dealers where dealerId = &#63; from the database.
     *
     * @param dealerId the dealer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByDealerByDealerId(String dealerId)
        throws SystemException {
        for (EntityDealer entityDealer : findByDealerByDealerId(dealerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityDealer);
        }
    }

    /**
     * Returns the number of entity dealers where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @return the number of matching entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByDealerByDealerId(String dealerId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DEALERBYDEALERID;

        Object[] finderArgs = new Object[] { dealerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYDEALER_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_DEALERBYDEALERID_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DEALERBYDEALERID_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_DEALERBYDEALERID_DEALERID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDealerId) {
                    qPos.add(dealerId);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the entity dealer in the entity cache if it is enabled.
     *
     * @param entityDealer the entity dealer
     */
    @Override
    public void cacheResult(EntityDealer entityDealer) {
        EntityCacheUtil.putResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerImpl.class, entityDealer.getPrimaryKey(), entityDealer);

        entityDealer.resetOriginalValues();
    }

    /**
     * Caches the entity dealers in the entity cache if it is enabled.
     *
     * @param entityDealers the entity dealers
     */
    @Override
    public void cacheResult(List<EntityDealer> entityDealers) {
        for (EntityDealer entityDealer : entityDealers) {
            if (EntityCacheUtil.getResult(
                        EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
                        EntityDealerImpl.class, entityDealer.getPrimaryKey()) == null) {
                cacheResult(entityDealer);
            } else {
                entityDealer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity dealers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityDealerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityDealerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity dealer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityDealer entityDealer) {
        EntityCacheUtil.removeResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerImpl.class, entityDealer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityDealer> entityDealers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityDealer entityDealer : entityDealers) {
            EntityCacheUtil.removeResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
                EntityDealerImpl.class, entityDealer.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity dealer with the primary key. Does not add the entity dealer to the database.
     *
     * @param dealerId the primary key for the new entity dealer
     * @return the new entity dealer
     */
    @Override
    public EntityDealer create(String dealerId) {
        EntityDealer entityDealer = new EntityDealerImpl();

        entityDealer.setNew(true);
        entityDealer.setPrimaryKey(dealerId);

        return entityDealer;
    }

    /**
     * Removes the entity dealer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param dealerId the primary key of the entity dealer
     * @return the entity dealer that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer remove(String dealerId)
        throws NoSuchEntityDealerException, SystemException {
        return remove((Serializable) dealerId);
    }

    /**
     * Removes the entity dealer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity dealer
     * @return the entity dealer that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer remove(Serializable primaryKey)
        throws NoSuchEntityDealerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityDealer entityDealer = (EntityDealer) session.get(EntityDealerImpl.class,
                    primaryKey);

            if (entityDealer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityDealerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityDealer);
        } catch (NoSuchEntityDealerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityDealer removeImpl(EntityDealer entityDealer)
        throws SystemException {
        entityDealer = toUnwrappedModel(entityDealer);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityDealer)) {
                entityDealer = (EntityDealer) session.get(EntityDealerImpl.class,
                        entityDealer.getPrimaryKeyObj());
            }

            if (entityDealer != null) {
                session.delete(entityDealer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityDealer != null) {
            clearCache(entityDealer);
        }

        return entityDealer;
    }

    @Override
    public EntityDealer updateImpl(
        com.consistent.ucwrt.model.EntityDealer entityDealer)
        throws SystemException {
        entityDealer = toUnwrappedModel(entityDealer);

        boolean isNew = entityDealer.isNew();

        EntityDealerModelImpl entityDealerModelImpl = (EntityDealerModelImpl) entityDealer;

        Session session = null;

        try {
            session = openSession();

            if (entityDealer.isNew()) {
                session.save(entityDealer);

                entityDealer.setNew(false);
            } else {
                session.merge(entityDealer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityDealerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityDealerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEALERBYDEALERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityDealerModelImpl.getOriginalDealerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEALERBYDEALERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEALERBYDEALERID,
                    args);

                args = new Object[] { entityDealerModelImpl.getDealerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEALERBYDEALERID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEALERBYDEALERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
            EntityDealerImpl.class, entityDealer.getPrimaryKey(), entityDealer);

        return entityDealer;
    }

    protected EntityDealer toUnwrappedModel(EntityDealer entityDealer) {
        if (entityDealer instanceof EntityDealerImpl) {
            return entityDealer;
        }

        EntityDealerImpl entityDealerImpl = new EntityDealerImpl();

        entityDealerImpl.setNew(entityDealer.isNew());
        entityDealerImpl.setPrimaryKey(entityDealer.getPrimaryKey());

        entityDealerImpl.setDealerId(entityDealer.getDealerId());
        entityDealerImpl.setDealerName(entityDealer.getDealerName());
        entityDealerImpl.setGuaranteed(entityDealer.getGuaranteed());
        entityDealerImpl.setGeneralManagerName(entityDealer.getGeneralManagerName());
        entityDealerImpl.setShareholderName(entityDealer.getShareholderName());
        entityDealerImpl.setMailShareholder(entityDealer.getMailShareholder());
        entityDealerImpl.setMailGeneralManager(entityDealer.getMailGeneralManager());
        entityDealerImpl.setBusinessBrandName(entityDealer.getBusinessBrandName());
        entityDealerImpl.setZoneName(entityDealer.getZoneName());

        return entityDealerImpl;
    }

    /**
     * Returns the entity dealer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity dealer
     * @return the entity dealer
     * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityDealerException, SystemException {
        EntityDealer entityDealer = fetchByPrimaryKey(primaryKey);

        if (entityDealer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityDealerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityDealer;
    }

    /**
     * Returns the entity dealer with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityDealerException} if it could not be found.
     *
     * @param dealerId the primary key of the entity dealer
     * @return the entity dealer
     * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer findByPrimaryKey(String dealerId)
        throws NoSuchEntityDealerException, SystemException {
        return findByPrimaryKey((Serializable) dealerId);
    }

    /**
     * Returns the entity dealer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity dealer
     * @return the entity dealer, or <code>null</code> if a entity dealer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityDealer entityDealer = (EntityDealer) EntityCacheUtil.getResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
                EntityDealerImpl.class, primaryKey);

        if (entityDealer == _nullEntityDealer) {
            return null;
        }

        if (entityDealer == null) {
            Session session = null;

            try {
                session = openSession();

                entityDealer = (EntityDealer) session.get(EntityDealerImpl.class,
                        primaryKey);

                if (entityDealer != null) {
                    cacheResult(entityDealer);
                } else {
                    EntityCacheUtil.putResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
                        EntityDealerImpl.class, primaryKey, _nullEntityDealer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityDealerModelImpl.ENTITY_CACHE_ENABLED,
                    EntityDealerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityDealer;
    }

    /**
     * Returns the entity dealer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param dealerId the primary key of the entity dealer
     * @return the entity dealer, or <code>null</code> if a entity dealer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityDealer fetchByPrimaryKey(String dealerId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) dealerId);
    }

    /**
     * Returns all the entity dealers.
     *
     * @return the entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDealer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity dealers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity dealers
     * @param end the upper bound of the range of entity dealers (not inclusive)
     * @return the range of entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDealer> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity dealers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity dealers
     * @param end the upper bound of the range of entity dealers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity dealers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityDealer> findAll(int start, int end,
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

        List<EntityDealer> list = (List<EntityDealer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYDEALER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYDEALER;

                if (pagination) {
                    sql = sql.concat(EntityDealerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityDealer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityDealer>(list);
                } else {
                    list = (List<EntityDealer>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity dealers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityDealer entityDealer : findAll()) {
            remove(entityDealer);
        }
    }

    /**
     * Returns the number of entity dealers.
     *
     * @return the number of entity dealers
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYDEALER);

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
     * Initializes the entity dealer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityDealer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityDealer>> listenersList = new ArrayList<ModelListener<EntityDealer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityDealer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityDealerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
