package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityVersionEquipmentPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityVersionEquipment service. Represents a row in the &quot;VersionEquipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityVersionEquipmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipment
 * @see com.consistent.ucwrt.model.impl.EntityVersionEquipmentImpl
 * @see com.consistent.ucwrt.model.impl.EntityVersionEquipmentModelImpl
 * @generated
 */
public interface EntityVersionEquipmentModel extends BaseModel<EntityVersionEquipment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity version equipment model instance should use the {@link EntityVersionEquipment} interface instead.
     */

    /**
     * Returns the primary key of this entity version equipment.
     *
     * @return the primary key of this entity version equipment
     */
    public EntityVersionEquipmentPK getPrimaryKey();

    /**
     * Sets the primary key of this entity version equipment.
     *
     * @param primaryKey the primary key of this entity version equipment
     */
    public void setPrimaryKey(EntityVersionEquipmentPK primaryKey);

    /**
     * Returns the equipment ID of this entity version equipment.
     *
     * @return the equipment ID of this entity version equipment
     */
    public int getEquipmentId();

    /**
     * Sets the equipment ID of this entity version equipment.
     *
     * @param equipmentId the equipment ID of this entity version equipment
     */
    public void setEquipmentId(int equipmentId);

    /**
     * Returns the version ID of this entity version equipment.
     *
     * @return the version ID of this entity version equipment
     */
    public int getVersionId();

    /**
     * Sets the version ID of this entity version equipment.
     *
     * @param versionId the version ID of this entity version equipment
     */
    public void setVersionId(int versionId);

    /**
     * Returns the model ID of this entity version equipment.
     *
     * @return the model ID of this entity version equipment
     */
    public int getModelId();

    /**
     * Sets the model ID of this entity version equipment.
     *
     * @param modelId the model ID of this entity version equipment
     */
    public void setModelId(int modelId);

    /**
     * Returns the brand name of this entity version equipment.
     *
     * @return the brand name of this entity version equipment
     */
    @AutoEscape
    public String getBrandName();

    /**
     * Sets the brand name of this entity version equipment.
     *
     * @param brandName the brand name of this entity version equipment
     */
    public void setBrandName(String brandName);

    /**
     * Returns the year model of this entity version equipment.
     *
     * @return the year model of this entity version equipment
     */
    public int getYearModel();

    /**
     * Sets the year model of this entity version equipment.
     *
     * @param yearModel the year model of this entity version equipment
     */
    public void setYearModel(int yearModel);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(EntityVersionEquipment entityVersionEquipment);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityVersionEquipment> toCacheModel();

    @Override
    public EntityVersionEquipment toEscapedModel();

    @Override
    public EntityVersionEquipment toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
