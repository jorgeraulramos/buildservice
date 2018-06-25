package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityVersionEquipment;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity version equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentPersistenceImpl
 * @see EntityVersionEquipmentUtil
 * @generated
 */
public interface EntityVersionEquipmentPersistence extends BasePersistence<EntityVersionEquipment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityVersionEquipmentUtil} to access the entity version equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity version equipment in the entity cache if it is enabled.
    *
    * @param entityVersionEquipment the entity version equipment
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment);

    /**
    * Caches the entity version equipments in the entity cache if it is enabled.
    *
    * @param entityVersionEquipments the entity version equipments
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> entityVersionEquipments);

    /**
    * Creates a new entity version equipment with the primary key. Does not add the entity version equipment to the database.
    *
    * @param entityVersionEquipmentPK the primary key for the new entity version equipment
    * @return the new entity version equipment
    */
    public com.consistent.ucwrt.model.EntityVersionEquipment create(
        EntityVersionEquipmentPK entityVersionEquipmentPK);

    /**
    * Removes the entity version equipment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionEquipment remove(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityVersionEquipment updateImpl(
        com.consistent.ucwrt.model.EntityVersionEquipment entityVersionEquipment)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version equipment with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionEquipmentException} if it could not be found.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment
    * @throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionEquipment findByPrimaryKey(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionEquipmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version equipment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityVersionEquipmentPK the primary key of the entity version equipment
    * @return the entity version equipment, or <code>null</code> if a entity version equipment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionEquipment fetchByPrimaryKey(
        EntityVersionEquipmentPK entityVersionEquipmentPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity version equipments.
    *
    * @return the entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity version equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version equipments
    * @param end the upper bound of the range of entity version equipments (not inclusive)
    * @return the range of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity version equipments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version equipments
    * @param end the upper bound of the range of entity version equipments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionEquipment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity version equipments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity version equipments.
    *
    * @return the number of entity version equipments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}