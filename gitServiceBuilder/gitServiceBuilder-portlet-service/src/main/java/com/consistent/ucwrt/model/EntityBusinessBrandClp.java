package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityBusinessBrandLocalServiceUtil;

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


public class EntityBusinessBrandClp extends BaseModelImpl<EntityBusinessBrand>
    implements EntityBusinessBrand {
    private String _businessBrandName;
    private String _descriptionBusinessBrand;
    private BaseModel<?> _entityBusinessBrandRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityBusinessBrandClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityBusinessBrand.class;
    }

    @Override
    public String getModelClassName() {
        return EntityBusinessBrand.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _businessBrandName;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setBusinessBrandName(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _businessBrandName;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("descriptionBusinessBrand", getDescriptionBusinessBrand());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String descriptionBusinessBrand = (String) attributes.get(
                "descriptionBusinessBrand");

        if (descriptionBusinessBrand != null) {
            setDescriptionBusinessBrand(descriptionBusinessBrand);
        }
    }

    @Override
    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    @Override
    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;

        if (_entityBusinessBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBusinessBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessBrandName",
                        String.class);

                method.invoke(_entityBusinessBrandRemoteModel, businessBrandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptionBusinessBrand() {
        return _descriptionBusinessBrand;
    }

    @Override
    public void setDescriptionBusinessBrand(String descriptionBusinessBrand) {
        _descriptionBusinessBrand = descriptionBusinessBrand;

        if (_entityBusinessBrandRemoteModel != null) {
            try {
                Class<?> clazz = _entityBusinessBrandRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptionBusinessBrand",
                        String.class);

                method.invoke(_entityBusinessBrandRemoteModel,
                    descriptionBusinessBrand);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityBusinessBrandRemoteModel() {
        return _entityBusinessBrandRemoteModel;
    }

    public void setEntityBusinessBrandRemoteModel(
        BaseModel<?> entityBusinessBrandRemoteModel) {
        _entityBusinessBrandRemoteModel = entityBusinessBrandRemoteModel;
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

        Class<?> remoteModelClass = _entityBusinessBrandRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityBusinessBrandRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityBusinessBrandLocalServiceUtil.addEntityBusinessBrand(this);
        } else {
            EntityBusinessBrandLocalServiceUtil.updateEntityBusinessBrand(this);
        }
    }

    @Override
    public EntityBusinessBrand toEscapedModel() {
        return (EntityBusinessBrand) ProxyUtil.newProxyInstance(EntityBusinessBrand.class.getClassLoader(),
            new Class[] { EntityBusinessBrand.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityBusinessBrandClp clone = new EntityBusinessBrandClp();

        clone.setBusinessBrandName(getBusinessBrandName());
        clone.setDescriptionBusinessBrand(getDescriptionBusinessBrand());

        return clone;
    }

    @Override
    public int compareTo(EntityBusinessBrand entityBusinessBrand) {
        String primaryKey = entityBusinessBrand.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityBusinessBrandClp)) {
            return false;
        }

        EntityBusinessBrandClp entityBusinessBrand = (EntityBusinessBrandClp) obj;

        String primaryKey = entityBusinessBrand.getPrimaryKey();

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

        sb.append("{businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append(", descriptionBusinessBrand=");
        sb.append(getDescriptionBusinessBrand());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityBusinessBrand");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>businessBrandName</column-name><column-value><![CDATA[");
        sb.append(getBusinessBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptionBusinessBrand</column-name><column-value><![CDATA[");
        sb.append(getDescriptionBusinessBrand());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
