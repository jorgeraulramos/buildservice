package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntitySaleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySaleLocalService
 * @generated
 */
public class EntitySaleLocalServiceWrapper implements EntitySaleLocalService,
    ServiceWrapper<EntitySaleLocalService> {
    private EntitySaleLocalService _entitySaleLocalService;

    public EntitySaleLocalServiceWrapper(
        EntitySaleLocalService entitySaleLocalService) {
        _entitySaleLocalService = entitySaleLocalService;
    }

    /**
    * Adds the entity sale to the database. Also notifies the appropriate model listeners.
    *
    * @param entitySale the entity sale
    * @return the entity sale that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySale addEntitySale(
        com.consistent.ucwrt.model.EntitySale entitySale)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.addEntitySale(entitySale);
    }

    /**
    * Creates a new entity sale with the primary key. Does not add the entity sale to the database.
    *
    * @param saleId the primary key for the new entity sale
    * @return the new entity sale
    */
    @Override
    public com.consistent.ucwrt.model.EntitySale createEntitySale(int saleId) {
        return _entitySaleLocalService.createEntitySale(saleId);
    }

    /**
    * Deletes the entity sale with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale that was removed
    * @throws PortalException if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySale deleteEntitySale(int saleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.deleteEntitySale(saleId);
    }

    /**
    * Deletes the entity sale from the database. Also notifies the appropriate model listeners.
    *
    * @param entitySale the entity sale
    * @return the entity sale that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySale deleteEntitySale(
        com.consistent.ucwrt.model.EntitySale entitySale)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.deleteEntitySale(entitySale);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entitySaleLocalService.dynamicQuery();
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
        return _entitySaleLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entitySaleLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entitySaleLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _entitySaleLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entitySaleLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntitySale fetchEntitySale(int saleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.fetchEntitySale(saleId);
    }

    /**
    * Returns the entity sale with the primary key.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale
    * @throws PortalException if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySale getEntitySale(int saleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.getEntitySale(saleId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity sales.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales
    * @param end the upper bound of the range of entity sales (not inclusive)
    * @return the range of entity sales
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntitySale> getEntitySales(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.getEntitySales(start, end);
    }

    /**
    * Returns the number of entity sales.
    *
    * @return the number of entity sales
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntitySalesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.getEntitySalesCount();
    }

    /**
    * Updates the entity sale in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entitySale the entity sale
    * @return the entity sale that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntitySale updateEntitySale(
        com.consistent.ucwrt.model.EntitySale entitySale)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entitySaleLocalService.updateEntitySale(entitySale);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entitySaleLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entitySaleLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entitySaleLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntitySaleLocalService getWrappedEntitySaleLocalService() {
        return _entitySaleLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntitySaleLocalService(
        EntitySaleLocalService entitySaleLocalService) {
        _entitySaleLocalService = entitySaleLocalService;
    }

    @Override
    public EntitySaleLocalService getWrappedService() {
        return _entitySaleLocalService;
    }

    @Override
    public void setWrappedService(EntitySaleLocalService entitySaleLocalService) {
        _entitySaleLocalService = entitySaleLocalService;
    }
}
