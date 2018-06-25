package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityYearModelClassPK implements Comparable<EntityYearModelClassPK>,
    Serializable {
    public int classId;
    public int yearModel;
    public int startKilometer;
    public int finishKilometers;

    public EntityYearModelClassPK() {
    }

    public EntityYearModelClassPK(int classId, int yearModel,
        int startKilometer, int finishKilometers) {
        this.classId = classId;
        this.yearModel = yearModel;
        this.startKilometer = startKilometer;
        this.finishKilometers = finishKilometers;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getStartKilometer() {
        return startKilometer;
    }

    public void setStartKilometer(int startKilometer) {
        this.startKilometer = startKilometer;
    }

    public int getFinishKilometers() {
        return finishKilometers;
    }

    public void setFinishKilometers(int finishKilometers) {
        this.finishKilometers = finishKilometers;
    }

    @Override
    public int compareTo(EntityYearModelClassPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (classId < pk.classId) {
            value = -1;
        } else if (classId > pk.classId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (yearModel < pk.yearModel) {
            value = -1;
        } else if (yearModel > pk.yearModel) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (startKilometer < pk.startKilometer) {
            value = -1;
        } else if (startKilometer > pk.startKilometer) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (finishKilometers < pk.finishKilometers) {
            value = -1;
        } else if (finishKilometers > pk.finishKilometers) {
            value = 1;
        } else {
            value = 0;
        }

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

        if (!(obj instanceof EntityYearModelClassPK)) {
            return false;
        }

        EntityYearModelClassPK pk = (EntityYearModelClassPK) obj;

        if ((classId == pk.classId) && (yearModel == pk.yearModel) &&
                (startKilometer == pk.startKilometer) &&
                (finishKilometers == pk.finishKilometers)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(classId) + String.valueOf(yearModel) +
        String.valueOf(startKilometer) + String.valueOf(finishKilometers)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(20);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("classId");
        sb.append(StringPool.EQUAL);
        sb.append(classId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("yearModel");
        sb.append(StringPool.EQUAL);
        sb.append(yearModel);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("startKilometer");
        sb.append(StringPool.EQUAL);
        sb.append(startKilometer);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("finishKilometers");
        sb.append(StringPool.EQUAL);
        sb.append(finishKilometers);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
