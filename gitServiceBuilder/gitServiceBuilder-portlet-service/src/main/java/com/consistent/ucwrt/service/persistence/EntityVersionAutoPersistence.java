package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityVersionAuto;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity version auto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAutoPersistenceImpl
 * @see EntityVersionAutoUtil
 * @generated
 */
public interface EntityVersionAutoPersistence extends BasePersistence<EntityVersionAuto> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityVersionAutoUtil} to access the entity version auto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionAutoException} if it could not be found.
    *
    * @param versionName the version name
    * @param purchasePrice the purchase price
    * @param salePrice the sale price
    * @param modelId the model ID
    * @param brandId the brand ID
    * @param yearModel the year model
    * @param classId the class ID
    * @return the matching entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto findByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param versionName the version name
    * @param purchasePrice the purchase price
    * @param salePrice the sale price
    * @param modelId the model ID
    * @param brandId the brand ID
    * @param yearModel the year model
    * @param classId the class ID
    * @return the matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param versionName the version name
    * @param purchasePrice the purchase price
    * @param salePrice the sale price
    * @param modelId the model ID
    * @param brandId the brand ID
    * @param yearModel the year model
    * @param classId the class ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the entity version auto where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63; from the database.
    *
    * @param versionName the version name
    * @param purchasePrice the purchase price
    * @param salePrice the sale price
    * @param modelId the model ID
    * @param brandId the brand ID
    * @param yearModel the year model
    * @param classId the class ID
    * @return the entity version auto that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto removeByVersion(
        java.lang.String versionName, double purchasePrice, double salePrice,
        int modelId, int brandId, int yearModel, int classId)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity version autos where versionName = &#63; and purchasePrice = &#63; and salePrice = &#63; and modelId = &#63; and brandId = &#63; and yearModel = &#63; and classId = &#63;.
    *
    * @param versionName the version name
    * @param purchasePrice the purchase price
    * @param salePrice the sale price
    * @param modelId the model ID
    * @param brandId the brand ID
    * @param yearModel the year model
    * @param classId the class ID
    * @return the number of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public int countByVersion(java.lang.String versionName,
        double purchasePrice, double salePrice, int modelId, int brandId,
        int yearModel, int classId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity version autos where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @return the matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModel(
        int brandId, int modelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity version autos where brandId = &#63; and modelId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @return the range of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModel(
        int brandId, int modelId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity version autos where brandId = &#63; and modelId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModel(
        int brandId, int modelId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto findByBrandModel_First(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModel_First(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto findByBrandModel_Last(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModel_Last(
        int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version autos before and after the current entity version auto in the ordered set where brandId = &#63; and modelId = &#63;.
    *
    * @param entityVersionAutoPK the primary key of the current entity version auto
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto[] findByBrandModel_PrevAndNext(
        EntityVersionAutoPK entityVersionAutoPK, int brandId, int modelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity version autos where brandId = &#63; and modelId = &#63; from the database.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByBrandModel(int brandId, int modelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity version autos where brandId = &#63; and modelId = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @return the number of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public int countByBrandModel(int brandId, int modelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @return the matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModelYear(
        int brandId, int modelId, int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @return the range of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModelYear(
        int brandId, int modelId, int yearModel, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findByBrandModelYear(
        int brandId, int modelId, int yearModel, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto findByBrandModelYear_First(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModelYear_First(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto findByBrandModelYear_Last(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity version auto, or <code>null</code> if a matching entity version auto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByBrandModelYear_Last(
        int brandId, int modelId, int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version autos before and after the current entity version auto in the ordered set where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param entityVersionAutoPK the primary key of the current entity version auto
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto[] findByBrandModelYear_PrevAndNext(
        EntityVersionAutoPK entityVersionAutoPK, int brandId, int modelId,
        int yearModel,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63; from the database.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @throws SystemException if a system exception occurred
    */
    public void removeByBrandModelYear(int brandId, int modelId, int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity version autos where brandId = &#63; and modelId = &#63; and yearModel = &#63;.
    *
    * @param brandId the brand ID
    * @param modelId the model ID
    * @param yearModel the year model
    * @return the number of matching entity version autos
    * @throws SystemException if a system exception occurred
    */
    public int countByBrandModelYear(int brandId, int modelId, int yearModel)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity version auto in the entity cache if it is enabled.
    *
    * @param entityVersionAuto the entity version auto
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto);

    /**
    * Caches the entity version autos in the entity cache if it is enabled.
    *
    * @param entityVersionAutos the entity version autos
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> entityVersionAutos);

    /**
    * Creates a new entity version auto with the primary key. Does not add the entity version auto to the database.
    *
    * @param entityVersionAutoPK the primary key for the new entity version auto
    * @return the new entity version auto
    */
    public com.consistent.ucwrt.model.EntityVersionAuto create(
        EntityVersionAutoPK entityVersionAutoPK);

    /**
    * Removes the entity version auto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto remove(
        EntityVersionAutoPK entityVersionAutoPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityVersionAuto updateImpl(
        com.consistent.ucwrt.model.EntityVersionAuto entityVersionAuto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version auto with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityVersionAutoException} if it could not be found.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto
    * @throws com.consistent.ucwrt.NoSuchEntityVersionAutoException if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto findByPrimaryKey(
        EntityVersionAutoPK entityVersionAutoPK)
        throws com.consistent.ucwrt.NoSuchEntityVersionAutoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity version auto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityVersionAutoPK the primary key of the entity version auto
    * @return the entity version auto, or <code>null</code> if a entity version auto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityVersionAuto fetchByPrimaryKey(
        EntityVersionAutoPK entityVersionAutoPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity version autos.
    *
    * @return the entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity version autos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @return the range of entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity version autos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity version autos
    * @param end the upper bound of the range of entity version autos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity version autos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityVersionAuto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity version autos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity version autos.
    *
    * @return the number of entity version autos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
