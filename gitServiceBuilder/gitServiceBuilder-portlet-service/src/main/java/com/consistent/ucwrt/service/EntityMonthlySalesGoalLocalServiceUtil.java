package com.consistent.ucwrt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EntityMonthlySalesGoal. This utility wraps
 * {@link com.consistent.ucwrt.service.impl.EntityMonthlySalesGoalLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalLocalService
 * @see com.consistent.ucwrt.service.base.EntityMonthlySalesGoalLocalServiceBaseImpl
 * @see com.consistent.ucwrt.service.impl.EntityMonthlySalesGoalLocalServiceImpl
 * @generated
 */
public class EntityMonthlySalesGoalLocalServiceUtil {
    private static EntityMonthlySalesGoalLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.consistent.ucwrt.service.impl.EntityMonthlySalesGoalLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the entity monthly sales goal to the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    * @return the entity monthly sales goal that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal addEntityMonthlySalesGoal(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntityMonthlySalesGoal(entityMonthlySalesGoal);
    }

    /**
    * Creates a new entity monthly sales goal with the primary key. Does not add the entity monthly sales goal to the database.
    *
    * @param entityMonthlySalesGoalPK the primary key for the new entity monthly sales goal
    * @return the new entity monthly sales goal
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal createEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK) {
        return getService()
                   .createEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    /**
    * Deletes the entity monthly sales goal with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal that was removed
    * @throws PortalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal deleteEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    /**
    * Deletes the entity monthly sales goal from the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    * @return the entity monthly sales goal that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal deleteEntityMonthlySalesGoal(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityMonthlySalesGoal(entityMonthlySalesGoal);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal fetchEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    /**
    * Returns the entity monthly sales goal with the primary key.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal
    * @throws PortalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal getEntityMonthlySalesGoal(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityMonthlySalesGoal(entityMonthlySalesGoalPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> getEntityMonthlySalesGoals(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityMonthlySalesGoals(start, end);
    }

    /**
    * Returns the number of entity monthly sales goals.
    *
    * @return the number of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public static int getEntityMonthlySalesGoalsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityMonthlySalesGoalsCount();
    }

    /**
    * Updates the entity monthly sales goal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    * @return the entity monthly sales goal that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal updateEntityMonthlySalesGoal(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEntityMonthlySalesGoal(entityMonthlySalesGoal);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static EntityMonthlySalesGoalLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EntityMonthlySalesGoalLocalService.class.getName());

            if (invokableLocalService instanceof EntityMonthlySalesGoalLocalService) {
                _service = (EntityMonthlySalesGoalLocalService) invokableLocalService;
            } else {
                _service = new EntityMonthlySalesGoalLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EntityMonthlySalesGoalLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EntityMonthlySalesGoalLocalService service) {
    }
}
