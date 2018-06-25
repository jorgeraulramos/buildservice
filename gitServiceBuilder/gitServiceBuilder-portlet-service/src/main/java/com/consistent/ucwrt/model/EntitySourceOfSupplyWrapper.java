package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntitySourceOfSupply}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupply
 * @generated
 */
public class EntitySourceOfSupplyWrapper implements EntitySourceOfSupply,
    ModelWrapper<EntitySourceOfSupply> {
    private EntitySourceOfSupply _entitySourceOfSupply;

    public EntitySourceOfSupplyWrapper(
        EntitySourceOfSupply entitySourceOfSupply) {
        _entitySourceOfSupply = entitySourceOfSupply;
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySourceOfSupply.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySourceOfSupply.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("sourceSupplyId", getSourceSupplyId());
        attributes.put("sourceOfSupply", getSourceOfSupply());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer sourceSupplyId = (Integer) attributes.get("sourceSupplyId");

        if (sourceSupplyId != null) {
            setSourceSupplyId(sourceSupplyId);
        }

        String sourceOfSupply = (String) attributes.get("sourceOfSupply");

        if (sourceOfSupply != null) {
            setSourceOfSupply(sourceOfSupply);
        }
    }

    /**
    * Returns the primary key of this entity source of supply.
    *
    * @return the primary key of this entity source of supply
    */
    @Override
    public int getPrimaryKey() {
        return _entitySourceOfSupply.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity source of supply.
    *
    * @param primaryKey the primary key of this entity source of supply
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entitySourceOfSupply.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the source supply ID of this entity source of supply.
    *
    * @return the source supply ID of this entity source of supply
    */
    @Override
    public int getSourceSupplyId() {
        return _entitySourceOfSupply.getSourceSupplyId();
    }

    /**
    * Sets the source supply ID of this entity source of supply.
    *
    * @param sourceSupplyId the source supply ID of this entity source of supply
    */
    @Override
    public void setSourceSupplyId(int sourceSupplyId) {
        _entitySourceOfSupply.setSourceSupplyId(sourceSupplyId);
    }

    /**
    * Returns the source of supply of this entity source of supply.
    *
    * @return the source of supply of this entity source of supply
    */
    @Override
    public java.lang.String getSourceOfSupply() {
        return _entitySourceOfSupply.getSourceOfSupply();
    }

    /**
    * Sets the source of supply of this entity source of supply.
    *
    * @param sourceOfSupply the source of supply of this entity source of supply
    */
    @Override
    public void setSourceOfSupply(java.lang.String sourceOfSupply) {
        _entitySourceOfSupply.setSourceOfSupply(sourceOfSupply);
    }

    @Override
    public boolean isNew() {
        return _entitySourceOfSupply.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entitySourceOfSupply.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entitySourceOfSupply.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entitySourceOfSupply.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entitySourceOfSupply.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entitySourceOfSupply.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entitySourceOfSupply.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entitySourceOfSupply.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entitySourceOfSupply.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entitySourceOfSupply.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entitySourceOfSupply.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntitySourceOfSupplyWrapper((EntitySourceOfSupply) _entitySourceOfSupply.clone());
    }

    @Override
    public int compareTo(EntitySourceOfSupply entitySourceOfSupply) {
        return _entitySourceOfSupply.compareTo(entitySourceOfSupply);
    }

    @Override
    public int hashCode() {
        return _entitySourceOfSupply.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntitySourceOfSupply> toCacheModel() {
        return _entitySourceOfSupply.toCacheModel();
    }

    @Override
    public EntitySourceOfSupply toEscapedModel() {
        return new EntitySourceOfSupplyWrapper(_entitySourceOfSupply.toEscapedModel());
    }

    @Override
    public EntitySourceOfSupply toUnescapedModel() {
        return new EntitySourceOfSupplyWrapper(_entitySourceOfSupply.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entitySourceOfSupply.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entitySourceOfSupply.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entitySourceOfSupply.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntitySourceOfSupplyWrapper)) {
            return false;
        }

        EntitySourceOfSupplyWrapper entitySourceOfSupplyWrapper = (EntitySourceOfSupplyWrapper) obj;

        if (Validator.equals(_entitySourceOfSupply,
                    entitySourceOfSupplyWrapper._entitySourceOfSupply)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntitySourceOfSupply getWrappedEntitySourceOfSupply() {
        return _entitySourceOfSupply;
    }

    @Override
    public EntitySourceOfSupply getWrappedModel() {
        return _entitySourceOfSupply;
    }

    @Override
    public void resetOriginalValues() {
        _entitySourceOfSupply.resetOriginalValues();
    }
}
