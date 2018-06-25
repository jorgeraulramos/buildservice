package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityStatusServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityStatusServiceSoap
 * @generated
 */
public class EntityStatusSoap implements Serializable {
    private String _statusName;

    public EntityStatusSoap() {
    }

    public static EntityStatusSoap toSoapModel(EntityStatus model) {
        EntityStatusSoap soapModel = new EntityStatusSoap();

        soapModel.setStatusName(model.getStatusName());

        return soapModel;
    }

    public static EntityStatusSoap[] toSoapModels(EntityStatus[] models) {
        EntityStatusSoap[] soapModels = new EntityStatusSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityStatusSoap[][] toSoapModels(EntityStatus[][] models) {
        EntityStatusSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityStatusSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityStatusSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityStatusSoap[] toSoapModels(List<EntityStatus> models) {
        List<EntityStatusSoap> soapModels = new ArrayList<EntityStatusSoap>(models.size());

        for (EntityStatus model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityStatusSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _statusName;
    }

    public void setPrimaryKey(String pk) {
        setStatusName(pk);
    }

    public String getStatusName() {
        return _statusName;
    }

    public void setStatusName(String statusName) {
        _statusName = statusName;
    }
}
