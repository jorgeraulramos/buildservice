package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityIntervalos;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityIntervalos in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityIntervalos
 * @generated
 */
public class EntityIntervalosCacheModel implements CacheModel<EntityIntervalos>,
    Externalizable {
    public int startKilometer;
    public int finishKilometers;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{startKilometer=");
        sb.append(startKilometer);
        sb.append(", finishKilometers=");
        sb.append(finishKilometers);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityIntervalos toEntityModel() {
        EntityIntervalosImpl entityIntervalosImpl = new EntityIntervalosImpl();

        entityIntervalosImpl.setStartKilometer(startKilometer);
        entityIntervalosImpl.setFinishKilometers(finishKilometers);

        entityIntervalosImpl.resetOriginalValues();

        return entityIntervalosImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        startKilometer = objectInput.readInt();
        finishKilometers = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(startKilometer);
        objectOutput.writeInt(finishKilometers);
    }
}
