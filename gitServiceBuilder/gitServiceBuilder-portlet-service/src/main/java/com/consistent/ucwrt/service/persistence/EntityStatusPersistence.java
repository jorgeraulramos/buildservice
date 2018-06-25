package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityStatus;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatusPersistenceImpl
 * @see EntityStatusUtil
 * @generated
 */
public interface EntityStatusPersistence extends BasePersistence<EntityStatus> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityStatusUtil} to access the entity status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity status in the entity cache if it is enabled.
    *
    * @param entityStatus the entity status
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityStatus entityStatus);

    /**
    * Caches the entity statuses in the entity cache if it is enabled.
    *
    * @param entityStatuses the entity statuses
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityStatus> entityStatuses);

    /**
    * Creates a new entity status with the primary key. Does not add the entity status to the database.
    *
    * @param statusName the primary key for the new entity status
    * @return the new entity status
    */
    public com.consistent.ucwrt.model.EntityStatus create(
        java.lang.String statusName);

    /**
    * Removes the entity status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityStatusException if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityStatus remove(
        java.lang.String statusName)
        throws com.consistent.ucwrt.NoSuchEntityStatusException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityStatus updateImpl(
        com.consistent.ucwrt.model.EntityStatus entityStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity status with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityStatusException} if it could not be found.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status
    * @throws com.consistent.ucwrt.NoSuchEntityStatusException if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityStatus findByPrimaryKey(
        java.lang.String statusName)
        throws com.consistent.ucwrt.NoSuchEntityStatusException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity status with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param statusName the primary key of the entity status
    * @return the entity status, or <code>null</code> if a entity status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityStatus fetchByPrimaryKey(
        java.lang.String statusName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity statuses.
    *
    * @return the entity statuses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityStatus> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity statuses
    * @param end the upper bound of the range of entity statuses (not inclusive)
    * @return the range of entity statuses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityStatus> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity statuses
    * @param end the upper bound of the range of entity statuses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity statuses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityStatus> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity statuses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity statuses.
    *
    * @return the number of entity statuses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
