package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityProspectionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityProspectionServiceSoap
 * @generated
 */
public class EntityProspectionSoap implements Serializable {
    private int _prospectionId;
    private String _prospectionName;
    private int _eventId;

    public EntityProspectionSoap() {
    }

    public static EntityProspectionSoap toSoapModel(EntityProspection model) {
        EntityProspectionSoap soapModel = new EntityProspectionSoap();

        soapModel.setProspectionId(model.getProspectionId());
        soapModel.setProspectionName(model.getProspectionName());
        soapModel.setEventId(model.getEventId());

        return soapModel;
    }

    public static EntityProspectionSoap[] toSoapModels(
        EntityProspection[] models) {
        EntityProspectionSoap[] soapModels = new EntityProspectionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityProspectionSoap[][] toSoapModels(
        EntityProspection[][] models) {
        EntityProspectionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityProspectionSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityProspectionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityProspectionSoap[] toSoapModels(
        List<EntityProspection> models) {
        List<EntityProspectionSoap> soapModels = new ArrayList<EntityProspectionSoap>(models.size());

        for (EntityProspection model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityProspectionSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _prospectionId;
    }

    public void setPrimaryKey(int pk) {
        setProspectionId(pk);
    }

    public int getProspectionId() {
        return _prospectionId;
    }

    public void setProspectionId(int prospectionId) {
        _prospectionId = prospectionId;
    }

    public String getProspectionName() {
        return _prospectionName;
    }

    public void setProspectionName(String prospectionName) {
        _prospectionName = prospectionName;
    }

    public int getEventId() {
        return _eventId;
    }

    public void setEventId(int eventId) {
        _eventId = eventId;
    }
}
