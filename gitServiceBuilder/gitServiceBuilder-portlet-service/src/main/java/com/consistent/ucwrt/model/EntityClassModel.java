package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityClass service. Represents a row in the &quot;Class&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityClassModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityClassImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityClass
 * @see com.consistent.ucwrt.model.impl.EntityClassImpl
 * @see com.consistent.ucwrt.model.impl.EntityClassModelImpl
 * @generated
 */
public interface EntityClassModel extends BaseModel<EntityClass> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity class model instance should use the {@link EntityClass} interface instead.
     */

    /**
     * Returns the primary key of this entity class.
     *
     * @return the primary key of this entity class
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this entity class.
     *
     * @param primaryKey the primary key of this entity class
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the class ID of this entity class.
     *
     * @return the class ID of this entity class
     */
    public int getClassId();

    /**
     * Sets the class ID of this entity class.
     *
     * @param classId the class ID of this entity class
     */
    public void setClassId(int classId);

    /**
     * Returns the class name of this entity class.
     *
     * @return the class name of this entity class
     */
    @AutoEscape
    public String getClassName();

    /**
     * Sets the class name of this entity class.
     *
     * @param className the class name of this entity class
     */
    public void setClassName(String className);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(EntityClass entityClass);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityClass> toCacheModel();

    @Override
    public EntityClass toEscapedModel();

    @Override
    public EntityClass toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
