package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySourceOfSupply;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity source of supply service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupplyPersistenceImpl
 * @see EntitySourceOfSupplyUtil
 * @generated
 */
public interface EntitySourceOfSupplyPersistence extends BasePersistence<EntitySourceOfSupply> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntitySourceOfSupplyUtil} to access the entity source of supply persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity source of supply in the entity cache if it is enabled.
    *
    * @param entitySourceOfSupply the entity source of supply
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply);

    /**
    * Caches the entity source of supplies in the entity cache if it is enabled.
    *
    * @param entitySourceOfSupplies the entity source of supplies
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> entitySourceOfSupplies);

    /**
    * Creates a new entity source of supply with the primary key. Does not add the entity source of supply to the database.
    *
    * @param sourceSupplyId the primary key for the new entity source of supply
    * @return the new entity source of supply
    */
    public com.consistent.ucwrt.model.EntitySourceOfSupply create(
        int sourceSupplyId);

    /**
    * Removes the entity source of supply with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySourceOfSupply remove(
        int sourceSupplyId)
        throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntitySourceOfSupply updateImpl(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity source of supply with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException} if it could not be found.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply
    * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySourceOfSupply findByPrimaryKey(
        int sourceSupplyId)
        throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity source of supply with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply, or <code>null</code> if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySourceOfSupply fetchByPrimaryKey(
        int sourceSupplyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity source of supplies.
    *
    * @return the entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity source of supplies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity source of supplies
    * @param end the upper bound of the range of entity source of supplies (not inclusive)
    * @return the range of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity source of supplies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity source of supplies
    * @param end the upper bound of the range of entity source of supplies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity source of supplies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity source of supplies.
    *
    * @return the number of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
