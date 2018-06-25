package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityDealer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealer
 * @generated
 */
public class EntityDealerWrapper implements EntityDealer,
    ModelWrapper<EntityDealer> {
    private EntityDealer _entityDealer;

    public EntityDealerWrapper(EntityDealer entityDealer) {
        _entityDealer = entityDealer;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityDealer.class;
    }

    @Override
    public String getModelClassName() {
        return EntityDealer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("dealerId", getDealerId());
        attributes.put("dealerName", getDealerName());
        attributes.put("guaranteed", getGuaranteed());
        attributes.put("generalManagerName", getGeneralManagerName());
        attributes.put("shareholderName", getShareholderName());
        attributes.put("mailShareholder", getMailShareholder());
        attributes.put("mailGeneralManager", getMailGeneralManager());
        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("zoneName", getZoneName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String dealerName = (String) attributes.get("dealerName");

        if (dealerName != null) {
            setDealerName(dealerName);
        }

        String guaranteed = (String) attributes.get("guaranteed");

        if (guaranteed != null) {
            setGuaranteed(guaranteed);
        }

        String generalManagerName = (String) attributes.get(
                "generalManagerName");

        if (generalManagerName != null) {
            setGeneralManagerName(generalManagerName);
        }

        String shareholderName = (String) attributes.get("shareholderName");

        if (shareholderName != null) {
            setShareholderName(shareholderName);
        }

        String mailShareholder = (String) attributes.get("mailShareholder");

        if (mailShareholder != null) {
            setMailShareholder(mailShareholder);
        }

        String mailGeneralManager = (String) attributes.get(
                "mailGeneralManager");

        if (mailGeneralManager != null) {
            setMailGeneralManager(mailGeneralManager);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String zoneName = (String) attributes.get("zoneName");

        if (zoneName != null) {
            setZoneName(zoneName);
        }
    }

    /**
    * Returns the primary key of this entity dealer.
    *
    * @return the primary key of this entity dealer
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _entityDealer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity dealer.
    *
    * @param primaryKey the primary key of this entity dealer
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _entityDealer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the dealer ID of this entity dealer.
    *
    * @return the dealer ID of this entity dealer
    */
    @Override
    public java.lang.String getDealerId() {
        return _entityDealer.getDealerId();
    }

    /**
    * Sets the dealer ID of this entity dealer.
    *
    * @param dealerId the dealer ID of this entity dealer
    */
    @Override
    public void setDealerId(java.lang.String dealerId) {
        _entityDealer.setDealerId(dealerId);
    }

    /**
    * Returns the dealer name of this entity dealer.
    *
    * @return the dealer name of this entity dealer
    */
    @Override
    public java.lang.String getDealerName() {
        return _entityDealer.getDealerName();
    }

    /**
    * Sets the dealer name of this entity dealer.
    *
    * @param dealerName the dealer name of this entity dealer
    */
    @Override
    public void setDealerName(java.lang.String dealerName) {
        _entityDealer.setDealerName(dealerName);
    }

    /**
    * Returns the guaranteed of this entity dealer.
    *
    * @return the guaranteed of this entity dealer
    */
    @Override
    public java.lang.String getGuaranteed() {
        return _entityDealer.getGuaranteed();
    }

    /**
    * Sets the guaranteed of this entity dealer.
    *
    * @param guaranteed the guaranteed of this entity dealer
    */
    @Override
    public void setGuaranteed(java.lang.String guaranteed) {
        _entityDealer.setGuaranteed(guaranteed);
    }

    /**
    * Returns the general manager name of this entity dealer.
    *
    * @return the general manager name of this entity dealer
    */
    @Override
    public java.lang.String getGeneralManagerName() {
        return _entityDealer.getGeneralManagerName();
    }

    /**
    * Sets the general manager name of this entity dealer.
    *
    * @param generalManagerName the general manager name of this entity dealer
    */
    @Override
    public void setGeneralManagerName(java.lang.String generalManagerName) {
        _entityDealer.setGeneralManagerName(generalManagerName);
    }

    /**
    * Returns the shareholder name of this entity dealer.
    *
    * @return the shareholder name of this entity dealer
    */
    @Override
    public java.lang.String getShareholderName() {
        return _entityDealer.getShareholderName();
    }

    /**
    * Sets the shareholder name of this entity dealer.
    *
    * @param shareholderName the shareholder name of this entity dealer
    */
    @Override
    public void setShareholderName(java.lang.String shareholderName) {
        _entityDealer.setShareholderName(shareholderName);
    }

    /**
    * Returns the mail shareholder of this entity dealer.
    *
    * @return the mail shareholder of this entity dealer
    */
    @Override
    public java.lang.String getMailShareholder() {
        return _entityDealer.getMailShareholder();
    }

    /**
    * Sets the mail shareholder of this entity dealer.
    *
    * @param mailShareholder the mail shareholder of this entity dealer
    */
    @Override
    public void setMailShareholder(java.lang.String mailShareholder) {
        _entityDealer.setMailShareholder(mailShareholder);
    }

    /**
    * Returns the mail general manager of this entity dealer.
    *
    * @return the mail general manager of this entity dealer
    */
    @Override
    public java.lang.String getMailGeneralManager() {
        return _entityDealer.getMailGeneralManager();
    }

    /**
    * Sets the mail general manager of this entity dealer.
    *
    * @param mailGeneralManager the mail general manager of this entity dealer
    */
    @Override
    public void setMailGeneralManager(java.lang.String mailGeneralManager) {
        _entityDealer.setMailGeneralManager(mailGeneralManager);
    }

    /**
    * Returns the business brand name of this entity dealer.
    *
    * @return the business brand name of this entity dealer
    */
    @Override
    public java.lang.String getBusinessBrandName() {
        return _entityDealer.getBusinessBrandName();
    }

    /**
    * Sets the business brand name of this entity dealer.
    *
    * @param businessBrandName the business brand name of this entity dealer
    */
    @Override
    public void setBusinessBrandName(java.lang.String businessBrandName) {
        _entityDealer.setBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the zone name of this entity dealer.
    *
    * @return the zone name of this entity dealer
    */
    @Override
    public java.lang.String getZoneName() {
        return _entityDealer.getZoneName();
    }

    /**
    * Sets the zone name of this entity dealer.
    *
    * @param zoneName the zone name of this entity dealer
    */
    @Override
    public void setZoneName(java.lang.String zoneName) {
        _entityDealer.setZoneName(zoneName);
    }

    @Override
    public boolean isNew() {
        return _entityDealer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityDealer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityDealer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityDealer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityDealer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityDealer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityDealer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityDealer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityDealer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityDealer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityDealer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityDealerWrapper((EntityDealer) _entityDealer.clone());
    }

    @Override
    public int compareTo(EntityDealer entityDealer) {
        return _entityDealer.compareTo(entityDealer);
    }

    @Override
    public int hashCode() {
        return _entityDealer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityDealer> toCacheModel() {
        return _entityDealer.toCacheModel();
    }

    @Override
    public EntityDealer toEscapedModel() {
        return new EntityDealerWrapper(_entityDealer.toEscapedModel());
    }

    @Override
    public EntityDealer toUnescapedModel() {
        return new EntityDealerWrapper(_entityDealer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityDealer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityDealer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityDealer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityDealerWrapper)) {
            return false;
        }

        EntityDealerWrapper entityDealerWrapper = (EntityDealerWrapper) obj;

        if (Validator.equals(_entityDealer, entityDealerWrapper._entityDealer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityDealer getWrappedEntityDealer() {
        return _entityDealer;
    }

    @Override
    public EntityDealer getWrappedModel() {
        return _entityDealer;
    }

    @Override
    public void resetOriginalValues() {
        _entityDealer.resetOriginalValues();
    }
}
