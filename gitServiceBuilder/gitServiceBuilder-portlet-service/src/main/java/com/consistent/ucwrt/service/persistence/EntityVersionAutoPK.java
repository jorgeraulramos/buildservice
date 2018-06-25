package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityVersionAutoPK implements Comparable<EntityVersionAutoPK>,
    Serializable {
    public int versionId;
    public int modelId;
    public int brandId;
    public int yearModel;

    public EntityVersionAutoPK() {
    }

    public EntityVersionAutoPK(int versionId, int modelId, int brandId,
        int yearModel) {
        this.versionId = versionId;
        this.modelId = modelId;
        this.brandId = brandId;
        this.yearModel = yearModel;
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

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    @Override
    public int compareTo(EntityVersionAutoPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

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

        if (brandId < pk.brandId) {
            value = -1;
        } else if (brandId > pk.brandId) {
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

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionAutoPK)) {
            return false;
        }

        EntityVersionAutoPK pk = (EntityVersionAutoPK) obj;

        if ((versionId == pk.versionId) && (modelId == pk.modelId) &&
                (brandId == pk.brandId) && (yearModel == pk.yearModel)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(versionId) + String.valueOf(modelId) +
        String.valueOf(brandId) + String.valueOf(yearModel)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(20);

        sb.append(StringPool.OPEN_CURLY_BRACE);

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
        sb.append("brandId");
        sb.append(StringPool.EQUAL);
        sb.append(brandId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("yearModel");
        sb.append(StringPool.EQUAL);
        sb.append(yearModel);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
