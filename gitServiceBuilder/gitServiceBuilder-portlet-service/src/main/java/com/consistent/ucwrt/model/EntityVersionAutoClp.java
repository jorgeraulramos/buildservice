package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityVersionAutoLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityVersionAutoPK;

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


public class EntityVersionAutoClp extends BaseModelImpl<EntityVersionAuto>
    implements EntityVersionAuto {
    private int _versionId;
    private String _versionName;
    private Date _versionRegistrationDate;
    private String _versionResponsibleUser;
    private String _versionRegisterData;
    private double _purchasePrice;
    private double _salePrice;
    private double _purchasePriceDll;
    private String _typeload;
    private String _colorName;
    private int _modelId;
    private int _brandId;
    private int _yearModel;
    private int _classId;
    private BaseModel<?> _entityVersionAutoRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityVersionAutoClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityVersionAuto.class;
    }

    @Override
    public String getModelClassName() {
        return EntityVersionAuto.class.getName();
    }

    @Override
    public EntityVersionAutoPK getPrimaryKey() {
        return new EntityVersionAutoPK(_versionId, _modelId, _brandId,
            _yearModel);
    }

    @Override
    public void setPrimaryKey(EntityVersionAutoPK primaryKey) {
        setVersionId(primaryKey.versionId);
        setModelId(primaryKey.modelId);
        setBrandId(primaryKey.brandId);
        setYearModel(primaryKey.yearModel);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityVersionAutoPK(_versionId, _modelId, _brandId,
            _yearModel);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityVersionAutoPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("versionId", getVersionId());
        attributes.put("versionName", getVersionName());
        attributes.put("versionRegistrationDate", getVersionRegistrationDate());
        attributes.put("versionResponsibleUser", getVersionResponsibleUser());
        attributes.put("versionRegisterData", getVersionRegisterData());
        attributes.put("purchasePrice", getPurchasePrice());
        attributes.put("salePrice", getSalePrice());
        attributes.put("purchasePriceDll", getPurchasePriceDll());
        attributes.put("typeload", getTypeload());
        attributes.put("colorName", getColorName());
        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());
        attributes.put("classId", getClassId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer versionId = (Integer) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        String versionName = (String) attributes.get("versionName");

        if (versionName != null) {
            setVersionName(versionName);
        }

        Date versionRegistrationDate = (Date) attributes.get(
                "versionRegistrationDate");

        if (versionRegistrationDate != null) {
            setVersionRegistrationDate(versionRegistrationDate);
        }

        String versionResponsibleUser = (String) attributes.get(
                "versionResponsibleUser");

        if (versionResponsibleUser != null) {
            setVersionResponsibleUser(versionResponsibleUser);
        }

        String versionRegisterData = (String) attributes.get(
                "versionRegisterData");

        if (versionRegisterData != null) {
            setVersionRegisterData(versionRegisterData);
        }

        Double purchasePrice = (Double) attributes.get("purchasePrice");

        if (purchasePrice != null) {
            setPurchasePrice(purchasePrice);
        }

        Double salePrice = (Double) attributes.get("salePrice");

        if (salePrice != null) {
            setSalePrice(salePrice);
        }

        Double purchasePriceDll = (Double) attributes.get("purchasePriceDll");

        if (purchasePriceDll != null) {
            setPurchasePriceDll(purchasePriceDll);
        }

        String typeload = (String) attributes.get("typeload");

        if (typeload != null) {
            setTypeload(typeload);
        }

        String colorName = (String) attributes.get("colorName");

        if (colorName != null) {
            setColorName(colorName);
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

        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }
    }

    @Override
    public int getVersionId() {
        return _versionId;
    }

    @Override
    public void setVersionId(int versionId) {
        _versionId = versionId;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionId", int.class);

                method.invoke(_entityVersionAutoRemoteModel, versionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVersionName() {
        return _versionName;
    }

    @Override
    public void setVersionName(String versionName) {
        _versionName = versionName;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionName", String.class);

                method.invoke(_entityVersionAutoRemoteModel, versionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getVersionRegistrationDate() {
        return _versionRegistrationDate;
    }

    @Override
    public void setVersionRegistrationDate(Date versionRegistrationDate) {
        _versionRegistrationDate = versionRegistrationDate;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionRegistrationDate",
                        Date.class);

                method.invoke(_entityVersionAutoRemoteModel,
                    versionRegistrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVersionResponsibleUser() {
        return _versionResponsibleUser;
    }

    @Override
    public void setVersionResponsibleUser(String versionResponsibleUser) {
        _versionResponsibleUser = versionResponsibleUser;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionResponsibleUser",
                        String.class);

                method.invoke(_entityVersionAutoRemoteModel,
                    versionResponsibleUser);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVersionRegisterData() {
        return _versionRegisterData;
    }

    @Override
    public void setVersionRegisterData(String versionRegisterData) {
        _versionRegisterData = versionRegisterData;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionRegisterData",
                        String.class);

                method.invoke(_entityVersionAutoRemoteModel, versionRegisterData);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPurchasePrice() {
        return _purchasePrice;
    }

    @Override
    public void setPurchasePrice(double purchasePrice) {
        _purchasePrice = purchasePrice;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchasePrice", double.class);

                method.invoke(_entityVersionAutoRemoteModel, purchasePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getSalePrice() {
        return _salePrice;
    }

    @Override
    public void setSalePrice(double salePrice) {
        _salePrice = salePrice;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setSalePrice", double.class);

                method.invoke(_entityVersionAutoRemoteModel, salePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPurchasePriceDll() {
        return _purchasePriceDll;
    }

    @Override
    public void setPurchasePriceDll(double purchasePriceDll) {
        _purchasePriceDll = purchasePriceDll;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchasePriceDll",
                        double.class);

                method.invoke(_entityVersionAutoRemoteModel, purchasePriceDll);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTypeload() {
        return _typeload;
    }

    @Override
    public void setTypeload(String typeload) {
        _typeload = typeload;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setTypeload", String.class);

                method.invoke(_entityVersionAutoRemoteModel, typeload);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getColorName() {
        return _colorName;
    }

    @Override
    public void setColorName(String colorName) {
        _colorName = colorName;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setColorName", String.class);

                method.invoke(_entityVersionAutoRemoteModel, colorName);
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

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setModelId", int.class);

                method.invoke(_entityVersionAutoRemoteModel, modelId);
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

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandId", int.class);

                method.invoke(_entityVersionAutoRemoteModel, brandId);
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

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityVersionAutoRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getClassId() {
        return _classId;
    }

    @Override
    public void setClassId(int classId) {
        _classId = classId;

        if (_entityVersionAutoRemoteModel != null) {
            try {
                Class<?> clazz = _entityVersionAutoRemoteModel.getClass();

                Method method = clazz.getMethod("setClassId", int.class);

                method.invoke(_entityVersionAutoRemoteModel, classId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityVersionAutoRemoteModel() {
        return _entityVersionAutoRemoteModel;
    }

    public void setEntityVersionAutoRemoteModel(
        BaseModel<?> entityVersionAutoRemoteModel) {
        _entityVersionAutoRemoteModel = entityVersionAutoRemoteModel;
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

        Class<?> remoteModelClass = _entityVersionAutoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityVersionAutoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityVersionAutoLocalServiceUtil.addEntityVersionAuto(this);
        } else {
            EntityVersionAutoLocalServiceUtil.updateEntityVersionAuto(this);
        }
    }

    @Override
    public EntityVersionAuto toEscapedModel() {
        return (EntityVersionAuto) ProxyUtil.newProxyInstance(EntityVersionAuto.class.getClassLoader(),
            new Class[] { EntityVersionAuto.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityVersionAutoClp clone = new EntityVersionAutoClp();

        clone.setVersionId(getVersionId());
        clone.setVersionName(getVersionName());
        clone.setVersionRegistrationDate(getVersionRegistrationDate());
        clone.setVersionResponsibleUser(getVersionResponsibleUser());
        clone.setVersionRegisterData(getVersionRegisterData());
        clone.setPurchasePrice(getPurchasePrice());
        clone.setSalePrice(getSalePrice());
        clone.setPurchasePriceDll(getPurchasePriceDll());
        clone.setTypeload(getTypeload());
        clone.setColorName(getColorName());
        clone.setModelId(getModelId());
        clone.setBrandId(getBrandId());
        clone.setYearModel(getYearModel());
        clone.setClassId(getClassId());

        return clone;
    }

    @Override
    public int compareTo(EntityVersionAuto entityVersionAuto) {
        EntityVersionAutoPK primaryKey = entityVersionAuto.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionAutoClp)) {
            return false;
        }

        EntityVersionAutoClp entityVersionAuto = (EntityVersionAutoClp) obj;

        EntityVersionAutoPK primaryKey = entityVersionAuto.getPrimaryKey();

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
        StringBundler sb = new StringBundler(29);

        sb.append("{versionId=");
        sb.append(getVersionId());
        sb.append(", versionName=");
        sb.append(getVersionName());
        sb.append(", versionRegistrationDate=");
        sb.append(getVersionRegistrationDate());
        sb.append(", versionResponsibleUser=");
        sb.append(getVersionResponsibleUser());
        sb.append(", versionRegisterData=");
        sb.append(getVersionRegisterData());
        sb.append(", purchasePrice=");
        sb.append(getPurchasePrice());
        sb.append(", salePrice=");
        sb.append(getSalePrice());
        sb.append(", purchasePriceDll=");
        sb.append(getPurchasePriceDll());
        sb.append(", typeload=");
        sb.append(getTypeload());
        sb.append(", colorName=");
        sb.append(getColorName());
        sb.append(", modelId=");
        sb.append(getModelId());
        sb.append(", brandId=");
        sb.append(getBrandId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append(", classId=");
        sb.append(getClassId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityVersionAuto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>versionId</column-name><column-value><![CDATA[");
        sb.append(getVersionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionName</column-name><column-value><![CDATA[");
        sb.append(getVersionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getVersionRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionResponsibleUser</column-name><column-value><![CDATA[");
        sb.append(getVersionResponsibleUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionRegisterData</column-name><column-value><![CDATA[");
        sb.append(getVersionRegisterData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchasePrice</column-name><column-value><![CDATA[");
        sb.append(getPurchasePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salePrice</column-name><column-value><![CDATA[");
        sb.append(getSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchasePriceDll</column-name><column-value><![CDATA[");
        sb.append(getPurchasePriceDll());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>typeload</column-name><column-value><![CDATA[");
        sb.append(getTypeload());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>colorName</column-name><column-value><![CDATA[");
        sb.append(getColorName());
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
        sb.append(
            "<column><column-name>classId</column-name><column-value><![CDATA[");
        sb.append(getClassId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
