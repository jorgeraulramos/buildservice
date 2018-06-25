package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntitySalesPlaceService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlaceService
 * @generated
 */
public class EntitySalesPlaceServiceWrapper implements EntitySalesPlaceService,
    ServiceWrapper<EntitySalesPlaceService> {
    private EntitySalesPlaceService _entitySalesPlaceService;

    public EntitySalesPlaceServiceWrapper(
        EntitySalesPlaceService entitySalesPlaceService) {
        _entitySalesPlaceService = entitySalesPlaceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entitySalesPlaceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entitySalesPlaceService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entitySalesPlaceService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntitySalesPlaceService getWrappedEntitySalesPlaceService() {
        return _entitySalesPlaceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntitySalesPlaceService(
        EntitySalesPlaceService entitySalesPlaceService) {
        _entitySalesPlaceService = entitySalesPlaceService;
    }

    @Override
    public EntitySalesPlaceService getWrappedService() {
        return _entitySalesPlaceService;
    }

    @Override
    public void setWrappedService(
        EntitySalesPlaceService entitySalesPlaceService) {
        _entitySalesPlaceService = entitySalesPlaceService;
    }
}
