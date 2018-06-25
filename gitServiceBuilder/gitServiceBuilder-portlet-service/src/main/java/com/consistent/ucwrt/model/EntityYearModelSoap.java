package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityYearModelServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityYearModelServiceSoap
 * @generated
 */
public class EntityYearModelSoap implements Serializable {
    private int _yearModel;
    private Date _yearModelRegistrationDate;
    private String _yearModelRegisterData;
    private String _yModelResponsibleUser;
    private String _yearModelDescription;

    public EntityYearModelSoap() {
    }

    public static EntityYearModelSoap toSoapModel(EntityYearModel model) {
        EntityYearModelSoap soapModel = new EntityYearModelSoap();

        soapModel.setYearModel(model.getYearModel());
        soapModel.setYearModelRegistrationDate(model.getYearModelRegistrationDate());
        soapModel.setYearModelRegisterData(model.getYearModelRegisterData());
        soapModel.setYModelResponsibleUser(model.getYModelResponsibleUser());
        soapModel.setYearModelDescription(model.getYearModelDescription());

        return soapModel;
    }

    public static EntityYearModelSoap[] toSoapModels(EntityYearModel[] models) {
        EntityYearModelSoap[] soapModels = new EntityYearModelSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityYearModelSoap[][] toSoapModels(
        EntityYearModel[][] models) {
        EntityYearModelSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityYearModelSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityYearModelSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityYearModelSoap[] toSoapModels(
        List<EntityYearModel> models) {
        List<EntityYearModelSoap> soapModels = new ArrayList<EntityYearModelSoap>(models.size());

        for (EntityYearModel model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityYearModelSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _yearModel;
    }

    public void setPrimaryKey(int pk) {
        setYearModel(pk);
    }

    public int getYearModel() {
        return _yearModel;
    }

    public void setYearModel(int yearModel) {
        _yearModel = yearModel;
    }

    public Date getYearModelRegistrationDate() {
        return _yearModelRegistrationDate;
    }

    public void setYearModelRegistrationDate(Date yearModelRegistrationDate) {
        _yearModelRegistrationDate = yearModelRegistrationDate;
    }

    public String getYearModelRegisterData() {
        return _yearModelRegisterData;
    }

    public void setYearModelRegisterData(String yearModelRegisterData) {
        _yearModelRegisterData = yearModelRegisterData;
    }

    public String getYModelResponsibleUser() {
        return _yModelResponsibleUser;
    }

    public void setYModelResponsibleUser(String yModelResponsibleUser) {
        _yModelResponsibleUser = yModelResponsibleUser;
    }

    public String getYearModelDescription() {
        return _yearModelDescription;
    }

    public void setYearModelDescription(String yearModelDescription) {
        _yearModelDescription = yearModelDescription;
    }
}
