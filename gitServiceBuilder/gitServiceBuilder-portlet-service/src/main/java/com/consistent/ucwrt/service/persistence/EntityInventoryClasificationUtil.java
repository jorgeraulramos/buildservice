package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityInventoryClasification;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity inventory clasification service. This utility wraps {@link EntityInventoryClasificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryClasificationPersistence
 * @see EntityInventoryClasificationPersistenceImpl
 * @generated
 */
public class EntityInventoryClasificationUtil {
    private static EntityInventoryClasificationPersistence _persistence;

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
    public static void clearCache(
        EntityInventoryClasification entityInventoryClasification) {
        getPersistence().clearCache(entityInventoryClasification);
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
    public static List<EntityInventoryClasification> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityInventoryClasification> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityInventoryClasification> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityInventoryClasification update(
        EntityInventoryClasification entityInventoryClasification)
        throws SystemException {
        return getPersistence().update(entityInventoryClasification);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityInventoryClasification update(
        EntityInventoryClasification entityInventoryClasification,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence()
                   .update(entityInventoryClasification, serviceContext);
    }

    /**
    * Caches the entity inventory clasification in the entity cache if it is enabled.
    *
    * @param entityInventoryClasification the entity inventory clasification
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityInventoryClasification entityInventoryClasification) {
        getPersistence().cacheResult(entityInventoryClasification);
    }

    /**
    * Caches the entity inventory clasifications in the entity cache if it is enabled.
    *
    * @param entityInventoryClasifications the entity inventory clasifications
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityInventoryClasification> entityInventoryClasifications) {
        getPersistence().cacheResult(entityInventoryClasifications);
    }

    /**
    * Creates a new entity inventory clasification with the primary key. Does not add the entity inventory clasification to the database.
    *
    * @param inventoryClasificationId the primary key for the new entity inventory clasification
    * @return the new entity inventory clasification
    */
    public static com.consistent.ucwrt.model.EntityInventoryClasification create(
        int inventoryClasificationId) {
        return getPersistence().create(inventoryClasificationId);
    }

    /**
    * Removes the entity inventory clasification with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param inventoryClasificationId the primary key of the entity inventory clasification
    * @return the entity inventory clasification that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException if a entity inventory clasification with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventoryClasification remove(
        int inventoryClasificationId)
        throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(inventoryClasificationId);
    }

    public static com.consistent.ucwrt.model.EntityInventoryClasification updateImpl(
        com.consistent.ucwrt.model.EntityInventoryClasification entityInventoryClasification)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityInventoryClasification);
    }

    /**
    * Returns the entity inventory clasification with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityInventoryClasificationException} if it could not be found.
    *
    * @param inventoryClasificationId the primary key of the entity inventory clasification
    * @return the entity inventory clasification
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException if a entity inventory clasification with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventoryClasification findByPrimaryKey(
        int inventoryClasificationId)
        throws com.consistent.ucwrt.NoSuchEntityInventoryClasificationException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(inventoryClasificationId);
    }

    /**
    * Returns the entity inventory clasification with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param inventoryClasificationId the primary key of the entity inventory clasification
    * @return the entity inventory clasification, or <code>null</code> if a entity inventory clasification with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventoryClasification fetchByPrimaryKey(
        int inventoryClasificationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(inventoryClasificationId);
    }

    /**
    * Returns all the entity inventory clasifications.
    *
    * @return the entity inventory clasifications
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventoryClasification> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity inventory clasifications.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity inventory clasifications
    * @param end the upper bound of the range of entity inventory clasifications (not inclusive)
    * @return the range of entity inventory clasifications
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventoryClasification> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity inventory clasifications.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity inventory clasifications
    * @param end the upper bound of the range of entity inventory clasifications (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity inventory clasifications
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventoryClasification> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity inventory clasifications from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity inventory clasifications.
    *
    * @return the number of entity inventory clasifications
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityInventoryClasificationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityInventoryClasificationPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityInventoryClasificationPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityInventoryClasificationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(
        EntityInventoryClasificationPersistence persistence) {
    }
}
