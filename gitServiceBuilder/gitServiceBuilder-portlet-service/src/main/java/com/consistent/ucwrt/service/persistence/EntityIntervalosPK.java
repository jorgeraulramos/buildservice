package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityIntervalosPK implements Comparable<EntityIntervalosPK>,
    Serializable {
    public int startKilometer;
    public int finishKilometers;

    public EntityIntervalosPK() {
    }

    public EntityIntervalosPK(int startKilometer, int finishKilometers) {
        this.startKilometer = startKilometer;
        this.finishKilometers = finishKilometers;
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
    public int compareTo(EntityIntervalosPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

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

        if (!(obj instanceof EntityIntervalosPK)) {
            return false;
        }

        EntityIntervalosPK pk = (EntityIntervalosPK) obj;

        if ((startKilometer == pk.startKilometer) &&
                (finishKilometers == pk.finishKilometers)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(startKilometer) +
        String.valueOf(finishKilometers)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

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
