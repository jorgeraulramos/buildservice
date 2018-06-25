package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityEventServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityEventServiceSoap
 * @generated
 */
public class EntityEventSoap implements Serializable {
    private int _eventId;
    private String _eventName;

    public EntityEventSoap() {
    }

    public static EntityEventSoap toSoapModel(EntityEvent model) {
        EntityEventSoap soapModel = new EntityEventSoap();

        soapModel.setEventId(model.getEventId());
        soapModel.setEventName(model.getEventName());

        return soapModel;
    }

    public static EntityEventSoap[] toSoapModels(EntityEvent[] models) {
        EntityEventSoap[] soapModels = new EntityEventSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityEventSoap[][] toSoapModels(EntityEvent[][] models) {
        EntityEventSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityEventSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityEventSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityEventSoap[] toSoapModels(List<EntityEvent> models) {
        List<EntityEventSoap> soapModels = new ArrayList<EntityEventSoap>(models.size());

        for (EntityEvent model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityEventSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _eventId;
    }

    public void setPrimaryKey(int pk) {
        setEventId(pk);
    }

    public int getEventId() {
        return _eventId;
    }

    public void setEventId(int eventId) {
        _eventId = eventId;
    }

    public String getEventName() {
        return _eventName;
    }

    public void setEventName(String eventName) {
        _eventName = eventName;
    }
}
