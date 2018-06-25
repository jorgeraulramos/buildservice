package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityProspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspectionLocalService
 * @generated
 */
public class EntityProspectionLocalServiceWrapper
    implements EntityProspectionLocalService,
        ServiceWrapper<EntityProspectionLocalService> {
    private EntityProspectionLocalService _entityProspectionLocalService;

    public EntityProspectionLocalServiceWrapper(
        EntityProspectionLocalService entityProspectionLocalService) {
        _entityProspectionLocalService = entityProspectionLocalService;
    }

    /**
    * Adds the entity prospection to the database. Also notifies the appropriate model listeners.
    *
    * @param entityProspection the entity prospection
    * @return the entity prospection that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityProspection addEntityProspection(
        com.consistent.ucwrt.model.EntityProspection entityProspection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.addEntityProspection(entityProspection);
    }

    /**
    * Creates a new entity prospection with the primary key. Does not add the entity prospection to the database.
    *
    * @param prospectionId the primary key for the new entity prospection
    * @return the new entity prospection
    */
    @Override
    public com.consistent.ucwrt.model.EntityProspection createEntityProspection(
        int prospectionId) {
        return _entityProspectionLocalService.createEntityProspection(prospectionId);
    }

    /**
    * Deletes the entity prospection with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection that was removed
    * @throws PortalException if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityProspection deleteEntityProspection(
        int prospectionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.deleteEntityProspection(prospectionId);
    }

    /**
    * Deletes the entity prospection from the database. Also notifies the appropriate model listeners.
    *
    * @param entityProspection the entity prospection
    * @return the entity prospection that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityProspection deleteEntityProspection(
        com.consistent.ucwrt.model.EntityProspection entityProspection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.deleteEntityProspection(entityProspection);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityProspectionLocalService.dynamicQuery();
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
        return _entityProspectionLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityProspectionLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityProspectionLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityProspectionLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityProspectionLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityProspection fetchEntityProspection(
        int prospectionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.fetchEntityProspection(prospectionId);
    }

    /**
    * Returns the entity prospection with the primary key.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection
    * @throws PortalException if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityProspection getEntityProspection(
        int prospectionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.getEntityProspection(prospectionId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity prospections.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity prospections
    * @param end the upper bound of the range of entity prospections (not inclusive)
    * @return the range of entity prospections
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityProspection> getEntityProspections(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.getEntityProspections(start, end);
    }

    /**
    * Returns the number of entity prospections.
    *
    * @return the number of entity prospections
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityProspectionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.getEntityProspectionsCount();
    }

    /**
    * Updates the entity prospection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityProspection the entity prospection
    * @return the entity prospection that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityProspection updateEntityProspection(
        com.consistent.ucwrt.model.EntityProspection entityProspection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityProspectionLocalService.updateEntityProspection(entityProspection);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityProspectionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityProspectionLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityProspectionLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityProspectionLocalService getWrappedEntityProspectionLocalService() {
        return _entityProspectionLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityProspectionLocalService(
        EntityProspectionLocalService entityProspectionLocalService) {
        _entityProspectionLocalService = entityProspectionLocalService;
    }

    @Override
    public EntityProspectionLocalService getWrappedService() {
        return _entityProspectionLocalService;
    }

    @Override
    public void setWrappedService(
        EntityProspectionLocalService entityProspectionLocalService) {
        _entityProspectionLocalService = entityProspectionLocalService;
    }
}
