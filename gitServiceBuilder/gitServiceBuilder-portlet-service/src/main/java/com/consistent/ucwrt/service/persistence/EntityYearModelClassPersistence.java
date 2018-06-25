package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityYearModelClass;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity year model class service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClassPersistenceImpl
 * @see EntityYearModelClassUtil
 * @generated
 */
public interface EntityYearModelClassPersistence extends BasePersistence<EntityYearModelClass> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityYearModelClassUtil} to access the entity year model class persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity year model class in the entity cache if it is enabled.
    *
    * @param entityYearModelClass the entity year model class
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass);

    /**
    * Caches the entity year model classes in the entity cache if it is enabled.
    *
    * @param entityYearModelClasses the entity year model classes
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> entityYearModelClasses);

    /**
    * Creates a new entity year model class with the primary key. Does not add the entity year model class to the database.
    *
    * @param entityYearModelClassPK the primary key for the new entity year model class
    * @return the new entity year model class
    */
    public com.consistent.ucwrt.model.EntityYearModelClass create(
        EntityYearModelClassPK entityYearModelClassPK);

    /**
    * Removes the entity year model class with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityYearModelClass remove(
        EntityYearModelClassPK entityYearModelClassPK)
        throws com.consistent.ucwrt.NoSuchEntityYearModelClassException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityYearModelClass updateImpl(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity year model class with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityYearModelClassException} if it could not be found.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class
    * @throws com.consistent.ucwrt.NoSuchEntityYearModelClassException if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityYearModelClass findByPrimaryKey(
        EntityYearModelClassPK entityYearModelClassPK)
        throws com.consistent.ucwrt.NoSuchEntityYearModelClassException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity year model class with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class, or <code>null</code> if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityYearModelClass fetchByPrimaryKey(
        EntityYearModelClassPK entityYearModelClassPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity year model classes.
    *
    * @return the entity year model classes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity year model classes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity year model classes.
    *
    * @return the number of entity year model classes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
