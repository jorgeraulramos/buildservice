package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityMonthlySalesGoalPK implements Comparable<EntityMonthlySalesGoalPK>,
    Serializable {
    public int year;
    public String dealerId;
    public String businessBrandName;

    public EntityMonthlySalesGoalPK() {
    }

    public EntityMonthlySalesGoalPK(int year, String dealerId,
        String businessBrandName) {
        this.year = year;
        this.dealerId = dealerId;
        this.businessBrandName = businessBrandName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getBusinessBrandName() {
        return businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        this.businessBrandName = businessBrandName;
    }

    @Override
    public int compareTo(EntityMonthlySalesGoalPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (year < pk.year) {
            value = -1;
        } else if (year > pk.year) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = dealerId.compareTo(pk.dealerId);

        if (value != 0) {
            return value;
        }

        value = businessBrandName.compareTo(pk.businessBrandName);

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

        if (!(obj instanceof EntityMonthlySalesGoalPK)) {
            return false;
        }

        EntityMonthlySalesGoalPK pk = (EntityMonthlySalesGoalPK) obj;

        if ((year == pk.year) && (dealerId.equals(pk.dealerId)) &&
                (businessBrandName.equals(pk.businessBrandName))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(year) + String.valueOf(dealerId) +
        String.valueOf(businessBrandName)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("year");
        sb.append(StringPool.EQUAL);
        sb.append(year);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("dealerId");
        sb.append(StringPool.EQUAL);
        sb.append(dealerId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("businessBrandName");
        sb.append(StringPool.EQUAL);
        sb.append(businessBrandName);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
