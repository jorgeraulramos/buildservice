package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityInventoryService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryService
 * @generated
 */
public class EntityInventoryServiceWrapper implements EntityInventoryService,
    ServiceWrapper<EntityInventoryService> {
    private EntityInventoryService _entityInventoryService;

    public EntityInventoryServiceWrapper(
        EntityInventoryService entityInventoryService) {
        _entityInventoryService = entityInventoryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityInventoryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityInventoryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityInventoryService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityInventoryService getWrappedEntityInventoryService() {
        return _entityInventoryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityInventoryService(
        EntityInventoryService entityInventoryService) {
        _entityInventoryService = entityInventoryService;
    }

    @Override
    public EntityInventoryService getWrappedService() {
        return _entityInventoryService;
    }

    @Override
    public void setWrappedService(EntityInventoryService entityInventoryService) {
        _entityInventoryService = entityInventoryService;
    }
}
