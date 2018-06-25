package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityInventory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventory
 * @generated
 */
public class EntityInventoryWrapper implements EntityInventory,
    ModelWrapper<EntityInventory> {
    private EntityInventory _entityInventory;

    public EntityInventoryWrapper(EntityInventory entityInventory) {
        _entityInventory = entityInventory;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityInventory.class;
    }

    @Override
    public String getModelClassName() {
        return EntityInventory.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("inventoryId", getInventoryId());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("versionId", getVersionId());
        attributes.put("yearModel", getYearModel());
        attributes.put("brandId", getBrandId());
        attributes.put("modelId", getModelId());
        attributes.put("carExchange", getCarExchange());
        attributes.put("chasis", getChasis());
        attributes.put("kilometer", getKilometer());
        attributes.put("numberDoors", getNumberDoors());
        attributes.put("purchasePrice", getPurchasePrice());
        attributes.put("damage", getDamage());
        attributes.put("estimatedSalePrice", getEstimatedSalePrice());
        attributes.put("estimatedGrossProfit", getEstimatedGrossProfit());
        attributes.put("dateAdmission", getDateAdmission());
        attributes.put("selfCertified", getSelfCertified());
        attributes.put("inventoryRegistrationDate",
            getInventoryRegistrationDate());
        attributes.put("whatProcessDischarged", getWhatProcessDischarged());
        attributes.put("engineLiters", getEngineLiters());
        attributes.put("transmission", getTransmission());
        attributes.put("location", getLocation());
        attributes.put("hp", getHp());
        attributes.put("carToConsignment", getCarToConsignment());
        attributes.put("comments", getComments());
        attributes.put("status", getStatus());
        attributes.put("color", getColor());
        attributes.put("daysSpentInventory", getDaysSpentInventory());
        attributes.put("suggestedPricePurchase", getSuggestedPricePurchase());
        attributes.put("suggestedSalePrice", getSuggestedSalePrice());
        attributes.put("versionPricePurchaseSale", getVersionPricePurchaseSale());
        attributes.put("statusName", getStatusName());
        attributes.put("sourceSupplyId", getSourceSupplyId());
        attributes.put("inventoryClasificationId", getInventoryClasificationId());
        attributes.put("saleId", getSaleId());
        attributes.put("tradeInId", getTradeInId());
        attributes.put("employeeId", getEmployeeId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer inventoryId = (Integer) attributes.get("inventoryId");

        if (inventoryId != null) {
            setInventoryId(inventoryId);
        }

        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        Integer versionId = (Integer) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        String carExchange = (String) attributes.get("carExchange");

        if (carExchange != null) {
            setCarExchange(carExchange);
        }

        String chasis = (String) attributes.get("chasis");

        if (chasis != null) {
            setChasis(chasis);
        }

        Double kilometer = (Double) attributes.get("kilometer");

        if (kilometer != null) {
            setKilometer(kilometer);
        }

        Integer numberDoors = (Integer) attributes.get("numberDoors");

        if (numberDoors != null) {
            setNumberDoors(numberDoors);
        }

        Double purchasePrice = (Double) attributes.get("purchasePrice");

        if (purchasePrice != null) {
            setPurchasePrice(purchasePrice);
        }

        Double damage = (Double) attributes.get("damage");

        if (damage != null) {
            setDamage(damage);
        }

        Double estimatedSalePrice = (Double) attributes.get(
                "estimatedSalePrice");

        if (estimatedSalePrice != null) {
            setEstimatedSalePrice(estimatedSalePrice);
        }

        Double estimatedGrossProfit = (Double) attributes.get(
                "estimatedGrossProfit");

        if (estimatedGrossProfit != null) {
            setEstimatedGrossProfit(estimatedGrossProfit);
        }

        Date dateAdmission = (Date) attributes.get("dateAdmission");

        if (dateAdmission != null) {
            setDateAdmission(dateAdmission);
        }

        String selfCertified = (String) attributes.get("selfCertified");

        if (selfCertified != null) {
            setSelfCertified(selfCertified);
        }

        Date inventoryRegistrationDate = (Date) attributes.get(
                "inventoryRegistrationDate");

        if (inventoryRegistrationDate != null) {
            setInventoryRegistrationDate(inventoryRegistrationDate);
        }

        String whatProcessDischarged = (String) attributes.get(
                "whatProcessDischarged");

        if (whatProcessDischarged != null) {
            setWhatProcessDischarged(whatProcessDischarged);
        }

        String engineLiters = (String) attributes.get("engineLiters");

        if (engineLiters != null) {
            setEngineLiters(engineLiters);
        }

        String transmission = (String) attributes.get("transmission");

        if (transmission != null) {
            setTransmission(transmission);
        }

        String location = (String) attributes.get("location");

        if (location != null) {
            setLocation(location);
        }

        Integer hp = (Integer) attributes.get("hp");

        if (hp != null) {
            setHp(hp);
        }

        String carToConsignment = (String) attributes.get("carToConsignment");

        if (carToConsignment != null) {
            setCarToConsignment(carToConsignment);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String color = (String) attributes.get("color");

        if (color != null) {
            setColor(color);
        }

        String daysSpentInventory = (String) attributes.get(
                "daysSpentInventory");

        if (daysSpentInventory != null) {
            setDaysSpentInventory(daysSpentInventory);
        }

        Double suggestedPricePurchase = (Double) attributes.get(
                "suggestedPricePurchase");

        if (suggestedPricePurchase != null) {
            setSuggestedPricePurchase(suggestedPricePurchase);
        }

        Double suggestedSalePrice = (Double) attributes.get(
                "suggestedSalePrice");

        if (suggestedSalePrice != null) {
            setSuggestedSalePrice(suggestedSalePrice);
        }

        Integer versionPricePurchaseSale = (Integer) attributes.get(
                "versionPricePurchaseSale");

        if (versionPricePurchaseSale != null) {
            setVersionPricePurchaseSale(versionPricePurchaseSale);
        }

        String statusName = (String) attributes.get("statusName");

        if (statusName != null) {
            setStatusName(statusName);
        }

        Integer sourceSupplyId = (Integer) attributes.get("sourceSupplyId");

        if (sourceSupplyId != null) {
            setSourceSupplyId(sourceSupplyId);
        }

        Integer inventoryClasificationId = (Integer) attributes.get(
                "inventoryClasificationId");

        if (inventoryClasificationId != null) {
            setInventoryClasificationId(inventoryClasificationId);
        }

        Integer saleId = (Integer) attributes.get("saleId");

        if (saleId != null) {
            setSaleId(saleId);
        }

        String tradeInId = (String) attributes.get("tradeInId");

        if (tradeInId != null) {
            setTradeInId(tradeInId);
        }

        Integer employeeId = (Integer) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }
    }

    /**
    * Returns the primary key of this entity inventory.
    *
    * @return the primary key of this entity inventory
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityInventoryPK getPrimaryKey() {
        return _entityInventory.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity inventory.
    *
    * @param primaryKey the primary key of this entity inventory
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityInventoryPK primaryKey) {
        _entityInventory.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the inventory ID of this entity inventory.
    *
    * @return the inventory ID of this entity inventory
    */
    @Override
    public int getInventoryId() {
        return _entityInventory.getInventoryId();
    }

    /**
    * Sets the inventory ID of this entity inventory.
    *
    * @param inventoryId the inventory ID of this entity inventory
    */
    @Override
    public void setInventoryId(int inventoryId) {
        _entityInventory.setInventoryId(inventoryId);
    }

    /**
    * Returns the dealer ID of this entity inventory.
    *
    * @return the dealer ID of this entity inventory
    */
    @Override
    public java.lang.String getDealerId() {
        return _entityInventory.getDealerId();
    }

    /**
    * Sets the dealer ID of this entity inventory.
    *
    * @param dealerId the dealer ID of this entity inventory
    */
    @Override
    public void setDealerId(java.lang.String dealerId) {
        _entityInventory.setDealerId(dealerId);
    }

    /**
    * Returns the business brand name of this entity inventory.
    *
    * @return the business brand name of this entity inventory
    */
    @Override
    public java.lang.String getBusinessBrandName() {
        return _entityInventory.getBusinessBrandName();
    }

    /**
    * Sets the business brand name of this entity inventory.
    *
    * @param businessBrandName the business brand name of this entity inventory
    */
    @Override
    public void setBusinessBrandName(java.lang.String businessBrandName) {
        _entityInventory.setBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the version ID of this entity inventory.
    *
    * @return the version ID of this entity inventory
    */
    @Override
    public int getVersionId() {
        return _entityInventory.getVersionId();
    }

    /**
    * Sets the version ID of this entity inventory.
    *
    * @param versionId the version ID of this entity inventory
    */
    @Override
    public void setVersionId(int versionId) {
        _entityInventory.setVersionId(versionId);
    }

    /**
    * Returns the year model of this entity inventory.
    *
    * @return the year model of this entity inventory
    */
    @Override
    public int getYearModel() {
        return _entityInventory.getYearModel();
    }

    /**
    * Sets the year model of this entity inventory.
    *
    * @param yearModel the year model of this entity inventory
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityInventory.setYearModel(yearModel);
    }

    /**
    * Returns the brand ID of this entity inventory.
    *
    * @return the brand ID of this entity inventory
    */
    @Override
    public int getBrandId() {
        return _entityInventory.getBrandId();
    }

    /**
    * Sets the brand ID of this entity inventory.
    *
    * @param brandId the brand ID of this entity inventory
    */
    @Override
    public void setBrandId(int brandId) {
        _entityInventory.setBrandId(brandId);
    }

    /**
    * Returns the model ID of this entity inventory.
    *
    * @return the model ID of this entity inventory
    */
    @Override
    public int getModelId() {
        return _entityInventory.getModelId();
    }

    /**
    * Sets the model ID of this entity inventory.
    *
    * @param modelId the model ID of this entity inventory
    */
    @Override
    public void setModelId(int modelId) {
        _entityInventory.setModelId(modelId);
    }

    /**
    * Returns the car exchange of this entity inventory.
    *
    * @return the car exchange of this entity inventory
    */
    @Override
    public java.lang.String getCarExchange() {
        return _entityInventory.getCarExchange();
    }

    /**
    * Sets the car exchange of this entity inventory.
    *
    * @param carExchange the car exchange of this entity inventory
    */
    @Override
    public void setCarExchange(java.lang.String carExchange) {
        _entityInventory.setCarExchange(carExchange);
    }

    /**
    * Returns the chasis of this entity inventory.
    *
    * @return the chasis of this entity inventory
    */
    @Override
    public java.lang.String getChasis() {
        return _entityInventory.getChasis();
    }

    /**
    * Sets the chasis of this entity inventory.
    *
    * @param chasis the chasis of this entity inventory
    */
    @Override
    public void setChasis(java.lang.String chasis) {
        _entityInventory.setChasis(chasis);
    }

    /**
    * Returns the kilometer of this entity inventory.
    *
    * @return the kilometer of this entity inventory
    */
    @Override
    public double getKilometer() {
        return _entityInventory.getKilometer();
    }

    /**
    * Sets the kilometer of this entity inventory.
    *
    * @param kilometer the kilometer of this entity inventory
    */
    @Override
    public void setKilometer(double kilometer) {
        _entityInventory.setKilometer(kilometer);
    }

    /**
    * Returns the number doors of this entity inventory.
    *
    * @return the number doors of this entity inventory
    */
    @Override
    public int getNumberDoors() {
        return _entityInventory.getNumberDoors();
    }

    /**
    * Sets the number doors of this entity inventory.
    *
    * @param numberDoors the number doors of this entity inventory
    */
    @Override
    public void setNumberDoors(int numberDoors) {
        _entityInventory.setNumberDoors(numberDoors);
    }

    /**
    * Returns the purchase price of this entity inventory.
    *
    * @return the purchase price of this entity inventory
    */
    @Override
    public double getPurchasePrice() {
        return _entityInventory.getPurchasePrice();
    }

    /**
    * Sets the purchase price of this entity inventory.
    *
    * @param purchasePrice the purchase price of this entity inventory
    */
    @Override
    public void setPurchasePrice(double purchasePrice) {
        _entityInventory.setPurchasePrice(purchasePrice);
    }

    /**
    * Returns the damage of this entity inventory.
    *
    * @return the damage of this entity inventory
    */
    @Override
    public double getDamage() {
        return _entityInventory.getDamage();
    }

    /**
    * Sets the damage of this entity inventory.
    *
    * @param damage the damage of this entity inventory
    */
    @Override
    public void setDamage(double damage) {
        _entityInventory.setDamage(damage);
    }

    /**
    * Returns the estimated sale price of this entity inventory.
    *
    * @return the estimated sale price of this entity inventory
    */
    @Override
    public double getEstimatedSalePrice() {
        return _entityInventory.getEstimatedSalePrice();
    }

    /**
    * Sets the estimated sale price of this entity inventory.
    *
    * @param estimatedSalePrice the estimated sale price of this entity inventory
    */
    @Override
    public void setEstimatedSalePrice(double estimatedSalePrice) {
        _entityInventory.setEstimatedSalePrice(estimatedSalePrice);
    }

    /**
    * Returns the estimated gross profit of this entity inventory.
    *
    * @return the estimated gross profit of this entity inventory
    */
    @Override
    public double getEstimatedGrossProfit() {
        return _entityInventory.getEstimatedGrossProfit();
    }

    /**
    * Sets the estimated gross profit of this entity inventory.
    *
    * @param estimatedGrossProfit the estimated gross profit of this entity inventory
    */
    @Override
    public void setEstimatedGrossProfit(double estimatedGrossProfit) {
        _entityInventory.setEstimatedGrossProfit(estimatedGrossProfit);
    }

    /**
    * Returns the date admission of this entity inventory.
    *
    * @return the date admission of this entity inventory
    */
    @Override
    public java.util.Date getDateAdmission() {
        return _entityInventory.getDateAdmission();
    }

    /**
    * Sets the date admission of this entity inventory.
    *
    * @param dateAdmission the date admission of this entity inventory
    */
    @Override
    public void setDateAdmission(java.util.Date dateAdmission) {
        _entityInventory.setDateAdmission(dateAdmission);
    }

    /**
    * Returns the self certified of this entity inventory.
    *
    * @return the self certified of this entity inventory
    */
    @Override
    public java.lang.String getSelfCertified() {
        return _entityInventory.getSelfCertified();
    }

    /**
    * Sets the self certified of this entity inventory.
    *
    * @param selfCertified the self certified of this entity inventory
    */
    @Override
    public void setSelfCertified(java.lang.String selfCertified) {
        _entityInventory.setSelfCertified(selfCertified);
    }

    /**
    * Returns the inventory registration date of this entity inventory.
    *
    * @return the inventory registration date of this entity inventory
    */
    @Override
    public java.util.Date getInventoryRegistrationDate() {
        return _entityInventory.getInventoryRegistrationDate();
    }

    /**
    * Sets the inventory registration date of this entity inventory.
    *
    * @param inventoryRegistrationDate the inventory registration date of this entity inventory
    */
    @Override
    public void setInventoryRegistrationDate(
        java.util.Date inventoryRegistrationDate) {
        _entityInventory.setInventoryRegistrationDate(inventoryRegistrationDate);
    }

    /**
    * Returns the what process discharged of this entity inventory.
    *
    * @return the what process discharged of this entity inventory
    */
    @Override
    public java.lang.String getWhatProcessDischarged() {
        return _entityInventory.getWhatProcessDischarged();
    }

    /**
    * Sets the what process discharged of this entity inventory.
    *
    * @param whatProcessDischarged the what process discharged of this entity inventory
    */
    @Override
    public void setWhatProcessDischarged(java.lang.String whatProcessDischarged) {
        _entityInventory.setWhatProcessDischarged(whatProcessDischarged);
    }

    /**
    * Returns the engine liters of this entity inventory.
    *
    * @return the engine liters of this entity inventory
    */
    @Override
    public java.lang.String getEngineLiters() {
        return _entityInventory.getEngineLiters();
    }

    /**
    * Sets the engine liters of this entity inventory.
    *
    * @param engineLiters the engine liters of this entity inventory
    */
    @Override
    public void setEngineLiters(java.lang.String engineLiters) {
        _entityInventory.setEngineLiters(engineLiters);
    }

    /**
    * Returns the transmission of this entity inventory.
    *
    * @return the transmission of this entity inventory
    */
    @Override
    public java.lang.String getTransmission() {
        return _entityInventory.getTransmission();
    }

    /**
    * Sets the transmission of this entity inventory.
    *
    * @param transmission the transmission of this entity inventory
    */
    @Override
    public void setTransmission(java.lang.String transmission) {
        _entityInventory.setTransmission(transmission);
    }

    /**
    * Returns the location of this entity inventory.
    *
    * @return the location of this entity inventory
    */
    @Override
    public java.lang.String getLocation() {
        return _entityInventory.getLocation();
    }

    /**
    * Sets the location of this entity inventory.
    *
    * @param location the location of this entity inventory
    */
    @Override
    public void setLocation(java.lang.String location) {
        _entityInventory.setLocation(location);
    }

    /**
    * Returns the hp of this entity inventory.
    *
    * @return the hp of this entity inventory
    */
    @Override
    public int getHp() {
        return _entityInventory.getHp();
    }

    /**
    * Sets the hp of this entity inventory.
    *
    * @param hp the hp of this entity inventory
    */
    @Override
    public void setHp(int hp) {
        _entityInventory.setHp(hp);
    }

    /**
    * Returns the car to consignment of this entity inventory.
    *
    * @return the car to consignment of this entity inventory
    */
    @Override
    public java.lang.String getCarToConsignment() {
        return _entityInventory.getCarToConsignment();
    }

    /**
    * Sets the car to consignment of this entity inventory.
    *
    * @param carToConsignment the car to consignment of this entity inventory
    */
    @Override
    public void setCarToConsignment(java.lang.String carToConsignment) {
        _entityInventory.setCarToConsignment(carToConsignment);
    }

    /**
    * Returns the comments of this entity inventory.
    *
    * @return the comments of this entity inventory
    */
    @Override
    public java.lang.String getComments() {
        return _entityInventory.getComments();
    }

    /**
    * Sets the comments of this entity inventory.
    *
    * @param comments the comments of this entity inventory
    */
    @Override
    public void setComments(java.lang.String comments) {
        _entityInventory.setComments(comments);
    }

    /**
    * Returns the status of this entity inventory.
    *
    * @return the status of this entity inventory
    */
    @Override
    public java.lang.String getStatus() {
        return _entityInventory.getStatus();
    }

    /**
    * Sets the status of this entity inventory.
    *
    * @param status the status of this entity inventory
    */
    @Override
    public void setStatus(java.lang.String status) {
        _entityInventory.setStatus(status);
    }

    /**
    * Returns the color of this entity inventory.
    *
    * @return the color of this entity inventory
    */
    @Override
    public java.lang.String getColor() {
        return _entityInventory.getColor();
    }

    /**
    * Sets the color of this entity inventory.
    *
    * @param color the color of this entity inventory
    */
    @Override
    public void setColor(java.lang.String color) {
        _entityInventory.setColor(color);
    }

    /**
    * Returns the days spent inventory of this entity inventory.
    *
    * @return the days spent inventory of this entity inventory
    */
    @Override
    public java.lang.String getDaysSpentInventory() {
        return _entityInventory.getDaysSpentInventory();
    }

    /**
    * Sets the days spent inventory of this entity inventory.
    *
    * @param daysSpentInventory the days spent inventory of this entity inventory
    */
    @Override
    public void setDaysSpentInventory(java.lang.String daysSpentInventory) {
        _entityInventory.setDaysSpentInventory(daysSpentInventory);
    }

    /**
    * Returns the suggested price purchase of this entity inventory.
    *
    * @return the suggested price purchase of this entity inventory
    */
    @Override
    public double getSuggestedPricePurchase() {
        return _entityInventory.getSuggestedPricePurchase();
    }

    /**
    * Sets the suggested price purchase of this entity inventory.
    *
    * @param suggestedPricePurchase the suggested price purchase of this entity inventory
    */
    @Override
    public void setSuggestedPricePurchase(double suggestedPricePurchase) {
        _entityInventory.setSuggestedPricePurchase(suggestedPricePurchase);
    }

    /**
    * Returns the suggested sale price of this entity inventory.
    *
    * @return the suggested sale price of this entity inventory
    */
    @Override
    public double getSuggestedSalePrice() {
        return _entityInventory.getSuggestedSalePrice();
    }

    /**
    * Sets the suggested sale price of this entity inventory.
    *
    * @param suggestedSalePrice the suggested sale price of this entity inventory
    */
    @Override
    public void setSuggestedSalePrice(double suggestedSalePrice) {
        _entityInventory.setSuggestedSalePrice(suggestedSalePrice);
    }

    /**
    * Returns the version price purchase sale of this entity inventory.
    *
    * @return the version price purchase sale of this entity inventory
    */
    @Override
    public int getVersionPricePurchaseSale() {
        return _entityInventory.getVersionPricePurchaseSale();
    }

    /**
    * Sets the version price purchase sale of this entity inventory.
    *
    * @param versionPricePurchaseSale the version price purchase sale of this entity inventory
    */
    @Override
    public void setVersionPricePurchaseSale(int versionPricePurchaseSale) {
        _entityInventory.setVersionPricePurchaseSale(versionPricePurchaseSale);
    }

    /**
    * Returns the status name of this entity inventory.
    *
    * @return the status name of this entity inventory
    */
    @Override
    public java.lang.String getStatusName() {
        return _entityInventory.getStatusName();
    }

    /**
    * Sets the status name of this entity inventory.
    *
    * @param statusName the status name of this entity inventory
    */
    @Override
    public void setStatusName(java.lang.String statusName) {
        _entityInventory.setStatusName(statusName);
    }

    /**
    * Returns the source supply ID of this entity inventory.
    *
    * @return the source supply ID of this entity inventory
    */
    @Override
    public int getSourceSupplyId() {
        return _entityInventory.getSourceSupplyId();
    }

    /**
    * Sets the source supply ID of this entity inventory.
    *
    * @param sourceSupplyId the source supply ID of this entity inventory
    */
    @Override
    public void setSourceSupplyId(int sourceSupplyId) {
        _entityInventory.setSourceSupplyId(sourceSupplyId);
    }

    /**
    * Returns the inventory clasification ID of this entity inventory.
    *
    * @return the inventory clasification ID of this entity inventory
    */
    @Override
    public int getInventoryClasificationId() {
        return _entityInventory.getInventoryClasificationId();
    }

    /**
    * Sets the inventory clasification ID of this entity inventory.
    *
    * @param inventoryClasificationId the inventory clasification ID of this entity inventory
    */
    @Override
    public void setInventoryClasificationId(int inventoryClasificationId) {
        _entityInventory.setInventoryClasificationId(inventoryClasificationId);
    }

    /**
    * Returns the sale ID of this entity inventory.
    *
    * @return the sale ID of this entity inventory
    */
    @Override
    public int getSaleId() {
        return _entityInventory.getSaleId();
    }

    /**
    * Sets the sale ID of this entity inventory.
    *
    * @param saleId the sale ID of this entity inventory
    */
    @Override
    public void setSaleId(int saleId) {
        _entityInventory.setSaleId(saleId);
    }

    /**
    * Returns the trade in ID of this entity inventory.
    *
    * @return the trade in ID of this entity inventory
    */
    @Override
    public java.lang.String getTradeInId() {
        return _entityInventory.getTradeInId();
    }

    /**
    * Sets the trade in ID of this entity inventory.
    *
    * @param tradeInId the trade in ID of this entity inventory
    */
    @Override
    public void setTradeInId(java.lang.String tradeInId) {
        _entityInventory.setTradeInId(tradeInId);
    }

    /**
    * Returns the employee ID of this entity inventory.
    *
    * @return the employee ID of this entity inventory
    */
    @Override
    public int getEmployeeId() {
        return _entityInventory.getEmployeeId();
    }

    /**
    * Sets the employee ID of this entity inventory.
    *
    * @param employeeId the employee ID of this entity inventory
    */
    @Override
    public void setEmployeeId(int employeeId) {
        _entityInventory.setEmployeeId(employeeId);
    }

    @Override
    public boolean isNew() {
        return _entityInventory.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityInventory.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityInventory.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityInventory.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityInventory.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityInventory.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityInventory.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityInventory.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityInventory.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityInventory.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityInventory.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityInventoryWrapper((EntityInventory) _entityInventory.clone());
    }

    @Override
    public int compareTo(EntityInventory entityInventory) {
        return _entityInventory.compareTo(entityInventory);
    }

    @Override
    public int hashCode() {
        return _entityInventory.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityInventory> toCacheModel() {
        return _entityInventory.toCacheModel();
    }

    @Override
    public EntityInventory toEscapedModel() {
        return new EntityInventoryWrapper(_entityInventory.toEscapedModel());
    }

    @Override
    public EntityInventory toUnescapedModel() {
        return new EntityInventoryWrapper(_entityInventory.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityInventory.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityInventory.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityInventory.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityInventoryWrapper)) {
            return false;
        }

        EntityInventoryWrapper entityInventoryWrapper = (EntityInventoryWrapper) obj;

        if (Validator.equals(_entityInventory,
                    entityInventoryWrapper._entityInventory)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityInventory getWrappedEntityInventory() {
        return _entityInventory;
    }

    @Override
    public EntityInventory getWrappedModel() {
        return _entityInventory;
    }

    @Override
    public void resetOriginalValues() {
        _entityInventory.resetOriginalValues();
    }
}
