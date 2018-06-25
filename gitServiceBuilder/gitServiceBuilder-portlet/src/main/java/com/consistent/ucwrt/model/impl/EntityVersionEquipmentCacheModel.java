package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityVersionEquipment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityVersionEquipment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipment
 * @generated
 */
public class EntityVersionEquipmentCacheModel implements CacheModel<EntityVersionEquipment>,
    Externalizable {
    public int equipmentId;
    public int versionId;
    public int modelId;
    public String brandName;
    public int yearModel;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{equipmentId=");
        sb.append(equipmentId);
        sb.append(", versionId=");
        sb.append(versionId);
        sb.append(", modelId=");
        sb.append(modelId);
        sb.append(", brandName=");
        sb.append(brandName);
        sb.append(", yearModel=");
        sb.append(yearModel);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityVersionEquipment toEntityModel() {
        EntityVersionEquipmentImpl entityVersionEquipmentImpl = new EntityVersionEquipmentImpl();

        entityVersionEquipmentImpl.setEquipmentId(equipmentId);
        entityVersionEquipmentImpl.setVersionId(versionId);
        entityVersionEquipmentImpl.setModelId(modelId);

        if (brandName == null) {
            entityVersionEquipmentImpl.setBrandName(StringPool.BLANK);
        } else {
            entityVersionEquipmentImpl.setBrandName(brandName);
        }

        entityVersionEquipmentImpl.setYearModel(yearModel);

        entityVersionEquipmentImpl.resetOriginalValues();

        return entityVersionEquipmentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        equipmentId = objectInput.readInt();
        versionId = objectInput.readInt();
        modelId = objectInput.readInt();
        brandName = objectInput.readUTF();
        yearModel = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(equipmentId);
        objectOutput.writeInt(versionId);
        objectOutput.writeInt(modelId);

        if (brandName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(brandName);
        }

        objectOutput.writeInt(yearModel);
    }
}
