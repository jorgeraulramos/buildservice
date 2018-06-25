package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityEmployeesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityEmployeesServiceSoap
 * @generated
 */
public class EntityEmployeesSoap implements Serializable {
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

    public EntityEmployeesSoap() {
    }

    public static EntityEmployeesSoap toSoapModel(EntityEmployees model) {
        EntityEmployeesSoap soapModel = new EntityEmployeesSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());
        soapModel.setSecondLastName(model.getSecondLastName());
        soapModel.setMarketStall(model.getMarketStall());
        soapModel.setDepartment(model.getDepartment());
        soapModel.setCellPhone(model.getCellPhone());
        soapModel.setPhone(model.getPhone());
        soapModel.setEmail(model.getEmail());
        soapModel.setCertified(model.getCertified());
        soapModel.setCertifiedDate(model.getCertifiedDate());
        soapModel.setCertificationNumber(model.getCertificationNumber());
        soapModel.setRegistrationDate(model.getRegistrationDate());
        soapModel.setStatus(model.getStatus());
        soapModel.setComments(model.getComments());
        soapModel.setDepartmentId(model.getDepartmentId());
        soapModel.setEmploymentId(model.getEmploymentId());
        soapModel.setDealerId(model.getDealerId());
        soapModel.setBusinessBrandName(model.getBusinessBrandName());

        return soapModel;
    }

    public static EntityEmployeesSoap[] toSoapModels(EntityEmployees[] models) {
        EntityEmployeesSoap[] soapModels = new EntityEmployeesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityEmployeesSoap[][] toSoapModels(
        EntityEmployees[][] models) {
        EntityEmployeesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityEmployeesSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityEmployeesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityEmployeesSoap[] toSoapModels(
        List<EntityEmployees> models) {
        List<EntityEmployeesSoap> soapModels = new ArrayList<EntityEmployeesSoap>(models.size());

        for (EntityEmployees model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityEmployeesSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(int pk) {
        setEmployeeId(pk);
    }

    public int getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getSecondLastName() {
        return _secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        _secondLastName = secondLastName;
    }

    public String getMarketStall() {
        return _marketStall;
    }

    public void setMarketStall(String marketStall) {
        _marketStall = marketStall;
    }

    public String getDepartment() {
        return _department;
    }

    public void setDepartment(String department) {
        _department = department;
    }

    public String getCellPhone() {
        return _cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        _cellPhone = cellPhone;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getCertified() {
        return _certified;
    }

    public void setCertified(String certified) {
        _certified = certified;
    }

    public Date getCertifiedDate() {
        return _certifiedDate;
    }

    public void setCertifiedDate(Date certifiedDate) {
        _certifiedDate = certifiedDate;
    }

    public String getCertificationNumber() {
        return _certificationNumber;
    }

    public void setCertificationNumber(String certificationNumber) {
        _certificationNumber = certificationNumber;
    }

    public Date getRegistrationDate() {
        return _registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        _registrationDate = registrationDate;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public String getComments() {
        return _comments;
    }

    public void setComments(String comments) {
        _comments = comments;
    }

    public String getDepartmentId() {
        return _departmentId;
    }

    public void setDepartmentId(String departmentId) {
        _departmentId = departmentId;
    }

    public String getEmploymentId() {
        return _employmentId;
    }

    public void setEmploymentId(String employmentId) {
        _employmentId = employmentId;
    }

    public String getDealerId() {
        return _dealerId;
    }

    public void setDealerId(String dealerId) {
        _dealerId = dealerId;
    }

    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;
    }
}
