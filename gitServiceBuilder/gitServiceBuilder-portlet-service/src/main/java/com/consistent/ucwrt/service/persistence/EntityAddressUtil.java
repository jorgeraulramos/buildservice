package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityAddress;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity address service. This utility wraps {@link EntityAddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddressPersistence
 * @see EntityAddressPersistenceImpl
 * @generated
 */
public class EntityAddressUtil {
    private static EntityAddressPersistence _persistence;

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
    public static void clearCache(EntityAddress entityAddress) {
        getPersistence().clearCache(entityAddress);
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
    public static List<EntityAddress> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityAddress> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityAddress> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityAddress update(EntityAddress entityAddress)
        throws SystemException {
        return getPersistence().update(entityAddress);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityAddress update(EntityAddress entityAddress,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityAddress, serviceContext);
    }

    /**
    * Returns all the entity addresses where clientId = &#63;.
    *
    * @param clientId the client ID
    * @return the matching entity addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityAddress> findByAddressByClientId(
        int clientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAddressByClientId(clientId);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityAddress> findByAddressByClientId(
        int clientId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAddressByClientId(clientId, start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityAddress> findByAddressByClientId(
        int clientId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAddressByClientId(clientId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress findByAddressByClientId_First(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAddressByClientId_First(clientId, orderByComparator);
    }

    /**
    * Returns the first entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity address, or <code>null</code> if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress fetchByAddressByClientId_First(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAddressByClientId_First(clientId, orderByComparator);
    }

    /**
    * Returns the last entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress findByAddressByClientId_Last(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAddressByClientId_Last(clientId, orderByComparator);
    }

    /**
    * Returns the last entity address in the ordered set where clientId = &#63;.
    *
    * @param clientId the client ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity address, or <code>null</code> if a matching entity address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress fetchByAddressByClientId_Last(
        int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAddressByClientId_Last(clientId, orderByComparator);
    }

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
    public static com.consistent.ucwrt.model.EntityAddress[] findByAddressByClientId_PrevAndNext(
        int addressId, int clientId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAddressByClientId_PrevAndNext(addressId, clientId,
            orderByComparator);
    }

    /**
    * Removes all the entity addresses where clientId = &#63; from the database.
    *
    * @param clientId the client ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByAddressByClientId(int clientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByAddressByClientId(clientId);
    }

    /**
    * Returns the number of entity addresses where clientId = &#63;.
    *
    * @param clientId the client ID
    * @return the number of matching entity addresses
    * @throws SystemException if a system exception occurred
    */
    public static int countByAddressByClientId(int clientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByAddressByClientId(clientId);
    }

    /**
    * Caches the entity address in the entity cache if it is enabled.
    *
    * @param entityAddress the entity address
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityAddress entityAddress) {
        getPersistence().cacheResult(entityAddress);
    }

    /**
    * Caches the entity addresses in the entity cache if it is enabled.
    *
    * @param entityAddresses the entity addresses
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityAddress> entityAddresses) {
        getPersistence().cacheResult(entityAddresses);
    }

    /**
    * Creates a new entity address with the primary key. Does not add the entity address to the database.
    *
    * @param addressId the primary key for the new entity address
    * @return the new entity address
    */
    public static com.consistent.ucwrt.model.EntityAddress create(int addressId) {
        return getPersistence().create(addressId);
    }

    /**
    * Removes the entity address with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress remove(int addressId)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(addressId);
    }

    public static com.consistent.ucwrt.model.EntityAddress updateImpl(
        com.consistent.ucwrt.model.EntityAddress entityAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityAddress);
    }

    /**
    * Returns the entity address with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityAddressException} if it could not be found.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address
    * @throws com.consistent.ucwrt.NoSuchEntityAddressException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress findByPrimaryKey(
        int addressId)
        throws com.consistent.ucwrt.NoSuchEntityAddressException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(addressId);
    }

    /**
    * Returns the entity address with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address, or <code>null</code> if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityAddress fetchByPrimaryKey(
        int addressId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(addressId);
    }

    /**
    * Returns all the entity addresses.
    *
    * @return the entity addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityAddress> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityAddress> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityAddress> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity addresses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity addresses.
    *
    * @return the number of entity addresses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityAddressPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityAddressPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityAddressPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityAddressUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityAddressPersistence persistence) {
    }
}
