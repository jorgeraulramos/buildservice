package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityBusinessBrandLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityBusinessBrandLocalService
 * @generated
 */
public class EntityBusinessBrandLocalServiceWrapper
    implements EntityBusinessBrandLocalService,
        ServiceWrapper<EntityBusinessBrandLocalService> {
    private EntityBusinessBrandLocalService _entityBusinessBrandLocalService;

    public EntityBusinessBrandLocalServiceWrapper(
        EntityBusinessBrandLocalService entityBusinessBrandLocalService) {
        _entityBusinessBrandLocalService = entityBusinessBrandLocalService;
    }

    /**
    * Adds the entity business brand to the database. Also notifies the appropriate model listeners.
    *
    * @param entityBusinessBrand the entity business brand
    * @return the entity business brand that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand addEntityBusinessBrand(
        com.consistent.ucwrt.model.EntityBusinessBrand entityBusinessBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.addEntityBusinessBrand(entityBusinessBrand);
    }

    /**
    * Creates a new entity business brand with the primary key. Does not add the entity business brand to the database.
    *
    * @param businessBrandName the primary key for the new entity business brand
    * @return the new entity business brand
    */
    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand createEntityBusinessBrand(
        java.lang.String businessBrandName) {
        return _entityBusinessBrandLocalService.createEntityBusinessBrand(businessBrandName);
    }

    /**
    * Deletes the entity business brand with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param businessBrandName the primary key of the entity business brand
    * @return the entity business brand that was removed
    * @throws PortalException if a entity business brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand deleteEntityBusinessBrand(
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.deleteEntityBusinessBrand(businessBrandName);
    }

    /**
    * Deletes the entity business brand from the database. Also notifies the appropriate model listeners.
    *
    * @param entityBusinessBrand the entity business brand
    * @return the entity business brand that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand deleteEntityBusinessBrand(
        com.consistent.ucwrt.model.EntityBusinessBrand entityBusinessBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.deleteEntityBusinessBrand(entityBusinessBrand);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityBusinessBrandLocalService.dynamicQuery();
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
        return _entityBusinessBrandLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityBusinessBrandLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityBusinessBrandLocalService.dynamicQuery(dynamicQuery,
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
        return _entityBusinessBrandLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityBusinessBrandLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand fetchEntityBusinessBrand(
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.fetchEntityBusinessBrand(businessBrandName);
    }

    /**
    * Returns the entity business brand with the primary key.
    *
    * @param businessBrandName the primary key of the entity business brand
    * @return the entity business brand
    * @throws PortalException if a entity business brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand getEntityBusinessBrand(
        java.lang.String businessBrandName)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.getEntityBusinessBrand(businessBrandName);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity business brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBusinessBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity business brands
    * @param end the upper bound of the range of entity business brands (not inclusive)
    * @return the range of entity business brands
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityBusinessBrand> getEntityBusinessBrands(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.getEntityBusinessBrands(start,
            end);
    }

    /**
    * Returns the number of entity business brands.
    *
    * @return the number of entity business brands
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityBusinessBrandsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.getEntityBusinessBrandsCount();
    }

    /**
    * Updates the entity business brand in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityBusinessBrand the entity business brand
    * @return the entity business brand that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityBusinessBrand updateEntityBusinessBrand(
        com.consistent.ucwrt.model.EntityBusinessBrand entityBusinessBrand)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityBusinessBrandLocalService.updateEntityBusinessBrand(entityBusinessBrand);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityBusinessBrandLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityBusinessBrandLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityBusinessBrandLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityBusinessBrandLocalService getWrappedEntityBusinessBrandLocalService() {
        return _entityBusinessBrandLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityBusinessBrandLocalService(
        EntityBusinessBrandLocalService entityBusinessBrandLocalService) {
        _entityBusinessBrandLocalService = entityBusinessBrandLocalService;
    }

    @Override
    public EntityBusinessBrandLocalService getWrappedService() {
        return _entityBusinessBrandLocalService;
    }

    @Override
    public void setWrappedService(
        EntityBusinessBrandLocalService entityBusinessBrandLocalService) {
        _entityBusinessBrandLocalService = entityBusinessBrandLocalService;
    }
}
