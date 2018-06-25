package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityBrandService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrandService
 * @generated
 */
public class EntityBrandServiceWrapper implements EntityBrandService,
    ServiceWrapper<EntityBrandService> {
    private EntityBrandService _entityBrandService;

    public EntityBrandServiceWrapper(EntityBrandService entityBrandService) {
        _entityBrandService = entityBrandService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityBrandService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityBrandService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityBrandService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityBrandService getWrappedEntityBrandService() {
        return _entityBrandService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityBrandService(
        EntityBrandService entityBrandService) {
        _entityBrandService = entityBrandService;
    }

    @Override
    public EntityBrandService getWrappedService() {
        return _entityBrandService;
    }

    @Override
    public void setWrappedService(EntityBrandService entityBrandService) {
        _entityBrandService = entityBrandService;
    }
}
