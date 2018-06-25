package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityState;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatePersistenceImpl
 * @see EntityStateUtil
 * @generated
 */
public interface EntityStatePersistence extends BasePersistence<EntityState> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityStateUtil} to access the entity state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity state in the entity cache if it is enabled.
    *
    * @param entityState the entity state
    */
    public void cacheResult(com.consistent.ucwrt.model.EntityState entityState);

    /**
    * Caches the entity states in the entity cache if it is enabled.
    *
    * @param entityStates the entity states
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityState> entityStates);

    /**
    * Creates a new entity state with the primary key. Does not add the entity state to the database.
    *
    * @param stateId the primary key for the new entity state
    * @return the new entity state
    */
    public com.consistent.ucwrt.model.EntityState create(int stateId);

    /**
    * Removes the entity state with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param stateId the primary key of the entity state
    * @return the entity state that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityStateException if a entity state with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityState remove(int stateId)
        throws com.consistent.ucwrt.NoSuchEntityStateException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityState updateImpl(
        com.consistent.ucwrt.model.EntityState entityState)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity state with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityStateException} if it could not be found.
    *
    * @param stateId the primary key of the entity state
    * @return the entity state
    * @throws com.consistent.ucwrt.NoSuchEntityStateException if a entity state with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityState findByPrimaryKey(int stateId)
        throws com.consistent.ucwrt.NoSuchEntityStateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity state with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param stateId the primary key of the entity state
    * @return the entity state, or <code>null</code> if a entity state with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityState fetchByPrimaryKey(int stateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity states.
    *
    * @return the entity states
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityState> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity states.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity states
    * @param end the upper bound of the range of entity states (not inclusive)
    * @return the range of entity states
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityState> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity states.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity states
    * @param end the upper bound of the range of entity states (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity states
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityState> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity states from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity states.
    *
    * @return the number of entity states
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
