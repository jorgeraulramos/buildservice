package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySale;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity sale service. This utility wraps {@link EntitySalePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalePersistence
 * @see EntitySalePersistenceImpl
 * @generated
 */
public class EntitySaleUtil {
    private static EntitySalePersistence _persistence;

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
    public static void clearCache(EntitySale entitySale) {
        getPersistence().clearCache(entitySale);
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
    public static List<EntitySale> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntitySale> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntitySale> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntitySale update(EntitySale entitySale)
        throws SystemException {
        return getPersistence().update(entitySale);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntitySale update(EntitySale entitySale,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entitySale, serviceContext);
    }

    /**
    * Caches the entity sale in the entity cache if it is enabled.
    *
    * @param entitySale the entity sale
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntitySale entitySale) {
        getPersistence().cacheResult(entitySale);
    }

    /**
    * Caches the entity sales in the entity cache if it is enabled.
    *
    * @param entitySales the entity sales
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySale> entitySales) {
        getPersistence().cacheResult(entitySales);
    }

    /**
    * Creates a new entity sale with the primary key. Does not add the entity sale to the database.
    *
    * @param saleId the primary key for the new entity sale
    * @return the new entity sale
    */
    public static com.consistent.ucwrt.model.EntitySale create(int saleId) {
        return getPersistence().create(saleId);
    }

    /**
    * Removes the entity sale with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySale remove(int saleId)
        throws com.consistent.ucwrt.NoSuchEntitySaleException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(saleId);
    }

    public static com.consistent.ucwrt.model.EntitySale updateImpl(
        com.consistent.ucwrt.model.EntitySale entitySale)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entitySale);
    }

    /**
    * Returns the entity sale with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySaleException} if it could not be found.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale
    * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySale findByPrimaryKey(
        int saleId)
        throws com.consistent.ucwrt.NoSuchEntitySaleException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(saleId);
    }

    /**
    * Returns the entity sale with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale, or <code>null</code> if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySale fetchByPrimaryKey(
        int saleId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(saleId);
    }

    /**
    * Returns all the entity sales.
    *
    * @return the entity sales
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySale> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity sales.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales
    * @param end the upper bound of the range of entity sales (not inclusive)
    * @return the range of entity sales
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySale> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity sales.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales
    * @param end the upper bound of the range of entity sales (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity sales
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySale> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity sales from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity sales.
    *
    * @return the number of entity sales
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntitySalePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntitySalePersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntitySalePersistence.class.getName());

            ReferenceRegistry.registerReference(EntitySaleUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntitySalePersistence persistence) {
    }
}
