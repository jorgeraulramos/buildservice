package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityYearModelClassPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityYearModelClassServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityYearModelClassServiceSoap
 * @generated
 */
public class EntityYearModelClassSoap implements Serializable {
    private int _classId;
    private int _yearModel;
    private int _startKilometer;
    private int _finishKilometers;
    private double _price;

    public EntityYearModelClassSoap() {
    }

    public static EntityYearModelClassSoap toSoapModel(
        EntityYearModelClass model) {
        EntityYearModelClassSoap soapModel = new EntityYearModelClassSoap();

        soapModel.setClassId(model.getClassId());
        soapModel.setYearModel(model.getYearModel());
        soapModel.setStartKilometer(model.getStartKilometer());
        soapModel.setFinishKilometers(model.getFinishKilometers());
        soapModel.setPrice(model.getPrice());

        return soapModel;
    }

    public static EntityYearModelClassSoap[] toSoapModels(
        EntityYearModelClass[] models) {
        EntityYearModelClassSoap[] soapModels = new EntityYearModelClassSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityYearModelClassSoap[][] toSoapModels(
        EntityYearModelClass[][] models) {
        EntityYearModelClassSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityYearModelClassSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityYearModelClassSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityYearModelClassSoap[] toSoapModels(
        List<EntityYearModelClass> models) {
        List<EntityYearModelClassSoap> soapModels = new ArrayList<EntityYearModelClassSoap>(models.size());

        for (EntityYearModelClass model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityYearModelClassSoap[soapModels.size()]);
    }

    public EntityYearModelClassPK getPrimaryKey() {
        return new EntityYearModelClassPK(_classId, _yearModel,
            _startKilometer, _finishKilometers);
    }

    public void setPrimaryKey(EntityYearModelClassPK pk) {
        setClassId(pk.classId);
        setYearModel(pk.yearModel);
        setStartKilometer(pk.startKilometer);
        setFinishKilometers(pk.finishKilometers);
    }

    public int getClassId() {
        return _classId;
    }

    public void setClassId(int classId) {
        _classId = classId;
    }

    public int getYearModel() {
        return _yearModel;
    }

    public void setYearModel(int yearModel) {
        _yearModel = yearModel;
    }

    public int getStartKilometer() {
        return _startKilometer;
    }

    public void setStartKilometer(int startKilometer) {
        _startKilometer = startKilometer;
    }

    public int getFinishKilometers() {
        return _finishKilometers;
    }

    public void setFinishKilometers(int finishKilometers) {
        _finishKilometers = finishKilometers;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }
}
