package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityClass}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityClass
 * @generated
 */
public class EntityClassWrapper implements EntityClass,
    ModelWrapper<EntityClass> {
    private EntityClass _entityClass;

    public EntityClassWrapper(EntityClass entityClass) {
        _entityClass = entityClass;
    }

    @Override
    public Class<?> getModelClass() {
        return EntityClass.class;
    }

    @Override
    public String getModelClassName() {
        return EntityClass.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("classId", getClassId());
        attributes.put("className", getClassName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }

        String className = (String) attributes.get("className");

        if (className != null) {
            setClassName(className);
        }
    }

    /**
    * Returns the primary key of this entity class.
    *
    * @return the primary key of this entity class
    */
    @Override
    public int getPrimaryKey() {
        return _entityClass.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity class.
    *
    * @param primaryKey the primary key of this entity class
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _entityClass.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the class ID of this entity class.
    *
    * @return the class ID of this entity class
    */
    @Override
    public int getClassId() {
        return _entityClass.getClassId();
    }

    /**
    * Sets the class ID of this entity class.
    *
    * @param classId the class ID of this entity class
    */
    @Override
    public void setClassId(int classId) {
        _entityClass.setClassId(classId);
    }

    /**
    * Returns the class name of this entity class.
    *
    * @return the class name of this entity class
    */
    @Override
    public java.lang.String getClassName() {
        return _entityClass.getClassName();
    }

    /**
    * Sets the class name of this entity class.
    *
    * @param className the class name of this entity class
    */
    @Override
    public void setClassName(java.lang.String className) {
        _entityClass.setClassName(className);
    }

    @Override
    public boolean isNew() {
        return _entityClass.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityClass.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityClass.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityClass.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityClass.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityClass.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityClass.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityClass.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityClass.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityClass.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityClass.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityClassWrapper((EntityClass) _entityClass.clone());
    }

    @Override
    public int compareTo(EntityClass entityClass) {
        return _entityClass.compareTo(entityClass);
    }

    @Override
    public int hashCode() {
        return _entityClass.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EntityClass> toCacheModel() {
        return _entityClass.toCacheModel();
    }

    @Override
    public EntityClass toEscapedModel() {
        return new EntityClassWrapper(_entityClass.toEscapedModel());
    }

    @Override
    public EntityClass toUnescapedModel() {
        return new EntityClassWrapper(_entityClass.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityClass.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityClass.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityClass.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityClassWrapper)) {
            return false;
        }

        EntityClassWrapper entityClassWrapper = (EntityClassWrapper) obj;

        if (Validator.equals(_entityClass, entityClassWrapper._entityClass)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityClass getWrappedEntityClass() {
        return _entityClass;
    }

    @Override
    public EntityClass getWrappedModel() {
        return _entityClass;
    }

    @Override
    public void resetOriginalValues() {
        _entityClass.resetOriginalValues();
    }
}
