package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntitySourceOfSupply;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntitySourceOfSupply in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySourceOfSupply
 * @generated
 */
public class EntitySourceOfSupplyCacheModel implements CacheModel<EntitySourceOfSupply>,
    Externalizable {
    public int sourceSupplyId;
    public String sourceOfSupply;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{sourceSupplyId=");
        sb.append(sourceSupplyId);
        sb.append(", sourceOfSupply=");
        sb.append(sourceOfSupply);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntitySourceOfSupply toEntityModel() {
        EntitySourceOfSupplyImpl entitySourceOfSupplyImpl = new EntitySourceOfSupplyImpl();

        entitySourceOfSupplyImpl.setSourceSupplyId(sourceSupplyId);

        if (sourceOfSupply == null) {
            entitySourceOfSupplyImpl.setSourceOfSupply(StringPool.BLANK);
        } else {
            entitySourceOfSupplyImpl.setSourceOfSupply(sourceOfSupply);
        }

        entitySourceOfSupplyImpl.resetOriginalValues();

        return entitySourceOfSupplyImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        sourceSupplyId = objectInput.readInt();
        sourceOfSupply = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(sourceSupplyId);

        if (sourceOfSupply == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sourceOfSupply);
        }
    }
}
