package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntitySalesPlace}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlace
 * @generated
 */
public class EntitySalesPlaceWrapper implements EntitySalesPlace,
    ModelWrapper<EntitySalesPlace> {
    private EntitySalesPlace _entitySalesPlace;

    public EntitySalesPlaceWrapper(EntitySalesPlace entitySalesPlace) {
        _entitySalesPlace = entitySalesPlace;
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySalesPlace.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySalesPlace.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("salesPlaceId", getSalesPlaceId());
        attributes.put("salePlaceName", getSalePlaceName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer salesPlaceId = (Integer) attributes.get("salesPlaceId");

        if (salesPlaceId != null) {
            setSalesPlaceId(salesPlaceId);
        }

        String salePlaceName = (String) attributes.get("salePlaceName");

        if (salePlaceName != null) {
            setSalePlaceName(salePlaceName);
        }
    }

    /**
    * Returns the primary key of this entity sales place.
    *
    * @return the primary key of this entity sales place
    */
    @Override
    public int getPrimaryKey() {
        return _entitySalesPlace.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity sales place.
    *
    * @param primaryKey the primary key of this entity sales place
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entitySalesPlace.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the sales place ID of this entity sales place.
    *
    * @return the sales place ID of this entity sales place
    */
    @Override
    public int getSalesPlaceId() {
        return _entitySalesPlace.getSalesPlaceId();
    }

    /**
    * Sets the sales place ID of this entity sales place.
    *
    * @param salesPlaceId the sales place ID of this entity sales place
    */
    @Override
    public void setSalesPlaceId(int salesPlaceId) {
        _entitySalesPlace.setSalesPlaceId(salesPlaceId);
    }

    /**
    * Returns the sale place name of this entity sales place.
    *
    * @return the sale place name of this entity sales place
    */
    @Override
    public java.lang.String getSalePlaceName() {
        return _entitySalesPlace.getSalePlaceName();
    }

    /**
    * Sets the sale place name of this entity sales place.
    *
    * @param salePlaceName the sale place name of this entity sales place
    */
    @Override
    public void setSalePlaceName(java.lang.String salePlaceName) {
        _entitySalesPlace.setSalePlaceName(salePlaceName);
    }

    @Override
    public boolean isNew() {
        return _entitySalesPlace.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entitySalesPlace.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entitySalesPlace.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entitySalesPlace.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entitySalesPlace.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entitySalesPlace.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entitySalesPlace.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entitySalesPlace.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entitySalesPlace.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entitySalesPlace.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entitySalesPlace.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntitySalesPlaceWrapper((EntitySalesPlace) _entitySalesPlace.clone());
    }

    @Override
    public int compareTo(EntitySalesPlace entitySalesPlace) {
        return _entitySalesPlace.compareTo(entitySalesPlace);
    }

    @Override
    public int hashCode() {
        return _entitySalesPlace.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntitySalesPlace> toCacheModel() {
        return _entitySalesPlace.toCacheModel();
    }

    @Override
    public EntitySalesPlace toEscapedModel() {
        return new EntitySalesPlaceWrapper(_entitySalesPlace.toEscapedModel());
    }

    @Override
    public EntitySalesPlace toUnescapedModel() {
        return new EntitySalesPlaceWrapper(_entitySalesPlace.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entitySalesPlace.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entitySalesPlace.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entitySalesPlace.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntitySalesPlaceWrapper)) {
            return false;
        }

        EntitySalesPlaceWrapper entitySalesPlaceWrapper = (EntitySalesPlaceWrapper) obj;

        if (Validator.equals(_entitySalesPlace,
                    entitySalesPlaceWrapper._entitySalesPlace)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntitySalesPlace getWrappedEntitySalesPlace() {
        return _entitySalesPlace;
    }

    @Override
    public EntitySalesPlace getWrappedModel() {
        return _entitySalesPlace;
    }

    @Override
    public void resetOriginalValues() {
        _entitySalesPlace.resetOriginalValues();
    }
}
