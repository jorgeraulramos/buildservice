package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityProspection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspection
 * @generated
 */
public class EntityProspectionWrapper implements EntityProspection,
    ModelWrapper<EntityProspection> {
    private EntityProspection _entityProspection;

    public EntityProspectionWrapper(EntityProspection entityProspection) {
        _entityProspection = entityProspection;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityProspection.class;
    }

    @Override
    public String getModelClassName() {
        return EntityProspection.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("prospectionId", getProspectionId());
        attributes.put("prospectionName", getProspectionName());
        attributes.put("eventId", getEventId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer prospectionId = (Integer) attributes.get("prospectionId");

        if (prospectionId != null) {
            setProspectionId(prospectionId);
        }

        String prospectionName = (String) attributes.get("prospectionName");

        if (prospectionName != null) {
            setProspectionName(prospectionName);
        }

        Integer eventId = (Integer) attributes.get("eventId");

        if (eventId != null) {
            setEventId(eventId);
        }
    }

    /**
    * Returns the primary key of this entity prospection.
    *
    * @return the primary key of this entity prospection
    */
    @Override
    public int getPrimaryKey() {
        return _entityProspection.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity prospection.
    *
    * @param primaryKey the primary key of this entity prospection
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityProspection.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the prospection ID of this entity prospection.
    *
    * @return the prospection ID of this entity prospection
    */
    @Override
    public int getProspectionId() {
        return _entityProspection.getProspectionId();
    }

    /**
    * Sets the prospection ID of this entity prospection.
    *
    * @param prospectionId the prospection ID of this entity prospection
    */
    @Override
    public void setProspectionId(int prospectionId) {
        _entityProspection.setProspectionId(prospectionId);
    }

    /**
    * Returns the prospection name of this entity prospection.
    *
    * @return the prospection name of this entity prospection
    */
    @Override
    public java.lang.String getProspectionName() {
        return _entityProspection.getProspectionName();
    }

    /**
    * Sets the prospection name of this entity prospection.
    *
    * @param prospectionName the prospection name of this entity prospection
    */
    @Override
    public void setProspectionName(java.lang.String prospectionName) {
        _entityProspection.setProspectionName(prospectionName);
    }

    /**
    * Returns the event ID of this entity prospection.
    *
    * @return the event ID of this entity prospection
    */
    @Override
    public int getEventId() {
        return _entityProspection.getEventId();
    }

    /**
    * Sets the event ID of this entity prospection.
    *
    * @param eventId the event ID of this entity prospection
    */
    @Override
    public void setEventId(int eventId) {
        _entityProspection.setEventId(eventId);
    }

    @Override
    public boolean isNew() {
        return _entityProspection.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityProspection.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityProspection.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityProspection.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityProspection.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityProspection.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityProspection.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityProspection.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityProspection.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityProspection.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityProspection.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityProspectionWrapper((EntityProspection) _entityProspection.clone());
    }

    @Override
    public int compareTo(EntityProspection entityProspection) {
        return _entityProspection.compareTo(entityProspection);
    }

    @Override
    public int hashCode() {
        return _entityProspection.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityProspection> toCacheModel() {
        return _entityProspection.toCacheModel();
    }

    @Override
    public EntityProspection toEscapedModel() {
        return new EntityProspectionWrapper(_entityProspection.toEscapedModel());
    }

    @Override
    public EntityProspection toUnescapedModel() {
        return new EntityProspectionWrapper(_entityProspection.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityProspection.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityProspection.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityProspection.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityProspectionWrapper)) {
            return false;
        }

        EntityProspectionWrapper entityProspectionWrapper = (EntityProspectionWrapper) obj;

        if (Validator.equals(_entityProspection,
                    entityProspectionWrapper._entityProspection)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityProspection getWrappedEntityProspection() {
        return _entityProspection;
    }

    @Override
    public EntityProspection getWrappedModel() {
        return _entityProspection;
    }

    @Override
    public void resetOriginalValues() {
        _entityProspection.resetOriginalValues();
    }
}
