package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityDepartment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartment
 * @generated
 */
public class EntityDepartmentWrapper implements EntityDepartment,
    ModelWrapper<EntityDepartment> {
    private EntityDepartment _entityDepartment;

    public EntityDepartmentWrapper(EntityDepartment entityDepartment) {
        _entityDepartment = entityDepartment;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityDepartment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityDepartment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("departmentId", getDepartmentId());
        attributes.put("departmentName", getDepartmentName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String departmentId = (String) attributes.get("departmentId");

        if (departmentId != null) {
            setDepartmentId(departmentId);
        }

        String departmentName = (String) attributes.get("departmentName");

        if (departmentName != null) {
            setDepartmentName(departmentName);
        }
    }

    /**
    * Returns the primary key of this entity department.
    *
    * @return the primary key of this entity department
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityDepartmentPK getPrimaryKey() {
        return _entityDepartment.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity department.
    *
    * @param primaryKey the primary key of this entity department
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityDepartmentPK primaryKey) {
        _entityDepartment.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the department ID of this entity department.
    *
    * @return the department ID of this entity department
    */
    @Override
    public java.lang.String getDepartmentId() {
        return _entityDepartment.getDepartmentId();
    }

    /**
    * Sets the department ID of this entity department.
    *
    * @param departmentId the department ID of this entity department
    */
    @Override
    public void setDepartmentId(java.lang.String departmentId) {
        _entityDepartment.setDepartmentId(departmentId);
    }

    /**
    * Returns the department name of this entity department.
    *
    * @return the department name of this entity department
    */
    @Override
    public java.lang.String getDepartmentName() {
        return _entityDepartment.getDepartmentName();
    }

    /**
    * Sets the department name of this entity department.
    *
    * @param departmentName the department name of this entity department
    */
    @Override
    public void setDepartmentName(java.lang.String departmentName) {
        _entityDepartment.setDepartmentName(departmentName);
    }

    @Override
    public boolean isNew() {
        return _entityDepartment.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityDepartment.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityDepartment.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityDepartment.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityDepartment.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityDepartment.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityDepartment.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityDepartment.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityDepartment.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityDepartment.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityDepartment.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityDepartmentWrapper((EntityDepartment) _entityDepartment.clone());
    }

    @Override
    public int compareTo(EntityDepartment entityDepartment) {
        return _entityDepartment.compareTo(entityDepartment);
    }

    @Override
    public int hashCode() {
        return _entityDepartment.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityDepartment> toCacheModel() {
        return _entityDepartment.toCacheModel();
    }

    @Override
    public EntityDepartment toEscapedModel() {
        return new EntityDepartmentWrapper(_entityDepartment.toEscapedModel());
    }

    @Override
    public EntityDepartment toUnescapedModel() {
        return new EntityDepartmentWrapper(_entityDepartment.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityDepartment.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityDepartment.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityDepartment.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityDepartmentWrapper)) {
            return false;
        }

        EntityDepartmentWrapper entityDepartmentWrapper = (EntityDepartmentWrapper) obj;

        if (Validator.equals(_entityDepartment,
                    entityDepartmentWrapper._entityDepartment)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityDepartment getWrappedEntityDepartment() {
        return _entityDepartment;
    }

    @Override
    public EntityDepartment getWrappedModel() {
        return _entityDepartment;
    }

    @Override
    public void resetOriginalValues() {
        _entityDepartment.resetOriginalValues();
    }
}
