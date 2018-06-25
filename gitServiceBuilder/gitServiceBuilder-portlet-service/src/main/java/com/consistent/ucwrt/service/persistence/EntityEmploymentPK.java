package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityEmploymentPK implements Comparable<EntityEmploymentPK>,
    Serializable {
    public String employmentId;
    public String employmentName;

    public EntityEmploymentPK() {
    }

    public EntityEmploymentPK(String employmentId, String employmentName) {
        this.employmentId = employmentId;
        this.employmentName = employmentName;
    }

    public String getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getEmploymentName() {
        return employmentName;
    }

    public void setEmploymentName(String employmentName) {
        this.employmentName = employmentName;
    }

    @Override
    public int compareTo(EntityEmploymentPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = employmentId.compareTo(pk.employmentId);

        if (value != 0) {
            return value;
        }

        value = employmentName.compareTo(pk.employmentName);

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

        if (!(obj instanceof EntityEmploymentPK)) {
            return false;
        }

        EntityEmploymentPK pk = (EntityEmploymentPK) obj;

        if ((employmentId.equals(pk.employmentId)) &&
                (employmentName.equals(pk.employmentName))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(employmentId) + String.valueOf(employmentName)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("employmentId");
        sb.append(StringPool.EQUAL);
        sb.append(employmentId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("employmentName");
        sb.append(StringPool.EQUAL);
        sb.append(employmentName);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
