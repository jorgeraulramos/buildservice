package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEmployees;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity employees service. This utility wraps {@link EntityEmployeesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployeesPersistence
 * @see EntityEmployeesPersistenceImpl
 * @generated
 */
public class EntityEmployeesUtil {
    private static EntityEmployeesPersistence _persistence;

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
    public static void clearCache(EntityEmployees entityEmployees) {
        getPersistence().clearCache(entityEmployees);
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
    public static List<EntityEmployees> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityEmployees> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityEmployees> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityEmployees update(EntityEmployees entityEmployees)
        throws SystemException {
        return getPersistence().update(entityEmployees);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityEmployees update(EntityEmployees entityEmployees,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityEmployees, serviceContext);
    }

    /**
    * Returns all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @return the matching entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployees> findByEmployees(
        java.lang.String dealerId, java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmployees(dealerId, businessBrandName);
    }

    /**
    * Returns a range of all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param start the lower bound of the range of entity employeeses
    * @param end the upper bound of the range of entity employeeses (not inclusive)
    * @return the range of matching entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployees> findByEmployees(
        java.lang.String dealerId, java.lang.String businessBrandName,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmployees(dealerId, businessBrandName, start, end);
    }

    /**
    * Returns an ordered range of all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param start the lower bound of the range of entity employeeses
    * @param end the upper bound of the range of entity employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployees> findByEmployees(
        java.lang.String dealerId, java.lang.String businessBrandName,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmployees(dealerId, businessBrandName, start, end,
            orderByComparator);
    }

    /**
    * Returns the first entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity employees
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a matching entity employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees findByEmployees_First(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmployees_First(dealerId, businessBrandName,
            orderByComparator);
    }

    /**
    * Returns the first entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity employees, or <code>null</code> if a matching entity employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees fetchByEmployees_First(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmployees_First(dealerId, businessBrandName,
            orderByComparator);
    }

    /**
    * Returns the last entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity employees
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a matching entity employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees findByEmployees_Last(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmployees_Last(dealerId, businessBrandName,
            orderByComparator);
    }

    /**
    * Returns the last entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity employees, or <code>null</code> if a matching entity employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees fetchByEmployees_Last(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmployees_Last(dealerId, businessBrandName,
            orderByComparator);
    }

    /**
    * Returns the entity employeeses before and after the current entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param employeeId the primary key of the current entity employees
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity employees
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees[] findByEmployees_PrevAndNext(
        int employeeId, java.lang.String dealerId,
        java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmployees_PrevAndNext(employeeId, dealerId,
            businessBrandName, orderByComparator);
    }

    /**
    * Removes all the entity employeeses where dealerId = &#63; and businessBrandName = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByEmployees(java.lang.String dealerId,
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByEmployees(dealerId, businessBrandName);
    }

    /**
    * Returns the number of entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @return the number of matching entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmployees(java.lang.String dealerId,
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmployees(dealerId, businessBrandName);
    }

    /**
    * Caches the entity employees in the entity cache if it is enabled.
    *
    * @param entityEmployees the entity employees
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees) {
        getPersistence().cacheResult(entityEmployees);
    }

    /**
    * Caches the entity employeeses in the entity cache if it is enabled.
    *
    * @param entityEmployeeses the entity employeeses
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityEmployees> entityEmployeeses) {
        getPersistence().cacheResult(entityEmployeeses);
    }

    /**
    * Creates a new entity employees with the primary key. Does not add the entity employees to the database.
    *
    * @param employeeId the primary key for the new entity employees
    * @return the new entity employees
    */
    public static com.consistent.ucwrt.model.EntityEmployees create(
        int employeeId) {
        return getPersistence().create(employeeId);
    }

    /**
    * Removes the entity employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees remove(
        int employeeId)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(employeeId);
    }

    public static com.consistent.ucwrt.model.EntityEmployees updateImpl(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityEmployees);
    }

    /**
    * Returns the entity employees with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEmployeesException} if it could not be found.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees findByPrimaryKey(
        int employeeId)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(employeeId);
    }

    /**
    * Returns the entity employees with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees, or <code>null</code> if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployees fetchByPrimaryKey(
        int employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employeeId);
    }

    /**
    * Returns all the entity employeeses.
    *
    * @return the entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployees> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity employeeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity employeeses
    * @param end the upper bound of the range of entity employeeses (not inclusive)
    * @return the range of entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployees> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity employeeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity employeeses
    * @param end the upper bound of the range of entity employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployees> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity employeeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity employeeses.
    *
    * @return the number of entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityEmployeesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityEmployeesPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityEmployeesPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityEmployeesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityEmployeesPersistence persistence) {
    }
}
