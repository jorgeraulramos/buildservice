package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityIntervalos}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityIntervalos
 * @generated
 */
public class EntityIntervalosWrapper implements EntityIntervalos,
    ModelWrapper<EntityIntervalos> {
    private EntityIntervalos _entityIntervalos;

    public EntityIntervalosWrapper(EntityIntervalos entityIntervalos) {
        _entityIntervalos = entityIntervalos;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityIntervalos.class;
    }

    @Override
    public String getModelClassName() {
        return EntityIntervalos.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("startKilometer", getStartKilometer());
        attributes.put("finishKilometers", getFinishKilometers());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer startKilometer = (Integer) attributes.get("startKilometer");

        if (startKilometer != null) {
            setStartKilometer(startKilometer);
        }

        Integer finishKilometers = (Integer) attributes.get("finishKilometers");

        if (finishKilometers != null) {
            setFinishKilometers(finishKilometers);
        }
    }

    /**
    * Returns the primary key of this entity intervalos.
    *
    * @return the primary key of this entity intervalos
    */
    @Override
    public com.consistent.ucwrt.service.persistence.EntityIntervalosPK getPrimaryKey() {
        return _entityIntervalos.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity intervalos.
    *
    * @param primaryKey the primary key of this entity intervalos
    */
    @Override
    public void setPrimaryKey(
        com.consistent.ucwrt.service.persistence.EntityIntervalosPK primaryKey) {
        _entityIntervalos.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the start kilometer of this entity intervalos.
    *
    * @return the start kilometer of this entity intervalos
    */
    @Override
    public int getStartKilometer() {
        return _entityIntervalos.getStartKilometer();
    }

    /**
    * Sets the start kilometer of this entity intervalos.
    *
    * @param startKilometer the start kilometer of this entity intervalos
    */
    @Override
    public void setStartKilometer(int startKilometer) {
        _entityIntervalos.setStartKilometer(startKilometer);
    }

    /**
    * Returns the finish kilometers of this entity intervalos.
    *
    * @return the finish kilometers of this entity intervalos
    */
    @Override
    public int getFinishKilometers() {
        return _entityIntervalos.getFinishKilometers();
    }

    /**
    * Sets the finish kilometers of this entity intervalos.
    *
    * @param finishKilometers the finish kilometers of this entity intervalos
    */
    @Override
    public void setFinishKilometers(int finishKilometers) {
        _entityIntervalos.setFinishKilometers(finishKilometers);
    }

    @Override
    public boolean isNew() {
        return _entityIntervalos.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityIntervalos.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityIntervalos.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityIntervalos.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityIntervalos.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityIntervalos.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityIntervalos.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityIntervalos.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityIntervalos.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityIntervalos.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityIntervalos.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityIntervalosWrapper((EntityIntervalos) _entityIntervalos.clone());
    }

    @Override
    public int compareTo(EntityIntervalos entityIntervalos) {
        return _entityIntervalos.compareTo(entityIntervalos);
    }

    @Override
    public int hashCode() {
        return _entityIntervalos.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityIntervalos> toCacheModel() {
        return _entityIntervalos.toCacheModel();
    }

    @Override
    public EntityIntervalos toEscapedModel() {
        return new EntityIntervalosWrapper(_entityIntervalos.toEscapedModel());
    }

    @Override
    public EntityIntervalos toUnescapedModel() {
        return new EntityIntervalosWrapper(_entityIntervalos.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityIntervalos.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityIntervalos.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityIntervalos.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityIntervalosWrapper)) {
            return false;
        }

        EntityIntervalosWrapper entityIntervalosWrapper = (EntityIntervalosWrapper) obj;

        if (Validator.equals(_entityIntervalos,
                    entityIntervalosWrapper._entityIntervalos)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityIntervalos getWrappedEntityIntervalos() {
        return _entityIntervalos;
    }

    @Override
    public EntityIntervalos getWrappedModel() {
        return _entityIntervalos;
    }

    @Override
    public void resetOriginalValues() {
        _entityIntervalos.resetOriginalValues();
    }
}
