package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityClass;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity class service. This utility wraps {@link EntityClassPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityClassPersistence
 * @see EntityClassPersistenceImpl
 * @generated
 */
public class EntityClassUtil {
    private static EntityClassPersistence _persistence;

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
    public static void clearCache(EntityClass entityClass) {
        getPersistence().clearCache(entityClass);
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
    public static List<EntityClass> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityClass> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityClass> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityClass update(EntityClass entityClass)
        throws SystemException {
        return getPersistence().update(entityClass);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityClass update(EntityClass entityClass,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityClass, serviceContext);
    }

    /**
    * Returns the entity class where className = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
    *
    * @param className the class name
    * @return the matching entity class
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass findByClassName(
        java.lang.String className)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByClassName(className);
    }

    /**
    * Returns the entity class where className = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param className the class name
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass fetchByClassName(
        java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByClassName(className);
    }

    /**
    * Returns the entity class where className = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param className the class name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass fetchByClassName(
        java.lang.String className, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByClassName(className, retrieveFromCache);
    }

    /**
    * Removes the entity class where className = &#63; from the database.
    *
    * @param className the class name
    * @return the entity class that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass removeByClassName(
        java.lang.String className)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByClassName(className);
    }

    /**
    * Returns the number of entity classes where className = &#63;.
    *
    * @param className the class name
    * @return the number of matching entity classes
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassName(java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByClassName(className);
    }

    /**
    * Returns the entity class where classId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
    *
    * @param classId the class ID
    * @return the matching entity class
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass findByClassId(
        int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByClassId(classId);
    }

    /**
    * Returns the entity class where classId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param classId the class ID
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass fetchByClassId(
        int classId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByClassId(classId);
    }

    /**
    * Returns the entity class where classId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param classId the class ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass fetchByClassId(
        int classId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByClassId(classId, retrieveFromCache);
    }

    /**
    * Removes the entity class where classId = &#63; from the database.
    *
    * @param classId the class ID
    * @return the entity class that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass removeByClassId(
        int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByClassId(classId);
    }

    /**
    * Returns the number of entity classes where classId = &#63;.
    *
    * @param classId the class ID
    * @return the number of matching entity classes
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassId(int classId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByClassId(classId);
    }

    /**
    * Caches the entity class in the entity cache if it is enabled.
    *
    * @param entityClass the entity class
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityClass entityClass) {
        getPersistence().cacheResult(entityClass);
    }

    /**
    * Caches the entity classes in the entity cache if it is enabled.
    *
    * @param entityClasses the entity classes
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityClass> entityClasses) {
        getPersistence().cacheResult(entityClasses);
    }

    /**
    * Creates a new entity class with the primary key. Does not add the entity class to the database.
    *
    * @param classId the primary key for the new entity class
    * @return the new entity class
    */
    public static com.consistent.ucwrt.model.EntityClass create(int classId) {
        return getPersistence().create(classId);
    }

    /**
    * Removes the entity class with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param classId the primary key of the entity class
    * @return the entity class that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass remove(int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(classId);
    }

    public static com.consistent.ucwrt.model.EntityClass updateImpl(
        com.consistent.ucwrt.model.EntityClass entityClass)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityClass);
    }

    /**
    * Returns the entity class with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
    *
    * @param classId the primary key of the entity class
    * @return the entity class
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass findByPrimaryKey(
        int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(classId);
    }

    /**
    * Returns the entity class with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param classId the primary key of the entity class
    * @return the entity class, or <code>null</code> if a entity class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityClass fetchByPrimaryKey(
        int classId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(classId);
    }

    /**
    * Returns all the entity classes.
    *
    * @return the entity classes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityClass> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity classes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity classes
    * @param end the upper bound of the range of entity classes (not inclusive)
    * @return the range of entity classes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityClass> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity classes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity classes
    * @param end the upper bound of the range of entity classes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity classes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityClass> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity classes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity classes.
    *
    * @return the number of entity classes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityClassPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityClassPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityClassPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityClassUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityClassPersistence persistence) {
    }
}
