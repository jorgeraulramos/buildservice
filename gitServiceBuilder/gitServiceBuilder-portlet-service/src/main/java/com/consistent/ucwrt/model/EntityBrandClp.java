package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityBrandLocalServiceUtil;

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


public class EntityBrandClp extends BaseModelImpl<EntityBrand>
    implements EntityBrand {
    private int _brandId;
    private String _brandName;
    private String _brandDescription;
    private Date _brandRegistrationDate;
    private String _registerData;
    private String _responsibleUser;
    private BaseModel<?> _entityBrandRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityBrandClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityBrand.class;
    }

    @Override
    public String getModelClassName() {
        return EntityBrand.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _brandId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setBrandId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _brandId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("brandId", getBrandId());
        attributes.put("brandName", getBrandName());
        attributes.put("brandDescription", getBrandDescription());
        attributes.put("brandRegistrationDate", getBrandRegistrationDate());
        attributes.put("registerData", getRegisterData());
        attributes.put("responsibleUser", getResponsibleUser());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        String brandName = (String) attributes.get("brandName");

        if (brandName != null) {
            setBrandName(brandName);
        }

        String brandDescription = (String) attributes.get("brandDescription");

        if (brandDescription != null) {
            setBrandDescription(brandDescription);
        }

        Date brandRegistrationDate = (Date) attributes.get(
                "brandRegistrationDate");

        if (brandRegistrationDate != null) {
            setBrandRegistrationDate(brandRegistrationDate);
        }

        String registerData = (String) attributes.get("registerData");

        if (registerData != null) {
            setRegisterData(registerData);
        }

        String responsibleUser = (String) attributes.get("responsibleUser");

        if (responsibleUser != null) {
            setResponsibleUser(responsibleUser);
        }
    }

    @Override
    public int getBrandId() {
        return _brandId;
    }

    @Override
    public void setBrandId(int brandId) {
        _brandId = brandId;

        if (_entityBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandId", int.class);

                method.invoke(_entityBrandRemoteModel, brandId);
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

        if (_entityBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandName", String.class);

                method.invoke(_entityBrandRemoteModel, brandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBrandDescription() {
        return _brandDescription;
    }

    @Override
    public void setBrandDescription(String brandDescription) {
        _brandDescription = brandDescription;

        if (_entityBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandDescription",
                        String.class);

                method.invoke(_entityBrandRemoteModel, brandDescription);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBrandRegistrationDate() {
        return _brandRegistrationDate;
    }

    @Override
    public void setBrandRegistrationDate(Date brandRegistrationDate) {
        _brandRegistrationDate = brandRegistrationDate;

        if (_entityBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandRegistrationDate",
                        Date.class);

                method.invoke(_entityBrandRemoteModel, brandRegistrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRegisterData() {
        return _registerData;
    }

    @Override
    public void setRegisterData(String registerData) {
        _registerData = registerData;

        if (_entityBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setRegisterData", String.class);

                method.invoke(_entityBrandRemoteModel, registerData);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getResponsibleUser() {
        return _responsibleUser;
    }

    @Override
    public void setResponsibleUser(String responsibleUser) {
        _responsibleUser = responsibleUser;

        if (_entityBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setResponsibleUser",
                        String.class);

                method.invoke(_entityBrandRemoteModel, responsibleUser);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityBrandRemoteModel() {
        return _entityBrandRemoteModel;
    }

    public void setEntityBrandRemoteModel(BaseModel<?> entityBrandRemoteModel) {
        _entityBrandRemoteModel = entityBrandRemoteModel;
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

        Class<?> remoteModelClass = _entityBrandRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityBrandRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityBrandLocalServiceUtil.addEntityBrand(this);
        } else {
            EntityBrandLocalServiceUtil.updateEntityBrand(this);
        }
    }

    @Override
    public EntityBrand toEscapedModel() {
        return (EntityBrand) ProxyUtil.newProxyInstance(EntityBrand.class.getClassLoader(),
            new Class[] { EntityBrand.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityBrandClp clone = new EntityBrandClp();

        clone.setBrandId(getBrandId());
        clone.setBrandName(getBrandName());
        clone.setBrandDescription(getBrandDescription());
        clone.setBrandRegistrationDate(getBrandRegistrationDate());
        clone.setRegisterData(getRegisterData());
        clone.setResponsibleUser(getResponsibleUser());

        return clone;
    }

    @Override
    public int compareTo(EntityBrand entityBrand) {
        int primaryKey = entityBrand.getPrimaryKey();

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

        if (!(obj instanceof EntityBrandClp)) {
            return false;
        }

        EntityBrandClp entityBrand = (EntityBrandClp) obj;

        int primaryKey = entityBrand.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{brandId=");
        sb.append(getBrandId());
        sb.append(", brandName=");
        sb.append(getBrandName());
        sb.append(", brandDescription=");
        sb.append(getBrandDescription());
        sb.append(", brandRegistrationDate=");
        sb.append(getBrandRegistrationDate());
        sb.append(", registerData=");
        sb.append(getRegisterData());
        sb.append(", responsibleUser=");
        sb.append(getResponsibleUser());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityBrand");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>brandId</column-name><column-value><![CDATA[");
        sb.append(getBrandId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandName</column-name><column-value><![CDATA[");
        sb.append(getBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandDescription</column-name><column-value><![CDATA[");
        sb.append(getBrandDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getBrandRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registerData</column-name><column-value><![CDATA[");
        sb.append(getRegisterData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>responsibleUser</column-name><column-value><![CDATA[");
        sb.append(getResponsibleUser());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
