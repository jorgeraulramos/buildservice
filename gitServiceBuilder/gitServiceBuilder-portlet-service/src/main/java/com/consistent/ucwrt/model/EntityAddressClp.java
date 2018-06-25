package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityAddressLocalServiceUtil;

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


public class EntityAddressClp extends BaseModelImpl<EntityAddress>
    implements EntityAddress {
    private int _addressId;
    private String _street;
    private int _interiorNumber;
    private int _exteriorNumber;
    private int _clientId;
    private int _municipalId;
    private int _stateId;
    private int _suburbId;
    private BaseModel<?> _entityAddressRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityAddressClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityAddress.class;
    }

    @Override
    public String getModelClassName() {
        return EntityAddress.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _addressId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setAddressId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _addressId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("addressId", getAddressId());
        attributes.put("street", getStreet());
        attributes.put("interiorNumber", getInteriorNumber());
        attributes.put("exteriorNumber", getExteriorNumber());
        attributes.put("clientId", getClientId());
        attributes.put("municipalId", getMunicipalId());
        attributes.put("stateId", getStateId());
        attributes.put("suburbId", getSuburbId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer addressId = (Integer) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
        }

        String street = (String) attributes.get("street");

        if (street != null) {
            setStreet(street);
        }

        Integer interiorNumber = (Integer) attributes.get("interiorNumber");

        if (interiorNumber != null) {
            setInteriorNumber(interiorNumber);
        }

        Integer exteriorNumber = (Integer) attributes.get("exteriorNumber");

        if (exteriorNumber != null) {
            setExteriorNumber(exteriorNumber);
        }

        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }

        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }

        Integer suburbId = (Integer) attributes.get("suburbId");

        if (suburbId != null) {
            setSuburbId(suburbId);
        }
    }

    @Override
    public int getAddressId() {
        return _addressId;
    }

    @Override
    public void setAddressId(int addressId) {
        _addressId = addressId;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setAddressId", int.class);

                method.invoke(_entityAddressRemoteModel, addressId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStreet() {
        return _street;
    }

    @Override
    public void setStreet(String street) {
        _street = street;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setStreet", String.class);

                method.invoke(_entityAddressRemoteModel, street);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getInteriorNumber() {
        return _interiorNumber;
    }

    @Override
    public void setInteriorNumber(int interiorNumber) {
        _interiorNumber = interiorNumber;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setInteriorNumber", int.class);

                method.invoke(_entityAddressRemoteModel, interiorNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getExteriorNumber() {
        return _exteriorNumber;
    }

    @Override
    public void setExteriorNumber(int exteriorNumber) {
        _exteriorNumber = exteriorNumber;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setExteriorNumber", int.class);

                method.invoke(_entityAddressRemoteModel, exteriorNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getClientId() {
        return _clientId;
    }

    @Override
    public void setClientId(int clientId) {
        _clientId = clientId;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setClientId", int.class);

                method.invoke(_entityAddressRemoteModel, clientId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMunicipalId() {
        return _municipalId;
    }

    @Override
    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setMunicipalId", int.class);

                method.invoke(_entityAddressRemoteModel, municipalId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStateId() {
        return _stateId;
    }

    @Override
    public void setStateId(int stateId) {
        _stateId = stateId;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setStateId", int.class);

                method.invoke(_entityAddressRemoteModel, stateId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSuburbId() {
        return _suburbId;
    }

    @Override
    public void setSuburbId(int suburbId) {
        _suburbId = suburbId;

        if (_entityAddressRemoteModel != null) {
            try {
                Class<?> clazz = _entityAddressRemoteModel.getClass();

                Method method = clazz.getMethod("setSuburbId", int.class);

                method.invoke(_entityAddressRemoteModel, suburbId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityAddressRemoteModel() {
        return _entityAddressRemoteModel;
    }

    public void setEntityAddressRemoteModel(
        BaseModel<?> entityAddressRemoteModel) {
        _entityAddressRemoteModel = entityAddressRemoteModel;
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

        Class<?> remoteModelClass = _entityAddressRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityAddressRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityAddressLocalServiceUtil.addEntityAddress(this);
        } else {
            EntityAddressLocalServiceUtil.updateEntityAddress(this);
        }
    }

    @Override
    public EntityAddress toEscapedModel() {
        return (EntityAddress) ProxyUtil.newProxyInstance(EntityAddress.class.getClassLoader(),
            new Class[] { EntityAddress.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityAddressClp clone = new EntityAddressClp();

        clone.setAddressId(getAddressId());
        clone.setStreet(getStreet());
        clone.setInteriorNumber(getInteriorNumber());
        clone.setExteriorNumber(getExteriorNumber());
        clone.setClientId(getClientId());
        clone.setMunicipalId(getMunicipalId());
        clone.setStateId(getStateId());
        clone.setSuburbId(getSuburbId());

        return clone;
    }

    @Override
    public int compareTo(EntityAddress entityAddress) {
        int primaryKey = entityAddress.getPrimaryKey();

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

        if (!(obj instanceof EntityAddressClp)) {
            return false;
        }

        EntityAddressClp entityAddress = (EntityAddressClp) obj;

        int primaryKey = entityAddress.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{addressId=");
        sb.append(getAddressId());
        sb.append(", street=");
        sb.append(getStreet());
        sb.append(", interiorNumber=");
        sb.append(getInteriorNumber());
        sb.append(", exteriorNumber=");
        sb.append(getExteriorNumber());
        sb.append(", clientId=");
        sb.append(getClientId());
        sb.append(", municipalId=");
        sb.append(getMunicipalId());
        sb.append(", stateId=");
        sb.append(getStateId());
        sb.append(", suburbId=");
        sb.append(getSuburbId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityAddress");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>addressId</column-name><column-value><![CDATA[");
        sb.append(getAddressId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>street</column-name><column-value><![CDATA[");
        sb.append(getStreet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interiorNumber</column-name><column-value><![CDATA[");
        sb.append(getInteriorNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>exteriorNumber</column-name><column-value><![CDATA[");
        sb.append(getExteriorNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientId</column-name><column-value><![CDATA[");
        sb.append(getClientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>municipalId</column-name><column-value><![CDATA[");
        sb.append(getMunicipalId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stateId</column-name><column-value><![CDATA[");
        sb.append(getStateId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>suburbId</column-name><column-value><![CDATA[");
        sb.append(getSuburbId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
