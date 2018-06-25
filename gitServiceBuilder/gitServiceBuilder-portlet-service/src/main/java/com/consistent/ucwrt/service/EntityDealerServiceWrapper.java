package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityDealerService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealerService
 * @generated
 */
public class EntityDealerServiceWrapper implements EntityDealerService,
    ServiceWrapper<EntityDealerService> {
    private EntityDealerService _entityDealerService;

    public EntityDealerServiceWrapper(EntityDealerService entityDealerService) {
        _entityDealerService = entityDealerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityDealerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityDealerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityDealerService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityDealerService getWrappedEntityDealerService() {
        return _entityDealerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityDealerService(
        EntityDealerService entityDealerService) {
        _entityDealerService = entityDealerService;
    }

    @Override
    public EntityDealerService getWrappedService() {
        return _entityDealerService;
    }

    @Override
    public void setWrappedService(EntityDealerService entityDealerService) {
        _entityDealerService = entityDealerService;
    }
}
