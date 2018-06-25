package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityDepartmentLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityDepartmentPK;

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


public class EntityDepartmentClp extends BaseModelImpl<EntityDepartment>
    implements EntityDepartment {
    private String _departmentId;
    private String _departmentName;
    private BaseModel<?> _entityDepartmentRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityDepartmentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityDepartment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityDepartment.class.getName();
    }

    @Override
    public EntityDepartmentPK getPrimaryKey() {
        return new EntityDepartmentPK(_departmentId, _departmentName);
    }

    @Override
    public void setPrimaryKey(EntityDepartmentPK primaryKey) {
        setDepartmentId(primaryKey.departmentId);
        setDepartmentName(primaryKey.departmentName);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityDepartmentPK(_departmentId, _departmentName);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityDepartmentPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("departmentId", getDepartmentId());
        attributes.put("departmentName", getDepartmentName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String departmentId = (String) attributes.get("departmentId");

        if (departmentId != null) {
            setDepartmentId(departmentId);
        }

        String departmentName = (String) attributes.get("departmentName");

        if (departmentName != null) {
            setDepartmentName(departmentName);
        }
    }

    @Override
    public String getDepartmentId() {
        return _departmentId;
    }

    @Override
    public void setDepartmentId(String departmentId) {
        _departmentId = departmentId;

        if (_entityDepartmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityDepartmentRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartmentId", String.class);

                method.invoke(_entityDepartmentRemoteModel, departmentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDepartmentName() {
        return _departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        _departmentName = departmentName;

        if (_entityDepartmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityDepartmentRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartmentName",
                        String.class);

                method.invoke(_entityDepartmentRemoteModel, departmentName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityDepartmentRemoteModel() {
        return _entityDepartmentRemoteModel;
    }

    public void setEntityDepartmentRemoteModel(
        BaseModel<?> entityDepartmentRemoteModel) {
        _entityDepartmentRemoteModel = entityDepartmentRemoteModel;
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

        Class<?> remoteModelClass = _entityDepartmentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityDepartmentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityDepartmentLocalServiceUtil.addEntityDepartment(this);
        } else {
            EntityDepartmentLocalServiceUtil.updateEntityDepartment(this);
        }
    }

    @Override
    public EntityDepartment toEscapedModel() {
        return (EntityDepartment) ProxyUtil.newProxyInstance(EntityDepartment.class.getClassLoader(),
            new Class[] { EntityDepartment.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityDepartmentClp clone = new EntityDepartmentClp();

        clone.setDepartmentId(getDepartmentId());
        clone.setDepartmentName(getDepartmentName());

        return clone;
    }

    @Override
    public int compareTo(EntityDepartment entityDepartment) {
        EntityDepartmentPK primaryKey = entityDepartment.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityDepartmentClp)) {
            return false;
        }

        EntityDepartmentClp entityDepartment = (EntityDepartmentClp) obj;

        EntityDepartmentPK primaryKey = entityDepartment.getPrimaryKey();

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

        sb.append("{departmentId=");
        sb.append(getDepartmentId());
        sb.append(", departmentName=");
        sb.append(getDepartmentName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityDepartment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>departmentId</column-name><column-value><![CDATA[");
        sb.append(getDepartmentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>departmentName</column-name><column-value><![CDATA[");
        sb.append(getDepartmentName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
