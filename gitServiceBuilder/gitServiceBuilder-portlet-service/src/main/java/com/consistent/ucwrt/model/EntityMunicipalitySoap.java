package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityMunicipalityServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityMunicipalityServiceSoap
 * @generated
 */
public class EntityMunicipalitySoap implements Serializable {
    private int _municipalId;
    private String _municipalName;
    private int _stateId;

    public EntityMunicipalitySoap() {
    }

    public static EntityMunicipalitySoap toSoapModel(EntityMunicipality model) {
        EntityMunicipalitySoap soapModel = new EntityMunicipalitySoap();

        soapModel.setMunicipalId(model.getMunicipalId());
        soapModel.setMunicipalName(model.getMunicipalName());
        soapModel.setStateId(model.getStateId());

        return soapModel;
    }

    public static EntityMunicipalitySoap[] toSoapModels(
        EntityMunicipality[] models) {
        EntityMunicipalitySoap[] soapModels = new EntityMunicipalitySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityMunicipalitySoap[][] toSoapModels(
        EntityMunicipality[][] models) {
        EntityMunicipalitySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityMunicipalitySoap[models.length][models[0].length];
        } else {
            soapModels = new EntityMunicipalitySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityMunicipalitySoap[] toSoapModels(
        List<EntityMunicipality> models) {
        List<EntityMunicipalitySoap> soapModels = new ArrayList<EntityMunicipalitySoap>(models.size());

        for (EntityMunicipality model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityMunicipalitySoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _municipalId;
    }

    public void setPrimaryKey(int pk) {
        setMunicipalId(pk);
    }

    public int getMunicipalId() {
        return _municipalId;
    }

    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;
    }

    public String getMunicipalName() {
        return _municipalName;
    }

    public void setMunicipalName(String municipalName) {
        _municipalName = municipalName;
    }

    public int getStateId() {
        return _stateId;
    }

    public void setStateId(int stateId) {
        _stateId = stateId;
    }
}
