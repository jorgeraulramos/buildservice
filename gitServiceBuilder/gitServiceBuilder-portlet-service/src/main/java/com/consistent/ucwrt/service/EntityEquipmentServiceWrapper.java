package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEquipmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEquipmentService
 * @generated
 */
public class EntityEquipmentServiceWrapper implements EntityEquipmentService,
    ServiceWrapper<EntityEquipmentService> {
    private EntityEquipmentService _entityEquipmentService;

    public EntityEquipmentServiceWrapper(
        EntityEquipmentService entityEquipmentService) {
        _entityEquipmentService = entityEquipmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEquipmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEquipmentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEquipmentService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEquipmentService getWrappedEntityEquipmentService() {
        return _entityEquipmentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEquipmentService(
        EntityEquipmentService entityEquipmentService) {
        _entityEquipmentService = entityEquipmentService;
    }

    @Override
    public EntityEquipmentService getWrappedService() {
        return _entityEquipmentService;
    }

    @Override
    public void setWrappedService(EntityEquipmentService entityEquipmentService) {
        _entityEquipmentService = entityEquipmentService;
    }
}
