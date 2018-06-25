package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityInventoryLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityInventoryPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EntityInventoryClp extends BaseModelImpl<EntityInventory>
    implements EntityInventory {
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
    private BaseModel<?> _entityInventoryRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityInventoryClp() {
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
    public EntityInventoryPK getPrimaryKey() {
        return new EntityInventoryPK(_inventoryId, _dealerId,
            _businessBrandName, _versionId, _yearModel, _brandId, _modelId);
    }

    @Override
    public void setPrimaryKey(EntityInventoryPK primaryKey) {
        setInventoryId(primaryKey.inventoryId);
        setDealerId(primaryKey.dealerId);
        setBusinessBrandName(primaryKey.businessBrandName);
        setVersionId(primaryKey.versionId);
        setYearModel(primaryKey.yearModel);
        setBrandId(primaryKey.brandId);
        setModelId(primaryKey.modelId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityInventoryPK(_inventoryId, _dealerId,
            _businessBrandName, _versionId, _yearModel, _brandId, _modelId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityInventoryPK) primaryKeyObj);
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

    @Override
    public int getInventoryId() {
        return _inventoryId;
    }

    @Override
    public void setInventoryId(int inventoryId) {
        _inventoryId = inventoryId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setInventoryId", int.class);

                method.invoke(_entityInventoryRemoteModel, inventoryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDealerId() {
        return _dealerId;
    }

    @Override
    public void setDealerId(String dealerId) {
        _dealerId = dealerId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setDealerId", String.class);

                method.invoke(_entityInventoryRemoteModel, dealerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    @Override
    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessBrandName",
                        String.class);

                method.invoke(_entityInventoryRemoteModel, businessBrandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getVersionId() {
        return _versionId;
    }

    @Override
    public void setVersionId(int versionId) {
        _versionId = versionId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionId", int.class);

                method.invoke(_entityInventoryRemoteModel, versionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getYearModel() {
        return _yearModel;
    }

    @Override
    public void setYearModel(int yearModel) {
        _yearModel = yearModel;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setYearModel", int.class);

                method.invoke(_entityInventoryRemoteModel, yearModel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBrandId() {
        return _brandId;
    }

    @Override
    public void setBrandId(int brandId) {
        _brandId = brandId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setBrandId", int.class);

                method.invoke(_entityInventoryRemoteModel, brandId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getModelId() {
        return _modelId;
    }

    @Override
    public void setModelId(int modelId) {
        _modelId = modelId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setModelId", int.class);

                method.invoke(_entityInventoryRemoteModel, modelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCarExchange() {
        return _carExchange;
    }

    @Override
    public void setCarExchange(String carExchange) {
        _carExchange = carExchange;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setCarExchange", String.class);

                method.invoke(_entityInventoryRemoteModel, carExchange);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getChasis() {
        return _chasis;
    }

    @Override
    public void setChasis(String chasis) {
        _chasis = chasis;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setChasis", String.class);

                method.invoke(_entityInventoryRemoteModel, chasis);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getKilometer() {
        return _kilometer;
    }

    @Override
    public void setKilometer(double kilometer) {
        _kilometer = kilometer;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setKilometer", double.class);

                method.invoke(_entityInventoryRemoteModel, kilometer);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNumberDoors() {
        return _numberDoors;
    }

    @Override
    public void setNumberDoors(int numberDoors) {
        _numberDoors = numberDoors;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setNumberDoors", int.class);

                method.invoke(_entityInventoryRemoteModel, numberDoors);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPurchasePrice() {
        return _purchasePrice;
    }

    @Override
    public void setPurchasePrice(double purchasePrice) {
        _purchasePrice = purchasePrice;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchasePrice", double.class);

                method.invoke(_entityInventoryRemoteModel, purchasePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getDamage() {
        return _damage;
    }

    @Override
    public void setDamage(double damage) {
        _damage = damage;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setDamage", double.class);

                method.invoke(_entityInventoryRemoteModel, damage);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getEstimatedSalePrice() {
        return _estimatedSalePrice;
    }

    @Override
    public void setEstimatedSalePrice(double estimatedSalePrice) {
        _estimatedSalePrice = estimatedSalePrice;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setEstimatedSalePrice",
                        double.class);

                method.invoke(_entityInventoryRemoteModel, estimatedSalePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getEstimatedGrossProfit() {
        return _estimatedGrossProfit;
    }

    @Override
    public void setEstimatedGrossProfit(double estimatedGrossProfit) {
        _estimatedGrossProfit = estimatedGrossProfit;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setEstimatedGrossProfit",
                        double.class);

                method.invoke(_entityInventoryRemoteModel, estimatedGrossProfit);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDateAdmission() {
        return _dateAdmission;
    }

    @Override
    public void setDateAdmission(Date dateAdmission) {
        _dateAdmission = dateAdmission;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setDateAdmission", Date.class);

                method.invoke(_entityInventoryRemoteModel, dateAdmission);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSelfCertified() {
        return _selfCertified;
    }

    @Override
    public void setSelfCertified(String selfCertified) {
        _selfCertified = selfCertified;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setSelfCertified", String.class);

                method.invoke(_entityInventoryRemoteModel, selfCertified);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getInventoryRegistrationDate() {
        return _inventoryRegistrationDate;
    }

    @Override
    public void setInventoryRegistrationDate(Date inventoryRegistrationDate) {
        _inventoryRegistrationDate = inventoryRegistrationDate;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setInventoryRegistrationDate",
                        Date.class);

                method.invoke(_entityInventoryRemoteModel,
                    inventoryRegistrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getWhatProcessDischarged() {
        return _whatProcessDischarged;
    }

    @Override
    public void setWhatProcessDischarged(String whatProcessDischarged) {
        _whatProcessDischarged = whatProcessDischarged;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setWhatProcessDischarged",
                        String.class);

                method.invoke(_entityInventoryRemoteModel, whatProcessDischarged);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEngineLiters() {
        return _engineLiters;
    }

    @Override
    public void setEngineLiters(String engineLiters) {
        _engineLiters = engineLiters;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setEngineLiters", String.class);

                method.invoke(_entityInventoryRemoteModel, engineLiters);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTransmission() {
        return _transmission;
    }

    @Override
    public void setTransmission(String transmission) {
        _transmission = transmission;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setTransmission", String.class);

                method.invoke(_entityInventoryRemoteModel, transmission);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLocation() {
        return _location;
    }

    @Override
    public void setLocation(String location) {
        _location = location;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setLocation", String.class);

                method.invoke(_entityInventoryRemoteModel, location);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHp() {
        return _hp;
    }

    @Override
    public void setHp(int hp) {
        _hp = hp;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setHp", int.class);

                method.invoke(_entityInventoryRemoteModel, hp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCarToConsignment() {
        return _carToConsignment;
    }

    @Override
    public void setCarToConsignment(String carToConsignment) {
        _carToConsignment = carToConsignment;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setCarToConsignment",
                        String.class);

                method.invoke(_entityInventoryRemoteModel, carToConsignment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getComments() {
        return _comments;
    }

    @Override
    public void setComments(String comments) {
        _comments = comments;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setComments", String.class);

                method.invoke(_entityInventoryRemoteModel, comments);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatus() {
        return _status;
    }

    @Override
    public void setStatus(String status) {
        _status = status;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_entityInventoryRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getColor() {
        return _color;
    }

    @Override
    public void setColor(String color) {
        _color = color;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setColor", String.class);

                method.invoke(_entityInventoryRemoteModel, color);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDaysSpentInventory() {
        return _daysSpentInventory;
    }

    @Override
    public void setDaysSpentInventory(String daysSpentInventory) {
        _daysSpentInventory = daysSpentInventory;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setDaysSpentInventory",
                        String.class);

                method.invoke(_entityInventoryRemoteModel, daysSpentInventory);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getSuggestedPricePurchase() {
        return _suggestedPricePurchase;
    }

    @Override
    public void setSuggestedPricePurchase(double suggestedPricePurchase) {
        _suggestedPricePurchase = suggestedPricePurchase;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setSuggestedPricePurchase",
                        double.class);

                method.invoke(_entityInventoryRemoteModel,
                    suggestedPricePurchase);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getSuggestedSalePrice() {
        return _suggestedSalePrice;
    }

    @Override
    public void setSuggestedSalePrice(double suggestedSalePrice) {
        _suggestedSalePrice = suggestedSalePrice;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setSuggestedSalePrice",
                        double.class);

                method.invoke(_entityInventoryRemoteModel, suggestedSalePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getVersionPricePurchaseSale() {
        return _versionPricePurchaseSale;
    }

    @Override
    public void setVersionPricePurchaseSale(int versionPricePurchaseSale) {
        _versionPricePurchaseSale = versionPricePurchaseSale;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionPricePurchaseSale",
                        int.class);

                method.invoke(_entityInventoryRemoteModel,
                    versionPricePurchaseSale);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatusName() {
        return _statusName;
    }

    @Override
    public void setStatusName(String statusName) {
        _statusName = statusName;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusName", String.class);

                method.invoke(_entityInventoryRemoteModel, statusName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSourceSupplyId() {
        return _sourceSupplyId;
    }

    @Override
    public void setSourceSupplyId(int sourceSupplyId) {
        _sourceSupplyId = sourceSupplyId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setSourceSupplyId", int.class);

                method.invoke(_entityInventoryRemoteModel, sourceSupplyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getInventoryClasificationId() {
        return _inventoryClasificationId;
    }

    @Override
    public void setInventoryClasificationId(int inventoryClasificationId) {
        _inventoryClasificationId = inventoryClasificationId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setInventoryClasificationId",
                        int.class);

                method.invoke(_entityInventoryRemoteModel,
                    inventoryClasificationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSaleId() {
        return _saleId;
    }

    @Override
    public void setSaleId(int saleId) {
        _saleId = saleId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setSaleId", int.class);

                method.invoke(_entityInventoryRemoteModel, saleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTradeInId() {
        return _tradeInId;
    }

    @Override
    public void setTradeInId(String tradeInId) {
        _tradeInId = tradeInId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setTradeInId", String.class);

                method.invoke(_entityInventoryRemoteModel, tradeInId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;

        if (_entityInventoryRemoteModel != null) {
            try {
                Class<?> clazz = _entityInventoryRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", int.class);

                method.invoke(_entityInventoryRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityInventoryRemoteModel() {
        return _entityInventoryRemoteModel;
    }

    public void setEntityInventoryRemoteModel(
        BaseModel<?> entityInventoryRemoteModel) {
        _entityInventoryRemoteModel = entityInventoryRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _entityInventoryRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_entityInventoryRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityInventoryLocalServiceUtil.addEntityInventory(this);
        } else {
            EntityInventoryLocalServiceUtil.updateEntityInventory(this);
        }
    }

    @Override
    public EntityInventory toEscapedModel() {
        return (EntityInventory) ProxyUtil.newProxyInstance(EntityInventory.class.getClassLoader(),
            new Class[] { EntityInventory.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityInventoryClp clone = new EntityInventoryClp();

        clone.setInventoryId(getInventoryId());
        clone.setDealerId(getDealerId());
        clone.setBusinessBrandName(getBusinessBrandName());
        clone.setVersionId(getVersionId());
        clone.setYearModel(getYearModel());
        clone.setBrandId(getBrandId());
        clone.setModelId(getModelId());
        clone.setCarExchange(getCarExchange());
        clone.setChasis(getChasis());
        clone.setKilometer(getKilometer());
        clone.setNumberDoors(getNumberDoors());
        clone.setPurchasePrice(getPurchasePrice());
        clone.setDamage(getDamage());
        clone.setEstimatedSalePrice(getEstimatedSalePrice());
        clone.setEstimatedGrossProfit(getEstimatedGrossProfit());
        clone.setDateAdmission(getDateAdmission());
        clone.setSelfCertified(getSelfCertified());
        clone.setInventoryRegistrationDate(getInventoryRegistrationDate());
        clone.setWhatProcessDischarged(getWhatProcessDischarged());
        clone.setEngineLiters(getEngineLiters());
        clone.setTransmission(getTransmission());
        clone.setLocation(getLocation());
        clone.setHp(getHp());
        clone.setCarToConsignment(getCarToConsignment());
        clone.setComments(getComments());
        clone.setStatus(getStatus());
        clone.setColor(getColor());
        clone.setDaysSpentInventory(getDaysSpentInventory());
        clone.setSuggestedPricePurchase(getSuggestedPricePurchase());
        clone.setSuggestedSalePrice(getSuggestedSalePrice());
        clone.setVersionPricePurchaseSale(getVersionPricePurchaseSale());
        clone.setStatusName(getStatusName());
        clone.setSourceSupplyId(getSourceSupplyId());
        clone.setInventoryClasificationId(getInventoryClasificationId());
        clone.setSaleId(getSaleId());
        clone.setTradeInId(getTradeInId());
        clone.setEmployeeId(getEmployeeId());

        return clone;
    }

    @Override
    public int compareTo(EntityInventory entityInventory) {
        EntityInventoryPK primaryKey = entityInventory.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityInventoryClp)) {
            return false;
        }

        EntityInventoryClp entityInventory = (EntityInventoryClp) obj;

        EntityInventoryPK primaryKey = entityInventory.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(75);

        sb.append("{inventoryId=");
        sb.append(getInventoryId());
        sb.append(", dealerId=");
        sb.append(getDealerId());
        sb.append(", businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append(", versionId=");
        sb.append(getVersionId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append(", brandId=");
        sb.append(getBrandId());
        sb.append(", modelId=");
        sb.append(getModelId());
        sb.append(", carExchange=");
        sb.append(getCarExchange());
        sb.append(", chasis=");
        sb.append(getChasis());
        sb.append(", kilometer=");
        sb.append(getKilometer());
        sb.append(", numberDoors=");
        sb.append(getNumberDoors());
        sb.append(", purchasePrice=");
        sb.append(getPurchasePrice());
        sb.append(", damage=");
        sb.append(getDamage());
        sb.append(", estimatedSalePrice=");
        sb.append(getEstimatedSalePrice());
        sb.append(", estimatedGrossProfit=");
        sb.append(getEstimatedGrossProfit());
        sb.append(", dateAdmission=");
        sb.append(getDateAdmission());
        sb.append(", selfCertified=");
        sb.append(getSelfCertified());
        sb.append(", inventoryRegistrationDate=");
        sb.append(getInventoryRegistrationDate());
        sb.append(", whatProcessDischarged=");
        sb.append(getWhatProcessDischarged());
        sb.append(", engineLiters=");
        sb.append(getEngineLiters());
        sb.append(", transmission=");
        sb.append(getTransmission());
        sb.append(", location=");
        sb.append(getLocation());
        sb.append(", hp=");
        sb.append(getHp());
        sb.append(", carToConsignment=");
        sb.append(getCarToConsignment());
        sb.append(", comments=");
        sb.append(getComments());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", color=");
        sb.append(getColor());
        sb.append(", daysSpentInventory=");
        sb.append(getDaysSpentInventory());
        sb.append(", suggestedPricePurchase=");
        sb.append(getSuggestedPricePurchase());
        sb.append(", suggestedSalePrice=");
        sb.append(getSuggestedSalePrice());
        sb.append(", versionPricePurchaseSale=");
        sb.append(getVersionPricePurchaseSale());
        sb.append(", statusName=");
        sb.append(getStatusName());
        sb.append(", sourceSupplyId=");
        sb.append(getSourceSupplyId());
        sb.append(", inventoryClasificationId=");
        sb.append(getInventoryClasificationId());
        sb.append(", saleId=");
        sb.append(getSaleId());
        sb.append(", tradeInId=");
        sb.append(getTradeInId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(115);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityInventory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>inventoryId</column-name><column-value><![CDATA[");
        sb.append(getInventoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dealerId</column-name><column-value><![CDATA[");
        sb.append(getDealerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>businessBrandName</column-name><column-value><![CDATA[");
        sb.append(getBusinessBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionId</column-name><column-value><![CDATA[");
        sb.append(getVersionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandId</column-name><column-value><![CDATA[");
        sb.append(getBrandId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelId</column-name><column-value><![CDATA[");
        sb.append(getModelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>carExchange</column-name><column-value><![CDATA[");
        sb.append(getCarExchange());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>chasis</column-name><column-value><![CDATA[");
        sb.append(getChasis());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kilometer</column-name><column-value><![CDATA[");
        sb.append(getKilometer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numberDoors</column-name><column-value><![CDATA[");
        sb.append(getNumberDoors());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchasePrice</column-name><column-value><![CDATA[");
        sb.append(getPurchasePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>damage</column-name><column-value><![CDATA[");
        sb.append(getDamage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>estimatedSalePrice</column-name><column-value><![CDATA[");
        sb.append(getEstimatedSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>estimatedGrossProfit</column-name><column-value><![CDATA[");
        sb.append(getEstimatedGrossProfit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateAdmission</column-name><column-value><![CDATA[");
        sb.append(getDateAdmission());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>selfCertified</column-name><column-value><![CDATA[");
        sb.append(getSelfCertified());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inventoryRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getInventoryRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>whatProcessDischarged</column-name><column-value><![CDATA[");
        sb.append(getWhatProcessDischarged());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>engineLiters</column-name><column-value><![CDATA[");
        sb.append(getEngineLiters());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transmission</column-name><column-value><![CDATA[");
        sb.append(getTransmission());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>location</column-name><column-value><![CDATA[");
        sb.append(getLocation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hp</column-name><column-value><![CDATA[");
        sb.append(getHp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>carToConsignment</column-name><column-value><![CDATA[");
        sb.append(getCarToConsignment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>comments</column-name><column-value><![CDATA[");
        sb.append(getComments());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>color</column-name><column-value><![CDATA[");
        sb.append(getColor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>daysSpentInventory</column-name><column-value><![CDATA[");
        sb.append(getDaysSpentInventory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>suggestedPricePurchase</column-name><column-value><![CDATA[");
        sb.append(getSuggestedPricePurchase());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>suggestedSalePrice</column-name><column-value><![CDATA[");
        sb.append(getSuggestedSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionPricePurchaseSale</column-name><column-value><![CDATA[");
        sb.append(getVersionPricePurchaseSale());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusName</column-name><column-value><![CDATA[");
        sb.append(getStatusName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sourceSupplyId</column-name><column-value><![CDATA[");
        sb.append(getSourceSupplyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inventoryClasificationId</column-name><column-value><![CDATA[");
        sb.append(getInventoryClasificationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>saleId</column-name><column-value><![CDATA[");
        sb.append(getSaleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tradeInId</column-name><column-value><![CDATA[");
        sb.append(getTradeInId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
