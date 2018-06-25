package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityStateLocalServiceUtil;

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


public class EntityStateClp extends BaseModelImpl<EntityState>
    implements EntityState {
    private int _stateId;
    private String _stateName;
    private String _capitalName;
    private BaseModel<?> _entityStateRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityStateClp() {
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
    public int getPrimaryKey() {
        return _stateId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setStateId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _stateId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getStateId() {
        return _stateId;
    }

    @Override
    public void setStateId(int stateId) {
        _stateId = stateId;

        if (_entityStateRemoteModel != null) {
            try {
                Class<?> clazz = _entityStateRemoteModel.getClass();

                Method method = clazz.getMethod("setStateId", int.class);

                method.invoke(_entityStateRemoteModel, stateId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStateName() {
        return _stateName;
    }

    @Override
    public void setStateName(String stateName) {
        _stateName = stateName;

        if (_entityStateRemoteModel != null) {
            try {
                Class<?> clazz = _entityStateRemoteModel.getClass();

                Method method = clazz.getMethod("setStateName", String.class);

                method.invoke(_entityStateRemoteModel, stateName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCapitalName() {
        return _capitalName;
    }

    @Override
    public void setCapitalName(String capitalName) {
        _capitalName = capitalName;

        if (_entityStateRemoteModel != null) {
            try {
                Class<?> clazz = _entityStateRemoteModel.getClass();

                Method method = clazz.getMethod("setCapitalName", String.class);

                method.invoke(_entityStateRemoteModel, capitalName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityStateRemoteModel() {
        return _entityStateRemoteModel;
    }

    public void setEntityStateRemoteModel(BaseModel<?> entityStateRemoteModel) {
        _entityStateRemoteModel = entityStateRemoteModel;
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

        Class<?> remoteModelClass = _entityStateRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityStateRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityStateLocalServiceUtil.addEntityState(this);
        } else {
            EntityStateLocalServiceUtil.updateEntityState(this);
        }
    }

    @Override
    public EntityState toEscapedModel() {
        return (EntityState) ProxyUtil.newProxyInstance(EntityState.class.getClassLoader(),
            new Class[] { EntityState.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityStateClp clone = new EntityStateClp();

        clone.setStateId(getStateId());
        clone.setStateName(getStateName());
        clone.setCapitalName(getCapitalName());

        return clone;
    }

    @Override
    public int compareTo(EntityState entityState) {
        int primaryKey = entityState.getPrimaryKey();

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

        if (!(obj instanceof EntityStateClp)) {
            return false;
        }

        EntityStateClp entityState = (EntityStateClp) obj;

        int primaryKey = entityState.getPrimaryKey();

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

        sb.append("{stateId=");
        sb.append(getStateId());
        sb.append(", stateName=");
        sb.append(getStateName());
        sb.append(", capitalName=");
        sb.append(getCapitalName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityState");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>stateId</column-name><column-value><![CDATA[");
        sb.append(getStateId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stateName</column-name><column-value><![CDATA[");
        sb.append(getStateName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>capitalName</column-name><column-value><![CDATA[");
        sb.append(getCapitalName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
