package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityProspection;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity prospection service. This utility wraps {@link EntityProspectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspectionPersistence
 * @see EntityProspectionPersistenceImpl
 * @generated
 */
public class EntityProspectionUtil {
    private static EntityProspectionPersistence _persistence;

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
    public static void clearCache(EntityProspection entityProspection) {
        getPersistence().clearCache(entityProspection);
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
    public static List<EntityProspection> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityProspection> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityProspection> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityProspection update(EntityProspection entityProspection)
        throws SystemException {
        return getPersistence().update(entityProspection);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityProspection update(
        EntityProspection entityProspection, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entityProspection, serviceContext);
    }

    /**
    * Caches the entity prospection in the entity cache if it is enabled.
    *
    * @param entityProspection the entity prospection
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityProspection entityProspection) {
        getPersistence().cacheResult(entityProspection);
    }

    /**
    * Caches the entity prospections in the entity cache if it is enabled.
    *
    * @param entityProspections the entity prospections
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityProspection> entityProspections) {
        getPersistence().cacheResult(entityProspections);
    }

    /**
    * Creates a new entity prospection with the primary key. Does not add the entity prospection to the database.
    *
    * @param prospectionId the primary key for the new entity prospection
    * @return the new entity prospection
    */
    public static com.consistent.ucwrt.model.EntityProspection create(
        int prospectionId) {
        return getPersistence().create(prospectionId);
    }

    /**
    * Removes the entity prospection with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityProspection remove(
        int prospectionId)
        throws com.consistent.ucwrt.NoSuchEntityProspectionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(prospectionId);
    }

    public static com.consistent.ucwrt.model.EntityProspection updateImpl(
        com.consistent.ucwrt.model.EntityProspection entityProspection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityProspection);
    }

    /**
    * Returns the entity prospection with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityProspectionException} if it could not be found.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection
    * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityProspection findByPrimaryKey(
        int prospectionId)
        throws com.consistent.ucwrt.NoSuchEntityProspectionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(prospectionId);
    }

    /**
    * Returns the entity prospection with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection, or <code>null</code> if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityProspection fetchByPrimaryKey(
        int prospectionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(prospectionId);
    }

    /**
    * Returns all the entity prospections.
    *
    * @return the entity prospections
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityProspection> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity prospections.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity prospections
    * @param end the upper bound of the range of entity prospections (not inclusive)
    * @return the range of entity prospections
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityProspection> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity prospections.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity prospections
    * @param end the upper bound of the range of entity prospections (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity prospections
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityProspection> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity prospections from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity prospections.
    *
    * @return the number of entity prospections
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityProspectionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityProspectionPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityProspectionPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityProspectionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityProspectionPersistence persistence) {
    }
}
