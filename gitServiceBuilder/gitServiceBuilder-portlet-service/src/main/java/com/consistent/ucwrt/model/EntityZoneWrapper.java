package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityZone}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityZone
 * @generated
 */
public class EntityZoneWrapper implements EntityZone, ModelWrapper<EntityZone> {
    private EntityZone _entityZone;

    public EntityZoneWrapper(EntityZone entityZone) {
        _entityZone = entityZone;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityZone.class;
    }

    @Override
    public String getModelClassName() {
        return EntityZone.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("zoneName", getZoneName());
        attributes.put("descriptionZone", getDescriptionZone());
        attributes.put("userZoneManager", getUserZoneManager());
        attributes.put("userSalesAreaManager", getUserSalesAreaManager());
        attributes.put("userRegionalAreaManager", getUserRegionalAreaManager());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String zoneName = (String) attributes.get("zoneName");

        if (zoneName != null) {
            setZoneName(zoneName);
        }

        String descriptionZone = (String) attributes.get("descriptionZone");

        if (descriptionZone != null) {
            setDescriptionZone(descriptionZone);
        }

        String userZoneManager = (String) attributes.get("userZoneManager");

        if (userZoneManager != null) {
            setUserZoneManager(userZoneManager);
        }

        String userSalesAreaManager = (String) attributes.get(
                "userSalesAreaManager");

        if (userSalesAreaManager != null) {
            setUserSalesAreaManager(userSalesAreaManager);
        }

        String userRegionalAreaManager = (String) attributes.get(
                "userRegionalAreaManager");

        if (userRegionalAreaManager != null) {
            setUserRegionalAreaManager(userRegionalAreaManager);
        }
    }

    /**
    * Returns the primary key of this entity zone.
    *
    * @return the primary key of this entity zone
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _entityZone.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity zone.
    *
    * @param primaryKey the primary key of this entity zone
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _entityZone.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the zone name of this entity zone.
    *
    * @return the zone name of this entity zone
    */
    @Override
    public java.lang.String getZoneName() {
        return _entityZone.getZoneName();
    }

    /**
    * Sets the zone name of this entity zone.
    *
    * @param zoneName the zone name of this entity zone
    */
    @Override
    public void setZoneName(java.lang.String zoneName) {
        _entityZone.setZoneName(zoneName);
    }

    /**
    * Returns the description zone of this entity zone.
    *
    * @return the description zone of this entity zone
    */
    @Override
    public java.lang.String getDescriptionZone() {
        return _entityZone.getDescriptionZone();
    }

    /**
    * Sets the description zone of this entity zone.
    *
    * @param descriptionZone the description zone of this entity zone
    */
    @Override
    public void setDescriptionZone(java.lang.String descriptionZone) {
        _entityZone.setDescriptionZone(descriptionZone);
    }

    /**
    * Returns the user zone manager of this entity zone.
    *
    * @return the user zone manager of this entity zone
    */
    @Override
    public java.lang.String getUserZoneManager() {
        return _entityZone.getUserZoneManager();
    }

    /**
    * Sets the user zone manager of this entity zone.
    *
    * @param userZoneManager the user zone manager of this entity zone
    */
    @Override
    public void setUserZoneManager(java.lang.String userZoneManager) {
        _entityZone.setUserZoneManager(userZoneManager);
    }

    /**
    * Returns the user sales area manager of this entity zone.
    *
    * @return the user sales area manager of this entity zone
    */
    @Override
    public java.lang.String getUserSalesAreaManager() {
        return _entityZone.getUserSalesAreaManager();
    }

    /**
    * Sets the user sales area manager of this entity zone.
    *
    * @param userSalesAreaManager the user sales area manager of this entity zone
    */
    @Override
    public void setUserSalesAreaManager(java.lang.String userSalesAreaManager) {
        _entityZone.setUserSalesAreaManager(userSalesAreaManager);
    }

    /**
    * Returns the user regional area manager of this entity zone.
    *
    * @return the user regional area manager of this entity zone
    */
    @Override
    public java.lang.String getUserRegionalAreaManager() {
        return _entityZone.getUserRegionalAreaManager();
    }

    /**
    * Sets the user regional area manager of this entity zone.
    *
    * @param userRegionalAreaManager the user regional area manager of this entity zone
    */
    @Override
    public void setUserRegionalAreaManager(
        java.lang.String userRegionalAreaManager) {
        _entityZone.setUserRegionalAreaManager(userRegionalAreaManager);
    }

    @Override
    public boolean isNew() {
        return _entityZone.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityZone.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityZone.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityZone.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityZone.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityZone.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityZone.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityZone.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityZone.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityZone.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityZone.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityZoneWrapper((EntityZone) _entityZone.clone());
    }

    @Override
    public int compareTo(EntityZone entityZone) {
        return _entityZone.compareTo(entityZone);
    }

    @Override
    public int hashCode() {
        return _entityZone.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityZone> toCacheModel() {
        return _entityZone.toCacheModel();
    }

    @Override
    public EntityZone toEscapedModel() {
        return new EntityZoneWrapper(_entityZone.toEscapedModel());
    }

    @Override
    public EntityZone toUnescapedModel() {
        return new EntityZoneWrapper(_entityZone.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityZone.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityZone.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityZone.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityZoneWrapper)) {
            return false;
        }

        EntityZoneWrapper entityZoneWrapper = (EntityZoneWrapper) obj;

        if (Validator.equals(_entityZone, entityZoneWrapper._entityZone)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityZone getWrappedEntityZone() {
        return _entityZone;
    }

    @Override
    public EntityZone getWrappedModel() {
        return _entityZone;
    }

    @Override
    public void resetOriginalValues() {
        _entityZone.resetOriginalValues();
    }
}
