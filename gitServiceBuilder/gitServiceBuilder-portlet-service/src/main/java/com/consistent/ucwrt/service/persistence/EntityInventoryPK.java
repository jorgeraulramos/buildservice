package com.consistent.ucwrt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityInventoryPK implements Comparable<EntityInventoryPK>,
    Serializable {
    public int inventoryId;
    public String dealerId;
    public String businessBrandName;
    public int versionId;
    public int yearModel;
    public int brandId;
    public int modelId;

    public EntityInventoryPK() {
    }

    public EntityInventoryPK(int inventoryId, String dealerId,
        String businessBrandName, int versionId, int yearModel, int brandId,
        int modelId) {
        this.inventoryId = inventoryId;
        this.dealerId = dealerId;
        this.businessBrandName = businessBrandName;
        this.versionId = versionId;
        this.yearModel = yearModel;
        this.brandId = brandId;
        this.modelId = modelId;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
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

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Override
    public int compareTo(EntityInventoryPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (inventoryId < pk.inventoryId) {
            value = -1;
        } else if (inventoryId > pk.inventoryId) {
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

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityInventoryPK)) {
            return false;
        }

        EntityInventoryPK pk = (EntityInventoryPK) obj;

        if ((inventoryId == pk.inventoryId) && (dealerId.equals(pk.dealerId)) &&
                (businessBrandName.equals(pk.businessBrandName)) &&
                (versionId == pk.versionId) && (yearModel == pk.yearModel) &&
                (brandId == pk.brandId) && (modelId == pk.modelId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(inventoryId) + String.valueOf(dealerId) +
        String.valueOf(businessBrandName) + String.valueOf(versionId) +
        String.valueOf(yearModel) + String.valueOf(brandId) +
        String.valueOf(modelId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("inventoryId");
        sb.append(StringPool.EQUAL);
        sb.append(inventoryId);

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

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("versionId");
        sb.append(StringPool.EQUAL);
        sb.append(versionId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("yearModel");
        sb.append(StringPool.EQUAL);
        sb.append(yearModel);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("brandId");
        sb.append(StringPool.EQUAL);
        sb.append(brandId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("modelId");
        sb.append(StringPool.EQUAL);
        sb.append(modelId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
