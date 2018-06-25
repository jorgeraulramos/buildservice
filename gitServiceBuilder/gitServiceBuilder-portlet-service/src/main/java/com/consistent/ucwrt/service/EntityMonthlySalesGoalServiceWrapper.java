package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityMonthlySalesGoalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalService
 * @generated
 */
public class EntityMonthlySalesGoalServiceWrapper
    implements EntityMonthlySalesGoalService,
        ServiceWrapper<EntityMonthlySalesGoalService> {
    private EntityMonthlySalesGoalService _entityMonthlySalesGoalService;

    public EntityMonthlySalesGoalServiceWrapper(
        EntityMonthlySalesGoalService entityMonthlySalesGoalService) {
        _entityMonthlySalesGoalService = entityMonthlySalesGoalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityMonthlySalesGoalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityMonthlySalesGoalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityMonthlySalesGoalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityMonthlySalesGoalService getWrappedEntityMonthlySalesGoalService() {
        return _entityMonthlySalesGoalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityMonthlySalesGoalService(
        EntityMonthlySalesGoalService entityMonthlySalesGoalService) {
        _entityMonthlySalesGoalService = entityMonthlySalesGoalService;
    }

    @Override
    public EntityMonthlySalesGoalService getWrappedService() {
        return _entityMonthlySalesGoalService;
    }

    @Override
    public void setWrappedService(
        EntityMonthlySalesGoalService entityMonthlySalesGoalService) {
        _entityMonthlySalesGoalService = entityMonthlySalesGoalService;
    }
}
