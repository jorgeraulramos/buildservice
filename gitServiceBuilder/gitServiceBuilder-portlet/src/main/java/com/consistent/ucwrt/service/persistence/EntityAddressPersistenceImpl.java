package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityAddressException;
import com.consistent.ucwrt.model.EntityAddress;
import com.consistent.ucwrt.model.impl.EntityAddressImpl;
import com.consistent.ucwrt.model.impl.EntityAddressModelImpl;
import com.consistent.ucwrt.service.persistence.EntityAddressPersistence;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entity address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddressPersistence
 * @see EntityAddressUtil
 * @generated
 */
public class EntityAddressPersistenceImpl extends BasePersistenceImpl<EntityAddress>
    implements EntityAddressPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityAddressUtil} to access the entity address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityAddressImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressModelImpl.FINDER_CACHE_ENABLED,
            EntityAddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressModelImpl.FINDER_CACHE_ENABLED,
            EntityAddressImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ADDRESSBYCLIENTID =
        new FinderPath(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressModelImpl.FINDER_CACHE_ENABLED,
            EntityAddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByAddressByClientId",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSBYCLIENTID =
        new FinderPath(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressModelImpl.FINDER_CACHE_ENABLED,
            EntityAddressImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByAddressByClientId",
            new String[] { Integer.class.getName() },
            EntityAddressModelImpl.CLIENTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ADDRESSBYCLIENTID = new FinderPath(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByAddressByClientId", new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_ADDRESSBYCLIENTID_CLIENTID_2 = "entityAddress.clientId = ?";
    private static final String _SQL_SELECT_ENTITYADDRESS = "SELECT entityAddress FROM EntityAddress entityAddress";
    private static final String _SQL_SELECT_ENTITYADDRESS_WHERE = "SELECT entityAddress FROM EntityAddress entityAddress WHERE ";
    private static final String _SQL_COUNT_ENTITYADDRESS = "SELECT COUNT(entityAddress) FROM EntityAddress entityAddress";
    private static final String _SQL_COUNT_ENTITYADDRESS_WHERE = "SELECT COUNT(entityAddress) FROM EntityAddress entityAddress WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityAddress.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityAddress exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityAddress exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityAddressPersistenceImpl.class);
    private static EntityAddress _nullEntityAddress = new EntityAddressImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityAddress> toCacheModel() {
                return _nullEntityAddressCacheModel;
            }
        };

    private static CacheModel<EntityAddress> _nullEntityAddressCacheModel = new CacheModel<EntityAddress>() {
            @Override
            public EntityAddress toEntityModel() {
                return _nullEntityAddress;
            }
        };

    public EntityAddressPersistenceImpl() {
        setModelClass(EntityAddress.class);
    }

    /**
     * Returns all the entity addresses where clientId = &#63;.
     *
     * @param clientId the client ID
     * @return the matching entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityAddress> findByAddressByClientId(int clientId)
        throws SystemException {
        return findByAddressByClientId(clientId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity addresses where clientId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param clientId the client ID
     * @param start the lower bound of the range of entity addresses
     * @param end the upper bound of the range of entity addresses (not inclusive)
     * @return the range of matching entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityAddress> findByAddressByClientId(int clientId, int start,
        int end) throws SystemException {
        return findByAddressByClientId(clientId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity addresses where clientId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param clientId the client ID
     * @param start the lower bound of the range of entity addresses
     * @param end the upper bound of the range of entity addresses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityAddress> findByAddressByClientId(int clientId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSBYCLIENTID;
            finderArgs = new Object[] { clientId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ADDRESSBYCLIENTID;
            finderArgs = new Object[] { clientId, start, end, orderByComparator };
        }

        List<EntityAddress> list = (List<EntityAddress>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityAddress entityAddress : list) {
                if ((clientId != entityAddress.getClientId())) {
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

            query.append(_SQL_SELECT_ENTITYADDRESS_WHERE);

            query.append(_FINDER_COLUMN_ADDRESSBYCLIENTID_CLIENTID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityAddressModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(clientId);

                if (!pagination) {
                    list = (List<EntityAddress>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityAddress>(list);
                } else {
                    list = (List<EntityAddress>) QueryUtil.list(q,
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
     * Returns the first entity address in the ordered set where clientId = &#63;.
     *
     * @param clientId the client ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity address
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a matching entity address could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress findByAddressByClientId_First(int clientId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityAddressException, SystemException {
        EntityAddress entityAddress = fetchByAddressByClientId_First(clientId,
                orderByComparator);

        if (entityAddress != null) {
            return entityAddress;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("clientId=");
        msg.append(clientId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityAddressException(msg.toString());
    }

    /**
     * Returns the first entity address in the ordered set where clientId = &#63;.
     *
     * @param clientId the client ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity address, or <code>null</code> if a matching entity address could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress fetchByAddressByClientId_First(int clientId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityAddress> list = findByAddressByClientId(clientId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity address in the ordered set where clientId = &#63;.
     *
     * @param clientId the client ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity address
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a matching entity address could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress findByAddressByClientId_Last(int clientId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityAddressException, SystemException {
        EntityAddress entityAddress = fetchByAddressByClientId_Last(clientId,
                orderByComparator);

        if (entityAddress != null) {
            return entityAddress;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("clientId=");
        msg.append(clientId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityAddressException(msg.toString());
    }

    /**
     * Returns the last entity address in the ordered set where clientId = &#63;.
     *
     * @param clientId the client ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity address, or <code>null</code> if a matching entity address could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress fetchByAddressByClientId_Last(int clientId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByAddressByClientId(clientId);

        if (count == 0) {
            return null;
        }

        List<EntityAddress> list = findByAddressByClientId(clientId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity addresses before and after the current entity address in the ordered set where clientId = &#63;.
     *
     * @param addressId the primary key of the current entity address
     * @param clientId the client ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity address
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress[] findByAddressByClientId_PrevAndNext(int addressId,
        int clientId, OrderByComparator orderByComparator)
        throws NoSuchEntityAddressException, SystemException {
        EntityAddress entityAddress = findByPrimaryKey(addressId);

        Session session = null;

        try {
            session = openSession();

            EntityAddress[] array = new EntityAddressImpl[3];

            array[0] = getByAddressByClientId_PrevAndNext(session,
                    entityAddress, clientId, orderByComparator, true);

            array[1] = entityAddress;

            array[2] = getByAddressByClientId_PrevAndNext(session,
                    entityAddress, clientId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityAddress getByAddressByClientId_PrevAndNext(
        Session session, EntityAddress entityAddress, int clientId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYADDRESS_WHERE);

        query.append(_FINDER_COLUMN_ADDRESSBYCLIENTID_CLIENTID_2);

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
            query.append(EntityAddressModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(clientId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityAddress);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityAddress> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity addresses where clientId = &#63; from the database.
     *
     * @param clientId the client ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByAddressByClientId(int clientId)
        throws SystemException {
        for (EntityAddress entityAddress : findByAddressByClientId(clientId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityAddress);
        }
    }

    /**
     * Returns the number of entity addresses where clientId = &#63;.
     *
     * @param clientId the client ID
     * @return the number of matching entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByAddressByClientId(int clientId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ADDRESSBYCLIENTID;

        Object[] finderArgs = new Object[] { clientId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYADDRESS_WHERE);

            query.append(_FINDER_COLUMN_ADDRESSBYCLIENTID_CLIENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(clientId);

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
     * Caches the entity address in the entity cache if it is enabled.
     *
     * @param entityAddress the entity address
     */
    @Override
    public void cacheResult(EntityAddress entityAddress) {
        EntityCacheUtil.putResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressImpl.class, entityAddress.getPrimaryKey(),
            entityAddress);

        entityAddress.resetOriginalValues();
    }

    /**
     * Caches the entity addresses in the entity cache if it is enabled.
     *
     * @param entityAddresses the entity addresses
     */
    @Override
    public void cacheResult(List<EntityAddress> entityAddresses) {
        for (EntityAddress entityAddress : entityAddresses) {
            if (EntityCacheUtil.getResult(
                        EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
                        EntityAddressImpl.class, entityAddress.getPrimaryKey()) == null) {
                cacheResult(entityAddress);
            } else {
                entityAddress.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity addresses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityAddressImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityAddressImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity address.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityAddress entityAddress) {
        EntityCacheUtil.removeResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressImpl.class, entityAddress.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityAddress> entityAddresses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityAddress entityAddress : entityAddresses) {
            EntityCacheUtil.removeResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
                EntityAddressImpl.class, entityAddress.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity address with the primary key. Does not add the entity address to the database.
     *
     * @param addressId the primary key for the new entity address
     * @return the new entity address
     */
    @Override
    public EntityAddress create(int addressId) {
        EntityAddress entityAddress = new EntityAddressImpl();

        entityAddress.setNew(true);
        entityAddress.setPrimaryKey(addressId);

        return entityAddress;
    }

    /**
     * Removes the entity address with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param addressId the primary key of the entity address
     * @return the entity address that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress remove(int addressId)
        throws NoSuchEntityAddressException, SystemException {
        return remove((Serializable) addressId);
    }

    /**
     * Removes the entity address with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity address
     * @return the entity address that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress remove(Serializable primaryKey)
        throws NoSuchEntityAddressException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityAddress entityAddress = (EntityAddress) session.get(EntityAddressImpl.class,
                    primaryKey);

            if (entityAddress == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityAddress);
        } catch (NoSuchEntityAddressException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityAddress removeImpl(EntityAddress entityAddress)
        throws SystemException {
        entityAddress = toUnwrappedModel(entityAddress);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityAddress)) {
                entityAddress = (EntityAddress) session.get(EntityAddressImpl.class,
                        entityAddress.getPrimaryKeyObj());
            }

            if (entityAddress != null) {
                session.delete(entityAddress);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityAddress != null) {
            clearCache(entityAddress);
        }

        return entityAddress;
    }

    @Override
    public EntityAddress updateImpl(
        com.consistent.ucwrt.model.EntityAddress entityAddress)
        throws SystemException {
        entityAddress = toUnwrappedModel(entityAddress);

        boolean isNew = entityAddress.isNew();

        EntityAddressModelImpl entityAddressModelImpl = (EntityAddressModelImpl) entityAddress;

        Session session = null;

        try {
            session = openSession();

            if (entityAddress.isNew()) {
                session.save(entityAddress);

                entityAddress.setNew(false);
            } else {
                session.merge(entityAddress);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityAddressModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityAddressModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSBYCLIENTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityAddressModelImpl.getOriginalClientId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ADDRESSBYCLIENTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSBYCLIENTID,
                    args);

                args = new Object[] { entityAddressModelImpl.getClientId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ADDRESSBYCLIENTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSBYCLIENTID,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
            EntityAddressImpl.class, entityAddress.getPrimaryKey(),
            entityAddress);

        return entityAddress;
    }

    protected EntityAddress toUnwrappedModel(EntityAddress entityAddress) {
        if (entityAddress instanceof EntityAddressImpl) {
            return entityAddress;
        }

        EntityAddressImpl entityAddressImpl = new EntityAddressImpl();

        entityAddressImpl.setNew(entityAddress.isNew());
        entityAddressImpl.setPrimaryKey(entityAddress.getPrimaryKey());

        entityAddressImpl.setAddressId(entityAddress.getAddressId());
        entityAddressImpl.setStreet(entityAddress.getStreet());
        entityAddressImpl.setInteriorNumber(entityAddress.getInteriorNumber());
        entityAddressImpl.setExteriorNumber(entityAddress.getExteriorNumber());
        entityAddressImpl.setClientId(entityAddress.getClientId());
        entityAddressImpl.setMunicipalId(entityAddress.getMunicipalId());
        entityAddressImpl.setStateId(entityAddress.getStateId());
        entityAddressImpl.setSuburbId(entityAddress.getSuburbId());

        return entityAddressImpl;
    }

    /**
     * Returns the entity address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity address
     * @return the entity address
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityAddressException, SystemException {
        EntityAddress entityAddress = fetchByPrimaryKey(primaryKey);

        if (entityAddress == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityAddress;
    }

    /**
     * Returns the entity address with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityAddressException} if it could not be found.
     *
     * @param addressId the primary key of the entity address
     * @return the entity address
     * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress findByPrimaryKey(int addressId)
        throws NoSuchEntityAddressException, SystemException {
        return findByPrimaryKey((Serializable) addressId);
    }

    /**
     * Returns the entity address with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity address
     * @return the entity address, or <code>null</code> if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityAddress entityAddress = (EntityAddress) EntityCacheUtil.getResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
                EntityAddressImpl.class, primaryKey);

        if (entityAddress == _nullEntityAddress) {
            return null;
        }

        if (entityAddress == null) {
            Session session = null;

            try {
                session = openSession();

                entityAddress = (EntityAddress) session.get(EntityAddressImpl.class,
                        primaryKey);

                if (entityAddress != null) {
                    cacheResult(entityAddress);
                } else {
                    EntityCacheUtil.putResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
                        EntityAddressImpl.class, primaryKey, _nullEntityAddress);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityAddressModelImpl.ENTITY_CACHE_ENABLED,
                    EntityAddressImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityAddress;
    }

    /**
     * Returns the entity address with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param addressId the primary key of the entity address
     * @return the entity address, or <code>null</code> if a entity address with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityAddress fetchByPrimaryKey(int addressId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) addressId);
    }

    /**
     * Returns all the entity addresses.
     *
     * @return the entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityAddress> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity addresses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity addresses
     * @param end the upper bound of the range of entity addresses (not inclusive)
     * @return the range of entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityAddress> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity addresses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity addresses
     * @param end the upper bound of the range of entity addresses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity addresses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityAddress> findAll(int start, int end,
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

        List<EntityAddress> list = (List<EntityAddress>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYADDRESS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYADDRESS;

                if (pagination) {
                    sql = sql.concat(EntityAddressModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityAddress>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityAddress>(list);
                } else {
                    list = (List<EntityAddress>) QueryUtil.list(q,
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
     * Removes all the entity addresses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityAddress entityAddress : findAll()) {
            remove(entityAddress);
        }
    }

    /**
     * Returns the number of entity addresses.
     *
     * @return the number of entity addresses
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYADDRESS);

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
     * Initializes the entity address persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityAddress")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityAddress>> listenersList = new ArrayList<ModelListener<EntityAddress>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityAddress>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityAddressImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
