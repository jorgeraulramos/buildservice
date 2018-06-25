package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityStatusLocalServiceUtil;

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


public class EntityStatusClp extends BaseModelImpl<EntityStatus>
    implements EntityStatus {
    private String _statusName;
    private BaseModel<?> _entityStatusRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityStatusClp() {
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
    public String getPrimaryKey() {
        return _statusName;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setStatusName(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _statusName;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
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

    @Override
    public String getStatusName() {
        return _statusName;
    }

    @Override
    public void setStatusName(String statusName) {
        _statusName = statusName;

        if (_entityStatusRemoteModel != null) {
            try {
                Class<?> clazz = _entityStatusRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusName", String.class);

                method.invoke(_entityStatusRemoteModel, statusName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityStatusRemoteModel() {
        return _entityStatusRemoteModel;
    }

    public void setEntityStatusRemoteModel(BaseModel<?> entityStatusRemoteModel) {
        _entityStatusRemoteModel = entityStatusRemoteModel;
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

        Class<?> remoteModelClass = _entityStatusRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityStatusRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityStatusLocalServiceUtil.addEntityStatus(this);
        } else {
            EntityStatusLocalServiceUtil.updateEntityStatus(this);
        }
    }

    @Override
    public EntityStatus toEscapedModel() {
        return (EntityStatus) ProxyUtil.newProxyInstance(EntityStatus.class.getClassLoader(),
            new Class[] { EntityStatus.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityStatusClp clone = new EntityStatusClp();

        clone.setStatusName(getStatusName());

        return clone;
    }

    @Override
    public int compareTo(EntityStatus entityStatus) {
        String primaryKey = entityStatus.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityStatusClp)) {
            return false;
        }

        EntityStatusClp entityStatus = (EntityStatusClp) obj;

        String primaryKey = entityStatus.getPrimaryKey();

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
        StringBundler sb = new StringBundler(3);

        sb.append("{statusName=");
        sb.append(getStatusName());

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(7);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityStatus");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>statusName</column-name><column-value><![CDATA[");
        sb.append(getStatusName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
