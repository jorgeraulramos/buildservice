package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityWayToPayLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPayLocalService
 * @generated
 */
public class EntityWayToPayLocalServiceWrapper
    implements EntityWayToPayLocalService,
        ServiceWrapper<EntityWayToPayLocalService> {
    private EntityWayToPayLocalService _entityWayToPayLocalService;

    public EntityWayToPayLocalServiceWrapper(
        EntityWayToPayLocalService entityWayToPayLocalService) {
        _entityWayToPayLocalService = entityWayToPayLocalService;
    }

    /**
    * Adds the entity way to pay to the database. Also notifies the appropriate model listeners.
    *
    * @param entityWayToPay the entity way to pay
    * @return the entity way to pay that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityWayToPay addEntityWayToPay(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.addEntityWayToPay(entityWayToPay);
    }

    /**
    * Creates a new entity way to pay with the primary key. Does not add the entity way to pay to the database.
    *
    * @param wayPayId the primary key for the new entity way to pay
    * @return the new entity way to pay
    */
    @Override
    public com.consistent.ucwrt.model.EntityWayToPay createEntityWayToPay(
        int wayPayId) {
        return _entityWayToPayLocalService.createEntityWayToPay(wayPayId);
    }

    /**
    * Deletes the entity way to pay with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay that was removed
    * @throws PortalException if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityWayToPay deleteEntityWayToPay(
        int wayPayId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.deleteEntityWayToPay(wayPayId);
    }

    /**
    * Deletes the entity way to pay from the database. Also notifies the appropriate model listeners.
    *
    * @param entityWayToPay the entity way to pay
    * @return the entity way to pay that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityWayToPay deleteEntityWayToPay(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.deleteEntityWayToPay(entityWayToPay);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityWayToPayLocalService.dynamicQuery();
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
        return _entityWayToPayLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityWayToPayLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityWayToPayLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityWayToPayLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityWayToPayLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityWayToPay fetchEntityWayToPay(
        int wayPayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.fetchEntityWayToPay(wayPayId);
    }

    /**
    * Returns the entity way to pay with the primary key.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay
    * @throws PortalException if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityWayToPay getEntityWayToPay(
        int wayPayId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.getEntityWayToPay(wayPayId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity way to paies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity way to paies
    * @param end the upper bound of the range of entity way to paies (not inclusive)
    * @return the range of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityWayToPay> getEntityWayToPaies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.getEntityWayToPaies(start, end);
    }

    /**
    * Returns the number of entity way to paies.
    *
    * @return the number of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityWayToPaiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.getEntityWayToPaiesCount();
    }

    /**
    * Updates the entity way to pay in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityWayToPay the entity way to pay
    * @return the entity way to pay that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityWayToPay updateEntityWayToPay(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityWayToPayLocalService.updateEntityWayToPay(entityWayToPay);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityWayToPayLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityWayToPayLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityWayToPayLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityWayToPayLocalService getWrappedEntityWayToPayLocalService() {
        return _entityWayToPayLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityWayToPayLocalService(
        EntityWayToPayLocalService entityWayToPayLocalService) {
        _entityWayToPayLocalService = entityWayToPayLocalService;
    }

    @Override
    public EntityWayToPayLocalService getWrappedService() {
        return _entityWayToPayLocalService;
    }

    @Override
    public void setWrappedService(
        EntityWayToPayLocalService entityWayToPayLocalService) {
        _entityWayToPayLocalService = entityWayToPayLocalService;
    }
}
