package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityBrand;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity brand service. This utility wraps {@link EntityBrandPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrandPersistence
 * @see EntityBrandPersistenceImpl
 * @generated
 */
public class EntityBrandUtil {
    private static EntityBrandPersistence _persistence;

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
    public static void clearCache(EntityBrand entityBrand) {
        getPersistence().clearCache(entityBrand);
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
    public static List<EntityBrand> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityBrand> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityBrand> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityBrand update(EntityBrand entityBrand)
        throws SystemException {
        return getPersistence().update(entityBrand);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityBrand update(EntityBrand entityBrand,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityBrand, serviceContext);
    }

    /**
    * Returns the entity brand where brandId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityBrandException} if it could not be found.
    *
    * @param brandId the brand ID
    * @return the matching entity brand
    * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a matching entity brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand findByfindBrand(
        int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfindBrand(brandId);
    }

    /**
    * Returns the entity brand where brandId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param brandId the brand ID
    * @return the matching entity brand, or <code>null</code> if a matching entity brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand fetchByfindBrand(
        int brandId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByfindBrand(brandId);
    }

    /**
    * Returns the entity brand where brandId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param brandId the brand ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity brand, or <code>null</code> if a matching entity brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand fetchByfindBrand(
        int brandId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByfindBrand(brandId, retrieveFromCache);
    }

    /**
    * Removes the entity brand where brandId = &#63; from the database.
    *
    * @param brandId the brand ID
    * @return the entity brand that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand removeByfindBrand(
        int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByfindBrand(brandId);
    }

    /**
    * Returns the number of entity brands where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @return the number of matching entity brands
    * @throws SystemException if a system exception occurred
    */
    public static int countByfindBrand(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByfindBrand(brandId);
    }

    /**
    * Caches the entity brand in the entity cache if it is enabled.
    *
    * @param entityBrand the entity brand
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityBrand entityBrand) {
        getPersistence().cacheResult(entityBrand);
    }

    /**
    * Caches the entity brands in the entity cache if it is enabled.
    *
    * @param entityBrands the entity brands
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityBrand> entityBrands) {
        getPersistence().cacheResult(entityBrands);
    }

    /**
    * Creates a new entity brand with the primary key. Does not add the entity brand to the database.
    *
    * @param brandId the primary key for the new entity brand
    * @return the new entity brand
    */
    public static com.consistent.ucwrt.model.EntityBrand create(int brandId) {
        return getPersistence().create(brandId);
    }

    /**
    * Removes the entity brand with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand remove(int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(brandId);
    }

    public static com.consistent.ucwrt.model.EntityBrand updateImpl(
        com.consistent.ucwrt.model.EntityBrand entityBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityBrand);
    }

    /**
    * Returns the entity brand with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityBrandException} if it could not be found.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand
    * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand findByPrimaryKey(
        int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(brandId);
    }

    /**
    * Returns the entity brand with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand, or <code>null</code> if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityBrand fetchByPrimaryKey(
        int brandId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(brandId);
    }

    /**
    * Returns all the entity brands.
    *
    * @return the entity brands
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityBrand> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity brands
    * @param end the upper bound of the range of entity brands (not inclusive)
    * @return the range of entity brands
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityBrand> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity brands
    * @param end the upper bound of the range of entity brands (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity brands
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityBrand> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity brands from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity brands.
    *
    * @return the number of entity brands
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityBrandPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityBrandPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityBrandPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityBrandUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityBrandPersistence persistence) {
    }
}
