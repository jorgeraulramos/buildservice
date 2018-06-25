package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntitySuburb;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntitySuburb in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburb
 * @generated
 */
public class EntitySuburbCacheModel implements CacheModel<EntitySuburb>,
    Externalizable {
    public int suburbId;
    public String suburbName;
    public String postalCode;
    public int municipalId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{suburbId=");
        sb.append(suburbId);
        sb.append(", suburbName=");
        sb.append(suburbName);
        sb.append(", postalCode=");
        sb.append(postalCode);
        sb.append(", municipalId=");
        sb.append(municipalId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntitySuburb toEntityModel() {
        EntitySuburbImpl entitySuburbImpl = new EntitySuburbImpl();

        entitySuburbImpl.setSuburbId(suburbId);

        if (suburbName == null) {
            entitySuburbImpl.setSuburbName(StringPool.BLANK);
        } else {
            entitySuburbImpl.setSuburbName(suburbName);
        }

        if (postalCode == null) {
            entitySuburbImpl.setPostalCode(StringPool.BLANK);
        } else {
            entitySuburbImpl.setPostalCode(postalCode);
        }

        entitySuburbImpl.setMunicipalId(municipalId);

        entitySuburbImpl.resetOriginalValues();

        return entitySuburbImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        suburbId = objectInput.readInt();
        suburbName = objectInput.readUTF();
        postalCode = objectInput.readUTF();
        municipalId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(suburbId);

        if (suburbName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(suburbName);
        }

        if (postalCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(postalCode);
        }

        objectOutput.writeInt(municipalId);
    }
}
