package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityYearModelClassLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityYearModelClassPK;

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


public class EntityYearModelClassClp extends BaseModelImpl<EntityYearModelClass>
    implements EntityYearModelClass {
    private int _classId;
    private int _yearModel;
    private int _startKilometer;
    private int _finishKilometers;
    private double _price;
    private BaseModel<?> _entityYearModelClassRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityYearModelClassClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityYearModelClass.class;
    }

    @Override
    public String getModelClassName() {
        return EntityYearModelClass.class.getName();
    }

    @Override
    public EntityYearModelClassPK getPrimaryKey() {
        return new EntityYearModelClassPK(_classId, _yearModel,
            _startKilometer, _finishKilometers);
    }

    @Override
    public void setPrimaryKey(EntityYearModelClassPK primaryKey) {
        setClassId(primaryKey.classId);
        setYearModel(primaryKey.yearModel);
        setStartKilometer(primaryKey.startKilometer);
        setFinishKilometers(primaryKey.finishKilometers);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityYearModelClassPK(_classId, _yearModel,
            _startKilometer, _finishKilometers);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityYearModelClassPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("classId", getClassId());
        attributes.put("yearModel", getYearModel());
        attributes.put("startKilometer", getStartKilometer());
        attributes.put("finishKilometers", getFinishKilometers());
        attributes.put("price", getPrice());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        Integer startKilometer = (Integer) attributes.get("startKilometer");

        if (startKilometer != null) {
            setStartKilometer(startKilometer);
        }

        Integer finishKilometers = (Integer) attributes.get("finishKilometers");

        if (finishKilometers != null) {
            setFinishKilometers(finishKilometers);
        }

        Double price = (Double) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }
    }

    @Override
    public int getClassId() {
        return _classId;
    }

    @Override
    public void setClassId(int classId) {
        _classId = classId;

        if (_entityYearModelClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelClassRemoteModel.getClass();

                Method method = clazz.getMethod("setClassId", int.class);

                method.invoke(_entityYearModelClassRemoteModel, classId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getYearModel() {
        return _yearModel;
    }

    @Override
    public void setYearModel(int yearModel) {
        _yearModel = yearModel;

        if (_entityYearModelClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelClassRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityYearModelClassRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStartKilometer() {
        return _startKilometer;
    }

    @Override
    public void setStartKilometer(int startKilometer) {
        _startKilometer = startKilometer;

        if (_entityYearModelClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelClassRemoteModel.getClass();

                Method method = clazz.getMethod("setStartKilometer", int.class);

                method.invoke(_entityYearModelClassRemoteModel, startKilometer);
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

        if (_entityYearModelClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelClassRemoteModel.getClass();

                Method method = clazz.getMethod("setFinishKilometers", int.class);

                method.invoke(_entityYearModelClassRemoteModel, finishKilometers);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPrice() {
        return _price;
    }

    @Override
    public void setPrice(double price) {
        _price = price;

        if (_entityYearModelClassRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelClassRemoteModel.getClass();

                Method method = clazz.getMethod("setPrice", double.class);

                method.invoke(_entityYearModelClassRemoteModel, price);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityYearModelClassRemoteModel() {
        return _entityYearModelClassRemoteModel;
    }

    public void setEntityYearModelClassRemoteModel(
        BaseModel<?> entityYearModelClassRemoteModel) {
        _entityYearModelClassRemoteModel = entityYearModelClassRemoteModel;
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

        Class<?> remoteModelClass = _entityYearModelClassRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityYearModelClassRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityYearModelClassLocalServiceUtil.addEntityYearModelClass(this);
        } else {
            EntityYearModelClassLocalServiceUtil.updateEntityYearModelClass(this);
        }
    }

    @Override
    public EntityYearModelClass toEscapedModel() {
        return (EntityYearModelClass) ProxyUtil.newProxyInstance(EntityYearModelClass.class.getClassLoader(),
            new Class[] { EntityYearModelClass.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityYearModelClassClp clone = new EntityYearModelClassClp();

        clone.setClassId(getClassId());
        clone.setYearModel(getYearModel());
        clone.setStartKilometer(getStartKilometer());
        clone.setFinishKilometers(getFinishKilometers());
        clone.setPrice(getPrice());

        return clone;
    }

    @Override
    public int compareTo(EntityYearModelClass entityYearModelClass) {
        EntityYearModelClassPK primaryKey = entityYearModelClass.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityYearModelClassClp)) {
            return false;
        }

        EntityYearModelClassClp entityYearModelClass = (EntityYearModelClassClp) obj;

        EntityYearModelClassPK primaryKey = entityYearModelClass.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{classId=");
        sb.append(getClassId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append(", startKilometer=");
        sb.append(getStartKilometer());
        sb.append(", finishKilometers=");
        sb.append(getFinishKilometers());
        sb.append(", price=");
        sb.append(getPrice());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityYearModelClass");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>classId</column-name><column-value><![CDATA[");
        sb.append(getClassId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>startKilometer</column-name><column-value><![CDATA[");
        sb.append(getStartKilometer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>finishKilometers</column-name><column-value><![CDATA[");
        sb.append(getFinishKilometers());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>price</column-name><column-value><![CDATA[");
        sb.append(getPrice());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
