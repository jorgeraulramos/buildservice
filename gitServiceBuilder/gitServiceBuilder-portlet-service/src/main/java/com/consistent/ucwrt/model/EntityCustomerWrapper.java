package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityCustomer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityCustomer
 * @generated
 */
public class EntityCustomerWrapper implements EntityCustomer,
    ModelWrapper<EntityCustomer> {
    private EntityCustomer _entityCustomer;

    public EntityCustomerWrapper(EntityCustomer entityCustomer) {
        _entityCustomer = entityCustomer;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityCustomer.class;
    }

    @Override
    public String getModelClassName() {
        return EntityCustomer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("clientId", getClientId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("secondLastName", getSecondLastName());
        attributes.put("email", getEmail());
        attributes.put("rfc", getRfc());
        attributes.put("cellPhone", getCellPhone());
        attributes.put("legalPersonality", getLegalPersonality());
        attributes.put("personType", getPersonType());
        attributes.put("phone", getPhone());
        attributes.put("registrationDate", getRegistrationDate());
        attributes.put("comments", getComments());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String secondLastName = (String) attributes.get("secondLastName");

        if (secondLastName != null) {
            setSecondLastName(secondLastName);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String rfc = (String) attributes.get("rfc");

        if (rfc != null) {
            setRfc(rfc);
        }

        String cellPhone = (String) attributes.get("cellPhone");

        if (cellPhone != null) {
            setCellPhone(cellPhone);
        }

        String legalPersonality = (String) attributes.get("legalPersonality");

        if (legalPersonality != null) {
            setLegalPersonality(legalPersonality);
        }

        String personType = (String) attributes.get("personType");

        if (personType != null) {
            setPersonType(personType);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        Date registrationDate = (Date) attributes.get("registrationDate");

        if (registrationDate != null) {
            setRegistrationDate(registrationDate);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }

        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }
    }

    /**
    * Returns the primary key of this entity customer.
    *
    * @return the primary key of this entity customer
    */
    @Override
    public int getPrimaryKey() {
        return _entityCustomer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity customer.
    *
    * @param primaryKey the primary key of this entity customer
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityCustomer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the client ID of this entity customer.
    *
    * @return the client ID of this entity customer
    */
    @Override
    public int getClientId() {
        return _entityCustomer.getClientId();
    }

    /**
    * Sets the client ID of this entity customer.
    *
    * @param clientId the client ID of this entity customer
    */
    @Override
    public void setClientId(int clientId) {
        _entityCustomer.setClientId(clientId);
    }

    /**
    * Returns the first name of this entity customer.
    *
    * @return the first name of this entity customer
    */
    @Override
    public java.lang.String getFirstName() {
        return _entityCustomer.getFirstName();
    }

    /**
    * Sets the first name of this entity customer.
    *
    * @param firstName the first name of this entity customer
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _entityCustomer.setFirstName(firstName);
    }

    /**
    * Returns the last name of this entity customer.
    *
    * @return the last name of this entity customer
    */
    @Override
    public java.lang.String getLastName() {
        return _entityCustomer.getLastName();
    }

    /**
    * Sets the last name of this entity customer.
    *
    * @param lastName the last name of this entity customer
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _entityCustomer.setLastName(lastName);
    }

    /**
    * Returns the second last name of this entity customer.
    *
    * @return the second last name of this entity customer
    */
    @Override
    public java.lang.String getSecondLastName() {
        return _entityCustomer.getSecondLastName();
    }

    /**
    * Sets the second last name of this entity customer.
    *
    * @param secondLastName the second last name of this entity customer
    */
    @Override
    public void setSecondLastName(java.lang.String secondLastName) {
        _entityCustomer.setSecondLastName(secondLastName);
    }

    /**
    * Returns the email of this entity customer.
    *
    * @return the email of this entity customer
    */
    @Override
    public java.lang.String getEmail() {
        return _entityCustomer.getEmail();
    }

    /**
    * Sets the email of this entity customer.
    *
    * @param email the email of this entity customer
    */
    @Override
    public void setEmail(java.lang.String email) {
        _entityCustomer.setEmail(email);
    }

    /**
    * Returns the rfc of this entity customer.
    *
    * @return the rfc of this entity customer
    */
    @Override
    public java.lang.String getRfc() {
        return _entityCustomer.getRfc();
    }

    /**
    * Sets the rfc of this entity customer.
    *
    * @param rfc the rfc of this entity customer
    */
    @Override
    public void setRfc(java.lang.String rfc) {
        _entityCustomer.setRfc(rfc);
    }

    /**
    * Returns the cell phone of this entity customer.
    *
    * @return the cell phone of this entity customer
    */
    @Override
    public java.lang.String getCellPhone() {
        return _entityCustomer.getCellPhone();
    }

    /**
    * Sets the cell phone of this entity customer.
    *
    * @param cellPhone the cell phone of this entity customer
    */
    @Override
    public void setCellPhone(java.lang.String cellPhone) {
        _entityCustomer.setCellPhone(cellPhone);
    }

    /**
    * Returns the legal personality of this entity customer.
    *
    * @return the legal personality of this entity customer
    */
    @Override
    public java.lang.String getLegalPersonality() {
        return _entityCustomer.getLegalPersonality();
    }

    /**
    * Sets the legal personality of this entity customer.
    *
    * @param legalPersonality the legal personality of this entity customer
    */
    @Override
    public void setLegalPersonality(java.lang.String legalPersonality) {
        _entityCustomer.setLegalPersonality(legalPersonality);
    }

    /**
    * Returns the person type of this entity customer.
    *
    * @return the person type of this entity customer
    */
    @Override
    public java.lang.String getPersonType() {
        return _entityCustomer.getPersonType();
    }

    /**
    * Sets the person type of this entity customer.
    *
    * @param personType the person type of this entity customer
    */
    @Override
    public void setPersonType(java.lang.String personType) {
        _entityCustomer.setPersonType(personType);
    }

    /**
    * Returns the phone of this entity customer.
    *
    * @return the phone of this entity customer
    */
    @Override
    public java.lang.String getPhone() {
        return _entityCustomer.getPhone();
    }

    /**
    * Sets the phone of this entity customer.
    *
    * @param phone the phone of this entity customer
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _entityCustomer.setPhone(phone);
    }

    /**
    * Returns the registration date of this entity customer.
    *
    * @return the registration date of this entity customer
    */
    @Override
    public java.util.Date getRegistrationDate() {
        return _entityCustomer.getRegistrationDate();
    }

    /**
    * Sets the registration date of this entity customer.
    *
    * @param registrationDate the registration date of this entity customer
    */
    @Override
    public void setRegistrationDate(java.util.Date registrationDate) {
        _entityCustomer.setRegistrationDate(registrationDate);
    }

    /**
    * Returns the comments of this entity customer.
    *
    * @return the comments of this entity customer
    */
    @Override
    public java.lang.String getComments() {
        return _entityCustomer.getComments();
    }

    /**
    * Sets the comments of this entity customer.
    *
    * @param comments the comments of this entity customer
    */
    @Override
    public void setComments(java.lang.String comments) {
        _entityCustomer.setComments(comments);
    }

    /**
    * Returns the dealer ID of this entity customer.
    *
    * @return the dealer ID of this entity customer
    */
    @Override
    public java.lang.String getDealerId() {
        return _entityCustomer.getDealerId();
    }

    /**
    * Sets the dealer ID of this entity customer.
    *
    * @param dealerId the dealer ID of this entity customer
    */
    @Override
    public void setDealerId(java.lang.String dealerId) {
        _entityCustomer.setDealerId(dealerId);
    }

    /**
    * Returns the business brand name of this entity customer.
    *
    * @return the business brand name of this entity customer
    */
    @Override
    public java.lang.String getBusinessBrandName() {
        return _entityCustomer.getBusinessBrandName();
    }

    /**
    * Sets the business brand name of this entity customer.
    *
    * @param businessBrandName the business brand name of this entity customer
    */
    @Override
    public void setBusinessBrandName(java.lang.String businessBrandName) {
        _entityCustomer.setBusinessBrandName(businessBrandName);
    }

    @Override
    public boolean isNew() {
        return _entityCustomer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityCustomer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityCustomer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityCustomer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityCustomer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityCustomer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityCustomer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityCustomer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityCustomer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityCustomer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityCustomer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityCustomerWrapper((EntityCustomer) _entityCustomer.clone());
    }

    @Override
    public int compareTo(EntityCustomer entityCustomer) {
        return _entityCustomer.compareTo(entityCustomer);
    }

    @Override
    public int hashCode() {
        return _entityCustomer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityCustomer> toCacheModel() {
        return _entityCustomer.toCacheModel();
    }

    @Override
    public EntityCustomer toEscapedModel() {
        return new EntityCustomerWrapper(_entityCustomer.toEscapedModel());
    }

    @Override
    public EntityCustomer toUnescapedModel() {
        return new EntityCustomerWrapper(_entityCustomer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityCustomer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityCustomer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityCustomer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityCustomerWrapper)) {
            return false;
        }

        EntityCustomerWrapper entityCustomerWrapper = (EntityCustomerWrapper) obj;

        if (Validator.equals(_entityCustomer,
                    entityCustomerWrapper._entityCustomer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityCustomer getWrappedEntityCustomer() {
        return _entityCustomer;
    }

    @Override
    public EntityCustomer getWrappedModel() {
        return _entityCustomer;
    }

    @Override
    public void resetOriginalValues() {
        _entityCustomer.resetOriginalValues();
    }
}
