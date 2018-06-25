package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityWayToPay;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityWayToPay in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPay
 * @generated
 */
public class EntityWayToPayCacheModel implements CacheModel<EntityWayToPay>,
    Externalizable {
    public int wayPayId;
    public String payName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{wayPayId=");
        sb.append(wayPayId);
        sb.append(", payName=");
        sb.append(payName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityWayToPay toEntityModel() {
        EntityWayToPayImpl entityWayToPayImpl = new EntityWayToPayImpl();

        entityWayToPayImpl.setWayPayId(wayPayId);

        if (payName == null) {
            entityWayToPayImpl.setPayName(StringPool.BLANK);
        } else {
            entityWayToPayImpl.setPayName(payName);
        }

        entityWayToPayImpl.resetOriginalValues();

        return entityWayToPayImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        wayPayId = objectInput.readInt();
        payName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(wayPayId);

        if (payName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(payName);
        }
    }
}
