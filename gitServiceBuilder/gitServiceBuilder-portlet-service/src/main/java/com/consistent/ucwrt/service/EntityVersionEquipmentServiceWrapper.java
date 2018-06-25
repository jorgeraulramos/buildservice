package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityVersionEquipmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentService
 * @generated
 */
public class EntityVersionEquipmentServiceWrapper
    implements EntityVersionEquipmentService,
        ServiceWrapper<EntityVersionEquipmentService> {
    private EntityVersionEquipmentService _entityVersionEquipmentService;

    public EntityVersionEquipmentServiceWrapper(
        EntityVersionEquipmentService entityVersionEquipmentService) {
        _entityVersionEquipmentService = entityVersionEquipmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityVersionEquipmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityVersionEquipmentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityVersionEquipmentService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityVersionEquipmentService getWrappedEntityVersionEquipmentService() {
        return _entityVersionEquipmentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityVersionEquipmentService(
        EntityVersionEquipmentService entityVersionEquipmentService) {
        _entityVersionEquipmentService = entityVersionEquipmentService;
    }

    @Override
    public EntityVersionEquipmentService getWrappedService() {
        return _entityVersionEquipmentService;
    }

    @Override
    public void setWrappedService(
        EntityVersionEquipmentService entityVersionEquipmentService) {
        _entityVersionEquipmentService = entityVersionEquipmentService;
    }
}
