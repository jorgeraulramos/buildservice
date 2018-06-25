package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntitySourceOfSupplyLocalServiceUtil;

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


public class EntitySourceOfSupplyClp extends BaseModelImpl<EntitySourceOfSupply>
    implements EntitySourceOfSupply {
    private int _sourceSupplyId;
    private String _sourceOfSupply;
    private BaseModel<?> _entitySourceOfSupplyRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntitySourceOfSupplyClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySourceOfSupply.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySourceOfSupply.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _sourceSupplyId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSourceSupplyId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _sourceSupplyId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("sourceSupplyId", getSourceSupplyId());
        attributes.put("sourceOfSupply", getSourceOfSupply());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer sourceSupplyId = (Integer) attributes.get("sourceSupplyId");

        if (sourceSupplyId != null) {
            setSourceSupplyId(sourceSupplyId);
        }

        String sourceOfSupply = (String) attributes.get("sourceOfSupply");

        if (sourceOfSupply != null) {
            setSourceOfSupply(sourceOfSupply);
        }
    }

    @Override
    public int getSourceSupplyId() {
        return _sourceSupplyId;
    }

    @Override
    public void setSourceSupplyId(int sourceSupplyId) {
        _sourceSupplyId = sourceSupplyId;

        if (_entitySourceOfSupplyRemoteModel != null) {
            try {
                Class<?> clazz = _entitySourceOfSupplyRemoteModel.getClass();

                Method method = clazz.getMethod("setSourceSupplyId", int.class);

                method.invoke(_entitySourceOfSupplyRemoteModel, sourceSupplyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSourceOfSupply() {
        return _sourceOfSupply;
    }

    @Override
    public void setSourceOfSupply(String sourceOfSupply) {
        _sourceOfSupply = sourceOfSupply;

        if (_entitySourceOfSupplyRemoteModel != null) {
            try {
                Class<?> clazz = _entitySourceOfSupplyRemoteModel.getClass();

                Method method = clazz.getMethod("setSourceOfSupply",
                        String.class);

                method.invoke(_entitySourceOfSupplyRemoteModel, sourceOfSupply);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntitySourceOfSupplyRemoteModel() {
        return _entitySourceOfSupplyRemoteModel;
    }

    public void setEntitySourceOfSupplyRemoteModel(
        BaseModel<?> entitySourceOfSupplyRemoteModel) {
        _entitySourceOfSupplyRemoteModel = entitySourceOfSupplyRemoteModel;
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

        Class<?> remoteModelClass = _entitySourceOfSupplyRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entitySourceOfSupplyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntitySourceOfSupplyLocalServiceUtil.addEntitySourceOfSupply(this);
        } else {
            EntitySourceOfSupplyLocalServiceUtil.updateEntitySourceOfSupply(this);
        }
    }

    @Override
    public EntitySourceOfSupply toEscapedModel() {
        return (EntitySourceOfSupply) ProxyUtil.newProxyInstance(EntitySourceOfSupply.class.getClassLoader(),
            new Class[] { EntitySourceOfSupply.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntitySourceOfSupplyClp clone = new EntitySourceOfSupplyClp();

        clone.setSourceSupplyId(getSourceSupplyId());
        clone.setSourceOfSupply(getSourceOfSupply());

        return clone;
    }

    @Override
    public int compareTo(EntitySourceOfSupply entitySourceOfSupply) {
        int primaryKey = entitySourceOfSupply.getPrimaryKey();

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

        if (!(obj instanceof EntitySourceOfSupplyClp)) {
            return false;
        }

        EntitySourceOfSupplyClp entitySourceOfSupply = (EntitySourceOfSupplyClp) obj;

        int primaryKey = entitySourceOfSupply.getPrimaryKey();

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

        sb.append("{sourceSupplyId=");
        sb.append(getSourceSupplyId());
        sb.append(", sourceOfSupply=");
        sb.append(getSourceOfSupply());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntitySourceOfSupply");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>sourceSupplyId</column-name><column-value><![CDATA[");
        sb.append(getSourceSupplyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sourceOfSupply</column-name><column-value><![CDATA[");
        sb.append(getSourceOfSupply());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
