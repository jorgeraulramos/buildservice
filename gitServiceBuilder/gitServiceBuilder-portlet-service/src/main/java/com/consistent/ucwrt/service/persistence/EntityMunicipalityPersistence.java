package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityMunicipality;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity municipality service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMunicipalityPersistenceImpl
 * @see EntityMunicipalityUtil
 * @generated
 */
public interface EntityMunicipalityPersistence extends BasePersistence<EntityMunicipality> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityMunicipalityUtil} to access the entity municipality persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity municipalities where stateId = &#63;.
    *
    * @param stateId the state ID
    * @return the matching entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMunicipality> findByMunicipalityByState(
        int stateId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity municipalities where stateId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stateId the state ID
    * @param start the lower bound of the range of entity municipalities
    * @param end the upper bound of the range of entity municipalities (not inclusive)
    * @return the range of matching entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMunicipality> findByMunicipalityByState(
        int stateId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity municipalities where stateId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stateId the state ID
    * @param start the lower bound of the range of entity municipalities
    * @param end the upper bound of the range of entity municipalities (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMunicipality> findByMunicipalityByState(
        int stateId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity municipality in the ordered set where stateId = &#63;.
    *
    * @param stateId the state ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity municipality
    * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a matching entity municipality could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality findByMunicipalityByState_First(
        int stateId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityMunicipalityException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity municipality in the ordered set where stateId = &#63;.
    *
    * @param stateId the state ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity municipality, or <code>null</code> if a matching entity municipality could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality fetchByMunicipalityByState_First(
        int stateId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity municipality in the ordered set where stateId = &#63;.
    *
    * @param stateId the state ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity municipality
    * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a matching entity municipality could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality findByMunicipalityByState_Last(
        int stateId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityMunicipalityException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity municipality in the ordered set where stateId = &#63;.
    *
    * @param stateId the state ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity municipality, or <code>null</code> if a matching entity municipality could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality fetchByMunicipalityByState_Last(
        int stateId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity municipalities before and after the current entity municipality in the ordered set where stateId = &#63;.
    *
    * @param municipalId the primary key of the current entity municipality
    * @param stateId the state ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity municipality
    * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality[] findByMunicipalityByState_PrevAndNext(
        int municipalId, int stateId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityMunicipalityException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity municipalities where stateId = &#63; from the database.
    *
    * @param stateId the state ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByMunicipalityByState(int stateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity municipalities where stateId = &#63;.
    *
    * @param stateId the state ID
    * @return the number of matching entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public int countByMunicipalityByState(int stateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity municipality in the entity cache if it is enabled.
    *
    * @param entityMunicipality the entity municipality
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntityMunicipality entityMunicipality);

    /**
    * Caches the entity municipalities in the entity cache if it is enabled.
    *
    * @param entityMunicipalities the entity municipalities
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityMunicipality> entityMunicipalities);

    /**
    * Creates a new entity municipality with the primary key. Does not add the entity municipality to the database.
    *
    * @param municipalId the primary key for the new entity municipality
    * @return the new entity municipality
    */
    public com.consistent.ucwrt.model.EntityMunicipality create(int municipalId);

    /**
    * Removes the entity municipality with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param municipalId the primary key of the entity municipality
    * @return the entity municipality that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality remove(int municipalId)
        throws com.consistent.ucwrt.NoSuchEntityMunicipalityException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityMunicipality updateImpl(
        com.consistent.ucwrt.model.EntityMunicipality entityMunicipality)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity municipality with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityMunicipalityException} if it could not be found.
    *
    * @param municipalId the primary key of the entity municipality
    * @return the entity municipality
    * @throws com.consistent.ucwrt.NoSuchEntityMunicipalityException if a entity municipality with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality findByPrimaryKey(
        int municipalId)
        throws com.consistent.ucwrt.NoSuchEntityMunicipalityException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity municipality with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param municipalId the primary key of the entity municipality
    * @return the entity municipality, or <code>null</code> if a entity municipality with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityMunicipality fetchByPrimaryKey(
        int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity municipalities.
    *
    * @return the entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMunicipality> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity municipalities.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity municipalities
    * @param end the upper bound of the range of entity municipalities (not inclusive)
    * @return the range of entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMunicipality> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity municipalities.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityMunicipalityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity municipalities
    * @param end the upper bound of the range of entity municipalities (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityMunicipality> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity municipalities from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity municipalities.
    *
    * @return the number of entity municipalities
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
