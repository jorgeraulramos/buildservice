package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntitySaleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntitySaleServiceSoap
 * @generated
 */
public class EntitySaleSoap implements Serializable {
    private int _saleId;
    private String _confirmBySale;
    private Date _deliveryDate;
    private String _assurantCertificate;
    private String _extendedWarranty;
    private double _realGrossProfit;
    private double _finalSalePrice;
    private int _clientId;
    private int _employeeId;
    private int _salesPlaceId;
    private int _prospectionId;
    private int _wayPayId;

    public EntitySaleSoap() {
    }

    public static EntitySaleSoap toSoapModel(EntitySale model) {
        EntitySaleSoap soapModel = new EntitySaleSoap();

        soapModel.setSaleId(model.getSaleId());
        soapModel.setConfirmBySale(model.getConfirmBySale());
        soapModel.setDeliveryDate(model.getDeliveryDate());
        soapModel.setAssurantCertificate(model.getAssurantCertificate());
        soapModel.setExtendedWarranty(model.getExtendedWarranty());
        soapModel.setRealGrossProfit(model.getRealGrossProfit());
        soapModel.setFinalSalePrice(model.getFinalSalePrice());
        soapModel.setClientId(model.getClientId());
        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setSalesPlaceId(model.getSalesPlaceId());
        soapModel.setProspectionId(model.getProspectionId());
        soapModel.setWayPayId(model.getWayPayId());

        return soapModel;
    }

    public static EntitySaleSoap[] toSoapModels(EntitySale[] models) {
        EntitySaleSoap[] soapModels = new EntitySaleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntitySaleSoap[][] toSoapModels(EntitySale[][] models) {
        EntitySaleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntitySaleSoap[models.length][models[0].length];
        } else {
            soapModels = new EntitySaleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntitySaleSoap[] toSoapModels(List<EntitySale> models) {
        List<EntitySaleSoap> soapModels = new ArrayList<EntitySaleSoap>(models.size());

        for (EntitySale model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntitySaleSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _saleId;
    }

    public void setPrimaryKey(int pk) {
        setSaleId(pk);
    }

    public int getSaleId() {
        return _saleId;
    }

    public void setSaleId(int saleId) {
        _saleId = saleId;
    }

    public String getConfirmBySale() {
        return _confirmBySale;
    }

    public void setConfirmBySale(String confirmBySale) {
        _confirmBySale = confirmBySale;
    }

    public Date getDeliveryDate() {
        return _deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        _deliveryDate = deliveryDate;
    }

    public String getAssurantCertificate() {
        return _assurantCertificate;
    }

    public void setAssurantCertificate(String assurantCertificate) {
        _assurantCertificate = assurantCertificate;
    }

    public String getExtendedWarranty() {
        return _extendedWarranty;
    }

    public void setExtendedWarranty(String extendedWarranty) {
        _extendedWarranty = extendedWarranty;
    }

    public double getRealGrossProfit() {
        return _realGrossProfit;
    }

    public void setRealGrossProfit(double realGrossProfit) {
        _realGrossProfit = realGrossProfit;
    }

    public double getFinalSalePrice() {
        return _finalSalePrice;
    }

    public void setFinalSalePrice(double finalSalePrice) {
        _finalSalePrice = finalSalePrice;
    }

    public int getClientId() {
        return _clientId;
    }

    public void setClientId(int clientId) {
        _clientId = clientId;
    }

    public int getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;
    }

    public int getSalesPlaceId() {
        return _salesPlaceId;
    }

    public void setSalesPlaceId(int salesPlaceId) {
        _salesPlaceId = salesPlaceId;
    }

    public int getProspectionId() {
        return _prospectionId;
    }

    public void setProspectionId(int prospectionId) {
        _prospectionId = prospectionId;
    }

    public int getWayPayId() {
        return _wayPayId;
    }

    public void setWayPayId(int wayPayId) {
        _wayPayId = wayPayId;
    }
}
