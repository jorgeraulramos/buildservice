package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityMonthlySalesGoal;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity monthly sales goal service. This utility wraps {@link EntityMonthlySalesGoalPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalPersistence
 * @see EntityMonthlySalesGoalPersistenceImpl
 * @generated
 */
public class EntityMonthlySalesGoalUtil {
    private static EntityMonthlySalesGoalPersistence _persistence;

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
    public static void clearCache(EntityMonthlySalesGoal entityMonthlySalesGoal) {
        getPersistence().clearCache(entityMonthlySalesGoal);
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
    public static List<EntityMonthlySalesGoal> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityMonthlySalesGoal> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityMonthlySalesGoal> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityMonthlySalesGoal update(
        EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws SystemException {
        return getPersistence().update(entityMonthlySalesGoal);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityMonthlySalesGoal update(
        EntityMonthlySalesGoal entityMonthlySalesGoal,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityMonthlySalesGoal, serviceContext);
    }

    /**
    * Caches the entity monthly sales goal in the entity cache if it is enabled.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal) {
        getPersistence().cacheResult(entityMonthlySalesGoal);
    }

    /**
    * Caches the entity monthly sales goals in the entity cache if it is enabled.
    *
    * @param entityMonthlySalesGoals the entity monthly sales goals
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> entityMonthlySalesGoals) {
        getPersistence().cacheResult(entityMonthlySalesGoals);
    }

    /**
    * Creates a new entity monthly sales goal with the primary key. Does not add the entity monthly sales goal to the database.
    *
    * @param entityMonthlySalesGoalPK the primary key for the new entity monthly sales goal
    * @return the new entity monthly sales goal
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal create(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK) {
        return getPersistence().create(entityMonthlySalesGoalPK);
    }

    /**
    * Removes the entity monthly sales goal with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal remove(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityMonthlySalesGoalPK);
    }

    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal updateImpl(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityMonthlySalesGoal);
    }

    /**
    * Returns the entity monthly sales goal with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException} if it could not be found.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal
    * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal findByPrimaryKey(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityMonthlySalesGoalPK);
    }

    /**
    * Returns the entity monthly sales goal with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal, or <code>null</code> if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityMonthlySalesGoal fetchByPrimaryKey(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityMonthlySalesGoalPK);
    }

    /**
    * Returns all the entity monthly sales goals.
    *
    * @return the entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity monthly sales goals.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity monthly sales goals
    * @param end the upper bound of the range of entity monthly sales goals (not inclusive)
    * @return the range of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity monthly sales goals.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity monthly sales goals
    * @param end the upper bound of the range of entity monthly sales goals (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity monthly sales goals from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity monthly sales goals.
    *
    * @return the number of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityMonthlySalesGoalPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityMonthlySalesGoalPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityMonthlySalesGoalPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityMonthlySalesGoalUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityMonthlySalesGoalPersistence persistence) {
    }
}
