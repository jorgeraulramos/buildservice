package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntitySuburb}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburb
 * @generated
 */
public class EntitySuburbWrapper implements EntitySuburb,
    ModelWrapper<EntitySuburb> {
    private EntitySuburb _entitySuburb;

    public EntitySuburbWrapper(EntitySuburb entitySuburb) {
        _entitySuburb = entitySuburb;
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySuburb.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySuburb.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("suburbId", getSuburbId());
        attributes.put("suburbName", getSuburbName());
        attributes.put("postalCode", getPostalCode());
        attributes.put("municipalId", getMunicipalId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer suburbId = (Integer) attributes.get("suburbId");

        if (suburbId != null) {
            setSuburbId(suburbId);
        }

        String suburbName = (String) attributes.get("suburbName");

        if (suburbName != null) {
            setSuburbName(suburbName);
        }

        String postalCode = (String) attributes.get("postalCode");

        if (postalCode != null) {
            setPostalCode(postalCode);
        }

        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }
    }

    /**
    * Returns the primary key of this entity suburb.
    *
    * @return the primary key of this entity suburb
    */
    @Override
    public int getPrimaryKey() {
        return _entitySuburb.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity suburb.
    *
    * @param primaryKey the primary key of this entity suburb
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entitySuburb.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the suburb ID of this entity suburb.
    *
    * @return the suburb ID of this entity suburb
    */
    @Override
    public int getSuburbId() {
        return _entitySuburb.getSuburbId();
    }

    /**
    * Sets the suburb ID of this entity suburb.
    *
    * @param suburbId the suburb ID of this entity suburb
    */
    @Override
    public void setSuburbId(int suburbId) {
        _entitySuburb.setSuburbId(suburbId);
    }

    /**
    * Returns the suburb name of this entity suburb.
    *
    * @return the suburb name of this entity suburb
    */
    @Override
    public java.lang.String getSuburbName() {
        return _entitySuburb.getSuburbName();
    }

    /**
    * Sets the suburb name of this entity suburb.
    *
    * @param suburbName the suburb name of this entity suburb
    */
    @Override
    public void setSuburbName(java.lang.String suburbName) {
        _entitySuburb.setSuburbName(suburbName);
    }

    /**
    * Returns the postal code of this entity suburb.
    *
    * @return the postal code of this entity suburb
    */
    @Override
    public java.lang.String getPostalCode() {
        return _entitySuburb.getPostalCode();
    }

    /**
    * Sets the postal code of this entity suburb.
    *
    * @param postalCode the postal code of this entity suburb
    */
    @Override
    public void setPostalCode(java.lang.String postalCode) {
        _entitySuburb.setPostalCode(postalCode);
    }

    /**
    * Returns the municipal ID of this entity suburb.
    *
    * @return the municipal ID of this entity suburb
    */
    @Override
    public int getMunicipalId() {
        return _entitySuburb.getMunicipalId();
    }

    /**
    * Sets the municipal ID of this entity suburb.
    *
    * @param municipalId the municipal ID of this entity suburb
    */
    @Override
    public void setMunicipalId(int municipalId) {
        _entitySuburb.setMunicipalId(municipalId);
    }

    @Override
    public boolean isNew() {
        return _entitySuburb.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entitySuburb.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entitySuburb.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entitySuburb.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entitySuburb.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entitySuburb.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entitySuburb.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entitySuburb.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entitySuburb.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entitySuburb.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entitySuburb.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntitySuburbWrapper((EntitySuburb) _entitySuburb.clone());
    }

    @Override
    public int compareTo(EntitySuburb entitySuburb) {
        return _entitySuburb.compareTo(entitySuburb);
    }

    @Override
    public int hashCode() {
        return _entitySuburb.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntitySuburb> toCacheModel() {
        return _entitySuburb.toCacheModel();
    }

    @Override
    public EntitySuburb toEscapedModel() {
        return new EntitySuburbWrapper(_entitySuburb.toEscapedModel());
    }

    @Override
    public EntitySuburb toUnescapedModel() {
        return new EntitySuburbWrapper(_entitySuburb.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entitySuburb.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entitySuburb.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entitySuburb.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntitySuburbWrapper)) {
            return false;
        }

        EntitySuburbWrapper entitySuburbWrapper = (EntitySuburbWrapper) obj;

        if (Validator.equals(_entitySuburb, entitySuburbWrapper._entitySuburb)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntitySuburb getWrappedEntitySuburb() {
        return _entitySuburb;
    }

    @Override
    public EntitySuburb getWrappedModel() {
        return _entitySuburb;
    }

    @Override
    public void resetOriginalValues() {
        _entitySuburb.resetOriginalValues();
    }
}
