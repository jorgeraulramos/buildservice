package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEquipment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityEquipment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEquipment
 * @generated
 */
public class EntityEquipmentCacheModel implements CacheModel<EntityEquipment>,
    Externalizable {
    public int equipmentId;
    public String equipmentDescription;
    public double equipmentPurchasePrice;
    public double equipmentPurchasePriceDll;
    public double equipmentSalePrice;
    public String status;
    public int modelId;
    public int brandId;
    public int yearModel;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{equipmentId=");
        sb.append(equipmentId);
        sb.append(", equipmentDescription=");
        sb.append(equipmentDescription);
        sb.append(", equipmentPurchasePrice=");
        sb.append(equipmentPurchasePrice);
        sb.append(", equipmentPurchasePriceDll=");
        sb.append(equipmentPurchasePriceDll);
        sb.append(", equipmentSalePrice=");
        sb.append(equipmentSalePrice);
        sb.append(", status=");
        sb.append(status);
        sb.append(", modelId=");
        sb.append(modelId);
        sb.append(", brandId=");
        sb.append(brandId);
        sb.append(", yearModel=");
        sb.append(yearModel);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityEquipment toEntityModel() {
        EntityEquipmentImpl entityEquipmentImpl = new EntityEquipmentImpl();

        entityEquipmentImpl.setEquipmentId(equipmentId);

        if (equipmentDescription == null) {
            entityEquipmentImpl.setEquipmentDescription(StringPool.BLANK);
        } else {
            entityEquipmentImpl.setEquipmentDescription(equipmentDescription);
        }

        entityEquipmentImpl.setEquipmentPurchasePrice(equipmentPurchasePrice);
        entityEquipmentImpl.setEquipmentPurchasePriceDll(equipmentPurchasePriceDll);
        entityEquipmentImpl.setEquipmentSalePrice(equipmentSalePrice);

        if (status == null) {
            entityEquipmentImpl.setStatus(StringPool.BLANK);
        } else {
            entityEquipmentImpl.setStatus(status);
        }

        entityEquipmentImpl.setModelId(modelId);
        entityEquipmentImpl.setBrandId(brandId);
        entityEquipmentImpl.setYearModel(yearModel);

        entityEquipmentImpl.resetOriginalValues();

        return entityEquipmentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        equipmentId = objectInput.readInt();
        equipmentDescription = objectInput.readUTF();
        equipmentPurchasePrice = objectInput.readDouble();
        equipmentPurchasePriceDll = objectInput.readDouble();
        equipmentSalePrice = objectInput.readDouble();
        status = objectInput.readUTF();
        modelId = objectInput.readInt();
        brandId = objectInput.readInt();
        yearModel = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(equipmentId);

        if (equipmentDescription == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(equipmentDescription);
        }

        objectOutput.writeDouble(equipmentPurchasePrice);
        objectOutput.writeDouble(equipmentPurchasePriceDll);
        objectOutput.writeDouble(equipmentSalePrice);

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        objectOutput.writeInt(modelId);
        objectOutput.writeInt(brandId);
        objectOutput.writeInt(yearModel);
    }
}
