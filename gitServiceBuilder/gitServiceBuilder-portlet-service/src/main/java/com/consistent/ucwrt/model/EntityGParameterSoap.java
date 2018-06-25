package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityGParameterServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityGParameterServiceSoap
 * @generated
 */
public class EntityGParameterSoap implements Serializable {
    private String _parameterName;
    private String _value;
    private String _description;

    public EntityGParameterSoap() {
    }

    public static EntityGParameterSoap toSoapModel(EntityGParameter model) {
        EntityGParameterSoap soapModel = new EntityGParameterSoap();

        soapModel.setParameterName(model.getParameterName());
        soapModel.setValue(model.getValue());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static EntityGParameterSoap[] toSoapModels(EntityGParameter[] models) {
        EntityGParameterSoap[] soapModels = new EntityGParameterSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityGParameterSoap[][] toSoapModels(
        EntityGParameter[][] models) {
        EntityGParameterSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityGParameterSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityGParameterSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityGParameterSoap[] toSoapModels(
        List<EntityGParameter> models) {
        List<EntityGParameterSoap> soapModels = new ArrayList<EntityGParameterSoap>(models.size());

        for (EntityGParameter model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityGParameterSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _parameterName;
    }

    public void setPrimaryKey(String pk) {
        setParameterName(pk);
    }

    public String getParameterName() {
        return _parameterName;
    }

    public void setParameterName(String parameterName) {
        _parameterName = parameterName;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}
