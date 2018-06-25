package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityEquipmentLocalServiceUtil;

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


public class EntityEquipmentClp extends BaseModelImpl<EntityEquipment>
    implements EntityEquipment {
    private int _equipmentId;
    private String _equipmentDescription;
    private double _equipmentPurchasePrice;
    private double _equipmentPurchasePriceDll;
    private double _equipmentSalePrice;
    private String _status;
    private int _modelId;
    private int _brandId;
    private int _yearModel;
    private BaseModel<?> _entityEquipmentRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityEquipmentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEquipment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEquipment.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _equipmentId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setEquipmentId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _equipmentId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("equipmentId", getEquipmentId());
        attributes.put("equipmentDescription", getEquipmentDescription());
        attributes.put("equipmentPurchasePrice", getEquipmentPurchasePrice());
        attributes.put("equipmentPurchasePriceDll",
            getEquipmentPurchasePriceDll());
        attributes.put("equipmentSalePrice", getEquipmentSalePrice());
        attributes.put("status", getStatus());
        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer equipmentId = (Integer) attributes.get("equipmentId");

        if (equipmentId != null) {
            setEquipmentId(equipmentId);
        }

        String equipmentDescription = (String) attributes.get(
                "equipmentDescription");

        if (equipmentDescription != null) {
            setEquipmentDescription(equipmentDescription);
        }

        Double equipmentPurchasePrice = (Double) attributes.get(
                "equipmentPurchasePrice");

        if (equipmentPurchasePrice != null) {
            setEquipmentPurchasePrice(equipmentPurchasePrice);
        }

        Double equipmentPurchasePriceDll = (Double) attributes.get(
                "equipmentPurchasePriceDll");

        if (equipmentPurchasePriceDll != null) {
            setEquipmentPurchasePriceDll(equipmentPurchasePriceDll);
        }

        Double equipmentSalePrice = (Double) attributes.get(
                "equipmentSalePrice");

        if (equipmentSalePrice != null) {
            setEquipmentSalePrice(equipmentSalePrice);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

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
    }

    @Override
    public int getEquipmentId() {
        return _equipmentId;
    }

    @Override
    public void setEquipmentId(int equipmentId) {
        _equipmentId = equipmentId;

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setEquipmentId", int.class);

                method.invoke(_entityEquipmentRemoteModel, equipmentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEquipmentDescription() {
        return _equipmentDescription;
    }

    @Override
    public void setEquipmentDescription(String equipmentDescription) {
        _equipmentDescription = equipmentDescription;

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setEquipmentDescription",
                        String.class);

                method.invoke(_entityEquipmentRemoteModel, equipmentDescription);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getEquipmentPurchasePrice() {
        return _equipmentPurchasePrice;
    }

    @Override
    public void setEquipmentPurchasePrice(double equipmentPurchasePrice) {
        _equipmentPurchasePrice = equipmentPurchasePrice;

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setEquipmentPurchasePrice",
                        double.class);

                method.invoke(_entityEquipmentRemoteModel,
                    equipmentPurchasePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getEquipmentPurchasePriceDll() {
        return _equipmentPurchasePriceDll;
    }

    @Override
    public void setEquipmentPurchasePriceDll(double equipmentPurchasePriceDll) {
        _equipmentPurchasePriceDll = equipmentPurchasePriceDll;

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setEquipmentPurchasePriceDll",
                        double.class);

                method.invoke(_entityEquipmentRemoteModel,
                    equipmentPurchasePriceDll);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getEquipmentSalePrice() {
        return _equipmentSalePrice;
    }

    @Override
    public void setEquipmentSalePrice(double equipmentSalePrice) {
        _equipmentSalePrice = equipmentSalePrice;

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setEquipmentSalePrice",
                        double.class);

                method.invoke(_entityEquipmentRemoteModel, equipmentSalePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatus() {
        return _status;
    }

    @Override
    public void setStatus(String status) {
        _status = status;

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_entityEquipmentRemoteModel, status);
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

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setModelId", int.class);

                method.invoke(_entityEquipmentRemoteModel, modelId);
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

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandId", int.class);

                method.invoke(_entityEquipmentRemoteModel, brandId);
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

        if (_entityEquipmentRemoteModel != null) {
            try {
                Class<?> clazz = _entityEquipmentRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityEquipmentRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityEquipmentRemoteModel() {
        return _entityEquipmentRemoteModel;
    }

    public void setEntityEquipmentRemoteModel(
        BaseModel<?> entityEquipmentRemoteModel) {
        _entityEquipmentRemoteModel = entityEquipmentRemoteModel;
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

        Class<?> remoteModelClass = _entityEquipmentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityEquipmentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityEquipmentLocalServiceUtil.addEntityEquipment(this);
        } else {
            EntityEquipmentLocalServiceUtil.updateEntityEquipment(this);
        }
    }

    @Override
    public EntityEquipment toEscapedModel() {
        return (EntityEquipment) ProxyUtil.newProxyInstance(EntityEquipment.class.getClassLoader(),
            new Class[] { EntityEquipment.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityEquipmentClp clone = new EntityEquipmentClp();

        clone.setEquipmentId(getEquipmentId());
        clone.setEquipmentDescription(getEquipmentDescription());
        clone.setEquipmentPurchasePrice(getEquipmentPurchasePrice());
        clone.setEquipmentPurchasePriceDll(getEquipmentPurchasePriceDll());
        clone.setEquipmentSalePrice(getEquipmentSalePrice());
        clone.setStatus(getStatus());
        clone.setModelId(getModelId());
        clone.setBrandId(getBrandId());
        clone.setYearModel(getYearModel());

        return clone;
    }

    @Override
    public int compareTo(EntityEquipment entityEquipment) {
        int primaryKey = entityEquipment.getPrimaryKey();

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

        if (!(obj instanceof EntityEquipmentClp)) {
            return false;
        }

        EntityEquipmentClp entityEquipment = (EntityEquipmentClp) obj;

        int primaryKey = entityEquipment.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{equipmentId=");
        sb.append(getEquipmentId());
        sb.append(", equipmentDescription=");
        sb.append(getEquipmentDescription());
        sb.append(", equipmentPurchasePrice=");
        sb.append(getEquipmentPurchasePrice());
        sb.append(", equipmentPurchasePriceDll=");
        sb.append(getEquipmentPurchasePriceDll());
        sb.append(", equipmentSalePrice=");
        sb.append(getEquipmentSalePrice());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", modelId=");
        sb.append(getModelId());
        sb.append(", brandId=");
        sb.append(getBrandId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityEquipment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>equipmentId</column-name><column-value><![CDATA[");
        sb.append(getEquipmentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>equipmentDescription</column-name><column-value><![CDATA[");
        sb.append(getEquipmentDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>equipmentPurchasePrice</column-name><column-value><![CDATA[");
        sb.append(getEquipmentPurchasePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>equipmentPurchasePriceDll</column-name><column-value><![CDATA[");
        sb.append(getEquipmentPurchasePriceDll());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>equipmentSalePrice</column-name><column-value><![CDATA[");
        sb.append(getEquipmentSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
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

        sb.append("</model>");

        return sb.toString();
    }
}
