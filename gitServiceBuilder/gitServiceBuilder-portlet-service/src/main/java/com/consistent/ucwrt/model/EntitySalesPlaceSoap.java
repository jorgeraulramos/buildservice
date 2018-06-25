package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntitySalesPlaceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntitySalesPlaceServiceSoap
 * @generated
 */
public class EntitySalesPlaceSoap implements Serializable {
    private int _salesPlaceId;
    private String _salePlaceName;

    public EntitySalesPlaceSoap() {
    }

    public static EntitySalesPlaceSoap toSoapModel(EntitySalesPlace model) {
        EntitySalesPlaceSoap soapModel = new EntitySalesPlaceSoap();

        soapModel.setSalesPlaceId(model.getSalesPlaceId());
        soapModel.setSalePlaceName(model.getSalePlaceName());

        return soapModel;
    }

    public static EntitySalesPlaceSoap[] toSoapModels(EntitySalesPlace[] models) {
        EntitySalesPlaceSoap[] soapModels = new EntitySalesPlaceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntitySalesPlaceSoap[][] toSoapModels(
        EntitySalesPlace[][] models) {
        EntitySalesPlaceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntitySalesPlaceSoap[models.length][models[0].length];
        } else {
            soapModels = new EntitySalesPlaceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntitySalesPlaceSoap[] toSoapModels(
        List<EntitySalesPlace> models) {
        List<EntitySalesPlaceSoap> soapModels = new ArrayList<EntitySalesPlaceSoap>(models.size());

        for (EntitySalesPlace model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntitySalesPlaceSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _salesPlaceId;
    }

    public void setPrimaryKey(int pk) {
        setSalesPlaceId(pk);
    }

    public int getSalesPlaceId() {
        return _salesPlaceId;
    }

    public void setSalesPlaceId(int salesPlaceId) {
        _salesPlaceId = salesPlaceId;
    }

    public String getSalePlaceName() {
        return _salePlaceName;
    }

    public void setSalePlaceName(String salePlaceName) {
        _salePlaceName = salePlaceName;
    }
}
