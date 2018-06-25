package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityClass;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity class service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityClassPersistenceImpl
 * @see EntityClassUtil
 * @generated
 */
public interface EntityClassPersistence extends BasePersistence<EntityClass> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityClassUtil} to access the entity class persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the entity class where className = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
    *
    * @param className the class name
    * @return the matching entity class
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass findByClassName(
        java.lang.String className)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class where className = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param className the class name
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass fetchByClassName(
        java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class where className = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param className the class name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass fetchByClassName(
        java.lang.String className, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the entity class where className = &#63; from the database.
    *
    * @param className the class name
    * @return the entity class that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass removeByClassName(
        java.lang.String className)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity classes where className = &#63;.
    *
    * @param className the class name
    * @return the number of matching entity classes
    * @throws SystemException if a system exception occurred
    */
    public int countByClassName(java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class where classId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
    *
    * @param classId the class ID
    * @return the matching entity class
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass findByClassId(int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class where classId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param classId the class ID
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass fetchByClassId(int classId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class where classId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param classId the class ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass fetchByClassId(int classId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the entity class where classId = &#63; from the database.
    *
    * @param classId the class ID
    * @return the entity class that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass removeByClassId(int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity classes where classId = &#63;.
    *
    * @param classId the class ID
    * @return the number of matching entity classes
    * @throws SystemException if a system exception occurred
    */
    public int countByClassId(int classId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity class in the entity cache if it is enabled.
    *
    * @param entityClass the entity class
    */
    public void cacheResult(com.consistent.ucwrt.model.EntityClass entityClass);

    /**
    * Caches the entity classes in the entity cache if it is enabled.
    *
    * @param entityClasses the entity classes
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityClass> entityClasses);

    /**
    * Creates a new entity class with the primary key. Does not add the entity class to the database.
    *
    * @param classId the primary key for the new entity class
    * @return the new entity class
    */
    public com.consistent.ucwrt.model.EntityClass create(int classId);

    /**
    * Removes the entity class with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param classId the primary key of the entity class
    * @return the entity class that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass remove(int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityClass updateImpl(
        com.consistent.ucwrt.model.EntityClass entityClass)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
    *
    * @param classId the primary key of the entity class
    * @return the entity class
    * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass findByPrimaryKey(int classId)
        throws com.consistent.ucwrt.NoSuchEntityClassException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity class with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param classId the primary key of the entity class
    * @return the entity class, or <code>null</code> if a entity class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityClass fetchByPrimaryKey(int classId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity classes.
    *
    * @return the entity classes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityClass> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityClass> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.consistent.ucwrt.model.EntityClass> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity classes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity classes.
    *
    * @return the number of entity classes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
