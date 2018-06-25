package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntitySale;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntitySale in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySale
 * @generated
 */
public class EntitySaleCacheModel implements CacheModel<EntitySale>,
    Externalizable {
    public int saleId;
    public String confirmBySale;
    public long deliveryDate;
    public String assurantCertificate;
    public String extendedWarranty;
    public double realGrossProfit;
    public double finalSalePrice;
    public int clientId;
    public int employeeId;
    public int salesPlaceId;
    public int prospectionId;
    public int wayPayId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{saleId=");
        sb.append(saleId);
        sb.append(", confirmBySale=");
        sb.append(confirmBySale);
        sb.append(", deliveryDate=");
        sb.append(deliveryDate);
        sb.append(", assurantCertificate=");
        sb.append(assurantCertificate);
        sb.append(", extendedWarranty=");
        sb.append(extendedWarranty);
        sb.append(", realGrossProfit=");
        sb.append(realGrossProfit);
        sb.append(", finalSalePrice=");
        sb.append(finalSalePrice);
        sb.append(", clientId=");
        sb.append(clientId);
        sb.append(", employeeId=");
        sb.append(employeeId);
        sb.append(", salesPlaceId=");
        sb.append(salesPlaceId);
        sb.append(", prospectionId=");
        sb.append(prospectionId);
        sb.append(", wayPayId=");
        sb.append(wayPayId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntitySale toEntityModel() {
        EntitySaleImpl entitySaleImpl = new EntitySaleImpl();

        entitySaleImpl.setSaleId(saleId);

        if (confirmBySale == null) {
            entitySaleImpl.setConfirmBySale(StringPool.BLANK);
        } else {
            entitySaleImpl.setConfirmBySale(confirmBySale);
        }

        if (deliveryDate == Long.MIN_VALUE) {
            entitySaleImpl.setDeliveryDate(null);
        } else {
            entitySaleImpl.setDeliveryDate(new Date(deliveryDate));
        }

        if (assurantCertificate == null) {
            entitySaleImpl.setAssurantCertificate(StringPool.BLANK);
        } else {
            entitySaleImpl.setAssurantCertificate(assurantCertificate);
        }

        if (extendedWarranty == null) {
            entitySaleImpl.setExtendedWarranty(StringPool.BLANK);
        } else {
            entitySaleImpl.setExtendedWarranty(extendedWarranty);
        }

        entitySaleImpl.setRealGrossProfit(realGrossProfit);
        entitySaleImpl.setFinalSalePrice(finalSalePrice);
        entitySaleImpl.setClientId(clientId);
        entitySaleImpl.setEmployeeId(employeeId);
        entitySaleImpl.setSalesPlaceId(salesPlaceId);
        entitySaleImpl.setProspectionId(prospectionId);
        entitySaleImpl.setWayPayId(wayPayId);

        entitySaleImpl.resetOriginalValues();

        return entitySaleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        saleId = objectInput.readInt();
        confirmBySale = objectInput.readUTF();
        deliveryDate = objectInput.readLong();
        assurantCertificate = objectInput.readUTF();
        extendedWarranty = objectInput.readUTF();
        realGrossProfit = objectInput.readDouble();
        finalSalePrice = objectInput.readDouble();
        clientId = objectInput.readInt();
        employeeId = objectInput.readInt();
        salesPlaceId = objectInput.readInt();
        prospectionId = objectInput.readInt();
        wayPayId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(saleId);

        if (confirmBySale == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(confirmBySale);
        }

        objectOutput.writeLong(deliveryDate);

        if (assurantCertificate == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(assurantCertificate);
        }

        if (extendedWarranty == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(extendedWarranty);
        }

        objectOutput.writeDouble(realGrossProfit);
        objectOutput.writeDouble(finalSalePrice);
        objectOutput.writeInt(clientId);
        objectOutput.writeInt(employeeId);
        objectOutput.writeInt(salesPlaceId);
        objectOutput.writeInt(prospectionId);
        objectOutput.writeInt(wayPayId);
    }
}
