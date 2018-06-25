package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityCustomerException;
import com.consistent.ucwrt.model.EntityCustomer;
import com.consistent.ucwrt.model.impl.EntityCustomerImpl;
import com.consistent.ucwrt.model.impl.EntityCustomerModelImpl;
import com.consistent.ucwrt.service.persistence.EntityCustomerPersistence;

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
 * The persistence implementation for the entity customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityCustomerPersistence
 * @see EntityCustomerUtil
 * @generated
 */
public class EntityCustomerPersistenceImpl extends BasePersistenceImpl<EntityCustomer>
    implements EntityCustomerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityCustomerUtil} to access the entity customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityCustomerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED,
            EntityCustomerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED,
            EntityCustomerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_GETRFC = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED,
            EntityCustomerImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchBygetRFC", new String[] { String.class.getName() },
            EntityCustomerModelImpl.RFC_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GETRFC = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetRFC",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_GETRFC_RFC_1 = "entityCustomer.rfc IS NULL";
    private static final String _FINDER_COLUMN_GETRFC_RFC_2 = "entityCustomer.rfc = ?";
    private static final String _FINDER_COLUMN_GETRFC_RFC_3 = "(entityCustomer.rfc IS NULL OR entityCustomer.rfc = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMER = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED,
            EntityCustomerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByCustomer",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMER =
        new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED,
            EntityCustomerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCustomer",
            new String[] { String.class.getName() },
            EntityCustomerModelImpl.DEALERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMER = new FinderPath(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCustomer",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CUSTOMER_DEALERID_1 = "entityCustomer.dealerId IS NULL";
    private static final String _FINDER_COLUMN_CUSTOMER_DEALERID_2 = "entityCustomer.dealerId = ?";
    private static final String _FINDER_COLUMN_CUSTOMER_DEALERID_3 = "(entityCustomer.dealerId IS NULL OR entityCustomer.dealerId = '')";
    private static final String _SQL_SELECT_ENTITYCUSTOMER = "SELECT entityCustomer FROM EntityCustomer entityCustomer";
    private static final String _SQL_SELECT_ENTITYCUSTOMER_WHERE = "SELECT entityCustomer FROM EntityCustomer entityCustomer WHERE ";
    private static final String _SQL_COUNT_ENTITYCUSTOMER = "SELECT COUNT(entityCustomer) FROM EntityCustomer entityCustomer";
    private static final String _SQL_COUNT_ENTITYCUSTOMER_WHERE = "SELECT COUNT(entityCustomer) FROM EntityCustomer entityCustomer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityCustomer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityCustomer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityCustomer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityCustomerPersistenceImpl.class);
    private static EntityCustomer _nullEntityCustomer = new EntityCustomerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityCustomer> toCacheModel() {
                return _nullEntityCustomerCacheModel;
            }
        };

    private static CacheModel<EntityCustomer> _nullEntityCustomerCacheModel = new CacheModel<EntityCustomer>() {
            @Override
            public EntityCustomer toEntityModel() {
                return _nullEntityCustomer;
            }
        };

    public EntityCustomerPersistenceImpl() {
        setModelClass(EntityCustomer.class);
    }

    /**
     * Returns the entity customer where rfc = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityCustomerException} if it could not be found.
     *
     * @param rfc the rfc
     * @return the matching entity customer
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer findBygetRFC(String rfc)
        throws NoSuchEntityCustomerException, SystemException {
        EntityCustomer entityCustomer = fetchBygetRFC(rfc);

        if (entityCustomer == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("rfc=");
            msg.append(rfc);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityCustomerException(msg.toString());
        }

        return entityCustomer;
    }

    /**
     * Returns the entity customer where rfc = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param rfc the rfc
     * @return the matching entity customer, or <code>null</code> if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer fetchBygetRFC(String rfc) throws SystemException {
        return fetchBygetRFC(rfc, true);
    }

    /**
     * Returns the entity customer where rfc = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param rfc the rfc
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity customer, or <code>null</code> if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer fetchBygetRFC(String rfc, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { rfc };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GETRFC,
                    finderArgs, this);
        }

        if (result instanceof EntityCustomer) {
            EntityCustomer entityCustomer = (EntityCustomer) result;

            if (!Validator.equals(rfc, entityCustomer.getRfc())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_ENTITYCUSTOMER_WHERE);

            boolean bindRfc = false;

            if (rfc == null) {
                query.append(_FINDER_COLUMN_GETRFC_RFC_1);
            } else if (rfc.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_GETRFC_RFC_3);
            } else {
                bindRfc = true;

                query.append(_FINDER_COLUMN_GETRFC_RFC_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRfc) {
                    qPos.add(rfc);
                }

                List<EntityCustomer> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRFC,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "EntityCustomerPersistenceImpl.fetchBygetRFC(String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    EntityCustomer entityCustomer = list.get(0);

                    result = entityCustomer;

                    cacheResult(entityCustomer);

                    if ((entityCustomer.getRfc() == null) ||
                            !entityCustomer.getRfc().equals(rfc)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRFC,
                            finderArgs, entityCustomer);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETRFC,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityCustomer) result;
        }
    }

    /**
     * Removes the entity customer where rfc = &#63; from the database.
     *
     * @param rfc the rfc
     * @return the entity customer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer removeBygetRFC(String rfc)
        throws NoSuchEntityCustomerException, SystemException {
        EntityCustomer entityCustomer = findBygetRFC(rfc);

        return remove(entityCustomer);
    }

    /**
     * Returns the number of entity customers where rfc = &#63;.
     *
     * @param rfc the rfc
     * @return the number of matching entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBygetRFC(String rfc) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GETRFC;

        Object[] finderArgs = new Object[] { rfc };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYCUSTOMER_WHERE);

            boolean bindRfc = false;

            if (rfc == null) {
                query.append(_FINDER_COLUMN_GETRFC_RFC_1);
            } else if (rfc.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_GETRFC_RFC_3);
            } else {
                bindRfc = true;

                query.append(_FINDER_COLUMN_GETRFC_RFC_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRfc) {
                    qPos.add(rfc);
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
     * Returns all the entity customers where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @return the matching entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityCustomer> findByCustomer(String dealerId)
        throws SystemException {
        return findByCustomer(dealerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the entity customers where dealerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param start the lower bound of the range of entity customers
     * @param end the upper bound of the range of entity customers (not inclusive)
     * @return the range of matching entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityCustomer> findByCustomer(String dealerId, int start,
        int end) throws SystemException {
        return findByCustomer(dealerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity customers where dealerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param start the lower bound of the range of entity customers
     * @param end the upper bound of the range of entity customers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityCustomer> findByCustomer(String dealerId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMER;
            finderArgs = new Object[] { dealerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMER;
            finderArgs = new Object[] { dealerId, start, end, orderByComparator };
        }

        List<EntityCustomer> list = (List<EntityCustomer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityCustomer entityCustomer : list) {
                if (!Validator.equals(dealerId, entityCustomer.getDealerId())) {
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

            query.append(_SQL_SELECT_ENTITYCUSTOMER_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityCustomerModelImpl.ORDER_BY_JPQL);
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
                    list = (List<EntityCustomer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityCustomer>(list);
                } else {
                    list = (List<EntityCustomer>) QueryUtil.list(q,
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
     * Returns the first entity customer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity customer
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer findByCustomer_First(String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityCustomerException, SystemException {
        EntityCustomer entityCustomer = fetchByCustomer_First(dealerId,
                orderByComparator);

        if (entityCustomer != null) {
            return entityCustomer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityCustomerException(msg.toString());
    }

    /**
     * Returns the first entity customer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity customer, or <code>null</code> if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer fetchByCustomer_First(String dealerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityCustomer> list = findByCustomer(dealerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity customer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity customer
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer findByCustomer_Last(String dealerId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityCustomerException, SystemException {
        EntityCustomer entityCustomer = fetchByCustomer_Last(dealerId,
                orderByComparator);

        if (entityCustomer != null) {
            return entityCustomer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityCustomerException(msg.toString());
    }

    /**
     * Returns the last entity customer in the ordered set where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity customer, or <code>null</code> if a matching entity customer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer fetchByCustomer_Last(String dealerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCustomer(dealerId);

        if (count == 0) {
            return null;
        }

        List<EntityCustomer> list = findByCustomer(dealerId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity customers before and after the current entity customer in the ordered set where dealerId = &#63;.
     *
     * @param clientId the primary key of the current entity customer
     * @param dealerId the dealer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity customer
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer[] findByCustomer_PrevAndNext(int clientId,
        String dealerId, OrderByComparator orderByComparator)
        throws NoSuchEntityCustomerException, SystemException {
        EntityCustomer entityCustomer = findByPrimaryKey(clientId);

        Session session = null;

        try {
            session = openSession();

            EntityCustomer[] array = new EntityCustomerImpl[3];

            array[0] = getByCustomer_PrevAndNext(session, entityCustomer,
                    dealerId, orderByComparator, true);

            array[1] = entityCustomer;

            array[2] = getByCustomer_PrevAndNext(session, entityCustomer,
                    dealerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityCustomer getByCustomer_PrevAndNext(Session session,
        EntityCustomer entityCustomer, String dealerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYCUSTOMER_WHERE);

        boolean bindDealerId = false;

        if (dealerId == null) {
            query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_1);
        } else if (dealerId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_3);
        } else {
            bindDealerId = true;

            query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_2);
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
            query.append(EntityCustomerModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(entityCustomer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityCustomer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity customers where dealerId = &#63; from the database.
     *
     * @param dealerId the dealer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCustomer(String dealerId) throws SystemException {
        for (EntityCustomer entityCustomer : findByCustomer(dealerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityCustomer);
        }
    }

    /**
     * Returns the number of entity customers where dealerId = &#63;.
     *
     * @param dealerId the dealer ID
     * @return the number of matching entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCustomer(String dealerId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMER;

        Object[] finderArgs = new Object[] { dealerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYCUSTOMER_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_CUSTOMER_DEALERID_2);
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
     * Caches the entity customer in the entity cache if it is enabled.
     *
     * @param entityCustomer the entity customer
     */
    @Override
    public void cacheResult(EntityCustomer entityCustomer) {
        EntityCacheUtil.putResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerImpl.class, entityCustomer.getPrimaryKey(),
            entityCustomer);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRFC,
            new Object[] { entityCustomer.getRfc() }, entityCustomer);

        entityCustomer.resetOriginalValues();
    }

    /**
     * Caches the entity customers in the entity cache if it is enabled.
     *
     * @param entityCustomers the entity customers
     */
    @Override
    public void cacheResult(List<EntityCustomer> entityCustomers) {
        for (EntityCustomer entityCustomer : entityCustomers) {
            if (EntityCacheUtil.getResult(
                        EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
                        EntityCustomerImpl.class, entityCustomer.getPrimaryKey()) == null) {
                cacheResult(entityCustomer);
            } else {
                entityCustomer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity customers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityCustomerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityCustomerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity customer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityCustomer entityCustomer) {
        EntityCacheUtil.removeResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerImpl.class, entityCustomer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(entityCustomer);
    }

    @Override
    public void clearCache(List<EntityCustomer> entityCustomers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityCustomer entityCustomer : entityCustomers) {
            EntityCacheUtil.removeResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
                EntityCustomerImpl.class, entityCustomer.getPrimaryKey());

            clearUniqueFindersCache(entityCustomer);
        }
    }

    protected void cacheUniqueFindersCache(EntityCustomer entityCustomer) {
        if (entityCustomer.isNew()) {
            Object[] args = new Object[] { entityCustomer.getRfc() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GETRFC, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRFC, args,
                entityCustomer);
        } else {
            EntityCustomerModelImpl entityCustomerModelImpl = (EntityCustomerModelImpl) entityCustomer;

            if ((entityCustomerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_GETRFC.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { entityCustomer.getRfc() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GETRFC, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRFC, args,
                    entityCustomer);
            }
        }
    }

    protected void clearUniqueFindersCache(EntityCustomer entityCustomer) {
        EntityCustomerModelImpl entityCustomerModelImpl = (EntityCustomerModelImpl) entityCustomer;

        Object[] args = new Object[] { entityCustomer.getRfc() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETRFC, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETRFC, args);

        if ((entityCustomerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_GETRFC.getColumnBitmask()) != 0) {
            args = new Object[] { entityCustomerModelImpl.getOriginalRfc() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETRFC, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETRFC, args);
        }
    }

    /**
     * Creates a new entity customer with the primary key. Does not add the entity customer to the database.
     *
     * @param clientId the primary key for the new entity customer
     * @return the new entity customer
     */
    @Override
    public EntityCustomer create(int clientId) {
        EntityCustomer entityCustomer = new EntityCustomerImpl();

        entityCustomer.setNew(true);
        entityCustomer.setPrimaryKey(clientId);

        return entityCustomer;
    }

    /**
     * Removes the entity customer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param clientId the primary key of the entity customer
     * @return the entity customer that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer remove(int clientId)
        throws NoSuchEntityCustomerException, SystemException {
        return remove((Serializable) clientId);
    }

    /**
     * Removes the entity customer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity customer
     * @return the entity customer that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer remove(Serializable primaryKey)
        throws NoSuchEntityCustomerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityCustomer entityCustomer = (EntityCustomer) session.get(EntityCustomerImpl.class,
                    primaryKey);

            if (entityCustomer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityCustomer);
        } catch (NoSuchEntityCustomerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityCustomer removeImpl(EntityCustomer entityCustomer)
        throws SystemException {
        entityCustomer = toUnwrappedModel(entityCustomer);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityCustomer)) {
                entityCustomer = (EntityCustomer) session.get(EntityCustomerImpl.class,
                        entityCustomer.getPrimaryKeyObj());
            }

            if (entityCustomer != null) {
                session.delete(entityCustomer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityCustomer != null) {
            clearCache(entityCustomer);
        }

        return entityCustomer;
    }

    @Override
    public EntityCustomer updateImpl(
        com.consistent.ucwrt.model.EntityCustomer entityCustomer)
        throws SystemException {
        entityCustomer = toUnwrappedModel(entityCustomer);

        boolean isNew = entityCustomer.isNew();

        EntityCustomerModelImpl entityCustomerModelImpl = (EntityCustomerModelImpl) entityCustomer;

        Session session = null;

        try {
            session = openSession();

            if (entityCustomer.isNew()) {
                session.save(entityCustomer);

                entityCustomer.setNew(false);
            } else {
                session.merge(entityCustomer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityCustomerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityCustomerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityCustomerModelImpl.getOriginalDealerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMER, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMER,
                    args);

                args = new Object[] { entityCustomerModelImpl.getDealerId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMER, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMER,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
            EntityCustomerImpl.class, entityCustomer.getPrimaryKey(),
            entityCustomer);

        clearUniqueFindersCache(entityCustomer);
        cacheUniqueFindersCache(entityCustomer);

        return entityCustomer;
    }

    protected EntityCustomer toUnwrappedModel(EntityCustomer entityCustomer) {
        if (entityCustomer instanceof EntityCustomerImpl) {
            return entityCustomer;
        }

        EntityCustomerImpl entityCustomerImpl = new EntityCustomerImpl();

        entityCustomerImpl.setNew(entityCustomer.isNew());
        entityCustomerImpl.setPrimaryKey(entityCustomer.getPrimaryKey());

        entityCustomerImpl.setClientId(entityCustomer.getClientId());
        entityCustomerImpl.setFirstName(entityCustomer.getFirstName());
        entityCustomerImpl.setLastName(entityCustomer.getLastName());
        entityCustomerImpl.setSecondLastName(entityCustomer.getSecondLastName());
        entityCustomerImpl.setEmail(entityCustomer.getEmail());
        entityCustomerImpl.setRfc(entityCustomer.getRfc());
        entityCustomerImpl.setCellPhone(entityCustomer.getCellPhone());
        entityCustomerImpl.setLegalPersonality(entityCustomer.getLegalPersonality());
        entityCustomerImpl.setPersonType(entityCustomer.getPersonType());
        entityCustomerImpl.setPhone(entityCustomer.getPhone());
        entityCustomerImpl.setRegistrationDate(entityCustomer.getRegistrationDate());
        entityCustomerImpl.setComments(entityCustomer.getComments());
        entityCustomerImpl.setDealerId(entityCustomer.getDealerId());
        entityCustomerImpl.setBusinessBrandName(entityCustomer.getBusinessBrandName());

        return entityCustomerImpl;
    }

    /**
     * Returns the entity customer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity customer
     * @return the entity customer
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityCustomerException, SystemException {
        EntityCustomer entityCustomer = fetchByPrimaryKey(primaryKey);

        if (entityCustomer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityCustomer;
    }

    /**
     * Returns the entity customer with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityCustomerException} if it could not be found.
     *
     * @param clientId the primary key of the entity customer
     * @return the entity customer
     * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer findByPrimaryKey(int clientId)
        throws NoSuchEntityCustomerException, SystemException {
        return findByPrimaryKey((Serializable) clientId);
    }

    /**
     * Returns the entity customer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity customer
     * @return the entity customer, or <code>null</code> if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityCustomer entityCustomer = (EntityCustomer) EntityCacheUtil.getResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
                EntityCustomerImpl.class, primaryKey);

        if (entityCustomer == _nullEntityCustomer) {
            return null;
        }

        if (entityCustomer == null) {
            Session session = null;

            try {
                session = openSession();

                entityCustomer = (EntityCustomer) session.get(EntityCustomerImpl.class,
                        primaryKey);

                if (entityCustomer != null) {
                    cacheResult(entityCustomer);
                } else {
                    EntityCacheUtil.putResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
                        EntityCustomerImpl.class, primaryKey,
                        _nullEntityCustomer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityCustomerModelImpl.ENTITY_CACHE_ENABLED,
                    EntityCustomerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityCustomer;
    }

    /**
     * Returns the entity customer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param clientId the primary key of the entity customer
     * @return the entity customer, or <code>null</code> if a entity customer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityCustomer fetchByPrimaryKey(int clientId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) clientId);
    }

    /**
     * Returns all the entity customers.
     *
     * @return the entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityCustomer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity customers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity customers
     * @param end the upper bound of the range of entity customers (not inclusive)
     * @return the range of entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityCustomer> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity customers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity customers
     * @param end the upper bound of the range of entity customers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity customers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityCustomer> findAll(int start, int end,
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

        List<EntityCustomer> list = (List<EntityCustomer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYCUSTOMER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYCUSTOMER;

                if (pagination) {
                    sql = sql.concat(EntityCustomerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityCustomer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityCustomer>(list);
                } else {
                    list = (List<EntityCustomer>) QueryUtil.list(q,
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
     * Removes all the entity customers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityCustomer entityCustomer : findAll()) {
            remove(entityCustomer);
        }
    }

    /**
     * Returns the number of entity customers.
     *
     * @return the number of entity customers
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYCUSTOMER);

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
     * Initializes the entity customer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityCustomer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityCustomer>> listenersList = new ArrayList<ModelListener<EntityCustomer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityCustomer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityCustomerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
