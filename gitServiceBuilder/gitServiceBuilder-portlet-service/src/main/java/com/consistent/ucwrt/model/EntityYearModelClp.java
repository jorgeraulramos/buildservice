package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityYearModelLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EntityYearModelClp extends BaseModelImpl<EntityYearModel>
    implements EntityYearModel {
    private int _yearModel;
    private Date _yearModelRegistrationDate;
    private String _yearModelRegisterData;
    private String _yModelResponsibleUser;
    private String _yearModelDescription;
    private BaseModel<?> _entityYearModelRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityYearModelClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityYearModel.class;
    }

    @Override
    public String getModelClassName() {
        return EntityYearModel.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _yearModel;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setYearModel(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _yearModel;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("yearModel", getYearModel());
        attributes.put("yearModelRegistrationDate",
            getYearModelRegistrationDate());
        attributes.put("yearModelRegisterData", getYearModelRegisterData());
        attributes.put("yModelResponsibleUser", getYModelResponsibleUser());
        attributes.put("yearModelDescription", getYearModelDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        Date yearModelRegistrationDate = (Date) attributes.get(
                "yearModelRegistrationDate");

        if (yearModelRegistrationDate != null) {
            setYearModelRegistrationDate(yearModelRegistrationDate);
        }

        String yearModelRegisterData = (String) attributes.get(
                "yearModelRegisterData");

        if (yearModelRegisterData != null) {
            setYearModelRegisterData(yearModelRegisterData);
        }

        String yModelResponsibleUser = (String) attributes.get(
                "yModelResponsibleUser");

        if (yModelResponsibleUser != null) {
            setYModelResponsibleUser(yModelResponsibleUser);
        }

        String yearModelDescription = (String) attributes.get(
                "yearModelDescription");

        if (yearModelDescription != null) {
            setYearModelDescription(yearModelDescription);
        }
    }

    @Override
    public int getYearModel() {
        return _yearModel;
    }

    @Override
    public void setYearModel(int yearModel) {
        _yearModel = yearModel;

        if (_entityYearModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityYearModelRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getYearModelRegistrationDate() {
        return _yearModelRegistrationDate;
    }

    @Override
    public void setYearModelRegistrationDate(Date yearModelRegistrationDate) {
        _yearModelRegistrationDate = yearModelRegistrationDate;

        if (_entityYearModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModelRegistrationDate",
                        Date.class);

                method.invoke(_entityYearModelRemoteModel,
                    yearModelRegistrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getYearModelRegisterData() {
        return _yearModelRegisterData;
    }

    @Override
    public void setYearModelRegisterData(String yearModelRegisterData) {
        _yearModelRegisterData = yearModelRegisterData;

        if (_entityYearModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModelRegisterData",
                        String.class);

                method.invoke(_entityYearModelRemoteModel, yearModelRegisterData);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getYModelResponsibleUser() {
        return _yModelResponsibleUser;
    }

    @Override
    public void setYModelResponsibleUser(String yModelResponsibleUser) {
        _yModelResponsibleUser = yModelResponsibleUser;

        if (_entityYearModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelRemoteModel.getClass();

                Method method = clazz.getMethod("setYModelResponsibleUser",
                        String.class);

                method.invoke(_entityYearModelRemoteModel, yModelResponsibleUser);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getYearModelDescription() {
        return _yearModelDescription;
    }

    @Override
    public void setYearModelDescription(String yearModelDescription) {
        _yearModelDescription = yearModelDescription;

        if (_entityYearModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityYearModelRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModelDescription",
                        String.class);

                method.invoke(_entityYearModelRemoteModel, yearModelDescription);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityYearModelRemoteModel() {
        return _entityYearModelRemoteModel;
    }

    public void setEntityYearModelRemoteModel(
        BaseModel<?> entityYearModelRemoteModel) {
        _entityYearModelRemoteModel = entityYearModelRemoteModel;
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

        Class<?> remoteModelClass = _entityYearModelRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityYearModelRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityYearModelLocalServiceUtil.addEntityYearModel(this);
        } else {
            EntityYearModelLocalServiceUtil.updateEntityYearModel(this);
        }
    }

    @Override
    public EntityYearModel toEscapedModel() {
        return (EntityYearModel) ProxyUtil.newProxyInstance(EntityYearModel.class.getClassLoader(),
            new Class[] { EntityYearModel.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityYearModelClp clone = new EntityYearModelClp();

        clone.setYearModel(getYearModel());
        clone.setYearModelRegistrationDate(getYearModelRegistrationDate());
        clone.setYearModelRegisterData(getYearModelRegisterData());
        clone.setYModelResponsibleUser(getYModelResponsibleUser());
        clone.setYearModelDescription(getYearModelDescription());

        return clone;
    }

    @Override
    public int compareTo(EntityYearModel entityYearModel) {
        int primaryKey = entityYearModel.getPrimaryKey();

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

        if (!(obj instanceof EntityYearModelClp)) {
            return false;
        }

        EntityYearModelClp entityYearModel = (EntityYearModelClp) obj;

        int primaryKey = entityYearModel.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{yearModel=");
        sb.append(getYearModel());
        sb.append(", yearModelRegistrationDate=");
        sb.append(getYearModelRegistrationDate());
        sb.append(", yearModelRegisterData=");
        sb.append(getYearModelRegisterData());
        sb.append(", yModelResponsibleUser=");
        sb.append(getYModelResponsibleUser());
        sb.append(", yearModelDescription=");
        sb.append(getYearModelDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityYearModel");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModelRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getYearModelRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModelRegisterData</column-name><column-value><![CDATA[");
        sb.append(getYearModelRegisterData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yModelResponsibleUser</column-name><column-value><![CDATA[");
        sb.append(getYModelResponsibleUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModelDescription</column-name><column-value><![CDATA[");
        sb.append(getYearModelDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
