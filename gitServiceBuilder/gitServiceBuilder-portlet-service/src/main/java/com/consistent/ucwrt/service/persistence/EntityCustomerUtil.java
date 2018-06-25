package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityCustomer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity customer service. This utility wraps {@link EntityCustomerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityCustomerPersistence
 * @see EntityCustomerPersistenceImpl
 * @generated
 */
public class EntityCustomerUtil {
    private static EntityCustomerPersistence _persistence;

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
    public static void clearCache(EntityCustomer entityCustomer) {
        getPersistence().clearCache(entityCustomer);
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
    public static List<EntityCustomer> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityCustomer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityCustomer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityCustomer update(EntityCustomer entityCustomer)
        throws SystemException {
        return getPersistence().update(entityCustomer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityCustomer update(EntityCustomer entityCustomer,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityCustomer, serviceContext);
    }

    /**
    * Returns the entity customer where rfc = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityCustomerException} if it could not be found.
    *
    * @param rfc the rfc
    * @return the matching entity customer
    * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer findBygetRFC(
        java.lang.String rfc)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygetRFC(rfc);
    }

    /**
    * Returns the entity customer where rfc = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param rfc the rfc
    * @return the matching entity customer, or <code>null</code> if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer fetchBygetRFC(
        java.lang.String rfc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygetRFC(rfc);
    }

    /**
    * Returns the entity customer where rfc = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param rfc the rfc
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity customer, or <code>null</code> if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer fetchBygetRFC(
        java.lang.String rfc, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygetRFC(rfc, retrieveFromCache);
    }

    /**
    * Removes the entity customer where rfc = &#63; from the database.
    *
    * @param rfc the rfc
    * @return the entity customer that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer removeBygetRFC(
        java.lang.String rfc)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeBygetRFC(rfc);
    }

    /**
    * Returns the number of entity customers where rfc = &#63;.
    *
    * @param rfc the rfc
    * @return the number of matching entity customers
    * @throws SystemException if a system exception occurred
    */
    public static int countBygetRFC(java.lang.String rfc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygetRFC(rfc);
    }

    /**
    * Returns all the entity customers where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the matching entity customers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityCustomer> findByCustomer(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomer(dealerId);
    }

    /**
    * Returns a range of all the entity customers where dealerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param start the lower bound of the range of entity customers
    * @param end the upper bound of the range of entity customers (not inclusive)
    * @return the range of matching entity customers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityCustomer> findByCustomer(
        java.lang.String dealerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomer(dealerId, start, end);
    }

    /**
    * Returns an ordered range of all the entity customers where dealerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param start the lower bound of the range of entity customers
    * @param end the upper bound of the range of entity customers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity customers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityCustomer> findByCustomer(
        java.lang.String dealerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomer(dealerId, start, end, orderByComparator);
    }

    /**
    * Returns the first entity customer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity customer
    * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer findByCustomer_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomer_First(dealerId, orderByComparator);
    }

    /**
    * Returns the first entity customer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity customer, or <code>null</code> if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer fetchByCustomer_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomer_First(dealerId, orderByComparator);
    }

    /**
    * Returns the last entity customer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity customer
    * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer findByCustomer_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomer_Last(dealerId, orderByComparator);
    }

    /**
    * Returns the last entity customer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity customer, or <code>null</code> if a matching entity customer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer fetchByCustomer_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByCustomer_Last(dealerId, orderByComparator);
    }

    /**
    * Returns the entity customers before and after the current entity customer in the ordered set where dealerId = &#63;.
    *
    * @param clientId the primary key of the current entity customer
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity customer
    * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer[] findByCustomer_PrevAndNext(
        int clientId, java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomer_PrevAndNext(clientId, dealerId,
            orderByComparator);
    }

    /**
    * Removes all the entity customers where dealerId = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCustomer(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCustomer(dealerId);
    }

    /**
    * Returns the number of entity customers where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the number of matching entity customers
    * @throws SystemException if a system exception occurred
    */
    public static int countByCustomer(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCustomer(dealerId);
    }

    /**
    * Caches the entity customer in the entity cache if it is enabled.
    *
    * @param entityCustomer the entity customer
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityCustomer entityCustomer) {
        getPersistence().cacheResult(entityCustomer);
    }

    /**
    * Caches the entity customers in the entity cache if it is enabled.
    *
    * @param entityCustomers the entity customers
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityCustomer> entityCustomers) {
        getPersistence().cacheResult(entityCustomers);
    }

    /**
    * Creates a new entity customer with the primary key. Does not add the entity customer to the database.
    *
    * @param clientId the primary key for the new entity customer
    * @return the new entity customer
    */
    public static com.consistent.ucwrt.model.EntityCustomer create(int clientId) {
        return getPersistence().create(clientId);
    }

    /**
    * Removes the entity customer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param clientId the primary key of the entity customer
    * @return the entity customer that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer remove(int clientId)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(clientId);
    }

    public static com.consistent.ucwrt.model.EntityCustomer updateImpl(
        com.consistent.ucwrt.model.EntityCustomer entityCustomer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityCustomer);
    }

    /**
    * Returns the entity customer with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityCustomerException} if it could not be found.
    *
    * @param clientId the primary key of the entity customer
    * @return the entity customer
    * @throws com.consistent.ucwrt.NoSuchEntityCustomerException if a entity customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer findByPrimaryKey(
        int clientId)
        throws com.consistent.ucwrt.NoSuchEntityCustomerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(clientId);
    }

    /**
    * Returns the entity customer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param clientId the primary key of the entity customer
    * @return the entity customer, or <code>null</code> if a entity customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityCustomer fetchByPrimaryKey(
        int clientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(clientId);
    }

    /**
    * Returns all the entity customers.
    *
    * @return the entity customers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityCustomer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity customers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity customers
    * @param end the upper bound of the range of entity customers (not inclusive)
    * @return the range of entity customers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityCustomer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity customers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity customers
    * @param end the upper bound of the range of entity customers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity customers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityCustomer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity customers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity customers.
    *
    * @return the number of entity customers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityCustomerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityCustomerPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityCustomerPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityCustomerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityCustomerPersistence persistence) {
    }
}
