package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityProspection;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity prospection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspectionPersistenceImpl
 * @see EntityProspectionUtil
 * @generated
 */
public interface EntityProspectionPersistence extends BasePersistence<EntityProspection> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityProspectionUtil} to access the entity prospection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity prospection in the entity cache if it is enabled.
    *
    * @param entityProspection the entity prospection
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityProspection entityProspection);

    /**
    * Caches the entity prospections in the entity cache if it is enabled.
    *
    * @param entityProspections the entity prospections
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityProspection> entityProspections);

    /**
    * Creates a new entity prospection with the primary key. Does not add the entity prospection to the database.
    *
    * @param prospectionId the primary key for the new entity prospection
    * @return the new entity prospection
    */
    public com.consistent.ucwrt.model.EntityProspection create(
        int prospectionId);

    /**
    * Removes the entity prospection with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityProspection remove(
        int prospectionId)
        throws com.consistent.ucwrt.NoSuchEntityProspectionException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityProspection updateImpl(
        com.consistent.ucwrt.model.EntityProspection entityProspection)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity prospection with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityProspectionException} if it could not be found.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection
    * @throws com.consistent.ucwrt.NoSuchEntityProspectionException if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityProspection findByPrimaryKey(
        int prospectionId)
        throws com.consistent.ucwrt.NoSuchEntityProspectionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity prospection with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param prospectionId the primary key of the entity prospection
    * @return the entity prospection, or <code>null</code> if a entity prospection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityProspection fetchByPrimaryKey(
        int prospectionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity prospections.
    *
    * @return the entity prospections
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityProspection> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityProspection> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityProspection> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity prospections from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity prospections.
    *
    * @return the number of entity prospections
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
