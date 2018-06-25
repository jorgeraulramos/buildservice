package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityBrandServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityBrandServiceSoap
 * @generated
 */
public class EntityBrandSoap implements Serializable {
    private int _brandId;
    private String _brandName;
    private String _brandDescription;
    private Date _brandRegistrationDate;
    private String _registerData;
    private String _responsibleUser;

    public EntityBrandSoap() {
    }

    public static EntityBrandSoap toSoapModel(EntityBrand model) {
        EntityBrandSoap soapModel = new EntityBrandSoap();

        soapModel.setBrandId(model.getBrandId());
        soapModel.setBrandName(model.getBrandName());
        soapModel.setBrandDescription(model.getBrandDescription());
        soapModel.setBrandRegistrationDate(model.getBrandRegistrationDate());
        soapModel.setRegisterData(model.getRegisterData());
        soapModel.setResponsibleUser(model.getResponsibleUser());

        return soapModel;
    }

    public static EntityBrandSoap[] toSoapModels(EntityBrand[] models) {
        EntityBrandSoap[] soapModels = new EntityBrandSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityBrandSoap[][] toSoapModels(EntityBrand[][] models) {
        EntityBrandSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityBrandSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityBrandSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityBrandSoap[] toSoapModels(List<EntityBrand> models) {
        List<EntityBrandSoap> soapModels = new ArrayList<EntityBrandSoap>(models.size());

        for (EntityBrand model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityBrandSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _brandId;
    }

    public void setPrimaryKey(int pk) {
        setBrandId(pk);
    }

    public int getBrandId() {
        return _brandId;
    }

    public void setBrandId(int brandId) {
        _brandId = brandId;
    }

    public String getBrandName() {
        return _brandName;
    }

    public void setBrandName(String brandName) {
        _brandName = brandName;
    }

    public String getBrandDescription() {
        return _brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        _brandDescription = brandDescription;
    }

    public Date getBrandRegistrationDate() {
        return _brandRegistrationDate;
    }

    public void setBrandRegistrationDate(Date brandRegistrationDate) {
        _brandRegistrationDate = brandRegistrationDate;
    }

    public String getRegisterData() {
        return _registerData;
    }

    public void setRegisterData(String registerData) {
        _registerData = registerData;
    }

    public String getResponsibleUser() {
        return _responsibleUser;
    }

    public void setResponsibleUser(String responsibleUser) {
        _responsibleUser = responsibleUser;
    }
}
