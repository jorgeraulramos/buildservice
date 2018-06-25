package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityMonthlySalesGoalLocalServiceUtil;
import com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK;

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


public class EntityMonthlySalesGoalClp extends BaseModelImpl<EntityMonthlySalesGoal>
    implements EntityMonthlySalesGoal {
    private int _year;
    private String _dealerId;
    private String _businessBrandName;
    private String _descriptionMonthlyGoal;
    private int _objectiveAnnual;
    private double _januaryGoal;
    private double _februaryGoal;
    private double _marchGoal;
    private double _aprilGoal;
    private double _mayGoal;
    private double _juneGoal;
    private double _julyGoal;
    private double _augustGoal;
    private double _septemberGoal;
    private double _octoberGoal;
    private double _novemberGoal;
    private double _decemberGoal;
    private BaseModel<?> _entityMonthlySalesGoalRemoteModel;
    private Class<?> _clpSerializerClass = com.consistent.ucwrt.service.ClpSerializer.class;

    public EntityMonthlySalesGoalClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityMonthlySalesGoal.class;
    }

    @Override
    public String getModelClassName() {
        return EntityMonthlySalesGoal.class.getName();
    }

    @Override
    public EntityMonthlySalesGoalPK getPrimaryKey() {
        return new EntityMonthlySalesGoalPK(_year, _dealerId, _businessBrandName);
    }

    @Override
    public void setPrimaryKey(EntityMonthlySalesGoalPK primaryKey) {
        setYear(primaryKey.year);
        setDealerId(primaryKey.dealerId);
        setBusinessBrandName(primaryKey.businessBrandName);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityMonthlySalesGoalPK(_year, _dealerId, _businessBrandName);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityMonthlySalesGoalPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("year", getYear());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("descriptionMonthlyGoal", getDescriptionMonthlyGoal());
        attributes.put("objectiveAnnual", getObjectiveAnnual());
        attributes.put("januaryGoal", getJanuaryGoal());
        attributes.put("februaryGoal", getFebruaryGoal());
        attributes.put("marchGoal", getMarchGoal());
        attributes.put("aprilGoal", getAprilGoal());
        attributes.put("mayGoal", getMayGoal());
        attributes.put("juneGoal", getJuneGoal());
        attributes.put("julyGoal", getJulyGoal());
        attributes.put("augustGoal", getAugustGoal());
        attributes.put("septemberGoal", getSeptemberGoal());
        attributes.put("octoberGoal", getOctoberGoal());
        attributes.put("novemberGoal", getNovemberGoal());
        attributes.put("decemberGoal", getDecemberGoal());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer year = (Integer) attributes.get("year");

        if (year != null) {
            setYear(year);
        }

        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String descriptionMonthlyGoal = (String) attributes.get(
                "descriptionMonthlyGoal");

        if (descriptionMonthlyGoal != null) {
            setDescriptionMonthlyGoal(descriptionMonthlyGoal);
        }

        Integer objectiveAnnual = (Integer) attributes.get("objectiveAnnual");

        if (objectiveAnnual != null) {
            setObjectiveAnnual(objectiveAnnual);
        }

        Double januaryGoal = (Double) attributes.get("januaryGoal");

        if (januaryGoal != null) {
            setJanuaryGoal(januaryGoal);
        }

        Double februaryGoal = (Double) attributes.get("februaryGoal");

        if (februaryGoal != null) {
            setFebruaryGoal(februaryGoal);
        }

        Double marchGoal = (Double) attributes.get("marchGoal");

        if (marchGoal != null) {
            setMarchGoal(marchGoal);
        }

        Double aprilGoal = (Double) attributes.get("aprilGoal");

        if (aprilGoal != null) {
            setAprilGoal(aprilGoal);
        }

        Double mayGoal = (Double) attributes.get("mayGoal");

        if (mayGoal != null) {
            setMayGoal(mayGoal);
        }

        Double juneGoal = (Double) attributes.get("juneGoal");

        if (juneGoal != null) {
            setJuneGoal(juneGoal);
        }

        Double julyGoal = (Double) attributes.get("julyGoal");

        if (julyGoal != null) {
            setJulyGoal(julyGoal);
        }

        Double augustGoal = (Double) attributes.get("augustGoal");

        if (augustGoal != null) {
            setAugustGoal(augustGoal);
        }

        Double septemberGoal = (Double) attributes.get("septemberGoal");

        if (septemberGoal != null) {
            setSeptemberGoal(septemberGoal);
        }

        Double octoberGoal = (Double) attributes.get("octoberGoal");

        if (octoberGoal != null) {
            setOctoberGoal(octoberGoal);
        }

        Double novemberGoal = (Double) attributes.get("novemberGoal");

        if (novemberGoal != null) {
            setNovemberGoal(novemberGoal);
        }

        Double decemberGoal = (Double) attributes.get("decemberGoal");

        if (decemberGoal != null) {
            setDecemberGoal(decemberGoal);
        }
    }

    @Override
    public int getYear() {
        return _year;
    }

    @Override
    public void setYear(int year) {
        _year = year;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setYear", int.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, year);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDealerId() {
        return _dealerId;
    }

    @Override
    public void setDealerId(String dealerId) {
        _dealerId = dealerId;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setDealerId", String.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, dealerId);
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

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setBusinessBrandName",
                        String.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel,
                    businessBrandName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptionMonthlyGoal() {
        return _descriptionMonthlyGoal;
    }

    @Override
    public void setDescriptionMonthlyGoal(String descriptionMonthlyGoal) {
        _descriptionMonthlyGoal = descriptionMonthlyGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptionMonthlyGoal",
                        String.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel,
                    descriptionMonthlyGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getObjectiveAnnual() {
        return _objectiveAnnual;
    }

    @Override
    public void setObjectiveAnnual(int objectiveAnnual) {
        _objectiveAnnual = objectiveAnnual;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setObjectiveAnnual", int.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel,
                    objectiveAnnual);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getJanuaryGoal() {
        return _januaryGoal;
    }

    @Override
    public void setJanuaryGoal(double januaryGoal) {
        _januaryGoal = januaryGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setJanuaryGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, januaryGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getFebruaryGoal() {
        return _februaryGoal;
    }

    @Override
    public void setFebruaryGoal(double februaryGoal) {
        _februaryGoal = februaryGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setFebruaryGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, februaryGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getMarchGoal() {
        return _marchGoal;
    }

    @Override
    public void setMarchGoal(double marchGoal) {
        _marchGoal = marchGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setMarchGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, marchGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getAprilGoal() {
        return _aprilGoal;
    }

    @Override
    public void setAprilGoal(double aprilGoal) {
        _aprilGoal = aprilGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setAprilGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, aprilGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getMayGoal() {
        return _mayGoal;
    }

    @Override
    public void setMayGoal(double mayGoal) {
        _mayGoal = mayGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setMayGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, mayGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getJuneGoal() {
        return _juneGoal;
    }

    @Override
    public void setJuneGoal(double juneGoal) {
        _juneGoal = juneGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setJuneGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, juneGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getJulyGoal() {
        return _julyGoal;
    }

    @Override
    public void setJulyGoal(double julyGoal) {
        _julyGoal = julyGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setJulyGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, julyGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getAugustGoal() {
        return _augustGoal;
    }

    @Override
    public void setAugustGoal(double augustGoal) {
        _augustGoal = augustGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setAugustGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, augustGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getSeptemberGoal() {
        return _septemberGoal;
    }

    @Override
    public void setSeptemberGoal(double septemberGoal) {
        _septemberGoal = septemberGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setSeptemberGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, septemberGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getOctoberGoal() {
        return _octoberGoal;
    }

    @Override
    public void setOctoberGoal(double octoberGoal) {
        _octoberGoal = octoberGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setOctoberGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, octoberGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getNovemberGoal() {
        return _novemberGoal;
    }

    @Override
    public void setNovemberGoal(double novemberGoal) {
        _novemberGoal = novemberGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setNovemberGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, novemberGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getDecemberGoal() {
        return _decemberGoal;
    }

    @Override
    public void setDecemberGoal(double decemberGoal) {
        _decemberGoal = decemberGoal;

        if (_entityMonthlySalesGoalRemoteModel != null) {
            try {
                Class<?> clazz = _entityMonthlySalesGoalRemoteModel.getClass();

                Method method = clazz.getMethod("setDecemberGoal", double.class);

                method.invoke(_entityMonthlySalesGoalRemoteModel, decemberGoal);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityMonthlySalesGoalRemoteModel() {
        return _entityMonthlySalesGoalRemoteModel;
    }

    public void setEntityMonthlySalesGoalRemoteModel(
        BaseModel<?> entityMonthlySalesGoalRemoteModel) {
        _entityMonthlySalesGoalRemoteModel = entityMonthlySalesGoalRemoteModel;
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

        Class<?> remoteModelClass = _entityMonthlySalesGoalRemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityMonthlySalesGoalRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityMonthlySalesGoalLocalServiceUtil.addEntityMonthlySalesGoal(this);
        } else {
            EntityMonthlySalesGoalLocalServiceUtil.updateEntityMonthlySalesGoal(this);
        }
    }

    @Override
    public EntityMonthlySalesGoal toEscapedModel() {
        return (EntityMonthlySalesGoal) ProxyUtil.newProxyInstance(EntityMonthlySalesGoal.class.getClassLoader(),
            new Class[] { EntityMonthlySalesGoal.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityMonthlySalesGoalClp clone = new EntityMonthlySalesGoalClp();

        clone.setYear(getYear());
        clone.setDealerId(getDealerId());
        clone.setBusinessBrandName(getBusinessBrandName());
        clone.setDescriptionMonthlyGoal(getDescriptionMonthlyGoal());
        clone.setObjectiveAnnual(getObjectiveAnnual());
        clone.setJanuaryGoal(getJanuaryGoal());
        clone.setFebruaryGoal(getFebruaryGoal());
        clone.setMarchGoal(getMarchGoal());
        clone.setAprilGoal(getAprilGoal());
        clone.setMayGoal(getMayGoal());
        clone.setJuneGoal(getJuneGoal());
        clone.setJulyGoal(getJulyGoal());
        clone.setAugustGoal(getAugustGoal());
        clone.setSeptemberGoal(getSeptemberGoal());
        clone.setOctoberGoal(getOctoberGoal());
        clone.setNovemberGoal(getNovemberGoal());
        clone.setDecemberGoal(getDecemberGoal());

        return clone;
    }

    @Override
    public int compareTo(EntityMonthlySalesGoal entityMonthlySalesGoal) {
        EntityMonthlySalesGoalPK primaryKey = entityMonthlySalesGoal.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityMonthlySalesGoalClp)) {
            return false;
        }

        EntityMonthlySalesGoalClp entityMonthlySalesGoal = (EntityMonthlySalesGoalClp) obj;

        EntityMonthlySalesGoalPK primaryKey = entityMonthlySalesGoal.getPrimaryKey();

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
        StringBundler sb = new StringBundler(35);

        sb.append("{year=");
        sb.append(getYear());
        sb.append(", dealerId=");
        sb.append(getDealerId());
        sb.append(", businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append(", descriptionMonthlyGoal=");
        sb.append(getDescriptionMonthlyGoal());
        sb.append(", objectiveAnnual=");
        sb.append(getObjectiveAnnual());
        sb.append(", januaryGoal=");
        sb.append(getJanuaryGoal());
        sb.append(", februaryGoal=");
        sb.append(getFebruaryGoal());
        sb.append(", marchGoal=");
        sb.append(getMarchGoal());
        sb.append(", aprilGoal=");
        sb.append(getAprilGoal());
        sb.append(", mayGoal=");
        sb.append(getMayGoal());
        sb.append(", juneGoal=");
        sb.append(getJuneGoal());
        sb.append(", julyGoal=");
        sb.append(getJulyGoal());
        sb.append(", augustGoal=");
        sb.append(getAugustGoal());
        sb.append(", septemberGoal=");
        sb.append(getSeptemberGoal());
        sb.append(", octoberGoal=");
        sb.append(getOctoberGoal());
        sb.append(", novemberGoal=");
        sb.append(getNovemberGoal());
        sb.append(", decemberGoal=");
        sb.append(getDecemberGoal());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityMonthlySalesGoal");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>year</column-name><column-value><![CDATA[");
        sb.append(getYear());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dealerId</column-name><column-value><![CDATA[");
        sb.append(getDealerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>businessBrandName</column-name><column-value><![CDATA[");
        sb.append(getBusinessBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptionMonthlyGoal</column-name><column-value><![CDATA[");
        sb.append(getDescriptionMonthlyGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>objectiveAnnual</column-name><column-value><![CDATA[");
        sb.append(getObjectiveAnnual());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>januaryGoal</column-name><column-value><![CDATA[");
        sb.append(getJanuaryGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>februaryGoal</column-name><column-value><![CDATA[");
        sb.append(getFebruaryGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>marchGoal</column-name><column-value><![CDATA[");
        sb.append(getMarchGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aprilGoal</column-name><column-value><![CDATA[");
        sb.append(getAprilGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mayGoal</column-name><column-value><![CDATA[");
        sb.append(getMayGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>juneGoal</column-name><column-value><![CDATA[");
        sb.append(getJuneGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>julyGoal</column-name><column-value><![CDATA[");
        sb.append(getJulyGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>augustGoal</column-name><column-value><![CDATA[");
        sb.append(getAugustGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>septemberGoal</column-name><column-value><![CDATA[");
        sb.append(getSeptemberGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>octoberGoal</column-name><column-value><![CDATA[");
        sb.append(getOctoberGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>novemberGoal</column-name><column-value><![CDATA[");
        sb.append(getNovemberGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>decemberGoal</column-name><column-value><![CDATA[");
        sb.append(getDecemberGoal());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
