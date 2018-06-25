package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityVersionAuto;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityVersionAuto in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAuto
 * @generated
 */
public class EntityVersionAutoCacheModel implements CacheModel<EntityVersionAuto>,
    Externalizable {
    public int versionId;
    public String versionName;
    public long versionRegistrationDate;
    public String versionResponsibleUser;
    public String versionRegisterData;
    public double purchasePrice;
    public double salePrice;
    public double purchasePriceDll;
    public String typeload;
    public String colorName;
    public int modelId;
    public int brandId;
    public int yearModel;
    public int classId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{versionId=");
        sb.append(versionId);
        sb.append(", versionName=");
        sb.append(versionName);
        sb.append(", versionRegistrationDate=");
        sb.append(versionRegistrationDate);
        sb.append(", versionResponsibleUser=");
        sb.append(versionResponsibleUser);
        sb.append(", versionRegisterData=");
        sb.append(versionRegisterData);
        sb.append(", purchasePrice=");
        sb.append(purchasePrice);
        sb.append(", salePrice=");
        sb.append(salePrice);
        sb.append(", purchasePriceDll=");
        sb.append(purchasePriceDll);
        sb.append(", typeload=");
        sb.append(typeload);
        sb.append(", colorName=");
        sb.append(colorName);
        sb.append(", modelId=");
        sb.append(modelId);
        sb.append(", brandId=");
        sb.append(brandId);
        sb.append(", yearModel=");
        sb.append(yearModel);
        sb.append(", classId=");
        sb.append(classId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityVersionAuto toEntityModel() {
        EntityVersionAutoImpl entityVersionAutoImpl = new EntityVersionAutoImpl();

        entityVersionAutoImpl.setVersionId(versionId);

        if (versionName == null) {
            entityVersionAutoImpl.setVersionName(StringPool.BLANK);
        } else {
            entityVersionAutoImpl.setVersionName(versionName);
        }

        if (versionRegistrationDate == Long.MIN_VALUE) {
            entityVersionAutoImpl.setVersionRegistrationDate(null);
        } else {
            entityVersionAutoImpl.setVersionRegistrationDate(new Date(
                    versionRegistrationDate));
        }

        if (versionResponsibleUser == null) {
            entityVersionAutoImpl.setVersionResponsibleUser(StringPool.BLANK);
        } else {
            entityVersionAutoImpl.setVersionResponsibleUser(versionResponsibleUser);
        }

        if (versionRegisterData == null) {
            entityVersionAutoImpl.setVersionRegisterData(StringPool.BLANK);
        } else {
            entityVersionAutoImpl.setVersionRegisterData(versionRegisterData);
        }

        entityVersionAutoImpl.setPurchasePrice(purchasePrice);
        entityVersionAutoImpl.setSalePrice(salePrice);
        entityVersionAutoImpl.setPurchasePriceDll(purchasePriceDll);

        if (typeload == null) {
            entityVersionAutoImpl.setTypeload(StringPool.BLANK);
        } else {
            entityVersionAutoImpl.setTypeload(typeload);
        }

        if (colorName == null) {
            entityVersionAutoImpl.setColorName(StringPool.BLANK);
        } else {
            entityVersionAutoImpl.setColorName(colorName);
        }

        entityVersionAutoImpl.setModelId(modelId);
        entityVersionAutoImpl.setBrandId(brandId);
        entityVersionAutoImpl.setYearModel(yearModel);
        entityVersionAutoImpl.setClassId(classId);

        entityVersionAutoImpl.resetOriginalValues();

        return entityVersionAutoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        versionId = objectInput.readInt();
        versionName = objectInput.readUTF();
        versionRegistrationDate = objectInput.readLong();
        versionResponsibleUser = objectInput.readUTF();
        versionRegisterData = objectInput.readUTF();
        purchasePrice = objectInput.readDouble();
        salePrice = objectInput.readDouble();
        purchasePriceDll = objectInput.readDouble();
        typeload = objectInput.readUTF();
        colorName = objectInput.readUTF();
        modelId = objectInput.readInt();
        brandId = objectInput.readInt();
        yearModel = objectInput.readInt();
        classId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(versionId);

        if (versionName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(versionName);
        }

        objectOutput.writeLong(versionRegistrationDate);

        if (versionResponsibleUser == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(versionResponsibleUser);
        }

        if (versionRegisterData == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(versionRegisterData);
        }

        objectOutput.writeDouble(purchasePrice);
        objectOutput.writeDouble(salePrice);
        objectOutput.writeDouble(purchasePriceDll);

        if (typeload == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(typeload);
        }

        if (colorName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(colorName);
        }

        objectOutput.writeInt(modelId);
        objectOutput.writeInt(brandId);
        objectOutput.writeInt(yearModel);
        objectOutput.writeInt(classId);
    }
}
