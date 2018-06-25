package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityGParameter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameter
 * @generated
 */
public class EntityGParameterWrapper implements EntityGParameter,
    ModelWrapper<EntityGParameter> {
    private EntityGParameter _entityGParameter;

    public EntityGParameterWrapper(EntityGParameter entityGParameter) {
        _entityGParameter = entityGParameter;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityGParameter.class;
    }

    @Override
    public String getModelClassName() {
        return EntityGParameter.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("parameterName", getParameterName());
        attributes.put("value", getValue());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String parameterName = (String) attributes.get("parameterName");

        if (parameterName != null) {
            setParameterName(parameterName);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    /**
    * Returns the primary key of this entity g parameter.
    *
    * @return the primary key of this entity g parameter
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _entityGParameter.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity g parameter.
    *
    * @param primaryKey the primary key of this entity g parameter
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _entityGParameter.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the parameter name of this entity g parameter.
    *
    * @return the parameter name of this entity g parameter
    */
    @Override
    public java.lang.String getParameterName() {
        return _entityGParameter.getParameterName();
    }

    /**
    * Sets the parameter name of this entity g parameter.
    *
    * @param parameterName the parameter name of this entity g parameter
    */
    @Override
    public void setParameterName(java.lang.String parameterName) {
        _entityGParameter.setParameterName(parameterName);
    }

    /**
    * Returns the value of this entity g parameter.
    *
    * @return the value of this entity g parameter
    */
    @Override
    public java.lang.String getValue() {
        return _entityGParameter.getValue();
    }

    /**
    * Sets the value of this entity g parameter.
    *
    * @param value the value of this entity g parameter
    */
    @Override
    public void setValue(java.lang.String value) {
        _entityGParameter.setValue(value);
    }

    /**
    * Returns the description of this entity g parameter.
    *
    * @return the description of this entity g parameter
    */
    @Override
    public java.lang.String getDescription() {
        return _entityGParameter.getDescription();
    }

    /**
    * Sets the description of this entity g parameter.
    *
    * @param description the description of this entity g parameter
    */
    @Override
    public void setDescription(java.lang.String description) {
        _entityGParameter.setDescription(description);
    }

    @Override
    public boolean isNew() {
        return _entityGParameter.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityGParameter.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityGParameter.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityGParameter.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityGParameter.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityGParameter.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityGParameter.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityGParameter.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityGParameter.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityGParameter.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityGParameter.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityGParameterWrapper((EntityGParameter) _entityGParameter.clone());
    }

    @Override
    public int compareTo(EntityGParameter entityGParameter) {
        return _entityGParameter.compareTo(entityGParameter);
    }

    @Override
    public int hashCode() {
        return _entityGParameter.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityGParameter> toCacheModel() {
        return _entityGParameter.toCacheModel();
    }

    @Override
    public EntityGParameter toEscapedModel() {
        return new EntityGParameterWrapper(_entityGParameter.toEscapedModel());
    }

    @Override
    public EntityGParameter toUnescapedModel() {
        return new EntityGParameterWrapper(_entityGParameter.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityGParameter.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityGParameter.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityGParameter.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityGParameterWrapper)) {
            return false;
        }

        EntityGParameterWrapper entityGParameterWrapper = (EntityGParameterWrapper) obj;

        if (Validator.equals(_entityGParameter,
                    entityGParameterWrapper._entityGParameter)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityGParameter getWrappedEntityGParameter() {
        return _entityGParameter;
    }

    @Override
    public EntityGParameter getWrappedModel() {
        return _entityGParameter;
    }

    @Override
    public void resetOriginalValues() {
        _entityGParameter.resetOriginalValues();
    }
}
