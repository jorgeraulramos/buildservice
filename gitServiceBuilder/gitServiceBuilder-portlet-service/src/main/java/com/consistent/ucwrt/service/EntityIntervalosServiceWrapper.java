package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityIntervalosService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityIntervalosService
 * @generated
 */
public class EntityIntervalosServiceWrapper implements EntityIntervalosService,
    ServiceWrapper<EntityIntervalosService> {
    private EntityIntervalosService _entityIntervalosService;

    public EntityIntervalosServiceWrapper(
        EntityIntervalosService entityIntervalosService) {
        _entityIntervalosService = entityIntervalosService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityIntervalosService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityIntervalosService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityIntervalosService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityIntervalosService getWrappedEntityIntervalosService() {
        return _entityIntervalosService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityIntervalosService(
        EntityIntervalosService entityIntervalosService) {
        _entityIntervalosService = entityIntervalosService;
    }

    @Override
    public EntityIntervalosService getWrappedService() {
        return _entityIntervalosService;
    }

    @Override
    public void setWrappedService(
        EntityIntervalosService entityIntervalosService) {
        _entityIntervalosService = entityIntervalosService;
    }
}
