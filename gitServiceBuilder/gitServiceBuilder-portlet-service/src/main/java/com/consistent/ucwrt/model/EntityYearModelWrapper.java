package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityYearModel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModel
 * @generated
 */
public class EntityYearModelWrapper implements EntityYearModel,
    ModelWrapper<EntityYearModel> {
    private EntityYearModel _entityYearModel;

    public EntityYearModelWrapper(EntityYearModel entityYearModel) {
        _entityYearModel = entityYearModel;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityYearModel.class;
    }

    @Override
    public String getModelClassName() {
        return EntityYearModel.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("yearModel", getYearModel());
        attributes.put("yearModelRegistrationDate",
            getYearModelRegistrationDate());
        attributes.put("yearModelRegisterData", getYearModelRegisterData());
        attributes.put("yModelResponsibleUser", getYModelResponsibleUser());
        attributes.put("yearModelDescription", getYearModelDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        Date yearModelRegistrationDate = (Date) attributes.get(
                "yearModelRegistrationDate");

        if (yearModelRegistrationDate != null) {
            setYearModelRegistrationDate(yearModelRegistrationDate);
        }

        String yearModelRegisterData = (String) attributes.get(
                "yearModelRegisterData");

        if (yearModelRegisterData != null) {
            setYearModelRegisterData(yearModelRegisterData);
        }

        String yModelResponsibleUser = (String) attributes.get(
                "yModelResponsibleUser");

        if (yModelResponsibleUser != null) {
            setYModelResponsibleUser(yModelResponsibleUser);
        }

        String yearModelDescription = (String) attributes.get(
                "yearModelDescription");

        if (yearModelDescription != null) {
            setYearModelDescription(yearModelDescription);
        }
    }

    /**
    * Returns the primary key of this entity year model.
    *
    * @return the primary key of this entity year model
    */
    @Override
    public int getPrimaryKey() {
        return _entityYearModel.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity year model.
    *
    * @param primaryKey the primary key of this entity year model
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityYearModel.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the year model of this entity year model.
    *
    * @return the year model of this entity year model
    */
    @Override
    public int getYearModel() {
        return _entityYearModel.getYearModel();
    }

    /**
    * Sets the year model of this entity year model.
    *
    * @param yearModel the year model of this entity year model
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityYearModel.setYearModel(yearModel);
    }

    /**
    * Returns the year model registration date of this entity year model.
    *
    * @return the year model registration date of this entity year model
    */
    @Override
    public java.util.Date getYearModelRegistrationDate() {
        return _entityYearModel.getYearModelRegistrationDate();
    }

    /**
    * Sets the year model registration date of this entity year model.
    *
    * @param yearModelRegistrationDate the year model registration date of this entity year model
    */
    @Override
    public void setYearModelRegistrationDate(
        java.util.Date yearModelRegistrationDate) {
        _entityYearModel.setYearModelRegistrationDate(yearModelRegistrationDate);
    }

    /**
    * Returns the year model register data of this entity year model.
    *
    * @return the year model register data of this entity year model
    */
    @Override
    public java.lang.String getYearModelRegisterData() {
        return _entityYearModel.getYearModelRegisterData();
    }

    /**
    * Sets the year model register data of this entity year model.
    *
    * @param yearModelRegisterData the year model register data of this entity year model
    */
    @Override
    public void setYearModelRegisterData(java.lang.String yearModelRegisterData) {
        _entityYearModel.setYearModelRegisterData(yearModelRegisterData);
    }

    /**
    * Returns the y model responsible user of this entity year model.
    *
    * @return the y model responsible user of this entity year model
    */
    @Override
    public java.lang.String getYModelResponsibleUser() {
        return _entityYearModel.getYModelResponsibleUser();
    }

    /**
    * Sets the y model responsible user of this entity year model.
    *
    * @param yModelResponsibleUser the y model responsible user of this entity year model
    */
    @Override
    public void setYModelResponsibleUser(java.lang.String yModelResponsibleUser) {
        _entityYearModel.setYModelResponsibleUser(yModelResponsibleUser);
    }

    /**
    * Returns the year model description of this entity year model.
    *
    * @return the year model description of this entity year model
    */
    @Override
    public java.lang.String getYearModelDescription() {
        return _entityYearModel.getYearModelDescription();
    }

    /**
    * Sets the year model description of this entity year model.
    *
    * @param yearModelDescription the year model description of this entity year model
    */
    @Override
    public void setYearModelDescription(java.lang.String yearModelDescription) {
        _entityYearModel.setYearModelDescription(yearModelDescription);
    }

    @Override
    public boolean isNew() {
        return _entityYearModel.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityYearModel.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityYearModel.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityYearModel.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityYearModel.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityYearModel.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityYearModel.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityYearModel.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityYearModel.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityYearModel.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityYearModel.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityYearModelWrapper((EntityYearModel) _entityYearModel.clone());
    }

    @Override
    public int compareTo(EntityYearModel entityYearModel) {
        return _entityYearModel.compareTo(entityYearModel);
    }

    @Override
    public int hashCode() {
        return _entityYearModel.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityYearModel> toCacheModel() {
        return _entityYearModel.toCacheModel();
    }

    @Override
    public EntityYearModel toEscapedModel() {
        return new EntityYearModelWrapper(_entityYearModel.toEscapedModel());
    }

    @Override
    public EntityYearModel toUnescapedModel() {
        return new EntityYearModelWrapper(_entityYearModel.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityYearModel.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityYearModel.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityYearModel.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityYearModelWrapper)) {
            return false;
        }

        EntityYearModelWrapper entityYearModelWrapper = (EntityYearModelWrapper) obj;

        if (Validator.equals(_entityYearModel,
                    entityYearModelWrapper._entityYearModel)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityYearModel getWrappedEntityYearModel() {
        return _entityYearModel;
    }

    @Override
    public EntityYearModel getWrappedModel() {
        return _entityYearModel;
    }

    @Override
    public void resetOriginalValues() {
        _entityYearModel.resetOriginalValues();
    }
}
