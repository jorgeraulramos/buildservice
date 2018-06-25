package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntitySuburbService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburbService
 * @generated
 */
public class EntitySuburbServiceWrapper implements EntitySuburbService,
    ServiceWrapper<EntitySuburbService> {
    private EntitySuburbService _entitySuburbService;

    public EntitySuburbServiceWrapper(EntitySuburbService entitySuburbService) {
        _entitySuburbService = entitySuburbService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entitySuburbService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entitySuburbService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entitySuburbService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntitySuburbService getWrappedEntitySuburbService() {
        return _entitySuburbService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntitySuburbService(
        EntitySuburbService entitySuburbService) {
        _entitySuburbService = entitySuburbService;
    }

    @Override
    public EntitySuburbService getWrappedService() {
        return _entitySuburbService;
    }

    @Override
    public void setWrappedService(EntitySuburbService entitySuburbService) {
        _entitySuburbService = entitySuburbService;
    }
}
