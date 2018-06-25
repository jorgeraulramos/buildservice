package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityClass;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityClass in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityClass
 * @generated
 */
public class EntityClassCacheModel implements CacheModel<EntityClass>,
    Externalizable {
    public int classId;
    public String className;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{classId=");
        sb.append(classId);
        sb.append(", className=");
        sb.append(className);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityClass toEntityModel() {
        EntityClassImpl entityClassImpl = new EntityClassImpl();

        entityClassImpl.setClassId(classId);

        if (className == null) {
            entityClassImpl.setClassName(StringPool.BLANK);
        } else {
            entityClassImpl.setClassName(className);
        }

        entityClassImpl.resetOriginalValues();

        return entityClassImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        classId = objectInput.readInt();
        className = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(classId);

        if (className == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(className);
        }
    }
}
