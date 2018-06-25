package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityModel;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityModel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityModel
 * @generated
 */
public class EntityModelCacheModel implements CacheModel<EntityModel>,
    Externalizable {
    public int modelId;
    public int brandId;
    public int yearModel;
    public String modelName;
    public String modelDescription;
    public long modelRegistrationDate;
    public String modelRegisterData;
    public String modelResponsibleUser;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{modelId=");
        sb.append(modelId);
        sb.append(", brandId=");
        sb.append(brandId);
        sb.append(", yearModel=");
        sb.append(yearModel);
        sb.append(", modelName=");
        sb.append(modelName);
        sb.append(", modelDescription=");
        sb.append(modelDescription);
        sb.append(", modelRegistrationDate=");
        sb.append(modelRegistrationDate);
        sb.append(", modelRegisterData=");
        sb.append(modelRegisterData);
        sb.append(", modelResponsibleUser=");
        sb.append(modelResponsibleUser);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityModel toEntityModel() {
        EntityModelImpl entityModelImpl = new EntityModelImpl();

        entityModelImpl.setModelId(modelId);
        entityModelImpl.setBrandId(brandId);
        entityModelImpl.setYearModel(yearModel);

        if (modelName == null) {
            entityModelImpl.setModelName(StringPool.BLANK);
        } else {
            entityModelImpl.setModelName(modelName);
        }

        if (modelDescription == null) {
            entityModelImpl.setModelDescription(StringPool.BLANK);
        } else {
            entityModelImpl.setModelDescription(modelDescription);
        }

        if (modelRegistrationDate == Long.MIN_VALUE) {
            entityModelImpl.setModelRegistrationDate(null);
        } else {
            entityModelImpl.setModelRegistrationDate(new Date(
                    modelRegistrationDate));
        }

        if (modelRegisterData == null) {
            entityModelImpl.setModelRegisterData(StringPool.BLANK);
        } else {
            entityModelImpl.setModelRegisterData(modelRegisterData);
        }

        if (modelResponsibleUser == null) {
            entityModelImpl.setModelResponsibleUser(StringPool.BLANK);
        } else {
            entityModelImpl.setModelResponsibleUser(modelResponsibleUser);
        }

        entityModelImpl.resetOriginalValues();

        return entityModelImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        modelId = objectInput.readInt();
        brandId = objectInput.readInt();
        yearModel = objectInput.readInt();
        modelName = objectInput.readUTF();
        modelDescription = objectInput.readUTF();
        modelRegistrationDate = objectInput.readLong();
        modelRegisterData = objectInput.readUTF();
        modelResponsibleUser = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(modelId);
        objectOutput.writeInt(brandId);
        objectOutput.writeInt(yearModel);

        if (modelName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(modelName);
        }

        if (modelDescription == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(modelDescription);
        }

        objectOutput.writeLong(modelRegistrationDate);

        if (modelRegisterData == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(modelRegisterData);
        }

        if (modelResponsibleUser == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(modelResponsibleUser);
        }
    }
}
