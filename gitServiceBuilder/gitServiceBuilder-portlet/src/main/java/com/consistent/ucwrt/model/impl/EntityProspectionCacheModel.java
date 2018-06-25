package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityProspection;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityProspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspection
 * @generated
 */
public class EntityProspectionCacheModel implements CacheModel<EntityProspection>,
    Externalizable {
    public int prospectionId;
    public String prospectionName;
    public int eventId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{prospectionId=");
        sb.append(prospectionId);
        sb.append(", prospectionName=");
        sb.append(prospectionName);
        sb.append(", eventId=");
        sb.append(eventId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityProspection toEntityModel() {
        EntityProspectionImpl entityProspectionImpl = new EntityProspectionImpl();

        entityProspectionImpl.setProspectionId(prospectionId);

        if (prospectionName == null) {
            entityProspectionImpl.setProspectionName(StringPool.BLANK);
        } else {
            entityProspectionImpl.setProspectionName(prospectionName);
        }

        entityProspectionImpl.setEventId(eventId);

        entityProspectionImpl.resetOriginalValues();

        return entityProspectionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        prospectionId = objectInput.readInt();
        prospectionName = objectInput.readUTF();
        eventId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(prospectionId);

        if (prospectionName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(prospectionName);
        }

        objectOutput.writeInt(eventId);
    }
}
