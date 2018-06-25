package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityStatusService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatusService
 * @generated
 */
public class EntityStatusServiceWrapper implements EntityStatusService,
    ServiceWrapper<EntityStatusService> {
    private EntityStatusService _entityStatusService;

    public EntityStatusServiceWrapper(EntityStatusService entityStatusService) {
        _entityStatusService = entityStatusService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityStatusService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityStatusService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityStatusService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityStatusService getWrappedEntityStatusService() {
        return _entityStatusService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityStatusService(
        EntityStatusService entityStatusService) {
        _entityStatusService = entityStatusService;
    }

    @Override
    public EntityStatusService getWrappedService() {
        return _entityStatusService;
    }

    @Override
    public void setWrappedService(EntityStatusService entityStatusService) {
        _entityStatusService = entityStatusService;
    }
}
