package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityGParameterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameterLocalService
 * @generated
 */
public class EntityGParameterLocalServiceWrapper
    implements EntityGParameterLocalService,
        ServiceWrapper<EntityGParameterLocalService> {
    private EntityGParameterLocalService _entityGParameterLocalService;

    public EntityGParameterLocalServiceWrapper(
        EntityGParameterLocalService entityGParameterLocalService) {
        _entityGParameterLocalService = entityGParameterLocalService;
    }

    /**
    * Adds the entity g parameter to the database. Also notifies the appropriate model listeners.
    *
    * @param entityGParameter the entity g parameter
    * @return the entity g parameter that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityGParameter addEntityGParameter(
        com.consistent.ucwrt.model.EntityGParameter entityGParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.addEntityGParameter(entityGParameter);
    }

    /**
    * Creates a new entity g parameter with the primary key. Does not add the entity g parameter to the database.
    *
    * @param parameterName the primary key for the new entity g parameter
    * @return the new entity g parameter
    */
    @Override
    public com.consistent.ucwrt.model.EntityGParameter createEntityGParameter(
        java.lang.String parameterName) {
        return _entityGParameterLocalService.createEntityGParameter(parameterName);
    }

    /**
    * Deletes the entity g parameter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param parameterName the primary key of the entity g parameter
    * @return the entity g parameter that was removed
    * @throws PortalException if a entity g parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityGParameter deleteEntityGParameter(
        java.lang.String parameterName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.deleteEntityGParameter(parameterName);
    }

    /**
    * Deletes the entity g parameter from the database. Also notifies the appropriate model listeners.
    *
    * @param entityGParameter the entity g parameter
    * @return the entity g parameter that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityGParameter deleteEntityGParameter(
        com.consistent.ucwrt.model.EntityGParameter entityGParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.deleteEntityGParameter(entityGParameter);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityGParameterLocalService.dynamicQuery();
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
        return _entityGParameterLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityGParameterLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityGParameterLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityGParameterLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityGParameterLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityGParameter fetchEntityGParameter(
        java.lang.String parameterName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.fetchEntityGParameter(parameterName);
    }

    /**
    * Returns the entity g parameter with the primary key.
    *
    * @param parameterName the primary key of the entity g parameter
    * @return the entity g parameter
    * @throws PortalException if a entity g parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityGParameter getEntityGParameter(
        java.lang.String parameterName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.getEntityGParameter(parameterName);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity g parameters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity g parameters
    * @param end the upper bound of the range of entity g parameters (not inclusive)
    * @return the range of entity g parameters
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityGParameter> getEntityGParameters(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.getEntityGParameters(start, end);
    }

    /**
    * Returns the number of entity g parameters.
    *
    * @return the number of entity g parameters
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityGParametersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.getEntityGParametersCount();
    }

    /**
    * Updates the entity g parameter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityGParameter the entity g parameter
    * @return the entity g parameter that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityGParameter updateEntityGParameter(
        com.consistent.ucwrt.model.EntityGParameter entityGParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityGParameterLocalService.updateEntityGParameter(entityGParameter);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityGParameterLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityGParameterLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityGParameterLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityGParameterLocalService getWrappedEntityGParameterLocalService() {
        return _entityGParameterLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityGParameterLocalService(
        EntityGParameterLocalService entityGParameterLocalService) {
        _entityGParameterLocalService = entityGParameterLocalService;
    }

    @Override
    public EntityGParameterLocalService getWrappedService() {
        return _entityGParameterLocalService;
    }

    @Override
    public void setWrappedService(
        EntityGParameterLocalService entityGParameterLocalService) {
        _entityGParameterLocalService = entityGParameterLocalService;
    }
}
