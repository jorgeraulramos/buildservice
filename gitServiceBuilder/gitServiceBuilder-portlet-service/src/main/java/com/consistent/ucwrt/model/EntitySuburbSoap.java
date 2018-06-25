package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntitySuburbServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntitySuburbServiceSoap
 * @generated
 */
public class EntitySuburbSoap implements Serializable {
    private int _suburbId;
    private String _suburbName;
    private String _postalCode;
    private int _municipalId;

    public EntitySuburbSoap() {
    }

    public static EntitySuburbSoap toSoapModel(EntitySuburb model) {
        EntitySuburbSoap soapModel = new EntitySuburbSoap();

        soapModel.setSuburbId(model.getSuburbId());
        soapModel.setSuburbName(model.getSuburbName());
        soapModel.setPostalCode(model.getPostalCode());
        soapModel.setMunicipalId(model.getMunicipalId());

        return soapModel;
    }

    public static EntitySuburbSoap[] toSoapModels(EntitySuburb[] models) {
        EntitySuburbSoap[] soapModels = new EntitySuburbSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntitySuburbSoap[][] toSoapModels(EntitySuburb[][] models) {
        EntitySuburbSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntitySuburbSoap[models.length][models[0].length];
        } else {
            soapModels = new EntitySuburbSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntitySuburbSoap[] toSoapModels(List<EntitySuburb> models) {
        List<EntitySuburbSoap> soapModels = new ArrayList<EntitySuburbSoap>(models.size());

        for (EntitySuburb model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntitySuburbSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _suburbId;
    }

    public void setPrimaryKey(int pk) {
        setSuburbId(pk);
    }

    public int getSuburbId() {
        return _suburbId;
    }

    public void setSuburbId(int suburbId) {
        _suburbId = suburbId;
    }

    public String getSuburbName() {
        return _suburbName;
    }

    public void setSuburbName(String suburbName) {
        _suburbName = suburbName;
    }

    public String getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(String postalCode) {
        _postalCode = postalCode;
    }

    public int getMunicipalId() {
        return _municipalId;
    }

    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;
    }
}
