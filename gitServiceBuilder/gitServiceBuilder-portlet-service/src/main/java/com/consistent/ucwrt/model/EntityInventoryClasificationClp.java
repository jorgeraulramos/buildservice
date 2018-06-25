package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityInventoryClasificationLocalServiceUtil;

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


public class EntityInventoryClasificationClp extends BaseModelImpl<EntityInventoryClasification>
    implements EntityInventoryClasification {
    private int _inventoryClasificationId;
    private String _inventoryClasification;
    private BaseModel<?> _entityInventoryClasificationRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityInventoryClasificationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityInventoryClasification.class;
    }

    @Override
    public String getModelClassName() {
        return EntityInventoryClasification.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _inventoryClasificationId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setInventoryClasificationId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _inventoryClasificationId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("inventoryClasificationId", getInventoryClasificationId());
        attributes.put("inventoryClasification", getInventoryClasification());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer inventoryClasificationId = (Integer) attributes.get(
                "inventoryClasificationId");

        if (inventoryClasificationId != null) {
            setInventoryClasificationId(inventoryClasificationId);
        }

        String inventoryClasification = (String) attributes.get(
                "inventoryClasification");

        if (inventoryClasification != null) {
            setInventoryClasification(inventoryClasification);
        }
    }

    @Override
    public int getInventoryClasificationId() {
        return _inventoryClasificationId;
    }

    @Override
    public void setInventoryClasificationId(int inventoryClasificationId) {
        _inventoryClasificationId = inventoryClasificationId;

        if (_entityInventoryClasificationRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryClasificationRemoteModel.getClass();

                Method method = clazz.getMethod("setInventoryClasificationId",
                        int.class);

                method.invoke(_entityInventoryClasificationRemoteModel,
                    inventoryClasificationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInventoryClasification() {
        return _inventoryClasification;
    }

    @Override
    public void setInventoryClasification(String inventoryClasification) {
        _inventoryClasification = inventoryClasification;

        if (_entityInventoryClasificationRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryClasificationRemoteModel.getClass();

                Method method = clazz.getMethod("setInventoryClasification",
                        String.class);

                method.invoke(_entityInventoryClasificationRemoteModel,
                    inventoryClasification);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityInventoryClasificationRemoteModel() {
        return _entityInventoryClasificationRemoteModel;
    }

    public void setEntityInventoryClasificationRemoteModel(
        BaseModel<?> entityInventoryClasificationRemoteModel) {
        _entityInventoryClasificationRemoteModel = entityInventoryClasificationRemoteModel;
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

        Class<?> remoteModelClass = _entityInventoryClasificationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityInventoryClasificationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityInventoryClasificationLocalServiceUtil.addEntityInventoryClasification(this);
        } else {
            EntityInventoryClasificationLocalServiceUtil.updateEntityInventoryClasification(this);
        }
    }

    @Override
    public EntityInventoryClasification toEscapedModel() {
        return (EntityInventoryClasification) ProxyUtil.newProxyInstance(EntityInventoryClasification.class.getClassLoader(),
            new Class[] { EntityInventoryClasification.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityInventoryClasificationClp clone = new EntityInventoryClasificationClp();

        clone.setInventoryClasificationId(getInventoryClasificationId());
        clone.setInventoryClasification(getInventoryClasification());

        return clone;
    }

    @Override
    public int compareTo(
        EntityInventoryClasification entityInventoryClasification) {
        int primaryKey = entityInventoryClasification.getPrimaryKey();

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

        if (!(obj instanceof EntityInventoryClasificationClp)) {
            return false;
        }

        EntityInventoryClasificationClp entityInventoryClasification = (EntityInventoryClasificationClp) obj;

        int primaryKey = entityInventoryClasification.getPrimaryKey();

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

        sb.append("{inventoryClasificationId=");
        sb.append(getInventoryClasificationId());
        sb.append(", inventoryClasification=");
        sb.append(getInventoryClasification());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityInventoryClasification");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>inventoryClasificationId</column-name><column-value><![CDATA[");
        sb.append(getInventoryClasificationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inventoryClasification</column-name><column-value><![CDATA[");
        sb.append(getInventoryClasification());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
