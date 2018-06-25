package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEventService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEventService
 * @generated
 */
public class EntityEventServiceWrapper implements EntityEventService,
    ServiceWrapper<EntityEventService> {
    private EntityEventService _entityEventService;

    public EntityEventServiceWrapper(EntityEventService entityEventService) {
        _entityEventService = entityEventService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEventService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEventService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEventService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEventService getWrappedEntityEventService() {
        return _entityEventService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEventService(
        EntityEventService entityEventService) {
        _entityEventService = entityEventService;
    }

    @Override
    public EntityEventService getWrappedService() {
        return _entityEventService;
    }

    @Override
    public void setWrappedService(EntityEventService entityEventService) {
        _entityEventService = entityEventService;
    }
}
