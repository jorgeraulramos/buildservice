package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityGParameterService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameterService
 * @generated
 */
public class EntityGParameterServiceWrapper implements EntityGParameterService,
    ServiceWrapper<EntityGParameterService> {
    private EntityGParameterService _entityGParameterService;

    public EntityGParameterServiceWrapper(
        EntityGParameterService entityGParameterService) {
        _entityGParameterService = entityGParameterService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityGParameterService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityGParameterService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityGParameterService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityGParameterService getWrappedEntityGParameterService() {
        return _entityGParameterService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityGParameterService(
        EntityGParameterService entityGParameterService) {
        _entityGParameterService = entityGParameterService;
    }

    @Override
    public EntityGParameterService getWrappedService() {
        return _entityGParameterService;
    }

    @Override
    public void setWrappedService(
        EntityGParameterService entityGParameterService) {
        _entityGParameterService = entityGParameterService;
    }
}
