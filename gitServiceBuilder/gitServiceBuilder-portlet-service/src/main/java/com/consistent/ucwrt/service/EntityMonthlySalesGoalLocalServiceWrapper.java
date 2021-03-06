package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityMonthlySalesGoalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalLocalService
 * @generated
 */
public class EntityMonthlySalesGoalLocalServiceWrapper
    implements EntityMonthlySalesGoalLocalService,
        ServiceWrapper<EntityMonthlySalesGoalLocalService> {
    private EntityMonthlySalesGoalLocalService _entityMonthlySalesGoalLocalService;

    public EntityMonthlySalesGoalLocalServiceWrapper(
        EntityMonthlySalesGoalLocalService entityMonthlySalesGoalLocalService) {
        _entityMonthlySalesGoalLocalService = entityMonthlySalesGoalLocalService;
    }

    /**
    * Adds the entity monthly sales goal to the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    * @return the entity monthly sales goal that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal addEntityMonthlySalesGoal(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.addEntityMonthlySalesGoal(entityMonthlySalesGoal);
    }

    /**
    * Creates a new entity monthly sales goal with the primary key. Does not add the entity monthly sales goal to the database.
    *
    * @param entityMonthlySalesGoalPK the primary key for the new entity monthly sales goal
    * @return the new entity monthly sales goal
    */
    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal createEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK) {
        return _entityMonthlySalesGoalLocalService.createEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    /**
    * Deletes the entity monthly sales goal with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal that was removed
    * @throws PortalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal deleteEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.deleteEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    /**
    * Deletes the entity monthly sales goal from the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    * @return the entity monthly sales goal that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal deleteEntityMonthlySalesGoal(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.deleteEntityMonthlySalesGoal(entityMonthlySalesGoal);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityMonthlySalesGoalLocalService.dynamicQuery();
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
        return _entityMonthlySalesGoalLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityMonthlySalesGoalLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityMonthlySalesGoalLocalService.dynamicQuery(dynamicQuery,
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
        return _entityMonthlySalesGoalLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityMonthlySalesGoalLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal fetchEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.fetchEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    /**
    * Returns the entity monthly sales goal with the primary key.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal
    * @throws PortalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal getEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.getEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity monthly sales goals.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity monthly sales goals
    * @param end the upper bound of the range of entity monthly sales goals (not inclusive)
    * @return the range of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> getEntityMonthlySalesGoals(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.getEntityMonthlySalesGoals(start,
            end);
    }

    /**
    * Returns the number of entity monthly sales goals.
    *
    * @return the number of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityMonthlySalesGoalsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.getEntityMonthlySalesGoalsCount();
    }

    /**
    * Updates the entity monthly sales goal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    * @return the entity monthly sales goal that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal updateEntityMonthlySalesGoal(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityMonthlySalesGoalLocalService.updateEntityMonthlySalesGoal(entityMonthlySalesGoal);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityMonthlySalesGoalLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityMonthlySalesGoalLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityMonthlySalesGoalLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityMonthlySalesGoalLocalService getWrappedEntityMonthlySalesGoalLocalService() {
        return _entityMonthlySalesGoalLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityMonthlySalesGoalLocalService(
        EntityMonthlySalesGoalLocalService entityMonthlySalesGoalLocalService) {
        _entityMonthlySalesGoalLocalService = entityMonthlySalesGoalLocalService;
    }

    @Override
    public EntityMonthlySalesGoalLocalService getWrappedService() {
        return _entityMonthlySalesGoalLocalService;
    }

    @Override
    public void setWrappedService(
        EntityMonthlySalesGoalLocalService entityMonthlySalesGoalLocalService) {
        _entityMonthlySalesGoalLocalService = entityMonthlySalesGoalLocalService;
    }
}
