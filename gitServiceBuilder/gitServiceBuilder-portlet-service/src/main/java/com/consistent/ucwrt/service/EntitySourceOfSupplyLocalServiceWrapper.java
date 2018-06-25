package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntitySourceOfSupplyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupplyLocalService
 * @generated
 */
public class EntitySourceOfSupplyLocalServiceWrapper
    implements EntitySourceOfSupplyLocalService,
        ServiceWrapper<EntitySourceOfSupplyLocalService> {
    private EntitySourceOfSupplyLocalService _entitySourceOfSupplyLocalService;

    public EntitySourceOfSupplyLocalServiceWrapper(
        EntitySourceOfSupplyLocalService entitySourceOfSupplyLocalService) {
        _entitySourceOfSupplyLocalService = entitySourceOfSupplyLocalService;
    }

    /**
    * Adds the entity source of supply to the database. Also notifies the appropriate model listeners.
    *
    * @param entitySourceOfSupply the entity source of supply
    * @return the entity source of supply that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply addEntitySourceOfSupply(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.addEntitySourceOfSupply(entitySourceOfSupply);
    }

    /**
    * Creates a new entity source of supply with the primary key. Does not add the entity source of supply to the database.
    *
    * @param sourceSupplyId the primary key for the new entity source of supply
    * @return the new entity source of supply
    */
    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply createEntitySourceOfSupply(
        int sourceSupplyId) {
        return _entitySourceOfSupplyLocalService.createEntitySourceOfSupply(sourceSupplyId);
    }

    /**
    * Deletes the entity source of supply with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply that was removed
    * @throws PortalException if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply deleteEntitySourceOfSupply(
        int sourceSupplyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.deleteEntitySourceOfSupply(sourceSupplyId);
    }

    /**
    * Deletes the entity source of supply from the database. Also notifies the appropriate model listeners.
    *
    * @param entitySourceOfSupply the entity source of supply
    * @return the entity source of supply that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply deleteEntitySourceOfSupply(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.deleteEntitySourceOfSupply(entitySourceOfSupply);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entitySourceOfSupplyLocalService.dynamicQuery();
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
        return _entitySourceOfSupplyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entitySourceOfSupplyLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entitySourceOfSupplyLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return _entitySourceOfSupplyLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entitySourceOfSupplyLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply fetchEntitySourceOfSupply(
        int sourceSupplyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.fetchEntitySourceOfSupply(sourceSupplyId);
    }

    /**
    * Returns the entity source of supply with the primary key.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply
    * @throws PortalException if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply getEntitySourceOfSupply(
        int sourceSupplyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.getEntitySourceOfSupply(sourceSupplyId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity source of supplies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity source of supplies
    * @param end the upper bound of the range of entity source of supplies (not inclusive)
    * @return the range of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> getEntitySourceOfSupplies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.getEntitySourceOfSupplies(start,
            end);
    }

    /**
    * Returns the number of entity source of supplies.
    *
    * @return the number of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntitySourceOfSuppliesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.getEntitySourceOfSuppliesCount();
    }

    /**
    * Updates the entity source of supply in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entitySourceOfSupply the entity source of supply
    * @return the entity source of supply that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySourceOfSupply updateEntitySourceOfSupply(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySourceOfSupplyLocalService.updateEntitySourceOfSupply(entitySourceOfSupply);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entitySourceOfSupplyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entitySourceOfSupplyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entitySourceOfSupplyLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntitySourceOfSupplyLocalService getWrappedEntitySourceOfSupplyLocalService() {
        return _entitySourceOfSupplyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntitySourceOfSupplyLocalService(
        EntitySourceOfSupplyLocalService entitySourceOfSupplyLocalService) {
        _entitySourceOfSupplyLocalService = entitySourceOfSupplyLocalService;
    }

    @Override
    public EntitySourceOfSupplyLocalService getWrappedService() {
        return _entitySourceOfSupplyLocalService;
    }

    @Override
    public void setWrappedService(
        EntitySourceOfSupplyLocalService entitySourceOfSupplyLocalService) {
        _entitySourceOfSupplyLocalService = entitySourceOfSupplyLocalService;
    }
}
