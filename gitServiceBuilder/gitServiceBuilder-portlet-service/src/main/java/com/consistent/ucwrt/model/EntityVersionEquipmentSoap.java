package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityVersionEquipmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityVersionEquipmentServiceSoap
 * @generated
 */
public class EntityVersionEquipmentSoap implements Serializable {
    private int _equipmentId;
    private int _versionId;
    private int _modelId;
    private String _brandName;
    private int _yearModel;

    public EntityVersionEquipmentSoap() {
    }

    public static EntityVersionEquipmentSoap toSoapModel(
        EntityVersionEquipment model) {
        EntityVersionEquipmentSoap soapModel = new EntityVersionEquipmentSoap();

        soapModel.setEquipmentId(model.getEquipmentId());
        soapModel.setVersionId(model.getVersionId());
        soapModel.setModelId(model.getModelId());
        soapModel.setBrandName(model.getBrandName());
        soapModel.setYearModel(model.getYearModel());

        return soapModel;
    }

    public static EntityVersionEquipmentSoap[] toSoapModels(
        EntityVersionEquipment[] models) {
        EntityVersionEquipmentSoap[] soapModels = new EntityVersionEquipmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityVersionEquipmentSoap[][] toSoapModels(
        EntityVersionEquipment[][] models) {
        EntityVersionEquipmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityVersionEquipmentSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityVersionEquipmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityVersionEquipmentSoap[] toSoapModels(
        List<EntityVersionEquipment> models) {
        List<EntityVersionEquipmentSoap> soapModels = new ArrayList<EntityVersionEquipmentSoap>(models.size());

        for (EntityVersionEquipment model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityVersionEquipmentSoap[soapModels.size()]);
    }

    public EntityVersionEquipmentPK getPrimaryKey() {
        return new EntityVersionEquipmentPK(_equipmentId, _versionId, _modelId,
            _brandName, _yearModel);
    }

    public void setPrimaryKey(EntityVersionEquipmentPK pk) {
        setEquipmentId(pk.equipmentId);
        setVersionId(pk.versionId);
        setModelId(pk.modelId);
        setBrandName(pk.brandName);
        setYearModel(pk.yearModel);
    }

    public int getEquipmentId() {
        return _equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        _equipmentId = equipmentId;
    }

    public int getVersionId() {
        return _versionId;
    }

    public void setVersionId(int versionId) {
        _versionId = versionId;
    }

    public int getModelId() {
        return _modelId;
    }

    public void setModelId(int modelId) {
        _modelId = modelId;
    }

    public String getBrandName() {
        return _brandName;
    }

    public void setBrandName(String brandName) {
        _brandName = brandName;
    }

    public int getYearModel() {
        return _yearModel;
    }

    public void setYearModel(int yearModel) {
        _yearModel = yearModel;
    }
}
