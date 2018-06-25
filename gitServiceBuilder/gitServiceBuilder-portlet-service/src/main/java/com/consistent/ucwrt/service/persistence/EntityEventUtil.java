package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEvent;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity event service. This utility wraps {@link EntityEventPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEventPersistence
 * @see EntityEventPersistenceImpl
 * @generated
 */
public class EntityEventUtil {
    private static EntityEventPersistence _persistence;

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
    public static void clearCache(EntityEvent entityEvent) {
        getPersistence().clearCache(entityEvent);
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
    public static List<EntityEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityEvent update(EntityEvent entityEvent)
        throws SystemException {
        return getPersistence().update(entityEvent);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityEvent update(EntityEvent entityEvent,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityEvent, serviceContext);
    }

    /**
    * Caches the entity event in the entity cache if it is enabled.
    *
    * @param entityEvent the entity event
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityEvent entityEvent) {
        getPersistence().cacheResult(entityEvent);
    }

    /**
    * Caches the entity events in the entity cache if it is enabled.
    *
    * @param entityEvents the entity events
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityEvent> entityEvents) {
        getPersistence().cacheResult(entityEvents);
    }

    /**
    * Creates a new entity event with the primary key. Does not add the entity event to the database.
    *
    * @param eventId the primary key for the new entity event
    * @return the new entity event
    */
    public static com.consistent.ucwrt.model.EntityEvent create(int eventId) {
        return getPersistence().create(eventId);
    }

    /**
    * Removes the entity event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param eventId the primary key of the entity event
    * @return the entity event that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityEventException if a entity event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEvent remove(int eventId)
        throws com.consistent.ucwrt.NoSuchEntityEventException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(eventId);
    }

    public static com.consistent.ucwrt.model.EntityEvent updateImpl(
        com.consistent.ucwrt.model.EntityEvent entityEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityEvent);
    }

    /**
    * Returns the entity event with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEventException} if it could not be found.
    *
    * @param eventId the primary key of the entity event
    * @return the entity event
    * @throws com.consistent.ucwrt.NoSuchEntityEventException if a entity event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEvent findByPrimaryKey(
        int eventId)
        throws com.consistent.ucwrt.NoSuchEntityEventException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(eventId);
    }

    /**
    * Returns the entity event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param eventId the primary key of the entity event
    * @return the entity event, or <code>null</code> if a entity event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEvent fetchByPrimaryKey(
        int eventId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(eventId);
    }

    /**
    * Returns all the entity events.
    *
    * @return the entity events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEvent> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity events
    * @param end the upper bound of the range of entity events (not inclusive)
    * @return the range of entity events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEvent> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity events
    * @param end the upper bound of the range of entity events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEvent> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity events.
    *
    * @return the number of entity events
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityEventPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityEventPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityEventPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityEventUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityEventPersistence persistence) {
    }
}
