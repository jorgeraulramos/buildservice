package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntitySaleLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EntitySaleClp extends BaseModelImpl<EntitySale>
    implements EntitySale {
    private int _saleId;
    private String _confirmBySale;
    private Date _deliveryDate;
    private String _assurantCertificate;
    private String _extendedWarranty;
    private double _realGrossProfit;
    private double _finalSalePrice;
    private int _clientId;
    private int _employeeId;
    private int _salesPlaceId;
    private int _prospectionId;
    private int _wayPayId;
    private BaseModel<?> _entitySaleRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntitySaleClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySale.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySale.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _saleId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSaleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _saleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("saleId", getSaleId());
        attributes.put("confirmBySale", getConfirmBySale());
        attributes.put("deliveryDate", getDeliveryDate());
        attributes.put("assurantCertificate", getAssurantCertificate());
        attributes.put("extendedWarranty", getExtendedWarranty());
        attributes.put("realGrossProfit", getRealGrossProfit());
        attributes.put("finalSalePrice", getFinalSalePrice());
        attributes.put("clientId", getClientId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("salesPlaceId", getSalesPlaceId());
        attributes.put("prospectionId", getProspectionId());
        attributes.put("wayPayId", getWayPayId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer saleId = (Integer) attributes.get("saleId");

        if (saleId != null) {
            setSaleId(saleId);
        }

        String confirmBySale = (String) attributes.get("confirmBySale");

        if (confirmBySale != null) {
            setConfirmBySale(confirmBySale);
        }

        Date deliveryDate = (Date) attributes.get("deliveryDate");

        if (deliveryDate != null) {
            setDeliveryDate(deliveryDate);
        }

        String assurantCertificate = (String) attributes.get(
                "assurantCertificate");

        if (assurantCertificate != null) {
            setAssurantCertificate(assurantCertificate);
        }

        String extendedWarranty = (String) attributes.get("extendedWarranty");

        if (extendedWarranty != null) {
            setExtendedWarranty(extendedWarranty);
        }

        Double realGrossProfit = (Double) attributes.get("realGrossProfit");

        if (realGrossProfit != null) {
            setRealGrossProfit(realGrossProfit);
        }

        Double finalSalePrice = (Double) attributes.get("finalSalePrice");

        if (finalSalePrice != null) {
            setFinalSalePrice(finalSalePrice);
        }

        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        Integer employeeId = (Integer) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Integer salesPlaceId = (Integer) attributes.get("salesPlaceId");

        if (salesPlaceId != null) {
            setSalesPlaceId(salesPlaceId);
        }

        Integer prospectionId = (Integer) attributes.get("prospectionId");

        if (prospectionId != null) {
            setProspectionId(prospectionId);
        }

        Integer wayPayId = (Integer) attributes.get("wayPayId");

        if (wayPayId != null) {
            setWayPayId(wayPayId);
        }
    }

    @Override
    public int getSaleId() {
        return _saleId;
    }

    @Override
    public void setSaleId(int saleId) {
        _saleId = saleId;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setSaleId", int.class);

                method.invoke(_entitySaleRemoteModel, saleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getConfirmBySale() {
        return _confirmBySale;
    }

    @Override
    public void setConfirmBySale(String confirmBySale) {
        _confirmBySale = confirmBySale;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setConfirmBySale", String.class);

                method.invoke(_entitySaleRemoteModel, confirmBySale);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDeliveryDate() {
        return _deliveryDate;
    }

    @Override
    public void setDeliveryDate(Date deliveryDate) {
        _deliveryDate = deliveryDate;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setDeliveryDate", Date.class);

                method.invoke(_entitySaleRemoteModel, deliveryDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAssurantCertificate() {
        return _assurantCertificate;
    }

    @Override
    public void setAssurantCertificate(String assurantCertificate) {
        _assurantCertificate = assurantCertificate;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setAssurantCertificate",
                        String.class);

                method.invoke(_entitySaleRemoteModel, assurantCertificate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getExtendedWarranty() {
        return _extendedWarranty;
    }

    @Override
    public void setExtendedWarranty(String extendedWarranty) {
        _extendedWarranty = extendedWarranty;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setExtendedWarranty",
                        String.class);

                method.invoke(_entitySaleRemoteModel, extendedWarranty);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getRealGrossProfit() {
        return _realGrossProfit;
    }

    @Override
    public void setRealGrossProfit(double realGrossProfit) {
        _realGrossProfit = realGrossProfit;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setRealGrossProfit",
                        double.class);

                method.invoke(_entitySaleRemoteModel, realGrossProfit);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getFinalSalePrice() {
        return _finalSalePrice;
    }

    @Override
    public void setFinalSalePrice(double finalSalePrice) {
        _finalSalePrice = finalSalePrice;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setFinalSalePrice",
                        double.class);

                method.invoke(_entitySaleRemoteModel, finalSalePrice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getClientId() {
        return _clientId;
    }

    @Override
    public void setClientId(int clientId) {
        _clientId = clientId;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setClientId", int.class);

                method.invoke(_entitySaleRemoteModel, clientId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", int.class);

                method.invoke(_entitySaleRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSalesPlaceId() {
        return _salesPlaceId;
    }

    @Override
    public void setSalesPlaceId(int salesPlaceId) {
        _salesPlaceId = salesPlaceId;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setSalesPlaceId", int.class);

                method.invoke(_entitySaleRemoteModel, salesPlaceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getProspectionId() {
        return _prospectionId;
    }

    @Override
    public void setProspectionId(int prospectionId) {
        _prospectionId = prospectionId;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setProspectionId", int.class);

                method.invoke(_entitySaleRemoteModel, prospectionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWayPayId() {
        return _wayPayId;
    }

    @Override
    public void setWayPayId(int wayPayId) {
        _wayPayId = wayPayId;

        if (_entitySaleRemoteModel != null) {
            try {
                Class<?> clazz = _entitySaleRemoteModel.getClass();

                Method method = clazz.getMethod("setWayPayId", int.class);

                method.invoke(_entitySaleRemoteModel, wayPayId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntitySaleRemoteModel() {
        return _entitySaleRemoteModel;
    }

    public void setEntitySaleRemoteModel(BaseModel<?> entitySaleRemoteModel) {
        _entitySaleRemoteModel = entitySaleRemoteModel;
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

        Class<?> remoteModelClass = _entitySaleRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entitySaleRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntitySaleLocalServiceUtil.addEntitySale(this);
        } else {
            EntitySaleLocalServiceUtil.updateEntitySale(this);
        }
    }

    @Override
    public EntitySale toEscapedModel() {
        return (EntitySale) ProxyUtil.newProxyInstance(EntitySale.class.getClassLoader(),
            new Class[] { EntitySale.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntitySaleClp clone = new EntitySaleClp();

        clone.setSaleId(getSaleId());
        clone.setConfirmBySale(getConfirmBySale());
        clone.setDeliveryDate(getDeliveryDate());
        clone.setAssurantCertificate(getAssurantCertificate());
        clone.setExtendedWarranty(getExtendedWarranty());
        clone.setRealGrossProfit(getRealGrossProfit());
        clone.setFinalSalePrice(getFinalSalePrice());
        clone.setClientId(getClientId());
        clone.setEmployeeId(getEmployeeId());
        clone.setSalesPlaceId(getSalesPlaceId());
        clone.setProspectionId(getProspectionId());
        clone.setWayPayId(getWayPayId());

        return clone;
    }

    @Override
    public int compareTo(EntitySale entitySale) {
        int primaryKey = entitySale.getPrimaryKey();

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

        if (!(obj instanceof EntitySaleClp)) {
            return false;
        }

        EntitySaleClp entitySale = (EntitySaleClp) obj;

        int primaryKey = entitySale.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
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
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{saleId=");
        sb.append(getSaleId());
        sb.append(", confirmBySale=");
        sb.append(getConfirmBySale());
        sb.append(", deliveryDate=");
        sb.append(getDeliveryDate());
        sb.append(", assurantCertificate=");
        sb.append(getAssurantCertificate());
        sb.append(", extendedWarranty=");
        sb.append(getExtendedWarranty());
        sb.append(", realGrossProfit=");
        sb.append(getRealGrossProfit());
        sb.append(", finalSalePrice=");
        sb.append(getFinalSalePrice());
        sb.append(", clientId=");
        sb.append(getClientId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
        sb.append(", salesPlaceId=");
        sb.append(getSalesPlaceId());
        sb.append(", prospectionId=");
        sb.append(getProspectionId());
        sb.append(", wayPayId=");
        sb.append(getWayPayId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntitySale");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>saleId</column-name><column-value><![CDATA[");
        sb.append(getSaleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>confirmBySale</column-name><column-value><![CDATA[");
        sb.append(getConfirmBySale());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deliveryDate</column-name><column-value><![CDATA[");
        sb.append(getDeliveryDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>assurantCertificate</column-name><column-value><![CDATA[");
        sb.append(getAssurantCertificate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>extendedWarranty</column-name><column-value><![CDATA[");
        sb.append(getExtendedWarranty());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>realGrossProfit</column-name><column-value><![CDATA[");
        sb.append(getRealGrossProfit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>finalSalePrice</column-name><column-value><![CDATA[");
        sb.append(getFinalSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientId</column-name><column-value><![CDATA[");
        sb.append(getClientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salesPlaceId</column-name><column-value><![CDATA[");
        sb.append(getSalesPlaceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>prospectionId</column-name><column-value><![CDATA[");
        sb.append(getProspectionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wayPayId</column-name><column-value><![CDATA[");
        sb.append(getWayPayId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
