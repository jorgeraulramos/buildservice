package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityVersionAutoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityVersionAutoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityVersionAutoServiceSoap
 * @generated
 */
public class EntityVersionAutoSoap implements Serializable {
    private int _versionId;
    private String _versionName;
    private Date _versionRegistrationDate;
    private String _versionResponsibleUser;
    private String _versionRegisterData;
    private double _purchasePrice;
    private double _salePrice;
    private double _purchasePriceDll;
    private String _typeload;
    private String _colorName;
    private int _modelId;
    private int _brandId;
    private int _yearModel;
    private int _classId;

    public EntityVersionAutoSoap() {
    }

    public static EntityVersionAutoSoap toSoapModel(EntityVersionAuto model) {
        EntityVersionAutoSoap soapModel = new EntityVersionAutoSoap();

        soapModel.setVersionId(model.getVersionId());
        soapModel.setVersionName(model.getVersionName());
        soapModel.setVersionRegistrationDate(model.getVersionRegistrationDate());
        soapModel.setVersionResponsibleUser(model.getVersionResponsibleUser());
        soapModel.setVersionRegisterData(model.getVersionRegisterData());
        soapModel.setPurchasePrice(model.getPurchasePrice());
        soapModel.setSalePrice(model.getSalePrice());
        soapModel.setPurchasePriceDll(model.getPurchasePriceDll());
        soapModel.setTypeload(model.getTypeload());
        soapModel.setColorName(model.getColorName());
        soapModel.setModelId(model.getModelId());
        soapModel.setBrandId(model.getBrandId());
        soapModel.setYearModel(model.getYearModel());
        soapModel.setClassId(model.getClassId());

        return soapModel;
    }

    public static EntityVersionAutoSoap[] toSoapModels(
        EntityVersionAuto[] models) {
        EntityVersionAutoSoap[] soapModels = new EntityVersionAutoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityVersionAutoSoap[][] toSoapModels(
        EntityVersionAuto[][] models) {
        EntityVersionAutoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityVersionAutoSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityVersionAutoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityVersionAutoSoap[] toSoapModels(
        List<EntityVersionAuto> models) {
        List<EntityVersionAutoSoap> soapModels = new ArrayList<EntityVersionAutoSoap>(models.size());

        for (EntityVersionAuto model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityVersionAutoSoap[soapModels.size()]);
    }

    public EntityVersionAutoPK getPrimaryKey() {
        return new EntityVersionAutoPK(_versionId, _modelId, _brandId,
            _yearModel);
    }

    public void setPrimaryKey(EntityVersionAutoPK pk) {
        setVersionId(pk.versionId);
        setModelId(pk.modelId);
        setBrandId(pk.brandId);
        setYearModel(pk.yearModel);
    }

    public int getVersionId() {
        return _versionId;
    }

    public void setVersionId(int versionId) {
        _versionId = versionId;
    }

    public String getVersionName() {
        return _versionName;
    }

    public void setVersionName(String versionName) {
        _versionName = versionName;
    }

    public Date getVersionRegistrationDate() {
        return _versionRegistrationDate;
    }

    public void setVersionRegistrationDate(Date versionRegistrationDate) {
        _versionRegistrationDate = versionRegistrationDate;
    }

    public String getVersionResponsibleUser() {
        return _versionResponsibleUser;
    }

    public void setVersionResponsibleUser(String versionResponsibleUser) {
        _versionResponsibleUser = versionResponsibleUser;
    }

    public String getVersionRegisterData() {
        return _versionRegisterData;
    }

    public void setVersionRegisterData(String versionRegisterData) {
        _versionRegisterData = versionRegisterData;
    }

    public double getPurchasePrice() {
        return _purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        _purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return _salePrice;
    }

    public void setSalePrice(double salePrice) {
        _salePrice = salePrice;
    }

    public double getPurchasePriceDll() {
        return _purchasePriceDll;
    }

    public void setPurchasePriceDll(double purchasePriceDll) {
        _purchasePriceDll = purchasePriceDll;
    }

    public String getTypeload() {
        return _typeload;
    }

    public void setTypeload(String typeload) {
        _typeload = typeload;
    }

    public String getColorName() {
        return _colorName;
    }

    public void setColorName(String colorName) {
        _colorName = colorName;
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

    public int getClassId() {
        return _classId;
    }

    public void setClassId(int classId) {
        _classId = classId;
    }
}
