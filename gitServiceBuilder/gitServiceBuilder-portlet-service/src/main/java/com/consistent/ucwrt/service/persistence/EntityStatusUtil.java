package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityStatus;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity status service. This utility wraps {@link EntityStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatusPersistence
 * @see EntityStatusPersistenceImpl
 * @generated
 */
public class EntityStatusUtil {
    private static EntityStatusPersistence _persistence;

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
    public static void clearCache(EntityStatus entityStatus) {
        getPersistence().clearCache(entityStatus);
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
    public static List<EntityStatus> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityStatus> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityStatus> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityStatus update(EntityStatus entityStatus)
        throws SystemException {
        return getPersistence().update(entityStatus);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityStatus update(EntityStatus entityStatus,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityStatus, serviceContext);
    }

    /**
    * Caches the entity status in the entity cache if it is enabled.
    *
    * @param entityStatus the entity status
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityStatus entityStatus) {
        getPersistence().cacheResult(entityStatus);
    }

    /**
    * Caches the entity statuses in the entity cache if it is enabled.
    *
    * @param entityStatuses the entity statuses
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityStatus> entityStatuses) {
        getPersistence().cacheResult(entityStatuses);
    }

    /**
    * Creates a new entity status with the primary key. Does not add the entity status to the database.
    *
    * @param statusName the primary key for the new entity status
    * @return the new entity status
    */
    public static com.consistent.ucwrt.model.EntityStatus create(
        java.lang.String statusName) {
        return getPersistence().create(statusName);
    }

    /**
    * Removes the entity status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityStatusException if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityStatus remove(
        java.lang.String statusName)
        throws com.consistent.ucwrt.NoSuchEntityStatusException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(statusName);
    }

    public static com.consistent.ucwrt.model.EntityStatus updateImpl(
        com.consistent.ucwrt.model.EntityStatus entityStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityStatus);
    }

    /**
    * Returns the entity status with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityStatusException} if it could not be found.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status
    * @throws com.consistent.ucwrt.NoSuchEntityStatusException if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityStatus findByPrimaryKey(
        java.lang.String statusName)
        throws com.consistent.ucwrt.NoSuchEntityStatusException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(statusName);
    }

    /**
    * Returns the entity status with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status, or <code>null</code> if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityStatus fetchByPrimaryKey(
        java.lang.String statusName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(statusName);
    }

    /**
    * Returns all the entity statuses.
    *
    * @return the entity statuses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityStatus> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity statuses
    * @param end the upper bound of the range of entity statuses (not inclusive)
    * @return the range of entity statuses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityStatus> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity statuses
    * @param end the upper bound of the range of entity statuses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity statuses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityStatus> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity statuses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity statuses.
    *
    * @return the number of entity statuses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityStatusPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityStatusPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityStatusPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityStatusUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityStatusPersistence persistence) {
    }
}
