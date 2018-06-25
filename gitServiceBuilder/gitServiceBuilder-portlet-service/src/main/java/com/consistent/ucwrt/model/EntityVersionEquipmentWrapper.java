package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityVersionEquipment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipment
 * @generated
 */
public class EntityVersionEquipmentWrapper implements EntityVersionEquipment,
    ModelWrapper<EntityVersionEquipment> {
    private EntityVersionEquipment _entityVersionEquipment;

    public EntityVersionEquipmentWrapper(
        EntityVersionEquipment entityVersionEquipment) {
        _entityVersionEquipment = entityVersionEquipment;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityVersionEquipment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityVersionEquipment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("equipmentId", getEquipmentId());
        attributes.put("versionId", getVersionId());
        attributes.put("modelId", getModelId());
        attributes.put("brandName", getBrandName());
        attributes.put("yearModel", getYearModel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer equipmentId = (Integer) attributes.get("equipmentId");

        if (equipmentId != null) {
            setEquipmentId(equipmentId);
        }

        Integer versionId = (Integer) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        String brandName = (String) attributes.get("brandName");

        if (brandName != null) {
            setBrandName(brandName);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }
    }

    /**
    * Returns the primary key of this entity version equipment.
    *
    * @return the primary key of this entity version equipment
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK getPrimaryKey() {
        return _entityVersionEquipment.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity version equipment.
    *
    * @param primaryKey the primary key of this entity version equipment
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK primaryKey) {
        _entityVersionEquipment.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the equipment ID of this entity version equipment.
    *
    * @return the equipment ID of this entity version equipment
    */
    @Override
    public int getEquipmentId() {
        return _entityVersionEquipment.getEquipmentId();
    }

    /**
    * Sets the equipment ID of this entity version equipment.
    *
    * @param equipmentId the equipment ID of this entity version equipment
    */
    @Override
    public void setEquipmentId(int equipmentId) {
        _entityVersionEquipment.setEquipmentId(equipmentId);
    }

    /**
    * Returns the version ID of this entity version equipment.
    *
    * @return the version ID of this entity version equipment
    */
    @Override
    public int getVersionId() {
        return _entityVersionEquipment.getVersionId();
    }

    /**
    * Sets the version ID of this entity version equipment.
    *
    * @param versionId the version ID of this entity version equipment
    */
    @Override
    public void setVersionId(int versionId) {
        _entityVersionEquipment.setVersionId(versionId);
    }

    /**
    * Returns the model ID of this entity version equipment.
    *
    * @return the model ID of this entity version equipment
    */
    @Override
    public int getModelId() {
        return _entityVersionEquipment.getModelId();
    }

    /**
    * Sets the model ID of this entity version equipment.
    *
    * @param modelId the model ID of this entity version equipment
    */
    @Override
    public void setModelId(int modelId) {
        _entityVersionEquipment.setModelId(modelId);
    }

    /**
    * Returns the brand name of this entity version equipment.
    *
    * @return the brand name of this entity version equipment
    */
    @Override
    public java.lang.String getBrandName() {
        return _entityVersionEquipment.getBrandName();
    }

    /**
    * Sets the brand name of this entity version equipment.
    *
    * @param brandName the brand name of this entity version equipment
    */
    @Override
    public void setBrandName(java.lang.String brandName) {
        _entityVersionEquipment.setBrandName(brandName);
    }

    /**
    * Returns the year model of this entity version equipment.
    *
    * @return the year model of this entity version equipment
    */
    @Override
    public int getYearModel() {
        return _entityVersionEquipment.getYearModel();
    }

    /**
    * Sets the year model of this entity version equipment.
    *
    * @param yearModel the year model of this entity version equipment
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityVersionEquipment.setYearModel(yearModel);
    }

    @Override
    public boolean isNew() {
        return _entityVersionEquipment.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityVersionEquipment.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityVersionEquipment.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityVersionEquipment.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityVersionEquipment.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityVersionEquipment.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityVersionEquipment.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityVersionEquipment.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityVersionEquipment.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityVersionEquipment.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityVersionEquipment.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityVersionEquipmentWrapper((EntityVersionEquipment) _entityVersionEquipment.clone());
    }

    @Override
    public int compareTo(EntityVersionEquipment entityVersionEquipment) {
        return _entityVersionEquipment.compareTo(entityVersionEquipment);
    }

    @Override
    public int hashCode() {
        return _entityVersionEquipment.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityVersionEquipment> toCacheModel() {
        return _entityVersionEquipment.toCacheModel();
    }

    @Override
    public EntityVersionEquipment toEscapedModel() {
        return new EntityVersionEquipmentWrapper(_entityVersionEquipment.toEscapedModel());
    }

    @Override
    public EntityVersionEquipment toUnescapedModel() {
        return new EntityVersionEquipmentWrapper(_entityVersionEquipment.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityVersionEquipment.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityVersionEquipment.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityVersionEquipment.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionEquipmentWrapper)) {
            return false;
        }

        EntityVersionEquipmentWrapper entityVersionEquipmentWrapper = (EntityVersionEquipmentWrapper) obj;

        if (Validator.equals(_entityVersionEquipment,
                    entityVersionEquipmentWrapper._entityVersionEquipment)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityVersionEquipment getWrappedEntityVersionEquipment() {
        return _entityVersionEquipment;
    }

    @Override
    public EntityVersionEquipment getWrappedModel() {
        return _entityVersionEquipment;
    }

    @Override
    public void resetOriginalValues() {
        _entityVersionEquipment.resetOriginalValues();
    }
}
