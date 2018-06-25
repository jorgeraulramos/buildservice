package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityEmploymentLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityEmploymentPK;

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


public class EntityEmploymentClp extends BaseModelImpl<EntityEmployment>
    implements EntityEmployment {
    private String _employmentId;
    private String _employmentName;
    private BaseModel<?> _entityEmploymentRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityEmploymentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEmployment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEmployment.class.getName();
    }

    @Override
    public EntityEmploymentPK getPrimaryKey() {
        return new EntityEmploymentPK(_employmentId, _employmentName);
    }

    @Override
    public void setPrimaryKey(EntityEmploymentPK primaryKey) {
        setEmploymentId(primaryKey.employmentId);
        setEmploymentName(primaryKey.employmentName);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityEmploymentPK(_employmentId, _employmentName);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityEmploymentPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employmentId", getEmploymentId());
        attributes.put("employmentName", getEmploymentName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String employmentId = (String) attributes.get("employmentId");

        if (employmentId != null) {
            setEmploymentId(employmentId);
        }

        String employmentName = (String) attributes.get("employmentName");

        if (employmentName != null) {
            setEmploymentName(employmentName);
        }
    }

    @Override
    public String getEmploymentId() {
        return _employmentId;
    }

    @Override
    public void setEmploymentId(String employmentId) {
        _employmentId = employmentId;

        if (_entityEmploymentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmploymentRemoteModel.getClass();

                Method method = clazz.getMethod("setEmploymentId", String.class);

                method.invoke(_entityEmploymentRemoteModel, employmentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmploymentName() {
        return _employmentName;
    }

    @Override
    public void setEmploymentName(String employmentName) {
        _employmentName = employmentName;

        if (_entityEmploymentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmploymentRemoteModel.getClass();

                Method method = clazz.getMethod("setEmploymentName",
                        String.class);

                method.invoke(_entityEmploymentRemoteModel, employmentName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityEmploymentRemoteModel() {
        return _entityEmploymentRemoteModel;
    }

    public void setEntityEmploymentRemoteModel(
        BaseModel<?> entityEmploymentRemoteModel) {
        _entityEmploymentRemoteModel = entityEmploymentRemoteModel;
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

        Class<?> remoteModelClass = _entityEmploymentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityEmploymentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityEmploymentLocalServiceUtil.addEntityEmployment(this);
        } else {
            EntityEmploymentLocalServiceUtil.updateEntityEmployment(this);
        }
    }

    @Override
    public EntityEmployment toEscapedModel() {
        return (EntityEmployment) ProxyUtil.newProxyInstance(EntityEmployment.class.getClassLoader(),
            new Class[] { EntityEmployment.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityEmploymentClp clone = new EntityEmploymentClp();

        clone.setEmploymentId(getEmploymentId());
        clone.setEmploymentName(getEmploymentName());

        return clone;
    }

    @Override
    public int compareTo(EntityEmployment entityEmployment) {
        EntityEmploymentPK primaryKey = entityEmployment.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEmploymentClp)) {
            return false;
        }

        EntityEmploymentClp entityEmployment = (EntityEmploymentClp) obj;

        EntityEmploymentPK primaryKey = entityEmployment.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{employmentId=");
        sb.append(getEmploymentId());
        sb.append(", employmentName=");
        sb.append(getEmploymentName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityEmployment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employmentId</column-name><column-value><![CDATA[");
        sb.append(getEmploymentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employmentName</column-name><column-value><![CDATA[");
        sb.append(getEmploymentName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
