package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityProspection service. Represents a row in the &quot;Prospection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityProspectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityProspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspection
 * @see com.consistent.ucwrt.model.impl.EntityProspectionImpl
 * @see com.consistent.ucwrt.model.impl.EntityProspectionModelImpl
 * @generated
 */
public interface EntityProspectionModel extends BaseModel<EntityProspection> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity prospection model instance should use the {@link EntityProspection} interface instead.
     */

    /**
     * Returns the primary key of this entity prospection.
     *
     * @return the primary key of this entity prospection
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this entity prospection.
     *
     * @param primaryKey the primary key of this entity prospection
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the prospection ID of this entity prospection.
     *
     * @return the prospection ID of this entity prospection
     */
    public int getProspectionId();

    /**
     * Sets the prospection ID of this entity prospection.
     *
     * @param prospectionId the prospection ID of this entity prospection
     */
    public void setProspectionId(int prospectionId);

    /**
     * Returns the prospection name of this entity prospection.
     *
     * @return the prospection name of this entity prospection
     */
    @AutoEscape
    public String getProspectionName();

    /**
     * Sets the prospection name of this entity prospection.
     *
     * @param prospectionName the prospection name of this entity prospection
     */
    public void setProspectionName(String prospectionName);

    /**
     * Returns the event ID of this entity prospection.
     *
     * @return the event ID of this entity prospection
     */
    public int getEventId();

    /**
     * Sets the event ID of this entity prospection.
     *
     * @param eventId the event ID of this entity prospection
     */
    public void setEventId(int eventId);

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
    public int compareTo(EntityProspection entityProspection);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityProspection> toCacheModel();

    @Override
    public EntityProspection toEscapedModel();

    @Override
    public EntityProspection toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
