package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityZone;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityZone in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityZone
 * @generated
 */
public class EntityZoneCacheModel implements CacheModel<EntityZone>,
    Externalizable {
    public String zoneName;
    public String descriptionZone;
    public String userZoneManager;
    public String userSalesAreaManager;
    public String userRegionalAreaManager;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{zoneName=");
        sb.append(zoneName);
        sb.append(", descriptionZone=");
        sb.append(descriptionZone);
        sb.append(", userZoneManager=");
        sb.append(userZoneManager);
        sb.append(", userSalesAreaManager=");
        sb.append(userSalesAreaManager);
        sb.append(", userRegionalAreaManager=");
        sb.append(userRegionalAreaManager);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityZone toEntityModel() {
        EntityZoneImpl entityZoneImpl = new EntityZoneImpl();

        if (zoneName == null) {
            entityZoneImpl.setZoneName(StringPool.BLANK);
        } else {
            entityZoneImpl.setZoneName(zoneName);
        }

        if (descriptionZone == null) {
            entityZoneImpl.setDescriptionZone(StringPool.BLANK);
        } else {
            entityZoneImpl.setDescriptionZone(descriptionZone);
        }

        if (userZoneManager == null) {
            entityZoneImpl.setUserZoneManager(StringPool.BLANK);
        } else {
            entityZoneImpl.setUserZoneManager(userZoneManager);
        }

        if (userSalesAreaManager == null) {
            entityZoneImpl.setUserSalesAreaManager(StringPool.BLANK);
        } else {
            entityZoneImpl.setUserSalesAreaManager(userSalesAreaManager);
        }

        if (userRegionalAreaManager == null) {
            entityZoneImpl.setUserRegionalAreaManager(StringPool.BLANK);
        } else {
            entityZoneImpl.setUserRegionalAreaManager(userRegionalAreaManager);
        }

        entityZoneImpl.resetOriginalValues();

        return entityZoneImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        zoneName = objectInput.readUTF();
        descriptionZone = objectInput.readUTF();
        userZoneManager = objectInput.readUTF();
        userSalesAreaManager = objectInput.readUTF();
        userRegionalAreaManager = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (zoneName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(zoneName);
        }

        if (descriptionZone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptionZone);
        }

        if (userZoneManager == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userZoneManager);
        }

        if (userSalesAreaManager == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userSalesAreaManager);
        }

        if (userRegionalAreaManager == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userRegionalAreaManager);
        }
    }
}
