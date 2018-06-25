package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEventLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEventLocalService
 * @generated
 */
public class EntityEventLocalServiceWrapper implements EntityEventLocalService,
    ServiceWrapper<EntityEventLocalService> {
    private EntityEventLocalService _entityEventLocalService;

    public EntityEventLocalServiceWrapper(
        EntityEventLocalService entityEventLocalService) {
        _entityEventLocalService = entityEventLocalService;
    }

    /**
    * Adds the entity event to the database. Also notifies the appropriate model listeners.
    *
    * @param entityEvent the entity event
    * @return the entity event that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEvent addEntityEvent(
        com.consistent.ucwrt.model.EntityEvent entityEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.addEntityEvent(entityEvent);
    }

    /**
    * Creates a new entity event with the primary key. Does not add the entity event to the database.
    *
    * @param eventId the primary key for the new entity event
    * @return the new entity event
    */
    @Override
    public com.consistent.ucwrt.model.EntityEvent createEntityEvent(int eventId) {
        return _entityEventLocalService.createEntityEvent(eventId);
    }

    /**
    * Deletes the entity event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param eventId the primary key of the entity event
    * @return the entity event that was removed
    * @throws PortalException if a entity event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEvent deleteEntityEvent(int eventId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.deleteEntityEvent(eventId);
    }

    /**
    * Deletes the entity event from the database. Also notifies the appropriate model listeners.
    *
    * @param entityEvent the entity event
    * @return the entity event that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEvent deleteEntityEvent(
        com.consistent.ucwrt.model.EntityEvent entityEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.deleteEntityEvent(entityEvent);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityEventLocalService.dynamicQuery();
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
        return _entityEventLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityEventLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityEventLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _entityEventLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityEventLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityEvent fetchEntityEvent(int eventId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.fetchEntityEvent(eventId);
    }

    /**
    * Returns the entity event with the primary key.
    *
    * @param eventId the primary key of the entity event
    * @return the entity event
    * @throws PortalException if a entity event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEvent getEntityEvent(int eventId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.getEntityEvent(eventId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity events
    * @param end the upper bound of the range of entity events (not inclusive)
    * @return the range of entity events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityEvent> getEntityEvents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.getEntityEvents(start, end);
    }

    /**
    * Returns the number of entity events.
    *
    * @return the number of entity events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.getEntityEventsCount();
    }

    /**
    * Updates the entity event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityEvent the entity event
    * @return the entity event that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEvent updateEntityEvent(
        com.consistent.ucwrt.model.EntityEvent entityEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEventLocalService.updateEntityEvent(entityEvent);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEventLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEventLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEventLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEventLocalService getWrappedEntityEventLocalService() {
        return _entityEventLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEventLocalService(
        EntityEventLocalService entityEventLocalService) {
        _entityEventLocalService = entityEventLocalService;
    }

    @Override
    public EntityEventLocalService getWrappedService() {
        return _entityEventLocalService;
    }

    @Override
    public void setWrappedService(
        EntityEventLocalService entityEventLocalService) {
        _entityEventLocalService = entityEventLocalService;
    }
}
