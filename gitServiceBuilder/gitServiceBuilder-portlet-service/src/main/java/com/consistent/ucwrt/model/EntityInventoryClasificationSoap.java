package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityInventoryClasificationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityInventoryClasificationServiceSoap
 * @generated
 */
public class EntityInventoryClasificationSoap implements Serializable {
    private int _inventoryClasificationId;
    private String _inventoryClasification;

    public EntityInventoryClasificationSoap() {
    }

    public static EntityInventoryClasificationSoap toSoapModel(
        EntityInventoryClasification model) {
        EntityInventoryClasificationSoap soapModel = new EntityInventoryClasificationSoap();

        soapModel.setInventoryClasificationId(model.getInventoryClasificationId());
        soapModel.setInventoryClasification(model.getInventoryClasification());

        return soapModel;
    }

    public static EntityInventoryClasificationSoap[] toSoapModels(
        EntityInventoryClasification[] models) {
        EntityInventoryClasificationSoap[] soapModels = new EntityInventoryClasificationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityInventoryClasificationSoap[][] toSoapModels(
        EntityInventoryClasification[][] models) {
        EntityInventoryClasificationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityInventoryClasificationSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityInventoryClasificationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityInventoryClasificationSoap[] toSoapModels(
        List<EntityInventoryClasification> models) {
        List<EntityInventoryClasificationSoap> soapModels = new ArrayList<EntityInventoryClasificationSoap>(models.size());

        for (EntityInventoryClasification model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityInventoryClasificationSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _inventoryClasificationId;
    }

    public void setPrimaryKey(int pk) {
        setInventoryClasificationId(pk);
    }

    public int getInventoryClasificationId() {
        return _inventoryClasificationId;
    }

    public void setInventoryClasificationId(int inventoryClasificationId) {
        _inventoryClasificationId = inventoryClasificationId;
    }

    public String getInventoryClasification() {
        return _inventoryClasification;
    }

    public void setInventoryClasification(String inventoryClasification) {
        _inventoryClasification = inventoryClasification;
    }
}
