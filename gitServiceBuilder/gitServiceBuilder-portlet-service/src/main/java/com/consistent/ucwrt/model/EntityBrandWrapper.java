package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityBrand}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrand
 * @generated
 */
public class EntityBrandWrapper implements EntityBrand,
    ModelWrapper<EntityBrand> {
    private EntityBrand _entityBrand;

    public EntityBrandWrapper(EntityBrand entityBrand) {
        _entityBrand = entityBrand;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityBrand.class;
    }

    @Override
    public String getModelClassName() {
        return EntityBrand.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("brandId", getBrandId());
        attributes.put("brandName", getBrandName());
        attributes.put("brandDescription", getBrandDescription());
        attributes.put("brandRegistrationDate", getBrandRegistrationDate());
        attributes.put("registerData", getRegisterData());
        attributes.put("responsibleUser", getResponsibleUser());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        String brandName = (String) attributes.get("brandName");

        if (brandName != null) {
            setBrandName(brandName);
        }

        String brandDescription = (String) attributes.get("brandDescription");

        if (brandDescription != null) {
            setBrandDescription(brandDescription);
        }

        Date brandRegistrationDate = (Date) attributes.get(
                "brandRegistrationDate");

        if (brandRegistrationDate != null) {
            setBrandRegistrationDate(brandRegistrationDate);
        }

        String registerData = (String) attributes.get("registerData");

        if (registerData != null) {
            setRegisterData(registerData);
        }

        String responsibleUser = (String) attributes.get("responsibleUser");

        if (responsibleUser != null) {
            setResponsibleUser(responsibleUser);
        }
    }

    /**
    * Returns the primary key of this entity brand.
    *
    * @return the primary key of this entity brand
    */
    @Override
    public int getPrimaryKey() {
        return _entityBrand.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity brand.
    *
    * @param primaryKey the primary key of this entity brand
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityBrand.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the brand ID of this entity brand.
    *
    * @return the brand ID of this entity brand
    */
    @Override
    public int getBrandId() {
        return _entityBrand.getBrandId();
    }

    /**
    * Sets the brand ID of this entity brand.
    *
    * @param brandId the brand ID of this entity brand
    */
    @Override
    public void setBrandId(int brandId) {
        _entityBrand.setBrandId(brandId);
    }

    /**
    * Returns the brand name of this entity brand.
    *
    * @return the brand name of this entity brand
    */
    @Override
    public java.lang.String getBrandName() {
        return _entityBrand.getBrandName();
    }

    /**
    * Sets the brand name of this entity brand.
    *
    * @param brandName the brand name of this entity brand
    */
    @Override
    public void setBrandName(java.lang.String brandName) {
        _entityBrand.setBrandName(brandName);
    }

    /**
    * Returns the brand description of this entity brand.
    *
    * @return the brand description of this entity brand
    */
    @Override
    public java.lang.String getBrandDescription() {
        return _entityBrand.getBrandDescription();
    }

    /**
    * Sets the brand description of this entity brand.
    *
    * @param brandDescription the brand description of this entity brand
    */
    @Override
    public void setBrandDescription(java.lang.String brandDescription) {
        _entityBrand.setBrandDescription(brandDescription);
    }

    /**
    * Returns the brand registration date of this entity brand.
    *
    * @return the brand registration date of this entity brand
    */
    @Override
    public java.util.Date getBrandRegistrationDate() {
        return _entityBrand.getBrandRegistrationDate();
    }

    /**
    * Sets the brand registration date of this entity brand.
    *
    * @param brandRegistrationDate the brand registration date of this entity brand
    */
    @Override
    public void setBrandRegistrationDate(java.util.Date brandRegistrationDate) {
        _entityBrand.setBrandRegistrationDate(brandRegistrationDate);
    }

    /**
    * Returns the register data of this entity brand.
    *
    * @return the register data of this entity brand
    */
    @Override
    public java.lang.String getRegisterData() {
        return _entityBrand.getRegisterData();
    }

    /**
    * Sets the register data of this entity brand.
    *
    * @param registerData the register data of this entity brand
    */
    @Override
    public void setRegisterData(java.lang.String registerData) {
        _entityBrand.setRegisterData(registerData);
    }

    /**
    * Returns the responsible user of this entity brand.
    *
    * @return the responsible user of this entity brand
    */
    @Override
    public java.lang.String getResponsibleUser() {
        return _entityBrand.getResponsibleUser();
    }

    /**
    * Sets the responsible user of this entity brand.
    *
    * @param responsibleUser the responsible user of this entity brand
    */
    @Override
    public void setResponsibleUser(java.lang.String responsibleUser) {
        _entityBrand.setResponsibleUser(responsibleUser);
    }

    @Override
    public boolean isNew() {
        return _entityBrand.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityBrand.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityBrand.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityBrand.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityBrand.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityBrand.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityBrand.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityBrand.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityBrand.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityBrand.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityBrand.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityBrandWrapper((EntityBrand) _entityBrand.clone());
    }

    @Override
    public int compareTo(EntityBrand entityBrand) {
        return _entityBrand.compareTo(entityBrand);
    }

    @Override
    public int hashCode() {
        return _entityBrand.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityBrand> toCacheModel() {
        return _entityBrand.toCacheModel();
    }

    @Override
    public EntityBrand toEscapedModel() {
        return new EntityBrandWrapper(_entityBrand.toEscapedModel());
    }

    @Override
    public EntityBrand toUnescapedModel() {
        return new EntityBrandWrapper(_entityBrand.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityBrand.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityBrand.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityBrand.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityBrandWrapper)) {
            return false;
        }

        EntityBrandWrapper entityBrandWrapper = (EntityBrandWrapper) obj;

        if (Validator.equals(_entityBrand, entityBrandWrapper._entityBrand)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityBrand getWrappedEntityBrand() {
        return _entityBrand;
    }

    @Override
    public EntityBrand getWrappedModel() {
        return _entityBrand;
    }

    @Override
    public void resetOriginalValues() {
        _entityBrand.resetOriginalValues();
    }
}
