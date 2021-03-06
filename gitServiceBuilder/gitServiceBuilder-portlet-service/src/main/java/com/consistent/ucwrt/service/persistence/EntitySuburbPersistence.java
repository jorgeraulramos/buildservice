package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySuburb;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity suburb service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburbPersistenceImpl
 * @see EntitySuburbUtil
 * @generated
 */
public interface EntitySuburbPersistence extends BasePersistence<EntitySuburb> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntitySuburbUtil} to access the entity suburb persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity suburbs where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @return the matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findBySuburbByState(
        int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity suburbs where municipalId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param municipalId the municipal ID
    * @param start the lower bound of the range of entity suburbs
    * @param end the upper bound of the range of entity suburbs (not inclusive)
    * @return the range of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findBySuburbByState(
        int municipalId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity suburbs where municipalId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param municipalId the municipal ID
    * @param start the lower bound of the range of entity suburbs
    * @param end the upper bound of the range of entity suburbs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findBySuburbByState(
        int municipalId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb findBySuburbByState_First(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb fetchBySuburbByState_First(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb findBySuburbByState_Last(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb fetchBySuburbByState_Last(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity suburbs before and after the current entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param suburbId the primary key of the current entity suburb
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb[] findBySuburbByState_PrevAndNext(
        int suburbId, int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity suburbs where municipalId = &#63; from the database.
    *
    * @param municipalId the municipal ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBySuburbByState(int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity suburbs where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @return the number of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public int countBySuburbByState(int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity suburbs where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @return the matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findByPostalCodeBySuburb(
        int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity suburbs where suburbId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param suburbId the suburb ID
    * @param start the lower bound of the range of entity suburbs
    * @param end the upper bound of the range of entity suburbs (not inclusive)
    * @return the range of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findByPostalCodeBySuburb(
        int suburbId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity suburbs where suburbId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param suburbId the suburb ID
    * @param start the lower bound of the range of entity suburbs
    * @param end the upper bound of the range of entity suburbs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findByPostalCodeBySuburb(
        int suburbId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb findByPostalCodeBySuburb_First(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb fetchByPostalCodeBySuburb_First(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb findByPostalCodeBySuburb_Last(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb fetchByPostalCodeBySuburb_Last(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity suburbs where suburbId = &#63; from the database.
    *
    * @param suburbId the suburb ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByPostalCodeBySuburb(int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity suburbs where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @return the number of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public int countByPostalCodeBySuburb(int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity suburb in the entity cache if it is enabled.
    *
    * @param entitySuburb the entity suburb
    */
    public void cacheResult(
        com.consistent.ucwrt.model.EntitySuburb entitySuburb);

    /**
    * Caches the entity suburbs in the entity cache if it is enabled.
    *
    * @param entitySuburbs the entity suburbs
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySuburb> entitySuburbs);

    /**
    * Creates a new entity suburb with the primary key. Does not add the entity suburb to the database.
    *
    * @param suburbId the primary key for the new entity suburb
    * @return the new entity suburb
    */
    public com.consistent.ucwrt.model.EntitySuburb create(int suburbId);

    /**
    * Removes the entity suburb with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param suburbId the primary key of the entity suburb
    * @return the entity suburb that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb remove(int suburbId)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntitySuburb updateImpl(
        com.consistent.ucwrt.model.EntitySuburb entitySuburb)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity suburb with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySuburbException} if it could not be found.
    *
    * @param suburbId the primary key of the entity suburb
    * @return the entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb findByPrimaryKey(
        int suburbId)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity suburb with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param suburbId the primary key of the entity suburb
    * @return the entity suburb, or <code>null</code> if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntitySuburb fetchByPrimaryKey(
        int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity suburbs.
    *
    * @return the entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity suburbs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity suburbs
    * @param end the upper bound of the range of entity suburbs (not inclusive)
    * @return the range of entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity suburbs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity suburbs
    * @param end the upper bound of the range of entity suburbs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntitySuburb> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity suburbs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity suburbs.
    *
    * @return the number of entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
