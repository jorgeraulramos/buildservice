package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntitySalesPlace;
import com.consistent.ucwrt.model.EntitySalesPlaceModel;
import com.consistent.ucwrt.model.EntitySalesPlaceSoap;

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
 * The base model implementation for the EntitySalesPlace service. Represents a row in the &quot;SalesPlace&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntitySalesPlaceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntitySalesPlaceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySalesPlaceImpl
 * @see com.consistent.ucwrt.model.EntitySalesPlace
 * @see com.consistent.ucwrt.model.EntitySalesPlaceModel
 * @generated
 */
@JSON(strict = true)
public class EntitySalesPlaceModelImpl extends BaseModelImpl<EntitySalesPlace>
    implements EntitySalesPlaceModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity sales place model instance should use the {@link com.consistent.ucwrt.model.EntitySalesPlace} interface instead.
     */
    public static final String TABLE_NAME = "SalesPlace";
    public static final Object[][] TABLE_COLUMNS = {
            { "salesPlaceId", Types.INTEGER },
            { "salePlaceName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table SalesPlace (salesPlaceId INTEGER not null primary key,salePlaceName VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table SalesPlace";
    public static final String ORDER_BY_JPQL = " ORDER BY entitySalesPlace.salesPlaceId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY SalesPlace.salesPlaceId ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntitySalesPlace"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntitySalesPlace"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntitySalesPlace"));
    private static ClassLoader _classLoader = EntitySalesPlace.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntitySalesPlace.class
        };
    private int _salesPlaceId;
    private String _salePlaceName;
    private EntitySalesPlace _escapedModel;

    public EntitySalesPlaceModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntitySalesPlace toModel(EntitySalesPlaceSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntitySalesPlace model = new EntitySalesPlaceImpl();

        model.setSalesPlaceId(soapModel.getSalesPlaceId());
        model.setSalePlaceName(soapModel.getSalePlaceName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntitySalesPlace> toModels(
        EntitySalesPlaceSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntitySalesPlace> models = new ArrayList<EntitySalesPlace>(soapModels.length);

        for (EntitySalesPlaceSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _salesPlaceId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSalesPlaceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _salesPlaceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySalesPlace.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySalesPlace.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("salesPlaceId", getSalesPlaceId());
        attributes.put("salePlaceName", getSalePlaceName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer salesPlaceId = (Integer) attributes.get("salesPlaceId");

        if (salesPlaceId != null) {
            setSalesPlaceId(salesPlaceId);
        }

        String salePlaceName = (String) attributes.get("salePlaceName");

        if (salePlaceName != null) {
            setSalePlaceName(salePlaceName);
        }
    }

    @JSON
    @Override
    public int getSalesPlaceId() {
        return _salesPlaceId;
    }

    @Override
    public void setSalesPlaceId(int salesPlaceId) {
        _salesPlaceId = salesPlaceId;
    }

    @JSON
    @Override
    public String getSalePlaceName() {
        if (_salePlaceName == null) {
            return StringPool.BLANK;
        } else {
            return _salePlaceName;
        }
    }

    @Override
    public void setSalePlaceName(String salePlaceName) {
        _salePlaceName = salePlaceName;
    }

    @Override
    public EntitySalesPlace toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntitySalesPlace) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntitySalesPlaceImpl entitySalesPlaceImpl = new EntitySalesPlaceImpl();

        entitySalesPlaceImpl.setSalesPlaceId(getSalesPlaceId());
        entitySalesPlaceImpl.setSalePlaceName(getSalePlaceName());

        entitySalesPlaceImpl.resetOriginalValues();

        return entitySalesPlaceImpl;
    }

    @Override
    public int compareTo(EntitySalesPlace entitySalesPlace) {
        int primaryKey = entitySalesPlace.getPrimaryKey();

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

        if (!(obj instanceof EntitySalesPlace)) {
            return false;
        }

        EntitySalesPlace entitySalesPlace = (EntitySalesPlace) obj;

        int primaryKey = entitySalesPlace.getPrimaryKey();

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
    public CacheModel<EntitySalesPlace> toCacheModel() {
        EntitySalesPlaceCacheModel entitySalesPlaceCacheModel = new EntitySalesPlaceCacheModel();

        entitySalesPlaceCacheModel.salesPlaceId = getSalesPlaceId();

        entitySalesPlaceCacheModel.salePlaceName = getSalePlaceName();

        String salePlaceName = entitySalesPlaceCacheModel.salePlaceName;

        if ((salePlaceName != null) && (salePlaceName.length() == 0)) {
            entitySalesPlaceCacheModel.salePlaceName = null;
        }

        return entitySalesPlaceCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{salesPlaceId=");
        sb.append(getSalesPlaceId());
        sb.append(", salePlaceName=");
        sb.append(getSalePlaceName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntitySalesPlace");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>salesPlaceId</column-name><column-value><![CDATA[");
        sb.append(getSalesPlaceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salePlaceName</column-name><column-value><![CDATA[");
        sb.append(getSalePlaceName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
