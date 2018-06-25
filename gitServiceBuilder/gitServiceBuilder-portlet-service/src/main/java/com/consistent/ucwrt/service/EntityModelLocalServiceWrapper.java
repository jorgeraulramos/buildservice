package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityModelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityModelLocalService
 * @generated
 */
public class EntityModelLocalServiceWrapper implements EntityModelLocalService,
    ServiceWrapper<EntityModelLocalService> {
    private EntityModelLocalService _entityModelLocalService;

    public EntityModelLocalServiceWrapper(
        EntityModelLocalService entityModelLocalService) {
        _entityModelLocalService = entityModelLocalService;
    }

    /**
    * Adds the entity model to the database. Also notifies the appropriate model listeners.
    *
    * @param entityModel the entity model
    * @return the entity model that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityModel addEntityModel(
        com.consistent.ucwrt.model.EntityModel entityModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.addEntityModel(entityModel);
    }

    /**
    * Creates a new entity model with the primary key. Does not add the entity model to the database.
    *
    * @param entityModelPK the primary key for the new entity model
    * @return the new entity model
    */
    @Override
    public com.consistent.ucwrt.model.EntityModel createEntityModel(
        com.consistent.ucwrt.service.persistence.EntityModelPK entityModelPK) {
        return _entityModelLocalService.createEntityModel(entityModelPK);
    }

    /**
    * Deletes the entity model with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityModelPK the primary key of the entity model
    * @return the entity model that was removed
    * @throws PortalException if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityModel deleteEntityModel(
        com.consistent.ucwrt.service.persistence.EntityModelPK entityModelPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.deleteEntityModel(entityModelPK);
    }

    /**
    * Deletes the entity model from the database. Also notifies the appropriate model listeners.
    *
    * @param entityModel the entity model
    * @return the entity model that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityModel deleteEntityModel(
        com.consistent.ucwrt.model.EntityModel entityModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.deleteEntityModel(entityModel);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityModelLocalService.dynamicQuery();
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
        return _entityModelLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityModelLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityModelLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _entityModelLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityModelLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityModel fetchEntityModel(
        com.consistent.ucwrt.service.persistence.EntityModelPK entityModelPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.fetchEntityModel(entityModelPK);
    }

    /**
    * Returns the entity model with the primary key.
    *
    * @param entityModelPK the primary key of the entity model
    * @return the entity model
    * @throws PortalException if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityModel getEntityModel(
        com.consistent.ucwrt.service.persistence.EntityModelPK entityModelPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.getEntityModel(entityModelPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity models.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @return the range of entity models
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityModel> getEntityModels(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.getEntityModels(start, end);
    }

    /**
    * Returns the number of entity models.
    *
    * @return the number of entity models
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityModelsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.getEntityModelsCount();
    }

    /**
    * Updates the entity model in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityModel the entity model
    * @return the entity model that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityModel updateEntityModel(
        com.consistent.ucwrt.model.EntityModel entityModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityModelLocalService.updateEntityModel(entityModel);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityModelLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityModelLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityModelLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityModelLocalService getWrappedEntityModelLocalService() {
        return _entityModelLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityModelLocalService(
        EntityModelLocalService entityModelLocalService) {
        _entityModelLocalService = entityModelLocalService;
    }

    @Override
    public EntityModelLocalService getWrappedService() {
        return _entityModelLocalService;
    }

    @Override
    public void setWrappedService(
        EntityModelLocalService entityModelLocalService) {
        _entityModelLocalService = entityModelLocalService;
    }
}
