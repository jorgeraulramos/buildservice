package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySalesPlace;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity sales place service. This utility wraps {@link EntitySalesPlacePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlacePersistence
 * @see EntitySalesPlacePersistenceImpl
 * @generated
 */
public class EntitySalesPlaceUtil {
    private static EntitySalesPlacePersistence _persistence;

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
    public static void clearCache(EntitySalesPlace entitySalesPlace) {
        getPersistence().clearCache(entitySalesPlace);
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
    public static List<EntitySalesPlace> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntitySalesPlace> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntitySalesPlace> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntitySalesPlace update(EntitySalesPlace entitySalesPlace)
        throws SystemException {
        return getPersistence().update(entitySalesPlace);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntitySalesPlace update(EntitySalesPlace entitySalesPlace,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entitySalesPlace, serviceContext);
    }

    /**
    * Caches the entity sales place in the entity cache if it is enabled.
    *
    * @param entitySalesPlace the entity sales place
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntitySalesPlace entitySalesPlace) {
        getPersistence().cacheResult(entitySalesPlace);
    }

    /**
    * Caches the entity sales places in the entity cache if it is enabled.
    *
    * @param entitySalesPlaces the entity sales places
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> entitySalesPlaces) {
        getPersistence().cacheResult(entitySalesPlaces);
    }

    /**
    * Creates a new entity sales place with the primary key. Does not add the entity sales place to the database.
    *
    * @param salesPlaceId the primary key for the new entity sales place
    * @return the new entity sales place
    */
    public static com.consistent.ucwrt.model.EntitySalesPlace create(
        int salesPlaceId) {
        return getPersistence().create(salesPlaceId);
    }

    /**
    * Removes the entity sales place with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param salesPlaceId the primary key of the entity sales place
    * @return the entity sales place that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySalesPlace remove(
        int salesPlaceId)
        throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(salesPlaceId);
    }

    public static com.consistent.ucwrt.model.EntitySalesPlace updateImpl(
        com.consistent.ucwrt.model.EntitySalesPlace entitySalesPlace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entitySalesPlace);
    }

    /**
    * Returns the entity sales place with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySalesPlaceException} if it could not be found.
    *
    * @param salesPlaceId the primary key of the entity sales place
    * @return the entity sales place
    * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySalesPlace findByPrimaryKey(
        int salesPlaceId)
        throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(salesPlaceId);
    }

    /**
    * Returns the entity sales place with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param salesPlaceId the primary key of the entity sales place
    * @return the entity sales place, or <code>null</code> if a entity sales place with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySalesPlace fetchByPrimaryKey(
        int salesPlaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(salesPlaceId);
    }

    /**
    * Returns all the entity sales places.
    *
    * @return the entity sales places
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity sales places.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales places
    * @param end the upper bound of the range of entity sales places (not inclusive)
    * @return the range of entity sales places
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity sales places.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales places
    * @param end the upper bound of the range of entity sales places (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity sales places
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity sales places from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity sales places.
    *
    * @return the number of entity sales places
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntitySalesPlacePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntitySalesPlacePersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntitySalesPlacePersistence.class.getName());

            ReferenceRegistry.registerReference(EntitySalesPlaceUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntitySalesPlacePersistence persistence) {
    }
}
