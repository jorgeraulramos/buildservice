package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityStatusLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatusLocalService
 * @generated
 */
public class EntityStatusLocalServiceWrapper implements EntityStatusLocalService,
    ServiceWrapper<EntityStatusLocalService> {
    private EntityStatusLocalService _entityStatusLocalService;

    public EntityStatusLocalServiceWrapper(
        EntityStatusLocalService entityStatusLocalService) {
        _entityStatusLocalService = entityStatusLocalService;
    }

    /**
    * Adds the entity status to the database. Also notifies the appropriate model listeners.
    *
    * @param entityStatus the entity status
    * @return the entity status that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityStatus addEntityStatus(
        com.consistent.ucwrt.model.EntityStatus entityStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.addEntityStatus(entityStatus);
    }

    /**
    * Creates a new entity status with the primary key. Does not add the entity status to the database.
    *
    * @param statusName the primary key for the new entity status
    * @return the new entity status
    */
    @Override
    public com.consistent.ucwrt.model.EntityStatus createEntityStatus(
        java.lang.String statusName) {
        return _entityStatusLocalService.createEntityStatus(statusName);
    }

    /**
    * Deletes the entity status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status that was removed
    * @throws PortalException if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityStatus deleteEntityStatus(
        java.lang.String statusName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.deleteEntityStatus(statusName);
    }

    /**
    * Deletes the entity status from the database. Also notifies the appropriate model listeners.
    *
    * @param entityStatus the entity status
    * @return the entity status that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityStatus deleteEntityStatus(
        com.consistent.ucwrt.model.EntityStatus entityStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.deleteEntityStatus(entityStatus);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityStatusLocalService.dynamicQuery();
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
        return _entityStatusLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityStatusLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityStatusLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _entityStatusLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityStatusLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityStatus fetchEntityStatus(
        java.lang.String statusName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.fetchEntityStatus(statusName);
    }

    /**
    * Returns the entity status with the primary key.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status
    * @throws PortalException if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityStatus getEntityStatus(
        java.lang.String statusName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.getEntityStatus(statusName);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity statuses
    * @param end the upper bound of the range of entity statuses (not inclusive)
    * @return the range of entity statuses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityStatus> getEntityStatuses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.getEntityStatuses(start, end);
    }

    /**
    * Returns the number of entity statuses.
    *
    * @return the number of entity statuses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityStatusesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.getEntityStatusesCount();
    }

    /**
    * Updates the entity status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityStatus the entity status
    * @return the entity status that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityStatus updateEntityStatus(
        com.consistent.ucwrt.model.EntityStatus entityStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityStatusLocalService.updateEntityStatus(entityStatus);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityStatusLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityStatusLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityStatusLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityStatusLocalService getWrappedEntityStatusLocalService() {
        return _entityStatusLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityStatusLocalService(
        EntityStatusLocalService entityStatusLocalService) {
        _entityStatusLocalService = entityStatusLocalService;
    }

    @Override
    public EntityStatusLocalService getWrappedService() {
        return _entityStatusLocalService;
    }

    @Override
    public void setWrappedService(
        EntityStatusLocalService entityStatusLocalService) {
        _entityStatusLocalService = entityStatusLocalService;
    }
}
