package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityZoneService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityZoneService
 * @generated
 */
public class EntityZoneServiceWrapper implements EntityZoneService,
    ServiceWrapper<EntityZoneService> {
    private EntityZoneService _entityZoneService;

    public EntityZoneServiceWrapper(EntityZoneService entityZoneService) {
        _entityZoneService = entityZoneService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityZoneService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityZoneService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityZoneService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityZoneService getWrappedEntityZoneService() {
        return _entityZoneService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityZoneService(EntityZoneService entityZoneService) {
        _entityZoneService = entityZoneService;
    }

    @Override
    public EntityZoneService getWrappedService() {
        return _entityZoneService;
    }

    @Override
    public void setWrappedService(EntityZoneService entityZoneService) {
        _entityZoneService = entityZoneService;
    }
}
