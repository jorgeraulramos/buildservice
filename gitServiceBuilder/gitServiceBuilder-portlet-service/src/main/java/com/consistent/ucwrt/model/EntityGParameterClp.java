package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityGParameterLocalServiceUtil;

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


public class EntityGParameterClp extends BaseModelImpl<EntityGParameter>
    implements EntityGParameter {
    private String _parameterName;
    private String _value;
    private String _description;
    private BaseModel<?> _entityGParameterRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityGParameterClp() {
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
    public String getPrimaryKey() {
        return _parameterName;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setParameterName(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _parameterName;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
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

    @Override
    public String getParameterName() {
        return _parameterName;
    }

    @Override
    public void setParameterName(String parameterName) {
        _parameterName = parameterName;

        if (_entityGParameterRemoteModel != null) {
            try {
                Class<?> clazz = _entityGParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setParameterName", String.class);

                method.invoke(_entityGParameterRemoteModel, parameterName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getValue() {
        return _value;
    }

    @Override
    public void setValue(String value) {
        _value = value;

        if (_entityGParameterRemoteModel != null) {
            try {
                Class<?> clazz = _entityGParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setValue", String.class);

                method.invoke(_entityGParameterRemoteModel, value);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_entityGParameterRemoteModel != null) {
            try {
                Class<?> clazz = _entityGParameterRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_entityGParameterRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityGParameterRemoteModel() {
        return _entityGParameterRemoteModel;
    }

    public void setEntityGParameterRemoteModel(
        BaseModel<?> entityGParameterRemoteModel) {
        _entityGParameterRemoteModel = entityGParameterRemoteModel;
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

        Class<?> remoteModelClass = _entityGParameterRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityGParameterRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityGParameterLocalServiceUtil.addEntityGParameter(this);
        } else {
            EntityGParameterLocalServiceUtil.updateEntityGParameter(this);
        }
    }

    @Override
    public EntityGParameter toEscapedModel() {
        return (EntityGParameter) ProxyUtil.newProxyInstance(EntityGParameter.class.getClassLoader(),
            new Class[] { EntityGParameter.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityGParameterClp clone = new EntityGParameterClp();

        clone.setParameterName(getParameterName());
        clone.setValue(getValue());
        clone.setDescription(getDescription());

        return clone;
    }

    @Override
    public int compareTo(EntityGParameter entityGParameter) {
        String primaryKey = entityGParameter.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityGParameterClp)) {
            return false;
        }

        EntityGParameterClp entityGParameter = (EntityGParameterClp) obj;

        String primaryKey = entityGParameter.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{parameterName=");
        sb.append(getParameterName());
        sb.append(", value=");
        sb.append(getValue());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityGParameter");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>parameterName</column-name><column-value><![CDATA[");
        sb.append(getParameterName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
