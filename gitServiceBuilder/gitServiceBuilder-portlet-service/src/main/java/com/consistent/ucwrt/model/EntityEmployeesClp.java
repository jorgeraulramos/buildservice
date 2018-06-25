package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityEmployeesLocalServiceUtil;

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


public class EntityEmployeesClp extends BaseModelImpl<EntityEmployees>
    implements EntityEmployees {
    private int _employeeId;
    private String _firstName;
    private String _lastName;
    private String _secondLastName;
    private String _marketStall;
    private String _department;
    private String _cellPhone;
    private String _phone;
    private String _email;
    private String _certified;
    private Date _certifiedDate;
    private String _certificationNumber;
    private Date _registrationDate;
    private String _status;
    private String _comments;
    private String _departmentId;
    private String _employmentId;
    private String _dealerId;
    private String _businessBrandName;
    private BaseModel<?> _entityEmployeesRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityEmployeesClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEmployees.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEmployees.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setEmployeeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("secondLastName", getSecondLastName());
        attributes.put("marketStall", getMarketStall());
        attributes.put("department", getDepartment());
        attributes.put("cellPhone", getCellPhone());
        attributes.put("phone", getPhone());
        attributes.put("email", getEmail());
        attributes.put("certified", getCertified());
        attributes.put("certifiedDate", getCertifiedDate());
        attributes.put("certificationNumber", getCertificationNumber());
        attributes.put("registrationDate", getRegistrationDate());
        attributes.put("status", getStatus());
        attributes.put("comments", getComments());
        attributes.put("departmentId", getDepartmentId());
        attributes.put("employmentId", getEmploymentId());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer employeeId = (Integer) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
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

        String marketStall = (String) attributes.get("marketStall");

        if (marketStall != null) {
            setMarketStall(marketStall);
        }

        String department = (String) attributes.get("department");

        if (department != null) {
            setDepartment(department);
        }

        String cellPhone = (String) attributes.get("cellPhone");

        if (cellPhone != null) {
            setCellPhone(cellPhone);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String certified = (String) attributes.get("certified");

        if (certified != null) {
            setCertified(certified);
        }

        Date certifiedDate = (Date) attributes.get("certifiedDate");

        if (certifiedDate != null) {
            setCertifiedDate(certifiedDate);
        }

        String certificationNumber = (String) attributes.get(
                "certificationNumber");

        if (certificationNumber != null) {
            setCertificationNumber(certificationNumber);
        }

        Date registrationDate = (Date) attributes.get("registrationDate");

        if (registrationDate != null) {
            setRegistrationDate(registrationDate);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }

        String departmentId = (String) attributes.get("departmentId");

        if (departmentId != null) {
            setDepartmentId(departmentId);
        }

        String employmentId = (String) attributes.get("employmentId");

        if (employmentId != null) {
            setEmploymentId(employmentId);
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
    public int getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", int.class);

                method.invoke(_entityEmployeesRemoteModel, employeeId);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_entityEmployeesRemoteModel, firstName);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_entityEmployeesRemoteModel, lastName);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setSecondLastName",
                        String.class);

                method.invoke(_entityEmployeesRemoteModel, secondLastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMarketStall() {
        return _marketStall;
    }

    @Override
    public void setMarketStall(String marketStall) {
        _marketStall = marketStall;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setMarketStall", String.class);

                method.invoke(_entityEmployeesRemoteModel, marketStall);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDepartment() {
        return _department;
    }

    @Override
    public void setDepartment(String department) {
        _department = department;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartment", String.class);

                method.invoke(_entityEmployeesRemoteModel, department);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setCellPhone", String.class);

                method.invoke(_entityEmployeesRemoteModel, cellPhone);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_entityEmployeesRemoteModel, phone);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_entityEmployeesRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCertified() {
        return _certified;
    }

    @Override
    public void setCertified(String certified) {
        _certified = certified;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setCertified", String.class);

                method.invoke(_entityEmployeesRemoteModel, certified);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCertifiedDate() {
        return _certifiedDate;
    }

    @Override
    public void setCertifiedDate(Date certifiedDate) {
        _certifiedDate = certifiedDate;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setCertifiedDate", Date.class);

                method.invoke(_entityEmployeesRemoteModel, certifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCertificationNumber() {
        return _certificationNumber;
    }

    @Override
    public void setCertificationNumber(String certificationNumber) {
        _certificationNumber = certificationNumber;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setCertificationNumber",
                        String.class);

                method.invoke(_entityEmployeesRemoteModel, certificationNumber);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setRegistrationDate",
                        Date.class);

                method.invoke(_entityEmployeesRemoteModel, registrationDate);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_entityEmployeesRemoteModel, status);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setComments", String.class);

                method.invoke(_entityEmployeesRemoteModel, comments);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDepartmentId() {
        return _departmentId;
    }

    @Override
    public void setDepartmentId(String departmentId) {
        _departmentId = departmentId;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartmentId", String.class);

                method.invoke(_entityEmployeesRemoteModel, departmentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmploymentId() {
        return _employmentId;
    }

    @Override
    public void setEmploymentId(String employmentId) {
        _employmentId = employmentId;

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmploymentId", String.class);

                method.invoke(_entityEmployeesRemoteModel, employmentId);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setDealerId", String.class);

                method.invoke(_entityEmployeesRemoteModel, dealerId);
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

        if (_entityEmployeesRemoteModel != null) {
            try {
                Class<?> clazz = _entityEmployeesRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessBrandName",
                        String.class);

                method.invoke(_entityEmployeesRemoteModel, businessBrandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityEmployeesRemoteModel() {
        return _entityEmployeesRemoteModel;
    }

    public void setEntityEmployeesRemoteModel(
        BaseModel<?> entityEmployeesRemoteModel) {
        _entityEmployeesRemoteModel = entityEmployeesRemoteModel;
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

        Class<?> remoteModelClass = _entityEmployeesRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityEmployeesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityEmployeesLocalServiceUtil.addEntityEmployees(this);
        } else {
            EntityEmployeesLocalServiceUtil.updateEntityEmployees(this);
        }
    }

    @Override
    public EntityEmployees toEscapedModel() {
        return (EntityEmployees) ProxyUtil.newProxyInstance(EntityEmployees.class.getClassLoader(),
            new Class[] { EntityEmployees.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityEmployeesClp clone = new EntityEmployeesClp();

        clone.setEmployeeId(getEmployeeId());
        clone.setFirstName(getFirstName());
        clone.setLastName(getLastName());
        clone.setSecondLastName(getSecondLastName());
        clone.setMarketStall(getMarketStall());
        clone.setDepartment(getDepartment());
        clone.setCellPhone(getCellPhone());
        clone.setPhone(getPhone());
        clone.setEmail(getEmail());
        clone.setCertified(getCertified());
        clone.setCertifiedDate(getCertifiedDate());
        clone.setCertificationNumber(getCertificationNumber());
        clone.setRegistrationDate(getRegistrationDate());
        clone.setStatus(getStatus());
        clone.setComments(getComments());
        clone.setDepartmentId(getDepartmentId());
        clone.setEmploymentId(getEmploymentId());
        clone.setDealerId(getDealerId());
        clone.setBusinessBrandName(getBusinessBrandName());

        return clone;
    }

    @Override
    public int compareTo(EntityEmployees entityEmployees) {
        int primaryKey = entityEmployees.getPrimaryKey();

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

        if (!(obj instanceof EntityEmployeesClp)) {
            return false;
        }

        EntityEmployeesClp entityEmployees = (EntityEmployeesClp) obj;

        int primaryKey = entityEmployees.getPrimaryKey();

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
        StringBundler sb = new StringBundler(39);

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", secondLastName=");
        sb.append(getSecondLastName());
        sb.append(", marketStall=");
        sb.append(getMarketStall());
        sb.append(", department=");
        sb.append(getDepartment());
        sb.append(", cellPhone=");
        sb.append(getCellPhone());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", certified=");
        sb.append(getCertified());
        sb.append(", certifiedDate=");
        sb.append(getCertifiedDate());
        sb.append(", certificationNumber=");
        sb.append(getCertificationNumber());
        sb.append(", registrationDate=");
        sb.append(getRegistrationDate());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", comments=");
        sb.append(getComments());
        sb.append(", departmentId=");
        sb.append(getDepartmentId());
        sb.append(", employmentId=");
        sb.append(getEmploymentId());
        sb.append(", dealerId=");
        sb.append(getDealerId());
        sb.append(", businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(61);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityEmployees");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
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
            "<column><column-name>marketStall</column-name><column-value><![CDATA[");
        sb.append(getMarketStall());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>department</column-name><column-value><![CDATA[");
        sb.append(getDepartment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cellPhone</column-name><column-value><![CDATA[");
        sb.append(getCellPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phone</column-name><column-value><![CDATA[");
        sb.append(getPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>certified</column-name><column-value><![CDATA[");
        sb.append(getCertified());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>certifiedDate</column-name><column-value><![CDATA[");
        sb.append(getCertifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>certificationNumber</column-name><column-value><![CDATA[");
        sb.append(getCertificationNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registrationDate</column-name><column-value><![CDATA[");
        sb.append(getRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>comments</column-name><column-value><![CDATA[");
        sb.append(getComments());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>departmentId</column-name><column-value><![CDATA[");
        sb.append(getDepartmentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employmentId</column-name><column-value><![CDATA[");
        sb.append(getEmploymentId());
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
