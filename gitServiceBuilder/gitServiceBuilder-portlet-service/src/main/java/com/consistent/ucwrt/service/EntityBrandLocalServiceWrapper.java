package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityBrandLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrandLocalService
 * @generated
 */
public class EntityBrandLocalServiceWrapper implements EntityBrandLocalService,
    ServiceWrapper<EntityBrandLocalService> {
    private EntityBrandLocalService _entityBrandLocalService;

    public EntityBrandLocalServiceWrapper(
        EntityBrandLocalService entityBrandLocalService) {
        _entityBrandLocalService = entityBrandLocalService;
    }

    /**
    * Adds the entity brand to the database. Also notifies the appropriate model listeners.
    *
    * @param entityBrand the entity brand
    * @return the entity brand that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBrand addEntityBrand(
        com.consistent.ucwrt.model.EntityBrand entityBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.addEntityBrand(entityBrand);
    }

    /**
    * Creates a new entity brand with the primary key. Does not add the entity brand to the database.
    *
    * @param brandId the primary key for the new entity brand
    * @return the new entity brand
    */
    @Override
    public com.consistent.ucwrt.model.EntityBrand createEntityBrand(int brandId) {
        return _entityBrandLocalService.createEntityBrand(brandId);
    }

    /**
    * Deletes the entity brand with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand that was removed
    * @throws PortalException if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBrand deleteEntityBrand(int brandId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.deleteEntityBrand(brandId);
    }

    /**
    * Deletes the entity brand from the database. Also notifies the appropriate model listeners.
    *
    * @param entityBrand the entity brand
    * @return the entity brand that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBrand deleteEntityBrand(
        com.consistent.ucwrt.model.EntityBrand entityBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.deleteEntityBrand(entityBrand);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityBrandLocalService.dynamicQuery();
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
        return _entityBrandLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityBrandLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityBrandLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _entityBrandLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityBrandLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityBrand fetchEntityBrand(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.fetchEntityBrand(brandId);
    }

    /**
    * Returns the entity brand with the primary key.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand
    * @throws PortalException if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBrand getEntityBrand(int brandId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.getEntityBrand(brandId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity brands
    * @param end the upper bound of the range of entity brands (not inclusive)
    * @return the range of entity brands
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityBrand> getEntityBrands(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.getEntityBrands(start, end);
    }

    /**
    * Returns the number of entity brands.
    *
    * @return the number of entity brands
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityBrandsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.getEntityBrandsCount();
    }

    /**
    * Updates the entity brand in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityBrand the entity brand
    * @return the entity brand that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBrand updateEntityBrand(
        com.consistent.ucwrt.model.EntityBrand entityBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBrandLocalService.updateEntityBrand(entityBrand);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityBrandLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityBrandLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityBrandLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityBrandLocalService getWrappedEntityBrandLocalService() {
        return _entityBrandLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityBrandLocalService(
        EntityBrandLocalService entityBrandLocalService) {
        _entityBrandLocalService = entityBrandLocalService;
    }

    @Override
    public EntityBrandLocalService getWrappedService() {
        return _entityBrandLocalService;
    }

    @Override
    public void setWrappedService(
        EntityBrandLocalService entityBrandLocalService) {
        _entityBrandLocalService = entityBrandLocalService;
    }
}
