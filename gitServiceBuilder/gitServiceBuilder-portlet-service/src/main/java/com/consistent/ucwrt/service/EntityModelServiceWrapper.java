package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityModelService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityModelService
 * @generated
 */
public class EntityModelServiceWrapper implements EntityModelService,
    ServiceWrapper<EntityModelService> {
    private EntityModelService _entityModelService;

    public EntityModelServiceWrapper(EntityModelService entityModelService) {
        _entityModelService = entityModelService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityModelService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityModelService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityModelService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityModelService getWrappedEntityModelService() {
        return _entityModelService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityModelService(
        EntityModelService entityModelService) {
        _entityModelService = entityModelService;
    }

    @Override
    public EntityModelService getWrappedService() {
        return _entityModelService;
    }

    @Override
    public void setWrappedService(EntityModelService entityModelService) {
        _entityModelService = entityModelService;
    }
}
