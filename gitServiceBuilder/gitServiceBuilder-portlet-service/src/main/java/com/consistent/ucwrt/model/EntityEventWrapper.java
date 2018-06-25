package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityEvent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEvent
 * @generated
 */
public class EntityEventWrapper implements EntityEvent,
    ModelWrapper<EntityEvent> {
    private EntityEvent _entityEvent;

    public EntityEventWrapper(EntityEvent entityEvent) {
        _entityEvent = entityEvent;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEvent.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEvent.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("eventId", getEventId());
        attributes.put("eventName", getEventName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer eventId = (Integer) attributes.get("eventId");

        if (eventId != null) {
            setEventId(eventId);
        }

        String eventName = (String) attributes.get("eventName");

        if (eventName != null) {
            setEventName(eventName);
        }
    }

    /**
    * Returns the primary key of this entity event.
    *
    * @return the primary key of this entity event
    */
    @Override
    public int getPrimaryKey() {
        return _entityEvent.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity event.
    *
    * @param primaryKey the primary key of this entity event
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityEvent.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the event ID of this entity event.
    *
    * @return the event ID of this entity event
    */
    @Override
    public int getEventId() {
        return _entityEvent.getEventId();
    }

    /**
    * Sets the event ID of this entity event.
    *
    * @param eventId the event ID of this entity event
    */
    @Override
    public void setEventId(int eventId) {
        _entityEvent.setEventId(eventId);
    }

    /**
    * Returns the event name of this entity event.
    *
    * @return the event name of this entity event
    */
    @Override
    public java.lang.String getEventName() {
        return _entityEvent.getEventName();
    }

    /**
    * Sets the event name of this entity event.
    *
    * @param eventName the event name of this entity event
    */
    @Override
    public void setEventName(java.lang.String eventName) {
        _entityEvent.setEventName(eventName);
    }

    @Override
    public boolean isNew() {
        return _entityEvent.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityEvent.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityEvent.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityEvent.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityEvent.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityEvent.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityEvent.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityEvent.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityEvent.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityEvent.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityEvent.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityEventWrapper((EntityEvent) _entityEvent.clone());
    }

    @Override
    public int compareTo(EntityEvent entityEvent) {
        return _entityEvent.compareTo(entityEvent);
    }

    @Override
    public int hashCode() {
        return _entityEvent.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityEvent> toCacheModel() {
        return _entityEvent.toCacheModel();
    }

    @Override
    public EntityEvent toEscapedModel() {
        return new EntityEventWrapper(_entityEvent.toEscapedModel());
    }

    @Override
    public EntityEvent toUnescapedModel() {
        return new EntityEventWrapper(_entityEvent.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityEvent.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityEvent.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityEvent.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEventWrapper)) {
            return false;
        }

        EntityEventWrapper entityEventWrapper = (EntityEventWrapper) obj;

        if (Validator.equals(_entityEvent, entityEventWrapper._entityEvent)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityEvent getWrappedEntityEvent() {
        return _entityEvent;
    }

    @Override
    public EntityEvent getWrappedModel() {
        return _entityEvent;
    }

    @Override
    public void resetOriginalValues() {
        _entityEvent.resetOriginalValues();
    }
}
