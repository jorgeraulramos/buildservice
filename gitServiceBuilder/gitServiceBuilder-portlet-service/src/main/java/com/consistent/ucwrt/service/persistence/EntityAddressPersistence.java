package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityAddress;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddressPersistenceImpl
 * @see EntityAddressUtil
 * @generated
 */
public interface EntityAddressPersistence extends BasePersistence<EntityAddress> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityAddressUtil} to access the entity address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity addresses where clientId = &#63;.
    *
    * @param clientId the client ID
    * @return the matching entity addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> findByAddressByClientId(
        int clientId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity addresses where clientId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param clientId the client ID
    * @param start the lower bound of the range of entity addresses
    * @param end the upper bound of the range of entity addresses (not inclusive)
    * @return the range of matching entity addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> findByAddressByClientId(
        int clientId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity addresses where clientId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param clientId the client ID
    * @param start the lower bound of the range of entity addresses
    * @param end the upper bound of the range of entity addresses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> findByAddressByClientId(
        int clientId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress findByAddressByClientId_First(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity address, or <code>null</code> if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress fetchByAddressByClientId_First(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress findByAddressByClientId_Last(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity address, or <code>null</code> if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress fetchByAddressByClientId_Last(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity addresses before and after the current entity address in the ordered set where clientId = &#63;.
    *
    * @param addressId the primary key of the current entity address
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress[] findByAddressByClientId_PrevAndNext(
        int addressId, int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity addresses where clientId = &#63; from the database.
    *
    * @param clientId the client ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByAddressByClientId(int clientId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity addresses where clientId = &#63;.
    *
    * @param clientId the client ID
    * @return the number of matching entity addresses
    * @throws SystemException if a system exception occurred
    */
    public int countByAddressByClientId(int clientId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity address in the entity cache if it is enabled.
    *
    * @param entityAddress the entity address
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityAddress entityAddress);

    /**
    * Caches the entity addresses in the entity cache if it is enabled.
    *
    * @param entityAddresses the entity addresses
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityAddress> entityAddresses);

    /**
    * Creates a new entity address with the primary key. Does not add the entity address to the database.
    *
    * @param addressId the primary key for the new entity address
    * @return the new entity address
    */
    public com.consistent.ucwrt.model.EntityAddress create(int addressId);

    /**
    * Removes the entity address with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress remove(int addressId)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityAddress updateImpl(
        com.consistent.ucwrt.model.EntityAddress entityAddress)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity address with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityAddressException} if it could not be found.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress findByPrimaryKey(
        int addressId)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity address with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address, or <code>null</code> if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityAddress fetchByPrimaryKey(
        int addressId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity addresses.
    *
    * @return the entity addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity addresses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity addresses
    * @param end the upper bound of the range of entity addresses (not inclusive)
    * @return the range of entity addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity addresses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity addresses
    * @param end the upper bound of the range of entity addresses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity addresses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity addresses.
    *
    * @return the number of entity addresses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
