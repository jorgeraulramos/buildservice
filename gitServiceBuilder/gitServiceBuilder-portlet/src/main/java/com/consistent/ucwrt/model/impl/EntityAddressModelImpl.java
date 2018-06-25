package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityAddress;
import com.consistent.ucwrt.model.EntityAddressModel;
import com.consistent.ucwrt.model.EntityAddressSoap;

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
 * The base model implementation for the EntityAddress service. Represents a row in the &quot;Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityAddressModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddressImpl
 * @see com.consistent.ucwrt.model.EntityAddress
 * @see com.consistent.ucwrt.model.EntityAddressModel
 * @generated
 */
@JSON(strict = true)
public class EntityAddressModelImpl extends BaseModelImpl<EntityAddress>
    implements EntityAddressModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity address model instance should use the {@link com.consistent.ucwrt.model.EntityAddress} interface instead.
     */
    public static final String TABLE_NAME = "Address";
    public static final Object[][] TABLE_COLUMNS = {
            { "addressId", Types.INTEGER },
            { "street", Types.VARCHAR },
            { "interiorNumber", Types.INTEGER },
            { "exteriorNumber", Types.INTEGER },
            { "clientId", Types.INTEGER },
            { "municipalId", Types.INTEGER },
            { "stateId", Types.INTEGER },
            { "suburbId", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Address (addressId INTEGER not null primary key,street VARCHAR(75) null,interiorNumber INTEGER,exteriorNumber INTEGER,clientId INTEGER,municipalId INTEGER,stateId INTEGER,suburbId INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Address";
    public static final String ORDER_BY_JPQL = " ORDER BY entityAddress.addressId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Address.addressId ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityAddress"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityAddress"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.consistent.ucwrt.model.EntityAddress"),
            true);
    public static long CLIENTID_COLUMN_BITMASK = 1L;
    public static long ADDRESSID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityAddress"));
    private static ClassLoader _classLoader = EntityAddress.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityAddress.class
        };
    private int _addressId;
    private String _street;
    private int _interiorNumber;
    private int _exteriorNumber;
    private int _clientId;
    private int _originalClientId;
    private boolean _setOriginalClientId;
    private int _municipalId;
    private int _stateId;
    private int _suburbId;
    private long _columnBitmask;
    private EntityAddress _escapedModel;

    public EntityAddressModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityAddress toModel(EntityAddressSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityAddress model = new EntityAddressImpl();

        model.setAddressId(soapModel.getAddressId());
        model.setStreet(soapModel.getStreet());
        model.setInteriorNumber(soapModel.getInteriorNumber());
        model.setExteriorNumber(soapModel.getExteriorNumber());
        model.setClientId(soapModel.getClientId());
        model.setMunicipalId(soapModel.getMunicipalId());
        model.setStateId(soapModel.getStateId());
        model.setSuburbId(soapModel.getSuburbId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityAddress> toModels(EntityAddressSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityAddress> models = new ArrayList<EntityAddress>(soapModels.length);

        for (EntityAddressSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _addressId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setAddressId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _addressId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return EntityAddress.class;
    }

    @Override
    public String getModelClassName() {
        return EntityAddress.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("addressId", getAddressId());
        attributes.put("street", getStreet());
        attributes.put("interiorNumber", getInteriorNumber());
        attributes.put("exteriorNumber", getExteriorNumber());
        attributes.put("clientId", getClientId());
        attributes.put("municipalId", getMunicipalId());
        attributes.put("stateId", getStateId());
        attributes.put("suburbId", getSuburbId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer addressId = (Integer) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
        }

        String street = (String) attributes.get("street");

        if (street != null) {
            setStreet(street);
        }

        Integer interiorNumber = (Integer) attributes.get("interiorNumber");

        if (interiorNumber != null) {
            setInteriorNumber(interiorNumber);
        }

        Integer exteriorNumber = (Integer) attributes.get("exteriorNumber");

        if (exteriorNumber != null) {
            setExteriorNumber(exteriorNumber);
        }

        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        Integer municipalId = (Integer) attributes.get("municipalId");

        if (municipalId != null) {
            setMunicipalId(municipalId);
        }

        Integer stateId = (Integer) attributes.get("stateId");

        if (stateId != null) {
            setStateId(stateId);
        }

        Integer suburbId = (Integer) attributes.get("suburbId");

        if (suburbId != null) {
            setSuburbId(suburbId);
        }
    }

    @JSON
    @Override
    public int getAddressId() {
        return _addressId;
    }

    @Override
    public void setAddressId(int addressId) {
        _addressId = addressId;
    }

    @JSON
    @Override
    public String getStreet() {
        if (_street == null) {
            return StringPool.BLANK;
        } else {
            return _street;
        }
    }

    @Override
    public void setStreet(String street) {
        _street = street;
    }

    @JSON
    @Override
    public int getInteriorNumber() {
        return _interiorNumber;
    }

    @Override
    public void setInteriorNumber(int interiorNumber) {
        _interiorNumber = interiorNumber;
    }

    @JSON
    @Override
    public int getExteriorNumber() {
        return _exteriorNumber;
    }

    @Override
    public void setExteriorNumber(int exteriorNumber) {
        _exteriorNumber = exteriorNumber;
    }

    @JSON
    @Override
    public int getClientId() {
        return _clientId;
    }

    @Override
    public void setClientId(int clientId) {
        _columnBitmask |= CLIENTID_COLUMN_BITMASK;

        if (!_setOriginalClientId) {
            _setOriginalClientId = true;

            _originalClientId = _clientId;
        }

        _clientId = clientId;
    }

    public int getOriginalClientId() {
        return _originalClientId;
    }

    @JSON
    @Override
    public int getMunicipalId() {
        return _municipalId;
    }

    @Override
    public void setMunicipalId(int municipalId) {
        _municipalId = municipalId;
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
    public int getSuburbId() {
        return _suburbId;
    }

    @Override
    public void setSuburbId(int suburbId) {
        _suburbId = suburbId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public EntityAddress toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityAddress) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityAddressImpl entityAddressImpl = new EntityAddressImpl();

        entityAddressImpl.setAddressId(getAddressId());
        entityAddressImpl.setStreet(getStreet());
        entityAddressImpl.setInteriorNumber(getInteriorNumber());
        entityAddressImpl.setExteriorNumber(getExteriorNumber());
        entityAddressImpl.setClientId(getClientId());
        entityAddressImpl.setMunicipalId(getMunicipalId());
        entityAddressImpl.setStateId(getStateId());
        entityAddressImpl.setSuburbId(getSuburbId());

        entityAddressImpl.resetOriginalValues();

        return entityAddressImpl;
    }

    @Override
    public int compareTo(EntityAddress entityAddress) {
        int primaryKey = entityAddress.getPrimaryKey();

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

        if (!(obj instanceof EntityAddress)) {
            return false;
        }

        EntityAddress entityAddress = (EntityAddress) obj;

        int primaryKey = entityAddress.getPrimaryKey();

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
        EntityAddressModelImpl entityAddressModelImpl = this;

        entityAddressModelImpl._originalClientId = entityAddressModelImpl._clientId;

        entityAddressModelImpl._setOriginalClientId = false;

        entityAddressModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<EntityAddress> toCacheModel() {
        EntityAddressCacheModel entityAddressCacheModel = new EntityAddressCacheModel();

        entityAddressCacheModel.addressId = getAddressId();

        entityAddressCacheModel.street = getStreet();

        String street = entityAddressCacheModel.street;

        if ((street != null) && (street.length() == 0)) {
            entityAddressCacheModel.street = null;
        }

        entityAddressCacheModel.interiorNumber = getInteriorNumber();

        entityAddressCacheModel.exteriorNumber = getExteriorNumber();

        entityAddressCacheModel.clientId = getClientId();

        entityAddressCacheModel.municipalId = getMunicipalId();

        entityAddressCacheModel.stateId = getStateId();

        entityAddressCacheModel.suburbId = getSuburbId();

        return entityAddressCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{addressId=");
        sb.append(getAddressId());
        sb.append(", street=");
        sb.append(getStreet());
        sb.append(", interiorNumber=");
        sb.append(getInteriorNumber());
        sb.append(", exteriorNumber=");
        sb.append(getExteriorNumber());
        sb.append(", clientId=");
        sb.append(getClientId());
        sb.append(", municipalId=");
        sb.append(getMunicipalId());
        sb.append(", stateId=");
        sb.append(getStateId());
        sb.append(", suburbId=");
        sb.append(getSuburbId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityAddress");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>addressId</column-name><column-value><![CDATA[");
        sb.append(getAddressId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>street</column-name><column-value><![CDATA[");
        sb.append(getStreet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interiorNumber</column-name><column-value><![CDATA[");
        sb.append(getInteriorNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>exteriorNumber</column-name><column-value><![CDATA[");
        sb.append(getExteriorNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientId</column-name><column-value><![CDATA[");
        sb.append(getClientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>municipalId</column-name><column-value><![CDATA[");
        sb.append(getMunicipalId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stateId</column-name><column-value><![CDATA[");
        sb.append(getStateId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>suburbId</column-name><column-value><![CDATA[");
        sb.append(getSuburbId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}