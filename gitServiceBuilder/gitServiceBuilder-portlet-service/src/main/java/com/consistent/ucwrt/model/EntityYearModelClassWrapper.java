package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityYearModelClass}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClass
 * @generated
 */
public class EntityYearModelClassWrapper implements EntityYearModelClass,
    ModelWrapper<EntityYearModelClass> {
    private EntityYearModelClass _entityYearModelClass;

    public EntityYearModelClassWrapper(
        EntityYearModelClass entityYearModelClass) {
        _entityYearModelClass = entityYearModelClass;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityYearModelClass.class;
    }

    @Override
    public String getModelClassName() {
        return EntityYearModelClass.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("classId", getClassId());
        attributes.put("yearModel", getYearModel());
        attributes.put("startKilometer", getStartKilometer());
        attributes.put("finishKilometers", getFinishKilometers());
        attributes.put("price", getPrice());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        Integer startKilometer = (Integer) attributes.get("startKilometer");

        if (startKilometer != null) {
            setStartKilometer(startKilometer);
        }

        Integer finishKilometers = (Integer) attributes.get("finishKilometers");

        if (finishKilometers != null) {
            setFinishKilometers(finishKilometers);
        }

        Double price = (Double) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }
    }

    /**
    * Returns the primary key of this entity year model class.
    *
    * @return the primary key of this entity year model class
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityYearModelClassPK getPrimaryKey() {
        return _entityYearModelClass.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity year model class.
    *
    * @param primaryKey the primary key of this entity year model class
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityYearModelClassPK primaryKey) {
        _entityYearModelClass.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the class ID of this entity year model class.
    *
    * @return the class ID of this entity year model class
    */
    @Override
    public int getClassId() {
        return _entityYearModelClass.getClassId();
    }

    /**
    * Sets the class ID of this entity year model class.
    *
    * @param classId the class ID of this entity year model class
    */
    @Override
    public void setClassId(int classId) {
        _entityYearModelClass.setClassId(classId);
    }

    /**
    * Returns the year model of this entity year model class.
    *
    * @return the year model of this entity year model class
    */
    @Override
    public int getYearModel() {
        return _entityYearModelClass.getYearModel();
    }

    /**
    * Sets the year model of this entity year model class.
    *
    * @param yearModel the year model of this entity year model class
    */
    @Override
    public void setYearModel(int yearModel) {
        _entityYearModelClass.setYearModel(yearModel);
    }

    /**
    * Returns the start kilometer of this entity year model class.
    *
    * @return the start kilometer of this entity year model class
    */
    @Override
    public int getStartKilometer() {
        return _entityYearModelClass.getStartKilometer();
    }

    /**
    * Sets the start kilometer of this entity year model class.
    *
    * @param startKilometer the start kilometer of this entity year model class
    */
    @Override
    public void setStartKilometer(int startKilometer) {
        _entityYearModelClass.setStartKilometer(startKilometer);
    }

    /**
    * Returns the finish kilometers of this entity year model class.
    *
    * @return the finish kilometers of this entity year model class
    */
    @Override
    public int getFinishKilometers() {
        return _entityYearModelClass.getFinishKilometers();
    }

    /**
    * Sets the finish kilometers of this entity year model class.
    *
    * @param finishKilometers the finish kilometers of this entity year model class
    */
    @Override
    public void setFinishKilometers(int finishKilometers) {
        _entityYearModelClass.setFinishKilometers(finishKilometers);
    }

    /**
    * Returns the price of this entity year model class.
    *
    * @return the price of this entity year model class
    */
    @Override
    public double getPrice() {
        return _entityYearModelClass.getPrice();
    }

    /**
    * Sets the price of this entity year model class.
    *
    * @param price the price of this entity year model class
    */
    @Override
    public void setPrice(double price) {
        _entityYearModelClass.setPrice(price);
    }

    @Override
    public boolean isNew() {
        return _entityYearModelClass.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityYearModelClass.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityYearModelClass.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityYearModelClass.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityYearModelClass.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityYearModelClass.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityYearModelClass.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityYearModelClass.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityYearModelClass.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityYearModelClass.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityYearModelClass.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityYearModelClassWrapper((EntityYearModelClass) _entityYearModelClass.clone());
    }

    @Override
    public int compareTo(EntityYearModelClass entityYearModelClass) {
        return _entityYearModelClass.compareTo(entityYearModelClass);
    }

    @Override
    public int hashCode() {
        return _entityYearModelClass.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityYearModelClass> toCacheModel() {
        return _entityYearModelClass.toCacheModel();
    }

    @Override
    public EntityYearModelClass toEscapedModel() {
        return new EntityYearModelClassWrapper(_entityYearModelClass.toEscapedModel());
    }

    @Override
    public EntityYearModelClass toUnescapedModel() {
        return new EntityYearModelClassWrapper(_entityYearModelClass.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityYearModelClass.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityYearModelClass.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityYearModelClass.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityYearModelClassWrapper)) {
            return false;
        }

        EntityYearModelClassWrapper entityYearModelClassWrapper = (EntityYearModelClassWrapper) obj;

        if (Validator.equals(_entityYearModelClass,
                    entityYearModelClassWrapper._entityYearModelClass)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityYearModelClass getWrappedEntityYearModelClass() {
        return _entityYearModelClass;
    }

    @Override
    public EntityYearModelClass getWrappedModel() {
        return _entityYearModelClass;
    }

    @Override
    public void resetOriginalValues() {
        _entityYearModelClass.resetOriginalValues();
    }
}
