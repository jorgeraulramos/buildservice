package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityVersionAutoException;
import com.consistent.ucwrt.model.EntityVersionAuto;
import com.consistent.ucwrt.model.impl.EntityVersionAutoImpl;
import com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl;
import com.consistent.ucwrt.service.persistence.EntityVersionAutoPersistence;

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
 * The persistence implementation for the entity version auto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAutoPersistence
 * @see EntityVersionAutoUtil
 * @generated
 */
public class EntityVersionAutoPersistenceImpl extends BasePersistenceImpl<EntityVersionAuto>
    implements EntityVersionAutoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityVersionAutoUtil} to access the entity version auto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityVersionAutoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_VERSION = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByVersion",
            new String[] {
                String.class.getName(), Double.class.getName(),
                Double.class.getName(), Integer.class.getName(),
                Integer.class.getName(), Integer.class.getName(),
                Integer.class.getName()
            },
            EntityVersionAutoModelImpl.VERSIONNAME_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.PURCHASEPRICE_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.SALEPRICE_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.MODELID_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.BRANDID_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.YEARMODEL_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.CLASSID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VERSION = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVersion",
            new String[] {
                String.class.getName(), Double.class.getName(),
                Double.class.getName(), Integer.class.getName(),
                Integer.class.getName(), Integer.class.getName(),
                Integer.class.getName()
            });
    private static final String _FINDER_COLUMN_VERSION_VERSIONNAME_1 = "entityVersionAuto.versionName IS NULL AND ";
    private static final String _FINDER_COLUMN_VERSION_VERSIONNAME_2 = "entityVersionAuto.versionName = ? AND ";
    private static final String _FINDER_COLUMN_VERSION_VERSIONNAME_3 = "(entityVersionAuto.versionName IS NULL OR entityVersionAuto.versionName = '') AND ";
    private static final String _FINDER_COLUMN_VERSION_PURCHASEPRICE_2 = "entityVersionAuto.purchasePrice = ? AND ";
    private static final String _FINDER_COLUMN_VERSION_SALEPRICE_2 = "entityVersionAuto.salePrice = ? AND ";
    private static final String _FINDER_COLUMN_VERSION_MODELID_2 = "entityVersionAuto.id.modelId = ? AND ";
    private static final String _FINDER_COLUMN_VERSION_BRANDID_2 = "entityVersionAuto.id.brandId = ? AND ";
    private static final String _FINDER_COLUMN_VERSION_YEARMODEL_2 = "entityVersionAuto.id.yearModel = ? AND ";
    private static final String _FINDER_COLUMN_VERSION_CLASSID_2 = "entityVersionAuto.classId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDMODEL =
        new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBrandModel",
            new String[] {
                Integer.class.getName(), Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODEL =
        new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBrandModel",
            new String[] { Integer.class.getName(), Integer.class.getName() },
            EntityVersionAutoModelImpl.BRANDID_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.MODELID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BRANDMODEL = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBrandModel",
            new String[] { Integer.class.getName(), Integer.class.getName() });
    private static final String _FINDER_COLUMN_BRANDMODEL_BRANDID_2 = "entityVersionAuto.id.brandId = ? AND ";
    private static final String _FINDER_COLUMN_BRANDMODEL_MODELID_2 = "entityVersionAuto.id.modelId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDMODELYEAR =
        new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBrandModelYear",
            new String[] {
                Integer.class.getName(), Integer.class.getName(),
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODELYEAR =
        new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED,
            EntityVersionAutoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBrandModelYear",
            new String[] {
                Integer.class.getName(), Integer.class.getName(),
                Integer.class.getName()
            },
            EntityVersionAutoModelImpl.BRANDID_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.MODELID_COLUMN_BITMASK |
            EntityVersionAutoModelImpl.YEARMODEL_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BRANDMODELYEAR = new FinderPath(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBrandModelYear",
            new String[] {
                Integer.class.getName(), Integer.class.getName(),
                Integer.class.getName()
            });
    private static final String _FINDER_COLUMN_BRANDMODELYEAR_BRANDID_2 = "entityVersionAuto.id.brandId = ? AND ";
    private static final String _FINDER_COLUMN_BRANDMODELYEAR_MODELID_2 = "entityVersionAuto.id.modelId = ? AND ";
    private static final String _FINDER_COLUMN_BRANDMODELYEAR_YEARMODEL_2 = "entityVersionAuto.id.yearModel = ?";
    private static final String _SQL_SELECT_ENTITYVERSIONAUTO = "SELECT entityVersionAuto FROM EntityVersionAuto entityVersionAuto";
    private static final String _SQL_SELECT_ENTITYVERSIONAUTO_WHERE = "SELECT entityVersionAuto FROM EntityVersionAuto entityVersionAuto WHERE ";
    private static final String _SQL_COUNT_ENTITYVERSIONAUTO = "SELECT COUNT(entityVersionAuto) FROM EntityVersionAuto entityVersionAuto";
    private static final String _SQL_COUNT_ENTITYVERSIONAUTO_WHERE = "SELECT COUNT(entityVersionAuto) FROM EntityVersionAuto entityVersionAuto WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityVersionAuto.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityVersionAuto exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityVersionAuto exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityVersionAutoPersistenceImpl.class);
    private static EntityVersionAuto _nullEntityVersionAuto = new EntityVersionAutoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityVersionAuto> toCacheModel() {
                return _nullEntityVersionAutoCacheModel;
            }
        };

    private static CacheModel<EntityVersionAuto> _nullEntityVersionAutoCacheModel =
        new CacheModel<EntityVersionAuto>() {
            @Override
            public EntityVersionAuto toEntityModel() {
                return _nullEntityVersionAuto;
            }
        };

    public EntityVersionAutoPersistenceImpl() {
        setModelClass(EntityVersionAuto.class);
    }

    /**
     * Returns the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionAutoException} if it could not be found.
     *
     * @param versionName the version name
     * @param purchasePrice the purchase price
     * @param salePrice the sale price
     * @param modelId the model ID
     * @param brandId the brand ID
     * @param yearModel the year model
     * @param classId the class ID
     * @return the matching entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByVersion(String versionName,
        double purchasePrice, double salePrice, int modelId, int brandId,
        int yearModel, int classId)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = fetchByVersion(versionName,
                purchasePrice, salePrice, modelId, brandId, yearModel, classId);

        if (entityVersionAuto == null) {
            StringBundler msg = new StringBundler(16);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("versionName=");
            msg.append(versionName);

            msg.append(", purchasePrice=");
            msg.append(purchasePrice);

            msg.append(", salePrice=");
            msg.append(salePrice);

            msg.append(", modelId=");
            msg.append(modelId);

            msg.append(", brandId=");
            msg.append(brandId);

            msg.append(", yearModel=");
            msg.append(yearModel);

            msg.append(", classId=");
            msg.append(classId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityVersionAutoException(msg.toString());
        }

        return entityVersionAuto;
    }

    /**
     * Returns the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param versionName the version name
     * @param purchasePrice the purchase price
     * @param salePrice the sale price
     * @param modelId the model ID
     * @param brandId the brand ID
     * @param yearModel the year model
     * @param classId the class ID
     * @return the matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByVersion(String versionName,
        double purchasePrice, double salePrice, int modelId, int brandId,
        int yearModel, int classId) throws SystemException {
        return fetchByVersion(versionName, purchasePrice, salePrice, modelId,
            brandId, yearModel, classId, true);
    }

    /**
     * Returns the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param versionName the version name
     * @param purchasePrice the purchase price
     * @param salePrice the sale price
     * @param modelId the model ID
     * @param brandId the brand ID
     * @param yearModel the year model
     * @param classId the class ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByVersion(String versionName,
        double purchasePrice, double salePrice, int modelId, int brandId,
        int yearModel, int classId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] {
                versionName, purchasePrice, salePrice, modelId, brandId,
                yearModel, classId
            };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VERSION,
                    finderArgs, this);
        }

        if (result instanceof EntityVersionAuto) {
            EntityVersionAuto entityVersionAuto = (EntityVersionAuto) result;

            if (!Validator.equals(versionName,
                        entityVersionAuto.getVersionName()) ||
                    (purchasePrice != entityVersionAuto.getPurchasePrice()) ||
                    (salePrice != entityVersionAuto.getSalePrice()) ||
                    (modelId != entityVersionAuto.getModelId()) ||
                    (brandId != entityVersionAuto.getBrandId()) ||
                    (yearModel != entityVersionAuto.getYearModel()) ||
                    (classId != entityVersionAuto.getClassId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(9);

            query.append(_SQL_SELECT_ENTITYVERSIONAUTO_WHERE);

            boolean bindVersionName = false;

            if (versionName == null) {
                query.append(_FINDER_COLUMN_VERSION_VERSIONNAME_1);
            } else if (versionName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_VERSION_VERSIONNAME_3);
            } else {
                bindVersionName = true;

                query.append(_FINDER_COLUMN_VERSION_VERSIONNAME_2);
            }

            query.append(_FINDER_COLUMN_VERSION_PURCHASEPRICE_2);

            query.append(_FINDER_COLUMN_VERSION_SALEPRICE_2);

            query.append(_FINDER_COLUMN_VERSION_MODELID_2);

            query.append(_FINDER_COLUMN_VERSION_BRANDID_2);

            query.append(_FINDER_COLUMN_VERSION_YEARMODEL_2);

            query.append(_FINDER_COLUMN_VERSION_CLASSID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindVersionName) {
                    qPos.add(versionName);
                }

                qPos.add(purchasePrice);

                qPos.add(salePrice);

                qPos.add(modelId);

                qPos.add(brandId);

                qPos.add(yearModel);

                qPos.add(classId);

                List<EntityVersionAuto> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSION,
                        finderArgs, list);
                } else {
                    EntityVersionAuto entityVersionAuto = list.get(0);

                    result = entityVersionAuto;

                    cacheResult(entityVersionAuto);

                    if ((entityVersionAuto.getVersionName() == null) ||
                            !entityVersionAuto.getVersionName()
                                                  .equals(versionName) ||
                            (entityVersionAuto.getPurchasePrice() != purchasePrice) ||
                            (entityVersionAuto.getSalePrice() != salePrice) ||
                            (entityVersionAuto.getModelId() != modelId) ||
                            (entityVersionAuto.getBrandId() != brandId) ||
                            (entityVersionAuto.getYearModel() != yearModel) ||
                            (entityVersionAuto.getClassId() != classId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSION,
                            finderArgs, entityVersionAuto);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSION,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityVersionAuto) result;
        }
    }

    /**
     * Removes the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; from the database.
     *
     * @param versionName the version name
     * @param purchasePrice the purchase price
     * @param salePrice the sale price
     * @param modelId the model ID
     * @param brandId the brand ID
     * @param yearModel the year model
     * @param classId the class ID
     * @return the entity version auto that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto removeByVersion(String versionName,
        double purchasePrice, double salePrice, int modelId, int brandId,
        int yearModel, int classId)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = findByVersion(versionName,
                purchasePrice, salePrice, modelId, brandId, yearModel, classId);

        return remove(entityVersionAuto);
    }

    /**
     * Returns the number of entity version autos where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63;.
     *
     * @param versionName the version name
     * @param purchasePrice the purchase price
     * @param salePrice the sale price
     * @param modelId the model ID
     * @param brandId the brand ID
     * @param yearModel the year model
     * @param classId the class ID
     * @return the number of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVersion(String versionName, double purchasePrice,
        double salePrice, int modelId, int brandId, int yearModel, int classId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VERSION;

        Object[] finderArgs = new Object[] {
                versionName, purchasePrice, salePrice, modelId, brandId,
                yearModel, classId
            };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(8);

            query.append(_SQL_COUNT_ENTITYVERSIONAUTO_WHERE);

            boolean bindVersionName = false;

            if (versionName == null) {
                query.append(_FINDER_COLUMN_VERSION_VERSIONNAME_1);
            } else if (versionName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_VERSION_VERSIONNAME_3);
            } else {
                bindVersionName = true;

                query.append(_FINDER_COLUMN_VERSION_VERSIONNAME_2);
            }

            query.append(_FINDER_COLUMN_VERSION_PURCHASEPRICE_2);

            query.append(_FINDER_COLUMN_VERSION_SALEPRICE_2);

            query.append(_FINDER_COLUMN_VERSION_MODELID_2);

            query.append(_FINDER_COLUMN_VERSION_BRANDID_2);

            query.append(_FINDER_COLUMN_VERSION_YEARMODEL_2);

            query.append(_FINDER_COLUMN_VERSION_CLASSID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindVersionName) {
                    qPos.add(versionName);
                }

                qPos.add(purchasePrice);

                qPos.add(salePrice);

                qPos.add(modelId);

                qPos.add(brandId);

                qPos.add(yearModel);

                qPos.add(classId);

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
     * Returns all the entity version autos where brandId = &#63; and modelId = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @return the matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findByBrandModel(int brandId, int modelId)
        throws SystemException {
        return findByBrandModel(brandId, modelId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity version autos where brandId = &#63; and modelId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param start the lower bound of the range of entity version autos
     * @param end the upper bound of the range of entity version autos (not inclusive)
     * @return the range of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findByBrandModel(int brandId, int modelId,
        int start, int end) throws SystemException {
        return findByBrandModel(brandId, modelId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity version autos where brandId = &#63; and modelId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param start the lower bound of the range of entity version autos
     * @param end the upper bound of the range of entity version autos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findByBrandModel(int brandId, int modelId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODEL;
            finderArgs = new Object[] { brandId, modelId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDMODEL;
            finderArgs = new Object[] {
                    brandId, modelId,
                    
                    start, end, orderByComparator
                };
        }

        List<EntityVersionAuto> list = (List<EntityVersionAuto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityVersionAuto entityVersionAuto : list) {
                if ((brandId != entityVersionAuto.getBrandId()) ||
                        (modelId != entityVersionAuto.getModelId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_ENTITYVERSIONAUTO_WHERE);

            query.append(_FINDER_COLUMN_BRANDMODEL_BRANDID_2);

            query.append(_FINDER_COLUMN_BRANDMODEL_MODELID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityVersionAutoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

                qPos.add(modelId);

                if (!pagination) {
                    list = (List<EntityVersionAuto>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityVersionAuto>(list);
                } else {
                    list = (List<EntityVersionAuto>) QueryUtil.list(q,
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
     * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByBrandModel_First(int brandId, int modelId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = fetchByBrandModel_First(brandId,
                modelId, orderByComparator);

        if (entityVersionAuto != null) {
            return entityVersionAuto;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("brandId=");
        msg.append(brandId);

        msg.append(", modelId=");
        msg.append(modelId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityVersionAutoException(msg.toString());
    }

    /**
     * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByBrandModel_First(int brandId, int modelId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityVersionAuto> list = findByBrandModel(brandId, modelId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByBrandModel_Last(int brandId, int modelId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = fetchByBrandModel_Last(brandId,
                modelId, orderByComparator);

        if (entityVersionAuto != null) {
            return entityVersionAuto;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("brandId=");
        msg.append(brandId);

        msg.append(", modelId=");
        msg.append(modelId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityVersionAutoException(msg.toString());
    }

    /**
     * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByBrandModel_Last(int brandId, int modelId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBrandModel(brandId, modelId);

        if (count == 0) {
            return null;
        }

        List<EntityVersionAuto> list = findByBrandModel(brandId, modelId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity version autos before and after the current entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
     *
     * @param entityVersionAutoPK the primary key of the current entity version auto
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto[] findByBrandModel_PrevAndNext(
        EntityVersionAutoPK entityVersionAutoPK, int brandId, int modelId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = findByPrimaryKey(entityVersionAutoPK);

        Session session = null;

        try {
            session = openSession();

            EntityVersionAuto[] array = new EntityVersionAutoImpl[3];

            array[0] = getByBrandModel_PrevAndNext(session, entityVersionAuto,
                    brandId, modelId, orderByComparator, true);

            array[1] = entityVersionAuto;

            array[2] = getByBrandModel_PrevAndNext(session, entityVersionAuto,
                    brandId, modelId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityVersionAuto getByBrandModel_PrevAndNext(Session session,
        EntityVersionAuto entityVersionAuto, int brandId, int modelId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYVERSIONAUTO_WHERE);

        query.append(_FINDER_COLUMN_BRANDMODEL_BRANDID_2);

        query.append(_FINDER_COLUMN_BRANDMODEL_MODELID_2);

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
            query.append(EntityVersionAutoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(brandId);

        qPos.add(modelId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityVersionAuto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityVersionAuto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity version autos where brandId = &#63; and modelId = &#63; from the database.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBrandModel(int brandId, int modelId)
        throws SystemException {
        for (EntityVersionAuto entityVersionAuto : findByBrandModel(brandId,
                modelId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityVersionAuto);
        }
    }

    /**
     * Returns the number of entity version autos where brandId = &#63; and modelId = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @return the number of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBrandModel(int brandId, int modelId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BRANDMODEL;

        Object[] finderArgs = new Object[] { brandId, modelId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_ENTITYVERSIONAUTO_WHERE);

            query.append(_FINDER_COLUMN_BRANDMODEL_BRANDID_2);

            query.append(_FINDER_COLUMN_BRANDMODEL_MODELID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

                qPos.add(modelId);

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
     * Returns all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @return the matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findByBrandModelYear(int brandId,
        int modelId, int yearModel) throws SystemException {
        return findByBrandModelYear(brandId, modelId, yearModel,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param start the lower bound of the range of entity version autos
     * @param end the upper bound of the range of entity version autos (not inclusive)
     * @return the range of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findByBrandModelYear(int brandId,
        int modelId, int yearModel, int start, int end)
        throws SystemException {
        return findByBrandModelYear(brandId, modelId, yearModel, start, end,
            null);
    }

    /**
     * Returns an ordered range of all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param start the lower bound of the range of entity version autos
     * @param end the upper bound of the range of entity version autos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findByBrandModelYear(int brandId,
        int modelId, int yearModel, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODELYEAR;
            finderArgs = new Object[] { brandId, modelId, yearModel };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDMODELYEAR;
            finderArgs = new Object[] {
                    brandId, modelId, yearModel,
                    
                    start, end, orderByComparator
                };
        }

        List<EntityVersionAuto> list = (List<EntityVersionAuto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityVersionAuto entityVersionAuto : list) {
                if ((brandId != entityVersionAuto.getBrandId()) ||
                        (modelId != entityVersionAuto.getModelId()) ||
                        (yearModel != entityVersionAuto.getYearModel())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_ENTITYVERSIONAUTO_WHERE);

            query.append(_FINDER_COLUMN_BRANDMODELYEAR_BRANDID_2);

            query.append(_FINDER_COLUMN_BRANDMODELYEAR_MODELID_2);

            query.append(_FINDER_COLUMN_BRANDMODELYEAR_YEARMODEL_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityVersionAutoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

                qPos.add(modelId);

                qPos.add(yearModel);

                if (!pagination) {
                    list = (List<EntityVersionAuto>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityVersionAuto>(list);
                } else {
                    list = (List<EntityVersionAuto>) QueryUtil.list(q,
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
     * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByBrandModelYear_First(int brandId,
        int modelId, int yearModel, OrderByComparator orderByComparator)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = fetchByBrandModelYear_First(brandId,
                modelId, yearModel, orderByComparator);

        if (entityVersionAuto != null) {
            return entityVersionAuto;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("brandId=");
        msg.append(brandId);

        msg.append(", modelId=");
        msg.append(modelId);

        msg.append(", yearModel=");
        msg.append(yearModel);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityVersionAutoException(msg.toString());
    }

    /**
     * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByBrandModelYear_First(int brandId,
        int modelId, int yearModel, OrderByComparator orderByComparator)
        throws SystemException {
        List<EntityVersionAuto> list = findByBrandModelYear(brandId, modelId,
                yearModel, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByBrandModelYear_Last(int brandId,
        int modelId, int yearModel, OrderByComparator orderByComparator)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = fetchByBrandModelYear_Last(brandId,
                modelId, yearModel, orderByComparator);

        if (entityVersionAuto != null) {
            return entityVersionAuto;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("brandId=");
        msg.append(brandId);

        msg.append(", modelId=");
        msg.append(modelId);

        msg.append(", yearModel=");
        msg.append(yearModel);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityVersionAutoException(msg.toString());
    }

    /**
     * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByBrandModelYear_Last(int brandId,
        int modelId, int yearModel, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByBrandModelYear(brandId, modelId, yearModel);

        if (count == 0) {
            return null;
        }

        List<EntityVersionAuto> list = findByBrandModelYear(brandId, modelId,
                yearModel, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity version autos before and after the current entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param entityVersionAutoPK the primary key of the current entity version auto
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto[] findByBrandModelYear_PrevAndNext(
        EntityVersionAutoPK entityVersionAutoPK, int brandId, int modelId,
        int yearModel, OrderByComparator orderByComparator)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = findByPrimaryKey(entityVersionAutoPK);

        Session session = null;

        try {
            session = openSession();

            EntityVersionAuto[] array = new EntityVersionAutoImpl[3];

            array[0] = getByBrandModelYear_PrevAndNext(session,
                    entityVersionAuto, brandId, modelId, yearModel,
                    orderByComparator, true);

            array[1] = entityVersionAuto;

            array[2] = getByBrandModelYear_PrevAndNext(session,
                    entityVersionAuto, brandId, modelId, yearModel,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityVersionAuto getByBrandModelYear_PrevAndNext(
        Session session, EntityVersionAuto entityVersionAuto, int brandId,
        int modelId, int yearModel, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYVERSIONAUTO_WHERE);

        query.append(_FINDER_COLUMN_BRANDMODELYEAR_BRANDID_2);

        query.append(_FINDER_COLUMN_BRANDMODELYEAR_MODELID_2);

        query.append(_FINDER_COLUMN_BRANDMODELYEAR_YEARMODEL_2);

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
            query.append(EntityVersionAutoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(brandId);

        qPos.add(modelId);

        qPos.add(yearModel);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityVersionAuto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityVersionAuto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63; from the database.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBrandModelYear(int brandId, int modelId, int yearModel)
        throws SystemException {
        for (EntityVersionAuto entityVersionAuto : findByBrandModelYear(
                brandId, modelId, yearModel, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(entityVersionAuto);
        }
    }

    /**
     * Returns the number of entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
     *
     * @param brandId the brand ID
     * @param modelId the model ID
     * @param yearModel the year model
     * @return the number of matching entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBrandModelYear(int brandId, int modelId, int yearModel)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BRANDMODELYEAR;

        Object[] finderArgs = new Object[] { brandId, modelId, yearModel };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_ENTITYVERSIONAUTO_WHERE);

            query.append(_FINDER_COLUMN_BRANDMODELYEAR_BRANDID_2);

            query.append(_FINDER_COLUMN_BRANDMODELYEAR_MODELID_2);

            query.append(_FINDER_COLUMN_BRANDMODELYEAR_YEARMODEL_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

                qPos.add(modelId);

                qPos.add(yearModel);

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
     * Caches the entity version auto in the entity cache if it is enabled.
     *
     * @param entityVersionAuto the entity version auto
     */
    @Override
    public void cacheResult(EntityVersionAuto entityVersionAuto) {
        EntityCacheUtil.putResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoImpl.class, entityVersionAuto.getPrimaryKey(),
            entityVersionAuto);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSION,
            new Object[] {
                entityVersionAuto.getVersionName(),
                entityVersionAuto.getPurchasePrice(),
                entityVersionAuto.getSalePrice(), entityVersionAuto.getModelId(),
                entityVersionAuto.getBrandId(), entityVersionAuto.getYearModel(),
                entityVersionAuto.getClassId()
            }, entityVersionAuto);

        entityVersionAuto.resetOriginalValues();
    }

    /**
     * Caches the entity version autos in the entity cache if it is enabled.
     *
     * @param entityVersionAutos the entity version autos
     */
    @Override
    public void cacheResult(List<EntityVersionAuto> entityVersionAutos) {
        for (EntityVersionAuto entityVersionAuto : entityVersionAutos) {
            if (EntityCacheUtil.getResult(
                        EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
                        EntityVersionAutoImpl.class,
                        entityVersionAuto.getPrimaryKey()) == null) {
                cacheResult(entityVersionAuto);
            } else {
                entityVersionAuto.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity version autos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityVersionAutoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityVersionAutoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity version auto.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityVersionAuto entityVersionAuto) {
        EntityCacheUtil.removeResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoImpl.class, entityVersionAuto.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(entityVersionAuto);
    }

    @Override
    public void clearCache(List<EntityVersionAuto> entityVersionAutos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityVersionAuto entityVersionAuto : entityVersionAutos) {
            EntityCacheUtil.removeResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
                EntityVersionAutoImpl.class, entityVersionAuto.getPrimaryKey());

            clearUniqueFindersCache(entityVersionAuto);
        }
    }

    protected void cacheUniqueFindersCache(EntityVersionAuto entityVersionAuto) {
        if (entityVersionAuto.isNew()) {
            Object[] args = new Object[] {
                    entityVersionAuto.getVersionName(),
                    entityVersionAuto.getPurchasePrice(),
                    entityVersionAuto.getSalePrice(),
                    entityVersionAuto.getModelId(),
                    entityVersionAuto.getBrandId(),
                    entityVersionAuto.getYearModel(),
                    entityVersionAuto.getClassId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSION, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSION, args,
                entityVersionAuto);
        } else {
            EntityVersionAutoModelImpl entityVersionAutoModelImpl = (EntityVersionAutoModelImpl) entityVersionAuto;

            if ((entityVersionAutoModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_VERSION.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityVersionAuto.getVersionName(),
                        entityVersionAuto.getPurchasePrice(),
                        entityVersionAuto.getSalePrice(),
                        entityVersionAuto.getModelId(),
                        entityVersionAuto.getBrandId(),
                        entityVersionAuto.getYearModel(),
                        entityVersionAuto.getClassId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSION, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSION, args,
                    entityVersionAuto);
            }
        }
    }

    protected void clearUniqueFindersCache(EntityVersionAuto entityVersionAuto) {
        EntityVersionAutoModelImpl entityVersionAutoModelImpl = (EntityVersionAutoModelImpl) entityVersionAuto;

        Object[] args = new Object[] {
                entityVersionAuto.getVersionName(),
                entityVersionAuto.getPurchasePrice(),
                entityVersionAuto.getSalePrice(), entityVersionAuto.getModelId(),
                entityVersionAuto.getBrandId(), entityVersionAuto.getYearModel(),
                entityVersionAuto.getClassId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSION, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSION, args);

        if ((entityVersionAutoModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_VERSION.getColumnBitmask()) != 0) {
            args = new Object[] {
                    entityVersionAutoModelImpl.getOriginalVersionName(),
                    entityVersionAutoModelImpl.getOriginalPurchasePrice(),
                    entityVersionAutoModelImpl.getOriginalSalePrice(),
                    entityVersionAutoModelImpl.getOriginalModelId(),
                    entityVersionAutoModelImpl.getOriginalBrandId(),
                    entityVersionAutoModelImpl.getOriginalYearModel(),
                    entityVersionAutoModelImpl.getOriginalClassId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSION, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSION, args);
        }
    }

    /**
     * Creates a new entity version auto with the primary key. Does not add the entity version auto to the database.
     *
     * @param entityVersionAutoPK the primary key for the new entity version auto
     * @return the new entity version auto
     */
    @Override
    public EntityVersionAuto create(EntityVersionAutoPK entityVersionAutoPK) {
        EntityVersionAuto entityVersionAuto = new EntityVersionAutoImpl();

        entityVersionAuto.setNew(true);
        entityVersionAuto.setPrimaryKey(entityVersionAutoPK);

        return entityVersionAuto;
    }

    /**
     * Removes the entity version auto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityVersionAutoPK the primary key of the entity version auto
     * @return the entity version auto that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto remove(EntityVersionAutoPK entityVersionAutoPK)
        throws NoSuchEntityVersionAutoException, SystemException {
        return remove((Serializable) entityVersionAutoPK);
    }

    /**
     * Removes the entity version auto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity version auto
     * @return the entity version auto that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto remove(Serializable primaryKey)
        throws NoSuchEntityVersionAutoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityVersionAuto entityVersionAuto = (EntityVersionAuto) session.get(EntityVersionAutoImpl.class,
                    primaryKey);

            if (entityVersionAuto == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityVersionAutoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityVersionAuto);
        } catch (NoSuchEntityVersionAutoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityVersionAuto removeImpl(EntityVersionAuto entityVersionAuto)
        throws SystemException {
        entityVersionAuto = toUnwrappedModel(entityVersionAuto);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityVersionAuto)) {
                entityVersionAuto = (EntityVersionAuto) session.get(EntityVersionAutoImpl.class,
                        entityVersionAuto.getPrimaryKeyObj());
            }

            if (entityVersionAuto != null) {
                session.delete(entityVersionAuto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityVersionAuto != null) {
            clearCache(entityVersionAuto);
        }

        return entityVersionAuto;
    }

    @Override
    public EntityVersionAuto updateImpl(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto)
        throws SystemException {
        entityVersionAuto = toUnwrappedModel(entityVersionAuto);

        boolean isNew = entityVersionAuto.isNew();

        EntityVersionAutoModelImpl entityVersionAutoModelImpl = (EntityVersionAutoModelImpl) entityVersionAuto;

        Session session = null;

        try {
            session = openSession();

            if (entityVersionAuto.isNew()) {
                session.save(entityVersionAuto);

                entityVersionAuto.setNew(false);
            } else {
                session.merge(entityVersionAuto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityVersionAutoModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityVersionAutoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODEL.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityVersionAutoModelImpl.getOriginalBrandId(),
                        entityVersionAutoModelImpl.getOriginalModelId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDMODEL,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODEL,
                    args);

                args = new Object[] {
                        entityVersionAutoModelImpl.getBrandId(),
                        entityVersionAutoModelImpl.getModelId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDMODEL,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODEL,
                    args);
            }

            if ((entityVersionAutoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODELYEAR.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityVersionAutoModelImpl.getOriginalBrandId(),
                        entityVersionAutoModelImpl.getOriginalModelId(),
                        entityVersionAutoModelImpl.getOriginalYearModel()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDMODELYEAR,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODELYEAR,
                    args);

                args = new Object[] {
                        entityVersionAutoModelImpl.getBrandId(),
                        entityVersionAutoModelImpl.getModelId(),
                        entityVersionAutoModelImpl.getYearModel()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDMODELYEAR,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDMODELYEAR,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
            EntityVersionAutoImpl.class, entityVersionAuto.getPrimaryKey(),
            entityVersionAuto);

        clearUniqueFindersCache(entityVersionAuto);
        cacheUniqueFindersCache(entityVersionAuto);

        return entityVersionAuto;
    }

    protected EntityVersionAuto toUnwrappedModel(
        EntityVersionAuto entityVersionAuto) {
        if (entityVersionAuto instanceof EntityVersionAutoImpl) {
            return entityVersionAuto;
        }

        EntityVersionAutoImpl entityVersionAutoImpl = new EntityVersionAutoImpl();

        entityVersionAutoImpl.setNew(entityVersionAuto.isNew());
        entityVersionAutoImpl.setPrimaryKey(entityVersionAuto.getPrimaryKey());

        entityVersionAutoImpl.setVersionId(entityVersionAuto.getVersionId());
        entityVersionAutoImpl.setVersionName(entityVersionAuto.getVersionName());
        entityVersionAutoImpl.setVersionRegistrationDate(entityVersionAuto.getVersionRegistrationDate());
        entityVersionAutoImpl.setVersionResponsibleUser(entityVersionAuto.getVersionResponsibleUser());
        entityVersionAutoImpl.setVersionRegisterData(entityVersionAuto.getVersionRegisterData());
        entityVersionAutoImpl.setPurchasePrice(entityVersionAuto.getPurchasePrice());
        entityVersionAutoImpl.setSalePrice(entityVersionAuto.getSalePrice());
        entityVersionAutoImpl.setPurchasePriceDll(entityVersionAuto.getPurchasePriceDll());
        entityVersionAutoImpl.setTypeload(entityVersionAuto.getTypeload());
        entityVersionAutoImpl.setColorName(entityVersionAuto.getColorName());
        entityVersionAutoImpl.setModelId(entityVersionAuto.getModelId());
        entityVersionAutoImpl.setBrandId(entityVersionAuto.getBrandId());
        entityVersionAutoImpl.setYearModel(entityVersionAuto.getYearModel());
        entityVersionAutoImpl.setClassId(entityVersionAuto.getClassId());

        return entityVersionAutoImpl;
    }

    /**
     * Returns the entity version auto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity version auto
     * @return the entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityVersionAutoException, SystemException {
        EntityVersionAuto entityVersionAuto = fetchByPrimaryKey(primaryKey);

        if (entityVersionAuto == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityVersionAutoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityVersionAuto;
    }

    /**
     * Returns the entity version auto with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionAutoException} if it could not be found.
     *
     * @param entityVersionAutoPK the primary key of the entity version auto
     * @return the entity version auto
     * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto findByPrimaryKey(
        EntityVersionAutoPK entityVersionAutoPK)
        throws NoSuchEntityVersionAutoException, SystemException {
        return findByPrimaryKey((Serializable) entityVersionAutoPK);
    }

    /**
     * Returns the entity version auto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity version auto
     * @return the entity version auto, or <code>null</code> if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityVersionAuto entityVersionAuto = (EntityVersionAuto) EntityCacheUtil.getResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
                EntityVersionAutoImpl.class, primaryKey);

        if (entityVersionAuto == _nullEntityVersionAuto) {
            return null;
        }

        if (entityVersionAuto == null) {
            Session session = null;

            try {
                session = openSession();

                entityVersionAuto = (EntityVersionAuto) session.get(EntityVersionAutoImpl.class,
                        primaryKey);

                if (entityVersionAuto != null) {
                    cacheResult(entityVersionAuto);
                } else {
                    EntityCacheUtil.putResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
                        EntityVersionAutoImpl.class, primaryKey,
                        _nullEntityVersionAuto);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityVersionAutoModelImpl.ENTITY_CACHE_ENABLED,
                    EntityVersionAutoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityVersionAuto;
    }

    /**
     * Returns the entity version auto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityVersionAutoPK the primary key of the entity version auto
     * @return the entity version auto, or <code>null</code> if a entity version auto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityVersionAuto fetchByPrimaryKey(
        EntityVersionAutoPK entityVersionAutoPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) entityVersionAutoPK);
    }

    /**
     * Returns all the entity version autos.
     *
     * @return the entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity version autos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity version autos
     * @param end the upper bound of the range of entity version autos (not inclusive)
     * @return the range of entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity version autos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity version autos
     * @param end the upper bound of the range of entity version autos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity version autos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityVersionAuto> findAll(int start, int end,
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

        List<EntityVersionAuto> list = (List<EntityVersionAuto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYVERSIONAUTO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYVERSIONAUTO;

                if (pagination) {
                    sql = sql.concat(EntityVersionAutoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityVersionAuto>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityVersionAuto>(list);
                } else {
                    list = (List<EntityVersionAuto>) QueryUtil.list(q,
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
     * Removes all the entity version autos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityVersionAuto entityVersionAuto : findAll()) {
            remove(entityVersionAuto);
        }
    }

    /**
     * Returns the number of entity version autos.
     *
     * @return the number of entity version autos
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYVERSIONAUTO);

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
     * Initializes the entity version auto persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityVersionAuto")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityVersionAuto>> listenersList = new ArrayList<ModelListener<EntityVersionAuto>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityVersionAuto>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityVersionAutoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
