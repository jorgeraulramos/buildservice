package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityModel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityModel
 * @generated
 */
public class EntityModelWrapper implements EntityModel,
    ModelWrapper<EntityModel> {
    private EntityModel _entityModel;

    public EntityModelWrapper(EntityModel entityModel) {
        _entityModel = entityModel;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityModel.class;
    }

    @Override
    public String getModelClassName() {
        return EntityModel.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());
        attributes.put("modelName", getModelName());
        attributes.put("modelDescription", getModelDescription());
        attributes.put("modelRegistrationDate", getModelRegistrationDate());
        attributes.put("modelRegisterData", getModelRegisterData());
        attributes.put("modelResponsibleUser", getModelResponsibleUser());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String modelDescription = (String) attributes.get("modelDescription");

        if (modelDescription != null) {
            setModelDescription(modelDescription);
        }

        Date modelRegistrationDate = (Date) attributes.get(
                "modelRegistrationDate");

        if (modelRegistrationDate != null) {
            setModelRegistrationDate(modelRegistrationDate);
        }

        String modelRegisterData = (String) attributes.get("modelRegisterData");

        if (modelRegisterData != null) {
            setModelRegisterData(modelRegisterData);
        }

        String modelResponsibleUser = (String) attributes.get(
                "modelResponsibleUser");

        if (modelResponsibleUser != null) {
            setModelResponsibleUser(modelResponsibleUser);
        }
    }

    /**
    * Returns the primary key of this entity model.
    *
    * @return the primary key of this entity model
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityModelPK getPrimaryKey() {
        return _entityModel.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity model.
    *
    * @param primaryKey the primary key of this entity model
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityModelPK primaryKey) {
        _entityModel.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the model ID of this entity model.
    *
    * @return the model ID of this entity model
    */
    @Override
    public int getModelId() {
        return _entityModel.getModelId();
    }

    /**
    * Sets the model ID of this entity model.
    *
    * @param modelId the model ID of this entity model
    */
    @Override
    public void setModelId(int modelId) {
        _entityModel.setModelId(modelId);
    }

    /**
    * Returns the brand ID of this entity model.
    *
    * @return the brand ID of this entity model
    */
    @Override
    public int getBrandId() {
        return _entityModel.getBrandId();
    }

    /**
    * Sets the brand ID of this entity model.
    *
    * @param brandId the brand ID of this entity model
    */
    @Override
    public void setBrandId(int brandId) {
        _entityModel.setBrandId(brandId);
    }

    /**
    * Returns the year model of this entity model.
    *
    * @return the year model of this entity model
    */
    @Override
    public int getYearModel() {
        return _entityModel.getYearModel();
    }

    /**
    * Sets the year model of this entity model.
    *
    * @param yearModel the year model of this entity model
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityModel.setYearModel(yearModel);
    }

    /**
    * Returns the model name of this entity model.
    *
    * @return the model name of this entity model
    */
    @Override
    public java.lang.String getModelName() {
        return _entityModel.getModelName();
    }

    /**
    * Sets the model name of this entity model.
    *
    * @param modelName the model name of this entity model
    */
    @Override
    public void setModelName(java.lang.String modelName) {
        _entityModel.setModelName(modelName);
    }

    /**
    * Returns the model description of this entity model.
    *
    * @return the model description of this entity model
    */
    @Override
    public java.lang.String getModelDescription() {
        return _entityModel.getModelDescription();
    }

    /**
    * Sets the model description of this entity model.
    *
    * @param modelDescription the model description of this entity model
    */
    @Override
    public void setModelDescription(java.lang.String modelDescription) {
        _entityModel.setModelDescription(modelDescription);
    }

    /**
    * Returns the model registration date of this entity model.
    *
    * @return the model registration date of this entity model
    */
    @Override
    public java.util.Date getModelRegistrationDate() {
        return _entityModel.getModelRegistrationDate();
    }

    /**
    * Sets the model registration date of this entity model.
    *
    * @param modelRegistrationDate the model registration date of this entity model
    */
    @Override
    public void setModelRegistrationDate(java.util.Date modelRegistrationDate) {
        _entityModel.setModelRegistrationDate(modelRegistrationDate);
    }

    /**
    * Returns the model register data of this entity model.
    *
    * @return the model register data of this entity model
    */
    @Override
    public java.lang.String getModelRegisterData() {
        return _entityModel.getModelRegisterData();
    }

    /**
    * Sets the model register data of this entity model.
    *
    * @param modelRegisterData the model register data of this entity model
    */
    @Override
    public void setModelRegisterData(java.lang.String modelRegisterData) {
        _entityModel.setModelRegisterData(modelRegisterData);
    }

    /**
    * Returns the model responsible user of this entity model.
    *
    * @return the model responsible user of this entity model
    */
    @Override
    public java.lang.String getModelResponsibleUser() {
        return _entityModel.getModelResponsibleUser();
    }

    /**
    * Sets the model responsible user of this entity model.
    *
    * @param modelResponsibleUser the model responsible user of this entity model
    */
    @Override
    public void setModelResponsibleUser(java.lang.String modelResponsibleUser) {
        _entityModel.setModelResponsibleUser(modelResponsibleUser);
    }

    @Override
    public boolean isNew() {
        return _entityModel.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityModel.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityModel.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityModel.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityModel.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityModel.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityModel.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityModel.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityModel.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityModel.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityModel.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityModelWrapper((EntityModel) _entityModel.clone());
    }

    @Override
    public int compareTo(EntityModel entityModel) {
        return _entityModel.compareTo(entityModel);
    }

    @Override
    public int hashCode() {
        return _entityModel.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityModel> toCacheModel() {
        return _entityModel.toCacheModel();
    }

    @Override
    public EntityModel toEscapedModel() {
        return new EntityModelWrapper(_entityModel.toEscapedModel());
    }

    @Override
    public EntityModel toUnescapedModel() {
        return new EntityModelWrapper(_entityModel.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityModel.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityModel.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityModel.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityModelWrapper)) {
            return false;
        }

        EntityModelWrapper entityModelWrapper = (EntityModelWrapper) obj;

        if (Validator.equals(_entityModel, entityModelWrapper._entityModel)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityModel getWrappedEntityModel() {
        return _entityModel;
    }

    @Override
    public EntityModel getWrappedModel() {
        return _entityModel;
    }

    @Override
    public void resetOriginalValues() {
        _entityModel.resetOriginalValues();
    }
}
