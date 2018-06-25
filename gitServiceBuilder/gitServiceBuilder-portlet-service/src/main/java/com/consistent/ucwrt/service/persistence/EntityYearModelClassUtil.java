package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityYearModelClass;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity year model class service. This utility wraps {@link EntityYearModelClassPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClassPersistence
 * @see EntityYearModelClassPersistenceImpl
 * @generated
 */
public class EntityYearModelClassUtil {
    private static EntityYearModelClassPersistence _persistence;

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
    public static void clearCache(EntityYearModelClass entityYearModelClass) {
        getPersistence().clearCache(entityYearModelClass);
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
    public static List<EntityYearModelClass> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityYearModelClass> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityYearModelClass> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityYearModelClass update(
        EntityYearModelClass entityYearModelClass) throws SystemException {
        return getPersistence().update(entityYearModelClass);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityYearModelClass update(
        EntityYearModelClass entityYearModelClass, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entityYearModelClass, serviceContext);
    }

    /**
    * Caches the entity year model class in the entity cache if it is enabled.
    *
    * @param entityYearModelClass the entity year model class
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass) {
        getPersistence().cacheResult(entityYearModelClass);
    }

    /**
    * Caches the entity year model classes in the entity cache if it is enabled.
    *
    * @param entityYearModelClasses the entity year model classes
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> entityYearModelClasses) {
        getPersistence().cacheResult(entityYearModelClasses);
    }

    /**
    * Creates a new entity year model class with the primary key. Does not add the entity year model class to the database.
    *
    * @param entityYearModelClassPK the primary key for the new entity year model class
    * @return the new entity year model class
    */
    public static com.consistent.ucwrt.model.EntityYearModelClass create(
        EntityYearModelClassPK entityYearModelClassPK) {
        return getPersistence().create(entityYearModelClassPK);
    }

    /**
    * Removes the entity year model class with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModelClass remove(
        EntityYearModelClassPK entityYearModelClassPK)
        throws com.consistent.ucwrt.NoSuchEntityYearModelClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityYearModelClassPK);
    }

    public static com.consistent.ucwrt.model.EntityYearModelClass updateImpl(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityYearModelClass);
    }

    /**
    * Returns the entity year model class with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityYearModelClassException} if it could not be found.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class
    * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModelClass findByPrimaryKey(
        EntityYearModelClassPK entityYearModelClassPK)
        throws com.consistent.ucwrt.NoSuchEntityYearModelClassException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityYearModelClassPK);
    }

    /**
    * Returns the entity year model class with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class, or <code>null</code> if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityYearModelClass fetchByPrimaryKey(
        EntityYearModelClassPK entityYearModelClassPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityYearModelClassPK);
    }

    /**
    * Returns all the entity year model classes.
    *
    * @return the entity year model classes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity year model classes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity year model classes
    * @param end the upper bound of the range of entity year model classes (not inclusive)
    * @return the range of entity year model classes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity year model classes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity year model classes
    * @param end the upper bound of the range of entity year model classes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity year model classes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity year model classes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity year model classes.
    *
    * @return the number of entity year model classes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityYearModelClassPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityYearModelClassPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityYearModelClassPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityYearModelClassUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityYearModelClassPersistence persistence) {
    }
}
