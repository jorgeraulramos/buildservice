package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityInventoryException;
import com.consistent.ucwrt.model.EntityInventory;
import com.consistent.ucwrt.model.impl.EntityInventoryImpl;
import com.consistent.ucwrt.model.impl.EntityInventoryModelImpl;
import com.consistent.ucwrt.service.persistence.EntityInventoryPersistence;

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
 * The persistence implementation for the entity inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryPersistence
 * @see EntityInventoryUtil
 * @generated
 */
public class EntityInventoryPersistenceImpl extends BasePersistenceImpl<EntityInventory>
    implements EntityInventoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityInventoryUtil} to access the entity inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityInventoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryModelImpl.FINDER_CACHE_ENABLED,
            EntityInventoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryModelImpl.FINDER_CACHE_ENABLED,
            EntityInventoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDINVENTORY =
        new FinderPath(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryModelImpl.FINDER_CACHE_ENABLED,
            EntityInventoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByfindInventory",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINVENTORY =
        new FinderPath(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryModelImpl.FINDER_CACHE_ENABLED,
            EntityInventoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfindInventory",
            new String[] { String.class.getName() },
            EntityInventoryModelImpl.DEALERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FINDINVENTORY = new FinderPath(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfindInventory",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_FINDINVENTORY_DEALERID_1 = "entityInventory.id.dealerId IS NULL";
    private static final String _FINDER_COLUMN_FINDINVENTORY_DEALERID_2 = "entityInventory.id.dealerId = ?";
    private static final String _FINDER_COLUMN_FINDINVENTORY_DEALERID_3 = "(entityInventory.id.dealerId IS NULL OR entityInventory.id.dealerId = '')";
    private static final String _SQL_SELECT_ENTITYINVENTORY = "SELECT entityInventory FROM EntityInventory entityInventory";
    private static final String _SQL_SELECT_ENTITYINVENTORY_WHERE = "SELECT entityInventory FROM EntityInventory entityInventory WHERE ";
    private static final String _SQL_COUNT_ENTITYINVENTORY = "SELECT COUNT(entityInventory) FROM EntityInventory entityInventory";
    private static final String _SQL_COUNT_ENTITYINVENTORY_WHERE = "SELECT COUNT(entityInventory) FROM EntityInventory entityInventory WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityInventory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityInventory exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityInventory exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityInventoryPersistenceImpl.class);
    private static EntityInventory _nullEntityInventory = new EntityInventoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityInventory> toCacheModel() {
                return _nullEntityInventoryCacheModel;
            }
        };

    private static CacheModel<EntityInventory> _nullEntityInventoryCacheModel = new CacheModel<EntityInventory>() {
            @Override
            public EntityInventory toEntityModel() {
                return _nullEntityInventory;
            }
        };

    public EntityInventoryPersistenceImpl() {
        setModelClass(EntityInventory.class);
    }

    /**
     * Returns all the entity inventories where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @return the matching entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventory> findByfindInventory(String dealerId)
        throws SystemException {
        return findByfindInventory(dealerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity inventories where dealerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param start the lower bound of the range of entity inventories
     * @param end the upper bound of the range of entity inventories (not inclusive)
     * @return the range of matching entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventory> findByfindInventory(String dealerId,
        int start, int end) throws SystemException {
        return findByfindInventory(dealerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity inventories where dealerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param start the lower bound of the range of entity inventories
     * @param end the upper bound of the range of entity inventories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventory> findByfindInventory(String dealerId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINVENTORY;
            finderArgs = new Object[] { dealerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDINVENTORY;
            finderArgs = new Object[] { dealerId, start, end, orderByComparator };
        }

        List<EntityInventory> list = (List<EntityInventory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityInventory entityInventory : list) {
                if (!Validator.equals(dealerId, entityInventory.getDealerId())) {
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

            query.append(_SQL_SELECT_ENTITYINVENTORY_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityInventoryModelImpl.ORDER_BY_JPQL);
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
                    list = (List<EntityInventory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityInventory>(list);
                } else {
                    list = (List<EntityInventory>) QueryUtil.list(q,
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
     * Returns the first entity inventory in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity inventory
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a matching entity inventory could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory findByfindInventory_First(String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityInventoryException, SystemException {
        EntityInventory entityInventory = fetchByfindInventory_First(dealerId,
                orderByComparator);

        if (entityInventory != null) {
            return entityInventory;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityInventoryException(msg.toString());
    }

    /**
     * Returns the first entity inventory in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity inventory, or <code>null</code> if a matching entity inventory could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory fetchByfindInventory_First(String dealerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityInventory> list = findByfindInventory(dealerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity inventory in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity inventory
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a matching entity inventory could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory findByfindInventory_Last(String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityInventoryException, SystemException {
        EntityInventory entityInventory = fetchByfindInventory_Last(dealerId,
                orderByComparator);

        if (entityInventory != null) {
            return entityInventory;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityInventoryException(msg.toString());
    }

    /**
     * Returns the last entity inventory in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity inventory, or <code>null</code> if a matching entity inventory could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory fetchByfindInventory_Last(String dealerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByfindInventory(dealerId);

        if (count == 0) {
            return null;
        }

        List<EntityInventory> list = findByfindInventory(dealerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity inventories before and after the current entity inventory in the ordered set where dealerId = &#63;.
     *
     * @param entityInventoryPK the primary key of the current entity inventory
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity inventory
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory[] findByfindInventory_PrevAndNext(
        EntityInventoryPK entityInventoryPK, String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityInventoryException, SystemException {
        EntityInventory entityInventory = findByPrimaryKey(entityInventoryPK);

        Session session = null;

        try {
            session = openSession();

            EntityInventory[] array = new EntityInventoryImpl[3];

            array[0] = getByfindInventory_PrevAndNext(session, entityInventory,
                    dealerId, orderByComparator, true);

            array[1] = entityInventory;

            array[2] = getByfindInventory_PrevAndNext(session, entityInventory,
                    dealerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityInventory getByfindInventory_PrevAndNext(Session session,
        EntityInventory entityInventory, String dealerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYINVENTORY_WHERE);

        boolean bindDealerId = false;

        if (dealerId == null) {
            query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_1);
        } else if (dealerId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_3);
        } else {
            bindDealerId = true;

            query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EntityInventoryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDealerId) {
            qPos.add(dealerId);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityInventory);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityInventory> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity inventories where dealerId = &#63; from the database.
     *
     * @param dealerId the dealer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByfindInventory(String dealerId)
        throws SystemException {
        for (EntityInventory entityInventory : findByfindInventory(dealerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityInventory);
        }
    }

    /**
     * Returns the number of entity inventories where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @return the number of matching entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfindInventory(String dealerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDINVENTORY;

        Object[] finderArgs = new Object[] { dealerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYINVENTORY_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_FINDINVENTORY_DEALERID_2);
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
     * Caches the entity inventory in the entity cache if it is enabled.
     *
     * @param entityInventory the entity inventory
     */
    @Override
    public void cacheResult(EntityInventory entityInventory) {
        EntityCacheUtil.putResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryImpl.class, entityInventory.getPrimaryKey(),
            entityInventory);

        entityInventory.resetOriginalValues();
    }

    /**
     * Caches the entity inventories in the entity cache if it is enabled.
     *
     * @param entityInventories the entity inventories
     */
    @Override
    public void cacheResult(List<EntityInventory> entityInventories) {
        for (EntityInventory entityInventory : entityInventories) {
            if (EntityCacheUtil.getResult(
                        EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
                        EntityInventoryImpl.class,
                        entityInventory.getPrimaryKey()) == null) {
                cacheResult(entityInventory);
            } else {
                entityInventory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity inventories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityInventoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityInventoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity inventory.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityInventory entityInventory) {
        EntityCacheUtil.removeResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryImpl.class, entityInventory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityInventory> entityInventories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityInventory entityInventory : entityInventories) {
            EntityCacheUtil.removeResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
                EntityInventoryImpl.class, entityInventory.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity inventory with the primary key. Does not add the entity inventory to the database.
     *
     * @param entityInventoryPK the primary key for the new entity inventory
     * @return the new entity inventory
     */
    @Override
    public EntityInventory create(EntityInventoryPK entityInventoryPK) {
        EntityInventory entityInventory = new EntityInventoryImpl();

        entityInventory.setNew(true);
        entityInventory.setPrimaryKey(entityInventoryPK);

        return entityInventory;
    }

    /**
     * Removes the entity inventory with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityInventoryPK the primary key of the entity inventory
     * @return the entity inventory that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory remove(EntityInventoryPK entityInventoryPK)
        throws NoSuchEntityInventoryException, SystemException {
        return remove((Serializable) entityInventoryPK);
    }

    /**
     * Removes the entity inventory with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity inventory
     * @return the entity inventory that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory remove(Serializable primaryKey)
        throws NoSuchEntityInventoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityInventory entityInventory = (EntityInventory) session.get(EntityInventoryImpl.class,
                    primaryKey);

            if (entityInventory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityInventoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityInventory);
        } catch (NoSuchEntityInventoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityInventory removeImpl(EntityInventory entityInventory)
        throws SystemException {
        entityInventory = toUnwrappedModel(entityInventory);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityInventory)) {
                entityInventory = (EntityInventory) session.get(EntityInventoryImpl.class,
                        entityInventory.getPrimaryKeyObj());
            }

            if (entityInventory != null) {
                session.delete(entityInventory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityInventory != null) {
            clearCache(entityInventory);
        }

        return entityInventory;
    }

    @Override
    public EntityInventory updateImpl(
        com.consistent.ucwrt.model.EntityInventory entityInventory)
        throws SystemException {
        entityInventory = toUnwrappedModel(entityInventory);

        boolean isNew = entityInventory.isNew();

        EntityInventoryModelImpl entityInventoryModelImpl = (EntityInventoryModelImpl) entityInventory;

        Session session = null;

        try {
            session = openSession();

            if (entityInventory.isNew()) {
                session.save(entityInventory);

                entityInventory.setNew(false);
            } else {
                session.merge(entityInventory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityInventoryModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityInventoryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINVENTORY.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityInventoryModelImpl.getOriginalDealerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDINVENTORY,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINVENTORY,
                    args);

                args = new Object[] { entityInventoryModelImpl.getDealerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDINVENTORY,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINVENTORY,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
            EntityInventoryImpl.class, entityInventory.getPrimaryKey(),
            entityInventory);

        return entityInventory;
    }

    protected EntityInventory toUnwrappedModel(EntityInventory entityInventory) {
        if (entityInventory instanceof EntityInventoryImpl) {
            return entityInventory;
        }

        EntityInventoryImpl entityInventoryImpl = new EntityInventoryImpl();

        entityInventoryImpl.setNew(entityInventory.isNew());
        entityInventoryImpl.setPrimaryKey(entityInventory.getPrimaryKey());

        entityInventoryImpl.setInventoryId(entityInventory.getInventoryId());
        entityInventoryImpl.setDealerId(entityInventory.getDealerId());
        entityInventoryImpl.setBusinessBrandName(entityInventory.getBusinessBrandName());
        entityInventoryImpl.setVersionId(entityInventory.getVersionId());
        entityInventoryImpl.setYearModel(entityInventory.getYearModel());
        entityInventoryImpl.setBrandId(entityInventory.getBrandId());
        entityInventoryImpl.setModelId(entityInventory.getModelId());
        entityInventoryImpl.setCarExchange(entityInventory.getCarExchange());
        entityInventoryImpl.setChasis(entityInventory.getChasis());
        entityInventoryImpl.setKilometer(entityInventory.getKilometer());
        entityInventoryImpl.setNumberDoors(entityInventory.getNumberDoors());
        entityInventoryImpl.setPurchasePrice(entityInventory.getPurchasePrice());
        entityInventoryImpl.setDamage(entityInventory.getDamage());
        entityInventoryImpl.setEstimatedSalePrice(entityInventory.getEstimatedSalePrice());
        entityInventoryImpl.setEstimatedGrossProfit(entityInventory.getEstimatedGrossProfit());
        entityInventoryImpl.setDateAdmission(entityInventory.getDateAdmission());
        entityInventoryImpl.setSelfCertified(entityInventory.getSelfCertified());
        entityInventoryImpl.setInventoryRegistrationDate(entityInventory.getInventoryRegistrationDate());
        entityInventoryImpl.setWhatProcessDischarged(entityInventory.getWhatProcessDischarged());
        entityInventoryImpl.setEngineLiters(entityInventory.getEngineLiters());
        entityInventoryImpl.setTransmission(entityInventory.getTransmission());
        entityInventoryImpl.setLocation(entityInventory.getLocation());
        entityInventoryImpl.setHp(entityInventory.getHp());
        entityInventoryImpl.setCarToConsignment(entityInventory.getCarToConsignment());
        entityInventoryImpl.setComments(entityInventory.getComments());
        entityInventoryImpl.setStatus(entityInventory.getStatus());
        entityInventoryImpl.setColor(entityInventory.getColor());
        entityInventoryImpl.setDaysSpentInventory(entityInventory.getDaysSpentInventory());
        entityInventoryImpl.setSuggestedPricePurchase(entityInventory.getSuggestedPricePurchase());
        entityInventoryImpl.setSuggestedSalePrice(entityInventory.getSuggestedSalePrice());
        entityInventoryImpl.setVersionPricePurchaseSale(entityInventory.getVersionPricePurchaseSale());
        entityInventoryImpl.setStatusName(entityInventory.getStatusName());
        entityInventoryImpl.setSourceSupplyId(entityInventory.getSourceSupplyId());
        entityInventoryImpl.setInventoryClasificationId(entityInventory.getInventoryClasificationId());
        entityInventoryImpl.setSaleId(entityInventory.getSaleId());
        entityInventoryImpl.setTradeInId(entityInventory.getTradeInId());
        entityInventoryImpl.setEmployeeId(entityInventory.getEmployeeId());

        return entityInventoryImpl;
    }

    /**
     * Returns the entity inventory with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity inventory
     * @return the entity inventory
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityInventoryException, SystemException {
        EntityInventory entityInventory = fetchByPrimaryKey(primaryKey);

        if (entityInventory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityInventoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityInventory;
    }

    /**
     * Returns the entity inventory with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityInventoryException} if it could not be found.
     *
     * @param entityInventoryPK the primary key of the entity inventory
     * @return the entity inventory
     * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory findByPrimaryKey(EntityInventoryPK entityInventoryPK)
        throws NoSuchEntityInventoryException, SystemException {
        return findByPrimaryKey((Serializable) entityInventoryPK);
    }

    /**
     * Returns the entity inventory with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity inventory
     * @return the entity inventory, or <code>null</code> if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityInventory entityInventory = (EntityInventory) EntityCacheUtil.getResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
                EntityInventoryImpl.class, primaryKey);

        if (entityInventory == _nullEntityInventory) {
            return null;
        }

        if (entityInventory == null) {
            Session session = null;

            try {
                session = openSession();

                entityInventory = (EntityInventory) session.get(EntityInventoryImpl.class,
                        primaryKey);

                if (entityInventory != null) {
                    cacheResult(entityInventory);
                } else {
                    EntityCacheUtil.putResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
                        EntityInventoryImpl.class, primaryKey,
                        _nullEntityInventory);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityInventoryModelImpl.ENTITY_CACHE_ENABLED,
                    EntityInventoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityInventory;
    }

    /**
     * Returns the entity inventory with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityInventoryPK the primary key of the entity inventory
     * @return the entity inventory, or <code>null</code> if a entity inventory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityInventory fetchByPrimaryKey(
        EntityInventoryPK entityInventoryPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) entityInventoryPK);
    }

    /**
     * Returns all the entity inventories.
     *
     * @return the entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity inventories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity inventories
     * @param end the upper bound of the range of entity inventories (not inclusive)
     * @return the range of entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity inventories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity inventories
     * @param end the upper bound of the range of entity inventories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity inventories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityInventory> findAll(int start, int end,
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

        List<EntityInventory> list = (List<EntityInventory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYINVENTORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYINVENTORY;

                if (pagination) {
                    sql = sql.concat(EntityInventoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityInventory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityInventory>(list);
                } else {
                    list = (List<EntityInventory>) QueryUtil.list(q,
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
     * Removes all the entity inventories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityInventory entityInventory : findAll()) {
            remove(entityInventory);
        }
    }

    /**
     * Returns the number of entity inventories.
     *
     * @return the number of entity inventories
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYINVENTORY);

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
     * Initializes the entity inventory persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityInventory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityInventory>> listenersList = new ArrayList<ModelListener<EntityInventory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityInventory>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityInventoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
