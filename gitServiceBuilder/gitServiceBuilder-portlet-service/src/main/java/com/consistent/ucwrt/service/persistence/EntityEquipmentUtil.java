package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEquipment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity equipment service. This utility wraps {@link EntityEquipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEquipmentPersistence
 * @see EntityEquipmentPersistenceImpl
 * @generated
 */
public class EntityEquipmentUtil {
    private static EntityEquipmentPersistence _persistence;

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
    public static void clearCache(EntityEquipment entityEquipment) {
        getPersistence().clearCache(entityEquipment);
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
    public static List<EntityEquipment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityEquipment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityEquipment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityEquipment update(EntityEquipment entityEquipment)
        throws SystemException {
        return getPersistence().update(entityEquipment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityEquipment update(EntityEquipment entityEquipment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityEquipment, serviceContext);
    }

    /**
    * Returns the entity equipment where equipmentId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityEquipmentException} if it could not be found.
    *
    * @param equipmentId the equipment ID
    * @return the matching entity equipment
    * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a matching entity equipment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment findByEquipmentById(
        int equipmentId)
        throws com.consistent.ucwrt.NoSuchEntityEquipmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEquipmentById(equipmentId);
    }

    /**
    * Returns the entity equipment where equipmentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param equipmentId the equipment ID
    * @return the matching entity equipment, or <code>null</code> if a matching entity equipment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment fetchByEquipmentById(
        int equipmentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEquipmentById(equipmentId);
    }

    /**
    * Returns the entity equipment where equipmentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param equipmentId the equipment ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity equipment, or <code>null</code> if a matching entity equipment could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment fetchByEquipmentById(
        int equipmentId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEquipmentById(equipmentId, retrieveFromCache);
    }

    /**
    * Removes the entity equipment where equipmentId = &#63; from the database.
    *
    * @param equipmentId the equipment ID
    * @return the entity equipment that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment removeByEquipmentById(
        int equipmentId)
        throws com.consistent.ucwrt.NoSuchEntityEquipmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByEquipmentById(equipmentId);
    }

    /**
    * Returns the number of entity equipments where equipmentId = &#63;.
    *
    * @param equipmentId the equipment ID
    * @return the number of matching entity equipments
    * @throws SystemException if a system exception occurred
    */
    public static int countByEquipmentById(int equipmentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEquipmentById(equipmentId);
    }

    /**
    * Caches the entity equipment in the entity cache if it is enabled.
    *
    * @param entityEquipment the entity equipment
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityEquipment entityEquipment) {
        getPersistence().cacheResult(entityEquipment);
    }

    /**
    * Caches the entity equipments in the entity cache if it is enabled.
    *
    * @param entityEquipments the entity equipments
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityEquipment> entityEquipments) {
        getPersistence().cacheResult(entityEquipments);
    }

    /**
    * Creates a new entity equipment with the primary key. Does not add the entity equipment to the database.
    *
    * @param equipmentId the primary key for the new entity equipment
    * @return the new entity equipment
    */
    public static com.consistent.ucwrt.model.EntityEquipment create(
        int equipmentId) {
        return getPersistence().create(equipmentId);
    }

    /**
    * Removes the entity equipment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param equipmentId the primary key of the entity equipment
    * @return the entity equipment that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a entity equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment remove(
        int equipmentId)
        throws com.consistent.ucwrt.NoSuchEntityEquipmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(equipmentId);
    }

    public static com.consistent.ucwrt.model.EntityEquipment updateImpl(
        com.consistent.ucwrt.model.EntityEquipment entityEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityEquipment);
    }

    /**
    * Returns the entity equipment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEquipmentException} if it could not be found.
    *
    * @param equipmentId the primary key of the entity equipment
    * @return the entity equipment
    * @throws com.consistent.ucwrt.NoSuchEntityEquipmentException if a entity equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment findByPrimaryKey(
        int equipmentId)
        throws com.consistent.ucwrt.NoSuchEntityEquipmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(equipmentId);
    }

    /**
    * Returns the entity equipment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param equipmentId the primary key of the entity equipment
    * @return the entity equipment, or <code>null</code> if a entity equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEquipment fetchByPrimaryKey(
        int equipmentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(equipmentId);
    }

    /**
    * Returns all the entity equipments.
    *
    * @return the entity equipments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEquipment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity equipments
    * @param end the upper bound of the range of entity equipments (not inclusive)
    * @return the range of entity equipments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEquipment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity equipments
    * @param end the upper bound of the range of entity equipments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity equipments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEquipment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity equipments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity equipments.
    *
    * @return the number of entity equipments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityEquipmentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityEquipmentPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityEquipmentPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityEquipmentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityEquipmentPersistence persistence) {
    }
}
