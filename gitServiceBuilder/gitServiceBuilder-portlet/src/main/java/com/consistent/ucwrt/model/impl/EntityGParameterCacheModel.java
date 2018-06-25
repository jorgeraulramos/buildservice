package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityGParameter;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityGParameter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameter
 * @generated
 */
public class EntityGParameterCacheModel implements CacheModel<EntityGParameter>,
    Externalizable {
    public String parameterName;
    public String value;
    public String description;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{parameterName=");
        sb.append(parameterName);
        sb.append(", value=");
        sb.append(value);
        sb.append(", description=");
        sb.append(description);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityGParameter toEntityModel() {
        EntityGParameterImpl entityGParameterImpl = new EntityGParameterImpl();

        if (parameterName == null) {
            entityGParameterImpl.setParameterName(StringPool.BLANK);
        } else {
            entityGParameterImpl.setParameterName(parameterName);
        }

        if (value == null) {
            entityGParameterImpl.setValue(StringPool.BLANK);
        } else {
            entityGParameterImpl.setValue(value);
        }

        if (description == null) {
            entityGParameterImpl.setDescription(StringPool.BLANK);
        } else {
            entityGParameterImpl.setDescription(description);
        }

        entityGParameterImpl.resetOriginalValues();

        return entityGParameterImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        parameterName = objectInput.readUTF();
        value = objectInput.readUTF();
        description = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (parameterName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parameterName);
        }

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }
    }
}
