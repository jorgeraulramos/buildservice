package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityCustomerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityCustomerServiceSoap
 * @generated
 */
public class EntityCustomerSoap implements Serializable {
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

    public EntityCustomerSoap() {
    }

    public static EntityCustomerSoap toSoapModel(EntityCustomer model) {
        EntityCustomerSoap soapModel = new EntityCustomerSoap();

        soapModel.setClientId(model.getClientId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());
        soapModel.setSecondLastName(model.getSecondLastName());
        soapModel.setEmail(model.getEmail());
        soapModel.setRfc(model.getRfc());
        soapModel.setCellPhone(model.getCellPhone());
        soapModel.setLegalPersonality(model.getLegalPersonality());
        soapModel.setPersonType(model.getPersonType());
        soapModel.setPhone(model.getPhone());
        soapModel.setRegistrationDate(model.getRegistrationDate());
        soapModel.setComments(model.getComments());
        soapModel.setDealerId(model.getDealerId());
        soapModel.setBusinessBrandName(model.getBusinessBrandName());

        return soapModel;
    }

    public static EntityCustomerSoap[] toSoapModels(EntityCustomer[] models) {
        EntityCustomerSoap[] soapModels = new EntityCustomerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityCustomerSoap[][] toSoapModels(EntityCustomer[][] models) {
        EntityCustomerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityCustomerSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityCustomerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityCustomerSoap[] toSoapModels(List<EntityCustomer> models) {
        List<EntityCustomerSoap> soapModels = new ArrayList<EntityCustomerSoap>(models.size());

        for (EntityCustomer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityCustomerSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _clientId;
    }

    public void setPrimaryKey(int pk) {
        setClientId(pk);
    }

    public int getClientId() {
        return _clientId;
    }

    public void setClientId(int clientId) {
        _clientId = clientId;
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

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getRfc() {
        return _rfc;
    }

    public void setRfc(String rfc) {
        _rfc = rfc;
    }

    public String getCellPhone() {
        return _cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        _cellPhone = cellPhone;
    }

    public String getLegalPersonality() {
        return _legalPersonality;
    }

    public void setLegalPersonality(String legalPersonality) {
        _legalPersonality = legalPersonality;
    }

    public String getPersonType() {
        return _personType;
    }

    public void setPersonType(String personType) {
        _personType = personType;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public Date getRegistrationDate() {
        return _registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        _registrationDate = registrationDate;
    }

    public String getComments() {
        return _comments;
    }

    public void setComments(String comments) {
        _comments = comments;
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
