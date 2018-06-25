package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityEmployment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployment
 * @generated
 */
public class EntityEmploymentWrapper implements EntityEmployment,
    ModelWrapper<EntityEmployment> {
    private EntityEmployment _entityEmployment;

    public EntityEmploymentWrapper(EntityEmployment entityEmployment) {
        _entityEmployment = entityEmployment;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEmployment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEmployment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employmentId", getEmploymentId());
        attributes.put("employmentName", getEmploymentName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String employmentId = (String) attributes.get("employmentId");

        if (employmentId != null) {
            setEmploymentId(employmentId);
        }

        String employmentName = (String) attributes.get("employmentName");

        if (employmentName != null) {
            setEmploymentName(employmentName);
        }
    }

    /**
    * Returns the primary key of this entity employment.
    *
    * @return the primary key of this entity employment
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityEmploymentPK getPrimaryKey() {
        return _entityEmployment.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity employment.
    *
    * @param primaryKey the primary key of this entity employment
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityEmploymentPK primaryKey) {
        _entityEmployment.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employment ID of this entity employment.
    *
    * @return the employment ID of this entity employment
    */
    @Override
    public java.lang.String getEmploymentId() {
        return _entityEmployment.getEmploymentId();
    }

    /**
    * Sets the employment ID of this entity employment.
    *
    * @param employmentId the employment ID of this entity employment
    */
    @Override
    public void setEmploymentId(java.lang.String employmentId) {
        _entityEmployment.setEmploymentId(employmentId);
    }

    /**
    * Returns the employment name of this entity employment.
    *
    * @return the employment name of this entity employment
    */
    @Override
    public java.lang.String getEmploymentName() {
        return _entityEmployment.getEmploymentName();
    }

    /**
    * Sets the employment name of this entity employment.
    *
    * @param employmentName the employment name of this entity employment
    */
    @Override
    public void setEmploymentName(java.lang.String employmentName) {
        _entityEmployment.setEmploymentName(employmentName);
    }

    @Override
    public boolean isNew() {
        return _entityEmployment.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityEmployment.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityEmployment.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityEmployment.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityEmployment.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityEmployment.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityEmployment.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityEmployment.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityEmployment.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityEmployment.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityEmployment.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityEmploymentWrapper((EntityEmployment) _entityEmployment.clone());
    }

    @Override
    public int compareTo(EntityEmployment entityEmployment) {
        return _entityEmployment.compareTo(entityEmployment);
    }

    @Override
    public int hashCode() {
        return _entityEmployment.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityEmployment> toCacheModel() {
        return _entityEmployment.toCacheModel();
    }

    @Override
    public EntityEmployment toEscapedModel() {
        return new EntityEmploymentWrapper(_entityEmployment.toEscapedModel());
    }

    @Override
    public EntityEmployment toUnescapedModel() {
        return new EntityEmploymentWrapper(_entityEmployment.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityEmployment.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityEmployment.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityEmployment.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEmploymentWrapper)) {
            return false;
        }

        EntityEmploymentWrapper entityEmploymentWrapper = (EntityEmploymentWrapper) obj;

        if (Validator.equals(_entityEmployment,
                    entityEmploymentWrapper._entityEmployment)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityEmployment getWrappedEntityEmployment() {
        return _entityEmployment;
    }

    @Override
    public EntityEmployment getWrappedModel() {
        return _entityEmployment;
    }

    @Override
    public void resetOriginalValues() {
        _entityEmployment.resetOriginalValues();
    }
}
