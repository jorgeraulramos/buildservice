package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddress
 * @generated
 */
public class EntityAddressWrapper implements EntityAddress,
    ModelWrapper<EntityAddress> {
    private EntityAddress _entityAddress;

    public EntityAddressWrapper(EntityAddress entityAddress) {
        _entityAddress = entityAddress;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityAddress.class;
    }

    @Override
    public String getModelClassName() {
        return EntityAddress.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("addressId", getAddressId());
        attributes.put("street", getStreet());
        attributes.put("interiorNumber", getInteriorNumber());
        attributes.put("exteriorNumber", getExteriorNumber());
        attributes.put("clientId", getClientId());
        attributes.put("municipalId", getMunicipalId());
        attributes.put("stateId", getStateId());
        attributes.put("suburbId", getSuburbId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer addressId = (Integer) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
        }

        String street = (String) attributes.get("street");

        if (street != null) {
            setStreet(street);
        }

        Integer interiorNumber = (Integer) attributes.get("interiorNumber");

        if (interiorNumber != null) {
            setInteriorNumber(interiorNumber);
        }

        Integer exteriorNumber = (Integer) attributes.get("exteriorNumber");

        if (exteriorNumber != null) {
            setExteriorNumber(exteriorNumber);
        }

        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }

        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }

        Integer suburbId = (Integer) attributes.get("suburbId");

        if (suburbId != null) {
            setSuburbId(suburbId);
        }
    }

    /**
    * Returns the primary key of this entity address.
    *
    * @return the primary key of this entity address
    */
    @Override
    public int getPrimaryKey() {
        return _entityAddress.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity address.
    *
    * @param primaryKey the primary key of this entity address
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityAddress.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the address ID of this entity address.
    *
    * @return the address ID of this entity address
    */
    @Override
    public int getAddressId() {
        return _entityAddress.getAddressId();
    }

    /**
    * Sets the address ID of this entity address.
    *
    * @param addressId the address ID of this entity address
    */
    @Override
    public void setAddressId(int addressId) {
        _entityAddress.setAddressId(addressId);
    }

    /**
    * Returns the street of this entity address.
    *
    * @return the street of this entity address
    */
    @Override
    public java.lang.String getStreet() {
        return _entityAddress.getStreet();
    }

    /**
    * Sets the street of this entity address.
    *
    * @param street the street of this entity address
    */
    @Override
    public void setStreet(java.lang.String street) {
        _entityAddress.setStreet(street);
    }

    /**
    * Returns the interior number of this entity address.
    *
    * @return the interior number of this entity address
    */
    @Override
    public int getInteriorNumber() {
        return _entityAddress.getInteriorNumber();
    }

    /**
    * Sets the interior number of this entity address.
    *
    * @param interiorNumber the interior number of this entity address
    */
    @Override
    public void setInteriorNumber(int interiorNumber) {
        _entityAddress.setInteriorNumber(interiorNumber);
    }

    /**
    * Returns the exterior number of this entity address.
    *
    * @return the exterior number of this entity address
    */
    @Override
    public int getExteriorNumber() {
        return _entityAddress.getExteriorNumber();
    }

    /**
    * Sets the exterior number of this entity address.
    *
    * @param exteriorNumber the exterior number of this entity address
    */
    @Override
    public void setExteriorNumber(int exteriorNumber) {
        _entityAddress.setExteriorNumber(exteriorNumber);
    }

    /**
    * Returns the client ID of this entity address.
    *
    * @return the client ID of this entity address
    */
    @Override
    public int getClientId() {
        return _entityAddress.getClientId();
    }

    /**
    * Sets the client ID of this entity address.
    *
    * @param clientId the client ID of this entity address
    */
    @Override
    public void setClientId(int clientId) {
        _entityAddress.setClientId(clientId);
    }

    /**
    * Returns the municipal ID of this entity address.
    *
    * @return the municipal ID of this entity address
    */
    @Override
    public int getMunicipalId() {
        return _entityAddress.getMunicipalId();
    }

    /**
    * Sets the municipal ID of this entity address.
    *
    * @param municipalId the municipal ID of this entity address
    */
    @Override
    public void setMunicipalId(int municipalId) {
        _entityAddress.setMunicipalId(municipalId);
    }

    /**
    * Returns the state ID of this entity address.
    *
    * @return the state ID of this entity address
    */
    @Override
    public int getStateId() {
        return _entityAddress.getStateId();
    }

    /**
    * Sets the state ID of this entity address.
    *
    * @param stateId the state ID of this entity address
    */
    @Override
    public void setStateId(int stateId) {
        _entityAddress.setStateId(stateId);
    }

    /**
    * Returns the suburb ID of this entity address.
    *
    * @return the suburb ID of this entity address
    */
    @Override
    public int getSuburbId() {
        return _entityAddress.getSuburbId();
    }

    /**
    * Sets the suburb ID of this entity address.
    *
    * @param suburbId the suburb ID of this entity address
    */
    @Override
    public void setSuburbId(int suburbId) {
        _entityAddress.setSuburbId(suburbId);
    }

    @Override
    public boolean isNew() {
        return _entityAddress.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityAddress.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityAddress.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityAddress.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityAddress.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityAddress.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityAddress.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityAddress.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityAddress.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityAddress.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityAddress.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityAddressWrapper((EntityAddress) _entityAddress.clone());
    }

    @Override
    public int compareTo(EntityAddress entityAddress) {
        return _entityAddress.compareTo(entityAddress);
    }

    @Override
    public int hashCode() {
        return _entityAddress.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityAddress> toCacheModel() {
        return _entityAddress.toCacheModel();
    }

    @Override
    public EntityAddress toEscapedModel() {
        return new EntityAddressWrapper(_entityAddress.toEscapedModel());
    }

    @Override
    public EntityAddress toUnescapedModel() {
        return new EntityAddressWrapper(_entityAddress.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityAddress.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityAddress.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityAddress.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityAddressWrapper)) {
            return false;
        }

        EntityAddressWrapper entityAddressWrapper = (EntityAddressWrapper) obj;

        if (Validator.equals(_entityAddress, entityAddressWrapper._entityAddress)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityAddress getWrappedEntityAddress() {
        return _entityAddress;
    }

    @Override
    public EntityAddress getWrappedModel() {
        return _entityAddress;
    }

    @Override
    public void resetOriginalValues() {
        _entityAddress.resetOriginalValues();
    }
}
