package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityZoneServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityZoneServiceSoap
 * @generated
 */
public class EntityZoneSoap implements Serializable {
    private String _zoneName;
    private String _descriptionZone;
    private String _userZoneManager;
    private String _userSalesAreaManager;
    private String _userRegionalAreaManager;

    public EntityZoneSoap() {
    }

    public static EntityZoneSoap toSoapModel(EntityZone model) {
        EntityZoneSoap soapModel = new EntityZoneSoap();

        soapModel.setZoneName(model.getZoneName());
        soapModel.setDescriptionZone(model.getDescriptionZone());
        soapModel.setUserZoneManager(model.getUserZoneManager());
        soapModel.setUserSalesAreaManager(model.getUserSalesAreaManager());
        soapModel.setUserRegionalAreaManager(model.getUserRegionalAreaManager());

        return soapModel;
    }

    public static EntityZoneSoap[] toSoapModels(EntityZone[] models) {
        EntityZoneSoap[] soapModels = new EntityZoneSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityZoneSoap[][] toSoapModels(EntityZone[][] models) {
        EntityZoneSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityZoneSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityZoneSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityZoneSoap[] toSoapModels(List<EntityZone> models) {
        List<EntityZoneSoap> soapModels = new ArrayList<EntityZoneSoap>(models.size());

        for (EntityZone model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityZoneSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _zoneName;
    }

    public void setPrimaryKey(String pk) {
        setZoneName(pk);
    }

    public String getZoneName() {
        return _zoneName;
    }

    public void setZoneName(String zoneName) {
        _zoneName = zoneName;
    }

    public String getDescriptionZone() {
        return _descriptionZone;
    }

    public void setDescriptionZone(String descriptionZone) {
        _descriptionZone = descriptionZone;
    }

    public String getUserZoneManager() {
        return _userZoneManager;
    }

    public void setUserZoneManager(String userZoneManager) {
        _userZoneManager = userZoneManager;
    }

    public String getUserSalesAreaManager() {
        return _userSalesAreaManager;
    }

    public void setUserSalesAreaManager(String userSalesAreaManager) {
        _userSalesAreaManager = userSalesAreaManager;
    }

    public String getUserRegionalAreaManager() {
        return _userRegionalAreaManager;
    }

    public void setUserRegionalAreaManager(String userRegionalAreaManager) {
        _userRegionalAreaManager = userRegionalAreaManager;
    }
}
