package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityBrand;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityBrand in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityBrand
 * @generated
 */
public class EntityBrandCacheModel implements CacheModel<EntityBrand>,
    Externalizable {
    public int brandId;
    public String brandName;
    public String brandDescription;
    public long brandRegistrationDate;
    public String registerData;
    public String responsibleUser;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{brandId=");
        sb.append(brandId);
        sb.append(", brandName=");
        sb.append(brandName);
        sb.append(", brandDescription=");
        sb.append(brandDescription);
        sb.append(", brandRegistrationDate=");
        sb.append(brandRegistrationDate);
        sb.append(", registerData=");
        sb.append(registerData);
        sb.append(", responsibleUser=");
        sb.append(responsibleUser);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityBrand toEntityModel() {
        EntityBrandImpl entityBrandImpl = new EntityBrandImpl();

        entityBrandImpl.setBrandId(brandId);

        if (brandName == null) {
            entityBrandImpl.setBrandName(StringPool.BLANK);
        } else {
            entityBrandImpl.setBrandName(brandName);
        }

        if (brandDescription == null) {
            entityBrandImpl.setBrandDescription(StringPool.BLANK);
        } else {
            entityBrandImpl.setBrandDescription(brandDescription);
        }

        if (brandRegistrationDate == Long.MIN_VALUE) {
            entityBrandImpl.setBrandRegistrationDate(null);
        } else {
            entityBrandImpl.setBrandRegistrationDate(new Date(
                    brandRegistrationDate));
        }

        if (registerData == null) {
            entityBrandImpl.setRegisterData(StringPool.BLANK);
        } else {
            entityBrandImpl.setRegisterData(registerData);
        }

        if (responsibleUser == null) {
            entityBrandImpl.setResponsibleUser(StringPool.BLANK);
        } else {
            entityBrandImpl.setResponsibleUser(responsibleUser);
        }

        entityBrandImpl.resetOriginalValues();

        return entityBrandImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        brandId = objectInput.readInt();
        brandName = objectInput.readUTF();
        brandDescription = objectInput.readUTF();
        brandRegistrationDate = objectInput.readLong();
        registerData = objectInput.readUTF();
        responsibleUser = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(brandId);

        if (brandName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(brandName);
        }

        if (brandDescription == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(brandDescription);
        }

        objectOutput.writeLong(brandRegistrationDate);

        if (registerData == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(registerData);
        }

        if (responsibleUser == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(responsibleUser);
        }
    }
}
