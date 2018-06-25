package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityStatus}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatus
 * @generated
 */
public class EntityStatusWrapper implements EntityStatus,
    ModelWrapper<EntityStatus> {
    private EntityStatus _entityStatus;

    public EntityStatusWrapper(EntityStatus entityStatus) {
        _entityStatus = entityStatus;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityStatus.class;
    }

    @Override
    public String getModelClassName() {
        return EntityStatus.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("statusName", getStatusName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String statusName = (String) attributes.get("statusName");

        if (statusName != null) {
            setStatusName(statusName);
        }
    }

    /**
    * Returns the primary key of this entity status.
    *
    * @return the primary key of this entity status
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _entityStatus.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity status.
    *
    * @param primaryKey the primary key of this entity status
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _entityStatus.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the status name of this entity status.
    *
    * @return the status name of this entity status
    */
    @Override
    public java.lang.String getStatusName() {
        return _entityStatus.getStatusName();
    }

    /**
    * Sets the status name of this entity status.
    *
    * @param statusName the status name of this entity status
    */
    @Override
    public void setStatusName(java.lang.String statusName) {
        _entityStatus.setStatusName(statusName);
    }

    @Override
    public boolean isNew() {
        return _entityStatus.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityStatus.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityStatus.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityStatus.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityStatus.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityStatus.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityStatus.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityStatus.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityStatus.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityStatus.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityStatus.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityStatusWrapper((EntityStatus) _entityStatus.clone());
    }

    @Override
    public int compareTo(EntityStatus entityStatus) {
        return _entityStatus.compareTo(entityStatus);
    }

    @Override
    public int hashCode() {
        return _entityStatus.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityStatus> toCacheModel() {
        return _entityStatus.toCacheModel();
    }

    @Override
    public EntityStatus toEscapedModel() {
        return new EntityStatusWrapper(_entityStatus.toEscapedModel());
    }

    @Override
    public EntityStatus toUnescapedModel() {
        return new EntityStatusWrapper(_entityStatus.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityStatus.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityStatus.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityStatus.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityStatusWrapper)) {
            return false;
        }

        EntityStatusWrapper entityStatusWrapper = (EntityStatusWrapper) obj;

        if (Validator.equals(_entityStatus, entityStatusWrapper._entityStatus)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityStatus getWrappedEntityStatus() {
        return _entityStatus;
    }

    @Override
    public EntityStatus getWrappedModel() {
        return _entityStatus;
    }

    @Override
    public void resetOriginalValues() {
        _entityStatus.resetOriginalValues();
    }
}
