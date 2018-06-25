package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityVersionEquipment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity version equipment service. This utility wraps {@link EntityVersionEquipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentPersistence
 * @see EntityVersionEquipmentPersistenceImpl
 * @generated
 */
public class EntityVersionEquipmentUtil {
    private static EntityVersionEquipmentPersistence _persistence;

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
    public static void clearCache(EntityVersionEquipment entityVersionEquipment) {
        getPersistence().clearCache(entityVersionEquipment);
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
    public static List<EntityVersionEquipment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityVersionEquipment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityVersionEquipment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityVersionEquipment update(
        EntityVersionEquipment entityVersionEquipment)
        throws SystemException {
        return getPersistence().update(entityVersionEquipment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityVersionEquipment update(
        EntityVersionEquipment entityVersionEquipment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityVersionEquipment, serviceContext);
    }

    /**
    * Caches the entity version equipment in the entity cache if it is enabled.
    *
    * @param entityVersionEquipment the entity version equipment
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment) {
        getPersistence().cacheResult(entityVersionEquipment);
    }

    /**
    * Caches the entity version equipments in the entity cache if it is enabled.
    *
    * @param entityVersionEquipments the entity version equipments
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> entityVersionEquipments) {
        getPersistence().cacheResult(entityVersionEquipments);
    }

    /**
    * Creates a new entity version equipment with the primary key. Does not add the entity version equipment to the database.
    *
    * @param entityVersionEquipmentPK the primary key for the new entity version equipment
    * @return the new entity version equipment
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment create(
        EntityVersionEquipmentPK entityVersionEquipmentPK) {
        return getPersistence().create(entityVersionEquipmentPK);
    }

    /**
    * Removes the entity version equipment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment remove(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityVersionEquipmentPK);
    }

    public static com.consistent.ucwrt.model.EntityVersionEquipment updateImpl(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityVersionEquipment);
    }

    /**
    * Returns the entity version equipment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionEquipmentException} if it could not be found.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment
    * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment findByPrimaryKey(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityVersionEquipmentPK);
    }

    /**
    * Returns the entity version equipment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment, or <code>null</code> if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityVersionEquipment fetchByPrimaryKey(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityVersionEquipmentPK);
    }

    /**
    * Returns all the entity version equipments.
    *
    * @return the entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity version equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version equipments
    * @param end the upper bound of the range of entity version equipments (not inclusive)
    * @return the range of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity version equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version equipments
    * @param end the upper bound of the range of entity version equipments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity version equipments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity version equipments.
    *
    * @return the number of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityVersionEquipmentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityVersionEquipmentPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityVersionEquipmentPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityVersionEquipmentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityVersionEquipmentPersistence persistence) {
    }
}
