package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityEquipment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEquipment
 * @generated
 */
public class EntityEquipmentWrapper implements EntityEquipment,
    ModelWrapper<EntityEquipment> {
    private EntityEquipment _entityEquipment;

    public EntityEquipmentWrapper(EntityEquipment entityEquipment) {
        _entityEquipment = entityEquipment;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEquipment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEquipment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("equipmentId", getEquipmentId());
        attributes.put("equipmentDescription", getEquipmentDescription());
        attributes.put("equipmentPurchasePrice", getEquipmentPurchasePrice());
        attributes.put("equipmentPurchasePriceDll",
            getEquipmentPurchasePriceDll());
        attributes.put("equipmentSalePrice", getEquipmentSalePrice());
        attributes.put("status", getStatus());
        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer equipmentId = (Integer) attributes.get("equipmentId");

        if (equipmentId != null) {
            setEquipmentId(equipmentId);
        }

        String equipmentDescription = (String) attributes.get(
                "equipmentDescription");

        if (equipmentDescription != null) {
            setEquipmentDescription(equipmentDescription);
        }

        Double equipmentPurchasePrice = (Double) attributes.get(
                "equipmentPurchasePrice");

        if (equipmentPurchasePrice != null) {
            setEquipmentPurchasePrice(equipmentPurchasePrice);
        }

        Double equipmentPurchasePriceDll = (Double) attributes.get(
                "equipmentPurchasePriceDll");

        if (equipmentPurchasePriceDll != null) {
            setEquipmentPurchasePriceDll(equipmentPurchasePriceDll);
        }

        Double equipmentSalePrice = (Double) attributes.get(
                "equipmentSalePrice");

        if (equipmentSalePrice != null) {
            setEquipmentSalePrice(equipmentSalePrice);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

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
    }

    /**
    * Returns the primary key of this entity equipment.
    *
    * @return the primary key of this entity equipment
    */
    @Override
    public int getPrimaryKey() {
        return _entityEquipment.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity equipment.
    *
    * @param primaryKey the primary key of this entity equipment
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityEquipment.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the equipment ID of this entity equipment.
    *
    * @return the equipment ID of this entity equipment
    */
    @Override
    public int getEquipmentId() {
        return _entityEquipment.getEquipmentId();
    }

    /**
    * Sets the equipment ID of this entity equipment.
    *
    * @param equipmentId the equipment ID of this entity equipment
    */
    @Override
    public void setEquipmentId(int equipmentId) {
        _entityEquipment.setEquipmentId(equipmentId);
    }

    /**
    * Returns the equipment description of this entity equipment.
    *
    * @return the equipment description of this entity equipment
    */
    @Override
    public java.lang.String getEquipmentDescription() {
        return _entityEquipment.getEquipmentDescription();
    }

    /**
    * Sets the equipment description of this entity equipment.
    *
    * @param equipmentDescription the equipment description of this entity equipment
    */
    @Override
    public void setEquipmentDescription(java.lang.String equipmentDescription) {
        _entityEquipment.setEquipmentDescription(equipmentDescription);
    }

    /**
    * Returns the equipment purchase price of this entity equipment.
    *
    * @return the equipment purchase price of this entity equipment
    */
    @Override
    public double getEquipmentPurchasePrice() {
        return _entityEquipment.getEquipmentPurchasePrice();
    }

    /**
    * Sets the equipment purchase price of this entity equipment.
    *
    * @param equipmentPurchasePrice the equipment purchase price of this entity equipment
    */
    @Override
    public void setEquipmentPurchasePrice(double equipmentPurchasePrice) {
        _entityEquipment.setEquipmentPurchasePrice(equipmentPurchasePrice);
    }

    /**
    * Returns the equipment purchase price dll of this entity equipment.
    *
    * @return the equipment purchase price dll of this entity equipment
    */
    @Override
    public double getEquipmentPurchasePriceDll() {
        return _entityEquipment.getEquipmentPurchasePriceDll();
    }

    /**
    * Sets the equipment purchase price dll of this entity equipment.
    *
    * @param equipmentPurchasePriceDll the equipment purchase price dll of this entity equipment
    */
    @Override
    public void setEquipmentPurchasePriceDll(double equipmentPurchasePriceDll) {
        _entityEquipment.setEquipmentPurchasePriceDll(equipmentPurchasePriceDll);
    }

    /**
    * Returns the equipment sale price of this entity equipment.
    *
    * @return the equipment sale price of this entity equipment
    */
    @Override
    public double getEquipmentSalePrice() {
        return _entityEquipment.getEquipmentSalePrice();
    }

    /**
    * Sets the equipment sale price of this entity equipment.
    *
    * @param equipmentSalePrice the equipment sale price of this entity equipment
    */
    @Override
    public void setEquipmentSalePrice(double equipmentSalePrice) {
        _entityEquipment.setEquipmentSalePrice(equipmentSalePrice);
    }

    /**
    * Returns the status of this entity equipment.
    *
    * @return the status of this entity equipment
    */
    @Override
    public java.lang.String getStatus() {
        return _entityEquipment.getStatus();
    }

    /**
    * Sets the status of this entity equipment.
    *
    * @param status the status of this entity equipment
    */
    @Override
    public void setStatus(java.lang.String status) {
        _entityEquipment.setStatus(status);
    }

    /**
    * Returns the model ID of this entity equipment.
    *
    * @return the model ID of this entity equipment
    */
    @Override
    public int getModelId() {
        return _entityEquipment.getModelId();
    }

    /**
    * Sets the model ID of this entity equipment.
    *
    * @param modelId the model ID of this entity equipment
    */
    @Override
    public void setModelId(int modelId) {
        _entityEquipment.setModelId(modelId);
    }

    /**
    * Returns the brand ID of this entity equipment.
    *
    * @return the brand ID of this entity equipment
    */
    @Override
    public int getBrandId() {
        return _entityEquipment.getBrandId();
    }

    /**
    * Sets the brand ID of this entity equipment.
    *
    * @param brandId the brand ID of this entity equipment
    */
    @Override
    public void setBrandId(int brandId) {
        _entityEquipment.setBrandId(brandId);
    }

    /**
    * Returns the year model of this entity equipment.
    *
    * @return the year model of this entity equipment
    */
    @Override
    public int getYearModel() {
        return _entityEquipment.getYearModel();
    }

    /**
    * Sets the year model of this entity equipment.
    *
    * @param yearModel the year model of this entity equipment
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityEquipment.setYearModel(yearModel);
    }

    @Override
    public boolean isNew() {
        return _entityEquipment.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityEquipment.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityEquipment.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityEquipment.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityEquipment.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityEquipment.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityEquipment.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityEquipment.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityEquipment.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityEquipment.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityEquipment.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityEquipmentWrapper((EntityEquipment) _entityEquipment.clone());
    }

    @Override
    public int compareTo(EntityEquipment entityEquipment) {
        return _entityEquipment.compareTo(entityEquipment);
    }

    @Override
    public int hashCode() {
        return _entityEquipment.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityEquipment> toCacheModel() {
        return _entityEquipment.toCacheModel();
    }

    @Override
    public EntityEquipment toEscapedModel() {
        return new EntityEquipmentWrapper(_entityEquipment.toEscapedModel());
    }

    @Override
    public EntityEquipment toUnescapedModel() {
        return new EntityEquipmentWrapper(_entityEquipment.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityEquipment.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityEquipment.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityEquipment.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEquipmentWrapper)) {
            return false;
        }

        EntityEquipmentWrapper entityEquipmentWrapper = (EntityEquipmentWrapper) obj;

        if (Validator.equals(_entityEquipment,
                    entityEquipmentWrapper._entityEquipment)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityEquipment getWrappedEntityEquipment() {
        return _entityEquipment;
    }

    @Override
    public EntityEquipment getWrappedModel() {
        return _entityEquipment;
    }

    @Override
    public void resetOriginalValues() {
        _entityEquipment.resetOriginalValues();
    }
}
