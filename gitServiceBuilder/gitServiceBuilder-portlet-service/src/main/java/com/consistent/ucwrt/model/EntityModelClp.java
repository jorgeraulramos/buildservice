package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityModelLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityModelPK;

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


public class EntityModelClp extends BaseModelImpl<EntityModel>
    implements EntityModel {
    private int _modelId;
    private int _brandId;
    private int _yearModel;
    private String _modelName;
    private String _modelDescription;
    private Date _modelRegistrationDate;
    private String _modelRegisterData;
    private String _modelResponsibleUser;
    private BaseModel<?> _entityModelRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityModelClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityModel.class;
    }

    @Override
    public String getModelClassName() {
        return EntityModel.class.getName();
    }

    @Override
    public EntityModelPK getPrimaryKey() {
        return new EntityModelPK(_modelId, _brandId, _yearModel);
    }

    @Override
    public void setPrimaryKey(EntityModelPK primaryKey) {
        setModelId(primaryKey.modelId);
        setBrandId(primaryKey.brandId);
        setYearModel(primaryKey.yearModel);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityModelPK(_modelId, _brandId, _yearModel);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityModelPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());
        attributes.put("modelName", getModelName());
        attributes.put("modelDescription", getModelDescription());
        attributes.put("modelRegistrationDate", getModelRegistrationDate());
        attributes.put("modelRegisterData", getModelRegisterData());
        attributes.put("modelResponsibleUser", getModelResponsibleUser());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String modelDescription = (String) attributes.get("modelDescription");

        if (modelDescription != null) {
            setModelDescription(modelDescription);
        }

        Date modelRegistrationDate = (Date) attributes.get(
                "modelRegistrationDate");

        if (modelRegistrationDate != null) {
            setModelRegistrationDate(modelRegistrationDate);
        }

        String modelRegisterData = (String) attributes.get("modelRegisterData");

        if (modelRegisterData != null) {
            setModelRegisterData(modelRegisterData);
        }

        String modelResponsibleUser = (String) attributes.get(
                "modelResponsibleUser");

        if (modelResponsibleUser != null) {
            setModelResponsibleUser(modelResponsibleUser);
        }
    }

    @Override
    public int getModelId() {
        return _modelId;
    }

    @Override
    public void setModelId(int modelId) {
        _modelId = modelId;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setModelId", int.class);

                method.invoke(_entityModelRemoteModel, modelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBrandId() {
        return _brandId;
    }

    @Override
    public void setBrandId(int brandId) {
        _brandId = brandId;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandId", int.class);

                method.invoke(_entityModelRemoteModel, brandId);
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

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityModelRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModelName() {
        return _modelName;
    }

    @Override
    public void setModelName(String modelName) {
        _modelName = modelName;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setModelName", String.class);

                method.invoke(_entityModelRemoteModel, modelName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModelDescription() {
        return _modelDescription;
    }

    @Override
    public void setModelDescription(String modelDescription) {
        _modelDescription = modelDescription;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setModelDescription",
                        String.class);

                method.invoke(_entityModelRemoteModel, modelDescription);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModelRegistrationDate() {
        return _modelRegistrationDate;
    }

    @Override
    public void setModelRegistrationDate(Date modelRegistrationDate) {
        _modelRegistrationDate = modelRegistrationDate;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setModelRegistrationDate",
                        Date.class);

                method.invoke(_entityModelRemoteModel, modelRegistrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModelRegisterData() {
        return _modelRegisterData;
    }

    @Override
    public void setModelRegisterData(String modelRegisterData) {
        _modelRegisterData = modelRegisterData;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setModelRegisterData",
                        String.class);

                method.invoke(_entityModelRemoteModel, modelRegisterData);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModelResponsibleUser() {
        return _modelResponsibleUser;
    }

    @Override
    public void setModelResponsibleUser(String modelResponsibleUser) {
        _modelResponsibleUser = modelResponsibleUser;

        if (_entityModelRemoteModel != null) {
            try {
                Class<?> clazz = _entityModelRemoteModel.getClass();

                Method method = clazz.getMethod("setModelResponsibleUser",
                        String.class);

                method.invoke(_entityModelRemoteModel, modelResponsibleUser);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityModelRemoteModel() {
        return _entityModelRemoteModel;
    }

    public void setEntityModelRemoteModel(BaseModel<?> entityModelRemoteModel) {
        _entityModelRemoteModel = entityModelRemoteModel;
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

        Class<?> remoteModelClass = _entityModelRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityModelRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityModelLocalServiceUtil.addEntityModel(this);
        } else {
            EntityModelLocalServiceUtil.updateEntityModel(this);
        }
    }

    @Override
    public EntityModel toEscapedModel() {
        return (EntityModel) ProxyUtil.newProxyInstance(EntityModel.class.getClassLoader(),
            new Class[] { EntityModel.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityModelClp clone = new EntityModelClp();

        clone.setModelId(getModelId());
        clone.setBrandId(getBrandId());
        clone.setYearModel(getYearModel());
        clone.setModelName(getModelName());
        clone.setModelDescription(getModelDescription());
        clone.setModelRegistrationDate(getModelRegistrationDate());
        clone.setModelRegisterData(getModelRegisterData());
        clone.setModelResponsibleUser(getModelResponsibleUser());

        return clone;
    }

    @Override
    public int compareTo(EntityModel entityModel) {
        EntityModelPK primaryKey = entityModel.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityModelClp)) {
            return false;
        }

        EntityModelClp entityModel = (EntityModelClp) obj;

        EntityModelPK primaryKey = entityModel.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{modelId=");
        sb.append(getModelId());
        sb.append(", brandId=");
        sb.append(getBrandId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append(", modelName=");
        sb.append(getModelName());
        sb.append(", modelDescription=");
        sb.append(getModelDescription());
        sb.append(", modelRegistrationDate=");
        sb.append(getModelRegistrationDate());
        sb.append(", modelRegisterData=");
        sb.append(getModelRegisterData());
        sb.append(", modelResponsibleUser=");
        sb.append(getModelResponsibleUser());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityModel");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>modelId</column-name><column-value><![CDATA[");
        sb.append(getModelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandId</column-name><column-value><![CDATA[");
        sb.append(getBrandId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelName</column-name><column-value><![CDATA[");
        sb.append(getModelName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelDescription</column-name><column-value><![CDATA[");
        sb.append(getModelDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getModelRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelRegisterData</column-name><column-value><![CDATA[");
        sb.append(getModelRegisterData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelResponsibleUser</column-name><column-value><![CDATA[");
        sb.append(getModelResponsibleUser());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
