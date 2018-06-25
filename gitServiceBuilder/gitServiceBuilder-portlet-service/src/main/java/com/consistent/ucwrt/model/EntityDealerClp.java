package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityDealerLocalServiceUtil;

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


public class EntityDealerClp extends BaseModelImpl<EntityDealer>
    implements EntityDealer {
    private String _dealerId;
    private String _dealerName;
    private String _guaranteed;
    private String _generalManagerName;
    private String _shareholderName;
    private String _mailShareholder;
    private String _mailGeneralManager;
    private String _businessBrandName;
    private String _zoneName;
    private BaseModel<?> _entityDealerRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityDealerClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityDealer.class;
    }

    @Override
    public String getModelClassName() {
        return EntityDealer.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _dealerId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setDealerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _dealerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("dealerId", getDealerId());
        attributes.put("dealerName", getDealerName());
        attributes.put("guaranteed", getGuaranteed());
        attributes.put("generalManagerName", getGeneralManagerName());
        attributes.put("shareholderName", getShareholderName());
        attributes.put("mailShareholder", getMailShareholder());
        attributes.put("mailGeneralManager", getMailGeneralManager());
        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("zoneName", getZoneName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String dealerName = (String) attributes.get("dealerName");

        if (dealerName != null) {
            setDealerName(dealerName);
        }

        String guaranteed = (String) attributes.get("guaranteed");

        if (guaranteed != null) {
            setGuaranteed(guaranteed);
        }

        String generalManagerName = (String) attributes.get(
                "generalManagerName");

        if (generalManagerName != null) {
            setGeneralManagerName(generalManagerName);
        }

        String shareholderName = (String) attributes.get("shareholderName");

        if (shareholderName != null) {
            setShareholderName(shareholderName);
        }

        String mailShareholder = (String) attributes.get("mailShareholder");

        if (mailShareholder != null) {
            setMailShareholder(mailShareholder);
        }

        String mailGeneralManager = (String) attributes.get(
                "mailGeneralManager");

        if (mailGeneralManager != null) {
            setMailGeneralManager(mailGeneralManager);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String zoneName = (String) attributes.get("zoneName");

        if (zoneName != null) {
            setZoneName(zoneName);
        }
    }

    @Override
    public String getDealerId() {
        return _dealerId;
    }

    @Override
    public void setDealerId(String dealerId) {
        _dealerId = dealerId;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setDealerId", String.class);

                method.invoke(_entityDealerRemoteModel, dealerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDealerName() {
        return _dealerName;
    }

    @Override
    public void setDealerName(String dealerName) {
        _dealerName = dealerName;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setDealerName", String.class);

                method.invoke(_entityDealerRemoteModel, dealerName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGuaranteed() {
        return _guaranteed;
    }

    @Override
    public void setGuaranteed(String guaranteed) {
        _guaranteed = guaranteed;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setGuaranteed", String.class);

                method.invoke(_entityDealerRemoteModel, guaranteed);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGeneralManagerName() {
        return _generalManagerName;
    }

    @Override
    public void setGeneralManagerName(String generalManagerName) {
        _generalManagerName = generalManagerName;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setGeneralManagerName",
                        String.class);

                method.invoke(_entityDealerRemoteModel, generalManagerName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getShareholderName() {
        return _shareholderName;
    }

    @Override
    public void setShareholderName(String shareholderName) {
        _shareholderName = shareholderName;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setShareholderName",
                        String.class);

                method.invoke(_entityDealerRemoteModel, shareholderName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMailShareholder() {
        return _mailShareholder;
    }

    @Override
    public void setMailShareholder(String mailShareholder) {
        _mailShareholder = mailShareholder;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setMailShareholder",
                        String.class);

                method.invoke(_entityDealerRemoteModel, mailShareholder);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMailGeneralManager() {
        return _mailGeneralManager;
    }

    @Override
    public void setMailGeneralManager(String mailGeneralManager) {
        _mailGeneralManager = mailGeneralManager;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setMailGeneralManager",
                        String.class);

                method.invoke(_entityDealerRemoteModel, mailGeneralManager);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    @Override
    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessBrandName",
                        String.class);

                method.invoke(_entityDealerRemoteModel, businessBrandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getZoneName() {
        return _zoneName;
    }

    @Override
    public void setZoneName(String zoneName) {
        _zoneName = zoneName;

        if (_entityDealerRemoteModel != null) {
            try {
                Class<?> clazz = _entityDealerRemoteModel.getClass();

                Method method = clazz.getMethod("setZoneName", String.class);

                method.invoke(_entityDealerRemoteModel, zoneName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityDealerRemoteModel() {
        return _entityDealerRemoteModel;
    }

    public void setEntityDealerRemoteModel(BaseModel<?> entityDealerRemoteModel) {
        _entityDealerRemoteModel = entityDealerRemoteModel;
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

        Class<?> remoteModelClass = _entityDealerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityDealerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityDealerLocalServiceUtil.addEntityDealer(this);
        } else {
            EntityDealerLocalServiceUtil.updateEntityDealer(this);
        }
    }

    @Override
    public EntityDealer toEscapedModel() {
        return (EntityDealer) ProxyUtil.newProxyInstance(EntityDealer.class.getClassLoader(),
            new Class[] { EntityDealer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityDealerClp clone = new EntityDealerClp();

        clone.setDealerId(getDealerId());
        clone.setDealerName(getDealerName());
        clone.setGuaranteed(getGuaranteed());
        clone.setGeneralManagerName(getGeneralManagerName());
        clone.setShareholderName(getShareholderName());
        clone.setMailShareholder(getMailShareholder());
        clone.setMailGeneralManager(getMailGeneralManager());
        clone.setBusinessBrandName(getBusinessBrandName());
        clone.setZoneName(getZoneName());

        return clone;
    }

    @Override
    public int compareTo(EntityDealer entityDealer) {
        String primaryKey = entityDealer.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityDealerClp)) {
            return false;
        }

        EntityDealerClp entityDealer = (EntityDealerClp) obj;

        String primaryKey = entityDealer.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{dealerId=");
        sb.append(getDealerId());
        sb.append(", dealerName=");
        sb.append(getDealerName());
        sb.append(", guaranteed=");
        sb.append(getGuaranteed());
        sb.append(", generalManagerName=");
        sb.append(getGeneralManagerName());
        sb.append(", shareholderName=");
        sb.append(getShareholderName());
        sb.append(", mailShareholder=");
        sb.append(getMailShareholder());
        sb.append(", mailGeneralManager=");
        sb.append(getMailGeneralManager());
        sb.append(", businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append(", zoneName=");
        sb.append(getZoneName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityDealer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>dealerId</column-name><column-value><![CDATA[");
        sb.append(getDealerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dealerName</column-name><column-value><![CDATA[");
        sb.append(getDealerName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>guaranteed</column-name><column-value><![CDATA[");
        sb.append(getGuaranteed());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>generalManagerName</column-name><column-value><![CDATA[");
        sb.append(getGeneralManagerName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>shareholderName</column-name><column-value><![CDATA[");
        sb.append(getShareholderName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mailShareholder</column-name><column-value><![CDATA[");
        sb.append(getMailShareholder());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mailGeneralManager</column-name><column-value><![CDATA[");
        sb.append(getMailGeneralManager());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>businessBrandName</column-name><column-value><![CDATA[");
        sb.append(getBusinessBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>zoneName</column-name><column-value><![CDATA[");
        sb.append(getZoneName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
