package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityYearModel;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity year model service. This utility wraps {@link EntityYearModelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelPersistence
 * @see EntityYearModelPersistenceImpl
 * @generated
 */
public class EntityYearModelUtil {
    private static EntityYearModelPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(EntityYearModel entityYearModel) {
        getPersistence().clearCache(entityYearModel);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<EntityYearModel> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityYearModel> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityYearModel> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityYearModel update(EntityYearModel entityYearModel)
        throws SystemException {
        return getPersistence().update(entityYearModel);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityYearModel update(EntityYearModel entityYearModel,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityYearModel, serviceContext);
    }

    /**
    * Caches the entity year model in the entity cache if it is enabled.
    *
    * @param entityYearModel the entity year model
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityYearModel entityYearModel) {
        getPersistence().cacheResult(entityYearModel);
    }

    /**
    * Caches the entity year models in the entity cache if it is enabled.
    *
    * @param entityYearModels the entity year models
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityYearModel> entityYearModels) {
        getPersistence().cacheResult(entityYearModels);
    }

    /**
    * Creates a new entity year model with the primary key. Does not add the entity year model to the database.
    *
    * @param yearModel the primary key for the new entity year model
    * @return the new entity year model
    */
    public static com.consistent.ucwrt.model.EntityYearModel create(
        int yearModel) {
        return getPersistence().create(yearModel);
    }

    /**
    * Removes the entity year model with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param yearModel the primary key of the entity year model
    * @return the entity year model that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityYearModelException if a entity year model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel remove(
        int yearModel)
        throws com.consistent.ucwrt.NoSuchEntityYearModelException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(yearModel);
    }

    public static com.consistent.ucwrt.model.EntityYearModel updateImpl(
        com.consistent.ucwrt.model.EntityYearModel entityYearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityYearModel);
    }

    /**
    * Returns the entity year model with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityYearModelException} if it could not be found.
    *
    * @param yearModel the primary key of the entity year model
    * @return the entity year model
    * @throws com.consistent.ucwrt.NoSuchEntityYearModelException if a entity year model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel findByPrimaryKey(
        int yearModel)
        throws com.consistent.ucwrt.NoSuchEntityYearModelException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(yearModel);
    }

    /**
    * Returns the entity year model with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param yearModel the primary key of the entity year model
    * @return the entity year model, or <code>null</code> if a entity year model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModel fetchByPrimaryKey(
        int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(yearModel);
    }

    /**
    * Returns all the entity year models.
    *
    * @return the entity year models
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModel> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity year models.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity year models
    * @param end the upper bound of the range of entity year models (not inclusive)
    * @return the range of entity year models
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModel> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity year models.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity year models
    * @param end the upper bound of the range of entity year models (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity year models
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModel> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity year models from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity year models.
    *
    * @return the number of entity year models
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityYearModelPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityYearModelPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityYearModelPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityYearModelUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityYearModelPersistence persistence) {
    }
}
