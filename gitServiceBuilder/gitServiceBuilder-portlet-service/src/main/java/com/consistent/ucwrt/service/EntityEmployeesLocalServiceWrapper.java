package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEmployeesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployeesLocalService
 * @generated
 */
public class EntityEmployeesLocalServiceWrapper
    implements EntityEmployeesLocalService,
        ServiceWrapper<EntityEmployeesLocalService> {
    private EntityEmployeesLocalService _entityEmployeesLocalService;

    public EntityEmployeesLocalServiceWrapper(
        EntityEmployeesLocalService entityEmployeesLocalService) {
        _entityEmployeesLocalService = entityEmployeesLocalService;
    }

    /**
    * Adds the entity employees to the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmployees the entity employees
    * @return the entity employees that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployees addEntityEmployees(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.addEntityEmployees(entityEmployees);
    }

    /**
    * Creates a new entity employees with the primary key. Does not add the entity employees to the database.
    *
    * @param employeeId the primary key for the new entity employees
    * @return the new entity employees
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployees createEntityEmployees(
        int employeeId) {
        return _entityEmployeesLocalService.createEntityEmployees(employeeId);
    }

    /**
    * Deletes the entity employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees that was removed
    * @throws PortalException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployees deleteEntityEmployees(
        int employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.deleteEntityEmployees(employeeId);
    }

    /**
    * Deletes the entity employees from the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmployees the entity employees
    * @return the entity employees that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployees deleteEntityEmployees(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.deleteEntityEmployees(entityEmployees);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityEmployeesLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityEmployees fetchEntityEmployees(
        int employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.fetchEntityEmployees(employeeId);
    }

    /**
    * Returns the entity employees with the primary key.
    *
    * @param employeeId the primary key of the entity employees
    * @return the entity employees
    * @throws PortalException if a entity employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployees getEntityEmployees(
        int employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.getEntityEmployees(employeeId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityEmployees> getEntityEmployeeses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.getEntityEmployeeses(start, end);
    }

    /**
    * Returns the number of entity employeeses.
    *
    * @return the number of entity employeeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityEmployeesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.getEntityEmployeesesCount();
    }

    /**
    * Updates the entity employees in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityEmployees the entity employees
    * @return the entity employees that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployees updateEntityEmployees(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmployeesLocalService.updateEntityEmployees(entityEmployees);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEmployeesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEmployeesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEmployeesLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEmployeesLocalService getWrappedEntityEmployeesLocalService() {
        return _entityEmployeesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEmployeesLocalService(
        EntityEmployeesLocalService entityEmployeesLocalService) {
        _entityEmployeesLocalService = entityEmployeesLocalService;
    }

    @Override
    public EntityEmployeesLocalService getWrappedService() {
        return _entityEmployeesLocalService;
    }

    @Override
    public void setWrappedService(
        EntityEmployeesLocalService entityEmployeesLocalService) {
        _entityEmployeesLocalService = entityEmployeesLocalService;
    }
}
