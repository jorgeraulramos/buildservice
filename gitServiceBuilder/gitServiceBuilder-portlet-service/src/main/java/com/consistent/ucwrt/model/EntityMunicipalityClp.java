package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityMunicipalityLocalServiceUtil;

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


public class EntityMunicipalityClp extends BaseModelImpl<EntityMunicipality>
    implements EntityMunicipality {
    private int _municipalId;
    private String _municipalName;
    private int _stateId;
    private BaseModel<?> _entityMunicipalityRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityMunicipalityClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityMunicipality.class;
    }

    @Override
    public String getModelClassName() {
        return EntityMunicipality.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _municipalId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setMunicipalId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _municipalId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("municipalId", getMunicipalId());
        attributes.put("municipalName", getMunicipalName());
        attributes.put("stateId", getStateId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }

        String municipalName = (String) attributes.get("municipalName");

        if (municipalName != null) {
            setMunicipalName(municipalName);
        }

        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }
    }

    @Override
    public int getMunicipalId() {
        return _municipalId;
    }

    @Override
    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;

        if (_entityMunicipalityRemoteModel != null) {
            try {
                Class<?> clazz = _entityMunicipalityRemoteModel.getClass();

                Method method = clazz.getMethod("setMunicipalId", int.class);

                method.invoke(_entityMunicipalityRemoteModel, municipalId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMunicipalName() {
        return _municipalName;
    }

    @Override
    public void setMunicipalName(String municipalName) {
        _municipalName = municipalName;

        if (_entityMunicipalityRemoteModel != null) {
            try {
                Class<?> clazz = _entityMunicipalityRemoteModel.getClass();

                Method method = clazz.getMethod("setMunicipalName", String.class);

                method.invoke(_entityMunicipalityRemoteModel, municipalName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStateId() {
        return _stateId;
    }

    @Override
    public void setStateId(int stateId) {
        _stateId = stateId;

        if (_entityMunicipalityRemoteModel != null) {
            try {
                Class<?> clazz = _entityMunicipalityRemoteModel.getClass();

                Method method = clazz.getMethod("setStateId", int.class);

                method.invoke(_entityMunicipalityRemoteModel, stateId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityMunicipalityRemoteModel() {
        return _entityMunicipalityRemoteModel;
    }

    public void setEntityMunicipalityRemoteModel(
        BaseModel<?> entityMunicipalityRemoteModel) {
        _entityMunicipalityRemoteModel = entityMunicipalityRemoteModel;
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

        Class<?> remoteModelClass = _entityMunicipalityRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityMunicipalityRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityMunicipalityLocalServiceUtil.addEntityMunicipality(this);
        } else {
            EntityMunicipalityLocalServiceUtil.updateEntityMunicipality(this);
        }
    }

    @Override
    public EntityMunicipality toEscapedModel() {
        return (EntityMunicipality) ProxyUtil.newProxyInstance(EntityMunicipality.class.getClassLoader(),
            new Class[] { EntityMunicipality.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityMunicipalityClp clone = new EntityMunicipalityClp();

        clone.setMunicipalId(getMunicipalId());
        clone.setMunicipalName(getMunicipalName());
        clone.setStateId(getStateId());

        return clone;
    }

    @Override
    public int compareTo(EntityMunicipality entityMunicipality) {
        int primaryKey = entityMunicipality.getPrimaryKey();

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

        if (!(obj instanceof EntityMunicipalityClp)) {
            return false;
        }

        EntityMunicipalityClp entityMunicipality = (EntityMunicipalityClp) obj;

        int primaryKey = entityMunicipality.getPrimaryKey();

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

        sb.append("{municipalId=");
        sb.append(getMunicipalId());
        sb.append(", municipalName=");
        sb.append(getMunicipalName());
        sb.append(", stateId=");
        sb.append(getStateId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityMunicipality");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>municipalId</column-name><column-value><![CDATA[");
        sb.append(getMunicipalId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>municipalName</column-name><column-value><![CDATA[");
        sb.append(getMunicipalName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stateId</column-name><column-value><![CDATA[");
        sb.append(getStateId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
