package com.consistent.ucwrt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EntityYearModel. This utility wraps
 * {@link com.consistent.ucwrt.service.impl.EntityYearModelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelLocalService
 * @see com.consistent.ucwrt.service.base.EntityYearModelLocalServiceBaseImpl
 * @see com.consistent.ucwrt.service.impl.EntityYearModelLocalServiceImpl
 * @generated
 */
public class EntityYearModelLocalServiceUtil {
    private static EntityYearModelLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.consistent.ucwrt.service.impl.EntityYearModelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the entity year model to the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModel the entity year model
    * @return the entity year model that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel addEntityYearModel(
        com.consistent.ucwrt.model.EntityYearModel entityYearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntityYearModel(entityYearModel);
    }

    /**
    * Creates a new entity year model with the primary key. Does not add the entity year model to the database.
    *
    * @param yearModel the primary key for the new entity year model
    * @return the new entity year model
    */
    public static com.consistent.ucwrt.model.EntityYearModel createEntityYearModel(
        int yearModel) {
        return getService().createEntityYearModel(yearModel);
    }

    /**
    * Deletes the entity year model with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param yearModel the primary key of the entity year model
    * @return the entity year model that was removed
    * @throws PortalException if a entity year model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel deleteEntityYearModel(
        int yearModel)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityYearModel(yearModel);
    }

    /**
    * Deletes the entity year model from the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModel the entity year model
    * @return the entity year model that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel deleteEntityYearModel(
        com.consistent.ucwrt.model.EntityYearModel entityYearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityYearModel(entityYearModel);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.consistent.ucwrt.model.EntityYearModel fetchEntityYearModel(
        int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEntityYearModel(yearModel);
    }

    /**
    * Returns the entity year model with the primary key.
    *
    * @param yearModel the primary key of the entity year model
    * @return the entity year model
    * @throws PortalException if a entity year model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel getEntityYearModel(
        int yearModel)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityYearModel(yearModel);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity year models.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity year models
    * @param end the upper bound of the range of entity year models (not inclusive)
    * @return the range of entity year models
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModel> getEntityYearModels(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityYearModels(start, end);
    }

    /**
    * Returns the number of entity year models.
    *
    * @return the number of entity year models
    * @throws SystemException if a system exception occurred
    */
    public static int getEntityYearModelsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityYearModelsCount();
    }

    /**
    * Updates the entity year model in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityYearModel the entity year model
    * @return the entity year model that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel updateEntityYearModel(
        com.consistent.ucwrt.model.EntityYearModel entityYearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEntityYearModel(entityYearModel);
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

    public static EntityYearModelLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EntityYearModelLocalService.class.getName());

            if (invokableLocalService instanceof EntityYearModelLocalService) {
                _service = (EntityYearModelLocalService) invokableLocalService;
            } else {
                _service = new EntityYearModelLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EntityYearModelLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EntityYearModelLocalService service) {
    }
}
