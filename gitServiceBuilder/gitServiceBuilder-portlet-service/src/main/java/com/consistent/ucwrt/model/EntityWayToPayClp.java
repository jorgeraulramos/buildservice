package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityWayToPayLocalServiceUtil;

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


public class EntityWayToPayClp extends BaseModelImpl<EntityWayToPay>
    implements EntityWayToPay {
    private int _wayPayId;
    private String _payName;
    private BaseModel<?> _entityWayToPayRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityWayToPayClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityWayToPay.class;
    }

    @Override
    public String getModelClassName() {
        return EntityWayToPay.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _wayPayId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setWayPayId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _wayPayId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("wayPayId", getWayPayId());
        attributes.put("payName", getPayName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer wayPayId = (Integer) attributes.get("wayPayId");

        if (wayPayId != null) {
            setWayPayId(wayPayId);
        }

        String payName = (String) attributes.get("payName");

        if (payName != null) {
            setPayName(payName);
        }
    }

    @Override
    public int getWayPayId() {
        return _wayPayId;
    }

    @Override
    public void setWayPayId(int wayPayId) {
        _wayPayId = wayPayId;

        if (_entityWayToPayRemoteModel != null) {
            try {
                Class<?> clazz = _entityWayToPayRemoteModel.getClass();

                Method method = clazz.getMethod("setWayPayId", int.class);

                method.invoke(_entityWayToPayRemoteModel, wayPayId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPayName() {
        return _payName;
    }

    @Override
    public void setPayName(String payName) {
        _payName = payName;

        if (_entityWayToPayRemoteModel != null) {
            try {
                Class<?> clazz = _entityWayToPayRemoteModel.getClass();

                Method method = clazz.getMethod("setPayName", String.class);

                method.invoke(_entityWayToPayRemoteModel, payName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityWayToPayRemoteModel() {
        return _entityWayToPayRemoteModel;
    }

    public void setEntityWayToPayRemoteModel(
        BaseModel<?> entityWayToPayRemoteModel) {
        _entityWayToPayRemoteModel = entityWayToPayRemoteModel;
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

        Class<?> remoteModelClass = _entityWayToPayRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityWayToPayRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityWayToPayLocalServiceUtil.addEntityWayToPay(this);
        } else {
            EntityWayToPayLocalServiceUtil.updateEntityWayToPay(this);
        }
    }

    @Override
    public EntityWayToPay toEscapedModel() {
        return (EntityWayToPay) ProxyUtil.newProxyInstance(EntityWayToPay.class.getClassLoader(),
            new Class[] { EntityWayToPay.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityWayToPayClp clone = new EntityWayToPayClp();

        clone.setWayPayId(getWayPayId());
        clone.setPayName(getPayName());

        return clone;
    }

    @Override
    public int compareTo(EntityWayToPay entityWayToPay) {
        int primaryKey = entityWayToPay.getPrimaryKey();

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

        if (!(obj instanceof EntityWayToPayClp)) {
            return false;
        }

        EntityWayToPayClp entityWayToPay = (EntityWayToPayClp) obj;

        int primaryKey = entityWayToPay.getPrimaryKey();

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

        sb.append("{wayPayId=");
        sb.append(getWayPayId());
        sb.append(", payName=");
        sb.append(getPayName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityWayToPay");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>wayPayId</column-name><column-value><![CDATA[");
        sb.append(getWayPayId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>payName</column-name><column-value><![CDATA[");
        sb.append(getPayName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
