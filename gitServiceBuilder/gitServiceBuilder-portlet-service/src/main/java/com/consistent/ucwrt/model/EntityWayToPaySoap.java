package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityWayToPayServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityWayToPayServiceSoap
 * @generated
 */
public class EntityWayToPaySoap implements Serializable {
    private int _wayPayId;
    private String _payName;

    public EntityWayToPaySoap() {
    }

    public static EntityWayToPaySoap toSoapModel(EntityWayToPay model) {
        EntityWayToPaySoap soapModel = new EntityWayToPaySoap();

        soapModel.setWayPayId(model.getWayPayId());
        soapModel.setPayName(model.getPayName());

        return soapModel;
    }

    public static EntityWayToPaySoap[] toSoapModels(EntityWayToPay[] models) {
        EntityWayToPaySoap[] soapModels = new EntityWayToPaySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityWayToPaySoap[][] toSoapModels(EntityWayToPay[][] models) {
        EntityWayToPaySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityWayToPaySoap[models.length][models[0].length];
        } else {
            soapModels = new EntityWayToPaySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityWayToPaySoap[] toSoapModels(List<EntityWayToPay> models) {
        List<EntityWayToPaySoap> soapModels = new ArrayList<EntityWayToPaySoap>(models.size());

        for (EntityWayToPay model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityWayToPaySoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _wayPayId;
    }

    public void setPrimaryKey(int pk) {
        setWayPayId(pk);
    }

    public int getWayPayId() {
        return _wayPayId;
    }

    public void setWayPayId(int wayPayId) {
        _wayPayId = wayPayId;
    }

    public String getPayName() {
        return _payName;
    }

    public void setPayName(String payName) {
        _payName = payName;
    }
}
