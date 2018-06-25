package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityInventoryClasification;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityInventoryClasification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryClasification
 * @generated
 */
public class EntityInventoryClasificationCacheModel implements CacheModel<EntityInventoryClasification>,
    Externalizable {
    public int inventoryClasificationId;
    public String inventoryClasification;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{inventoryClasificationId=");
        sb.append(inventoryClasificationId);
        sb.append(", inventoryClasification=");
        sb.append(inventoryClasification);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityInventoryClasification toEntityModel() {
        EntityInventoryClasificationImpl entityInventoryClasificationImpl = new EntityInventoryClasificationImpl();

        entityInventoryClasificationImpl.setInventoryClasificationId(inventoryClasificationId);

        if (inventoryClasification == null) {
            entityInventoryClasificationImpl.setInventoryClasification(StringPool.BLANK);
        } else {
            entityInventoryClasificationImpl.setInventoryClasification(inventoryClasification);
        }

        entityInventoryClasificationImpl.resetOriginalValues();

        return entityInventoryClasificationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        inventoryClasificationId = objectInput.readInt();
        inventoryClasification = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(inventoryClasificationId);

        if (inventoryClasification == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inventoryClasification);
        }
    }
}
