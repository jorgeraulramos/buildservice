package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySuburb;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity suburb service. This utility wraps {@link EntitySuburbPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburbPersistence
 * @see EntitySuburbPersistenceImpl
 * @generated
 */
public class EntitySuburbUtil {
    private static EntitySuburbPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(EntitySuburb entitySuburb) {
        getPersistence().clearCache(entitySuburb);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<EntitySuburb> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntitySuburb> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntitySuburb> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntitySuburb update(EntitySuburb entitySuburb)
        throws SystemException {
        return getPersistence().update(entitySuburb);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntitySuburb update(EntitySuburb entitySuburb,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entitySuburb, serviceContext);
    }

    /**
    * Returns all the entity suburbs where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @return the matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findBySuburbByState(
        int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySuburbByState(municipalId);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findBySuburbByState(
        int municipalId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySuburbByState(municipalId, start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findBySuburbByState(
        int municipalId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySuburbByState(municipalId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb findBySuburbByState_First(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySuburbByState_First(municipalId, orderByComparator);
    }

    /**
    * Returns the first entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb fetchBySuburbByState_First(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySuburbByState_First(municipalId, orderByComparator);
    }

    /**
    * Returns the last entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb findBySuburbByState_Last(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySuburbByState_Last(municipalId, orderByComparator);
    }

    /**
    * Returns the last entity suburb in the ordered set where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb fetchBySuburbByState_Last(
        int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySuburbByState_Last(municipalId, orderByComparator);
    }

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
    public static com.consistent.ucwrt.model.EntitySuburb[] findBySuburbByState_PrevAndNext(
        int suburbId, int municipalId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySuburbByState_PrevAndNext(suburbId, municipalId,
            orderByComparator);
    }

    /**
    * Removes all the entity suburbs where municipalId = &#63; from the database.
    *
    * @param municipalId the municipal ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBySuburbByState(int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBySuburbByState(municipalId);
    }

    /**
    * Returns the number of entity suburbs where municipalId = &#63;.
    *
    * @param municipalId the municipal ID
    * @return the number of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public static int countBySuburbByState(int municipalId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySuburbByState(municipalId);
    }

    /**
    * Returns all the entity suburbs where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @return the matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findByPostalCodeBySuburb(
        int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPostalCodeBySuburb(suburbId);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findByPostalCodeBySuburb(
        int suburbId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPostalCodeBySuburb(suburbId, start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findByPostalCodeBySuburb(
        int suburbId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPostalCodeBySuburb(suburbId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb findByPostalCodeBySuburb_First(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPostalCodeBySuburb_First(suburbId, orderByComparator);
    }

    /**
    * Returns the first entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb fetchByPostalCodeBySuburb_First(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPostalCodeBySuburb_First(suburbId, orderByComparator);
    }

    /**
    * Returns the last entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb findByPostalCodeBySuburb_Last(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPostalCodeBySuburb_Last(suburbId, orderByComparator);
    }

    /**
    * Returns the last entity suburb in the ordered set where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity suburb, or <code>null</code> if a matching entity suburb could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb fetchByPostalCodeBySuburb_Last(
        int suburbId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPostalCodeBySuburb_Last(suburbId, orderByComparator);
    }

    /**
    * Removes all the entity suburbs where suburbId = &#63; from the database.
    *
    * @param suburbId the suburb ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPostalCodeBySuburb(int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPostalCodeBySuburb(suburbId);
    }

    /**
    * Returns the number of entity suburbs where suburbId = &#63;.
    *
    * @param suburbId the suburb ID
    * @return the number of matching entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public static int countByPostalCodeBySuburb(int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPostalCodeBySuburb(suburbId);
    }

    /**
    * Caches the entity suburb in the entity cache if it is enabled.
    *
    * @param entitySuburb the entity suburb
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntitySuburb entitySuburb) {
        getPersistence().cacheResult(entitySuburb);
    }

    /**
    * Caches the entity suburbs in the entity cache if it is enabled.
    *
    * @param entitySuburbs the entity suburbs
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntitySuburb> entitySuburbs) {
        getPersistence().cacheResult(entitySuburbs);
    }

    /**
    * Creates a new entity suburb with the primary key. Does not add the entity suburb to the database.
    *
    * @param suburbId the primary key for the new entity suburb
    * @return the new entity suburb
    */
    public static com.consistent.ucwrt.model.EntitySuburb create(int suburbId) {
        return getPersistence().create(suburbId);
    }

    /**
    * Removes the entity suburb with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param suburbId the primary key of the entity suburb
    * @return the entity suburb that was removed
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb remove(int suburbId)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(suburbId);
    }

    public static com.consistent.ucwrt.model.EntitySuburb updateImpl(
        com.consistent.ucwrt.model.EntitySuburb entitySuburb)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entitySuburb);
    }

    /**
    * Returns the entity suburb with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntitySuburbException} if it could not be found.
    *
    * @param suburbId the primary key of the entity suburb
    * @return the entity suburb
    * @throws com.consistent.ucwrt.NoSuchEntitySuburbException if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb findByPrimaryKey(
        int suburbId)
        throws com.consistent.ucwrt.NoSuchEntitySuburbException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(suburbId);
    }

    /**
    * Returns the entity suburb with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param suburbId the primary key of the entity suburb
    * @return the entity suburb, or <code>null</code> if a entity suburb with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntitySuburb fetchByPrimaryKey(
        int suburbId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(suburbId);
    }

    /**
    * Returns all the entity suburbs.
    *
    * @return the entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntitySuburb> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity suburbs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity suburbs.
    *
    * @return the number of entity suburbs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntitySuburbPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntitySuburbPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntitySuburbPersistence.class.getName());

            ReferenceRegistry.registerReference(EntitySuburbUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntitySuburbPersistence persistence) {
    }
}
