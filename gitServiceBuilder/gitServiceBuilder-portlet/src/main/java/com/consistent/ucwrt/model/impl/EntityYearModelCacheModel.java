package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityYearModel;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityYearModel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModel
 * @generated
 */
public class EntityYearModelCacheModel implements CacheModel<EntityYearModel>,
    Externalizable {
    public int yearModel;
    public long yearModelRegistrationDate;
    public String yearModelRegisterData;
    public String yModelResponsibleUser;
    public String yearModelDescription;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{yearModel=");
        sb.append(yearModel);
        sb.append(", yearModelRegistrationDate=");
        sb.append(yearModelRegistrationDate);
        sb.append(", yearModelRegisterData=");
        sb.append(yearModelRegisterData);
        sb.append(", yModelResponsibleUser=");
        sb.append(yModelResponsibleUser);
        sb.append(", yearModelDescription=");
        sb.append(yearModelDescription);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityYearModel toEntityModel() {
        EntityYearModelImpl entityYearModelImpl = new EntityYearModelImpl();

        entityYearModelImpl.setYearModel(yearModel);

        if (yearModelRegistrationDate == Long.MIN_VALUE) {
            entityYearModelImpl.setYearModelRegistrationDate(null);
        } else {
            entityYearModelImpl.setYearModelRegistrationDate(new Date(
                    yearModelRegistrationDate));
        }

        if (yearModelRegisterData == null) {
            entityYearModelImpl.setYearModelRegisterData(StringPool.BLANK);
        } else {
            entityYearModelImpl.setYearModelRegisterData(yearModelRegisterData);
        }

        if (yModelResponsibleUser == null) {
            entityYearModelImpl.setYModelResponsibleUser(StringPool.BLANK);
        } else {
            entityYearModelImpl.setYModelResponsibleUser(yModelResponsibleUser);
        }

        if (yearModelDescription == null) {
            entityYearModelImpl.setYearModelDescription(StringPool.BLANK);
        } else {
            entityYearModelImpl.setYearModelDescription(yearModelDescription);
        }

        entityYearModelImpl.resetOriginalValues();

        return entityYearModelImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        yearModel = objectInput.readInt();
        yearModelRegistrationDate = objectInput.readLong();
        yearModelRegisterData = objectInput.readUTF();
        yModelResponsibleUser = objectInput.readUTF();
        yearModelDescription = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(yearModel);
        objectOutput.writeLong(yearModelRegistrationDate);

        if (yearModelRegisterData == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(yearModelRegisterData);
        }

        if (yModelResponsibleUser == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(yModelResponsibleUser);
        }

        if (yearModelDescription == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(yearModelDescription);
        }
    }
}
