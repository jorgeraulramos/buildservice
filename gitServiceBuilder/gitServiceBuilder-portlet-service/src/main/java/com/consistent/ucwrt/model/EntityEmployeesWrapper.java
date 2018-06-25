package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityEmployees}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployees
 * @generated
 */
public class EntityEmployeesWrapper implements EntityEmployees,
    ModelWrapper<EntityEmployees> {
    private EntityEmployees _entityEmployees;

    public EntityEmployeesWrapper(EntityEmployees entityEmployees) {
        _entityEmployees = entityEmployees;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEmployees.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEmployees.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("secondLastName", getSecondLastName());
        attributes.put("marketStall", getMarketStall());
        attributes.put("department", getDepartment());
        attributes.put("cellPhone", getCellPhone());
        attributes.put("phone", getPhone());
        attributes.put("email", getEmail());
        attributes.put("certified", getCertified());
        attributes.put("certifiedDate", getCertifiedDate());
        attributes.put("certificationNumber", getCertificationNumber());
        attributes.put("registrationDate", getRegistrationDate());
        attributes.put("status", getStatus());
        attributes.put("comments", getComments());
        attributes.put("departmentId", getDepartmentId());
        attributes.put("employmentId", getEmploymentId());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer employeeId = (Integer) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
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

        String marketStall = (String) attributes.get("marketStall");

        if (marketStall != null) {
            setMarketStall(marketStall);
        }

        String department = (String) attributes.get("department");

        if (department != null) {
            setDepartment(department);
        }

        String cellPhone = (String) attributes.get("cellPhone");

        if (cellPhone != null) {
            setCellPhone(cellPhone);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String certified = (String) attributes.get("certified");

        if (certified != null) {
            setCertified(certified);
        }

        Date certifiedDate = (Date) attributes.get("certifiedDate");

        if (certifiedDate != null) {
            setCertifiedDate(certifiedDate);
        }

        String certificationNumber = (String) attributes.get(
                "certificationNumber");

        if (certificationNumber != null) {
            setCertificationNumber(certificationNumber);
        }

        Date registrationDate = (Date) attributes.get("registrationDate");

        if (registrationDate != null) {
            setRegistrationDate(registrationDate);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }

        String departmentId = (String) attributes.get("departmentId");

        if (departmentId != null) {
            setDepartmentId(departmentId);
        }

        String employmentId = (String) attributes.get("employmentId");

        if (employmentId != null) {
            setEmploymentId(employmentId);
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
    * Returns the primary key of this entity employees.
    *
    * @return the primary key of this entity employees
    */
    @Override
    public int getPrimaryKey() {
        return _entityEmployees.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity employees.
    *
    * @param primaryKey the primary key of this entity employees
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityEmployees.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this entity employees.
    *
    * @return the employee ID of this entity employees
    */
    @Override
    public int getEmployeeId() {
        return _entityEmployees.getEmployeeId();
    }

    /**
    * Sets the employee ID of this entity employees.
    *
    * @param employeeId the employee ID of this entity employees
    */
    @Override
    public void setEmployeeId(int employeeId) {
        _entityEmployees.setEmployeeId(employeeId);
    }

    /**
    * Returns the first name of this entity employees.
    *
    * @return the first name of this entity employees
    */
    @Override
    public java.lang.String getFirstName() {
        return _entityEmployees.getFirstName();
    }

    /**
    * Sets the first name of this entity employees.
    *
    * @param firstName the first name of this entity employees
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _entityEmployees.setFirstName(firstName);
    }

    /**
    * Returns the last name of this entity employees.
    *
    * @return the last name of this entity employees
    */
    @Override
    public java.lang.String getLastName() {
        return _entityEmployees.getLastName();
    }

    /**
    * Sets the last name of this entity employees.
    *
    * @param lastName the last name of this entity employees
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _entityEmployees.setLastName(lastName);
    }

    /**
    * Returns the second last name of this entity employees.
    *
    * @return the second last name of this entity employees
    */
    @Override
    public java.lang.String getSecondLastName() {
        return _entityEmployees.getSecondLastName();
    }

    /**
    * Sets the second last name of this entity employees.
    *
    * @param secondLastName the second last name of this entity employees
    */
    @Override
    public void setSecondLastName(java.lang.String secondLastName) {
        _entityEmployees.setSecondLastName(secondLastName);
    }

    /**
    * Returns the market stall of this entity employees.
    *
    * @return the market stall of this entity employees
    */
    @Override
    public java.lang.String getMarketStall() {
        return _entityEmployees.getMarketStall();
    }

    /**
    * Sets the market stall of this entity employees.
    *
    * @param marketStall the market stall of this entity employees
    */
    @Override
    public void setMarketStall(java.lang.String marketStall) {
        _entityEmployees.setMarketStall(marketStall);
    }

    /**
    * Returns the department of this entity employees.
    *
    * @return the department of this entity employees
    */
    @Override
    public java.lang.String getDepartment() {
        return _entityEmployees.getDepartment();
    }

    /**
    * Sets the department of this entity employees.
    *
    * @param department the department of this entity employees
    */
    @Override
    public void setDepartment(java.lang.String department) {
        _entityEmployees.setDepartment(department);
    }

    /**
    * Returns the cell phone of this entity employees.
    *
    * @return the cell phone of this entity employees
    */
    @Override
    public java.lang.String getCellPhone() {
        return _entityEmployees.getCellPhone();
    }

    /**
    * Sets the cell phone of this entity employees.
    *
    * @param cellPhone the cell phone of this entity employees
    */
    @Override
    public void setCellPhone(java.lang.String cellPhone) {
        _entityEmployees.setCellPhone(cellPhone);
    }

    /**
    * Returns the phone of this entity employees.
    *
    * @return the phone of this entity employees
    */
    @Override
    public java.lang.String getPhone() {
        return _entityEmployees.getPhone();
    }

    /**
    * Sets the phone of this entity employees.
    *
    * @param phone the phone of this entity employees
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _entityEmployees.setPhone(phone);
    }

    /**
    * Returns the email of this entity employees.
    *
    * @return the email of this entity employees
    */
    @Override
    public java.lang.String getEmail() {
        return _entityEmployees.getEmail();
    }

    /**
    * Sets the email of this entity employees.
    *
    * @param email the email of this entity employees
    */
    @Override
    public void setEmail(java.lang.String email) {
        _entityEmployees.setEmail(email);
    }

    /**
    * Returns the certified of this entity employees.
    *
    * @return the certified of this entity employees
    */
    @Override
    public java.lang.String getCertified() {
        return _entityEmployees.getCertified();
    }

    /**
    * Sets the certified of this entity employees.
    *
    * @param certified the certified of this entity employees
    */
    @Override
    public void setCertified(java.lang.String certified) {
        _entityEmployees.setCertified(certified);
    }

    /**
    * Returns the certified date of this entity employees.
    *
    * @return the certified date of this entity employees
    */
    @Override
    public java.util.Date getCertifiedDate() {
        return _entityEmployees.getCertifiedDate();
    }

    /**
    * Sets the certified date of this entity employees.
    *
    * @param certifiedDate the certified date of this entity employees
    */
    @Override
    public void setCertifiedDate(java.util.Date certifiedDate) {
        _entityEmployees.setCertifiedDate(certifiedDate);
    }

    /**
    * Returns the certification number of this entity employees.
    *
    * @return the certification number of this entity employees
    */
    @Override
    public java.lang.String getCertificationNumber() {
        return _entityEmployees.getCertificationNumber();
    }

    /**
    * Sets the certification number of this entity employees.
    *
    * @param certificationNumber the certification number of this entity employees
    */
    @Override
    public void setCertificationNumber(java.lang.String certificationNumber) {
        _entityEmployees.setCertificationNumber(certificationNumber);
    }

    /**
    * Returns the registration date of this entity employees.
    *
    * @return the registration date of this entity employees
    */
    @Override
    public java.util.Date getRegistrationDate() {
        return _entityEmployees.getRegistrationDate();
    }

    /**
    * Sets the registration date of this entity employees.
    *
    * @param registrationDate the registration date of this entity employees
    */
    @Override
    public void setRegistrationDate(java.util.Date registrationDate) {
        _entityEmployees.setRegistrationDate(registrationDate);
    }

    /**
    * Returns the status of this entity employees.
    *
    * @return the status of this entity employees
    */
    @Override
    public java.lang.String getStatus() {
        return _entityEmployees.getStatus();
    }

    /**
    * Sets the status of this entity employees.
    *
    * @param status the status of this entity employees
    */
    @Override
    public void setStatus(java.lang.String status) {
        _entityEmployees.setStatus(status);
    }

    /**
    * Returns the comments of this entity employees.
    *
    * @return the comments of this entity employees
    */
    @Override
    public java.lang.String getComments() {
        return _entityEmployees.getComments();
    }

    /**
    * Sets the comments of this entity employees.
    *
    * @param comments the comments of this entity employees
    */
    @Override
    public void setComments(java.lang.String comments) {
        _entityEmployees.setComments(comments);
    }

    /**
    * Returns the department ID of this entity employees.
    *
    * @return the department ID of this entity employees
    */
    @Override
    public java.lang.String getDepartmentId() {
        return _entityEmployees.getDepartmentId();
    }

    /**
    * Sets the department ID of this entity employees.
    *
    * @param departmentId the department ID of this entity employees
    */
    @Override
    public void setDepartmentId(java.lang.String departmentId) {
        _entityEmployees.setDepartmentId(departmentId);
    }

    /**
    * Returns the employment ID of this entity employees.
    *
    * @return the employment ID of this entity employees
    */
    @Override
    public java.lang.String getEmploymentId() {
        return _entityEmployees.getEmploymentId();
    }

    /**
    * Sets the employment ID of this entity employees.
    *
    * @param employmentId the employment ID of this entity employees
    */
    @Override
    public void setEmploymentId(java.lang.String employmentId) {
        _entityEmployees.setEmploymentId(employmentId);
    }

    /**
    * Returns the dealer ID of this entity employees.
    *
    * @return the dealer ID of this entity employees
    */
    @Override
    public java.lang.String getDealerId() {
        return _entityEmployees.getDealerId();
    }

    /**
    * Sets the dealer ID of this entity employees.
    *
    * @param dealerId the dealer ID of this entity employees
    */
    @Override
    public void setDealerId(java.lang.String dealerId) {
        _entityEmployees.setDealerId(dealerId);
    }

    /**
    * Returns the business brand name of this entity employees.
    *
    * @return the business brand name of this entity employees
    */
    @Override
    public java.lang.String getBusinessBrandName() {
        return _entityEmployees.getBusinessBrandName();
    }

    /**
    * Sets the business brand name of this entity employees.
    *
    * @param businessBrandName the business brand name of this entity employees
    */
    @Override
    public void setBusinessBrandName(java.lang.String businessBrandName) {
        _entityEmployees.setBusinessBrandName(businessBrandName);
    }

    @Override
    public boolean isNew() {
        return _entityEmployees.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityEmployees.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityEmployees.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityEmployees.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityEmployees.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityEmployees.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityEmployees.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityEmployees.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityEmployees.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityEmployees.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityEmployees.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityEmployeesWrapper((EntityEmployees) _entityEmployees.clone());
    }

    @Override
    public int compareTo(EntityEmployees entityEmployees) {
        return _entityEmployees.compareTo(entityEmployees);
    }

    @Override
    public int hashCode() {
        return _entityEmployees.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityEmployees> toCacheModel() {
        return _entityEmployees.toCacheModel();
    }

    @Override
    public EntityEmployees toEscapedModel() {
        return new EntityEmployeesWrapper(_entityEmployees.toEscapedModel());
    }

    @Override
    public EntityEmployees toUnescapedModel() {
        return new EntityEmployeesWrapper(_entityEmployees.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityEmployees.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityEmployees.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityEmployees.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEmployeesWrapper)) {
            return false;
        }

        EntityEmployeesWrapper entityEmployeesWrapper = (EntityEmployeesWrapper) obj;

        if (Validator.equals(_entityEmployees,
                    entityEmployeesWrapper._entityEmployees)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityEmployees getWrappedEntityEmployees() {
        return _entityEmployees;
    }

    @Override
    public EntityEmployees getWrappedModel() {
        return _entityEmployees;
    }

    @Override
    public void resetOriginalValues() {
        _entityEmployees.resetOriginalValues();
    }
}
