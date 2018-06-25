package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityInventoryClasification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryClasification
 * @generated
 */
public class EntityInventoryClasificationWrapper
    implements EntityInventoryClasification,
        ModelWrapper<EntityInventoryClasification> {
    private EntityInventoryClasification _entityInventoryClasification;

    public EntityInventoryClasificationWrapper(
        EntityInventoryClasification entityInventoryClasification) {
        _entityInventoryClasification = entityInventoryClasification;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityInventoryClasification.class;
    }

    @Override
    public String getModelClassName() {
        return EntityInventoryClasification.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("inventoryClasificationId", getInventoryClasificationId());
        attributes.put("inventoryClasification", getInventoryClasification());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer inventoryClasificationId = (Integer) attributes.get(
                "inventoryClasificationId");

        if (inventoryClasificationId != null) {
            setInventoryClasificationId(inventoryClasificationId);
        }

        String inventoryClasification = (String) attributes.get(
                "inventoryClasification");

        if (inventoryClasification != null) {
            setInventoryClasification(inventoryClasification);
        }
    }

    /**
    * Returns the primary key of this entity inventory clasification.
    *
    * @return the primary key of this entity inventory clasification
    */
    @Override
    public int getPrimaryKey() {
        return _entityInventoryClasification.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity inventory clasification.
    *
    * @param primaryKey the primary key of this entity inventory clasification
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityInventoryClasification.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the inventory clasification ID of this entity inventory clasification.
    *
    * @return the inventory clasification ID of this entity inventory clasification
    */
    @Override
    public int getInventoryClasificationId() {
        return _entityInventoryClasification.getInventoryClasificationId();
    }

    /**
    * Sets the inventory clasification ID of this entity inventory clasification.
    *
    * @param inventoryClasificationId the inventory clasification ID of this entity inventory clasification
    */
    @Override
    public void setInventoryClasificationId(int inventoryClasificationId) {
        _entityInventoryClasification.setInventoryClasificationId(inventoryClasificationId);
    }

    /**
    * Returns the inventory clasification of this entity inventory clasification.
    *
    * @return the inventory clasification of this entity inventory clasification
    */
    @Override
    public java.lang.String getInventoryClasification() {
        return _entityInventoryClasification.getInventoryClasification();
    }

    /**
    * Sets the inventory clasification of this entity inventory clasification.
    *
    * @param inventoryClasification the inventory clasification of this entity inventory clasification
    */
    @Override
    public void setInventoryClasification(
        java.lang.String inventoryClasification) {
        _entityInventoryClasification.setInventoryClasification(inventoryClasification);
    }

    @Override
    public boolean isNew() {
        return _entityInventoryClasification.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityInventoryClasification.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityInventoryClasification.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityInventoryClasification.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityInventoryClasification.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityInventoryClasification.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityInventoryClasification.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityInventoryClasification.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityInventoryClasification.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityInventoryClasification.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityInventoryClasification.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityInventoryClasificationWrapper((EntityInventoryClasification) _entityInventoryClasification.clone());
    }

    @Override
    public int compareTo(
        EntityInventoryClasification entityInventoryClasification) {
        return _entityInventoryClasification.compareTo(entityInventoryClasification);
    }

    @Override
    public int hashCode() {
        return _entityInventoryClasification.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityInventoryClasification> toCacheModel() {
        return _entityInventoryClasification.toCacheModel();
    }

    @Override
    public EntityInventoryClasification toEscapedModel() {
        return new EntityInventoryClasificationWrapper(_entityInventoryClasification.toEscapedModel());
    }

    @Override
    public EntityInventoryClasification toUnescapedModel() {
        return new EntityInventoryClasificationWrapper(_entityInventoryClasification.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityInventoryClasification.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityInventoryClasification.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityInventoryClasification.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityInventoryClasificationWrapper)) {
            return false;
        }

        EntityInventoryClasificationWrapper entityInventoryClasificationWrapper = (EntityInventoryClasificationWrapper) obj;

        if (Validator.equals(_entityInventoryClasification,
                    entityInventoryClasificationWrapper._entityInventoryClasification)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityInventoryClasification getWrappedEntityInventoryClasification() {
        return _entityInventoryClasification;
    }

    @Override
    public EntityInventoryClasification getWrappedModel() {
        return _entityInventoryClasification;
    }

    @Override
    public void resetOriginalValues() {
        _entityInventoryClasification.resetOriginalValues();
    }
}
