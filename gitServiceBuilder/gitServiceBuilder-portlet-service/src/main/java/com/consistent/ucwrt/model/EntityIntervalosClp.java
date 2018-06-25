package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityIntervalosLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityIntervalosPK;

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


public class EntityIntervalosClp extends BaseModelImpl<EntityIntervalos>
    implements EntityIntervalos {
    private int _startKilometer;
    private int _finishKilometers;
    private BaseModel<?> _entityIntervalosRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityIntervalosClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityIntervalos.class;
    }

    @Override
    public String getModelClassName() {
        return EntityIntervalos.class.getName();
    }

    @Override
    public EntityIntervalosPK getPrimaryKey() {
        return new EntityIntervalosPK(_startKilometer, _finishKilometers);
    }

    @Override
    public void setPrimaryKey(EntityIntervalosPK primaryKey) {
        setStartKilometer(primaryKey.startKilometer);
        setFinishKilometers(primaryKey.finishKilometers);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityIntervalosPK(_startKilometer, _finishKilometers);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityIntervalosPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("startKilometer", getStartKilometer());
        attributes.put("finishKilometers", getFinishKilometers());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer startKilometer = (Integer) attributes.get("startKilometer");

        if (startKilometer != null) {
            setStartKilometer(startKilometer);
        }

        Integer finishKilometers = (Integer) attributes.get("finishKilometers");

        if (finishKilometers != null) {
            setFinishKilometers(finishKilometers);
        }
    }

    @Override
    public int getStartKilometer() {
        return _startKilometer;
    }

    @Override
    public void setStartKilometer(int startKilometer) {
        _startKilometer = startKilometer;

        if (_entityIntervalosRemoteModel != null) {
            try {
                Class<?> clazz = _entityIntervalosRemoteModel.getClass();

                Method method = clazz.getMethod("setStartKilometer", int.class);

                method.invoke(_entityIntervalosRemoteModel, startKilometer);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFinishKilometers() {
        return _finishKilometers;
    }

    @Override
    public void setFinishKilometers(int finishKilometers) {
        _finishKilometers = finishKilometers;

        if (_entityIntervalosRemoteModel != null) {
            try {
                Class<?> clazz = _entityIntervalosRemoteModel.getClass();

                Method method = clazz.getMethod("setFinishKilometers", int.class);

                method.invoke(_entityIntervalosRemoteModel, finishKilometers);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityIntervalosRemoteModel() {
        return _entityIntervalosRemoteModel;
    }

    public void setEntityIntervalosRemoteModel(
        BaseModel<?> entityIntervalosRemoteModel) {
        _entityIntervalosRemoteModel = entityIntervalosRemoteModel;
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

        Class<?> remoteModelClass = _entityIntervalosRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityIntervalosRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityIntervalosLocalServiceUtil.addEntityIntervalos(this);
        } else {
            EntityIntervalosLocalServiceUtil.updateEntityIntervalos(this);
        }
    }

    @Override
    public EntityIntervalos toEscapedModel() {
        return (EntityIntervalos) ProxyUtil.newProxyInstance(EntityIntervalos.class.getClassLoader(),
            new Class[] { EntityIntervalos.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityIntervalosClp clone = new EntityIntervalosClp();

        clone.setStartKilometer(getStartKilometer());
        clone.setFinishKilometers(getFinishKilometers());

        return clone;
    }

    @Override
    public int compareTo(EntityIntervalos entityIntervalos) {
        EntityIntervalosPK primaryKey = entityIntervalos.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityIntervalosClp)) {
            return false;
        }

        EntityIntervalosClp entityIntervalos = (EntityIntervalosClp) obj;

        EntityIntervalosPK primaryKey = entityIntervalos.getPrimaryKey();

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

        sb.append("{startKilometer=");
        sb.append(getStartKilometer());
        sb.append(", finishKilometers=");
        sb.append(getFinishKilometers());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityIntervalos");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>startKilometer</column-name><column-value><![CDATA[");
        sb.append(getStartKilometer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>finishKilometers</column-name><column-value><![CDATA[");
        sb.append(getFinishKilometers());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
