package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityInventoryPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityInventoryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityInventoryServiceSoap
 * @generated
 */
public class EntityInventorySoap implements Serializable {
    private int _inventoryId;
    private String _dealerId;
    private String _businessBrandName;
    private int _versionId;
    private int _yearModel;
    private int _brandId;
    private int _modelId;
    private String _carExchange;
    private String _chasis;
    private double _kilometer;
    private int _numberDoors;
    private double _purchasePrice;
    private double _damage;
    private double _estimatedSalePrice;
    private double _estimatedGrossProfit;
    private Date _dateAdmission;
    private String _selfCertified;
    private Date _inventoryRegistrationDate;
    private String _whatProcessDischarged;
    private String _engineLiters;
    private String _transmission;
    private String _location;
    private int _hp;
    private String _carToConsignment;
    private String _comments;
    private String _status;
    private String _color;
    private String _daysSpentInventory;
    private double _suggestedPricePurchase;
    private double _suggestedSalePrice;
    private int _versionPricePurchaseSale;
    private String _statusName;
    private int _sourceSupplyId;
    private int _inventoryClasificationId;
    private int _saleId;
    private String _tradeInId;
    private int _employeeId;

    public EntityInventorySoap() {
    }

    public static EntityInventorySoap toSoapModel(EntityInventory model) {
        EntityInventorySoap soapModel = new EntityInventorySoap();

        soapModel.setInventoryId(model.getInventoryId());
        soapModel.setDealerId(model.getDealerId());
        soapModel.setBusinessBrandName(model.getBusinessBrandName());
        soapModel.setVersionId(model.getVersionId());
        soapModel.setYearModel(model.getYearModel());
        soapModel.setBrandId(model.getBrandId());
        soapModel.setModelId(model.getModelId());
        soapModel.setCarExchange(model.getCarExchange());
        soapModel.setChasis(model.getChasis());
        soapModel.setKilometer(model.getKilometer());
        soapModel.setNumberDoors(model.getNumberDoors());
        soapModel.setPurchasePrice(model.getPurchasePrice());
        soapModel.setDamage(model.getDamage());
        soapModel.setEstimatedSalePrice(model.getEstimatedSalePrice());
        soapModel.setEstimatedGrossProfit(model.getEstimatedGrossProfit());
        soapModel.setDateAdmission(model.getDateAdmission());
        soapModel.setSelfCertified(model.getSelfCertified());
        soapModel.setInventoryRegistrationDate(model.getInventoryRegistrationDate());
        soapModel.setWhatProcessDischarged(model.getWhatProcessDischarged());
        soapModel.setEngineLiters(model.getEngineLiters());
        soapModel.setTransmission(model.getTransmission());
        soapModel.setLocation(model.getLocation());
        soapModel.setHp(model.getHp());
        soapModel.setCarToConsignment(model.getCarToConsignment());
        soapModel.setComments(model.getComments());
        soapModel.setStatus(model.getStatus());
        soapModel.setColor(model.getColor());
        soapModel.setDaysSpentInventory(model.getDaysSpentInventory());
        soapModel.setSuggestedPricePurchase(model.getSuggestedPricePurchase());
        soapModel.setSuggestedSalePrice(model.getSuggestedSalePrice());
        soapModel.setVersionPricePurchaseSale(model.getVersionPricePurchaseSale());
        soapModel.setStatusName(model.getStatusName());
        soapModel.setSourceSupplyId(model.getSourceSupplyId());
        soapModel.setInventoryClasificationId(model.getInventoryClasificationId());
        soapModel.setSaleId(model.getSaleId());
        soapModel.setTradeInId(model.getTradeInId());
        soapModel.setEmployeeId(model.getEmployeeId());

        return soapModel;
    }

    public static EntityInventorySoap[] toSoapModels(EntityInventory[] models) {
        EntityInventorySoap[] soapModels = new EntityInventorySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityInventorySoap[][] toSoapModels(
        EntityInventory[][] models) {
        EntityInventorySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityInventorySoap[models.length][models[0].length];
        } else {
            soapModels = new EntityInventorySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityInventorySoap[] toSoapModels(
        List<EntityInventory> models) {
        List<EntityInventorySoap> soapModels = new ArrayList<EntityInventorySoap>(models.size());

        for (EntityInventory model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityInventorySoap[soapModels.size()]);
    }

    public EntityInventoryPK getPrimaryKey() {
        return new EntityInventoryPK(_inventoryId, _dealerId,
            _businessBrandName, _versionId, _yearModel, _brandId, _modelId);
    }

    public void setPrimaryKey(EntityInventoryPK pk) {
        setInventoryId(pk.inventoryId);
        setDealerId(pk.dealerId);
        setBusinessBrandName(pk.businessBrandName);
        setVersionId(pk.versionId);
        setYearModel(pk.yearModel);
        setBrandId(pk.brandId);
        setModelId(pk.modelId);
    }

    public int getInventoryId() {
        return _inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        _inventoryId = inventoryId;
    }

    public String getDealerId() {
        return _dealerId;
    }

    public void setDealerId(String dealerId) {
        _dealerId = dealerId;
    }

    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;
    }

    public int getVersionId() {
        return _versionId;
    }

    public void setVersionId(int versionId) {
        _versionId = versionId;
    }

    public int getYearModel() {
        return _yearModel;
    }

    public void setYearModel(int yearModel) {
        _yearModel = yearModel;
    }

    public int getBrandId() {
        return _brandId;
    }

    public void setBrandId(int brandId) {
        _brandId = brandId;
    }

    public int getModelId() {
        return _modelId;
    }

    public void setModelId(int modelId) {
        _modelId = modelId;
    }

    public String getCarExchange() {
        return _carExchange;
    }

    public void setCarExchange(String carExchange) {
        _carExchange = carExchange;
    }

    public String getChasis() {
        return _chasis;
    }

    public void setChasis(String chasis) {
        _chasis = chasis;
    }

    public double getKilometer() {
        return _kilometer;
    }

    public void setKilometer(double kilometer) {
        _kilometer = kilometer;
    }

    public int getNumberDoors() {
        return _numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        _numberDoors = numberDoors;
    }

    public double getPurchasePrice() {
        return _purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        _purchasePrice = purchasePrice;
    }

    public double getDamage() {
        return _damage;
    }

    public void setDamage(double damage) {
        _damage = damage;
    }

    public double getEstimatedSalePrice() {
        return _estimatedSalePrice;
    }

    public void setEstimatedSalePrice(double estimatedSalePrice) {
        _estimatedSalePrice = estimatedSalePrice;
    }

    public double getEstimatedGrossProfit() {
        return _estimatedGrossProfit;
    }

    public void setEstimatedGrossProfit(double estimatedGrossProfit) {
        _estimatedGrossProfit = estimatedGrossProfit;
    }

    public Date getDateAdmission() {
        return _dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        _dateAdmission = dateAdmission;
    }

    public String getSelfCertified() {
        return _selfCertified;
    }

    public void setSelfCertified(String selfCertified) {
        _selfCertified = selfCertified;
    }

    public Date getInventoryRegistrationDate() {
        return _inventoryRegistrationDate;
    }

    public void setInventoryRegistrationDate(Date inventoryRegistrationDate) {
        _inventoryRegistrationDate = inventoryRegistrationDate;
    }

    public String getWhatProcessDischarged() {
        return _whatProcessDischarged;
    }

    public void setWhatProcessDischarged(String whatProcessDischarged) {
        _whatProcessDischarged = whatProcessDischarged;
    }

    public String getEngineLiters() {
        return _engineLiters;
    }

    public void setEngineLiters(String engineLiters) {
        _engineLiters = engineLiters;
    }

    public String getTransmission() {
        return _transmission;
    }

    public void setTransmission(String transmission) {
        _transmission = transmission;
    }

    public String getLocation() {
        return _location;
    }

    public void setLocation(String location) {
        _location = location;
    }

    public int getHp() {
        return _hp;
    }

    public void setHp(int hp) {
        _hp = hp;
    }

    public String getCarToConsignment() {
        return _carToConsignment;
    }

    public void setCarToConsignment(String carToConsignment) {
        _carToConsignment = carToConsignment;
    }

    public String getComments() {
        return _comments;
    }

    public void setComments(String comments) {
        _comments = comments;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getDaysSpentInventory() {
        return _daysSpentInventory;
    }

    public void setDaysSpentInventory(String daysSpentInventory) {
        _daysSpentInventory = daysSpentInventory;
    }

    public double getSuggestedPricePurchase() {
        return _suggestedPricePurchase;
    }

    public void setSuggestedPricePurchase(double suggestedPricePurchase) {
        _suggestedPricePurchase = suggestedPricePurchase;
    }

    public double getSuggestedSalePrice() {
        return _suggestedSalePrice;
    }

    public void setSuggestedSalePrice(double suggestedSalePrice) {
        _suggestedSalePrice = suggestedSalePrice;
    }

    public int getVersionPricePurchaseSale() {
        return _versionPricePurchaseSale;
    }

    public void setVersionPricePurchaseSale(int versionPricePurchaseSale) {
        _versionPricePurchaseSale = versionPricePurchaseSale;
    }

    public String getStatusName() {
        return _statusName;
    }

    public void setStatusName(String statusName) {
        _statusName = statusName;
    }

    public int getSourceSupplyId() {
        return _sourceSupplyId;
    }

    public void setSourceSupplyId(int sourceSupplyId) {
        _sourceSupplyId = sourceSupplyId;
    }

    public int getInventoryClasificationId() {
        return _inventoryClasificationId;
    }

    public void setInventoryClasificationId(int inventoryClasificationId) {
        _inventoryClasificationId = inventoryClasificationId;
    }

    public int getSaleId() {
        return _saleId;
    }

    public void setSaleId(int saleId) {
        _saleId = saleId;
    }

    public String getTradeInId() {
        return _tradeInId;
    }

    public void setTradeInId(String tradeInId) {
        _tradeInId = tradeInId;
    }

    public int getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;
    }
}
