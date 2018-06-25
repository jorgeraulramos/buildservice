package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityBusinessBrand;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity business brand service. This utility wraps {@link EntityBusinessBrandPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBusinessBrandPersistence
 * @see EntityBusinessBrandPersistenceImpl
 * @generated
 */
public class EntityBusinessBrandUtil {
    private static EntityBusinessBrandPersistence _persistence;

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
    public static void clearCache(EntityBusinessBrand entityBusinessBrand) {
        getPersistence().clearCache(entityBusinessBrand);
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
    public static List<EntityBusinessBrand> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityBusinessBrand> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityBusinessBrand> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityBusinessBrand update(
        EntityBusinessBrand entityBusinessBrand) throws SystemException {
        return getPersistence().update(entityBusinessBrand);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityBusinessBrand update(
        EntityBusinessBrand entityBusinessBrand, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entityBusinessBrand, serviceContext);
    }

    /**
    * Returns the entity business brand where businessBrandName = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityBusinessBrandException} if it could not be found.
    *
    * @param businessBrandName the business brand name
    * @return the matching entity business brand
    * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a matching entity business brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand findByBusinessBrandByBusinessBrandName(
        java.lang.String businessBrandName)
        throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBusinessBrandByBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the entity business brand where businessBrandName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param businessBrandName the business brand name
    * @return the matching entity business brand, or <code>null</code> if a matching entity business brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand fetchByBusinessBrandByBusinessBrandName(
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBusinessBrandByBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the entity business brand where businessBrandName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param businessBrandName the business brand name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity business brand, or <code>null</code> if a matching entity business brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand fetchByBusinessBrandByBusinessBrandName(
        java.lang.String businessBrandName, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBusinessBrandByBusinessBrandName(businessBrandName,
            retrieveFromCache);
    }

    /**
    * Removes the entity business brand where businessBrandName = &#63; from the database.
    *
    * @param businessBrandName the business brand name
    * @return the entity business brand that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand removeByBusinessBrandByBusinessBrandName(
        java.lang.String businessBrandName)
        throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByBusinessBrandByBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the number of entity business brands where businessBrandName = &#63;.
    *
    * @param businessBrandName the business brand name
    * @return the number of matching entity business brands
    * @throws SystemException if a system exception occurred
    */
    public static int countByBusinessBrandByBusinessBrandName(
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByBusinessBrandByBusinessBrandName(businessBrandName);
    }

    /**
    * Caches the entity business brand in the entity cache if it is enabled.
    *
    * @param entityBusinessBrand the entity business brand
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityBusinessBrand entityBusinessBrand) {
        getPersistence().cacheResult(entityBusinessBrand);
    }

    /**
    * Caches the entity business brands in the entity cache if it is enabled.
    *
    * @param entityBusinessBrands the entity business brands
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityBusinessBrand> entityBusinessBrands) {
        getPersistence().cacheResult(entityBusinessBrands);
    }

    /**
    * Creates a new entity business brand with the primary key. Does not add the entity business brand to the database.
    *
    * @param businessBrandName the primary key for the new entity business brand
    * @return the new entity business brand
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand create(
        java.lang.String businessBrandName) {
        return getPersistence().create(businessBrandName);
    }

    /**
    * Removes the entity business brand with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param businessBrandName the primary key of the entity business brand
    * @return the entity business brand that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a entity business brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand remove(
        java.lang.String businessBrandName)
        throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(businessBrandName);
    }

    public static com.consistent.ucwrt.model.EntityBusinessBrand updateImpl(
        com.consistent.ucwrt.model.EntityBusinessBrand entityBusinessBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityBusinessBrand);
    }

    /**
    * Returns the entity business brand with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityBusinessBrandException} if it could not be found.
    *
    * @param businessBrandName the primary key of the entity business brand
    * @return the entity business brand
    * @throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException if a entity business brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand findByPrimaryKey(
        java.lang.String businessBrandName)
        throws com.consistent.ucwrt.NoSuchEntityBusinessBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(businessBrandName);
    }

    /**
    * Returns the entity business brand with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param businessBrandName the primary key of the entity business brand
    * @return the entity business brand, or <code>null</code> if a entity business brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBusinessBrand fetchByPrimaryKey(
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(businessBrandName);
    }

    /**
    * Returns all the entity business brands.
    *
    * @return the entity business brands
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityBusinessBrand> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity business brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity business brands
    * @param end the upper bound of the range of entity business brands (not inclusive)
    * @return the range of entity business brands
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityBusinessBrand> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity business brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity business brands
    * @param end the upper bound of the range of entity business brands (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity business brands
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityBusinessBrand> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity business brands from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity business brands.
    *
    * @return the number of entity business brands
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityBusinessBrandPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityBusinessBrandPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityBusinessBrandPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityBusinessBrandUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityBusinessBrandPersistence persistence) {
    }
}
