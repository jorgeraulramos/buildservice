package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEmployeesService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployeesService
 * @generated
 */
public class EntityEmployeesServiceWrapper implements EntityEmployeesService,
    ServiceWrapper<EntityEmployeesService> {
    private EntityEmployeesService _entityEmployeesService;

    public EntityEmployeesServiceWrapper(
        EntityEmployeesService entityEmployeesService) {
        _entityEmployeesService = entityEmployeesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEmployeesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEmployeesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEmployeesService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEmployeesService getWrappedEntityEmployeesService() {
        return _entityEmployeesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEmployeesService(
        EntityEmployeesService entityEmployeesService) {
        _entityEmployeesService = entityEmployeesService;
    }

    @Override
    public EntityEmployeesService getWrappedService() {
        return _entityEmployeesService;
    }

    @Override
    public void setWrappedService(EntityEmployeesService entityEmployeesService) {
        _entityEmployeesService = entityEmployeesService;
    }
}
