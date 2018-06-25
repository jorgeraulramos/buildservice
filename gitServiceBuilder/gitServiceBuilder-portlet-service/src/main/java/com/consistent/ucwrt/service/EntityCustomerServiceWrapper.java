package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityCustomerService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityCustomerService
 * @generated
 */
public class EntityCustomerServiceWrapper implements EntityCustomerService,
    ServiceWrapper<EntityCustomerService> {
    private EntityCustomerService _entityCustomerService;

    public EntityCustomerServiceWrapper(
        EntityCustomerService entityCustomerService) {
        _entityCustomerService = entityCustomerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityCustomerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityCustomerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityCustomerService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityCustomerService getWrappedEntityCustomerService() {
        return _entityCustomerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityCustomerService(
        EntityCustomerService entityCustomerService) {
        _entityCustomerService = entityCustomerService;
    }

    @Override
    public EntityCustomerService getWrappedService() {
        return _entityCustomerService;
    }

    @Override
    public void setWrappedService(EntityCustomerService entityCustomerService) {
        _entityCustomerService = entityCustomerService;
    }
}
