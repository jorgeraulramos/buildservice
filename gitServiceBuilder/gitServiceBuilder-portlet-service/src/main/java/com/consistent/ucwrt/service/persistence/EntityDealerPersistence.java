package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityDealer;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity dealer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealerPersistenceImpl
 * @see EntityDealerUtil
 * @generated
 */
public interface EntityDealerPersistence extends BasePersistence<EntityDealer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityDealerUtil} to access the entity dealer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity dealers where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the matching entity dealers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDealer> findByDealerByDealerId(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity dealers where dealerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param start the lower bound of the range of entity dealers
    * @param end the upper bound of the range of entity dealers (not inclusive)
    * @return the range of matching entity dealers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDealer> findByDealerByDealerId(
        java.lang.String dealerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity dealers where dealerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dealerId the dealer ID
    * @param start the lower bound of the range of entity dealers
    * @param end the upper bound of the range of entity dealers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity dealers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDealer> findByDealerByDealerId(
        java.lang.String dealerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity dealer
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer findByDealerByDealerId_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity dealer, or <code>null</code> if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer fetchByDealerByDealerId_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity dealer
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer findByDealerByDealerId_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity dealer, or <code>null</code> if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer fetchByDealerByDealerId_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity dealers where dealerId = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByDealerByDealerId(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity dealers where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the number of matching entity dealers
    * @throws SystemException if a system exception occurred
    */
    public int countByDealerByDealerId(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity dealer in the entity cache if it is enabled.
    *
    * @param entityDealer the entity dealer
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityDealer entityDealer);

    /**
    * Caches the entity dealers in the entity cache if it is enabled.
    *
    * @param entityDealers the entity dealers
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityDealer> entityDealers);

    /**
    * Creates a new entity dealer with the primary key. Does not add the entity dealer to the database.
    *
    * @param dealerId the primary key for the new entity dealer
    * @return the new entity dealer
    */
    public com.consistent.ucwrt.model.EntityDealer create(
        java.lang.String dealerId);

    /**
    * Removes the entity dealer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param dealerId the primary key of the entity dealer
    * @return the entity dealer that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer remove(
        java.lang.String dealerId)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityDealer updateImpl(
        com.consistent.ucwrt.model.EntityDealer entityDealer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity dealer with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityDealerException} if it could not be found.
    *
    * @param dealerId the primary key of the entity dealer
    * @return the entity dealer
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer findByPrimaryKey(
        java.lang.String dealerId)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity dealer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param dealerId the primary key of the entity dealer
    * @return the entity dealer, or <code>null</code> if a entity dealer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityDealer fetchByPrimaryKey(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity dealers.
    *
    * @return the entity dealers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDealer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity dealers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity dealers
    * @param end the upper bound of the range of entity dealers (not inclusive)
    * @return the range of entity dealers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDealer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity dealers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityDealerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity dealers
    * @param end the upper bound of the range of entity dealers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity dealers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityDealer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity dealers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity dealers.
    *
    * @return the number of entity dealers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
