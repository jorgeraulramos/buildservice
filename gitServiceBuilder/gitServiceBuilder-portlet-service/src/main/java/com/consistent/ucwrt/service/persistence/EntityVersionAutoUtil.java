package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityVersionAuto;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity version auto service. This utility wraps {@link EntityVersionAutoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAutoPersistence
 * @see EntityVersionAutoPersistenceImpl
 * @generated
 */
public class EntityVersionAutoUtil {
    private static EntityVersionAutoPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(EntityVersionAuto entityVersionAuto) {
        getPersistence().clearCache(entityVersionAuto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<EntityVersionAuto> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityVersionAuto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityVersionAuto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityVersionAuto update(EntityVersionAuto entityVersionAuto)
        throws SystemException {
        return getPersistence().update(entityVersionAuto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityVersionAuto update(
        EntityVersionAuto entityVersionAuto, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entityVersionAuto, serviceContext);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto findByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByVersion(versionName, purchasePrice, salePrice,
            modelId, brandId, yearModel, classId);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByVersion(versionName, purchasePrice, salePrice,
            modelId, brandId, yearModel, classId);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByVersion(versionName, purchasePrice, salePrice,
            modelId, brandId, yearModel, classId, retrieveFromCache);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto removeByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByVersion(versionName, purchasePrice, salePrice,
            modelId, brandId, yearModel, classId);
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
    public static int countByVersion(java.lang.String versionName,
        double purchasePrice, double salePrice, int modelId, int brandId,
        int yearModel, int classId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByVersion(versionName, purchasePrice, salePrice,
            modelId, brandId, yearModel, classId);
    }

    /**
    * Returns all the entity version autos where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @return the matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModel(
        int brandId, int modelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBrandModel(brandId, modelId);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModel(
        int brandId, int modelId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBrandModel(brandId, modelId, start, end);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModel(
        int brandId, int modelId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModel(brandId, modelId, start, end,
            orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto findByBrandModel_First(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModel_First(brandId, modelId, orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModel_First(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBrandModel_First(brandId, modelId, orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto findByBrandModel_Last(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModel_Last(brandId, modelId, orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModel_Last(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBrandModel_Last(brandId, modelId, orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto[] findByBrandModel_PrevAndNext(
        EntityVersionAutoPK entityVersionAutoPK, int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModel_PrevAndNext(entityVersionAutoPK, brandId,
            modelId, orderByComparator);
    }

    /**
    * Removes all the entity version autos where brandId = &#63; and modelId = &#63; from the database.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBrandModel(int brandId, int modelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBrandModel(brandId, modelId);
    }

    /**
    * Returns the number of entity version autos where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @return the number of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public static int countByBrandModel(int brandId, int modelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBrandModel(brandId, modelId);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModelYear(
        int brandId, int modelId, int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBrandModelYear(brandId, modelId, yearModel);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModelYear(
        int brandId, int modelId, int yearModel, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModelYear(brandId, modelId, yearModel, start, end);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModelYear(
        int brandId, int modelId, int yearModel, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModelYear(brandId, modelId, yearModel, start,
            end, orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto findByBrandModelYear_First(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModelYear_First(brandId, modelId, yearModel,
            orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModelYear_First(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBrandModelYear_First(brandId, modelId, yearModel,
            orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto findByBrandModelYear_Last(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModelYear_Last(brandId, modelId, yearModel,
            orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModelYear_Last(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBrandModelYear_Last(brandId, modelId, yearModel,
            orderByComparator);
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
    public static com.consistent.ucwrt.model.EntityVersionAuto[] findByBrandModelYear_PrevAndNext(
        EntityVersionAutoPK entityVersionAutoPK, int brandId, int modelId,
        int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBrandModelYear_PrevAndNext(entityVersionAutoPK,
            brandId, modelId, yearModel, orderByComparator);
    }

    /**
    * Removes all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63; from the database.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBrandModelYear(int brandId, int modelId,
        int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBrandModelYear(brandId, modelId, yearModel);
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
    public static int countByBrandModelYear(int brandId, int modelId,
        int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByBrandModelYear(brandId, modelId, yearModel);
    }

    /**
    * Caches the entity version auto in the entity cache if it is enabled.
    *
    * @param entityVersionAuto the entity version auto
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto) {
        getPersistence().cacheResult(entityVersionAuto);
    }

    /**
    * Caches the entity version autos in the entity cache if it is enabled.
    *
    * @param entityVersionAutos the entity version autos
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> entityVersionAutos) {
        getPersistence().cacheResult(entityVersionAutos);
    }

    /**
    * Creates a new entity version auto with the primary key. Does not add the entity version auto to the database.
    *
    * @param entityVersionAutoPK the primary key for the new entity version auto
    * @return the new entity version auto
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto create(
        EntityVersionAutoPK entityVersionAutoPK) {
        return getPersistence().create(entityVersionAutoPK);
    }

    /**
    * Removes the entity version auto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto remove(
        EntityVersionAutoPK entityVersionAutoPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityVersionAutoPK);
    }

    public static com.consistent.ucwrt.model.EntityVersionAuto updateImpl(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityVersionAuto);
    }

    /**
    * Returns the entity version auto with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionAutoException} if it could not be found.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto findByPrimaryKey(
        EntityVersionAutoPK entityVersionAutoPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityVersionAutoPK);
    }

    /**
    * Returns the entity version auto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto, or <code>null</code> if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto fetchByPrimaryKey(
        EntityVersionAutoPK entityVersionAutoPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityVersionAutoPK);
    }

    /**
    * Returns all the entity version autos.
    *
    * @return the entity version autos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity version autos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity version autos.
    *
    * @return the number of entity version autos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityVersionAutoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityVersionAutoPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityVersionAutoPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityVersionAutoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityVersionAutoPersistence persistence) {
    }
}
