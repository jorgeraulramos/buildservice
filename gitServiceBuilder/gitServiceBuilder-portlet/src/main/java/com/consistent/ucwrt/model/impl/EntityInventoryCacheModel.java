package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityInventory;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityInventory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventory
 * @generated
 */
public class EntityInventoryCacheModel implements CacheModel<EntityInventory>,
    Externalizable {
    public int inventoryId;
    public String dealerId;
    public String businessBrandName;
    public int versionId;
    public int yearModel;
    public int brandId;
    public int modelId;
    public String carExchange;
    public String chasis;
    public double kilometer;
    public int numberDoors;
    public double purchasePrice;
    public double damage;
    public double estimatedSalePrice;
    public double estimatedGrossProfit;
    public long dateAdmission;
    public String selfCertified;
    public long inventoryRegistrationDate;
    public String whatProcessDischarged;
    public String engineLiters;
    public String transmission;
    public String location;
    public int hp;
    public String carToConsignment;
    public String comments;
    public String status;
    public String color;
    public String daysSpentInventory;
    public double suggestedPricePurchase;
    public double suggestedSalePrice;
    public int versionPricePurchaseSale;
    public String statusName;
    public int sourceSupplyId;
    public int inventoryClasificationId;
    public int saleId;
    public String tradeInId;
    public int employeeId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(75);

        sb.append("{inventoryId=");
        sb.append(inventoryId);
        sb.append(", dealerId=");
        sb.append(dealerId);
        sb.append(", businessBrandName=");
        sb.append(businessBrandName);
        sb.append(", versionId=");
        sb.append(versionId);
        sb.append(", yearModel=");
        sb.append(yearModel);
        sb.append(", brandId=");
        sb.append(brandId);
        sb.append(", modelId=");
        sb.append(modelId);
        sb.append(", carExchange=");
        sb.append(carExchange);
        sb.append(", chasis=");
        sb.append(chasis);
        sb.append(", kilometer=");
        sb.append(kilometer);
        sb.append(", numberDoors=");
        sb.append(numberDoors);
        sb.append(", purchasePrice=");
        sb.append(purchasePrice);
        sb.append(", damage=");
        sb.append(damage);
        sb.append(", estimatedSalePrice=");
        sb.append(estimatedSalePrice);
        sb.append(", estimatedGrossProfit=");
        sb.append(estimatedGrossProfit);
        sb.append(", dateAdmission=");
        sb.append(dateAdmission);
        sb.append(", selfCertified=");
        sb.append(selfCertified);
        sb.append(", inventoryRegistrationDate=");
        sb.append(inventoryRegistrationDate);
        sb.append(", whatProcessDischarged=");
        sb.append(whatProcessDischarged);
        sb.append(", engineLiters=");
        sb.append(engineLiters);
        sb.append(", transmission=");
        sb.append(transmission);
        sb.append(", location=");
        sb.append(location);
        sb.append(", hp=");
        sb.append(hp);
        sb.append(", carToConsignment=");
        sb.append(carToConsignment);
        sb.append(", comments=");
        sb.append(comments);
        sb.append(", status=");
        sb.append(status);
        sb.append(", color=");
        sb.append(color);
        sb.append(", daysSpentInventory=");
        sb.append(daysSpentInventory);
        sb.append(", suggestedPricePurchase=");
        sb.append(suggestedPricePurchase);
        sb.append(", suggestedSalePrice=");
        sb.append(suggestedSalePrice);
        sb.append(", versionPricePurchaseSale=");
        sb.append(versionPricePurchaseSale);
        sb.append(", statusName=");
        sb.append(statusName);
        sb.append(", sourceSupplyId=");
        sb.append(sourceSupplyId);
        sb.append(", inventoryClasificationId=");
        sb.append(inventoryClasificationId);
        sb.append(", saleId=");
        sb.append(saleId);
        sb.append(", tradeInId=");
        sb.append(tradeInId);
        sb.append(", employeeId=");
        sb.append(employeeId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityInventory toEntityModel() {
        EntityInventoryImpl entityInventoryImpl = new EntityInventoryImpl();

        entityInventoryImpl.setInventoryId(inventoryId);

        if (dealerId == null) {
            entityInventoryImpl.setDealerId(StringPool.BLANK);
        } else {
            entityInventoryImpl.setDealerId(dealerId);
        }

        if (businessBrandName == null) {
            entityInventoryImpl.setBusinessBrandName(StringPool.BLANK);
        } else {
            entityInventoryImpl.setBusinessBrandName(businessBrandName);
        }

        entityInventoryImpl.setVersionId(versionId);
        entityInventoryImpl.setYearModel(yearModel);
        entityInventoryImpl.setBrandId(brandId);
        entityInventoryImpl.setModelId(modelId);

        if (carExchange == null) {
            entityInventoryImpl.setCarExchange(StringPool.BLANK);
        } else {
            entityInventoryImpl.setCarExchange(carExchange);
        }

        if (chasis == null) {
            entityInventoryImpl.setChasis(StringPool.BLANK);
        } else {
            entityInventoryImpl.setChasis(chasis);
        }

        entityInventoryImpl.setKilometer(kilometer);
        entityInventoryImpl.setNumberDoors(numberDoors);
        entityInventoryImpl.setPurchasePrice(purchasePrice);
        entityInventoryImpl.setDamage(damage);
        entityInventoryImpl.setEstimatedSalePrice(estimatedSalePrice);
        entityInventoryImpl.setEstimatedGrossProfit(estimatedGrossProfit);

        if (dateAdmission == Long.MIN_VALUE) {
            entityInventoryImpl.setDateAdmission(null);
        } else {
            entityInventoryImpl.setDateAdmission(new Date(dateAdmission));
        }

        if (selfCertified == null) {
            entityInventoryImpl.setSelfCertified(StringPool.BLANK);
        } else {
            entityInventoryImpl.setSelfCertified(selfCertified);
        }

        if (inventoryRegistrationDate == Long.MIN_VALUE) {
            entityInventoryImpl.setInventoryRegistrationDate(null);
        } else {
            entityInventoryImpl.setInventoryRegistrationDate(new Date(
                    inventoryRegistrationDate));
        }

        if (whatProcessDischarged == null) {
            entityInventoryImpl.setWhatProcessDischarged(StringPool.BLANK);
        } else {
            entityInventoryImpl.setWhatProcessDischarged(whatProcessDischarged);
        }

        if (engineLiters == null) {
            entityInventoryImpl.setEngineLiters(StringPool.BLANK);
        } else {
            entityInventoryImpl.setEngineLiters(engineLiters);
        }

        if (transmission == null) {
            entityInventoryImpl.setTransmission(StringPool.BLANK);
        } else {
            entityInventoryImpl.setTransmission(transmission);
        }

        if (location == null) {
            entityInventoryImpl.setLocation(StringPool.BLANK);
        } else {
            entityInventoryImpl.setLocation(location);
        }

        entityInventoryImpl.setHp(hp);

        if (carToConsignment == null) {
            entityInventoryImpl.setCarToConsignment(StringPool.BLANK);
        } else {
            entityInventoryImpl.setCarToConsignment(carToConsignment);
        }

        if (comments == null) {
            entityInventoryImpl.setComments(StringPool.BLANK);
        } else {
            entityInventoryImpl.setComments(comments);
        }

        if (status == null) {
            entityInventoryImpl.setStatus(StringPool.BLANK);
        } else {
            entityInventoryImpl.setStatus(status);
        }

        if (color == null) {
            entityInventoryImpl.setColor(StringPool.BLANK);
        } else {
            entityInventoryImpl.setColor(color);
        }

        if (daysSpentInventory == null) {
            entityInventoryImpl.setDaysSpentInventory(StringPool.BLANK);
        } else {
            entityInventoryImpl.setDaysSpentInventory(daysSpentInventory);
        }

        entityInventoryImpl.setSuggestedPricePurchase(suggestedPricePurchase);
        entityInventoryImpl.setSuggestedSalePrice(suggestedSalePrice);
        entityInventoryImpl.setVersionPricePurchaseSale(versionPricePurchaseSale);

        if (statusName == null) {
            entityInventoryImpl.setStatusName(StringPool.BLANK);
        } else {
            entityInventoryImpl.setStatusName(statusName);
        }

        entityInventoryImpl.setSourceSupplyId(sourceSupplyId);
        entityInventoryImpl.setInventoryClasificationId(inventoryClasificationId);
        entityInventoryImpl.setSaleId(saleId);

        if (tradeInId == null) {
            entityInventoryImpl.setTradeInId(StringPool.BLANK);
        } else {
            entityInventoryImpl.setTradeInId(tradeInId);
        }

        entityInventoryImpl.setEmployeeId(employeeId);

        entityInventoryImpl.resetOriginalValues();

        return entityInventoryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        inventoryId = objectInput.readInt();
        dealerId = objectInput.readUTF();
        businessBrandName = objectInput.readUTF();
        versionId = objectInput.readInt();
        yearModel = objectInput.readInt();
        brandId = objectInput.readInt();
        modelId = objectInput.readInt();
        carExchange = objectInput.readUTF();
        chasis = objectInput.readUTF();
        kilometer = objectInput.readDouble();
        numberDoors = objectInput.readInt();
        purchasePrice = objectInput.readDouble();
        damage = objectInput.readDouble();
        estimatedSalePrice = objectInput.readDouble();
        estimatedGrossProfit = objectInput.readDouble();
        dateAdmission = objectInput.readLong();
        selfCertified = objectInput.readUTF();
        inventoryRegistrationDate = objectInput.readLong();
        whatProcessDischarged = objectInput.readUTF();
        engineLiters = objectInput.readUTF();
        transmission = objectInput.readUTF();
        location = objectInput.readUTF();
        hp = objectInput.readInt();
        carToConsignment = objectInput.readUTF();
        comments = objectInput.readUTF();
        status = objectInput.readUTF();
        color = objectInput.readUTF();
        daysSpentInventory = objectInput.readUTF();
        suggestedPricePurchase = objectInput.readDouble();
        suggestedSalePrice = objectInput.readDouble();
        versionPricePurchaseSale = objectInput.readInt();
        statusName = objectInput.readUTF();
        sourceSupplyId = objectInput.readInt();
        inventoryClasificationId = objectInput.readInt();
        saleId = objectInput.readInt();
        tradeInId = objectInput.readUTF();
        employeeId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(inventoryId);

        if (dealerId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dealerId);
        }

        if (businessBrandName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(businessBrandName);
        }

        objectOutput.writeInt(versionId);
        objectOutput.writeInt(yearModel);
        objectOutput.writeInt(brandId);
        objectOutput.writeInt(modelId);

        if (carExchange == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(carExchange);
        }

        if (chasis == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(chasis);
        }

        objectOutput.writeDouble(kilometer);
        objectOutput.writeInt(numberDoors);
        objectOutput.writeDouble(purchasePrice);
        objectOutput.writeDouble(damage);
        objectOutput.writeDouble(estimatedSalePrice);
        objectOutput.writeDouble(estimatedGrossProfit);
        objectOutput.writeLong(dateAdmission);

        if (selfCertified == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(selfCertified);
        }

        objectOutput.writeLong(inventoryRegistrationDate);

        if (whatProcessDischarged == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(whatProcessDischarged);
        }

        if (engineLiters == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(engineLiters);
        }

        if (transmission == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transmission);
        }

        if (location == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(location);
        }

        objectOutput.writeInt(hp);

        if (carToConsignment == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(carToConsignment);
        }

        if (comments == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(comments);
        }

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        if (color == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(color);
        }

        if (daysSpentInventory == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(daysSpentInventory);
        }

        objectOutput.writeDouble(suggestedPricePurchase);
        objectOutput.writeDouble(suggestedSalePrice);
        objectOutput.writeInt(versionPricePurchaseSale);

        if (statusName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(statusName);
        }

        objectOutput.writeInt(sourceSupplyId);
        objectOutput.writeInt(inventoryClasificationId);
        objectOutput.writeInt(saleId);

        if (tradeInId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tradeInId);
        }

        objectOutput.writeInt(employeeId);
    }
}
