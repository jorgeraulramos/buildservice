package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityState}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityState
 * @generated
 */
public class EntityStateWrapper implements EntityState,
    ModelWrapper<EntityState> {
    private EntityState _entityState;

    public EntityStateWrapper(EntityState entityState) {
        _entityState = entityState;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityState.class;
    }

    @Override
    public String getModelClassName() {
        return EntityState.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("stateId", getStateId());
        attributes.put("stateName", getStateName());
        attributes.put("capitalName", getCapitalName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }

        String stateName = (String) attributes.get("stateName");

        if (stateName != null) {
            setStateName(stateName);
        }

        String capitalName = (String) attributes.get("capitalName");

        if (capitalName != null) {
            setCapitalName(capitalName);
        }
    }

    /**
    * Returns the primary key of this entity state.
    *
    * @return the primary key of this entity state
    */
    @Override
    public int getPrimaryKey() {
        return _entityState.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity state.
    *
    * @param primaryKey the primary key of this entity state
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityState.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the state ID of this entity state.
    *
    * @return the state ID of this entity state
    */
    @Override
    public int getStateId() {
        return _entityState.getStateId();
    }

    /**
    * Sets the state ID of this entity state.
    *
    * @param stateId the state ID of this entity state
    */
    @Override
    public void setStateId(int stateId) {
        _entityState.setStateId(stateId);
    }

    /**
    * Returns the state name of this entity state.
    *
    * @return the state name of this entity state
    */
    @Override
    public java.lang.String getStateName() {
        return _entityState.getStateName();
    }

    /**
    * Sets the state name of this entity state.
    *
    * @param stateName the state name of this entity state
    */
    @Override
    public void setStateName(java.lang.String stateName) {
        _entityState.setStateName(stateName);
    }

    /**
    * Returns the capital name of this entity state.
    *
    * @return the capital name of this entity state
    */
    @Override
    public java.lang.String getCapitalName() {
        return _entityState.getCapitalName();
    }

    /**
    * Sets the capital name of this entity state.
    *
    * @param capitalName the capital name of this entity state
    */
    @Override
    public void setCapitalName(java.lang.String capitalName) {
        _entityState.setCapitalName(capitalName);
    }

    @Override
    public boolean isNew() {
        return _entityState.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityState.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityState.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityState.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityState.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityState.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityState.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityState.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityState.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityState.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityState.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityStateWrapper((EntityState) _entityState.clone());
    }

    @Override
    public int compareTo(EntityState entityState) {
        return _entityState.compareTo(entityState);
    }

    @Override
    public int hashCode() {
        return _entityState.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityState> toCacheModel() {
        return _entityState.toCacheModel();
    }

    @Override
    public EntityState toEscapedModel() {
        return new EntityStateWrapper(_entityState.toEscapedModel());
    }

    @Override
    public EntityState toUnescapedModel() {
        return new EntityStateWrapper(_entityState.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityState.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityState.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityState.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityStateWrapper)) {
            return false;
        }

        EntityStateWrapper entityStateWrapper = (EntityStateWrapper) obj;

        if (Validator.equals(_entityState, entityStateWrapper._entityState)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityState getWrappedEntityState() {
        return _entityState;
    }

    @Override
    public EntityState getWrappedModel() {
        return _entityState;
    }

    @Override
    public void resetOriginalValues() {
        _entityState.resetOriginalValues();
    }
}
