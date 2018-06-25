package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityVersionEquipmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentLocalService
 * @generated
 */
public class EntityVersionEquipmentLocalServiceWrapper
    implements EntityVersionEquipmentLocalService,
        ServiceWrapper<EntityVersionEquipmentLocalService> {
    private EntityVersionEquipmentLocalService _entityVersionEquipmentLocalService;

    public EntityVersionEquipmentLocalServiceWrapper(
        EntityVersionEquipmentLocalService entityVersionEquipmentLocalService) {
        _entityVersionEquipmentLocalService = entityVersionEquipmentLocalService;
    }

    /**
    * Adds the entity version equipment to the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipment the entity version equipment
    * @return the entity version equipment that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment addEntityVersionEquipment(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.addEntityVersionEquipment(entityVersionEquipment);
    }

    /**
    * Creates a new entity version equipment with the primary key. Does not add the entity version equipment to the database.
    *
    * @param entityVersionEquipmentPK the primary key for the new entity version equipment
    * @return the new entity version equipment
    */
    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment createEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK) {
        return _entityVersionEquipmentLocalService.createEntityVersionEquipment(entityVersionEquipmentPK);
    }

    /**
    * Deletes the entity version equipment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment that was removed
    * @throws PortalException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment deleteEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.deleteEntityVersionEquipment(entityVersionEquipmentPK);
    }

    /**
    * Deletes the entity version equipment from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipment the entity version equipment
    * @return the entity version equipment that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment deleteEntityVersionEquipment(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.deleteEntityVersionEquipment(entityVersionEquipment);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityVersionEquipmentLocalService.dynamicQuery();
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
        return _entityVersionEquipmentLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityVersionEquipmentLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityVersionEquipmentLocalService.dynamicQuery(dynamicQuery,
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
        return _entityVersionEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityVersionEquipmentLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment fetchEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.fetchEntityVersionEquipment(entityVersionEquipmentPK);
    }

    /**
    * Returns the entity version equipment with the primary key.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment
    * @throws PortalException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment getEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.getEntityVersionEquipment(entityVersionEquipmentPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity version equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version equipments
    * @param end the upper bound of the range of entity version equipments (not inclusive)
    * @return the range of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> getEntityVersionEquipments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.getEntityVersionEquipments(start,
            end);
    }

    /**
    * Returns the number of entity version equipments.
    *
    * @return the number of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityVersionEquipmentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.getEntityVersionEquipmentsCount();
    }

    /**
    * Updates the entity version equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipment the entity version equipment
    * @return the entity version equipment that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityVersionEquipment updateEntityVersionEquipment(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityVersionEquipmentLocalService.updateEntityVersionEquipment(entityVersionEquipment);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityVersionEquipmentLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityVersionEquipmentLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityVersionEquipmentLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityVersionEquipmentLocalService getWrappedEntityVersionEquipmentLocalService() {
        return _entityVersionEquipmentLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityVersionEquipmentLocalService(
        EntityVersionEquipmentLocalService entityVersionEquipmentLocalService) {
        _entityVersionEquipmentLocalService = entityVersionEquipmentLocalService;
    }

    @Override
    public EntityVersionEquipmentLocalService getWrappedService() {
        return _entityVersionEquipmentLocalService;
    }

    @Override
    public void setWrappedService(
        EntityVersionEquipmentLocalService entityVersionEquipmentLocalService) {
        _entityVersionEquipmentLocalService = entityVersionEquipmentLocalService;
    }
}
