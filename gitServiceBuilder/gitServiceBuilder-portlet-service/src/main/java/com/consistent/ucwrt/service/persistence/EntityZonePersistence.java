package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityZone;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity zone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityZonePersistenceImpl
 * @see EntityZoneUtil
 * @generated
 */
public interface EntityZonePersistence extends BasePersistence<EntityZone> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityZoneUtil} to access the entity zone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity zone in the entity cache if it is enabled.
    *
    * @param entityZone the entity zone
    */
    public void cacheResult(com.consistent.ucwrt.model.EntityZone entityZone);

    /**
    * Caches the entity zones in the entity cache if it is enabled.
    *
    * @param entityZones the entity zones
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityZone> entityZones);

    /**
    * Creates a new entity zone with the primary key. Does not add the entity zone to the database.
    *
    * @param zoneName the primary key for the new entity zone
    * @return the new entity zone
    */
    public com.consistent.ucwrt.model.EntityZone create(
        java.lang.String zoneName);

    /**
    * Removes the entity zone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param zoneName the primary key of the entity zone
    * @return the entity zone that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityZone remove(
        java.lang.String zoneName)
        throws com.consistent.ucwrt.NoSuchEntityZoneException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityZone updateImpl(
        com.consistent.ucwrt.model.EntityZone entityZone)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity zone with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityZoneException} if it could not be found.
    *
    * @param zoneName the primary key of the entity zone
    * @return the entity zone
    * @throws com.consistent.ucwrt.NoSuchEntityZoneException if a entity zone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityZone findByPrimaryKey(
        java.lang.String zoneName)
        throws com.consistent.ucwrt.NoSuchEntityZoneException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity zone with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param zoneName the primary key of the entity zone
    * @return the entity zone, or <code>null</code> if a entity zone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityZone fetchByPrimaryKey(
        java.lang.String zoneName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity zones.
    *
    * @return the entity zones
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityZone> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity zones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityZoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity zones
    * @param end the upper bound of the range of entity zones (not inclusive)
    * @return the range of entity zones
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityZone> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity zones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityZoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity zones
    * @param end the upper bound of the range of entity zones (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity zones
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityZone> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity zones from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity zones.
    *
    * @return the number of entity zones
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
