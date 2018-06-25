package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityGParameter;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity g parameter service. This utility wraps {@link EntityGParameterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameterPersistence
 * @see EntityGParameterPersistenceImpl
 * @generated
 */
public class EntityGParameterUtil {
    private static EntityGParameterPersistence _persistence;

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
    public static void clearCache(EntityGParameter entityGParameter) {
        getPersistence().clearCache(entityGParameter);
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
    public static List<EntityGParameter> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityGParameter> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityGParameter> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityGParameter update(EntityGParameter entityGParameter)
        throws SystemException {
        return getPersistence().update(entityGParameter);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityGParameter update(EntityGParameter entityGParameter,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityGParameter, serviceContext);
    }

    /**
    * Caches the entity g parameter in the entity cache if it is enabled.
    *
    * @param entityGParameter the entity g parameter
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityGParameter entityGParameter) {
        getPersistence().cacheResult(entityGParameter);
    }

    /**
    * Caches the entity g parameters in the entity cache if it is enabled.
    *
    * @param entityGParameters the entity g parameters
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityGParameter> entityGParameters) {
        getPersistence().cacheResult(entityGParameters);
    }

    /**
    * Creates a new entity g parameter with the primary key. Does not add the entity g parameter to the database.
    *
    * @param parameterName the primary key for the new entity g parameter
    * @return the new entity g parameter
    */
    public static com.consistent.ucwrt.model.EntityGParameter create(
        java.lang.String parameterName) {
        return getPersistence().create(parameterName);
    }

    /**
    * Removes the entity g parameter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param parameterName the primary key of the entity g parameter
    * @return the entity g parameter that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityGParameterException if a entity g parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityGParameter remove(
        java.lang.String parameterName)
        throws com.consistent.ucwrt.NoSuchEntityGParameterException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(parameterName);
    }

    public static com.consistent.ucwrt.model.EntityGParameter updateImpl(
        com.consistent.ucwrt.model.EntityGParameter entityGParameter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityGParameter);
    }

    /**
    * Returns the entity g parameter with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityGParameterException} if it could not be found.
    *
    * @param parameterName the primary key of the entity g parameter
    * @return the entity g parameter
    * @throws com.consistent.ucwrt.NoSuchEntityGParameterException if a entity g parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityGParameter findByPrimaryKey(
        java.lang.String parameterName)
        throws com.consistent.ucwrt.NoSuchEntityGParameterException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(parameterName);
    }

    /**
    * Returns the entity g parameter with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param parameterName the primary key of the entity g parameter
    * @return the entity g parameter, or <code>null</code> if a entity g parameter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityGParameter fetchByPrimaryKey(
        java.lang.String parameterName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(parameterName);
    }

    /**
    * Returns all the entity g parameters.
    *
    * @return the entity g parameters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityGParameter> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity g parameters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity g parameters
    * @param end the upper bound of the range of entity g parameters (not inclusive)
    * @return the range of entity g parameters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityGParameter> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity g parameters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityGParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity g parameters
    * @param end the upper bound of the range of entity g parameters (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity g parameters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityGParameter> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity g parameters from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity g parameters.
    *
    * @return the number of entity g parameters
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityGParameterPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityGParameterPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityGParameterPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityGParameterUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityGParameterPersistence persistence) {
    }
}
