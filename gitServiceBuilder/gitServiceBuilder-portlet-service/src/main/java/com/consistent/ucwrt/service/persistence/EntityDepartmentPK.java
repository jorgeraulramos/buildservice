package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityDepartmentPK implements Comparable<EntityDepartmentPK>,
    Serializable {
    public String departmentId;
    public String departmentName;

    public EntityDepartmentPK() {
    }

    public EntityDepartmentPK(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public int compareTo(EntityDepartmentPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = departmentId.compareTo(pk.departmentId);

        if (value != 0) {
            return value;
        }

        value = departmentName.compareTo(pk.departmentName);

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityDepartmentPK)) {
            return false;
        }

        EntityDepartmentPK pk = (EntityDepartmentPK) obj;

        if ((departmentId.equals(pk.departmentId)) &&
                (departmentName.equals(pk.departmentName))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(departmentId) + String.valueOf(departmentName)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("departmentId");
        sb.append(StringPool.EQUAL);
        sb.append(departmentId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("departmentName");
        sb.append(StringPool.EQUAL);
        sb.append(departmentName);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
