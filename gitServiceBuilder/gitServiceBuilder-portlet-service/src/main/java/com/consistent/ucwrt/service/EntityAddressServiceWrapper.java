package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddressService
 * @generated
 */
public class EntityAddressServiceWrapper implements EntityAddressService,
    ServiceWrapper<EntityAddressService> {
    private EntityAddressService _entityAddressService;

    public EntityAddressServiceWrapper(
        EntityAddressService entityAddressService) {
        _entityAddressService = entityAddressService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityAddressService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityAddressService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityAddressService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityAddressService getWrappedEntityAddressService() {
        return _entityAddressService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityAddressService(
        EntityAddressService entityAddressService) {
        _entityAddressService = entityAddressService;
    }

    @Override
    public EntityAddressService getWrappedService() {
        return _entityAddressService;
    }

    @Override
    public void setWrappedService(EntityAddressService entityAddressService) {
        _entityAddressService = entityAddressService;
    }
}
