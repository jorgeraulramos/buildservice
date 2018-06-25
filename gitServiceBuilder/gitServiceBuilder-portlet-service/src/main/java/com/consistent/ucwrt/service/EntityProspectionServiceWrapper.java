package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityProspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspectionService
 * @generated
 */
public class EntityProspectionServiceWrapper implements EntityProspectionService,
    ServiceWrapper<EntityProspectionService> {
    private EntityProspectionService _entityProspectionService;

    public EntityProspectionServiceWrapper(
        EntityProspectionService entityProspectionService) {
        _entityProspectionService = entityProspectionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityProspectionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityProspectionService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityProspectionService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityProspectionService getWrappedEntityProspectionService() {
        return _entityProspectionService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityProspectionService(
        EntityProspectionService entityProspectionService) {
        _entityProspectionService = entityProspectionService;
    }

    @Override
    public EntityProspectionService getWrappedService() {
        return _entityProspectionService;
    }

    @Override
    public void setWrappedService(
        EntityProspectionService entityProspectionService) {
        _entityProspectionService = entityProspectionService;
    }
}
