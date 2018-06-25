package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEmployment;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity employment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmploymentPersistenceImpl
 * @see EntityEmploymentUtil
 * @generated
 */
public interface EntityEmploymentPersistence extends BasePersistence<EntityEmployment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityEmploymentUtil} to access the entity employment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity employment in the entity cache if it is enabled.
    *
    * @param entityEmployment the entity employment
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment);

    /**
    * Caches the entity employments in the entity cache if it is enabled.
    *
    * @param entityEmployments the entity employments
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityEmployment> entityEmployments);

    /**
    * Creates a new entity employment with the primary key. Does not add the entity employment to the database.
    *
    * @param entityEmploymentPK the primary key for the new entity employment
    * @return the new entity employment
    */
    public com.consistent.ucwrt.model.EntityEmployment create(
        EntityEmploymentPK entityEmploymentPK);

    /**
    * Removes the entity employment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployment remove(
        EntityEmploymentPK entityEmploymentPK)
        throws com.consistent.ucwrt.NoSuchEntityEmploymentException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityEmployment updateImpl(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity employment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEmploymentException} if it could not be found.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment
    * @throws com.consistent.ucwrt.NoSuchEntityEmploymentException if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployment findByPrimaryKey(
        EntityEmploymentPK entityEmploymentPK)
        throws com.consistent.ucwrt.NoSuchEntityEmploymentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity employment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment, or <code>null</code> if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityEmployment fetchByPrimaryKey(
        EntityEmploymentPK entityEmploymentPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity employments.
    *
    * @return the entity employments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityEmployment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityEmployment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityEmployment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity employments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity employments.
    *
    * @return the number of entity employments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
