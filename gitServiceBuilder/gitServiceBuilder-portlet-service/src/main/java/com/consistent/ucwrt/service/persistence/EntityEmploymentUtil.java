package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEmployment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity employment service. This utility wraps {@link EntityEmploymentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmploymentPersistence
 * @see EntityEmploymentPersistenceImpl
 * @generated
 */
public class EntityEmploymentUtil {
    private static EntityEmploymentPersistence _persistence;

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
    public static void clearCache(EntityEmployment entityEmployment) {
        getPersistence().clearCache(entityEmployment);
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
    public static List<EntityEmployment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityEmployment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityEmployment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityEmployment update(EntityEmployment entityEmployment)
        throws SystemException {
        return getPersistence().update(entityEmployment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityEmployment update(EntityEmployment entityEmployment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityEmployment, serviceContext);
    }

    /**
    * Caches the entity employment in the entity cache if it is enabled.
    *
    * @param entityEmployment the entity employment
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment) {
        getPersistence().cacheResult(entityEmployment);
    }

    /**
    * Caches the entity employments in the entity cache if it is enabled.
    *
    * @param entityEmployments the entity employments
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityEmployment> entityEmployments) {
        getPersistence().cacheResult(entityEmployments);
    }

    /**
    * Creates a new entity employment with the primary key. Does not add the entity employment to the database.
    *
    * @param entityEmploymentPK the primary key for the new entity employment
    * @return the new entity employment
    */
    public static com.consistent.ucwrt.model.EntityEmployment create(
        EntityEmploymentPK entityEmploymentPK) {
        return getPersistence().create(entityEmploymentPK);
    }

    /**
    * Removes the entity employment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployment remove(
        EntityEmploymentPK entityEmploymentPK)
        throws com.consistent.ucwrt.NoSuchEntityEmploymentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityEmploymentPK);
    }

    public static com.consistent.ucwrt.model.EntityEmployment updateImpl(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityEmployment);
    }

    /**
    * Returns the entity employment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEmploymentException} if it could not be found.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment
    * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployment findByPrimaryKey(
        EntityEmploymentPK entityEmploymentPK)
        throws com.consistent.ucwrt.NoSuchEntityEmploymentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityEmploymentPK);
    }

    /**
    * Returns the entity employment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment, or <code>null</code> if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityEmployment fetchByPrimaryKey(
        EntityEmploymentPK entityEmploymentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityEmploymentPK);
    }

    /**
    * Returns all the entity employments.
    *
    * @return the entity employments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity employments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity employments
    * @param end the upper bound of the range of entity employments (not inclusive)
    * @return the range of entity employments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity employments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity employments
    * @param end the upper bound of the range of entity employments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity employments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityEmployment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity employments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity employments.
    *
    * @return the number of entity employments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityEmploymentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityEmploymentPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityEmploymentPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityEmploymentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityEmploymentPersistence persistence) {
    }
}
