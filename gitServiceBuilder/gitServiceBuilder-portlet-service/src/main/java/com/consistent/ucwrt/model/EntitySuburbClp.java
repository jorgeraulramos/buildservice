package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntitySuburbLocalServiceUtil;

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


public class EntitySuburbClp extends BaseModelImpl<EntitySuburb>
    implements EntitySuburb {
    private int _suburbId;
    private String _suburbName;
    private String _postalCode;
    private int _municipalId;
    private BaseModel<?> _entitySuburbRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntitySuburbClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySuburb.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySuburb.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _suburbId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSuburbId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _suburbId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("suburbId", getSuburbId());
        attributes.put("suburbName", getSuburbName());
        attributes.put("postalCode", getPostalCode());
        attributes.put("municipalId", getMunicipalId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer suburbId = (Integer) attributes.get("suburbId");

        if (suburbId != null) {
            setSuburbId(suburbId);
        }

        String suburbName = (String) attributes.get("suburbName");

        if (suburbName != null) {
            setSuburbName(suburbName);
        }

        String postalCode = (String) attributes.get("postalCode");

        if (postalCode != null) {
            setPostalCode(postalCode);
        }

        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }
    }

    @Override
    public int getSuburbId() {
        return _suburbId;
    }

    @Override
    public void setSuburbId(int suburbId) {
        _suburbId = suburbId;

        if (_entitySuburbRemoteModel != null) {
            try {
                Class<?> clazz = _entitySuburbRemoteModel.getClass();

                Method method = clazz.getMethod("setSuburbId", int.class);

                method.invoke(_entitySuburbRemoteModel, suburbId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSuburbName() {
        return _suburbName;
    }

    @Override
    public void setSuburbName(String suburbName) {
        _suburbName = suburbName;

        if (_entitySuburbRemoteModel != null) {
            try {
                Class<?> clazz = _entitySuburbRemoteModel.getClass();

                Method method = clazz.getMethod("setSuburbName", String.class);

                method.invoke(_entitySuburbRemoteModel, suburbName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPostalCode() {
        return _postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) {
        _postalCode = postalCode;

        if (_entitySuburbRemoteModel != null) {
            try {
                Class<?> clazz = _entitySuburbRemoteModel.getClass();

                Method method = clazz.getMethod("setPostalCode", String.class);

                method.invoke(_entitySuburbRemoteModel, postalCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMunicipalId() {
        return _municipalId;
    }

    @Override
    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;

        if (_entitySuburbRemoteModel != null) {
            try {
                Class<?> clazz = _entitySuburbRemoteModel.getClass();

                Method method = clazz.getMethod("setMunicipalId", int.class);

                method.invoke(_entitySuburbRemoteModel, municipalId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntitySuburbRemoteModel() {
        return _entitySuburbRemoteModel;
    }

    public void setEntitySuburbRemoteModel(BaseModel<?> entitySuburbRemoteModel) {
        _entitySuburbRemoteModel = entitySuburbRemoteModel;
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

        Class<?> remoteModelClass = _entitySuburbRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entitySuburbRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntitySuburbLocalServiceUtil.addEntitySuburb(this);
        } else {
            EntitySuburbLocalServiceUtil.updateEntitySuburb(this);
        }
    }

    @Override
    public EntitySuburb toEscapedModel() {
        return (EntitySuburb) ProxyUtil.newProxyInstance(EntitySuburb.class.getClassLoader(),
            new Class[] { EntitySuburb.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntitySuburbClp clone = new EntitySuburbClp();

        clone.setSuburbId(getSuburbId());
        clone.setSuburbName(getSuburbName());
        clone.setPostalCode(getPostalCode());
        clone.setMunicipalId(getMunicipalId());

        return clone;
    }

    @Override
    public int compareTo(EntitySuburb entitySuburb) {
        int primaryKey = entitySuburb.getPrimaryKey();

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

        if (!(obj instanceof EntitySuburbClp)) {
            return false;
        }

        EntitySuburbClp entitySuburb = (EntitySuburbClp) obj;

        int primaryKey = entitySuburb.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{suburbId=");
        sb.append(getSuburbId());
        sb.append(", suburbName=");
        sb.append(getSuburbName());
        sb.append(", postalCode=");
        sb.append(getPostalCode());
        sb.append(", municipalId=");
        sb.append(getMunicipalId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntitySuburb");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>suburbId</column-name><column-value><![CDATA[");
        sb.append(getSuburbId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>suburbName</column-name><column-value><![CDATA[");
        sb.append(getSuburbName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>postalCode</column-name><column-value><![CDATA[");
        sb.append(getPostalCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>municipalId</column-name><column-value><![CDATA[");
        sb.append(getMunicipalId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
