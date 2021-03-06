package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityState;
import com.consistent.ucwrt.model.EntityStateModel;
import com.consistent.ucwrt.model.EntityStateSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EntityState service. Represents a row in the &quot;State&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityStateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityStateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStateImpl
 * @see com.consistent.ucwrt.model.EntityState
 * @see com.consistent.ucwrt.model.EntityStateModel
 * @generated
 */
@JSON(strict = true)
public class EntityStateModelImpl extends BaseModelImpl<EntityState>
    implements EntityStateModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity state model instance should use the {@link com.consistent.ucwrt.model.EntityState} interface instead.
     */
    public static final String TABLE_NAME = "State";
    public static final Object[][] TABLE_COLUMNS = {
            { "stateId", Types.INTEGER },
            { "stateName", Types.VARCHAR },
            { "capitalName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table State (stateId INTEGER not null primary key,stateName VARCHAR(75) null,capitalName VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table State";
    public static final String ORDER_BY_JPQL = " ORDER BY entityState.stateId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY State.stateId ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityState"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityState"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityState"));
    private static ClassLoader _classLoader = EntityState.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityState.class
        };
    private int _stateId;
    private String _stateName;
    private String _capitalName;
    private EntityState _escapedModel;

    public EntityStateModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityState toModel(EntityStateSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityState model = new EntityStateImpl();

        model.setStateId(soapModel.getStateId());
        model.setStateName(soapModel.getStateName());
        model.setCapitalName(soapModel.getCapitalName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityState> toModels(EntityStateSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityState> models = new ArrayList<EntityState>(soapModels.length);

        for (EntityStateSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _stateId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setStateId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _stateId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return EntityState.class;
    }

    @Override
    public String getModelClassName() {
        return EntityState.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("stateId", getStateId());
        attributes.put("stateName", getStateName());
        attributes.put("capitalName", getCapitalName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }

        String stateName = (String) attributes.get("stateName");

        if (stateName != null) {
            setStateName(stateName);
        }

        String capitalName = (String) attributes.get("capitalName");

        if (capitalName != null) {
            setCapitalName(capitalName);
        }
    }

    @JSON
    @Override
    public int getStateId() {
        return _stateId;
    }

    @Override
    public void setStateId(int stateId) {
        _stateId = stateId;
    }

    @JSON
    @Override
    public String getStateName() {
        if (_stateName == null) {
            return StringPool.BLANK;
        } else {
            return _stateName;
        }
    }

    @Override
    public void setStateName(String stateName) {
        _stateName = stateName;
    }

    @JSON
    @Override
    public String getCapitalName() {
        if (_capitalName == null) {
            return StringPool.BLANK;
        } else {
            return _capitalName;
        }
    }

    @Override
    public void setCapitalName(String capitalName) {
        _capitalName = capitalName;
    }

    @Override
    public EntityState toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityState) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityStateImpl entityStateImpl = new EntityStateImpl();

        entityStateImpl.setStateId(getStateId());
        entityStateImpl.setStateName(getStateName());
        entityStateImpl.setCapitalName(getCapitalName());

        entityStateImpl.resetOriginalValues();

        return entityStateImpl;
    }

    @Override
    public int compareTo(EntityState entityState) {
        int primaryKey = entityState.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityState)) {
            return false;
        }

        EntityState entityState = (EntityState) obj;

        int primaryKey = entityState.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<EntityState> toCacheModel() {
        EntityStateCacheModel entityStateCacheModel = new EntityStateCacheModel();

        entityStateCacheModel.stateId = getStateId();

        entityStateCacheModel.stateName = getStateName();

        String stateName = entityStateCacheModel.stateName;

        if ((stateName != null) && (stateName.length() == 0)) {
            entityStateCacheModel.stateName = null;
        }

        entityStateCacheModel.capitalName = getCapitalName();

        String capitalName = entityStateCacheModel.capitalName;

        if ((capitalName != null) && (capitalName.length() == 0)) {
            entityStateCacheModel.capitalName = null;
        }

        return entityStateCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{stateId=");
        sb.append(getStateId());
        sb.append(", stateName=");
        sb.append(getStateName());
        sb.append(", capitalName=");
        sb.append(getCapitalName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityState");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>stateId</column-name><column-value><![CDATA[");
        sb.append(getStateId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stateName</column-name><column-value><![CDATA[");
        sb.append(getStateName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>capitalName</column-name><column-value><![CDATA[");
        sb.append(getCapitalName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
