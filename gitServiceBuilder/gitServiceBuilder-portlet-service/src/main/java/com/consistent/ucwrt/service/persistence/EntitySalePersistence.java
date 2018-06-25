package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySale;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity sale service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalePersistenceImpl
 * @see EntitySaleUtil
 * @generated
 */
public interface EntitySalePersistence extends BasePersistence<EntitySale> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntitySaleUtil} to access the entity sale persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity sale in the entity cache if it is enabled.
    *
    * @param entitySale the entity sale
    */
    public void cacheResult(com.consistent.ucwrt.model.EntitySale entitySale);

    /**
    * Caches the entity sales in the entity cache if it is enabled.
    *
    * @param entitySales the entity sales
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySale> entitySales);

    /**
    * Creates a new entity sale with the primary key. Does not add the entity sale to the database.
    *
    * @param saleId the primary key for the new entity sale
    * @return the new entity sale
    */
    public com.consistent.ucwrt.model.EntitySale create(int saleId);

    /**
    * Removes the entity sale with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySale remove(int saleId)
        throws com.consistent.ucwrt.NoSuchEntitySaleException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntitySale updateImpl(
        com.consistent.ucwrt.model.EntitySale entitySale)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity sale with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySaleException} if it could not be found.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale
    * @throws com.consistent.ucwrt.NoSuchEntitySaleException if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySale findByPrimaryKey(int saleId)
        throws com.consistent.ucwrt.NoSuchEntitySaleException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity sale with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param saleId the primary key of the entity sale
    * @return the entity sale, or <code>null</code> if a entity sale with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySale fetchByPrimaryKey(int saleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity sales.
    *
    * @return the entity sales
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySale> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity sales.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales
    * @param end the upper bound of the range of entity sales (not inclusive)
    * @return the range of entity sales
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySale> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity sales.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySaleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity sales
    * @param end the upper bound of the range of entity sales (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity sales
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySale> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity sales from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity sales.
    *
    * @return the number of entity sales
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
