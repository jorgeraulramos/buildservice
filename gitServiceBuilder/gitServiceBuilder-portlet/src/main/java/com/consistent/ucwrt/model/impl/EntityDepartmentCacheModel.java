package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityDepartment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityDepartment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartment
 * @generated
 */
public class EntityDepartmentCacheModel implements CacheModel<EntityDepartment>,
    Externalizable {
    public String departmentId;
    public String departmentName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{departmentId=");
        sb.append(departmentId);
        sb.append(", departmentName=");
        sb.append(departmentName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityDepartment toEntityModel() {
        EntityDepartmentImpl entityDepartmentImpl = new EntityDepartmentImpl();

        if (departmentId == null) {
            entityDepartmentImpl.setDepartmentId(StringPool.BLANK);
        } else {
            entityDepartmentImpl.setDepartmentId(departmentId);
        }

        if (departmentName == null) {
            entityDepartmentImpl.setDepartmentName(StringPool.BLANK);
        } else {
            entityDepartmentImpl.setDepartmentName(departmentName);
        }

        entityDepartmentImpl.resetOriginalValues();

        return entityDepartmentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        departmentId = objectInput.readUTF();
        departmentName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (departmentId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(departmentId);
        }

        if (departmentName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(departmentName);
        }
    }
}
