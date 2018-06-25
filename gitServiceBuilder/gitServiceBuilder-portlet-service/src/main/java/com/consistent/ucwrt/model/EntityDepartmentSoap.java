package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityDepartmentPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityDepartmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityDepartmentServiceSoap
 * @generated
 */
public class EntityDepartmentSoap implements Serializable {
    private String _departmentId;
    private String _departmentName;

    public EntityDepartmentSoap() {
    }

    public static EntityDepartmentSoap toSoapModel(EntityDepartment model) {
        EntityDepartmentSoap soapModel = new EntityDepartmentSoap();

        soapModel.setDepartmentId(model.getDepartmentId());
        soapModel.setDepartmentName(model.getDepartmentName());

        return soapModel;
    }

    public static EntityDepartmentSoap[] toSoapModels(EntityDepartment[] models) {
        EntityDepartmentSoap[] soapModels = new EntityDepartmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityDepartmentSoap[][] toSoapModels(
        EntityDepartment[][] models) {
        EntityDepartmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityDepartmentSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityDepartmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityDepartmentSoap[] toSoapModels(
        List<EntityDepartment> models) {
        List<EntityDepartmentSoap> soapModels = new ArrayList<EntityDepartmentSoap>(models.size());

        for (EntityDepartment model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityDepartmentSoap[soapModels.size()]);
    }

    public EntityDepartmentPK getPrimaryKey() {
        return new EntityDepartmentPK(_departmentId, _departmentName);
    }

    public void setPrimaryKey(EntityDepartmentPK pk) {
        setDepartmentId(pk.departmentId);
        setDepartmentName(pk.departmentName);
    }

    public String getDepartmentId() {
        return _departmentId;
    }

    public void setDepartmentId(String departmentId) {
        _departmentId = departmentId;
    }

    public String getDepartmentName() {
        return _departmentName;
    }

    public void setDepartmentName(String departmentName) {
        _departmentName = departmentName;
    }
}
