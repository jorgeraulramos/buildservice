package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntitySourceOfSupplyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntitySourceOfSupplyServiceSoap
 * @generated
 */
public class EntitySourceOfSupplySoap implements Serializable {
    private int _sourceSupplyId;
    private String _sourceOfSupply;

    public EntitySourceOfSupplySoap() {
    }

    public static EntitySourceOfSupplySoap toSoapModel(
        EntitySourceOfSupply model) {
        EntitySourceOfSupplySoap soapModel = new EntitySourceOfSupplySoap();

        soapModel.setSourceSupplyId(model.getSourceSupplyId());
        soapModel.setSourceOfSupply(model.getSourceOfSupply());

        return soapModel;
    }

    public static EntitySourceOfSupplySoap[] toSoapModels(
        EntitySourceOfSupply[] models) {
        EntitySourceOfSupplySoap[] soapModels = new EntitySourceOfSupplySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntitySourceOfSupplySoap[][] toSoapModels(
        EntitySourceOfSupply[][] models) {
        EntitySourceOfSupplySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntitySourceOfSupplySoap[models.length][models[0].length];
        } else {
            soapModels = new EntitySourceOfSupplySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntitySourceOfSupplySoap[] toSoapModels(
        List<EntitySourceOfSupply> models) {
        List<EntitySourceOfSupplySoap> soapModels = new ArrayList<EntitySourceOfSupplySoap>(models.size());

        for (EntitySourceOfSupply model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntitySourceOfSupplySoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _sourceSupplyId;
    }

    public void setPrimaryKey(int pk) {
        setSourceSupplyId(pk);
    }

    public int getSourceSupplyId() {
        return _sourceSupplyId;
    }

    public void setSourceSupplyId(int sourceSupplyId) {
        _sourceSupplyId = sourceSupplyId;
    }

    public String getSourceOfSupply() {
        return _sourceOfSupply;
    }

    public void setSourceOfSupply(String sourceOfSupply) {
        _sourceOfSupply = sourceOfSupply;
    }
}
