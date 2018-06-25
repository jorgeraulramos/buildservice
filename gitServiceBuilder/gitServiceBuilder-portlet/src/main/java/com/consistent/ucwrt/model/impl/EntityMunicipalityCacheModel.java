package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityMunicipality;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityMunicipality in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityMunicipality
 * @generated
 */
public class EntityMunicipalityCacheModel implements CacheModel<EntityMunicipality>,
    Externalizable {
    public int municipalId;
    public String municipalName;
    public int stateId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{municipalId=");
        sb.append(municipalId);
        sb.append(", municipalName=");
        sb.append(municipalName);
        sb.append(", stateId=");
        sb.append(stateId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityMunicipality toEntityModel() {
        EntityMunicipalityImpl entityMunicipalityImpl = new EntityMunicipalityImpl();

        entityMunicipalityImpl.setMunicipalId(municipalId);

        if (municipalName == null) {
            entityMunicipalityImpl.setMunicipalName(StringPool.BLANK);
        } else {
            entityMunicipalityImpl.setMunicipalName(municipalName);
        }

        entityMunicipalityImpl.setStateId(stateId);

        entityMunicipalityImpl.resetOriginalValues();

        return entityMunicipalityImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        municipalId = objectInput.readInt();
        municipalName = objectInput.readUTF();
        stateId = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(municipalId);

        if (municipalName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(municipalName);
        }

        objectOutput.writeInt(stateId);
    }
}
