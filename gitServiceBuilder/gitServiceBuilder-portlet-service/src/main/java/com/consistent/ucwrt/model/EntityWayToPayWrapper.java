package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityWayToPay}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPay
 * @generated
 */
public class EntityWayToPayWrapper implements EntityWayToPay,
    ModelWrapper<EntityWayToPay> {
    private EntityWayToPay _entityWayToPay;

    public EntityWayToPayWrapper(EntityWayToPay entityWayToPay) {
        _entityWayToPay = entityWayToPay;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityWayToPay.class;
    }

    @Override
    public String getModelClassName() {
        return EntityWayToPay.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("wayPayId", getWayPayId());
        attributes.put("payName", getPayName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer wayPayId = (Integer) attributes.get("wayPayId");

        if (wayPayId != null) {
            setWayPayId(wayPayId);
        }

        String payName = (String) attributes.get("payName");

        if (payName != null) {
            setPayName(payName);
        }
    }

    /**
    * Returns the primary key of this entity way to pay.
    *
    * @return the primary key of this entity way to pay
    */
    @Override
    public int getPrimaryKey() {
        return _entityWayToPay.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity way to pay.
    *
    * @param primaryKey the primary key of this entity way to pay
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityWayToPay.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the way pay ID of this entity way to pay.
    *
    * @return the way pay ID of this entity way to pay
    */
    @Override
    public int getWayPayId() {
        return _entityWayToPay.getWayPayId();
    }

    /**
    * Sets the way pay ID of this entity way to pay.
    *
    * @param wayPayId the way pay ID of this entity way to pay
    */
    @Override
    public void setWayPayId(int wayPayId) {
        _entityWayToPay.setWayPayId(wayPayId);
    }

    /**
    * Returns the pay name of this entity way to pay.
    *
    * @return the pay name of this entity way to pay
    */
    @Override
    public java.lang.String getPayName() {
        return _entityWayToPay.getPayName();
    }

    /**
    * Sets the pay name of this entity way to pay.
    *
    * @param payName the pay name of this entity way to pay
    */
    @Override
    public void setPayName(java.lang.String payName) {
        _entityWayToPay.setPayName(payName);
    }

    @Override
    public boolean isNew() {
        return _entityWayToPay.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityWayToPay.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityWayToPay.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityWayToPay.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityWayToPay.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityWayToPay.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityWayToPay.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityWayToPay.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityWayToPay.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityWayToPay.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityWayToPay.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityWayToPayWrapper((EntityWayToPay) _entityWayToPay.clone());
    }

    @Override
    public int compareTo(EntityWayToPay entityWayToPay) {
        return _entityWayToPay.compareTo(entityWayToPay);
    }

    @Override
    public int hashCode() {
        return _entityWayToPay.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityWayToPay> toCacheModel() {
        return _entityWayToPay.toCacheModel();
    }

    @Override
    public EntityWayToPay toEscapedModel() {
        return new EntityWayToPayWrapper(_entityWayToPay.toEscapedModel());
    }

    @Override
    public EntityWayToPay toUnescapedModel() {
        return new EntityWayToPayWrapper(_entityWayToPay.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityWayToPay.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityWayToPay.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityWayToPay.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityWayToPayWrapper)) {
            return false;
        }

        EntityWayToPayWrapper entityWayToPayWrapper = (EntityWayToPayWrapper) obj;

        if (Validator.equals(_entityWayToPay,
                    entityWayToPayWrapper._entityWayToPay)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityWayToPay getWrappedEntityWayToPay() {
        return _entityWayToPay;
    }

    @Override
    public EntityWayToPay getWrappedModel() {
        return _entityWayToPay;
    }

    @Override
    public void resetOriginalValues() {
        _entityWayToPay.resetOriginalValues();
    }
}
