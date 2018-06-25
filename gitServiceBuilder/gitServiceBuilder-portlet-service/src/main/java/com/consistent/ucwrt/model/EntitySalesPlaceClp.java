package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntitySalesPlaceLocalServiceUtil;

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


public class EntitySalesPlaceClp extends BaseModelImpl<EntitySalesPlace>
    implements EntitySalesPlace {
    private int _salesPlaceId;
    private String _salePlaceName;
    private BaseModel<?> _entitySalesPlaceRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntitySalesPlaceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySalesPlace.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySalesPlace.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _salesPlaceId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSalesPlaceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _salesPlaceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("salesPlaceId", getSalesPlaceId());
        attributes.put("salePlaceName", getSalePlaceName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer salesPlaceId = (Integer) attributes.get("salesPlaceId");

        if (salesPlaceId != null) {
            setSalesPlaceId(salesPlaceId);
        }

        String salePlaceName = (String) attributes.get("salePlaceName");

        if (salePlaceName != null) {
            setSalePlaceName(salePlaceName);
        }
    }

    @Override
    public int getSalesPlaceId() {
        return _salesPlaceId;
    }

    @Override
    public void setSalesPlaceId(int salesPlaceId) {
        _salesPlaceId = salesPlaceId;

        if (_entitySalesPlaceRemoteModel != null) {
            try {
                Class<?> clazz = _entitySalesPlaceRemoteModel.getClass();

                Method method = clazz.getMethod("setSalesPlaceId", int.class);

                method.invoke(_entitySalesPlaceRemoteModel, salesPlaceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSalePlaceName() {
        return _salePlaceName;
    }

    @Override
    public void setSalePlaceName(String salePlaceName) {
        _salePlaceName = salePlaceName;

        if (_entitySalesPlaceRemoteModel != null) {
            try {
                Class<?> clazz = _entitySalesPlaceRemoteModel.getClass();

                Method method = clazz.getMethod("setSalePlaceName", String.class);

                method.invoke(_entitySalesPlaceRemoteModel, salePlaceName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntitySalesPlaceRemoteModel() {
        return _entitySalesPlaceRemoteModel;
    }

    public void setEntitySalesPlaceRemoteModel(
        BaseModel<?> entitySalesPlaceRemoteModel) {
        _entitySalesPlaceRemoteModel = entitySalesPlaceRemoteModel;
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

        Class<?> remoteModelClass = _entitySalesPlaceRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entitySalesPlaceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntitySalesPlaceLocalServiceUtil.addEntitySalesPlace(this);
        } else {
            EntitySalesPlaceLocalServiceUtil.updateEntitySalesPlace(this);
        }
    }

    @Override
    public EntitySalesPlace toEscapedModel() {
        return (EntitySalesPlace) ProxyUtil.newProxyInstance(EntitySalesPlace.class.getClassLoader(),
            new Class[] { EntitySalesPlace.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntitySalesPlaceClp clone = new EntitySalesPlaceClp();

        clone.setSalesPlaceId(getSalesPlaceId());
        clone.setSalePlaceName(getSalePlaceName());

        return clone;
    }

    @Override
    public int compareTo(EntitySalesPlace entitySalesPlace) {
        int primaryKey = entitySalesPlace.getPrimaryKey();

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

        if (!(obj instanceof EntitySalesPlaceClp)) {
            return false;
        }

        EntitySalesPlaceClp entitySalesPlace = (EntitySalesPlaceClp) obj;

        int primaryKey = entitySalesPlace.getPrimaryKey();

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

        sb.append("{salesPlaceId=");
        sb.append(getSalesPlaceId());
        sb.append(", salePlaceName=");
        sb.append(getSalePlaceName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntitySalesPlace");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>salesPlaceId</column-name><column-value><![CDATA[");
        sb.append(getSalesPlaceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salePlaceName</column-name><column-value><![CDATA[");
        sb.append(getSalePlaceName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
