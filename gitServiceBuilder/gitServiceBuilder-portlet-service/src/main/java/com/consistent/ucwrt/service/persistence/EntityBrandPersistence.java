package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityBrand;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity brand service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrandPersistenceImpl
 * @see EntityBrandUtil
 * @generated
 */
public interface EntityBrandPersistence extends BasePersistence<EntityBrand> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityBrandUtil} to access the entity brand persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the entity brand where brandId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityBrandException} if it could not be found.
    *
    * @param brandId the brand ID
    * @return the matching entity brand
    * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a matching entity brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand findByfindBrand(int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity brand where brandId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param brandId the brand ID
    * @return the matching entity brand, or <code>null</code> if a matching entity brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand fetchByfindBrand(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity brand where brandId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param brandId the brand ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity brand, or <code>null</code> if a matching entity brand could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand fetchByfindBrand(
        int brandId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the entity brand where brandId = &#63; from the database.
    *
    * @param brandId the brand ID
    * @return the entity brand that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand removeByfindBrand(int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity brands where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @return the number of matching entity brands
    * @throws SystemException if a system exception occurred
    */
    public int countByfindBrand(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity brand in the entity cache if it is enabled.
    *
    * @param entityBrand the entity brand
    */
    public void cacheResult(com.consistent.ucwrt.model.EntityBrand entityBrand);

    /**
    * Caches the entity brands in the entity cache if it is enabled.
    *
    * @param entityBrands the entity brands
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityBrand> entityBrands);

    /**
    * Creates a new entity brand with the primary key. Does not add the entity brand to the database.
    *
    * @param brandId the primary key for the new entity brand
    * @return the new entity brand
    */
    public com.consistent.ucwrt.model.EntityBrand create(int brandId);

    /**
    * Removes the entity brand with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand remove(int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityBrand updateImpl(
        com.consistent.ucwrt.model.EntityBrand entityBrand)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity brand with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityBrandException} if it could not be found.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand
    * @throws com.consistent.ucwrt.NoSuchEntityBrandException if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand findByPrimaryKey(int brandId)
        throws com.consistent.ucwrt.NoSuchEntityBrandException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity brand with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param brandId the primary key of the entity brand
    * @return the entity brand, or <code>null</code> if a entity brand with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityBrand fetchByPrimaryKey(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity brands.
    *
    * @return the entity brands
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityBrand> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity brands
    * @param end the upper bound of the range of entity brands (not inclusive)
    * @return the range of entity brands
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityBrand> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity brands.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityBrandModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity brands
    * @param end the upper bound of the range of entity brands (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity brands
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityBrand> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity brands from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity brands.
    *
    * @return the number of entity brands
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
