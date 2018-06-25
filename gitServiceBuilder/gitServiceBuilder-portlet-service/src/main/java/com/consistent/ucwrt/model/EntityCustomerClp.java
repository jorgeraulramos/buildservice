package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityCustomerLocalServiceUtil;

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


public class EntityCustomerClp extends BaseModelImpl<EntityCustomer>
    implements EntityCustomer {
    private int _clientId;
    private String _firstName;
    private String _lastName;
    private String _secondLastName;
    private String _email;
    private String _rfc;
    private String _cellPhone;
    private String _legalPersonality;
    private String _personType;
    private String _phone;
    private Date _registrationDate;
    private String _comments;
    private String _dealerId;
    private String _businessBrandName;
    private BaseModel<?> _entityCustomerRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityCustomerClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityCustomer.class;
    }

    @Override
    public String getModelClassName() {
        return EntityCustomer.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _clientId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setClientId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _clientId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("clientId", getClientId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("secondLastName", getSecondLastName());
        attributes.put("email", getEmail());
        attributes.put("rfc", getRfc());
        attributes.put("cellPhone", getCellPhone());
        attributes.put("legalPersonality", getLegalPersonality());
        attributes.put("personType", getPersonType());
        attributes.put("phone", getPhone());
        attributes.put("registrationDate", getRegistrationDate());
        attributes.put("comments", getComments());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String secondLastName = (String) attributes.get("secondLastName");

        if (secondLastName != null) {
            setSecondLastName(secondLastName);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String rfc = (String) attributes.get("rfc");

        if (rfc != null) {
            setRfc(rfc);
        }

        String cellPhone = (String) attributes.get("cellPhone");

        if (cellPhone != null) {
            setCellPhone(cellPhone);
        }

        String legalPersonality = (String) attributes.get("legalPersonality");

        if (legalPersonality != null) {
            setLegalPersonality(legalPersonality);
        }

        String personType = (String) attributes.get("personType");

        if (personType != null) {
            setPersonType(personType);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        Date registrationDate = (Date) attributes.get("registrationDate");

        if (registrationDate != null) {
            setRegistrationDate(registrationDate);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }

        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }
    }

    @Override
    public int getClientId() {
        return _clientId;
    }

    @Override
    public void setClientId(int clientId) {
        _clientId = clientId;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setClientId", int.class);

                method.invoke(_entityCustomerRemoteModel, clientId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_entityCustomerRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_entityCustomerRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSecondLastName() {
        return _secondLastName;
    }

    @Override
    public void setSecondLastName(String secondLastName) {
        _secondLastName = secondLastName;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setSecondLastName",
                        String.class);

                method.invoke(_entityCustomerRemoteModel, secondLastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_entityCustomerRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRfc() {
        return _rfc;
    }

    @Override
    public void setRfc(String rfc) {
        _rfc = rfc;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setRfc", String.class);

                method.invoke(_entityCustomerRemoteModel, rfc);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCellPhone() {
        return _cellPhone;
    }

    @Override
    public void setCellPhone(String cellPhone) {
        _cellPhone = cellPhone;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setCellPhone", String.class);

                method.invoke(_entityCustomerRemoteModel, cellPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLegalPersonality() {
        return _legalPersonality;
    }

    @Override
    public void setLegalPersonality(String legalPersonality) {
        _legalPersonality = legalPersonality;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setLegalPersonality",
                        String.class);

                method.invoke(_entityCustomerRemoteModel, legalPersonality);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPersonType() {
        return _personType;
    }

    @Override
    public void setPersonType(String personType) {
        _personType = personType;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setPersonType", String.class);

                method.invoke(_entityCustomerRemoteModel, personType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhone() {
        return _phone;
    }

    @Override
    public void setPhone(String phone) {
        _phone = phone;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_entityCustomerRemoteModel, phone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getRegistrationDate() {
        return _registrationDate;
    }

    @Override
    public void setRegistrationDate(Date registrationDate) {
        _registrationDate = registrationDate;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setRegistrationDate",
                        Date.class);

                method.invoke(_entityCustomerRemoteModel, registrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getComments() {
        return _comments;
    }

    @Override
    public void setComments(String comments) {
        _comments = comments;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setComments", String.class);

                method.invoke(_entityCustomerRemoteModel, comments);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDealerId() {
        return _dealerId;
    }

    @Override
    public void setDealerId(String dealerId) {
        _dealerId = dealerId;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setDealerId", String.class);

                method.invoke(_entityCustomerRemoteModel, dealerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    @Override
    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;

        if (_entityCustomerRemoteModel != null) {
            try {
                Class<?> clazz = _entityCustomerRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessBrandName",
                        String.class);

                method.invoke(_entityCustomerRemoteModel, businessBrandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityCustomerRemoteModel() {
        return _entityCustomerRemoteModel;
    }

    public void setEntityCustomerRemoteModel(
        BaseModel<?> entityCustomerRemoteModel) {
        _entityCustomerRemoteModel = entityCustomerRemoteModel;
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

        Class<?> remoteModelClass = _entityCustomerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityCustomerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityCustomerLocalServiceUtil.addEntityCustomer(this);
        } else {
            EntityCustomerLocalServiceUtil.updateEntityCustomer(this);
        }
    }

    @Override
    public EntityCustomer toEscapedModel() {
        return (EntityCustomer) ProxyUtil.newProxyInstance(EntityCustomer.class.getClassLoader(),
            new Class[] { EntityCustomer.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityCustomerClp clone = new EntityCustomerClp();

        clone.setClientId(getClientId());
        clone.setFirstName(getFirstName());
        clone.setLastName(getLastName());
        clone.setSecondLastName(getSecondLastName());
        clone.setEmail(getEmail());
        clone.setRfc(getRfc());
        clone.setCellPhone(getCellPhone());
        clone.setLegalPersonality(getLegalPersonality());
        clone.setPersonType(getPersonType());
        clone.setPhone(getPhone());
        clone.setRegistrationDate(getRegistrationDate());
        clone.setComments(getComments());
        clone.setDealerId(getDealerId());
        clone.setBusinessBrandName(getBusinessBrandName());

        return clone;
    }

    @Override
    public int compareTo(EntityCustomer entityCustomer) {
        int primaryKey = entityCustomer.getPrimaryKey();

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

        if (!(obj instanceof EntityCustomerClp)) {
            return false;
        }

        EntityCustomerClp entityCustomer = (EntityCustomerClp) obj;

        int primaryKey = entityCustomer.getPrimaryKey();

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
        StringBundler sb = new StringBundler(29);

        sb.append("{clientId=");
        sb.append(getClientId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", secondLastName=");
        sb.append(getSecondLastName());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", rfc=");
        sb.append(getRfc());
        sb.append(", cellPhone=");
        sb.append(getCellPhone());
        sb.append(", legalPersonality=");
        sb.append(getLegalPersonality());
        sb.append(", personType=");
        sb.append(getPersonType());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", registrationDate=");
        sb.append(getRegistrationDate());
        sb.append(", comments=");
        sb.append(getComments());
        sb.append(", dealerId=");
        sb.append(getDealerId());
        sb.append(", businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityCustomer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>clientId</column-name><column-value><![CDATA[");
        sb.append(getClientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>secondLastName</column-name><column-value><![CDATA[");
        sb.append(getSecondLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rfc</column-name><column-value><![CDATA[");
        sb.append(getRfc());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cellPhone</column-name><column-value><![CDATA[");
        sb.append(getCellPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>legalPersonality</column-name><column-value><![CDATA[");
        sb.append(getLegalPersonality());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>personType</column-name><column-value><![CDATA[");
        sb.append(getPersonType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phone</column-name><column-value><![CDATA[");
        sb.append(getPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registrationDate</column-name><column-value><![CDATA[");
        sb.append(getRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>comments</column-name><column-value><![CDATA[");
        sb.append(getComments());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dealerId</column-name><column-value><![CDATA[");
        sb.append(getDealerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>businessBrandName</column-name><column-value><![CDATA[");
        sb.append(getBusinessBrandName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
