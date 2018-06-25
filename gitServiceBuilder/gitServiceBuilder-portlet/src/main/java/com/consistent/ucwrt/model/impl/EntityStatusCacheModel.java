package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityStatus;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityStatus in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatus
 * @generated
 */
public class EntityStatusCacheModel implements CacheModel<EntityStatus>,
    Externalizable {
    public String statusName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(3);

        sb.append("{statusName=");
        sb.append(statusName);

        return sb.toString();
    }

    @Override
    public EntityStatus toEntityModel() {
        EntityStatusImpl entityStatusImpl = new EntityStatusImpl();

        if (statusName == null) {
            entityStatusImpl.setStatusName(StringPool.BLANK);
        } else {
            entityStatusImpl.setStatusName(statusName);
        }

        entityStatusImpl.resetOriginalValues();

        return entityStatusImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        statusName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (statusName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(statusName);
        }
    }
}
