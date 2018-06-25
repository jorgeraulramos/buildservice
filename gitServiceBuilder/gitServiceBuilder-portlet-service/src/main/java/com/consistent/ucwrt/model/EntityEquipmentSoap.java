package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityEquipmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityEquipmentServiceSoap
 * @generated
 */
public class EntityEquipmentSoap implements Serializable {
    private int _equipmentId;
    private String _equipmentDescription;
    private double _equipmentPurchasePrice;
    private double _equipmentPurchasePriceDll;
    private double _equipmentSalePrice;
    private String _status;
    private int _modelId;
    private int _brandId;
    private int _yearModel;

    public EntityEquipmentSoap() {
    }

    public static EntityEquipmentSoap toSoapModel(EntityEquipment model) {
        EntityEquipmentSoap soapModel = new EntityEquipmentSoap();

        soapModel.setEquipmentId(model.getEquipmentId());
        soapModel.setEquipmentDescription(model.getEquipmentDescription());
        soapModel.setEquipmentPurchasePrice(model.getEquipmentPurchasePrice());
        soapModel.setEquipmentPurchasePriceDll(model.getEquipmentPurchasePriceDll());
        soapModel.setEquipmentSalePrice(model.getEquipmentSalePrice());
        soapModel.setStatus(model.getStatus());
        soapModel.setModelId(model.getModelId());
        soapModel.setBrandId(model.getBrandId());
        soapModel.setYearModel(model.getYearModel());

        return soapModel;
    }

    public static EntityEquipmentSoap[] toSoapModels(EntityEquipment[] models) {
        EntityEquipmentSoap[] soapModels = new EntityEquipmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityEquipmentSoap[][] toSoapModels(
        EntityEquipment[][] models) {
        EntityEquipmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityEquipmentSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityEquipmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityEquipmentSoap[] toSoapModels(
        List<EntityEquipment> models) {
        List<EntityEquipmentSoap> soapModels = new ArrayList<EntityEquipmentSoap>(models.size());

        for (EntityEquipment model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityEquipmentSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _equipmentId;
    }

    public void setPrimaryKey(int pk) {
        setEquipmentId(pk);
    }

    public int getEquipmentId() {
        return _equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        _equipmentId = equipmentId;
    }

    public String getEquipmentDescription() {
        return _equipmentDescription;
    }

    public void setEquipmentDescription(String equipmentDescription) {
        _equipmentDescription = equipmentDescription;
    }

    public double getEquipmentPurchasePrice() {
        return _equipmentPurchasePrice;
    }

    public void setEquipmentPurchasePrice(double equipmentPurchasePrice) {
        _equipmentPurchasePrice = equipmentPurchasePrice;
    }

    public double getEquipmentPurchasePriceDll() {
        return _equipmentPurchasePriceDll;
    }

    public void setEquipmentPurchasePriceDll(double equipmentPurchasePriceDll) {
        _equipmentPurchasePriceDll = equipmentPurchasePriceDll;
    }

    public double getEquipmentSalePrice() {
        return _equipmentSalePrice;
    }

    public void setEquipmentSalePrice(double equipmentSalePrice) {
        _equipmentSalePrice = equipmentSalePrice;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
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
}
