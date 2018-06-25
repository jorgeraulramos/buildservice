package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEmploymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmploymentService
 * @generated
 */
public class EntityEmploymentServiceWrapper implements EntityEmploymentService,
    ServiceWrapper<EntityEmploymentService> {
    private EntityEmploymentService _entityEmploymentService;

    public EntityEmploymentServiceWrapper(
        EntityEmploymentService entityEmploymentService) {
        _entityEmploymentService = entityEmploymentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEmploymentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEmploymentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEmploymentService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEmploymentService getWrappedEntityEmploymentService() {
        return _entityEmploymentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEmploymentService(
        EntityEmploymentService entityEmploymentService) {
        _entityEmploymentService = entityEmploymentService;
    }

    @Override
    public EntityEmploymentService getWrappedService() {
        return _entityEmploymentService;
    }

    @Override
    public void setWrappedService(
        EntityEmploymentService entityEmploymentService) {
        _entityEmploymentService = entityEmploymentService;
    }
}
