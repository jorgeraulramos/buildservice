package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityVersionAutoService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAutoService
 * @generated
 */
public class EntityVersionAutoServiceWrapper implements EntityVersionAutoService,
    ServiceWrapper<EntityVersionAutoService> {
    private EntityVersionAutoService _entityVersionAutoService;

    public EntityVersionAutoServiceWrapper(
        EntityVersionAutoService entityVersionAutoService) {
        _entityVersionAutoService = entityVersionAutoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityVersionAutoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityVersionAutoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityVersionAutoService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityVersionAutoService getWrappedEntityVersionAutoService() {
        return _entityVersionAutoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityVersionAutoService(
        EntityVersionAutoService entityVersionAutoService) {
        _entityVersionAutoService = entityVersionAutoService;
    }

    @Override
    public EntityVersionAutoService getWrappedService() {
        return _entityVersionAutoService;
    }

    @Override
    public void setWrappedService(
        EntityVersionAutoService entityVersionAutoService) {
        _entityVersionAutoService = entityVersionAutoService;
    }
}
