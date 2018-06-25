package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityMonthlySalesGoal;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity monthly sales goal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalPersistenceImpl
 * @see EntityMonthlySalesGoalUtil
 * @generated
 */
public interface EntityMonthlySalesGoalPersistence extends BasePersistence<EntityMonthlySalesGoal> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityMonthlySalesGoalUtil} to access the entity monthly sales goal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity monthly sales goal in the entity cache if it is enabled.
    *
    * @param entityMonthlySalesGoal the entity monthly sales goal
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal);

    /**
    * Caches the entity monthly sales goals in the entity cache if it is enabled.
    *
    * @param entityMonthlySalesGoals the entity monthly sales goals
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> entityMonthlySalesGoals);

    /**
    * Creates a new entity monthly sales goal with the primary key. Does not add the entity monthly sales goal to the database.
    *
    * @param entityMonthlySalesGoalPK the primary key for the new entity monthly sales goal
    * @return the new entity monthly sales goal
    */
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal create(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK);

    /**
    * Removes the entity monthly sales goal with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal remove(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityMonthlySalesGoal updateImpl(
        com.consistent.ucwrt.model.EntityMonthlySalesGoal entityMonthlySalesGoal)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity monthly sales goal with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException} if it could not be found.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal
    * @throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal findByPrimaryKey(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity monthly sales goal with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityMonthlySalesGoalPK the primary key of the entity monthly sales goal
    * @return the entity monthly sales goal, or <code>null</code> if a entity monthly sales goal with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMonthlySalesGoal fetchByPrimaryKey(
        EntityMonthlySalesGoalPK entityMonthlySalesGoalPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity monthly sales goals.
    *
    * @return the entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityMonthlySalesGoal> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity monthly sales goals from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity monthly sales goals.
    *
    * @return the number of entity monthly sales goals
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
