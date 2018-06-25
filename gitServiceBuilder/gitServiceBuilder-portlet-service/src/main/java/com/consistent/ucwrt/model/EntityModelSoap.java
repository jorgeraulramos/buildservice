package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityModelPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityModelServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityModelServiceSoap
 * @generated
 */
public class EntityModelSoap implements Serializable {
    private int _modelId;
    private int _brandId;
    private int _yearModel;
    private String _modelName;
    private String _modelDescription;
    private Date _modelRegistrationDate;
    private String _modelRegisterData;
    private String _modelResponsibleUser;

    public EntityModelSoap() {
    }

    public static EntityModelSoap toSoapModel(EntityModel model) {
        EntityModelSoap soapModel = new EntityModelSoap();

        soapModel.setModelId(model.getModelId());
        soapModel.setBrandId(model.getBrandId());
        soapModel.setYearModel(model.getYearModel());
        soapModel.setModelName(model.getModelName());
        soapModel.setModelDescription(model.getModelDescription());
        soapModel.setModelRegistrationDate(model.getModelRegistrationDate());
        soapModel.setModelRegisterData(model.getModelRegisterData());
        soapModel.setModelResponsibleUser(model.getModelResponsibleUser());

        return soapModel;
    }

    public static EntityModelSoap[] toSoapModels(EntityModel[] models) {
        EntityModelSoap[] soapModels = new EntityModelSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityModelSoap[][] toSoapModels(EntityModel[][] models) {
        EntityModelSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityModelSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityModelSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityModelSoap[] toSoapModels(List<EntityModel> models) {
        List<EntityModelSoap> soapModels = new ArrayList<EntityModelSoap>(models.size());

        for (EntityModel model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityModelSoap[soapModels.size()]);
    }

    public EntityModelPK getPrimaryKey() {
        return new EntityModelPK(_modelId, _brandId, _yearModel);
    }

    public void setPrimaryKey(EntityModelPK pk) {
        setModelId(pk.modelId);
        setBrandId(pk.brandId);
        setYearModel(pk.yearModel);
    }

    public int getModelId() {
        return _modelId;
    }

    public void setModelId(int modelId) {
        _modelId = modelId;
    }

    public int getBrandId() {
        return _brandId;
    }

    public void setBrandId(int brandId) {
        _brandId = brandId;
    }

    public int getYearModel() {
        return _yearModel;
    }

    public void setYearModel(int yearModel) {
        _yearModel = yearModel;
    }

    public String getModelName() {
        return _modelName;
    }

    public void setModelName(String modelName) {
        _modelName = modelName;
    }

    public String getModelDescription() {
        return _modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        _modelDescription = modelDescription;
    }

    public Date getModelRegistrationDate() {
        return _modelRegistrationDate;
    }

    public void setModelRegistrationDate(Date modelRegistrationDate) {
        _modelRegistrationDate = modelRegistrationDate;
    }

    public String getModelRegisterData() {
        return _modelRegisterData;
    }

    public void setModelRegisterData(String modelRegisterData) {
        _modelRegisterData = modelRegisterData;
    }

    public String getModelResponsibleUser() {
        return _modelResponsibleUser;
    }

    public void setModelResponsibleUser(String modelResponsibleUser) {
        _modelResponsibleUser = modelResponsibleUser;
    }
}
