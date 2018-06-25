package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityMunicipalityException;
import com.consistent.ucwrt.model.EntityMunicipality;
import com.consistent.ucwrt.model.impl.EntityMunicipalityImpl;
import com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl;
import com.consistent.ucwrt.service.persistence.EntityMunicipalityPersistence;

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
 * The persistence implementation for the entity municipality service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMunicipalityPersistence
 * @see EntityMunicipalityUtil
 * @generated
 */
public class EntityMunicipalityPersistenceImpl extends BasePersistenceImpl<EntityMunicipality>
    implements EntityMunicipalityPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityMunicipalityUtil} to access the entity municipality persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityMunicipalityImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityModelImpl.FINDER_CACHE_ENABLED,
            EntityMunicipalityImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityModelImpl.FINDER_CACHE_ENABLED,
            EntityMunicipalityImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE =
        new FinderPath(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityModelImpl.FINDER_CACHE_ENABLED,
            EntityMunicipalityImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByMunicipalityByState",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE =
        new FinderPath(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityModelImpl.FINDER_CACHE_ENABLED,
            EntityMunicipalityImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByMunicipalityByState",
            new String[] { Integer.class.getName() },
            EntityMunicipalityModelImpl.STATEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MUNICIPALITYBYSTATE = new FinderPath(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByMunicipalityByState",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_MUNICIPALITYBYSTATE_STATEID_2 = "entityMunicipality.stateId = ?";
    private static final String _SQL_SELECT_ENTITYMUNICIPALITY = "SELECT entityMunicipality FROM EntityMunicipality entityMunicipality";
    private static final String _SQL_SELECT_ENTITYMUNICIPALITY_WHERE = "SELECT entityMunicipality FROM EntityMunicipality entityMunicipality WHERE ";
    private static final String _SQL_COUNT_ENTITYMUNICIPALITY = "SELECT COUNT(entityMunicipality) FROM EntityMunicipality entityMunicipality";
    private static final String _SQL_COUNT_ENTITYMUNICIPALITY_WHERE = "SELECT COUNT(entityMunicipality) FROM EntityMunicipality entityMunicipality WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityMunicipality.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityMunicipality exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityMunicipality exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityMunicipalityPersistenceImpl.class);
    private static EntityMunicipality _nullEntityMunicipality = new EntityMunicipalityImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityMunicipality> toCacheModel() {
                return _nullEntityMunicipalityCacheModel;
            }
        };

    private static CacheModel<EntityMunicipality> _nullEntityMunicipalityCacheModel =
        new CacheModel<EntityMunicipality>() {
            @Override
            public EntityMunicipality toEntityModel() {
                return _nullEntityMunicipality;
            }
        };

    public EntityMunicipalityPersistenceImpl() {
        setModelClass(EntityMunicipality.class);
    }

    /**
     * Returns all the entity municipalities where stateId = &#63;.
     *
     * @param stateId the state ID
     * @return the matching entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMunicipality> findByMunicipalityByState(int stateId)
        throws SystemException {
        return findByMunicipalityByState(stateId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity municipalities where stateId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stateId the state ID
     * @param start the lower bound of the range of entity municipalities
     * @param end the upper bound of the range of entity municipalities (not inclusive)
     * @return the range of matching entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMunicipality> findByMunicipalityByState(int stateId,
        int start, int end) throws SystemException {
        return findByMunicipalityByState(stateId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity municipalities where stateId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stateId the state ID
     * @param start the lower bound of the range of entity municipalities
     * @param end the upper bound of the range of entity municipalities (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMunicipality> findByMunicipalityByState(int stateId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE;
            finderArgs = new Object[] { stateId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE;
            finderArgs = new Object[] { stateId, start, end, orderByComparator };
        }

        List<EntityMunicipality> list = (List<EntityMunicipality>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityMunicipality entityMunicipality : list) {
                if ((stateId != entityMunicipality.getStateId())) {
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

            query.append(_SQL_SELECT_ENTITYMUNICIPALITY_WHERE);

            query.append(_FINDER_COLUMN_MUNICIPALITYBYSTATE_STATEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityMunicipalityModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(stateId);

                if (!pagination) {
                    list = (List<EntityMunicipality>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityMunicipality>(list);
                } else {
                    list = (List<EntityMunicipality>) QueryUtil.list(q,
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
     * Returns the first entity municipality in the ordered set where stateId = &#63;.
     *
     * @param stateId the state ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity municipality
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a matching entity municipality could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality findByMunicipalityByState_First(int stateId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityMunicipalityException, SystemException {
        EntityMunicipality entityMunicipality = fetchByMunicipalityByState_First(stateId,
                orderByComparator);

        if (entityMunicipality != null) {
            return entityMunicipality;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stateId=");
        msg.append(stateId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityMunicipalityException(msg.toString());
    }

    /**
     * Returns the first entity municipality in the ordered set where stateId = &#63;.
     *
     * @param stateId the state ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity municipality, or <code>null</code> if a matching entity municipality could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality fetchByMunicipalityByState_First(int stateId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityMunicipality> list = findByMunicipalityByState(stateId, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity municipality in the ordered set where stateId = &#63;.
     *
     * @param stateId the state ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity municipality
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a matching entity municipality could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality findByMunicipalityByState_Last(int stateId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityMunicipalityException, SystemException {
        EntityMunicipality entityMunicipality = fetchByMunicipalityByState_Last(stateId,
                orderByComparator);

        if (entityMunicipality != null) {
            return entityMunicipality;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stateId=");
        msg.append(stateId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityMunicipalityException(msg.toString());
    }

    /**
     * Returns the last entity municipality in the ordered set where stateId = &#63;.
     *
     * @param stateId the state ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity municipality, or <code>null</code> if a matching entity municipality could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality fetchByMunicipalityByState_Last(int stateId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByMunicipalityByState(stateId);

        if (count == 0) {
            return null;
        }

        List<EntityMunicipality> list = findByMunicipalityByState(stateId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity municipalities before and after the current entity municipality in the ordered set where stateId = &#63;.
     *
     * @param municipalId the primary key of the current entity municipality
     * @param stateId the state ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity municipality
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality[] findByMunicipalityByState_PrevAndNext(
        int municipalId, int stateId, OrderByComparator orderByComparator)
        throws NoSuchEntityMunicipalityException, SystemException {
        EntityMunicipality entityMunicipality = findByPrimaryKey(municipalId);

        Session session = null;

        try {
            session = openSession();

            EntityMunicipality[] array = new EntityMunicipalityImpl[3];

            array[0] = getByMunicipalityByState_PrevAndNext(session,
                    entityMunicipality, stateId, orderByComparator, true);

            array[1] = entityMunicipality;

            array[2] = getByMunicipalityByState_PrevAndNext(session,
                    entityMunicipality, stateId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityMunicipality getByMunicipalityByState_PrevAndNext(
        Session session, EntityMunicipality entityMunicipality, int stateId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYMUNICIPALITY_WHERE);

        query.append(_FINDER_COLUMN_MUNICIPALITYBYSTATE_STATEID_2);

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
            query.append(EntityMunicipalityModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(stateId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityMunicipality);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityMunicipality> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity municipalities where stateId = &#63; from the database.
     *
     * @param stateId the state ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByMunicipalityByState(int stateId)
        throws SystemException {
        for (EntityMunicipality entityMunicipality : findByMunicipalityByState(
                stateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityMunicipality);
        }
    }

    /**
     * Returns the number of entity municipalities where stateId = &#63;.
     *
     * @param stateId the state ID
     * @return the number of matching entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByMunicipalityByState(int stateId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_MUNICIPALITYBYSTATE;

        Object[] finderArgs = new Object[] { stateId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYMUNICIPALITY_WHERE);

            query.append(_FINDER_COLUMN_MUNICIPALITYBYSTATE_STATEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(stateId);

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
     * Caches the entity municipality in the entity cache if it is enabled.
     *
     * @param entityMunicipality the entity municipality
     */
    @Override
    public void cacheResult(EntityMunicipality entityMunicipality) {
        EntityCacheUtil.putResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityImpl.class, entityMunicipality.getPrimaryKey(),
            entityMunicipality);

        entityMunicipality.resetOriginalValues();
    }

    /**
     * Caches the entity municipalities in the entity cache if it is enabled.
     *
     * @param entityMunicipalities the entity municipalities
     */
    @Override
    public void cacheResult(List<EntityMunicipality> entityMunicipalities) {
        for (EntityMunicipality entityMunicipality : entityMunicipalities) {
            if (EntityCacheUtil.getResult(
                        EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
                        EntityMunicipalityImpl.class,
                        entityMunicipality.getPrimaryKey()) == null) {
                cacheResult(entityMunicipality);
            } else {
                entityMunicipality.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity municipalities.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityMunicipalityImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityMunicipalityImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity municipality.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityMunicipality entityMunicipality) {
        EntityCacheUtil.removeResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityImpl.class, entityMunicipality.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityMunicipality> entityMunicipalities) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityMunicipality entityMunicipality : entityMunicipalities) {
            EntityCacheUtil.removeResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
                EntityMunicipalityImpl.class, entityMunicipality.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity municipality with the primary key. Does not add the entity municipality to the database.
     *
     * @param municipalId the primary key for the new entity municipality
     * @return the new entity municipality
     */
    @Override
    public EntityMunicipality create(int municipalId) {
        EntityMunicipality entityMunicipality = new EntityMunicipalityImpl();

        entityMunicipality.setNew(true);
        entityMunicipality.setPrimaryKey(municipalId);

        return entityMunicipality;
    }

    /**
     * Removes the entity municipality with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param municipalId the primary key of the entity municipality
     * @return the entity municipality that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality remove(int municipalId)
        throws NoSuchEntityMunicipalityException, SystemException {
        return remove((Serializable) municipalId);
    }

    /**
     * Removes the entity municipality with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity municipality
     * @return the entity municipality that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality remove(Serializable primaryKey)
        throws NoSuchEntityMunicipalityException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityMunicipality entityMunicipality = (EntityMunicipality) session.get(EntityMunicipalityImpl.class,
                    primaryKey);

            if (entityMunicipality == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityMunicipalityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityMunicipality);
        } catch (NoSuchEntityMunicipalityException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityMunicipality removeImpl(
        EntityMunicipality entityMunicipality) throws SystemException {
        entityMunicipality = toUnwrappedModel(entityMunicipality);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityMunicipality)) {
                entityMunicipality = (EntityMunicipality) session.get(EntityMunicipalityImpl.class,
                        entityMunicipality.getPrimaryKeyObj());
            }

            if (entityMunicipality != null) {
                session.delete(entityMunicipality);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityMunicipality != null) {
            clearCache(entityMunicipality);
        }

        return entityMunicipality;
    }

    @Override
    public EntityMunicipality updateImpl(
        com.consistent.ucwrt.model.EntityMunicipality entityMunicipality)
        throws SystemException {
        entityMunicipality = toUnwrappedModel(entityMunicipality);

        boolean isNew = entityMunicipality.isNew();

        EntityMunicipalityModelImpl entityMunicipalityModelImpl = (EntityMunicipalityModelImpl) entityMunicipality;

        Session session = null;

        try {
            session = openSession();

            if (entityMunicipality.isNew()) {
                session.save(entityMunicipality);

                entityMunicipality.setNew(false);
            } else {
                session.merge(entityMunicipality);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityMunicipalityModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityMunicipalityModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityMunicipalityModelImpl.getOriginalStateId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MUNICIPALITYBYSTATE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE,
                    args);

                args = new Object[] { entityMunicipalityModelImpl.getStateId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MUNICIPALITYBYSTATE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MUNICIPALITYBYSTATE,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
            EntityMunicipalityImpl.class, entityMunicipality.getPrimaryKey(),
            entityMunicipality);

        return entityMunicipality;
    }

    protected EntityMunicipality toUnwrappedModel(
        EntityMunicipality entityMunicipality) {
        if (entityMunicipality instanceof EntityMunicipalityImpl) {
            return entityMunicipality;
        }

        EntityMunicipalityImpl entityMunicipalityImpl = new EntityMunicipalityImpl();

        entityMunicipalityImpl.setNew(entityMunicipality.isNew());
        entityMunicipalityImpl.setPrimaryKey(entityMunicipality.getPrimaryKey());

        entityMunicipalityImpl.setMunicipalId(entityMunicipality.getMunicipalId());
        entityMunicipalityImpl.setMunicipalName(entityMunicipality.getMunicipalName());
        entityMunicipalityImpl.setStateId(entityMunicipality.getStateId());

        return entityMunicipalityImpl;
    }

    /**
     * Returns the entity municipality with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity municipality
     * @return the entity municipality
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityMunicipalityException, SystemException {
        EntityMunicipality entityMunicipality = fetchByPrimaryKey(primaryKey);

        if (entityMunicipality == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityMunicipalityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityMunicipality;
    }

    /**
     * Returns the entity municipality with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityMunicipalityException} if it could not be found.
     *
     * @param municipalId the primary key of the entity municipality
     * @return the entity municipality
     * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality findByPrimaryKey(int municipalId)
        throws NoSuchEntityMunicipalityException, SystemException {
        return findByPrimaryKey((Serializable) municipalId);
    }

    /**
     * Returns the entity municipality with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity municipality
     * @return the entity municipality, or <code>null</code> if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityMunicipality entityMunicipality = (EntityMunicipality) EntityCacheUtil.getResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
                EntityMunicipalityImpl.class, primaryKey);

        if (entityMunicipality == _nullEntityMunicipality) {
            return null;
        }

        if (entityMunicipality == null) {
            Session session = null;

            try {
                session = openSession();

                entityMunicipality = (EntityMunicipality) session.get(EntityMunicipalityImpl.class,
                        primaryKey);

                if (entityMunicipality != null) {
                    cacheResult(entityMunicipality);
                } else {
                    EntityCacheUtil.putResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
                        EntityMunicipalityImpl.class, primaryKey,
                        _nullEntityMunicipality);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityMunicipalityModelImpl.ENTITY_CACHE_ENABLED,
                    EntityMunicipalityImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityMunicipality;
    }

    /**
     * Returns the entity municipality with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param municipalId the primary key of the entity municipality
     * @return the entity municipality, or <code>null</code> if a entity municipality with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityMunicipality fetchByPrimaryKey(int municipalId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) municipalId);
    }

    /**
     * Returns all the entity municipalities.
     *
     * @return the entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMunicipality> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity municipalities.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity municipalities
     * @param end the upper bound of the range of entity municipalities (not inclusive)
     * @return the range of entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMunicipality> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity municipalities.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity municipalities
     * @param end the upper bound of the range of entity municipalities (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity municipalities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityMunicipality> findAll(int start, int end,
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

        List<EntityMunicipality> list = (List<EntityMunicipality>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYMUNICIPALITY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYMUNICIPALITY;

                if (pagination) {
                    sql = sql.concat(EntityMunicipalityModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityMunicipality>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityMunicipality>(list);
                } else {
                    list = (List<EntityMunicipality>) QueryUtil.list(q,
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
     * Removes all the entity municipalities from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityMunicipality entityMunicipality : findAll()) {
            remove(entityMunicipality);
        }
    }

    /**
     * Returns the number of entity municipalities.
     *
     * @return the number of entity municipalities
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYMUNICIPALITY);

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
     * Initializes the entity municipality persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityMunicipality")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityMunicipality>> listenersList = new ArrayList<ModelListener<EntityMunicipality>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityMunicipality>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityMunicipalityImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
