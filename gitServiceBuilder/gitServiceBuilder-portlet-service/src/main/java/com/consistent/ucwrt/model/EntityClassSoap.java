package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityClassServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityClassServiceSoap
 * @generated
 */
public class EntityClassSoap implements Serializable {
    private int _classId;
    private String _className;

    public EntityClassSoap() {
    }

    public static EntityClassSoap toSoapModel(EntityClass model) {
        EntityClassSoap soapModel = new EntityClassSoap();

        soapModel.setClassId(model.getClassId());
        soapModel.setClassName(model.getClassName());

        return soapModel;
    }

    public static EntityClassSoap[] toSoapModels(EntityClass[] models) {
        EntityClassSoap[] soapModels = new EntityClassSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityClassSoap[][] toSoapModels(EntityClass[][] models) {
        EntityClassSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityClassSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityClassSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityClassSoap[] toSoapModels(List<EntityClass> models) {
        List<EntityClassSoap> soapModels = new ArrayList<EntityClassSoap>(models.size());

        for (EntityClass model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityClassSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _classId;
    }

    public void setPrimaryKey(int pk) {
        setClassId(pk);
    }

    public int getClassId() {
        return _classId;
    }

    public void setClassId(int classId) {
        _classId = classId;
    }

    public String getClassName() {
        return _className;
    }

    public void setClassName(String className) {
        _className = className;
    }
}
