package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityStateServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityStateServiceSoap
 * @generated
 */
public class EntityStateSoap implements Serializable {
    private int _stateId;
    private String _stateName;
    private String _capitalName;

    public EntityStateSoap() {
    }

    public static EntityStateSoap toSoapModel(EntityState model) {
        EntityStateSoap soapModel = new EntityStateSoap();

        soapModel.setStateId(model.getStateId());
        soapModel.setStateName(model.getStateName());
        soapModel.setCapitalName(model.getCapitalName());

        return soapModel;
    }

    public static EntityStateSoap[] toSoapModels(EntityState[] models) {
        EntityStateSoap[] soapModels = new EntityStateSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityStateSoap[][] toSoapModels(EntityState[][] models) {
        EntityStateSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityStateSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityStateSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityStateSoap[] toSoapModels(List<EntityState> models) {
        List<EntityStateSoap> soapModels = new ArrayList<EntityStateSoap>(models.size());

        for (EntityState model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityStateSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _stateId;
    }

    public void setPrimaryKey(int pk) {
        setStateId(pk);
    }

    public int getStateId() {
        return _stateId;
    }

    public void setStateId(int stateId) {
        _stateId = stateId;
    }

    public String getStateName() {
        return _stateName;
    }

    public void setStateName(String stateName) {
        _stateName = stateName;
    }

    public String getCapitalName() {
        return _capitalName;
    }

    public void setCapitalName(String capitalName) {
        _capitalName = capitalName;
    }
}
