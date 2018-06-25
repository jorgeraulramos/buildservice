package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityMonthlySalesGoal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoal
 * @generated
 */
public class EntityMonthlySalesGoalWrapper implements EntityMonthlySalesGoal,
    ModelWrapper<EntityMonthlySalesGoal> {
    private EntityMonthlySalesGoal _entityMonthlySalesGoal;

    public EntityMonthlySalesGoalWrapper(
        EntityMonthlySalesGoal entityMonthlySalesGoal) {
        _entityMonthlySalesGoal = entityMonthlySalesGoal;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityMonthlySalesGoal.class;
    }

    @Override
    public String getModelClassName() {
        return EntityMonthlySalesGoal.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("year", getYear());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("descriptionMonthlyGoal", getDescriptionMonthlyGoal());
        attributes.put("objectiveAnnual", getObjectiveAnnual());
        attributes.put("januaryGoal", getJanuaryGoal());
        attributes.put("februaryGoal", getFebruaryGoal());
        attributes.put("marchGoal", getMarchGoal());
        attributes.put("aprilGoal", getAprilGoal());
        attributes.put("mayGoal", getMayGoal());
        attributes.put("juneGoal", getJuneGoal());
        attributes.put("julyGoal", getJulyGoal());
        attributes.put("augustGoal", getAugustGoal());
        attributes.put("septemberGoal", getSeptemberGoal());
        attributes.put("octoberGoal", getOctoberGoal());
        attributes.put("novemberGoal", getNovemberGoal());
        attributes.put("decemberGoal", getDecemberGoal());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer year = (Integer) attributes.get("year");

        if (year != null) {
            setYear(year);
        }

        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String descriptionMonthlyGoal = (String) attributes.get(
                "descriptionMonthlyGoal");

        if (descriptionMonthlyGoal != null) {
            setDescriptionMonthlyGoal(descriptionMonthlyGoal);
        }

        Integer objectiveAnnual = (Integer) attributes.get("objectiveAnnual");

        if (objectiveAnnual != null) {
            setObjectiveAnnual(objectiveAnnual);
        }

        Double januaryGoal = (Double) attributes.get("januaryGoal");

        if (januaryGoal != null) {
            setJanuaryGoal(januaryGoal);
        }

        Double februaryGoal = (Double) attributes.get("februaryGoal");

        if (februaryGoal != null) {
            setFebruaryGoal(februaryGoal);
        }

        Double marchGoal = (Double) attributes.get("marchGoal");

        if (marchGoal != null) {
            setMarchGoal(marchGoal);
        }

        Double aprilGoal = (Double) attributes.get("aprilGoal");

        if (aprilGoal != null) {
            setAprilGoal(aprilGoal);
        }

        Double mayGoal = (Double) attributes.get("mayGoal");

        if (mayGoal != null) {
            setMayGoal(mayGoal);
        }

        Double juneGoal = (Double) attributes.get("juneGoal");

        if (juneGoal != null) {
            setJuneGoal(juneGoal);
        }

        Double julyGoal = (Double) attributes.get("julyGoal");

        if (julyGoal != null) {
            setJulyGoal(julyGoal);
        }

        Double augustGoal = (Double) attributes.get("augustGoal");

        if (augustGoal != null) {
            setAugustGoal(augustGoal);
        }

        Double septemberGoal = (Double) attributes.get("septemberGoal");

        if (septemberGoal != null) {
            setSeptemberGoal(septemberGoal);
        }

        Double octoberGoal = (Double) attributes.get("octoberGoal");

        if (octoberGoal != null) {
            setOctoberGoal(octoberGoal);
        }

        Double novemberGoal = (Double) attributes.get("novemberGoal");

        if (novemberGoal != null) {
            setNovemberGoal(novemberGoal);
        }

        Double decemberGoal = (Double) attributes.get("decemberGoal");

        if (decemberGoal != null) {
            setDecemberGoal(decemberGoal);
        }
    }

    /**
    * Returns the primary key of this entity monthly sales goal.
    *
    * @return the primary key of this entity monthly sales goal
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK getPrimaryKey() {
        return _entityMonthlySalesGoal.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity monthly sales goal.
    *
    * @param primaryKey the primary key of this entity monthly sales goal
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK primaryKey) {
        _entityMonthlySalesGoal.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the year of this entity monthly sales goal.
    *
    * @return the year of this entity monthly sales goal
    */
    @Override
    public int getYear() {
        return _entityMonthlySalesGoal.getYear();
    }

    /**
    * Sets the year of this entity monthly sales goal.
    *
    * @param year the year of this entity monthly sales goal
    */
    @Override
    public void setYear(int year) {
        _entityMonthlySalesGoal.setYear(year);
    }

    /**
    * Returns the dealer ID of this entity monthly sales goal.
    *
    * @return the dealer ID of this entity monthly sales goal
    */
    @Override
    public java.lang.String getDealerId() {
        return _entityMonthlySalesGoal.getDealerId();
    }

    /**
    * Sets the dealer ID of this entity monthly sales goal.
    *
    * @param dealerId the dealer ID of this entity monthly sales goal
    */
    @Override
    public void setDealerId(java.lang.String dealerId) {
        _entityMonthlySalesGoal.setDealerId(dealerId);
    }

    /**
    * Returns the business brand name of this entity monthly sales goal.
    *
    * @return the business brand name of this entity monthly sales goal
    */
    @Override
    public java.lang.String getBusinessBrandName() {
        return _entityMonthlySalesGoal.getBusinessBrandName();
    }

    /**
    * Sets the business brand name of this entity monthly sales goal.
    *
    * @param businessBrandName the business brand name of this entity monthly sales goal
    */
    @Override
    public void setBusinessBrandName(java.lang.String businessBrandName) {
        _entityMonthlySalesGoal.setBusinessBrandName(businessBrandName);
    }

    /**
    * Returns the description monthly goal of this entity monthly sales goal.
    *
    * @return the description monthly goal of this entity monthly sales goal
    */
    @Override
    public java.lang.String getDescriptionMonthlyGoal() {
        return _entityMonthlySalesGoal.getDescriptionMonthlyGoal();
    }

    /**
    * Sets the description monthly goal of this entity monthly sales goal.
    *
    * @param descriptionMonthlyGoal the description monthly goal of this entity monthly sales goal
    */
    @Override
    public void setDescriptionMonthlyGoal(
        java.lang.String descriptionMonthlyGoal) {
        _entityMonthlySalesGoal.setDescriptionMonthlyGoal(descriptionMonthlyGoal);
    }

    /**
    * Returns the objective annual of this entity monthly sales goal.
    *
    * @return the objective annual of this entity monthly sales goal
    */
    @Override
    public int getObjectiveAnnual() {
        return _entityMonthlySalesGoal.getObjectiveAnnual();
    }

    /**
    * Sets the objective annual of this entity monthly sales goal.
    *
    * @param objectiveAnnual the objective annual of this entity monthly sales goal
    */
    @Override
    public void setObjectiveAnnual(int objectiveAnnual) {
        _entityMonthlySalesGoal.setObjectiveAnnual(objectiveAnnual);
    }

    /**
    * Returns the january goal of this entity monthly sales goal.
    *
    * @return the january goal of this entity monthly sales goal
    */
    @Override
    public double getJanuaryGoal() {
        return _entityMonthlySalesGoal.getJanuaryGoal();
    }

    /**
    * Sets the january goal of this entity monthly sales goal.
    *
    * @param januaryGoal the january goal of this entity monthly sales goal
    */
    @Override
    public void setJanuaryGoal(double januaryGoal) {
        _entityMonthlySalesGoal.setJanuaryGoal(januaryGoal);
    }

    /**
    * Returns the february goal of this entity monthly sales goal.
    *
    * @return the february goal of this entity monthly sales goal
    */
    @Override
    public double getFebruaryGoal() {
        return _entityMonthlySalesGoal.getFebruaryGoal();
    }

    /**
    * Sets the february goal of this entity monthly sales goal.
    *
    * @param februaryGoal the february goal of this entity monthly sales goal
    */
    @Override
    public void setFebruaryGoal(double februaryGoal) {
        _entityMonthlySalesGoal.setFebruaryGoal(februaryGoal);
    }

    /**
    * Returns the march goal of this entity monthly sales goal.
    *
    * @return the march goal of this entity monthly sales goal
    */
    @Override
    public double getMarchGoal() {
        return _entityMonthlySalesGoal.getMarchGoal();
    }

    /**
    * Sets the march goal of this entity monthly sales goal.
    *
    * @param marchGoal the march goal of this entity monthly sales goal
    */
    @Override
    public void setMarchGoal(double marchGoal) {
        _entityMonthlySalesGoal.setMarchGoal(marchGoal);
    }

    /**
    * Returns the april goal of this entity monthly sales goal.
    *
    * @return the april goal of this entity monthly sales goal
    */
    @Override
    public double getAprilGoal() {
        return _entityMonthlySalesGoal.getAprilGoal();
    }

    /**
    * Sets the april goal of this entity monthly sales goal.
    *
    * @param aprilGoal the april goal of this entity monthly sales goal
    */
    @Override
    public void setAprilGoal(double aprilGoal) {
        _entityMonthlySalesGoal.setAprilGoal(aprilGoal);
    }

    /**
    * Returns the may goal of this entity monthly sales goal.
    *
    * @return the may goal of this entity monthly sales goal
    */
    @Override
    public double getMayGoal() {
        return _entityMonthlySalesGoal.getMayGoal();
    }

    /**
    * Sets the may goal of this entity monthly sales goal.
    *
    * @param mayGoal the may goal of this entity monthly sales goal
    */
    @Override
    public void setMayGoal(double mayGoal) {
        _entityMonthlySalesGoal.setMayGoal(mayGoal);
    }

    /**
    * Returns the june goal of this entity monthly sales goal.
    *
    * @return the june goal of this entity monthly sales goal
    */
    @Override
    public double getJuneGoal() {
        return _entityMonthlySalesGoal.getJuneGoal();
    }

    /**
    * Sets the june goal of this entity monthly sales goal.
    *
    * @param juneGoal the june goal of this entity monthly sales goal
    */
    @Override
    public void setJuneGoal(double juneGoal) {
        _entityMonthlySalesGoal.setJuneGoal(juneGoal);
    }

    /**
    * Returns the july goal of this entity monthly sales goal.
    *
    * @return the july goal of this entity monthly sales goal
    */
    @Override
    public double getJulyGoal() {
        return _entityMonthlySalesGoal.getJulyGoal();
    }

    /**
    * Sets the july goal of this entity monthly sales goal.
    *
    * @param julyGoal the july goal of this entity monthly sales goal
    */
    @Override
    public void setJulyGoal(double julyGoal) {
        _entityMonthlySalesGoal.setJulyGoal(julyGoal);
    }

    /**
    * Returns the august goal of this entity monthly sales goal.
    *
    * @return the august goal of this entity monthly sales goal
    */
    @Override
    public double getAugustGoal() {
        return _entityMonthlySalesGoal.getAugustGoal();
    }

    /**
    * Sets the august goal of this entity monthly sales goal.
    *
    * @param augustGoal the august goal of this entity monthly sales goal
    */
    @Override
    public void setAugustGoal(double augustGoal) {
        _entityMonthlySalesGoal.setAugustGoal(augustGoal);
    }

    /**
    * Returns the september goal of this entity monthly sales goal.
    *
    * @return the september goal of this entity monthly sales goal
    */
    @Override
    public double getSeptemberGoal() {
        return _entityMonthlySalesGoal.getSeptemberGoal();
    }

    /**
    * Sets the september goal of this entity monthly sales goal.
    *
    * @param septemberGoal the september goal of this entity monthly sales goal
    */
    @Override
    public void setSeptemberGoal(double septemberGoal) {
        _entityMonthlySalesGoal.setSeptemberGoal(septemberGoal);
    }

    /**
    * Returns the october goal of this entity monthly sales goal.
    *
    * @return the october goal of this entity monthly sales goal
    */
    @Override
    public double getOctoberGoal() {
        return _entityMonthlySalesGoal.getOctoberGoal();
    }

    /**
    * Sets the october goal of this entity monthly sales goal.
    *
    * @param octoberGoal the october goal of this entity monthly sales goal
    */
    @Override
    public void setOctoberGoal(double octoberGoal) {
        _entityMonthlySalesGoal.setOctoberGoal(octoberGoal);
    }

    /**
    * Returns the november goal of this entity monthly sales goal.
    *
    * @return the november goal of this entity monthly sales goal
    */
    @Override
    public double getNovemberGoal() {
        return _entityMonthlySalesGoal.getNovemberGoal();
    }

    /**
    * Sets the november goal of this entity monthly sales goal.
    *
    * @param novemberGoal the november goal of this entity monthly sales goal
    */
    @Override
    public void setNovemberGoal(double novemberGoal) {
        _entityMonthlySalesGoal.setNovemberGoal(novemberGoal);
    }

    /**
    * Returns the december goal of this entity monthly sales goal.
    *
    * @return the december goal of this entity monthly sales goal
    */
    @Override
    public double getDecemberGoal() {
        return _entityMonthlySalesGoal.getDecemberGoal();
    }

    /**
    * Sets the december goal of this entity monthly sales goal.
    *
    * @param decemberGoal the december goal of this entity monthly sales goal
    */
    @Override
    public void setDecemberGoal(double decemberGoal) {
        _entityMonthlySalesGoal.setDecemberGoal(decemberGoal);
    }

    @Override
    public boolean isNew() {
        return _entityMonthlySalesGoal.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityMonthlySalesGoal.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityMonthlySalesGoal.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityMonthlySalesGoal.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityMonthlySalesGoal.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityMonthlySalesGoal.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityMonthlySalesGoal.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityMonthlySalesGoal.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityMonthlySalesGoal.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityMonthlySalesGoal.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityMonthlySalesGoal.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityMonthlySalesGoalWrapper((EntityMonthlySalesGoal) _entityMonthlySalesGoal.clone());
    }

    @Override
    public int compareTo(EntityMonthlySalesGoal entityMonthlySalesGoal) {
        return _entityMonthlySalesGoal.compareTo(entityMonthlySalesGoal);
    }

    @Override
    public int hashCode() {
        return _entityMonthlySalesGoal.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityMonthlySalesGoal> toCacheModel() {
        return _entityMonthlySalesGoal.toCacheModel();
    }

    @Override
    public EntityMonthlySalesGoal toEscapedModel() {
        return new EntityMonthlySalesGoalWrapper(_entityMonthlySalesGoal.toEscapedModel());
    }

    @Override
    public EntityMonthlySalesGoal toUnescapedModel() {
        return new EntityMonthlySalesGoalWrapper(_entityMonthlySalesGoal.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityMonthlySalesGoal.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityMonthlySalesGoal.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityMonthlySalesGoal.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityMonthlySalesGoalWrapper)) {
            return false;
        }

        EntityMonthlySalesGoalWrapper entityMonthlySalesGoalWrapper = (EntityMonthlySalesGoalWrapper) obj;

        if (Validator.equals(_entityMonthlySalesGoal,
                    entityMonthlySalesGoalWrapper._entityMonthlySalesGoal)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityMonthlySalesGoal getWrappedEntityMonthlySalesGoal() {
        return _entityMonthlySalesGoal;
    }

    @Override
    public EntityMonthlySalesGoal getWrappedModel() {
        return _entityMonthlySalesGoal;
    }

    @Override
    public void resetOriginalValues() {
        _entityMonthlySalesGoal.resetOriginalValues();
    }
}
