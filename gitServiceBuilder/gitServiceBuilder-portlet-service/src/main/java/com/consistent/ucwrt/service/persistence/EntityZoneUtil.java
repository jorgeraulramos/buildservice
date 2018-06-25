package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityZone;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity zone service. This utility wraps {@link EntityZonePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityZonePersistence
 * @see EntityZonePersistenceImpl
 * @generated
 */
public class EntityZoneUtil {
    private static EntityZonePersistence _persistence;

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
    public static void clearCache(EntityZone entityZone) {
        getPersistence().clearCache(entityZone);
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
    public static List<EntityZone> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityZone> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityZone> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityZone update(EntityZone entityZone)
        throws SystemException {
        return getPersistence().update(entityZone);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityZone update(EntityZone entityZone,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityZone, serviceContext);
    }

    /**
    * Caches the entity zone in the entity cache if it is enabled.
    *
    * @param entityZone the entity zone
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityZone entityZone) {
        getPersistence().cacheResult(entityZone);
    }

    /**
    * Caches the entity zones in the entity cache if it is enabled.
    *
    * @param entityZones the entity zones
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityZone> entityZones) {
        getPersistence().cacheResult(entityZones);
    }

    /**
    * Creates a new entity zone with the primary key. Does not add the entity zone to the database.
    *
    * @param zoneName the primary key for the new entity zone
    * @return the new entity zone
    */
    public static com.consistent.ucwrt.model.EntityZone create(
        java.lang.String zoneName) {
        return getPersistence().create(zoneName);
    }

    /**
    * Removes the entity zone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param zoneName the primary key of the entity zone
    * @return the entity zone that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityZone remove(
        java.lang.String zoneName)
        throws com.consistent.ucwrt.NoSuchEntityZoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(zoneName);
    }

    public static com.consistent.ucwrt.model.EntityZone updateImpl(
        com.consistent.ucwrt.model.EntityZone entityZone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityZone);
    }

    /**
    * Returns the entity zone with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityZoneException} if it could not be found.
    *
    * @param zoneName the primary key of the entity zone
    * @return the entity zone
    * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityZone findByPrimaryKey(
        java.lang.String zoneName)
        throws com.consistent.ucwrt.NoSuchEntityZoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(zoneName);
    }

    /**
    * Returns the entity zone with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param zoneName the primary key of the entity zone
    * @return the entity zone, or <code>null</code> if a entity zone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityZone fetchByPrimaryKey(
        java.lang.String zoneName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(zoneName);
    }

    /**
    * Returns all the entity zones.
    *
    * @return the entity zones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityZone> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity zones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityZoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity zones
    * @param end the upper bound of the range of entity zones (not inclusive)
    * @return the range of entity zones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityZone> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity zones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityZoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity zones
    * @param end the upper bound of the range of entity zones (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity zones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityZone> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity zones from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity zones.
    *
    * @return the number of entity zones
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityZonePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityZonePersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityZonePersistence.class.getName());

            ReferenceRegistry.registerReference(EntityZoneUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityZonePersistence persistence) {
    }
}
