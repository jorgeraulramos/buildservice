package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityInventory;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity inventory service. This utility wraps {@link EntityInventoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryPersistence
 * @see EntityInventoryPersistenceImpl
 * @generated
 */
public class EntityInventoryUtil {
    private static EntityInventoryPersistence _persistence;

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
    public static void clearCache(EntityInventory entityInventory) {
        getPersistence().clearCache(entityInventory);
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
    public static List<EntityInventory> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityInventory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityInventory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityInventory update(EntityInventory entityInventory)
        throws SystemException {
        return getPersistence().update(entityInventory);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityInventory update(EntityInventory entityInventory,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityInventory, serviceContext);
    }

    /**
    * Returns all the entity inventories where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the matching entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventory> findByfindInventory(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfindInventory(dealerId);
    }

    /**
    * Returns a range of all the entity inventories where dealerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param start the lower bound of the range of entity inventories
    * @param end the upper bound of the range of entity inventories (not inclusive)
    * @return the range of matching entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventory> findByfindInventory(
        java.lang.String dealerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfindInventory(dealerId, start, end);
    }

    /**
    * Returns an ordered range of all the entity inventories where dealerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param start the lower bound of the range of entity inventories
    * @param end the upper bound of the range of entity inventories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventory> findByfindInventory(
        java.lang.String dealerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfindInventory(dealerId, start, end, orderByComparator);
    }

    /**
    * Returns the first entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory findByfindInventory_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfindInventory_First(dealerId, orderByComparator);
    }

    /**
    * Returns the first entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity inventory, or <code>null</code> if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory fetchByfindInventory_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfindInventory_First(dealerId, orderByComparator);
    }

    /**
    * Returns the last entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory findByfindInventory_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfindInventory_Last(dealerId, orderByComparator);
    }

    /**
    * Returns the last entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity inventory, or <code>null</code> if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory fetchByfindInventory_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfindInventory_Last(dealerId, orderByComparator);
    }

    /**
    * Returns the entity inventories before and after the current entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param entityInventoryPK the primary key of the current entity inventory
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory[] findByfindInventory_PrevAndNext(
        EntityInventoryPK entityInventoryPK, java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfindInventory_PrevAndNext(entityInventoryPK,
            dealerId, orderByComparator);
    }

    /**
    * Removes all the entity inventories where dealerId = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByfindInventory(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByfindInventory(dealerId);
    }

    /**
    * Returns the number of entity inventories where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the number of matching entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static int countByfindInventory(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByfindInventory(dealerId);
    }

    /**
    * Caches the entity inventory in the entity cache if it is enabled.
    *
    * @param entityInventory the entity inventory
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityInventory entityInventory) {
        getPersistence().cacheResult(entityInventory);
    }

    /**
    * Caches the entity inventories in the entity cache if it is enabled.
    *
    * @param entityInventories the entity inventories
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityInventory> entityInventories) {
        getPersistence().cacheResult(entityInventories);
    }

    /**
    * Creates a new entity inventory with the primary key. Does not add the entity inventory to the database.
    *
    * @param entityInventoryPK the primary key for the new entity inventory
    * @return the new entity inventory
    */
    public static com.consistent.ucwrt.model.EntityInventory create(
        EntityInventoryPK entityInventoryPK) {
        return getPersistence().create(entityInventoryPK);
    }

    /**
    * Removes the entity inventory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory remove(
        EntityInventoryPK entityInventoryPK)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityInventoryPK);
    }

    public static com.consistent.ucwrt.model.EntityInventory updateImpl(
        com.consistent.ucwrt.model.EntityInventory entityInventory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityInventory);
    }

    /**
    * Returns the entity inventory with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityInventoryException} if it could not be found.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory findByPrimaryKey(
        EntityInventoryPK entityInventoryPK)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityInventoryPK);
    }

    /**
    * Returns the entity inventory with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory, or <code>null</code> if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityInventory fetchByPrimaryKey(
        EntityInventoryPK entityInventoryPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityInventoryPK);
    }

    /**
    * Returns all the entity inventories.
    *
    * @return the entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity inventories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity inventories
    * @param end the upper bound of the range of entity inventories (not inclusive)
    * @return the range of entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity inventories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity inventories
    * @param end the upper bound of the range of entity inventories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityInventory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity inventories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity inventories.
    *
    * @return the number of entity inventories
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityInventoryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityInventoryPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityInventoryPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityInventoryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityInventoryPersistence persistence) {
    }
}
