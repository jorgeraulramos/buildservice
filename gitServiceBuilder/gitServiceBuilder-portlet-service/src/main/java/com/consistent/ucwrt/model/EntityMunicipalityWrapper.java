package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityMunicipality}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMunicipality
 * @generated
 */
public class EntityMunicipalityWrapper implements EntityMunicipality,
    ModelWrapper<EntityMunicipality> {
    private EntityMunicipality _entityMunicipality;

    public EntityMunicipalityWrapper(EntityMunicipality entityMunicipality) {
        _entityMunicipality = entityMunicipality;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityMunicipality.class;
    }

    @Override
    public String getModelClassName() {
        return EntityMunicipality.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("municipalId", getMunicipalId());
        attributes.put("municipalName", getMunicipalName());
        attributes.put("stateId", getStateId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }

        String municipalName = (String) attributes.get("municipalName");

        if (municipalName != null) {
            setMunicipalName(municipalName);
        }

        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }
    }

    /**
    * Returns the primary key of this entity municipality.
    *
    * @return the primary key of this entity municipality
    */
    @Override
    public int getPrimaryKey() {
        return _entityMunicipality.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity municipality.
    *
    * @param primaryKey the primary key of this entity municipality
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityMunicipality.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the municipal ID of this entity municipality.
    *
    * @return the municipal ID of this entity municipality
    */
    @Override
    public int getMunicipalId() {
        return _entityMunicipality.getMunicipalId();
    }

    /**
    * Sets the municipal ID of this entity municipality.
    *
    * @param municipalId the municipal ID of this entity municipality
    */
    @Override
    public void setMunicipalId(int municipalId) {
        _entityMunicipality.setMunicipalId(municipalId);
    }

    /**
    * Returns the municipal name of this entity municipality.
    *
    * @return the municipal name of this entity municipality
    */
    @Override
    public java.lang.String getMunicipalName() {
        return _entityMunicipality.getMunicipalName();
    }

    /**
    * Sets the municipal name of this entity municipality.
    *
    * @param municipalName the municipal name of this entity municipality
    */
    @Override
    public void setMunicipalName(java.lang.String municipalName) {
        _entityMunicipality.setMunicipalName(municipalName);
    }

    /**
    * Returns the state ID of this entity municipality.
    *
    * @return the state ID of this entity municipality
    */
    @Override
    public int getStateId() {
        return _entityMunicipality.getStateId();
    }

    /**
    * Sets the state ID of this entity municipality.
    *
    * @param stateId the state ID of this entity municipality
    */
    @Override
    public void setStateId(int stateId) {
        _entityMunicipality.setStateId(stateId);
    }

    @Override
    public boolean isNew() {
        return _entityMunicipality.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityMunicipality.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityMunicipality.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityMunicipality.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityMunicipality.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityMunicipality.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityMunicipality.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityMunicipality.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityMunicipality.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityMunicipality.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityMunicipality.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityMunicipalityWrapper((EntityMunicipality) _entityMunicipality.clone());
    }

    @Override
    public int compareTo(EntityMunicipality entityMunicipality) {
        return _entityMunicipality.compareTo(entityMunicipality);
    }

    @Override
    public int hashCode() {
        return _entityMunicipality.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityMunicipality> toCacheModel() {
        return _entityMunicipality.toCacheModel();
    }

    @Override
    public EntityMunicipality toEscapedModel() {
        return new EntityMunicipalityWrapper(_entityMunicipality.toEscapedModel());
    }

    @Override
    public EntityMunicipality toUnescapedModel() {
        return new EntityMunicipalityWrapper(_entityMunicipality.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityMunicipality.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityMunicipality.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityMunicipality.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityMunicipalityWrapper)) {
            return false;
        }

        EntityMunicipalityWrapper entityMunicipalityWrapper = (EntityMunicipalityWrapper) obj;

        if (Validator.equals(_entityMunicipality,
                    entityMunicipalityWrapper._entityMunicipality)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityMunicipality getWrappedEntityMunicipality() {
        return _entityMunicipality;
    }

    @Override
    public EntityMunicipality getWrappedModel() {
        return _entityMunicipality;
    }

    @Override
    public void resetOriginalValues() {
        _entityMunicipality.resetOriginalValues();
    }
}
