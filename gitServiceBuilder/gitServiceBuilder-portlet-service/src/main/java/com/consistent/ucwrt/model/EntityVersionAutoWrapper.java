package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityVersionAuto}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAuto
 * @generated
 */
public class EntityVersionAutoWrapper implements EntityVersionAuto,
    ModelWrapper<EntityVersionAuto> {
    private EntityVersionAuto _entityVersionAuto;

    public EntityVersionAutoWrapper(EntityVersionAuto entityVersionAuto) {
        _entityVersionAuto = entityVersionAuto;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityVersionAuto.class;
    }

    @Override
    public String getModelClassName() {
        return EntityVersionAuto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("versionId", getVersionId());
        attributes.put("versionName", getVersionName());
        attributes.put("versionRegistrationDate", getVersionRegistrationDate());
        attributes.put("versionResponsibleUser", getVersionResponsibleUser());
        attributes.put("versionRegisterData", getVersionRegisterData());
        attributes.put("purchasePrice", getPurchasePrice());
        attributes.put("salePrice", getSalePrice());
        attributes.put("purchasePriceDll", getPurchasePriceDll());
        attributes.put("typeload", getTypeload());
        attributes.put("colorName", getColorName());
        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());
        attributes.put("classId", getClassId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer versionId = (Integer) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        String versionName = (String) attributes.get("versionName");

        if (versionName != null) {
            setVersionName(versionName);
        }

        Date versionRegistrationDate = (Date) attributes.get(
                "versionRegistrationDate");

        if (versionRegistrationDate != null) {
            setVersionRegistrationDate(versionRegistrationDate);
        }

        String versionResponsibleUser = (String) attributes.get(
                "versionResponsibleUser");

        if (versionResponsibleUser != null) {
            setVersionResponsibleUser(versionResponsibleUser);
        }

        String versionRegisterData = (String) attributes.get(
                "versionRegisterData");

        if (versionRegisterData != null) {
            setVersionRegisterData(versionRegisterData);
        }

        Double purchasePrice = (Double) attributes.get("purchasePrice");

        if (purchasePrice != null) {
            setPurchasePrice(purchasePrice);
        }

        Double salePrice = (Double) attributes.get("salePrice");

        if (salePrice != null) {
            setSalePrice(salePrice);
        }

        Double purchasePriceDll = (Double) attributes.get("purchasePriceDll");

        if (purchasePriceDll != null) {
            setPurchasePriceDll(purchasePriceDll);
        }

        String typeload = (String) attributes.get("typeload");

        if (typeload != null) {
            setTypeload(typeload);
        }

        String colorName = (String) attributes.get("colorName");

        if (colorName != null) {
            setColorName(colorName);
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

        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }
    }

    /**
    * Returns the primary key of this entity version auto.
    *
    * @return the primary key of this entity version auto
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityVersionAutoPK getPrimaryKey() {
        return _entityVersionAuto.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity version auto.
    *
    * @param primaryKey the primary key of this entity version auto
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityVersionAutoPK primaryKey) {
        _entityVersionAuto.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the version ID of this entity version auto.
    *
    * @return the version ID of this entity version auto
    */
    @Override
    public int getVersionId() {
        return _entityVersionAuto.getVersionId();
    }

    /**
    * Sets the version ID of this entity version auto.
    *
    * @param versionId the version ID of this entity version auto
    */
    @Override
    public void setVersionId(int versionId) {
        _entityVersionAuto.setVersionId(versionId);
    }

    /**
    * Returns the version name of this entity version auto.
    *
    * @return the version name of this entity version auto
    */
    @Override
    public java.lang.String getVersionName() {
        return _entityVersionAuto.getVersionName();
    }

    /**
    * Sets the version name of this entity version auto.
    *
    * @param versionName the version name of this entity version auto
    */
    @Override
    public void setVersionName(java.lang.String versionName) {
        _entityVersionAuto.setVersionName(versionName);
    }

    /**
    * Returns the version registration date of this entity version auto.
    *
    * @return the version registration date of this entity version auto
    */
    @Override
    public java.util.Date getVersionRegistrationDate() {
        return _entityVersionAuto.getVersionRegistrationDate();
    }

    /**
    * Sets the version registration date of this entity version auto.
    *
    * @param versionRegistrationDate the version registration date of this entity version auto
    */
    @Override
    public void setVersionRegistrationDate(
        java.util.Date versionRegistrationDate) {
        _entityVersionAuto.setVersionRegistrationDate(versionRegistrationDate);
    }

    /**
    * Returns the version responsible user of this entity version auto.
    *
    * @return the version responsible user of this entity version auto
    */
    @Override
    public java.lang.String getVersionResponsibleUser() {
        return _entityVersionAuto.getVersionResponsibleUser();
    }

    /**
    * Sets the version responsible user of this entity version auto.
    *
    * @param versionResponsibleUser the version responsible user of this entity version auto
    */
    @Override
    public void setVersionResponsibleUser(
        java.lang.String versionResponsibleUser) {
        _entityVersionAuto.setVersionResponsibleUser(versionResponsibleUser);
    }

    /**
    * Returns the version register data of this entity version auto.
    *
    * @return the version register data of this entity version auto
    */
    @Override
    public java.lang.String getVersionRegisterData() {
        return _entityVersionAuto.getVersionRegisterData();
    }

    /**
    * Sets the version register data of this entity version auto.
    *
    * @param versionRegisterData the version register data of this entity version auto
    */
    @Override
    public void setVersionRegisterData(java.lang.String versionRegisterData) {
        _entityVersionAuto.setVersionRegisterData(versionRegisterData);
    }

    /**
    * Returns the purchase price of this entity version auto.
    *
    * @return the purchase price of this entity version auto
    */
    @Override
    public double getPurchasePrice() {
        return _entityVersionAuto.getPurchasePrice();
    }

    /**
    * Sets the purchase price of this entity version auto.
    *
    * @param purchasePrice the purchase price of this entity version auto
    */
    @Override
    public void setPurchasePrice(double purchasePrice) {
        _entityVersionAuto.setPurchasePrice(purchasePrice);
    }

    /**
    * Returns the sale price of this entity version auto.
    *
    * @return the sale price of this entity version auto
    */
    @Override
    public double getSalePrice() {
        return _entityVersionAuto.getSalePrice();
    }

    /**
    * Sets the sale price of this entity version auto.
    *
    * @param salePrice the sale price of this entity version auto
    */
    @Override
    public void setSalePrice(double salePrice) {
        _entityVersionAuto.setSalePrice(salePrice);
    }

    /**
    * Returns the purchase price dll of this entity version auto.
    *
    * @return the purchase price dll of this entity version auto
    */
    @Override
    public double getPurchasePriceDll() {
        return _entityVersionAuto.getPurchasePriceDll();
    }

    /**
    * Sets the purchase price dll of this entity version auto.
    *
    * @param purchasePriceDll the purchase price dll of this entity version auto
    */
    @Override
    public void setPurchasePriceDll(double purchasePriceDll) {
        _entityVersionAuto.setPurchasePriceDll(purchasePriceDll);
    }

    /**
    * Returns the typeload of this entity version auto.
    *
    * @return the typeload of this entity version auto
    */
    @Override
    public java.lang.String getTypeload() {
        return _entityVersionAuto.getTypeload();
    }

    /**
    * Sets the typeload of this entity version auto.
    *
    * @param typeload the typeload of this entity version auto
    */
    @Override
    public void setTypeload(java.lang.String typeload) {
        _entityVersionAuto.setTypeload(typeload);
    }

    /**
    * Returns the color name of this entity version auto.
    *
    * @return the color name of this entity version auto
    */
    @Override
    public java.lang.String getColorName() {
        return _entityVersionAuto.getColorName();
    }

    /**
    * Sets the color name of this entity version auto.
    *
    * @param colorName the color name of this entity version auto
    */
    @Override
    public void setColorName(java.lang.String colorName) {
        _entityVersionAuto.setColorName(colorName);
    }

    /**
    * Returns the model ID of this entity version auto.
    *
    * @return the model ID of this entity version auto
    */
    @Override
    public int getModelId() {
        return _entityVersionAuto.getModelId();
    }

    /**
    * Sets the model ID of this entity version auto.
    *
    * @param modelId the model ID of this entity version auto
    */
    @Override
    public void setModelId(int modelId) {
        _entityVersionAuto.setModelId(modelId);
    }

    /**
    * Returns the brand ID of this entity version auto.
    *
    * @return the brand ID of this entity version auto
    */
    @Override
    public int getBrandId() {
        return _entityVersionAuto.getBrandId();
    }

    /**
    * Sets the brand ID of this entity version auto.
    *
    * @param brandId the brand ID of this entity version auto
    */
    @Override
    public void setBrandId(int brandId) {
        _entityVersionAuto.setBrandId(brandId);
    }

    /**
    * Returns the year model of this entity version auto.
    *
    * @return the year model of this entity version auto
    */
    @Override
    public int getYearModel() {
        return _entityVersionAuto.getYearModel();
    }

    /**
    * Sets the year model of this entity version auto.
    *
    * @param yearModel the year model of this entity version auto
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityVersionAuto.setYearModel(yearModel);
    }

    /**
    * Returns the class ID of this entity version auto.
    *
    * @return the class ID of this entity version auto
    */
    @Override
    public int getClassId() {
        return _entityVersionAuto.getClassId();
    }

    /**
    * Sets the class ID of this entity version auto.
    *
    * @param classId the class ID of this entity version auto
    */
    @Override
    public void setClassId(int classId) {
        _entityVersionAuto.setClassId(classId);
    }

    @Override
    public boolean isNew() {
        return _entityVersionAuto.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityVersionAuto.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityVersionAuto.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityVersionAuto.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityVersionAuto.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityVersionAuto.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityVersionAuto.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityVersionAuto.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityVersionAuto.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityVersionAuto.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityVersionAuto.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityVersionAutoWrapper((EntityVersionAuto) _entityVersionAuto.clone());
    }

    @Override
    public int compareTo(EntityVersionAuto entityVersionAuto) {
        return _entityVersionAuto.compareTo(entityVersionAuto);
    }

    @Override
    public int hashCode() {
        return _entityVersionAuto.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityVersionAuto> toCacheModel() {
        return _entityVersionAuto.toCacheModel();
    }

    @Override
    public EntityVersionAuto toEscapedModel() {
        return new EntityVersionAutoWrapper(_entityVersionAuto.toEscapedModel());
    }

    @Override
    public EntityVersionAuto toUnescapedModel() {
        return new EntityVersionAutoWrapper(_entityVersionAuto.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityVersionAuto.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityVersionAuto.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityVersionAuto.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionAutoWrapper)) {
            return false;
        }

        EntityVersionAutoWrapper entityVersionAutoWrapper = (EntityVersionAutoWrapper) obj;

        if (Validator.equals(_entityVersionAuto,
                    entityVersionAutoWrapper._entityVersionAuto)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityVersionAuto getWrappedEntityVersionAuto() {
        return _entityVersionAuto;
    }

    @Override
    public EntityVersionAuto getWrappedModel() {
        return _entityVersionAuto;
    }

    @Override
    public void resetOriginalValues() {
        _entityVersionAuto.resetOriginalValues();
    }
}
