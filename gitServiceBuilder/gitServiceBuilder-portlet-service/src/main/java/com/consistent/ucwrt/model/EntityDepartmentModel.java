package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityDepartmentPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityDepartment service. Represents a row in the &quot;Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityDepartmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartment
 * @see com.consistent.ucwrt.model.impl.EntityDepartmentImpl
 * @see com.consistent.ucwrt.model.impl.EntityDepartmentModelImpl
 * @generated
 */
public interface EntityDepartmentModel extends BaseModel<EntityDepartment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity department model instance should use the {@link EntityDepartment} interface instead.
     */

    /**
     * Returns the primary key of this entity department.
     *
     * @return the primary key of this entity department
     */
    public EntityDepartmentPK getPrimaryKey();

    /**
     * Sets the primary key of this entity department.
     *
     * @param primaryKey the primary key of this entity department
     */
    public void setPrimaryKey(EntityDepartmentPK primaryKey);

    /**
     * Returns the department ID of this entity department.
     *
     * @return the department ID of this entity department
     */
    @AutoEscape
    public String getDepartmentId();

    /**
     * Sets the department ID of this entity department.
     *
     * @param departmentId the department ID of this entity department
     */
    public void setDepartmentId(String departmentId);

    /**
     * Returns the department name of this entity department.
     *
     * @return the department name of this entity department
     */
    @AutoEscape
    public String getDepartmentName();

    /**
     * Sets the department name of this entity department.
     *
     * @param departmentName the department name of this entity department
     */
    public void setDepartmentName(String departmentName);

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
    public int compareTo(EntityDepartment entityDepartment);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityDepartment> toCacheModel();

    @Override
    public EntityDepartment toEscapedModel();

    @Override
    public EntityDepartment toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
