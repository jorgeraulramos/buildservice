package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEmployment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityEmployment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployment
 * @generated
 */
public class EntityEmploymentCacheModel implements CacheModel<EntityEmployment>,
    Externalizable {
    public String employmentId;
    public String employmentName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{employmentId=");
        sb.append(employmentId);
        sb.append(", employmentName=");
        sb.append(employmentName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityEmployment toEntityModel() {
        EntityEmploymentImpl entityEmploymentImpl = new EntityEmploymentImpl();

        if (employmentId == null) {
            entityEmploymentImpl.setEmploymentId(StringPool.BLANK);
        } else {
            entityEmploymentImpl.setEmploymentId(employmentId);
        }

        if (employmentName == null) {
            entityEmploymentImpl.setEmploymentName(StringPool.BLANK);
        } else {
            entityEmploymentImpl.setEmploymentName(employmentName);
        }

        entityEmploymentImpl.resetOriginalValues();

        return entityEmploymentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employmentId = objectInput.readUTF();
        employmentName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (employmentId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employmentId);
        }

        if (employmentName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employmentName);
        }
    }
}
