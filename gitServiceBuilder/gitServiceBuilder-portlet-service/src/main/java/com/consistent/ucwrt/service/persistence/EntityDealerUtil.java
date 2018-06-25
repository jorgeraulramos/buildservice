package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityDealer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity dealer service. This utility wraps {@link EntityDealerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealerPersistence
 * @see EntityDealerPersistenceImpl
 * @generated
 */
public class EntityDealerUtil {
    private static EntityDealerPersistence _persistence;

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
    public static void clearCache(EntityDealer entityDealer) {
        getPersistence().clearCache(entityDealer);
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
    public static List<EntityDealer> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityDealer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityDealer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityDealer update(EntityDealer entityDealer)
        throws SystemException {
        return getPersistence().update(entityDealer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityDealer update(EntityDealer entityDealer,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityDealer, serviceContext);
    }

    /**
    * Returns all the entity dealers where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the matching entity dealers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityDealer> findByDealerByDealerId(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDealerByDealerId(dealerId);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityDealer> findByDealerByDealerId(
        java.lang.String dealerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDealerByDealerId(dealerId, start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityDealer> findByDealerByDealerId(
        java.lang.String dealerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDealerByDealerId(dealerId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity dealer
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer findByDealerByDealerId_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDealerByDealerId_First(dealerId, orderByComparator);
    }

    /**
    * Returns the first entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity dealer, or <code>null</code> if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer fetchByDealerByDealerId_First(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDealerByDealerId_First(dealerId, orderByComparator);
    }

    /**
    * Returns the last entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity dealer
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer findByDealerByDealerId_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDealerByDealerId_Last(dealerId, orderByComparator);
    }

    /**
    * Returns the last entity dealer in the ordered set where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity dealer, or <code>null</code> if a matching entity dealer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer fetchByDealerByDealerId_Last(
        java.lang.String dealerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDealerByDealerId_Last(dealerId, orderByComparator);
    }

    /**
    * Removes all the entity dealers where dealerId = &#63; from the database.
    *
    * @param dealerId the dealer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDealerByDealerId(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDealerByDealerId(dealerId);
    }

    /**
    * Returns the number of entity dealers where dealerId = &#63;.
    *
    * @param dealerId the dealer ID
    * @return the number of matching entity dealers
    * @throws SystemException if a system exception occurred
    */
    public static int countByDealerByDealerId(java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDealerByDealerId(dealerId);
    }

    /**
    * Caches the entity dealer in the entity cache if it is enabled.
    *
    * @param entityDealer the entity dealer
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityDealer entityDealer) {
        getPersistence().cacheResult(entityDealer);
    }

    /**
    * Caches the entity dealers in the entity cache if it is enabled.
    *
    * @param entityDealers the entity dealers
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityDealer> entityDealers) {
        getPersistence().cacheResult(entityDealers);
    }

    /**
    * Creates a new entity dealer with the primary key. Does not add the entity dealer to the database.
    *
    * @param dealerId the primary key for the new entity dealer
    * @return the new entity dealer
    */
    public static com.consistent.ucwrt.model.EntityDealer create(
        java.lang.String dealerId) {
        return getPersistence().create(dealerId);
    }

    /**
    * Removes the entity dealer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param dealerId the primary key of the entity dealer
    * @return the entity dealer that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer remove(
        java.lang.String dealerId)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(dealerId);
    }

    public static com.consistent.ucwrt.model.EntityDealer updateImpl(
        com.consistent.ucwrt.model.EntityDealer entityDealer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityDealer);
    }

    /**
    * Returns the entity dealer with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityDealerException} if it could not be found.
    *
    * @param dealerId the primary key of the entity dealer
    * @return the entity dealer
    * @throws com.consistent.ucwrt.NoSuchEntityDealerException if a entity dealer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer findByPrimaryKey(
        java.lang.String dealerId)
        throws com.consistent.ucwrt.NoSuchEntityDealerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(dealerId);
    }

    /**
    * Returns the entity dealer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param dealerId the primary key of the entity dealer
    * @return the entity dealer, or <code>null</code> if a entity dealer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityDealer fetchByPrimaryKey(
        java.lang.String dealerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(dealerId);
    }

    /**
    * Returns all the entity dealers.
    *
    * @return the entity dealers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityDealer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityDealer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.consistent.ucwrt.model.EntityDealer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity dealers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity dealers.
    *
    * @return the number of entity dealers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityDealerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityDealerPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityDealerPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityDealerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityDealerPersistence persistence) {
    }
}
