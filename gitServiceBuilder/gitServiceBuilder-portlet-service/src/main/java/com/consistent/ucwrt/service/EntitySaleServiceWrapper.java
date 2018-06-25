package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntitySaleService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySaleService
 * @generated
 */
public class EntitySaleServiceWrapper implements EntitySaleService,
    ServiceWrapper<EntitySaleService> {
    private EntitySaleService _entitySaleService;

    public EntitySaleServiceWrapper(EntitySaleService entitySaleService) {
        _entitySaleService = entitySaleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entitySaleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entitySaleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entitySaleService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntitySaleService getWrappedEntitySaleService() {
        return _entitySaleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntitySaleService(EntitySaleService entitySaleService) {
        _entitySaleService = entitySaleService;
    }

    @Override
    public EntitySaleService getWrappedService() {
        return _entitySaleService;
    }

    @Override
    public void setWrappedService(EntitySaleService entitySaleService) {
        _entitySaleService = entitySaleService;
    }
}
