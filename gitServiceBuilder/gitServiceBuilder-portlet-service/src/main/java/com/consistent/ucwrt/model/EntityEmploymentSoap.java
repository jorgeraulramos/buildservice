package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityEmploymentPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityEmploymentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityEmploymentServiceSoap
 * @generated
 */
public class EntityEmploymentSoap implements Serializable {
    private String _employmentId;
    private String _employmentName;

    public EntityEmploymentSoap() {
    }

    public static EntityEmploymentSoap toSoapModel(EntityEmployment model) {
        EntityEmploymentSoap soapModel = new EntityEmploymentSoap();

        soapModel.setEmploymentId(model.getEmploymentId());
        soapModel.setEmploymentName(model.getEmploymentName());

        return soapModel;
    }

    public static EntityEmploymentSoap[] toSoapModels(EntityEmployment[] models) {
        EntityEmploymentSoap[] soapModels = new EntityEmploymentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityEmploymentSoap[][] toSoapModels(
        EntityEmployment[][] models) {
        EntityEmploymentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityEmploymentSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityEmploymentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityEmploymentSoap[] toSoapModels(
        List<EntityEmployment> models) {
        List<EntityEmploymentSoap> soapModels = new ArrayList<EntityEmploymentSoap>(models.size());

        for (EntityEmployment model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityEmploymentSoap[soapModels.size()]);
    }

    public EntityEmploymentPK getPrimaryKey() {
        return new EntityEmploymentPK(_employmentId, _employmentName);
    }

    public void setPrimaryKey(EntityEmploymentPK pk) {
        setEmploymentId(pk.employmentId);
        setEmploymentName(pk.employmentName);
    }

    public String getEmploymentId() {
        return _employmentId;
    }

    public void setEmploymentId(String employmentId) {
        _employmentId = employmentId;
    }

    public String getEmploymentName() {
        return _employmentName;
    }

    public void setEmploymentName(String employmentName) {
        _employmentName = employmentName;
    }
}
