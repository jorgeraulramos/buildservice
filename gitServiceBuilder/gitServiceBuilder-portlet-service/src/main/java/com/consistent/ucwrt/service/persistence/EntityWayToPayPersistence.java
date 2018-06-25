package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityWayToPay;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity way to pay service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPayPersistenceImpl
 * @see EntityWayToPayUtil
 * @generated
 */
public interface EntityWayToPayPersistence extends BasePersistence<EntityWayToPay> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityWayToPayUtil} to access the entity way to pay persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity way to pay in the entity cache if it is enabled.
    *
    * @param entityWayToPay the entity way to pay
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay);

    /**
    * Caches the entity way to paies in the entity cache if it is enabled.
    *
    * @param entityWayToPaies the entity way to paies
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityWayToPay> entityWayToPaies);

    /**
    * Creates a new entity way to pay with the primary key. Does not add the entity way to pay to the database.
    *
    * @param wayPayId the primary key for the new entity way to pay
    * @return the new entity way to pay
    */
    public com.consistent.ucwrt.model.EntityWayToPay create(int wayPayId);

    /**
    * Removes the entity way to pay with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityWayToPay remove(int wayPayId)
        throws com.consistent.ucwrt.NoSuchEntityWayToPayException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityWayToPay updateImpl(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity way to pay with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityWayToPayException} if it could not be found.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay
    * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityWayToPay findByPrimaryKey(
        int wayPayId)
        throws com.consistent.ucwrt.NoSuchEntityWayToPayException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity way to pay with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay, or <code>null</code> if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityWayToPay fetchByPrimaryKey(
        int wayPayId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity way to paies.
    *
    * @return the entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityWayToPay> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity way to paies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity way to paies
    * @param end the upper bound of the range of entity way to paies (not inclusive)
    * @return the range of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityWayToPay> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity way to paies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity way to paies
    * @param end the upper bound of the range of entity way to paies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityWayToPay> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity way to paies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity way to paies.
    *
    * @return the number of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
