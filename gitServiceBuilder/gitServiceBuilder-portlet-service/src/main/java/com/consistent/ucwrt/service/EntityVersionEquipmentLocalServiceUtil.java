package com.consistent.ucwrt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EntityVersionEquipment. This utility wraps
 * {@link com.consistent.ucwrt.service.impl.EntityVersionEquipmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentLocalService
 * @see com.consistent.ucwrt.service.base.EntityVersionEquipmentLocalServiceBaseImpl
 * @see com.consistent.ucwrt.service.impl.EntityVersionEquipmentLocalServiceImpl
 * @generated
 */
public class EntityVersionEquipmentLocalServiceUtil {
    private static EntityVersionEquipmentLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.consistent.ucwrt.service.impl.EntityVersionEquipmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the entity version equipment to the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipment the entity version equipment
    * @return the entity version equipment that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment addEntityVersionEquipment(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntityVersionEquipment(entityVersionEquipment);
    }

    /**
    * Creates a new entity version equipment with the primary key. Does not add the entity version equipment to the database.
    *
    * @param entityVersionEquipmentPK the primary key for the new entity version equipment
    * @return the new entity version equipment
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment createEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK) {
        return getService()
                   .createEntityVersionEquipment(entityVersionEquipmentPK);
    }

    /**
    * Deletes the entity version equipment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment that was removed
    * @throws PortalException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment deleteEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteEntityVersionEquipment(entityVersionEquipmentPK);
    }

    /**
    * Deletes the entity version equipment from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipment the entity version equipment
    * @return the entity version equipment that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment deleteEntityVersionEquipment(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityVersionEquipment(entityVersionEquipment);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.consistent.ucwrt.model.EntityVersionEquipment fetchEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEntityVersionEquipment(entityVersionEquipmentPK);
    }

    /**
    * Returns the entity version equipment with the primary key.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment
    * @throws PortalException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment getEntityVersionEquipment(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityVersionEquipment(entityVersionEquipmentPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> getEntityVersionEquipments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityVersionEquipments(start, end);
    }

    /**
    * Returns the number of entity version equipments.
    *
    * @return the number of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public static int getEntityVersionEquipmentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityVersionEquipmentsCount();
    }

    /**
    * Updates the entity version equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipment the entity version equipment
    * @return the entity version equipment that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment updateEntityVersionEquipment(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEntityVersionEquipment(entityVersionEquipment);
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

    public static EntityVersionEquipmentLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EntityVersionEquipmentLocalService.class.getName());

            if (invokableLocalService instanceof EntityVersionEquipmentLocalService) {
                _service = (EntityVersionEquipmentLocalService) invokableLocalService;
            } else {
                _service = new EntityVersionEquipmentLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EntityVersionEquipmentLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EntityVersionEquipmentLocalService service) {
    }
}
