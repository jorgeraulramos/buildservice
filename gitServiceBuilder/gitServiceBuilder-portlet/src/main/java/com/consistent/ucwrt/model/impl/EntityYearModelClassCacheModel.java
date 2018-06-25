package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityYearModelClass;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityYearModelClass in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClass
 * @generated
 */
public class EntityYearModelClassCacheModel implements CacheModel<EntityYearModelClass>,
    Externalizable {
    public int classId;
    public int yearModel;
    public int startKilometer;
    public int finishKilometers;
    public double price;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{classId=");
        sb.append(classId);
        sb.append(", yearModel=");
        sb.append(yearModel);
        sb.append(", startKilometer=");
        sb.append(startKilometer);
        sb.append(", finishKilometers=");
        sb.append(finishKilometers);
        sb.append(", price=");
        sb.append(price);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityYearModelClass toEntityModel() {
        EntityYearModelClassImpl entityYearModelClassImpl = new EntityYearModelClassImpl();

        entityYearModelClassImpl.setClassId(classId);
        entityYearModelClassImpl.setYearModel(yearModel);
        entityYearModelClassImpl.setStartKilometer(startKilometer);
        entityYearModelClassImpl.setFinishKilometers(finishKilometers);
        entityYearModelClassImpl.setPrice(price);

        entityYearModelClassImpl.resetOriginalValues();

        return entityYearModelClassImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        classId = objectInput.readInt();
        yearModel = objectInput.readInt();
        startKilometer = objectInput.readInt();
        finishKilometers = objectInput.readInt();
        price = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(classId);
        objectOutput.writeInt(yearModel);
        objectOutput.writeInt(startKilometer);
        objectOutput.writeInt(finishKilometers);
        objectOutput.writeDouble(price);
    }
}
