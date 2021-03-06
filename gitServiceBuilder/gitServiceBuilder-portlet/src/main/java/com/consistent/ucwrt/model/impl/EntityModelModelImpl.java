package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityModel;
import com.consistent.ucwrt.model.EntityModelModel;
import com.consistent.ucwrt.model.EntityModelSoap;
import com.consistent.ucwrt.service.persistence.EntityModelPK;

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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EntityModel service. Represents a row in the &quot;Model&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityModelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityModelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityModelImpl
 * @see com.consistent.ucwrt.model.EntityModel
 * @see com.consistent.ucwrt.model.EntityModelModel
 * @generated
 */
@JSON(strict = true)
public class EntityModelModelImpl extends BaseModelImpl<EntityModel>
    implements EntityModelModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity model model instance should use the {@link com.consistent.ucwrt.model.EntityModel} interface instead.
     */
    public static final String TABLE_NAME = "Model";
    public static final Object[][] TABLE_COLUMNS = {
            { "modelId", Types.INTEGER },
            { "brandId", Types.INTEGER },
            { "yearModel", Types.INTEGER },
            { "modelName", Types.VARCHAR },
            { "modelDescription", Types.VARCHAR },
            { "modelRegistrationDate", Types.TIMESTAMP },
            { "modelRegisterData", Types.VARCHAR },
            { "modelResponsibleUser", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Model (modelId INTEGER not null,brandId INTEGER not null,yearModel INTEGER not null,modelName VARCHAR(75) null,modelDescription VARCHAR(75) null,modelRegistrationDate DATE null,modelRegisterData VARCHAR(75) null,modelResponsibleUser VARCHAR(75) null,primary key (modelId, brandId, yearModel))";
    public static final String TABLE_SQL_DROP = "drop table Model";
    public static final String ORDER_BY_JPQL = " ORDER BY entityModel.id.modelId ASC, entityModel.id.brandId ASC, entityModel.id.yearModel ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Model.modelId ASC, Model.brandId ASC, Model.yearModel ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityModel"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityModel"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.consistent.ucwrt.model.EntityModel"),
            true);
    public static long BRANDID_COLUMN_BITMASK = 1L;
    public static long MODELNAME_COLUMN_BITMASK = 2L;
    public static long MODELID_COLUMN_BITMASK = 4L;
    public static long YEARMODEL_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityModel"));
    private static ClassLoader _classLoader = EntityModel.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityModel.class
        };
    private int _modelId;
    private int _brandId;
    private int _originalBrandId;
    private boolean _setOriginalBrandId;
    private int _yearModel;
    private String _modelName;
    private String _originalModelName;
    private String _modelDescription;
    private Date _modelRegistrationDate;
    private String _modelRegisterData;
    private String _modelResponsibleUser;
    private long _columnBitmask;
    private EntityModel _escapedModel;

    public EntityModelModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityModel toModel(EntityModelSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityModel model = new EntityModelImpl();

        model.setModelId(soapModel.getModelId());
        model.setBrandId(soapModel.getBrandId());
        model.setYearModel(soapModel.getYearModel());
        model.setModelName(soapModel.getModelName());
        model.setModelDescription(soapModel.getModelDescription());
        model.setModelRegistrationDate(soapModel.getModelRegistrationDate());
        model.setModelRegisterData(soapModel.getModelRegisterData());
        model.setModelResponsibleUser(soapModel.getModelResponsibleUser());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityModel> toModels(EntityModelSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityModel> models = new ArrayList<EntityModel>(soapModels.length);

        for (EntityModelSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public EntityModelPK getPrimaryKey() {
        return new EntityModelPK(_modelId, _brandId, _yearModel);
    }

    @Override
    public void setPrimaryKey(EntityModelPK primaryKey) {
        setModelId(primaryKey.modelId);
        setBrandId(primaryKey.brandId);
        setYearModel(primaryKey.yearModel);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityModelPK(_modelId, _brandId, _yearModel);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityModelPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EntityModel.class;
    }

    @Override
    public String getModelClassName() {
        return EntityModel.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());
        attributes.put("modelName", getModelName());
        attributes.put("modelDescription", getModelDescription());
        attributes.put("modelRegistrationDate", getModelRegistrationDate());
        attributes.put("modelRegisterData", getModelRegisterData());
        attributes.put("modelResponsibleUser", getModelResponsibleUser());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String modelDescription = (String) attributes.get("modelDescription");

        if (modelDescription != null) {
            setModelDescription(modelDescription);
        }

        Date modelRegistrationDate = (Date) attributes.get(
                "modelRegistrationDate");

        if (modelRegistrationDate != null) {
            setModelRegistrationDate(modelRegistrationDate);
        }

        String modelRegisterData = (String) attributes.get("modelRegisterData");

        if (modelRegisterData != null) {
            setModelRegisterData(modelRegisterData);
        }

        String modelResponsibleUser = (String) attributes.get(
                "modelResponsibleUser");

        if (modelResponsibleUser != null) {
            setModelResponsibleUser(modelResponsibleUser);
        }
    }

    @JSON
    @Override
    public int getModelId() {
        return _modelId;
    }

    @Override
    public void setModelId(int modelId) {
        _modelId = modelId;
    }

    @JSON
    @Override
    public int getBrandId() {
        return _brandId;
    }

    @Override
    public void setBrandId(int brandId) {
        _columnBitmask |= BRANDID_COLUMN_BITMASK;

        if (!_setOriginalBrandId) {
            _setOriginalBrandId = true;

            _originalBrandId = _brandId;
        }

        _brandId = brandId;
    }

    public int getOriginalBrandId() {
        return _originalBrandId;
    }

    @JSON
    @Override
    public int getYearModel() {
        return _yearModel;
    }

    @Override
    public void setYearModel(int yearModel) {
        _yearModel = yearModel;
    }

    @JSON
    @Override
    public String getModelName() {
        if (_modelName == null) {
            return StringPool.BLANK;
        } else {
            return _modelName;
        }
    }

    @Override
    public void setModelName(String modelName) {
        _columnBitmask |= MODELNAME_COLUMN_BITMASK;

        if (_originalModelName == null) {
            _originalModelName = _modelName;
        }

        _modelName = modelName;
    }

    public String getOriginalModelName() {
        return GetterUtil.getString(_originalModelName);
    }

    @JSON
    @Override
    public String getModelDescription() {
        if (_modelDescription == null) {
            return StringPool.BLANK;
        } else {
            return _modelDescription;
        }
    }

    @Override
    public void setModelDescription(String modelDescription) {
        _modelDescription = modelDescription;
    }

    @JSON
    @Override
    public Date getModelRegistrationDate() {
        return _modelRegistrationDate;
    }

    @Override
    public void setModelRegistrationDate(Date modelRegistrationDate) {
        _modelRegistrationDate = modelRegistrationDate;
    }

    @JSON
    @Override
    public String getModelRegisterData() {
        if (_modelRegisterData == null) {
            return StringPool.BLANK;
        } else {
            return _modelRegisterData;
        }
    }

    @Override
    public void setModelRegisterData(String modelRegisterData) {
        _modelRegisterData = modelRegisterData;
    }

    @JSON
    @Override
    public String getModelResponsibleUser() {
        if (_modelResponsibleUser == null) {
            return StringPool.BLANK;
        } else {
            return _modelResponsibleUser;
        }
    }

    @Override
    public void setModelResponsibleUser(String modelResponsibleUser) {
        _modelResponsibleUser = modelResponsibleUser;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public EntityModel toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityModel) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityModelImpl entityModelImpl = new EntityModelImpl();

        entityModelImpl.setModelId(getModelId());
        entityModelImpl.setBrandId(getBrandId());
        entityModelImpl.setYearModel(getYearModel());
        entityModelImpl.setModelName(getModelName());
        entityModelImpl.setModelDescription(getModelDescription());
        entityModelImpl.setModelRegistrationDate(getModelRegistrationDate());
        entityModelImpl.setModelRegisterData(getModelRegisterData());
        entityModelImpl.setModelResponsibleUser(getModelResponsibleUser());

        entityModelImpl.resetOriginalValues();

        return entityModelImpl;
    }

    @Override
    public int compareTo(EntityModel entityModel) {
        EntityModelPK primaryKey = entityModel.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityModel)) {
            return false;
        }

        EntityModel entityModel = (EntityModel) obj;

        EntityModelPK primaryKey = entityModel.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        EntityModelModelImpl entityModelModelImpl = this;

        entityModelModelImpl._originalBrandId = entityModelModelImpl._brandId;

        entityModelModelImpl._setOriginalBrandId = false;

        entityModelModelImpl._originalModelName = entityModelModelImpl._modelName;

        entityModelModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<EntityModel> toCacheModel() {
        EntityModelCacheModel entityModelCacheModel = new EntityModelCacheModel();

        entityModelCacheModel.modelId = getModelId();

        entityModelCacheModel.brandId = getBrandId();

        entityModelCacheModel.yearModel = getYearModel();

        entityModelCacheModel.modelName = getModelName();

        String modelName = entityModelCacheModel.modelName;

        if ((modelName != null) && (modelName.length() == 0)) {
            entityModelCacheModel.modelName = null;
        }

        entityModelCacheModel.modelDescription = getModelDescription();

        String modelDescription = entityModelCacheModel.modelDescription;

        if ((modelDescription != null) && (modelDescription.length() == 0)) {
            entityModelCacheModel.modelDescription = null;
        }

        Date modelRegistrationDate = getModelRegistrationDate();

        if (modelRegistrationDate != null) {
            entityModelCacheModel.modelRegistrationDate = modelRegistrationDate.getTime();
        } else {
            entityModelCacheModel.modelRegistrationDate = Long.MIN_VALUE;
        }

        entityModelCacheModel.modelRegisterData = getModelRegisterData();

        String modelRegisterData = entityModelCacheModel.modelRegisterData;

        if ((modelRegisterData != null) && (modelRegisterData.length() == 0)) {
            entityModelCacheModel.modelRegisterData = null;
        }

        entityModelCacheModel.modelResponsibleUser = getModelResponsibleUser();

        String modelResponsibleUser = entityModelCacheModel.modelResponsibleUser;

        if ((modelResponsibleUser != null) &&
                (modelResponsibleUser.length() == 0)) {
            entityModelCacheModel.modelResponsibleUser = null;
        }

        return entityModelCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{modelId=");
        sb.append(getModelId());
        sb.append(", brandId=");
        sb.append(getBrandId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append(", modelName=");
        sb.append(getModelName());
        sb.append(", modelDescription=");
        sb.append(getModelDescription());
        sb.append(", modelRegistrationDate=");
        sb.append(getModelRegistrationDate());
        sb.append(", modelRegisterData=");
        sb.append(getModelRegisterData());
        sb.append(", modelResponsibleUser=");
        sb.append(getModelResponsibleUser());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityModel");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>modelId</column-name><column-value><![CDATA[");
        sb.append(getModelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandId</column-name><column-value><![CDATA[");
        sb.append(getBrandId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelName</column-name><column-value><![CDATA[");
        sb.append(getModelName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelDescription</column-name><column-value><![CDATA[");
        sb.append(getModelDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getModelRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelRegisterData</column-name><column-value><![CDATA[");
        sb.append(getModelRegisterData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelResponsibleUser</column-name><column-value><![CDATA[");
        sb.append(getModelResponsibleUser());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
