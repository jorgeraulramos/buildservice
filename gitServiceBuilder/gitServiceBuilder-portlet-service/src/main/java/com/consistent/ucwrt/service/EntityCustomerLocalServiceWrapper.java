package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityCustomerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityCustomerLocalService
 * @generated
 */
public class EntityCustomerLocalServiceWrapper
    implements EntityCustomerLocalService,
        ServiceWrapper<EntityCustomerLocalService> {
    private EntityCustomerLocalService _entityCustomerLocalService;

    public EntityCustomerLocalServiceWrapper(
        EntityCustomerLocalService entityCustomerLocalService) {
        _entityCustomerLocalService = entityCustomerLocalService;
    }

    /**
    * Adds the entity customer to the database. Also notifies the appropriate model listeners.
    *
    * @param entityCustomer the entity customer
    * @return the entity customer that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityCustomer addEntityCustomer(
        com.consistent.ucwrt.model.EntityCustomer entityCustomer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.addEntityCustomer(entityCustomer);
    }

    /**
    * Creates a new entity customer with the primary key. Does not add the entity customer to the database.
    *
    * @param clientId the primary key for the new entity customer
    * @return the new entity customer
    */
    @Override
    public com.consistent.ucwrt.model.EntityCustomer createEntityCustomer(
        int clientId) {
        return _entityCustomerLocalService.createEntityCustomer(clientId);
    }

    /**
    * Deletes the entity customer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param clientId the primary key of the entity customer
    * @return the entity customer that was removed
    * @throws PortalException if a entity customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityCustomer deleteEntityCustomer(
        int clientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.deleteEntityCustomer(clientId);
    }

    /**
    * Deletes the entity customer from the database. Also notifies the appropriate model listeners.
    *
    * @param entityCustomer the entity customer
    * @return the entity customer that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityCustomer deleteEntityCustomer(
        com.consistent.ucwrt.model.EntityCustomer entityCustomer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.deleteEntityCustomer(entityCustomer);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityCustomerLocalService.dynamicQuery();
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
        return _entityCustomerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityCustomerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityCustomerLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityCustomerLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityCustomerLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityCustomer fetchEntityCustomer(
        int clientId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.fetchEntityCustomer(clientId);
    }

    /**
    * Returns the entity customer with the primary key.
    *
    * @param clientId the primary key of the entity customer
    * @return the entity customer
    * @throws PortalException if a entity customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityCustomer getEntityCustomer(
        int clientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.getEntityCustomer(clientId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityCustomer> getEntityCustomers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.getEntityCustomers(start, end);
    }

    /**
    * Returns the number of entity customers.
    *
    * @return the number of entity customers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityCustomersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.getEntityCustomersCount();
    }

    /**
    * Updates the entity customer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityCustomer the entity customer
    * @return the entity customer that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityCustomer updateEntityCustomer(
        com.consistent.ucwrt.model.EntityCustomer entityCustomer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityCustomerLocalService.updateEntityCustomer(entityCustomer);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityCustomerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityCustomerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityCustomerLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityCustomerLocalService getWrappedEntityCustomerLocalService() {
        return _entityCustomerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityCustomerLocalService(
        EntityCustomerLocalService entityCustomerLocalService) {
        _entityCustomerLocalService = entityCustomerLocalService;
    }

    @Override
    public EntityCustomerLocalService getWrappedService() {
        return _entityCustomerLocalService;
    }

    @Override
    public void setWrappedService(
        EntityCustomerLocalService entityCustomerLocalService) {
        _entityCustomerLocalService = entityCustomerLocalService;
    }
}
