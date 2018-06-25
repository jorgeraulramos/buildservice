package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityDepartment;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartmentPersistenceImpl
 * @see EntityDepartmentUtil
 * @generated
 */
public interface EntityDepartmentPersistence extends BasePersistence<EntityDepartment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityDepartmentUtil} to access the entity department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity department in the entity cache if it is enabled.
    *
    * @param entityDepartment the entity department
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityDepartment entityDepartment);

    /**
    * Caches the entity departments in the entity cache if it is enabled.
    *
    * @param entityDepartments the entity departments
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityDepartment> entityDepartments);

    /**
    * Creates a new entity department with the primary key. Does not add the entity department to the database.
    *
    * @param entityDepartmentPK the primary key for the new entity department
    * @return the new entity department
    */
    public com.consistent.ucwrt.model.EntityDepartment create(
        EntityDepartmentPK entityDepartmentPK);

    /**
    * Removes the entity department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityDepartmentPK the primary key of the entity department
    * @return the entity department that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDepartment remove(
        EntityDepartmentPK entityDepartmentPK)
        throws com.consistent.ucwrt.NoSuchEntityDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityDepartment updateImpl(
        com.consistent.ucwrt.model.EntityDepartment entityDepartment)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity department with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityDepartmentException} if it could not be found.
    *
    * @param entityDepartmentPK the primary key of the entity department
    * @return the entity department
    * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDepartment findByPrimaryKey(
        EntityDepartmentPK entityDepartmentPK)
        throws com.consistent.ucwrt.NoSuchEntityDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity department with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityDepartmentPK the primary key of the entity department
    * @return the entity department, or <code>null</code> if a entity department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDepartment fetchByPrimaryKey(
        EntityDepartmentPK entityDepartmentPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity departments.
    *
    * @return the entity departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDepartment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity departments
    * @param end the upper bound of the range of entity departments (not inclusive)
    * @return the range of entity departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDepartment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity departments
    * @param end the upper bound of the range of entity departments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDepartment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity departments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity departments.
    *
    * @return the number of entity departments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
