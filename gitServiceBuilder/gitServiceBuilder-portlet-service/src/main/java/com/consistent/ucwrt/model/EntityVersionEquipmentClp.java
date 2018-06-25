package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityVersionEquipmentLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK;

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


public class EntityVersionEquipmentClp extends BaseModelImpl<EntityVersionEquipment>
    implements EntityVersionEquipment {
    private int _equipmentId;
    private int _versionId;
    private int _modelId;
    private String _brandName;
    private int _yearModel;
    private BaseModel<?> _entityVersionEquipmentRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityVersionEquipmentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityVersionEquipment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityVersionEquipment.class.getName();
    }

    @Override
    public EntityVersionEquipmentPK getPrimaryKey() {
        return new EntityVersionEquipmentPK(_equipmentId, _versionId, _modelId,
            _brandName, _yearModel);
    }

    @Override
    public void setPrimaryKey(EntityVersionEquipmentPK primaryKey) {
        setEquipmentId(primaryKey.equipmentId);
        setVersionId(primaryKey.versionId);
        setModelId(primaryKey.modelId);
        setBrandName(primaryKey.brandName);
        setYearModel(primaryKey.yearModel);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityVersionEquipmentPK(_equipmentId, _versionId, _modelId,
            _brandName, _yearModel);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityVersionEquipmentPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("equipmentId", getEquipmentId());
        attributes.put("versionId", getVersionId());
        attributes.put("modelId", getModelId());
        attributes.put("brandName", getBrandName());
        attributes.put("yearModel", getYearModel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer equipmentId = (Integer) attributes.get("equipmentId");

        if (equipmentId != null) {
            setEquipmentId(equipmentId);
        }

        Integer versionId = (Integer) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        String brandName = (String) attributes.get("brandName");

        if (brandName != null) {
            setBrandName(brandName);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }
    }

    @Override
    public int getEquipmentId() {
        return _equipmentId;
    }

    @Override
    public void setEquipmentId(int equipmentId) {
        _equipmentId = equipmentId;

        if (_entityVersionEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setEquipmentId", int.class);

                method.invoke(_entityVersionEquipmentRemoteModel, equipmentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getVersionId() {
        return _versionId;
    }

    @Override
    public void setVersionId(int versionId) {
        _versionId = versionId;

        if (_entityVersionEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionId", int.class);

                method.invoke(_entityVersionEquipmentRemoteModel, versionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getModelId() {
        return _modelId;
    }

    @Override
    public void setModelId(int modelId) {
        _modelId = modelId;

        if (_entityVersionEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setModelId", int.class);

                method.invoke(_entityVersionEquipmentRemoteModel, modelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBrandName() {
        return _brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        _brandName = brandName;

        if (_entityVersionEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandName", String.class);

                method.invoke(_entityVersionEquipmentRemoteModel, brandName);
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

        if (_entityVersionEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityVersionEquipmentRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityVersionEquipmentRemoteModel() {
        return _entityVersionEquipmentRemoteModel;
    }

    public void setEntityVersionEquipmentRemoteModel(
        BaseModel<?> entityVersionEquipmentRemoteModel) {
        _entityVersionEquipmentRemoteModel = entityVersionEquipmentRemoteModel;
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

        Class<?> remoteModelClass = _entityVersionEquipmentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityVersionEquipmentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityVersionEquipmentLocalServiceUtil.addEntityVersionEquipment(this);
        } else {
            EntityVersionEquipmentLocalServiceUtil.updateEntityVersionEquipment(this);
        }
    }

    @Override
    public EntityVersionEquipment toEscapedModel() {
        return (EntityVersionEquipment) ProxyUtil.newProxyInstance(EntityVersionEquipment.class.getClassLoader(),
            new Class[] { EntityVersionEquipment.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityVersionEquipmentClp clone = new EntityVersionEquipmentClp();

        clone.setEquipmentId(getEquipmentId());
        clone.setVersionId(getVersionId());
        clone.setModelId(getModelId());
        clone.setBrandName(getBrandName());
        clone.setYearModel(getYearModel());

        return clone;
    }

    @Override
    public int compareTo(EntityVersionEquipment entityVersionEquipment) {
        EntityVersionEquipmentPK primaryKey = entityVersionEquipment.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionEquipmentClp)) {
            return false;
        }

        EntityVersionEquipmentClp entityVersionEquipment = (EntityVersionEquipmentClp) obj;

        EntityVersionEquipmentPK primaryKey = entityVersionEquipment.getPrimaryKey();

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

        sb.append("{equipmentId=");
        sb.append(getEquipmentId());
        sb.append(", versionId=");
        sb.append(getVersionId());
        sb.append(", modelId=");
        sb.append(getModelId());
        sb.append(", brandName=");
        sb.append(getBrandName());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityVersionEquipment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>equipmentId</column-name><column-value><![CDATA[");
        sb.append(getEquipmentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionId</column-name><column-value><![CDATA[");
        sb.append(getVersionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelId</column-name><column-value><![CDATA[");
        sb.append(getModelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandName</column-name><column-value><![CDATA[");
        sb.append(getBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
