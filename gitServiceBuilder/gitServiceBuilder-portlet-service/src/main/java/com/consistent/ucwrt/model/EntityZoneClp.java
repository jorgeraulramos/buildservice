package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityZoneLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EntityZoneClp extends BaseModelImpl<EntityZone>
    implements EntityZone {
    private String _zoneName;
    private String _descriptionZone;
    private String _userZoneManager;
    private String _userSalesAreaManager;
    private String _userRegionalAreaManager;
    private BaseModel<?> _entityZoneRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityZoneClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityZone.class;
    }

    @Override
    public String getModelClassName() {
        return EntityZone.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _zoneName;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setZoneName(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _zoneName;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("zoneName", getZoneName());
        attributes.put("descriptionZone", getDescriptionZone());
        attributes.put("userZoneManager", getUserZoneManager());
        attributes.put("userSalesAreaManager", getUserSalesAreaManager());
        attributes.put("userRegionalAreaManager", getUserRegionalAreaManager());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String zoneName = (String) attributes.get("zoneName");

        if (zoneName != null) {
            setZoneName(zoneName);
        }

        String descriptionZone = (String) attributes.get("descriptionZone");

        if (descriptionZone != null) {
            setDescriptionZone(descriptionZone);
        }

        String userZoneManager = (String) attributes.get("userZoneManager");

        if (userZoneManager != null) {
            setUserZoneManager(userZoneManager);
        }

        String userSalesAreaManager = (String) attributes.get(
                "userSalesAreaManager");

        if (userSalesAreaManager != null) {
            setUserSalesAreaManager(userSalesAreaManager);
        }

        String userRegionalAreaManager = (String) attributes.get(
                "userRegionalAreaManager");

        if (userRegionalAreaManager != null) {
            setUserRegionalAreaManager(userRegionalAreaManager);
        }
    }

    @Override
    public String getZoneName() {
        return _zoneName;
    }

    @Override
    public void setZoneName(String zoneName) {
        _zoneName = zoneName;

        if (_entityZoneRemoteModel != null) {
            try {
                Class<?> clazz = _entityZoneRemoteModel.getClass();

                Method method = clazz.getMethod("setZoneName", String.class);

                method.invoke(_entityZoneRemoteModel, zoneName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptionZone() {
        return _descriptionZone;
    }

    @Override
    public void setDescriptionZone(String descriptionZone) {
        _descriptionZone = descriptionZone;

        if (_entityZoneRemoteModel != null) {
            try {
                Class<?> clazz = _entityZoneRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptionZone",
                        String.class);

                method.invoke(_entityZoneRemoteModel, descriptionZone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserZoneManager() {
        return _userZoneManager;
    }

    @Override
    public void setUserZoneManager(String userZoneManager) {
        _userZoneManager = userZoneManager;

        if (_entityZoneRemoteModel != null) {
            try {
                Class<?> clazz = _entityZoneRemoteModel.getClass();

                Method method = clazz.getMethod("setUserZoneManager",
                        String.class);

                method.invoke(_entityZoneRemoteModel, userZoneManager);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserSalesAreaManager() {
        return _userSalesAreaManager;
    }

    @Override
    public void setUserSalesAreaManager(String userSalesAreaManager) {
        _userSalesAreaManager = userSalesAreaManager;

        if (_entityZoneRemoteModel != null) {
            try {
                Class<?> clazz = _entityZoneRemoteModel.getClass();

                Method method = clazz.getMethod("setUserSalesAreaManager",
                        String.class);

                method.invoke(_entityZoneRemoteModel, userSalesAreaManager);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserRegionalAreaManager() {
        return _userRegionalAreaManager;
    }

    @Override
    public void setUserRegionalAreaManager(String userRegionalAreaManager) {
        _userRegionalAreaManager = userRegionalAreaManager;

        if (_entityZoneRemoteModel != null) {
            try {
                Class<?> clazz = _entityZoneRemoteModel.getClass();

                Method method = clazz.getMethod("setUserRegionalAreaManager",
                        String.class);

                method.invoke(_entityZoneRemoteModel, userRegionalAreaManager);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityZoneRemoteModel() {
        return _entityZoneRemoteModel;
    }

    public void setEntityZoneRemoteModel(BaseModel<?> entityZoneRemoteModel) {
        _entityZoneRemoteModel = entityZoneRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _entityZoneRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_entityZoneRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityZoneLocalServiceUtil.addEntityZone(this);
        } else {
            EntityZoneLocalServiceUtil.updateEntityZone(this);
        }
    }

    @Override
    public EntityZone toEscapedModel() {
        return (EntityZone) ProxyUtil.newProxyInstance(EntityZone.class.getClassLoader(),
            new Class[] { EntityZone.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityZoneClp clone = new EntityZoneClp();

        clone.setZoneName(getZoneName());
        clone.setDescriptionZone(getDescriptionZone());
        clone.setUserZoneManager(getUserZoneManager());
        clone.setUserSalesAreaManager(getUserSalesAreaManager());
        clone.setUserRegionalAreaManager(getUserRegionalAreaManager());

        return clone;
    }

    @Override
    public int compareTo(EntityZone entityZone) {
        String primaryKey = entityZone.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityZoneClp)) {
            return false;
        }

        EntityZoneClp entityZone = (EntityZoneClp) obj;

        String primaryKey = entityZone.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{zoneName=");
        sb.append(getZoneName());
        sb.append(", descriptionZone=");
        sb.append(getDescriptionZone());
        sb.append(", userZoneManager=");
        sb.append(getUserZoneManager());
        sb.append(", userSalesAreaManager=");
        sb.append(getUserSalesAreaManager());
        sb.append(", userRegionalAreaManager=");
        sb.append(getUserRegionalAreaManager());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityZone");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>zoneName</column-name><column-value><![CDATA[");
        sb.append(getZoneName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptionZone</column-name><column-value><![CDATA[");
        sb.append(getDescriptionZone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userZoneManager</column-name><column-value><![CDATA[");
        sb.append(getUserZoneManager());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userSalesAreaManager</column-name><column-value><![CDATA[");
        sb.append(getUserSalesAreaManager());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userRegionalAreaManager</column-name><column-value><![CDATA[");
        sb.append(getUserRegionalAreaManager());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
