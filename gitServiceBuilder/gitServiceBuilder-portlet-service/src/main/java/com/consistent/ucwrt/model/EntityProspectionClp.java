package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityProspectionLocalServiceUtil;

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


public class EntityProspectionClp extends BaseModelImpl<EntityProspection>
    implements EntityProspection {
    private int _prospectionId;
    private String _prospectionName;
    private int _eventId;
    private BaseModel<?> _entityProspectionRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityProspectionClp() {
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
    public int getPrimaryKey() {
        return _prospectionId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setProspectionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _prospectionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getProspectionId() {
        return _prospectionId;
    }

    @Override
    public void setProspectionId(int prospectionId) {
        _prospectionId = prospectionId;

        if (_entityProspectionRemoteModel != null) {
            try {
                Class<?> clazz = _entityProspectionRemoteModel.getClass();

                Method method = clazz.getMethod("setProspectionId", int.class);

                method.invoke(_entityProspectionRemoteModel, prospectionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProspectionName() {
        return _prospectionName;
    }

    @Override
    public void setProspectionName(String prospectionName) {
        _prospectionName = prospectionName;

        if (_entityProspectionRemoteModel != null) {
            try {
                Class<?> clazz = _entityProspectionRemoteModel.getClass();

                Method method = clazz.getMethod("setProspectionName",
                        String.class);

                method.invoke(_entityProspectionRemoteModel, prospectionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEventId() {
        return _eventId;
    }

    @Override
    public void setEventId(int eventId) {
        _eventId = eventId;

        if (_entityProspectionRemoteModel != null) {
            try {
                Class<?> clazz = _entityProspectionRemoteModel.getClass();

                Method method = clazz.getMethod("setEventId", int.class);

                method.invoke(_entityProspectionRemoteModel, eventId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityProspectionRemoteModel() {
        return _entityProspectionRemoteModel;
    }

    public void setEntityProspectionRemoteModel(
        BaseModel<?> entityProspectionRemoteModel) {
        _entityProspectionRemoteModel = entityProspectionRemoteModel;
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

        Class<?> remoteModelClass = _entityProspectionRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityProspectionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityProspectionLocalServiceUtil.addEntityProspection(this);
        } else {
            EntityProspectionLocalServiceUtil.updateEntityProspection(this);
        }
    }

    @Override
    public EntityProspection toEscapedModel() {
        return (EntityProspection) ProxyUtil.newProxyInstance(EntityProspection.class.getClassLoader(),
            new Class[] { EntityProspection.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityProspectionClp clone = new EntityProspectionClp();

        clone.setProspectionId(getProspectionId());
        clone.setProspectionName(getProspectionName());
        clone.setEventId(getEventId());

        return clone;
    }

    @Override
    public int compareTo(EntityProspection entityProspection) {
        int primaryKey = entityProspection.getPrimaryKey();

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

        if (!(obj instanceof EntityProspectionClp)) {
            return false;
        }

        EntityProspectionClp entityProspection = (EntityProspectionClp) obj;

        int primaryKey = entityProspection.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{prospectionId=");
        sb.append(getProspectionId());
        sb.append(", prospectionName=");
        sb.append(getProspectionName());
        sb.append(", eventId=");
        sb.append(getEventId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityProspection");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>prospectionId</column-name><column-value><![CDATA[");
        sb.append(getProspectionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>prospectionName</column-name><column-value><![CDATA[");
        sb.append(getProspectionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eventId</column-name><column-value><![CDATA[");
        sb.append(getEventId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
