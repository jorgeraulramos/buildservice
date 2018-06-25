package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityEventLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EntityEventClp extends BaseModelImpl<EntityEvent>
    implements EntityEvent {
    private int _eventId;
    private String _eventName;
    private BaseModel<?> _entityEventRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityEventClp() {
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
    public int getPrimaryKey() {
        return _eventId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setEventId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _eventId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getEventId() {
        return _eventId;
    }

    @Override
    public void setEventId(int eventId) {
        _eventId = eventId;

        if (_entityEventRemoteModel != null) {
            try {
                Class<?> clazz = _entityEventRemoteModel.getClass();

                Method method = clazz.getMethod("setEventId", int.class);

                method.invoke(_entityEventRemoteModel, eventId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEventName() {
        return _eventName;
    }

    @Override
    public void setEventName(String eventName) {
        _eventName = eventName;

        if (_entityEventRemoteModel != null) {
            try {
                Class<?> clazz = _entityEventRemoteModel.getClass();

                Method method = clazz.getMethod("setEventName", String.class);

                method.invoke(_entityEventRemoteModel, eventName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityEventRemoteModel() {
        return _entityEventRemoteModel;
    }

    public void setEntityEventRemoteModel(BaseModel<?> entityEventRemoteModel) {
        _entityEventRemoteModel = entityEventRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _entityEventRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_entityEventRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityEventLocalServiceUtil.addEntityEvent(this);
        } else {
            EntityEventLocalServiceUtil.updateEntityEvent(this);
        }
    }

    @Override
    public EntityEvent toEscapedModel() {
        return (EntityEvent) ProxyUtil.newProxyInstance(EntityEvent.class.getClassLoader(),
            new Class[] { EntityEvent.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityEventClp clone = new EntityEventClp();

        clone.setEventId(getEventId());
        clone.setEventName(getEventName());

        return clone;
    }

    @Override
    public int compareTo(EntityEvent entityEvent) {
        int primaryKey = entityEvent.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEventClp)) {
            return false;
        }

        EntityEventClp entityEvent = (EntityEventClp) obj;

        int primaryKey = entityEvent.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{eventId=");
        sb.append(getEventId());
        sb.append(", eventName=");
        sb.append(getEventName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityEvent");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>eventId</column-name><column-value><![CDATA[");
        sb.append(getEventId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eventName</column-name><column-value><![CDATA[");
        sb.append(getEventName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
