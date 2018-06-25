package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEmployees;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity employees service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployeesPersistenceImpl
 * @see EntityEmployeesUtil
 * @generated
 */
public interface EntityEmployeesPersistence extends BasePersistence<EntityEmployees> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityEmployeesUtil} to access the entity employees persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @return the matching entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> findByEmployees(
        java.lang.String dealerId, java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> findByEmployees(
        java.lang.String dealerId, java.lang.String businessBrandName,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> findByEmployees(
        java.lang.String dealerId, java.lang.String businessBrandName,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.consistent.ucwrt.model.EntityEmployees findByEmployees_First(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity employees, or <code>null</code> if a matching entity employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployees fetchByEmployees_First(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.consistent.ucwrt.model.EntityEmployees findByEmployees_Last(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity employees, or <code>null</code> if a matching entity employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployees fetchByEmployees_Last(
        java.lang.String dealerId, java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.consistent.ucwrt.model.EntityEmployees[] findByEmployees_PrevAndNext(
        int employeeId, java.lang.String dealerId,
        java.lang.String businessBrandName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity employeeses where dealerId = &#63; and businessBrandName = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @throws SystemException if a system exception occurred
    */
    public void removeByEmployees(java.lang.String dealerId,
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
    *
    * @param dealerId the dealer ID
    * @param businessBrandName the business brand name
    * @return the number of matching entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public int countByEmployees(java.lang.String dealerId,
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity employees in the entity cache if it is enabled.
    *
    * @param entityEmployees the entity employees
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees);

    /**
    * Caches the entity employeeses in the entity cache if it is enabled.
    *
    * @param entityEmployeeses the entity employeeses
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityEmployees> entityEmployeeses);

    /**
    * Creates a new entity employees with the primary key. Does not add the entity employees to the database.
    *
    * @param employeeId the primary key for the new entity employees
    * @return the new entity employees
    */
    public com.consistent.ucwrt.model.EntityEmployees create(int employeeId);

    /**
    * Removes the entity employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployees remove(int employeeId)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityEmployees updateImpl(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity employees with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEmployeesException} if it could not be found.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees
    * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployees findByPrimaryKey(
        int employeeId)
        throws com.consistent.ucwrt.NoSuchEntityEmployeesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity employees with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees, or <code>null</code> if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployees fetchByPrimaryKey(
        int employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity employeeses.
    *
    * @return the entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity employeeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity employeeses.
    *
    * @return the number of entity employeeses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
