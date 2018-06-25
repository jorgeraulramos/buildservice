package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityAddress;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddress
 * @generated
 */
public class EntityAddressCacheModel implements CacheModel<EntityAddress>,
    Externalizable {
    public int addressId;
    public String street;
    public int interiorNumber;
    public int exteriorNumber;
    public int clientId;
    public int municipalId;
    public int stateId;
    public int suburbId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{addressId=");
        sb.append(addressId);
        sb.append(", street=");
        sb.append(street);
        sb.append(", interiorNumber=");
        sb.append(interiorNumber);
        sb.append(", exteriorNumber=");
        sb.append(exteriorNumber);
        sb.append(", clientId=");
        sb.append(clientId);
        sb.append(", municipalId=");
        sb.append(municipalId);
        sb.append(", stateId=");
        sb.append(stateId);
        sb.append(", suburbId=");
        sb.append(suburbId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityAddress toEntityModel() {
        EntityAddressImpl entityAddressImpl = new EntityAddressImpl();

        entityAddressImpl.setAddressId(addressId);

        if (street == null) {
            entityAddressImpl.setStreet(StringPool.BLANK);
        } else {
            entityAddressImpl.setStreet(street);
        }

        entityAddressImpl.setInteriorNumber(interiorNumber);
        entityAddressImpl.setExteriorNumber(exteriorNumber);
        entityAddressImpl.setClientId(clientId);
        entityAddressImpl.setMunicipalId(municipalId);
        entityAddressImpl.setStateId(stateId);
        entityAddressImpl.setSuburbId(suburbId);

        entityAddressImpl.resetOriginalValues();

        return entityAddressImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        addressId = objectInput.readInt();
        street = objectInput.readUTF();
        interiorNumber = objectInput.readInt();
        exteriorNumber = objectInput.readInt();
        clientId = objectInput.readInt();
        municipalId = objectInput.readInt();
        stateId = objectInput.readInt();
        suburbId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(addressId);

        if (street == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(street);
        }

        objectOutput.writeInt(interiorNumber);
        objectOutput.writeInt(exteriorNumber);
        objectOutput.writeInt(clientId);
        objectOutput.writeInt(municipalId);
        objectOutput.writeInt(stateId);
        objectOutput.writeInt(suburbId);
    }
}
