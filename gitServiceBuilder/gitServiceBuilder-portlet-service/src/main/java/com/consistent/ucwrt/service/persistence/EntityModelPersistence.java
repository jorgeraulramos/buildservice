package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityModel;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity model service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityModelPersistenceImpl
 * @see EntityModelUtil
 * @generated
 */
public interface EntityModelPersistence extends BasePersistence<EntityModel> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityModelUtil} to access the entity model persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the entity models where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @return the matching entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findByBrandId(
        int brandId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity models where brandId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param brandId the brand ID
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @return the range of matching entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findByBrandId(
        int brandId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity models where brandId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param brandId the brand ID
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findByBrandId(
        int brandId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity model in the ordered set where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel findByBrandId_First(
        int brandId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity model in the ordered set where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity model, or <code>null</code> if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel fetchByBrandId_First(
        int brandId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity model in the ordered set where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel findByBrandId_Last(
        int brandId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity model in the ordered set where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity model, or <code>null</code> if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel fetchByBrandId_Last(
        int brandId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity models before and after the current entity model in the ordered set where brandId = &#63;.
    *
    * @param entityModelPK the primary key of the current entity model
    * @param brandId the brand ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel[] findByBrandId_PrevAndNext(
        EntityModelPK entityModelPK, int brandId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity models where brandId = &#63; from the database.
    *
    * @param brandId the brand ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByBrandId(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity models where brandId = &#63;.
    *
    * @param brandId the brand ID
    * @return the number of matching entity models
    * @throws SystemException if a system exception occurred
    */
    public int countByBrandId(int brandId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity models where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the matching entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findByModelName(
        java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity models where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @return the range of matching entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findByModelName(
        java.lang.String modelName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity models where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findByModelName(
        java.lang.String modelName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity model in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel findByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first entity model in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching entity model, or <code>null</code> if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel fetchByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity model in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel findByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last entity model in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching entity model, or <code>null</code> if a matching entity model could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel fetchByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity models before and after the current entity model in the ordered set where modelName = &#63;.
    *
    * @param entityModelPK the primary key of the current entity model
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel[] findByModelName_PrevAndNext(
        EntityModelPK entityModelPK, java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity models where modelName = &#63; from the database.
    *
    * @param modelName the model name
    * @throws SystemException if a system exception occurred
    */
    public void removeByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity models where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the number of matching entity models
    * @throws SystemException if a system exception occurred
    */
    public int countByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the entity model in the entity cache if it is enabled.
    *
    * @param entityModel the entity model
    */
    public void cacheResult(com.consistent.ucwrt.model.EntityModel entityModel);

    /**
    * Caches the entity models in the entity cache if it is enabled.
    *
    * @param entityModels the entity models
    */
    public void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityModel> entityModels);

    /**
    * Creates a new entity model with the primary key. Does not add the entity model to the database.
    *
    * @param entityModelPK the primary key for the new entity model
    * @return the new entity model
    */
    public com.consistent.ucwrt.model.EntityModel create(
        EntityModelPK entityModelPK);

    /**
    * Removes the entity model with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityModelPK the primary key of the entity model
    * @return the entity model that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel remove(
        EntityModelPK entityModelPK)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.consistent.ucwrt.model.EntityModel updateImpl(
        com.consistent.ucwrt.model.EntityModel entityModel)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity model with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityModelException} if it could not be found.
    *
    * @param entityModelPK the primary key of the entity model
    * @return the entity model
    * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel findByPrimaryKey(
        EntityModelPK entityModelPK)
        throws com.consistent.ucwrt.NoSuchEntityModelException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity model with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityModelPK the primary key of the entity model
    * @return the entity model, or <code>null</code> if a entity model with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.consistent.ucwrt.model.EntityModel fetchByPrimaryKey(
        EntityModelPK entityModelPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity models.
    *
    * @return the entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the entity models.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @return the range of entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity models.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity models
    * @param end the upper bound of the range of entity models (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity models
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.consistent.ucwrt.model.EntityModel> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity models from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity models.
    *
    * @return the number of entity models
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
