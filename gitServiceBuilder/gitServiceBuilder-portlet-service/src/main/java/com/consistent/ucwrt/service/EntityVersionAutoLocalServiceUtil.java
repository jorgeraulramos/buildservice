package com.consistent.ucwrt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EntityVersionAuto. This utility wraps
 * {@link com.consistent.ucwrt.service.impl.EntityVersionAutoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAutoLocalService
 * @see com.consistent.ucwrt.service.base.EntityVersionAutoLocalServiceBaseImpl
 * @see com.consistent.ucwrt.service.impl.EntityVersionAutoLocalServiceImpl
 * @generated
 */
public class EntityVersionAutoLocalServiceUtil {
    private static EntityVersionAutoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.consistent.ucwrt.service.impl.EntityVersionAutoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the entity version auto to the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionAuto the entity version auto
    * @return the entity version auto that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto addEntityVersionAuto(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntityVersionAuto(entityVersionAuto);
    }

    /**
    * Creates a new entity version auto with the primary key. Does not add the entity version auto to the database.
    *
    * @param entityVersionAutoPK the primary key for the new entity version auto
    * @return the new entity version auto
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto createEntityVersionAuto(
        com.consistent.ucwrt.service.persistence.EntityVersionAutoPK entityVersionAutoPK) {
        return getService().createEntityVersionAuto(entityVersionAutoPK);
    }

    /**
    * Deletes the entity version auto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto that was removed
    * @throws PortalException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto deleteEntityVersionAuto(
        com.consistent.ucwrt.service.persistence.EntityVersionAutoPK entityVersionAutoPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityVersionAuto(entityVersionAutoPK);
    }

    /**
    * Deletes the entity version auto from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionAuto the entity version auto
    * @return the entity version auto that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto deleteEntityVersionAuto(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityVersionAuto(entityVersionAuto);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.consistent.ucwrt.model.EntityVersionAuto fetchEntityVersionAuto(
        com.consistent.ucwrt.service.persistence.EntityVersionAutoPK entityVersionAutoPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEntityVersionAuto(entityVersionAutoPK);
    }

    /**
    * Returns the entity version auto with the primary key.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto
    * @throws PortalException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto getEntityVersionAuto(
        com.consistent.ucwrt.service.persistence.EntityVersionAutoPK entityVersionAutoPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityVersionAuto(entityVersionAutoPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity version autos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @return the range of entity version autos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> getEntityVersionAutos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityVersionAutos(start, end);
    }

    /**
    * Returns the number of entity version autos.
    *
    * @return the number of entity version autos
    * @throws SystemException if a system exception occurred
    */
    public static int getEntityVersionAutosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityVersionAutosCount();
    }

    /**
    * Updates the entity version auto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityVersionAuto the entity version auto
    * @return the entity version auto that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionAuto updateEntityVersionAuto(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEntityVersionAuto(entityVersionAuto);
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

    public static EntityVersionAutoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EntityVersionAutoLocalService.class.getName());

            if (invokableLocalService instanceof EntityVersionAutoLocalService) {
                _service = (EntityVersionAutoLocalService) invokableLocalService;
            } else {
                _service = new EntityVersionAutoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EntityVersionAutoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EntityVersionAutoLocalService service) {
    }
}
