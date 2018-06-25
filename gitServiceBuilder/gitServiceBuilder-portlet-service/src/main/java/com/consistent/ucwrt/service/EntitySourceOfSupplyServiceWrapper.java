package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntitySourceOfSupplyService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupplyService
 * @generated
 */
public class EntitySourceOfSupplyServiceWrapper
    implements EntitySourceOfSupplyService,
        ServiceWrapper<EntitySourceOfSupplyService> {
    private EntitySourceOfSupplyService _entitySourceOfSupplyService;

    public EntitySourceOfSupplyServiceWrapper(
        EntitySourceOfSupplyService entitySourceOfSupplyService) {
        _entitySourceOfSupplyService = entitySourceOfSupplyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entitySourceOfSupplyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entitySourceOfSupplyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entitySourceOfSupplyService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntitySourceOfSupplyService getWrappedEntitySourceOfSupplyService() {
        return _entitySourceOfSupplyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntitySourceOfSupplyService(
        EntitySourceOfSupplyService entitySourceOfSupplyService) {
        _entitySourceOfSupplyService = entitySourceOfSupplyService;
    }

    @Override
    public EntitySourceOfSupplyService getWrappedService() {
        return _entitySourceOfSupplyService;
    }

    @Override
    public void setWrappedService(
        EntitySourceOfSupplyService entitySourceOfSupplyService) {
        _entitySourceOfSupplyService = entitySourceOfSupplyService;
    }
}
