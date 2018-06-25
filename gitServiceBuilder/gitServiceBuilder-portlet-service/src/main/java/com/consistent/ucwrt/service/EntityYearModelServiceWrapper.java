package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityYearModelService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelService
 * @generated
 */
public class EntityYearModelServiceWrapper implements EntityYearModelService,
    ServiceWrapper<EntityYearModelService> {
    private EntityYearModelService _entityYearModelService;

    public EntityYearModelServiceWrapper(
        EntityYearModelService entityYearModelService) {
        _entityYearModelService = entityYearModelService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityYearModelService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityYearModelService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityYearModelService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityYearModelService getWrappedEntityYearModelService() {
        return _entityYearModelService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityYearModelService(
        EntityYearModelService entityYearModelService) {
        _entityYearModelService = entityYearModelService;
    }

    @Override
    public EntityYearModelService getWrappedService() {
        return _entityYearModelService;
    }

    @Override
    public void setWrappedService(EntityYearModelService entityYearModelService) {
        _entityYearModelService = entityYearModelService;
    }
}
