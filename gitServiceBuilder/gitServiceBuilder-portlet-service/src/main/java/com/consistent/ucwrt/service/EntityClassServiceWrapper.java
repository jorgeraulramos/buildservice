package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityClassService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityClassService
 * @generated
 */
public class EntityClassServiceWrapper implements EntityClassService,
    ServiceWrapper<EntityClassService> {
    private EntityClassService _entityClassService;

    public EntityClassServiceWrapper(EntityClassService entityClassService) {
        _entityClassService = entityClassService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityClassService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityClassService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityClassService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityClassService getWrappedEntityClassService() {
        return _entityClassService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityClassService(
        EntityClassService entityClassService) {
        _entityClassService = entityClassService;
    }

    @Override
    public EntityClassService getWrappedService() {
        return _entityClassService;
    }

    @Override
    public void setWrappedService(EntityClassService entityClassService) {
        _entityClassService = entityClassService;
    }
}
