package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityMunicipalityService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityMunicipalityService
 * @generated
 */
public class EntityMunicipalityServiceWrapper
    implements EntityMunicipalityService,
        ServiceWrapper<EntityMunicipalityService> {
    private EntityMunicipalityService _entityMunicipalityService;

    public EntityMunicipalityServiceWrapper(
        EntityMunicipalityService entityMunicipalityService) {
        _entityMunicipalityService = entityMunicipalityService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityMunicipalityService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityMunicipalityService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityMunicipalityService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityMunicipalityService getWrappedEntityMunicipalityService() {
        return _entityMunicipalityService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityMunicipalityService(
        EntityMunicipalityService entityMunicipalityService) {
        _entityMunicipalityService = entityMunicipalityService;
    }

    @Override
    public EntityMunicipalityService getWrappedService() {
        return _entityMunicipalityService;
    }

    @Override
    public void setWrappedService(
        EntityMunicipalityService entityMunicipalityService) {
        _entityMunicipalityService = entityMunicipalityService;
    }
}
