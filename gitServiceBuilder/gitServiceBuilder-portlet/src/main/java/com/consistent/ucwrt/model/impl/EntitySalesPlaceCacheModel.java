package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntitySalesPlace;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntitySalesPlace in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlace
 * @generated
 */
public class EntitySalesPlaceCacheModel implements CacheModel<EntitySalesPlace>,
    Externalizable {
    public int salesPlaceId;
    public String salePlaceName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{salesPlaceId=");
        sb.append(salesPlaceId);
        sb.append(", salePlaceName=");
        sb.append(salePlaceName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntitySalesPlace toEntityModel() {
        EntitySalesPlaceImpl entitySalesPlaceImpl = new EntitySalesPlaceImpl();

        entitySalesPlaceImpl.setSalesPlaceId(salesPlaceId);

        if (salePlaceName == null) {
            entitySalesPlaceImpl.setSalePlaceName(StringPool.BLANK);
        } else {
            entitySalesPlaceImpl.setSalePlaceName(salePlaceName);
        }

        entitySalesPlaceImpl.resetOriginalValues();

        return entitySalesPlaceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        salesPlaceId = objectInput.readInt();
        salePlaceName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(salesPlaceId);

        if (salePlaceName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(salePlaceName);
        }
    }
}
