package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityInventoryClasificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryClasificationService
 * @generated
 */
public class EntityInventoryClasificationServiceWrapper
    implements EntityInventoryClasificationService,
        ServiceWrapper<EntityInventoryClasificationService> {
    private EntityInventoryClasificationService _entityInventoryClasificationService;

    public EntityInventoryClasificationServiceWrapper(
        EntityInventoryClasificationService entityInventoryClasificationService) {
        _entityInventoryClasificationService = entityInventoryClasificationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityInventoryClasificationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityInventoryClasificationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityInventoryClasificationService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityInventoryClasificationService getWrappedEntityInventoryClasificationService() {
        return _entityInventoryClasificationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityInventoryClasificationService(
        EntityInventoryClasificationService entityInventoryClasificationService) {
        _entityInventoryClasificationService = entityInventoryClasificationService;
    }

    @Override
    public EntityInventoryClasificationService getWrappedService() {
        return _entityInventoryClasificationService;
    }

    @Override
    public void setWrappedService(
        EntityInventoryClasificationService entityInventoryClasificationService) {
        _entityInventoryClasificationService = entityInventoryClasificationService;
    }
}
