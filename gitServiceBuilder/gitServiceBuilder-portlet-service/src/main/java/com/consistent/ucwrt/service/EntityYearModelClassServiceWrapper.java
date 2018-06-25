package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityYearModelClassService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClassService
 * @generated
 */
public class EntityYearModelClassServiceWrapper
    implements EntityYearModelClassService,
        ServiceWrapper<EntityYearModelClassService> {
    private EntityYearModelClassService _entityYearModelClassService;

    public EntityYearModelClassServiceWrapper(
        EntityYearModelClassService entityYearModelClassService) {
        _entityYearModelClassService = entityYearModelClassService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityYearModelClassService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityYearModelClassService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityYearModelClassService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityYearModelClassService getWrappedEntityYearModelClassService() {
        return _entityYearModelClassService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityYearModelClassService(
        EntityYearModelClassService entityYearModelClassService) {
        _entityYearModelClassService = entityYearModelClassService;
    }

    @Override
    public EntityYearModelClassService getWrappedService() {
        return _entityYearModelClassService;
    }

    @Override
    public void setWrappedService(
        EntityYearModelClassService entityYearModelClassService) {
        _entityYearModelClassService = entityYearModelClassService;
    }
}
