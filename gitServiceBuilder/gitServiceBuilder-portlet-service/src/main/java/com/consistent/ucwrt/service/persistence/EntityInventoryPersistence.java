package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityInventory;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryPersistenceImpl
 * @see EntityInventoryUtil
 * @generated
 */
public interface EntityInventoryPersistence extends BasePersistence<EntityInventory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityInventoryUtil} to access the entity inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity inventories where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the matching entity inventories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> findByfindInventory(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> findByfindInventory(
        java.lang.String dealerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> findByfindInventory(
        java.lang.String dealerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory findByfindInventory_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity inventory, or <code>null</code> if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory fetchByfindInventory_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory findByfindInventory_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity inventory in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity inventory, or <code>null</code> if a matching entity inventory could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory fetchByfindInventory_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.consistent.ucwrt.model.EntityInventory[] findByfindInventory_PrevAndNext(
        EntityInventoryPK entityInventoryPK, java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity inventories where dealerId = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByfindInventory(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity inventories where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the number of matching entity inventories
    * @throws SystemException if a system exception occurred
    */
    public int countByfindInventory(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity inventory in the entity cache if it is enabled.
    *
    * @param entityInventory the entity inventory
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityInventory entityInventory);

    /**
    * Caches the entity inventories in the entity cache if it is enabled.
    *
    * @param entityInventories the entity inventories
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityInventory> entityInventories);

    /**
    * Creates a new entity inventory with the primary key. Does not add the entity inventory to the database.
    *
    * @param entityInventoryPK the primary key for the new entity inventory
    * @return the new entity inventory
    */
    public com.consistent.ucwrt.model.EntityInventory create(
        EntityInventoryPK entityInventoryPK);

    /**
    * Removes the entity inventory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory remove(
        EntityInventoryPK entityInventoryPK)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityInventory updateImpl(
        com.consistent.ucwrt.model.EntityInventory entityInventory)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity inventory with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityInventoryException} if it could not be found.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory
    * @throws com.consistent.ucwrt.NoSuchEntityInventoryException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory findByPrimaryKey(
        EntityInventoryPK entityInventoryPK)
        throws com.consistent.ucwrt.NoSuchEntityInventoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity inventory with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory, or <code>null</code> if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityInventory fetchByPrimaryKey(
        EntityInventoryPK entityInventoryPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity inventories.
    *
    * @return the entity inventories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity inventories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity inventories.
    *
    * @return the number of entity inventories
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
