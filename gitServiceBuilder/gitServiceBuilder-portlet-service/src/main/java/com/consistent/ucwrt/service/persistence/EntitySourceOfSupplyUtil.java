package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySourceOfSupply;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity source of supply service. This utility wraps {@link EntitySourceOfSupplyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupplyPersistence
 * @see EntitySourceOfSupplyPersistenceImpl
 * @generated
 */
public class EntitySourceOfSupplyUtil {
    private static EntitySourceOfSupplyPersistence _persistence;

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
    public static void clearCache(EntitySourceOfSupply entitySourceOfSupply) {
        getPersistence().clearCache(entitySourceOfSupply);
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
    public static List<EntitySourceOfSupply> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntitySourceOfSupply> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntitySourceOfSupply> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntitySourceOfSupply update(
        EntitySourceOfSupply entitySourceOfSupply) throws SystemException {
        return getPersistence().update(entitySourceOfSupply);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntitySourceOfSupply update(
        EntitySourceOfSupply entitySourceOfSupply, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entitySourceOfSupply, serviceContext);
    }

    /**
    * Caches the entity source of supply in the entity cache if it is enabled.
    *
    * @param entitySourceOfSupply the entity source of supply
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply) {
        getPersistence().cacheResult(entitySourceOfSupply);
    }

    /**
    * Caches the entity source of supplies in the entity cache if it is enabled.
    *
    * @param entitySourceOfSupplies the entity source of supplies
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> entitySourceOfSupplies) {
        getPersistence().cacheResult(entitySourceOfSupplies);
    }

    /**
    * Creates a new entity source of supply with the primary key. Does not add the entity source of supply to the database.
    *
    * @param sourceSupplyId the primary key for the new entity source of supply
    * @return the new entity source of supply
    */
    public static com.consistent.ucwrt.model.EntitySourceOfSupply create(
        int sourceSupplyId) {
        return getPersistence().create(sourceSupplyId);
    }

    /**
    * Removes the entity source of supply with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySourceOfSupply remove(
        int sourceSupplyId)
        throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(sourceSupplyId);
    }

    public static com.consistent.ucwrt.model.EntitySourceOfSupply updateImpl(
        com.consistent.ucwrt.model.EntitySourceOfSupply entitySourceOfSupply)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entitySourceOfSupply);
    }

    /**
    * Returns the entity source of supply with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException} if it could not be found.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply
    * @throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySourceOfSupply findByPrimaryKey(
        int sourceSupplyId)
        throws com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(sourceSupplyId);
    }

    /**
    * Returns the entity source of supply with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param sourceSupplyId the primary key of the entity source of supply
    * @return the entity source of supply, or <code>null</code> if a entity source of supply with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySourceOfSupply fetchByPrimaryKey(
        int sourceSupplyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(sourceSupplyId);
    }

    /**
    * Returns all the entity source of supplies.
    *
    * @return the entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity source of supplies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity source of supplies
    * @param end the upper bound of the range of entity source of supplies (not inclusive)
    * @return the range of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity source of supplies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySourceOfSupplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity source of supplies
    * @param end the upper bound of the range of entity source of supplies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySourceOfSupply> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity source of supplies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity source of supplies.
    *
    * @return the number of entity source of supplies
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntitySourceOfSupplyPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntitySourceOfSupplyPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntitySourceOfSupplyPersistence.class.getName());

            ReferenceRegistry.registerReference(EntitySourceOfSupplyUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntitySourceOfSupplyPersistence persistence) {
    }
}
