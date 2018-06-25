package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityWayToPayService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPayService
 * @generated
 */
public class EntityWayToPayServiceWrapper implements EntityWayToPayService,
    ServiceWrapper<EntityWayToPayService> {
    private EntityWayToPayService _entityWayToPayService;

    public EntityWayToPayServiceWrapper(
        EntityWayToPayService entityWayToPayService) {
        _entityWayToPayService = entityWayToPayService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityWayToPayService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityWayToPayService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityWayToPayService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityWayToPayService getWrappedEntityWayToPayService() {
        return _entityWayToPayService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityWayToPayService(
        EntityWayToPayService entityWayToPayService) {
        _entityWayToPayService = entityWayToPayService;
    }

    @Override
    public EntityWayToPayService getWrappedService() {
        return _entityWayToPayService;
    }

    @Override
    public void setWrappedService(EntityWayToPayService entityWayToPayService) {
        _entityWayToPayService = entityWayToPayService;
    }
}
