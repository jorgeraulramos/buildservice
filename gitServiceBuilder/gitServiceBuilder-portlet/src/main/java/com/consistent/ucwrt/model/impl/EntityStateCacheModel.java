package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityState;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityState in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityState
 * @generated
 */
public class EntityStateCacheModel implements CacheModel<EntityState>,
    Externalizable {
    public int stateId;
    public String stateName;
    public String capitalName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{stateId=");
        sb.append(stateId);
        sb.append(", stateName=");
        sb.append(stateName);
        sb.append(", capitalName=");
        sb.append(capitalName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityState toEntityModel() {
        EntityStateImpl entityStateImpl = new EntityStateImpl();

        entityStateImpl.setStateId(stateId);

        if (stateName == null) {
            entityStateImpl.setStateName(StringPool.BLANK);
        } else {
            entityStateImpl.setStateName(stateName);
        }

        if (capitalName == null) {
            entityStateImpl.setCapitalName(StringPool.BLANK);
        } else {
            entityStateImpl.setCapitalName(capitalName);
        }

        entityStateImpl.resetOriginalValues();

        return entityStateImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        stateId = objectInput.readInt();
        stateName = objectInput.readUTF();
        capitalName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(stateId);

        if (stateName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(stateName);
        }

        if (capitalName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(capitalName);
        }
    }
}
