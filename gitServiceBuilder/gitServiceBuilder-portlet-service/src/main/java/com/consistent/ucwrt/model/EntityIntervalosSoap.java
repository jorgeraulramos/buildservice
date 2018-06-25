package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityIntervalosPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityIntervalosServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityIntervalosServiceSoap
 * @generated
 */
public class EntityIntervalosSoap implements Serializable {
    private int _startKilometer;
    private int _finishKilometers;

    public EntityIntervalosSoap() {
    }

    public static EntityIntervalosSoap toSoapModel(EntityIntervalos model) {
        EntityIntervalosSoap soapModel = new EntityIntervalosSoap();

        soapModel.setStartKilometer(model.getStartKilometer());
        soapModel.setFinishKilometers(model.getFinishKilometers());

        return soapModel;
    }

    public static EntityIntervalosSoap[] toSoapModels(EntityIntervalos[] models) {
        EntityIntervalosSoap[] soapModels = new EntityIntervalosSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityIntervalosSoap[][] toSoapModels(
        EntityIntervalos[][] models) {
        EntityIntervalosSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityIntervalosSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityIntervalosSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityIntervalosSoap[] toSoapModels(
        List<EntityIntervalos> models) {
        List<EntityIntervalosSoap> soapModels = new ArrayList<EntityIntervalosSoap>(models.size());

        for (EntityIntervalos model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityIntervalosSoap[soapModels.size()]);
    }

    public EntityIntervalosPK getPrimaryKey() {
        return new EntityIntervalosPK(_startKilometer, _finishKilometers);
    }

    public void setPrimaryKey(EntityIntervalosPK pk) {
        setStartKilometer(pk.startKilometer);
        setFinishKilometers(pk.finishKilometers);
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
}
