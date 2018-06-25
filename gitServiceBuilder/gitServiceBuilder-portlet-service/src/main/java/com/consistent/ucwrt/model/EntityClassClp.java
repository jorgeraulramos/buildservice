package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityClassLocalServiceUtil;

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


public class EntityClassClp extends BaseModelImpl<EntityClass>
    implements EntityClass {
    private int _classId;
    private String _className;
    private BaseModel<?> _entityClassRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityClassClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityClass.class;
    }

    @Override
    public String getModelClassName() {
        return EntityClass.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _classId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setClassId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _classId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("classId", getClassId());
        attributes.put("className", getClassName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }

        String className = (String) attributes.get("className");

        if (className != null) {
            setClassName(className);
        }
    }

    @Override
    public int getClassId() {
        return _classId;
    }

    @Override
    public void setClassId(int classId) {
        _classId = classId;

        if (_entityClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityClassRemoteModel.getClass();

                Method method = clazz.getMethod("setClassId", int.class);

                method.invoke(_entityClassRemoteModel, classId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClassName() {
        return _className;
    }

    @Override
    public void setClassName(String className) {
        _className = className;

        if (_entityClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityClassRemoteModel.getClass();

                Method method = clazz.getMethod("setClassName", String.class);

                method.invoke(_entityClassRemoteModel, className);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityClassRemoteModel() {
        return _entityClassRemoteModel;
    }

    public void setEntityClassRemoteModel(BaseModel<?> entityClassRemoteModel) {
        _entityClassRemoteModel = entityClassRemoteModel;
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

        Class<?> remoteModelClass = _entityClassRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityClassRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityClassLocalServiceUtil.addEntityClass(this);
        } else {
            EntityClassLocalServiceUtil.updateEntityClass(this);
        }
    }

    @Override
    public EntityClass toEscapedModel() {
        return (EntityClass) ProxyUtil.newProxyInstance(EntityClass.class.getClassLoader(),
            new Class[] { EntityClass.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityClassClp clone = new EntityClassClp();

        clone.setClassId(getClassId());
        clone.setClassName(getClassName());

        return clone;
    }

    @Override
    public int compareTo(EntityClass entityClass) {
        int primaryKey = entityClass.getPrimaryKey();

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

        if (!(obj instanceof EntityClassClp)) {
            return false;
        }

        EntityClassClp entityClass = (EntityClassClp) obj;

        int primaryKey = entityClass.getPrimaryKey();

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

        sb.append("{classId=");
        sb.append(getClassId());
        sb.append(", className=");
        sb.append(getClassName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityClass");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>classId</column-name><column-value><![CDATA[");
        sb.append(getClassId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>className</column-name><column-value><![CDATA[");
        sb.append(getClassName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
