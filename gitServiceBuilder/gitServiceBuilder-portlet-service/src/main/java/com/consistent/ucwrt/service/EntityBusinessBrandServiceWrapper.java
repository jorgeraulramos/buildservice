package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityBusinessBrandService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityBusinessBrandService
 * @generated
 */
public class EntityBusinessBrandServiceWrapper
    implements EntityBusinessBrandService,
        ServiceWrapper<EntityBusinessBrandService> {
    private EntityBusinessBrandService _entityBusinessBrandService;

    public EntityBusinessBrandServiceWrapper(
        EntityBusinessBrandService entityBusinessBrandService) {
        _entityBusinessBrandService = entityBusinessBrandService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityBusinessBrandService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityBusinessBrandService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityBusinessBrandService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityBusinessBrandService getWrappedEntityBusinessBrandService() {
        return _entityBusinessBrandService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityBusinessBrandService(
        EntityBusinessBrandService entityBusinessBrandService) {
        _entityBusinessBrandService = entityBusinessBrandService;
    }

    @Override
    public EntityBusinessBrandService getWrappedService() {
        return _entityBusinessBrandService;
    }

    @Override
    public void setWrappedService(
        EntityBusinessBrandService entityBusinessBrandService) {
        _entityBusinessBrandService = entityBusinessBrandService;
    }
}
