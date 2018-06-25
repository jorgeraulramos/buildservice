package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntitySale}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySale
 * @generated
 */
public class EntitySaleWrapper implements EntitySale, ModelWrapper<EntitySale> {
    private EntitySale _entitySale;

    public EntitySaleWrapper(EntitySale entitySale) {
        _entitySale = entitySale;
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySale.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySale.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("saleId", getSaleId());
        attributes.put("confirmBySale", getConfirmBySale());
        attributes.put("deliveryDate", getDeliveryDate());
        attributes.put("assurantCertificate", getAssurantCertificate());
        attributes.put("extendedWarranty", getExtendedWarranty());
        attributes.put("realGrossProfit", getRealGrossProfit());
        attributes.put("finalSalePrice", getFinalSalePrice());
        attributes.put("clientId", getClientId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("salesPlaceId", getSalesPlaceId());
        attributes.put("prospectionId", getProspectionId());
        attributes.put("wayPayId", getWayPayId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer saleId = (Integer) attributes.get("saleId");

        if (saleId != null) {
            setSaleId(saleId);
        }

        String confirmBySale = (String) attributes.get("confirmBySale");

        if (confirmBySale != null) {
            setConfirmBySale(confirmBySale);
        }

        Date deliveryDate = (Date) attributes.get("deliveryDate");

        if (deliveryDate != null) {
            setDeliveryDate(deliveryDate);
        }

        String assurantCertificate = (String) attributes.get(
                "assurantCertificate");

        if (assurantCertificate != null) {
            setAssurantCertificate(assurantCertificate);
        }

        String extendedWarranty = (String) attributes.get("extendedWarranty");

        if (extendedWarranty != null) {
            setExtendedWarranty(extendedWarranty);
        }

        Double realGrossProfit = (Double) attributes.get("realGrossProfit");

        if (realGrossProfit != null) {
            setRealGrossProfit(realGrossProfit);
        }

        Double finalSalePrice = (Double) attributes.get("finalSalePrice");

        if (finalSalePrice != null) {
            setFinalSalePrice(finalSalePrice);
        }

        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        Integer employeeId = (Integer) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Integer salesPlaceId = (Integer) attributes.get("salesPlaceId");

        if (salesPlaceId != null) {
            setSalesPlaceId(salesPlaceId);
        }

        Integer prospectionId = (Integer) attributes.get("prospectionId");

        if (prospectionId != null) {
            setProspectionId(prospectionId);
        }

        Integer wayPayId = (Integer) attributes.get("wayPayId");

        if (wayPayId != null) {
            setWayPayId(wayPayId);
        }
    }

    /**
    * Returns the primary key of this entity sale.
    *
    * @return the primary key of this entity sale
    */
    @Override
    public int getPrimaryKey() {
        return _entitySale.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity sale.
    *
    * @param primaryKey the primary key of this entity sale
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entitySale.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the sale ID of this entity sale.
    *
    * @return the sale ID of this entity sale
    */
    @Override
    public int getSaleId() {
        return _entitySale.getSaleId();
    }

    /**
    * Sets the sale ID of this entity sale.
    *
    * @param saleId the sale ID of this entity sale
    */
    @Override
    public void setSaleId(int saleId) {
        _entitySale.setSaleId(saleId);
    }

    /**
    * Returns the confirm by sale of this entity sale.
    *
    * @return the confirm by sale of this entity sale
    */
    @Override
    public java.lang.String getConfirmBySale() {
        return _entitySale.getConfirmBySale();
    }

    /**
    * Sets the confirm by sale of this entity sale.
    *
    * @param confirmBySale the confirm by sale of this entity sale
    */
    @Override
    public void setConfirmBySale(java.lang.String confirmBySale) {
        _entitySale.setConfirmBySale(confirmBySale);
    }

    /**
    * Returns the delivery date of this entity sale.
    *
    * @return the delivery date of this entity sale
    */
    @Override
    public java.util.Date getDeliveryDate() {
        return _entitySale.getDeliveryDate();
    }

    /**
    * Sets the delivery date of this entity sale.
    *
    * @param deliveryDate the delivery date of this entity sale
    */
    @Override
    public void setDeliveryDate(java.util.Date deliveryDate) {
        _entitySale.setDeliveryDate(deliveryDate);
    }

    /**
    * Returns the assurant certificate of this entity sale.
    *
    * @return the assurant certificate of this entity sale
    */
    @Override
    public java.lang.String getAssurantCertificate() {
        return _entitySale.getAssurantCertificate();
    }

    /**
    * Sets the assurant certificate of this entity sale.
    *
    * @param assurantCertificate the assurant certificate of this entity sale
    */
    @Override
    public void setAssurantCertificate(java.lang.String assurantCertificate) {
        _entitySale.setAssurantCertificate(assurantCertificate);
    }

    /**
    * Returns the extended warranty of this entity sale.
    *
    * @return the extended warranty of this entity sale
    */
    @Override
    public java.lang.String getExtendedWarranty() {
        return _entitySale.getExtendedWarranty();
    }

    /**
    * Sets the extended warranty of this entity sale.
    *
    * @param extendedWarranty the extended warranty of this entity sale
    */
    @Override
    public void setExtendedWarranty(java.lang.String extendedWarranty) {
        _entitySale.setExtendedWarranty(extendedWarranty);
    }

    /**
    * Returns the real gross profit of this entity sale.
    *
    * @return the real gross profit of this entity sale
    */
    @Override
    public double getRealGrossProfit() {
        return _entitySale.getRealGrossProfit();
    }

    /**
    * Sets the real gross profit of this entity sale.
    *
    * @param realGrossProfit the real gross profit of this entity sale
    */
    @Override
    public void setRealGrossProfit(double realGrossProfit) {
        _entitySale.setRealGrossProfit(realGrossProfit);
    }

    /**
    * Returns the final sale price of this entity sale.
    *
    * @return the final sale price of this entity sale
    */
    @Override
    public double getFinalSalePrice() {
        return _entitySale.getFinalSalePrice();
    }

    /**
    * Sets the final sale price of this entity sale.
    *
    * @param finalSalePrice the final sale price of this entity sale
    */
    @Override
    public void setFinalSalePrice(double finalSalePrice) {
        _entitySale.setFinalSalePrice(finalSalePrice);
    }

    /**
    * Returns the client ID of this entity sale.
    *
    * @return the client ID of this entity sale
    */
    @Override
    public int getClientId() {
        return _entitySale.getClientId();
    }

    /**
    * Sets the client ID of this entity sale.
    *
    * @param clientId the client ID of this entity sale
    */
    @Override
    public void setClientId(int clientId) {
        _entitySale.setClientId(clientId);
    }

    /**
    * Returns the employee ID of this entity sale.
    *
    * @return the employee ID of this entity sale
    */
    @Override
    public int getEmployeeId() {
        return _entitySale.getEmployeeId();
    }

    /**
    * Sets the employee ID of this entity sale.
    *
    * @param employeeId the employee ID of this entity sale
    */
    @Override
    public void setEmployeeId(int employeeId) {
        _entitySale.setEmployeeId(employeeId);
    }

    /**
    * Returns the sales place ID of this entity sale.
    *
    * @return the sales place ID of this entity sale
    */
    @Override
    public int getSalesPlaceId() {
        return _entitySale.getSalesPlaceId();
    }

    /**
    * Sets the sales place ID of this entity sale.
    *
    * @param salesPlaceId the sales place ID of this entity sale
    */
    @Override
    public void setSalesPlaceId(int salesPlaceId) {
        _entitySale.setSalesPlaceId(salesPlaceId);
    }

    /**
    * Returns the prospection ID of this entity sale.
    *
    * @return the prospection ID of this entity sale
    */
    @Override
    public int getProspectionId() {
        return _entitySale.getProspectionId();
    }

    /**
    * Sets the prospection ID of this entity sale.
    *
    * @param prospectionId the prospection ID of this entity sale
    */
    @Override
    public void setProspectionId(int prospectionId) {
        _entitySale.setProspectionId(prospectionId);
    }

    /**
    * Returns the way pay ID of this entity sale.
    *
    * @return the way pay ID of this entity sale
    */
    @Override
    public int getWayPayId() {
        return _entitySale.getWayPayId();
    }

    /**
    * Sets the way pay ID of this entity sale.
    *
    * @param wayPayId the way pay ID of this entity sale
    */
    @Override
    public void setWayPayId(int wayPayId) {
        _entitySale.setWayPayId(wayPayId);
    }

    @Override
    public boolean isNew() {
        return _entitySale.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entitySale.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entitySale.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entitySale.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entitySale.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entitySale.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entitySale.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entitySale.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entitySale.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entitySale.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entitySale.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntitySaleWrapper((EntitySale) _entitySale.clone());
    }

    @Override
    public int compareTo(EntitySale entitySale) {
        return _entitySale.compareTo(entitySale);
    }

    @Override
    public int hashCode() {
        return _entitySale.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntitySale> toCacheModel() {
        return _entitySale.toCacheModel();
    }

    @Override
    public EntitySale toEscapedModel() {
        return new EntitySaleWrapper(_entitySale.toEscapedModel());
    }

    @Override
    public EntitySale toUnescapedModel() {
        return new EntitySaleWrapper(_entitySale.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entitySale.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entitySale.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entitySale.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntitySaleWrapper)) {
            return false;
        }

        EntitySaleWrapper entitySaleWrapper = (EntitySaleWrapper) obj;

        if (Validator.equals(_entitySale, entitySaleWrapper._entitySale)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntitySale getWrappedEntitySale() {
        return _entitySale;
    }

    @Override
    public EntitySale getWrappedModel() {
        return _entitySale;
    }

    @Override
    public void resetOriginalValues() {
        _entitySale.resetOriginalValues();
    }
}
