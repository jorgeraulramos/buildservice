package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityVersionEquipmentPK implements Comparable<EntityVersionEquipmentPK>,
    Serializable {
    public int equipmentId;
    public int versionId;
    public int modelId;
    public String brandName;
    public int yearModel;

    public EntityVersionEquipmentPK() {
    }

    public EntityVersionEquipmentPK(int equipmentId, int versionId,
        int modelId, String brandName, int yearModel) {
        this.equipmentId = equipmentId;
        this.versionId = versionId;
        this.modelId = modelId;
        this.brandName = brandName;
        this.yearModel = yearModel;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    @Override
    public int compareTo(EntityVersionEquipmentPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (equipmentId < pk.equipmentId) {
            value = -1;
        } else if (equipmentId > pk.equipmentId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (versionId < pk.versionId) {
            value = -1;
        } else if (versionId > pk.versionId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (modelId < pk.modelId) {
            value = -1;
        } else if (modelId > pk.modelId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = brandName.compareTo(pk.brandName);

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

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionEquipmentPK)) {
            return false;
        }

        EntityVersionEquipmentPK pk = (EntityVersionEquipmentPK) obj;

        if ((equipmentId == pk.equipmentId) && (versionId == pk.versionId) &&
                (modelId == pk.modelId) && (brandName.equals(pk.brandName)) &&
                (yearModel == pk.yearModel)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(equipmentId) + String.valueOf(versionId) +
        String.valueOf(modelId) + String.valueOf(brandName) +
        String.valueOf(yearModel)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("equipmentId");
        sb.append(StringPool.EQUAL);
        sb.append(equipmentId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("versionId");
        sb.append(StringPool.EQUAL);
        sb.append(versionId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("modelId");
        sb.append(StringPool.EQUAL);
        sb.append(modelId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("brandName");
        sb.append(StringPool.EQUAL);
        sb.append(brandName);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("yearModel");
        sb.append(StringPool.EQUAL);
        sb.append(yearModel);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
