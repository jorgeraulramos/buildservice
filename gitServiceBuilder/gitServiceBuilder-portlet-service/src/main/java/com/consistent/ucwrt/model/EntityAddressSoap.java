package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityAddressServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityAddressServiceSoap
 * @generated
 */
public class EntityAddressSoap implements Serializable {
    private int _addressId;
    private String _street;
    private int _interiorNumber;
    private int _exteriorNumber;
    private int _clientId;
    private int _municipalId;
    private int _stateId;
    private int _suburbId;

    public EntityAddressSoap() {
    }

    public static EntityAddressSoap toSoapModel(EntityAddress model) {
        EntityAddressSoap soapModel = new EntityAddressSoap();

        soapModel.setAddressId(model.getAddressId());
        soapModel.setStreet(model.getStreet());
        soapModel.setInteriorNumber(model.getInteriorNumber());
        soapModel.setExteriorNumber(model.getExteriorNumber());
        soapModel.setClientId(model.getClientId());
        soapModel.setMunicipalId(model.getMunicipalId());
        soapModel.setStateId(model.getStateId());
        soapModel.setSuburbId(model.getSuburbId());

        return soapModel;
    }

    public static EntityAddressSoap[] toSoapModels(EntityAddress[] models) {
        EntityAddressSoap[] soapModels = new EntityAddressSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityAddressSoap[][] toSoapModels(EntityAddress[][] models) {
        EntityAddressSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityAddressSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityAddressSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityAddressSoap[] toSoapModels(List<EntityAddress> models) {
        List<EntityAddressSoap> soapModels = new ArrayList<EntityAddressSoap>(models.size());

        for (EntityAddress model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityAddressSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _addressId;
    }

    public void setPrimaryKey(int pk) {
        setAddressId(pk);
    }

    public int getAddressId() {
        return _addressId;
    }

    public void setAddressId(int addressId) {
        _addressId = addressId;
    }

    public String getStreet() {
        return _street;
    }

    public void setStreet(String street) {
        _street = street;
    }

    public int getInteriorNumber() {
        return _interiorNumber;
    }

    public void setInteriorNumber(int interiorNumber) {
        _interiorNumber = interiorNumber;
    }

    public int getExteriorNumber() {
        return _exteriorNumber;
    }

    public void setExteriorNumber(int exteriorNumber) {
        _exteriorNumber = exteriorNumber;
    }

    public int getClientId() {
        return _clientId;
    }

    public void setClientId(int clientId) {
        _clientId = clientId;
    }

    public int getMunicipalId() {
        return _municipalId;
    }

    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;
    }

    public int getStateId() {
        return _stateId;
    }

    public void setStateId(int stateId) {
        _stateId = stateId;
    }

    public int getSuburbId() {
        return _suburbId;
    }

    public void setSuburbId(int suburbId) {
        _suburbId = suburbId;
    }
}
