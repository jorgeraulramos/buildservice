package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityBusinessBrand}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityBusinessBrand
 * @generated
 */
public class EntityBusinessBrandWrapper implements EntityBusinessBrand,
    ModelWrapper<EntityBusinessBrand> {
    private EntityBusinessBrand _entityBusinessBrand;

    public EntityBusinessBrandWrapper(EntityBusinessBrand entityBusinessBrand) {
        _entityBusinessBrand = entityBusinessBrand;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityBusinessBrand.class;
    }

    @Override
    public String getModelClassName() {
        return EntityBusinessBrand.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("descriptionBusinessBrand", getDescriptionBusinessBrand());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String descriptionBusinessBrand = (String) attributes.get(
                "descriptionBusinessBrand");

        if (descriptionBusinessBrand != null) {
            setDescriptionBusinessBrand(descriptionBusinessBrand);
        }
    }

    /**
    * Returns the primary key of this entity business brand.
    *
    * @return the primary key of this entity business brand
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _entityBusinessBrand.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity business brand.
    *
    * @param primaryKey the primary key of this entity business brand
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _entityBusinessBrand.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the business brand name of this entity business brand.
    *
    * @return the business brand name of this entity business brand
    */
    @Override
    public java.lang.String getBusinessBrandName() {
        return _entityBusinessBrand.getBusinessBrandName();
    }

    /**
    * Sets the business brand name of this entity business brand.
    *
    * @param businessBrandName the business brand name of this entity business brand
    */
    @Override
    public void setBusinessBrandName(java.lang.String businessBrandName) {
        _entityBusinessBrand.setBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the description business brand of this entity business brand.
    *
    * @return the description business brand of this entity business brand
    */
    @Override
    public java.lang.String getDescriptionBusinessBrand() {
        return _entityBusinessBrand.getDescriptionBusinessBrand();
    }

    /**
    * Sets the description business brand of this entity business brand.
    *
    * @param descriptionBusinessBrand the description business brand of this entity business brand
    */
    @Override
    public void setDescriptionBusinessBrand(
        java.lang.String descriptionBusinessBrand) {
        _entityBusinessBrand.setDescriptionBusinessBrand(descriptionBusinessBrand);
    }

    @Override
    public boolean isNew() {
        return _entityBusinessBrand.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityBusinessBrand.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityBusinessBrand.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityBusinessBrand.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityBusinessBrand.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityBusinessBrand.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityBusinessBrand.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityBusinessBrand.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityBusinessBrand.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityBusinessBrand.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityBusinessBrand.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityBusinessBrandWrapper((EntityBusinessBrand) _entityBusinessBrand.clone());
    }

    @Override
    public int compareTo(EntityBusinessBrand entityBusinessBrand) {
        return _entityBusinessBrand.compareTo(entityBusinessBrand);
    }

    @Override
    public int hashCode() {
        return _entityBusinessBrand.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityBusinessBrand> toCacheModel() {
        return _entityBusinessBrand.toCacheModel();
    }

    @Override
    public EntityBusinessBrand toEscapedModel() {
        return new EntityBusinessBrandWrapper(_entityBusinessBrand.toEscapedModel());
    }

    @Override
    public EntityBusinessBrand toUnescapedModel() {
        return new EntityBusinessBrandWrapper(_entityBusinessBrand.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityBusinessBrand.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityBusinessBrand.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityBusinessBrand.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityBusinessBrandWrapper)) {
            return false;
        }

        EntityBusinessBrandWrapper entityBusinessBrandWrapper = (EntityBusinessBrandWrapper) obj;

        if (Validator.equals(_entityBusinessBrand,
                    entityBusinessBrandWrapper._entityBusinessBrand)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityBusinessBrand getWrappedEntityBusinessBrand() {
        return _entityBusinessBrand;
    }

    @Override
    public EntityBusinessBrand getWrappedModel() {
        return _entityBusinessBrand;
    }

    @Override
    public void resetOriginalValues() {
        _entityBusinessBrand.resetOriginalValues();
    }
}
