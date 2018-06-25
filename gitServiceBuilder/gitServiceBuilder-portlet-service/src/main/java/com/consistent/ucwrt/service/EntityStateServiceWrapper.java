package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityStateService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityStateService
 * @generated
 */
public class EntityStateServiceWrapper implements EntityStateService,
    ServiceWrapper<EntityStateService> {
    private EntityStateService _entityStateService;

    public EntityStateServiceWrapper(EntityStateService entityStateService) {
        _entityStateService = entityStateService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityStateService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityStateService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityStateService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityStateService getWrappedEntityStateService() {
        return _entityStateService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityStateService(
        EntityStateService entityStateService) {
        _entityStateService = entityStateService;
    }

    @Override
    public EntityStateService getWrappedService() {
        return _entityStateService;
    }

    @Override
    public void setWrappedService(EntityStateService entityStateService) {
        _entityStateService = entityStateService;
    }
}
