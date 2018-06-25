package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySalesPlace;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity sales place service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlacePersistenceImpl
 * @see EntitySalesPlaceUtil
 * @generated
 */
public interface EntitySalesPlacePersistence extends BasePersistence<EntitySalesPlace> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntitySalesPlaceUtil} to access the entity sales place persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity sales place in the entity cache if it is enabled.
    *
    * @param entitySalesPlace the entity sales place
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntitySalesPlace entitySalesPlace);

    /**
    * Caches the entity sales places in the entity cache if it is enabled.
    *
    * @param entitySalesPlaces the entity sales places
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> entitySalesPlaces);

    /**
    * Creates a new entity sales place with the primary key. Does not add the entity sales place to the database.
    *
    * @param salesPlaceId the primary key for the new entity sales place
    * @return the new entity sales place
    */
    public com.consistent.ucwrt.model.EntitySalesPlace create(int salesPlaceId);

    /**
    * Removes the entity sales place with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param salesPlaceId the primary key of the entity sales place
    * @return the entity sales place that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySalesPlace remove(int salesPlaceId)
        throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntitySalesPlace updateImpl(
        com.consistent.ucwrt.model.EntitySalesPlace entitySalesPlace)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity sales place with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySalesPlaceException} if it could not be found.
    *
    * @param salesPlaceId the primary key of the entity sales place
    * @return the entity sales place
    * @throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException if a entity sales place with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySalesPlace findByPrimaryKey(
        int salesPlaceId)
        throws com.consistent.ucwrt.NoSuchEntitySalesPlaceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity sales place with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param salesPlaceId the primary key of the entity sales place
    * @return the entity sales place, or <code>null</code> if a entity sales place with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySalesPlace fetchByPrimaryKey(
        int salesPlaceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity sales places.
    *
    * @return the entity sales places
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity sales places.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales places
    * @param end the upper bound of the range of entity sales places (not inclusive)
    * @return the range of entity sales places
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity sales places.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySalesPlaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales places
    * @param end the upper bound of the range of entity sales places (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity sales places
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySalesPlace> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity sales places from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity sales places.
    *
    * @return the number of entity sales places
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
