package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntitySuburbException;
import com.consistent.ucwrt.model.EntitySuburb;
import com.consistent.ucwrt.model.impl.EntitySuburbImpl;
import com.consistent.ucwrt.model.impl.EntitySuburbModelImpl;
import com.consistent.ucwrt.service.persistence.EntitySuburbPersistence;

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
 * The persistence implementation for the entity suburb service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburbPersistence
 * @see EntitySuburbUtil
 * @generated
 */
public class EntitySuburbPersistenceImpl extends BasePersistenceImpl<EntitySuburb>
    implements EntitySuburbPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntitySuburbUtil} to access the entity suburb persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntitySuburbImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, EntitySuburbImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, EntitySuburbImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBURBBYSTATE =
        new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, EntitySuburbImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySuburbByState",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBURBBYSTATE =
        new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, EntitySuburbImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySuburbByState",
            new String[] { Integer.class.getName() },
            EntitySuburbModelImpl.MUNICIPALID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SUBURBBYSTATE = new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySuburbByState",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_SUBURBBYSTATE_MUNICIPALID_2 = "entitySuburb.municipalId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POSTALCODEBYSUBURB =
        new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, EntitySuburbImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPostalCodeBySuburb",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSTALCODEBYSUBURB =
        new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, EntitySuburbImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByPostalCodeBySuburb",
            new String[] { Integer.class.getName() },
            EntitySuburbModelImpl.SUBURBID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_POSTALCODEBYSUBURB = new FinderPath(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPostalCodeBySuburb",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_POSTALCODEBYSUBURB_SUBURBID_2 = "entitySuburb.suburbId = ?";
    private static final String _SQL_SELECT_ENTITYSUBURB = "SELECT entitySuburb FROM EntitySuburb entitySuburb";
    private static final String _SQL_SELECT_ENTITYSUBURB_WHERE = "SELECT entitySuburb FROM EntitySuburb entitySuburb WHERE ";
    private static final String _SQL_COUNT_ENTITYSUBURB = "SELECT COUNT(entitySuburb) FROM EntitySuburb entitySuburb";
    private static final String _SQL_COUNT_ENTITYSUBURB_WHERE = "SELECT COUNT(entitySuburb) FROM EntitySuburb entitySuburb WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entitySuburb.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntitySuburb exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntitySuburb exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntitySuburbPersistenceImpl.class);
    private static EntitySuburb _nullEntitySuburb = new EntitySuburbImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntitySuburb> toCacheModel() {
                return _nullEntitySuburbCacheModel;
            }
        };

    private static CacheModel<EntitySuburb> _nullEntitySuburbCacheModel = new CacheModel<EntitySuburb>() {
            @Override
            public EntitySuburb toEntityModel() {
                return _nullEntitySuburb;
            }
        };

    public EntitySuburbPersistenceImpl() {
        setModelClass(EntitySuburb.class);
    }

    /**
     * Returns all the entity suburbs where municipalId = &#63;.
     *
     * @param municipalId the municipal ID
     * @return the matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findBySuburbByState(int municipalId)
        throws SystemException {
        return findBySuburbByState(municipalId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity suburbs where municipalId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param municipalId the municipal ID
     * @param start the lower bound of the range of entity suburbs
     * @param end the upper bound of the range of entity suburbs (not inclusive)
     * @return the range of matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findBySuburbByState(int municipalId, int start,
        int end) throws SystemException {
        return findBySuburbByState(municipalId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity suburbs where municipalId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param municipalId the municipal ID
     * @param start the lower bound of the range of entity suburbs
     * @param end the upper bound of the range of entity suburbs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findBySuburbByState(int municipalId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBURBBYSTATE;
            finderArgs = new Object[] { municipalId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBURBBYSTATE;
            finderArgs = new Object[] { municipalId, start, end, orderByComparator };
        }

        List<EntitySuburb> list = (List<EntitySuburb>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntitySuburb entitySuburb : list) {
                if ((municipalId != entitySuburb.getMunicipalId())) {
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

            query.append(_SQL_SELECT_ENTITYSUBURB_WHERE);

            query.append(_FINDER_COLUMN_SUBURBBYSTATE_MUNICIPALID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntitySuburbModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(municipalId);

                if (!pagination) {
                    list = (List<EntitySuburb>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntitySuburb>(list);
                } else {
                    list = (List<EntitySuburb>) QueryUtil.list(q, getDialect(),
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
     * Returns the first entity suburb in the ordered set where municipalId = &#63;.
     *
     * @param municipalId the municipal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb findBySuburbByState_First(int municipalId,
        OrderByComparator orderByComparator)
        throws NoSuchEntitySuburbException, SystemException {
        EntitySuburb entitySuburb = fetchBySuburbByState_First(municipalId,
                orderByComparator);

        if (entitySuburb != null) {
            return entitySuburb;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("municipalId=");
        msg.append(municipalId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntitySuburbException(msg.toString());
    }

    /**
     * Returns the first entity suburb in the ordered set where municipalId = &#63;.
     *
     * @param municipalId the municipal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb fetchBySuburbByState_First(int municipalId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntitySuburb> list = findBySuburbByState(municipalId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity suburb in the ordered set where municipalId = &#63;.
     *
     * @param municipalId the municipal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb findBySuburbByState_Last(int municipalId,
        OrderByComparator orderByComparator)
        throws NoSuchEntitySuburbException, SystemException {
        EntitySuburb entitySuburb = fetchBySuburbByState_Last(municipalId,
                orderByComparator);

        if (entitySuburb != null) {
            return entitySuburb;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("municipalId=");
        msg.append(municipalId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntitySuburbException(msg.toString());
    }

    /**
     * Returns the last entity suburb in the ordered set where municipalId = &#63;.
     *
     * @param municipalId the municipal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb fetchBySuburbByState_Last(int municipalId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBySuburbByState(municipalId);

        if (count == 0) {
            return null;
        }

        List<EntitySuburb> list = findBySuburbByState(municipalId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity suburbs before and after the current entity suburb in the ordered set where municipalId = &#63;.
     *
     * @param suburbId the primary key of the current entity suburb
     * @param municipalId the municipal ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb[] findBySuburbByState_PrevAndNext(int suburbId,
        int municipalId, OrderByComparator orderByComparator)
        throws NoSuchEntitySuburbException, SystemException {
        EntitySuburb entitySuburb = findByPrimaryKey(suburbId);

        Session session = null;

        try {
            session = openSession();

            EntitySuburb[] array = new EntitySuburbImpl[3];

            array[0] = getBySuburbByState_PrevAndNext(session, entitySuburb,
                    municipalId, orderByComparator, true);

            array[1] = entitySuburb;

            array[2] = getBySuburbByState_PrevAndNext(session, entitySuburb,
                    municipalId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntitySuburb getBySuburbByState_PrevAndNext(Session session,
        EntitySuburb entitySuburb, int municipalId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYSUBURB_WHERE);

        query.append(_FINDER_COLUMN_SUBURBBYSTATE_MUNICIPALID_2);

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
            query.append(EntitySuburbModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(municipalId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entitySuburb);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntitySuburb> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity suburbs where municipalId = &#63; from the database.
     *
     * @param municipalId the municipal ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBySuburbByState(int municipalId)
        throws SystemException {
        for (EntitySuburb entitySuburb : findBySuburbByState(municipalId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entitySuburb);
        }
    }

    /**
     * Returns the number of entity suburbs where municipalId = &#63;.
     *
     * @param municipalId the municipal ID
     * @return the number of matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBySuburbByState(int municipalId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SUBURBBYSTATE;

        Object[] finderArgs = new Object[] { municipalId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYSUBURB_WHERE);

            query.append(_FINDER_COLUMN_SUBURBBYSTATE_MUNICIPALID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(municipalId);

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
     * Returns all the entity suburbs where suburbId = &#63;.
     *
     * @param suburbId the suburb ID
     * @return the matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findByPostalCodeBySuburb(int suburbId)
        throws SystemException {
        return findByPostalCodeBySuburb(suburbId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity suburbs where suburbId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param suburbId the suburb ID
     * @param start the lower bound of the range of entity suburbs
     * @param end the upper bound of the range of entity suburbs (not inclusive)
     * @return the range of matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findByPostalCodeBySuburb(int suburbId, int start,
        int end) throws SystemException {
        return findByPostalCodeBySuburb(suburbId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity suburbs where suburbId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param suburbId the suburb ID
     * @param start the lower bound of the range of entity suburbs
     * @param end the upper bound of the range of entity suburbs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findByPostalCodeBySuburb(int suburbId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSTALCODEBYSUBURB;
            finderArgs = new Object[] { suburbId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POSTALCODEBYSUBURB;
            finderArgs = new Object[] { suburbId, start, end, orderByComparator };
        }

        List<EntitySuburb> list = (List<EntitySuburb>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntitySuburb entitySuburb : list) {
                if ((suburbId != entitySuburb.getSuburbId())) {
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

            query.append(_SQL_SELECT_ENTITYSUBURB_WHERE);

            query.append(_FINDER_COLUMN_POSTALCODEBYSUBURB_SUBURBID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntitySuburbModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(suburbId);

                if (!pagination) {
                    list = (List<EntitySuburb>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntitySuburb>(list);
                } else {
                    list = (List<EntitySuburb>) QueryUtil.list(q, getDialect(),
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
     * Returns the first entity suburb in the ordered set where suburbId = &#63;.
     *
     * @param suburbId the suburb ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb findByPostalCodeBySuburb_First(int suburbId,
        OrderByComparator orderByComparator)
        throws NoSuchEntitySuburbException, SystemException {
        EntitySuburb entitySuburb = fetchByPostalCodeBySuburb_First(suburbId,
                orderByComparator);

        if (entitySuburb != null) {
            return entitySuburb;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("suburbId=");
        msg.append(suburbId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntitySuburbException(msg.toString());
    }

    /**
     * Returns the first entity suburb in the ordered set where suburbId = &#63;.
     *
     * @param suburbId the suburb ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb fetchByPostalCodeBySuburb_First(int suburbId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntitySuburb> list = findByPostalCodeBySuburb(suburbId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity suburb in the ordered set where suburbId = &#63;.
     *
     * @param suburbId the suburb ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb findByPostalCodeBySuburb_Last(int suburbId,
        OrderByComparator orderByComparator)
        throws NoSuchEntitySuburbException, SystemException {
        EntitySuburb entitySuburb = fetchByPostalCodeBySuburb_Last(suburbId,
                orderByComparator);

        if (entitySuburb != null) {
            return entitySuburb;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("suburbId=");
        msg.append(suburbId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntitySuburbException(msg.toString());
    }

    /**
     * Returns the last entity suburb in the ordered set where suburbId = &#63;.
     *
     * @param suburbId the suburb ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb fetchByPostalCodeBySuburb_Last(int suburbId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPostalCodeBySuburb(suburbId);

        if (count == 0) {
            return null;
        }

        List<EntitySuburb> list = findByPostalCodeBySuburb(suburbId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the entity suburbs where suburbId = &#63; from the database.
     *
     * @param suburbId the suburb ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPostalCodeBySuburb(int suburbId)
        throws SystemException {
        for (EntitySuburb entitySuburb : findByPostalCodeBySuburb(suburbId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entitySuburb);
        }
    }

    /**
     * Returns the number of entity suburbs where suburbId = &#63;.
     *
     * @param suburbId the suburb ID
     * @return the number of matching entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPostalCodeBySuburb(int suburbId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_POSTALCODEBYSUBURB;

        Object[] finderArgs = new Object[] { suburbId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYSUBURB_WHERE);

            query.append(_FINDER_COLUMN_POSTALCODEBYSUBURB_SUBURBID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(suburbId);

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
     * Caches the entity suburb in the entity cache if it is enabled.
     *
     * @param entitySuburb the entity suburb
     */
    @Override
    public void cacheResult(EntitySuburb entitySuburb) {
        EntityCacheUtil.putResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbImpl.class, entitySuburb.getPrimaryKey(), entitySuburb);

        entitySuburb.resetOriginalValues();
    }

    /**
     * Caches the entity suburbs in the entity cache if it is enabled.
     *
     * @param entitySuburbs the entity suburbs
     */
    @Override
    public void cacheResult(List<EntitySuburb> entitySuburbs) {
        for (EntitySuburb entitySuburb : entitySuburbs) {
            if (EntityCacheUtil.getResult(
                        EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySuburbImpl.class, entitySuburb.getPrimaryKey()) == null) {
                cacheResult(entitySuburb);
            } else {
                entitySuburb.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity suburbs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntitySuburbImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntitySuburbImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity suburb.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntitySuburb entitySuburb) {
        EntityCacheUtil.removeResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbImpl.class, entitySuburb.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntitySuburb> entitySuburbs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntitySuburb entitySuburb : entitySuburbs) {
            EntityCacheUtil.removeResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
                EntitySuburbImpl.class, entitySuburb.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity suburb with the primary key. Does not add the entity suburb to the database.
     *
     * @param suburbId the primary key for the new entity suburb
     * @return the new entity suburb
     */
    @Override
    public EntitySuburb create(int suburbId) {
        EntitySuburb entitySuburb = new EntitySuburbImpl();

        entitySuburb.setNew(true);
        entitySuburb.setPrimaryKey(suburbId);

        return entitySuburb;
    }

    /**
     * Removes the entity suburb with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param suburbId the primary key of the entity suburb
     * @return the entity suburb that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb remove(int suburbId)
        throws NoSuchEntitySuburbException, SystemException {
        return remove((Serializable) suburbId);
    }

    /**
     * Removes the entity suburb with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity suburb
     * @return the entity suburb that was removed
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb remove(Serializable primaryKey)
        throws NoSuchEntitySuburbException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntitySuburb entitySuburb = (EntitySuburb) session.get(EntitySuburbImpl.class,
                    primaryKey);

            if (entitySuburb == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntitySuburbException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entitySuburb);
        } catch (NoSuchEntitySuburbException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntitySuburb removeImpl(EntitySuburb entitySuburb)
        throws SystemException {
        entitySuburb = toUnwrappedModel(entitySuburb);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entitySuburb)) {
                entitySuburb = (EntitySuburb) session.get(EntitySuburbImpl.class,
                        entitySuburb.getPrimaryKeyObj());
            }

            if (entitySuburb != null) {
                session.delete(entitySuburb);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entitySuburb != null) {
            clearCache(entitySuburb);
        }

        return entitySuburb;
    }

    @Override
    public EntitySuburb updateImpl(
        com.consistent.ucwrt.model.EntitySuburb entitySuburb)
        throws SystemException {
        entitySuburb = toUnwrappedModel(entitySuburb);

        boolean isNew = entitySuburb.isNew();

        EntitySuburbModelImpl entitySuburbModelImpl = (EntitySuburbModelImpl) entitySuburb;

        Session session = null;

        try {
            session = openSession();

            if (entitySuburb.isNew()) {
                session.save(entitySuburb);

                entitySuburb.setNew(false);
            } else {
                session.merge(entitySuburb);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntitySuburbModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entitySuburbModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBURBBYSTATE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entitySuburbModelImpl.getOriginalMunicipalId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBURBBYSTATE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBURBBYSTATE,
                    args);

                args = new Object[] { entitySuburbModelImpl.getMunicipalId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBURBBYSTATE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBURBBYSTATE,
                    args);
            }

            if ((entitySuburbModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSTALCODEBYSUBURB.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entitySuburbModelImpl.getOriginalSuburbId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSTALCODEBYSUBURB,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSTALCODEBYSUBURB,
                    args);

                args = new Object[] { entitySuburbModelImpl.getSuburbId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSTALCODEBYSUBURB,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSTALCODEBYSUBURB,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
            EntitySuburbImpl.class, entitySuburb.getPrimaryKey(), entitySuburb);

        return entitySuburb;
    }

    protected EntitySuburb toUnwrappedModel(EntitySuburb entitySuburb) {
        if (entitySuburb instanceof EntitySuburbImpl) {
            return entitySuburb;
        }

        EntitySuburbImpl entitySuburbImpl = new EntitySuburbImpl();

        entitySuburbImpl.setNew(entitySuburb.isNew());
        entitySuburbImpl.setPrimaryKey(entitySuburb.getPrimaryKey());

        entitySuburbImpl.setSuburbId(entitySuburb.getSuburbId());
        entitySuburbImpl.setSuburbName(entitySuburb.getSuburbName());
        entitySuburbImpl.setPostalCode(entitySuburb.getPostalCode());
        entitySuburbImpl.setMunicipalId(entitySuburb.getMunicipalId());

        return entitySuburbImpl;
    }

    /**
     * Returns the entity suburb with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity suburb
     * @return the entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntitySuburbException, SystemException {
        EntitySuburb entitySuburb = fetchByPrimaryKey(primaryKey);

        if (entitySuburb == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntitySuburbException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entitySuburb;
    }

    /**
     * Returns the entity suburb with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySuburbException} if it could not be found.
     *
     * @param suburbId the primary key of the entity suburb
     * @return the entity suburb
     * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb findByPrimaryKey(int suburbId)
        throws NoSuchEntitySuburbException, SystemException {
        return findByPrimaryKey((Serializable) suburbId);
    }

    /**
     * Returns the entity suburb with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity suburb
     * @return the entity suburb, or <code>null</code> if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntitySuburb entitySuburb = (EntitySuburb) EntityCacheUtil.getResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
                EntitySuburbImpl.class, primaryKey);

        if (entitySuburb == _nullEntitySuburb) {
            return null;
        }

        if (entitySuburb == null) {
            Session session = null;

            try {
                session = openSession();

                entitySuburb = (EntitySuburb) session.get(EntitySuburbImpl.class,
                        primaryKey);

                if (entitySuburb != null) {
                    cacheResult(entitySuburb);
                } else {
                    EntityCacheUtil.putResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
                        EntitySuburbImpl.class, primaryKey, _nullEntitySuburb);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntitySuburbModelImpl.ENTITY_CACHE_ENABLED,
                    EntitySuburbImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entitySuburb;
    }

    /**
     * Returns the entity suburb with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param suburbId the primary key of the entity suburb
     * @return the entity suburb, or <code>null</code> if a entity suburb with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntitySuburb fetchByPrimaryKey(int suburbId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) suburbId);
    }

    /**
     * Returns all the entity suburbs.
     *
     * @return the entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity suburbs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity suburbs
     * @param end the upper bound of the range of entity suburbs (not inclusive)
     * @return the range of entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity suburbs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity suburbs
     * @param end the upper bound of the range of entity suburbs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity suburbs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntitySuburb> findAll(int start, int end,
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

        List<EntitySuburb> list = (List<EntitySuburb>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYSUBURB);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYSUBURB;

                if (pagination) {
                    sql = sql.concat(EntitySuburbModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntitySuburb>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntitySuburb>(list);
                } else {
                    list = (List<EntitySuburb>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity suburbs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntitySuburb entitySuburb : findAll()) {
            remove(entitySuburb);
        }
    }

    /**
     * Returns the number of entity suburbs.
     *
     * @return the number of entity suburbs
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYSUBURB);

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
     * Initializes the entity suburb persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntitySuburb")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntitySuburb>> listenersList = new ArrayList<ModelListener<EntitySuburb>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntitySuburb>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntitySuburbImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
