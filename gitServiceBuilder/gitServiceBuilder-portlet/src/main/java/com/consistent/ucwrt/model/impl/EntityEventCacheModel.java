package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEvent;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityEvent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEvent
 * @generated
 */
public class EntityEventCacheModel implements CacheModel<EntityEvent>,
    Externalizable {
    public int eventId;
    public String eventName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{eventId=");
        sb.append(eventId);
        sb.append(", eventName=");
        sb.append(eventName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityEvent toEntityModel() {
        EntityEventImpl entityEventImpl = new EntityEventImpl();

        entityEventImpl.setEventId(eventId);

        if (eventName == null) {
            entityEventImpl.setEventName(StringPool.BLANK);
        } else {
            entityEventImpl.setEventName(eventName);
        }

        entityEventImpl.resetOriginalValues();

        return entityEventImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        eventId = objectInput.readInt();
        eventName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(eventId);

        if (eventName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(eventName);
        }
    }
}
