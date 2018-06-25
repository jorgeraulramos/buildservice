package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityDepartmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartmentService
 * @generated
 */
public class EntityDepartmentServiceWrapper implements EntityDepartmentService,
    ServiceWrapper<EntityDepartmentService> {
    private EntityDepartmentService _entityDepartmentService;

    public EntityDepartmentServiceWrapper(
        EntityDepartmentService entityDepartmentService) {
        _entityDepartmentService = entityDepartmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityDepartmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityDepartmentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityDepartmentService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityDepartmentService getWrappedEntityDepartmentService() {
        return _entityDepartmentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityDepartmentService(
        EntityDepartmentService entityDepartmentService) {
        _entityDepartmentService = entityDepartmentService;
    }

    @Override
    public EntityDepartmentService getWrappedService() {
        return _entityDepartmentService;
    }

    @Override
    public void setWrappedService(
        EntityDepartmentService entityDepartmentService) {
        _entityDepartmentService = entityDepartmentService;
    }
}
