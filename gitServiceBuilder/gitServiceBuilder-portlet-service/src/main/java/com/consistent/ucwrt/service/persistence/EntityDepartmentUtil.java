package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityDepartment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity department service. This utility wraps {@link EntityDepartmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartmentPersistence
 * @see EntityDepartmentPersistenceImpl
 * @generated
 */
public class EntityDepartmentUtil {
    private static EntityDepartmentPersistence _persistence;

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
    public static void clearCache(EntityDepartment entityDepartment) {
        getPersistence().clearCache(entityDepartment);
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
    public static List<EntityDepartment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityDepartment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityDepartment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityDepartment update(EntityDepartment entityDepartment)
        throws SystemException {
        return getPersistence().update(entityDepartment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityDepartment update(EntityDepartment entityDepartment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityDepartment, serviceContext);
    }

    /**
    * Caches the entity department in the entity cache if it is enabled.
    *
    * @param entityDepartment the entity department
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityDepartment entityDepartment) {
        getPersistence().cacheResult(entityDepartment);
    }

    /**
    * Caches the entity departments in the entity cache if it is enabled.
    *
    * @param entityDepartments the entity departments
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityDepartment> entityDepartments) {
        getPersistence().cacheResult(entityDepartments);
    }

    /**
    * Creates a new entity department with the primary key. Does not add the entity department to the database.
    *
    * @param entityDepartmentPK the primary key for the new entity department
    * @return the new entity department
    */
    public static com.consistent.ucwrt.model.EntityDepartment create(
        EntityDepartmentPK entityDepartmentPK) {
        return getPersistence().create(entityDepartmentPK);
    }

    /**
    * Removes the entity department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityDepartmentPK the primary key of the entity department
    * @return the entity department that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDepartment remove(
        EntityDepartmentPK entityDepartmentPK)
        throws com.consistent.ucwrt.NoSuchEntityDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityDepartmentPK);
    }

    public static com.consistent.ucwrt.model.EntityDepartment updateImpl(
        com.consistent.ucwrt.model.EntityDepartment entityDepartment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityDepartment);
    }

    /**
    * Returns the entity department with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityDepartmentException} if it could not be found.
    *
    * @param entityDepartmentPK the primary key of the entity department
    * @return the entity department
    * @throws com.consistent.ucwrt.NoSuchEntityDepartmentException if a entity department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDepartment findByPrimaryKey(
        EntityDepartmentPK entityDepartmentPK)
        throws com.consistent.ucwrt.NoSuchEntityDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityDepartmentPK);
    }

    /**
    * Returns the entity department with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityDepartmentPK the primary key of the entity department
    * @return the entity department, or <code>null</code> if a entity department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDepartment fetchByPrimaryKey(
        EntityDepartmentPK entityDepartmentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityDepartmentPK);
    }

    /**
    * Returns all the entity departments.
    *
    * @return the entity departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityDepartment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity departments
    * @param end the upper bound of the range of entity departments (not inclusive)
    * @return the range of entity departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityDepartment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity departments
    * @param end the upper bound of the range of entity departments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityDepartment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity departments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity departments.
    *
    * @return the number of entity departments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityDepartmentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityDepartmentPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityDepartmentPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityDepartmentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityDepartmentPersistence persistence) {
    }
}
