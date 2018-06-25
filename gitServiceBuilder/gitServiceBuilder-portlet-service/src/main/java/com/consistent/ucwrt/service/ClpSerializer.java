package com.consistent.ucwrt.service;

import com.consistent.ucwrt.model.EntityAddressClp;
import com.consistent.ucwrt.model.EntityBrandClp;
import com.consistent.ucwrt.model.EntityBusinessBrandClp;
import com.consistent.ucwrt.model.EntityClassClp;
import com.consistent.ucwrt.model.EntityCustomerClp;
import com.consistent.ucwrt.model.EntityDealerClp;
import com.consistent.ucwrt.model.EntityDepartmentClp;
import com.consistent.ucwrt.model.EntityEmployeesClp;
import com.consistent.ucwrt.model.EntityEmploymentClp;
import com.consistent.ucwrt.model.EntityEquipmentClp;
import com.consistent.ucwrt.model.EntityEventClp;
import com.consistent.ucwrt.model.EntityGParameterClp;
import com.consistent.ucwrt.model.EntityIntervalosClp;
import com.consistent.ucwrt.model.EntityInventoryClasificationClp;
import com.consistent.ucwrt.model.EntityInventoryClp;
import com.consistent.ucwrt.model.EntityModelClp;
import com.consistent.ucwrt.model.EntityMonthlySalesGoalClp;
import com.consistent.ucwrt.model.EntityMunicipalityClp;
import com.consistent.ucwrt.model.EntityProspectionClp;
import com.consistent.ucwrt.model.EntitySaleClp;
import com.consistent.ucwrt.model.EntitySalesPlaceClp;
import com.consistent.ucwrt.model.EntitySourceOfSupplyClp;
import com.consistent.ucwrt.model.EntityStateClp;
import com.consistent.ucwrt.model.EntityStatusClp;
import com.consistent.ucwrt.model.EntitySuburbClp;
import com.consistent.ucwrt.model.EntityVersionAutoClp;
import com.consistent.ucwrt.model.EntityVersionEquipmentClp;
import com.consistent.ucwrt.model.EntityWayToPayClp;
import com.consistent.ucwrt.model.EntityYearModelClassClp;
import com.consistent.ucwrt.model.EntityYearModelClp;
import com.consistent.ucwrt.model.EntityZoneClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "gitServiceBuilder-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "gitServiceBuilder-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "gitServiceBuilder-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(EntityAddressClp.class.getName())) {
            return translateInputEntityAddress(oldModel);
        }

        if (oldModelClassName.equals(EntityBrandClp.class.getName())) {
            return translateInputEntityBrand(oldModel);
        }

        if (oldModelClassName.equals(EntityBusinessBrandClp.class.getName())) {
            return translateInputEntityBusinessBrand(oldModel);
        }

        if (oldModelClassName.equals(EntityClassClp.class.getName())) {
            return translateInputEntityClass(oldModel);
        }

        if (oldModelClassName.equals(EntityCustomerClp.class.getName())) {
            return translateInputEntityCustomer(oldModel);
        }

        if (oldModelClassName.equals(EntityDealerClp.class.getName())) {
            return translateInputEntityDealer(oldModel);
        }

        if (oldModelClassName.equals(EntityDepartmentClp.class.getName())) {
            return translateInputEntityDepartment(oldModel);
        }

        if (oldModelClassName.equals(EntityEmployeesClp.class.getName())) {
            return translateInputEntityEmployees(oldModel);
        }

        if (oldModelClassName.equals(EntityEmploymentClp.class.getName())) {
            return translateInputEntityEmployment(oldModel);
        }

        if (oldModelClassName.equals(EntityEquipmentClp.class.getName())) {
            return translateInputEntityEquipment(oldModel);
        }

        if (oldModelClassName.equals(EntityEventClp.class.getName())) {
            return translateInputEntityEvent(oldModel);
        }

        if (oldModelClassName.equals(EntityGParameterClp.class.getName())) {
            return translateInputEntityGParameter(oldModel);
        }

        if (oldModelClassName.equals(EntityIntervalosClp.class.getName())) {
            return translateInputEntityIntervalos(oldModel);
        }

        if (oldModelClassName.equals(EntityInventoryClp.class.getName())) {
            return translateInputEntityInventory(oldModel);
        }

        if (oldModelClassName.equals(
                    EntityInventoryClasificationClp.class.getName())) {
            return translateInputEntityInventoryClasification(oldModel);
        }

        if (oldModelClassName.equals(EntityModelClp.class.getName())) {
            return translateInputEntityModel(oldModel);
        }

        if (oldModelClassName.equals(EntityMonthlySalesGoalClp.class.getName())) {
            return translateInputEntityMonthlySalesGoal(oldModel);
        }

        if (oldModelClassName.equals(EntityMunicipalityClp.class.getName())) {
            return translateInputEntityMunicipality(oldModel);
        }

        if (oldModelClassName.equals(EntityProspectionClp.class.getName())) {
            return translateInputEntityProspection(oldModel);
        }

        if (oldModelClassName.equals(EntitySaleClp.class.getName())) {
            return translateInputEntitySale(oldModel);
        }

        if (oldModelClassName.equals(EntitySalesPlaceClp.class.getName())) {
            return translateInputEntitySalesPlace(oldModel);
        }

        if (oldModelClassName.equals(EntitySourceOfSupplyClp.class.getName())) {
            return translateInputEntitySourceOfSupply(oldModel);
        }

        if (oldModelClassName.equals(EntityStateClp.class.getName())) {
            return translateInputEntityState(oldModel);
        }

        if (oldModelClassName.equals(EntityStatusClp.class.getName())) {
            return translateInputEntityStatus(oldModel);
        }

        if (oldModelClassName.equals(EntitySuburbClp.class.getName())) {
            return translateInputEntitySuburb(oldModel);
        }

        if (oldModelClassName.equals(EntityVersionAutoClp.class.getName())) {
            return translateInputEntityVersionAuto(oldModel);
        }

        if (oldModelClassName.equals(EntityVersionEquipmentClp.class.getName())) {
            return translateInputEntityVersionEquipment(oldModel);
        }

        if (oldModelClassName.equals(EntityWayToPayClp.class.getName())) {
            return translateInputEntityWayToPay(oldModel);
        }

        if (oldModelClassName.equals(EntityYearModelClp.class.getName())) {
            return translateInputEntityYearModel(oldModel);
        }

        if (oldModelClassName.equals(EntityYearModelClassClp.class.getName())) {
            return translateInputEntityYearModelClass(oldModel);
        }

        if (oldModelClassName.equals(EntityZoneClp.class.getName())) {
            return translateInputEntityZone(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputEntityAddress(BaseModel<?> oldModel) {
        EntityAddressClp oldClpModel = (EntityAddressClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityAddressRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityBrand(BaseModel<?> oldModel) {
        EntityBrandClp oldClpModel = (EntityBrandClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityBrandRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityBusinessBrand(
        BaseModel<?> oldModel) {
        EntityBusinessBrandClp oldClpModel = (EntityBusinessBrandClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityBusinessBrandRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityClass(BaseModel<?> oldModel) {
        EntityClassClp oldClpModel = (EntityClassClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityClassRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityCustomer(BaseModel<?> oldModel) {
        EntityCustomerClp oldClpModel = (EntityCustomerClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityCustomerRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityDealer(BaseModel<?> oldModel) {
        EntityDealerClp oldClpModel = (EntityDealerClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityDealerRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityDepartment(BaseModel<?> oldModel) {
        EntityDepartmentClp oldClpModel = (EntityDepartmentClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityDepartmentRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityEmployees(BaseModel<?> oldModel) {
        EntityEmployeesClp oldClpModel = (EntityEmployeesClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityEmployeesRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityEmployment(BaseModel<?> oldModel) {
        EntityEmploymentClp oldClpModel = (EntityEmploymentClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityEmploymentRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityEquipment(BaseModel<?> oldModel) {
        EntityEquipmentClp oldClpModel = (EntityEquipmentClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityEquipmentRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityEvent(BaseModel<?> oldModel) {
        EntityEventClp oldClpModel = (EntityEventClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityEventRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityGParameter(BaseModel<?> oldModel) {
        EntityGParameterClp oldClpModel = (EntityGParameterClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityGParameterRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityIntervalos(BaseModel<?> oldModel) {
        EntityIntervalosClp oldClpModel = (EntityIntervalosClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityIntervalosRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityInventory(BaseModel<?> oldModel) {
        EntityInventoryClp oldClpModel = (EntityInventoryClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityInventoryRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityInventoryClasification(
        BaseModel<?> oldModel) {
        EntityInventoryClasificationClp oldClpModel = (EntityInventoryClasificationClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityInventoryClasificationRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityModel(BaseModel<?> oldModel) {
        EntityModelClp oldClpModel = (EntityModelClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityModelRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityMonthlySalesGoal(
        BaseModel<?> oldModel) {
        EntityMonthlySalesGoalClp oldClpModel = (EntityMonthlySalesGoalClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityMonthlySalesGoalRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityMunicipality(BaseModel<?> oldModel) {
        EntityMunicipalityClp oldClpModel = (EntityMunicipalityClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityMunicipalityRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityProspection(BaseModel<?> oldModel) {
        EntityProspectionClp oldClpModel = (EntityProspectionClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityProspectionRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntitySale(BaseModel<?> oldModel) {
        EntitySaleClp oldClpModel = (EntitySaleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntitySaleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntitySalesPlace(BaseModel<?> oldModel) {
        EntitySalesPlaceClp oldClpModel = (EntitySalesPlaceClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntitySalesPlaceRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntitySourceOfSupply(
        BaseModel<?> oldModel) {
        EntitySourceOfSupplyClp oldClpModel = (EntitySourceOfSupplyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntitySourceOfSupplyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityState(BaseModel<?> oldModel) {
        EntityStateClp oldClpModel = (EntityStateClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityStateRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityStatus(BaseModel<?> oldModel) {
        EntityStatusClp oldClpModel = (EntityStatusClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityStatusRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntitySuburb(BaseModel<?> oldModel) {
        EntitySuburbClp oldClpModel = (EntitySuburbClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntitySuburbRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityVersionAuto(BaseModel<?> oldModel) {
        EntityVersionAutoClp oldClpModel = (EntityVersionAutoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityVersionAutoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityVersionEquipment(
        BaseModel<?> oldModel) {
        EntityVersionEquipmentClp oldClpModel = (EntityVersionEquipmentClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityVersionEquipmentRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityWayToPay(BaseModel<?> oldModel) {
        EntityWayToPayClp oldClpModel = (EntityWayToPayClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityWayToPayRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityYearModel(BaseModel<?> oldModel) {
        EntityYearModelClp oldClpModel = (EntityYearModelClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityYearModelRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityYearModelClass(
        BaseModel<?> oldModel) {
        EntityYearModelClassClp oldClpModel = (EntityYearModelClassClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityYearModelClassRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEntityZone(BaseModel<?> oldModel) {
        EntityZoneClp oldClpModel = (EntityZoneClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEntityZoneRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityAddressImpl")) {
            return translateOutputEntityAddress(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityBrandImpl")) {
            return translateOutputEntityBrand(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityBusinessBrandImpl")) {
            return translateOutputEntityBusinessBrand(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityClassImpl")) {
            return translateOutputEntityClass(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityCustomerImpl")) {
            return translateOutputEntityCustomer(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityDealerImpl")) {
            return translateOutputEntityDealer(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityDepartmentImpl")) {
            return translateOutputEntityDepartment(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityEmployeesImpl")) {
            return translateOutputEntityEmployees(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityEmploymentImpl")) {
            return translateOutputEntityEmployment(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityEquipmentImpl")) {
            return translateOutputEntityEquipment(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityEventImpl")) {
            return translateOutputEntityEvent(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityGParameterImpl")) {
            return translateOutputEntityGParameter(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityIntervalosImpl")) {
            return translateOutputEntityIntervalos(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityInventoryImpl")) {
            return translateOutputEntityInventory(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityInventoryClasificationImpl")) {
            return translateOutputEntityInventoryClasification(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityModelImpl")) {
            return translateOutputEntityModel(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalImpl")) {
            return translateOutputEntityMonthlySalesGoal(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityMunicipalityImpl")) {
            return translateOutputEntityMunicipality(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityProspectionImpl")) {
            return translateOutputEntityProspection(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntitySaleImpl")) {
            return translateOutputEntitySale(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntitySalesPlaceImpl")) {
            return translateOutputEntitySalesPlace(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntitySourceOfSupplyImpl")) {
            return translateOutputEntitySourceOfSupply(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityStateImpl")) {
            return translateOutputEntityState(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityStatusImpl")) {
            return translateOutputEntityStatus(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntitySuburbImpl")) {
            return translateOutputEntitySuburb(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityVersionAutoImpl")) {
            return translateOutputEntityVersionAuto(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityVersionEquipmentImpl")) {
            return translateOutputEntityVersionEquipment(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityWayToPayImpl")) {
            return translateOutputEntityWayToPay(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityYearModelImpl")) {
            return translateOutputEntityYearModel(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityYearModelClassImpl")) {
            return translateOutputEntityYearModelClass(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.consistent.ucwrt.model.impl.EntityZoneImpl")) {
            return translateOutputEntityZone(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityAddressException")) {
            return new com.consistent.ucwrt.NoSuchEntityAddressException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityBrandException")) {
            return new com.consistent.ucwrt.NoSuchEntityBrandException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityBusinessBrandException")) {
            return new com.consistent.ucwrt.NoSuchEntityBusinessBrandException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityClassException")) {
            return new com.consistent.ucwrt.NoSuchEntityClassException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityCustomerException")) {
            return new com.consistent.ucwrt.NoSuchEntityCustomerException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityDealerException")) {
            return new com.consistent.ucwrt.NoSuchEntityDealerException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityDepartmentException")) {
            return new com.consistent.ucwrt.NoSuchEntityDepartmentException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityEmployeesException")) {
            return new com.consistent.ucwrt.NoSuchEntityEmployeesException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityEmploymentException")) {
            return new com.consistent.ucwrt.NoSuchEntityEmploymentException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityEquipmentException")) {
            return new com.consistent.ucwrt.NoSuchEntityEquipmentException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityEventException")) {
            return new com.consistent.ucwrt.NoSuchEntityEventException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityGParameterException")) {
            return new com.consistent.ucwrt.NoSuchEntityGParameterException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityIntervalosException")) {
            return new com.consistent.ucwrt.NoSuchEntityIntervalosException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityInventoryException")) {
            return new com.consistent.ucwrt.NoSuchEntityInventoryException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityInventoryClasificationException")) {
            return new com.consistent.ucwrt.NoSuchEntityInventoryClasificationException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityModelException")) {
            return new com.consistent.ucwrt.NoSuchEntityModelException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException")) {
            return new com.consistent.ucwrt.NoSuchEntityMonthlySalesGoalException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityMunicipalityException")) {
            return new com.consistent.ucwrt.NoSuchEntityMunicipalityException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityProspectionException")) {
            return new com.consistent.ucwrt.NoSuchEntityProspectionException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntitySaleException")) {
            return new com.consistent.ucwrt.NoSuchEntitySaleException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntitySalesPlaceException")) {
            return new com.consistent.ucwrt.NoSuchEntitySalesPlaceException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException")) {
            return new com.consistent.ucwrt.NoSuchEntitySourceOfSupplyException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityStateException")) {
            return new com.consistent.ucwrt.NoSuchEntityStateException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityStatusException")) {
            return new com.consistent.ucwrt.NoSuchEntityStatusException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntitySuburbException")) {
            return new com.consistent.ucwrt.NoSuchEntitySuburbException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityVersionAutoException")) {
            return new com.consistent.ucwrt.NoSuchEntityVersionAutoException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityVersionEquipmentException")) {
            return new com.consistent.ucwrt.NoSuchEntityVersionEquipmentException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityWayToPayException")) {
            return new com.consistent.ucwrt.NoSuchEntityWayToPayException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityYearModelException")) {
            return new com.consistent.ucwrt.NoSuchEntityYearModelException();
        }

        if (className.equals(
                    "com.consistent.ucwrt.NoSuchEntityYearModelClassException")) {
            return new com.consistent.ucwrt.NoSuchEntityYearModelClassException();
        }

        if (className.equals("com.consistent.ucwrt.NoSuchEntityZoneException")) {
            return new com.consistent.ucwrt.NoSuchEntityZoneException();
        }

        return throwable;
    }

    public static Object translateOutputEntityAddress(BaseModel<?> oldModel) {
        EntityAddressClp newModel = new EntityAddressClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityAddressRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityBrand(BaseModel<?> oldModel) {
        EntityBrandClp newModel = new EntityBrandClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityBrandRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityBusinessBrand(
        BaseModel<?> oldModel) {
        EntityBusinessBrandClp newModel = new EntityBusinessBrandClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityBusinessBrandRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityClass(BaseModel<?> oldModel) {
        EntityClassClp newModel = new EntityClassClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityClassRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityCustomer(BaseModel<?> oldModel) {
        EntityCustomerClp newModel = new EntityCustomerClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityCustomerRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityDealer(BaseModel<?> oldModel) {
        EntityDealerClp newModel = new EntityDealerClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityDealerRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityDepartment(BaseModel<?> oldModel) {
        EntityDepartmentClp newModel = new EntityDepartmentClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityDepartmentRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityEmployees(BaseModel<?> oldModel) {
        EntityEmployeesClp newModel = new EntityEmployeesClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityEmployeesRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityEmployment(BaseModel<?> oldModel) {
        EntityEmploymentClp newModel = new EntityEmploymentClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityEmploymentRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityEquipment(BaseModel<?> oldModel) {
        EntityEquipmentClp newModel = new EntityEquipmentClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityEquipmentRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityEvent(BaseModel<?> oldModel) {
        EntityEventClp newModel = new EntityEventClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityEventRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityGParameter(BaseModel<?> oldModel) {
        EntityGParameterClp newModel = new EntityGParameterClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityGParameterRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityIntervalos(BaseModel<?> oldModel) {
        EntityIntervalosClp newModel = new EntityIntervalosClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityIntervalosRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityInventory(BaseModel<?> oldModel) {
        EntityInventoryClp newModel = new EntityInventoryClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityInventoryRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityInventoryClasification(
        BaseModel<?> oldModel) {
        EntityInventoryClasificationClp newModel = new EntityInventoryClasificationClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityInventoryClasificationRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityModel(BaseModel<?> oldModel) {
        EntityModelClp newModel = new EntityModelClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityModelRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityMonthlySalesGoal(
        BaseModel<?> oldModel) {
        EntityMonthlySalesGoalClp newModel = new EntityMonthlySalesGoalClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityMonthlySalesGoalRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityMunicipality(
        BaseModel<?> oldModel) {
        EntityMunicipalityClp newModel = new EntityMunicipalityClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityMunicipalityRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityProspection(BaseModel<?> oldModel) {
        EntityProspectionClp newModel = new EntityProspectionClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityProspectionRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntitySale(BaseModel<?> oldModel) {
        EntitySaleClp newModel = new EntitySaleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntitySaleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntitySalesPlace(BaseModel<?> oldModel) {
        EntitySalesPlaceClp newModel = new EntitySalesPlaceClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntitySalesPlaceRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntitySourceOfSupply(
        BaseModel<?> oldModel) {
        EntitySourceOfSupplyClp newModel = new EntitySourceOfSupplyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntitySourceOfSupplyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityState(BaseModel<?> oldModel) {
        EntityStateClp newModel = new EntityStateClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityStateRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityStatus(BaseModel<?> oldModel) {
        EntityStatusClp newModel = new EntityStatusClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityStatusRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntitySuburb(BaseModel<?> oldModel) {
        EntitySuburbClp newModel = new EntitySuburbClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntitySuburbRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityVersionAuto(BaseModel<?> oldModel) {
        EntityVersionAutoClp newModel = new EntityVersionAutoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityVersionAutoRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityVersionEquipment(
        BaseModel<?> oldModel) {
        EntityVersionEquipmentClp newModel = new EntityVersionEquipmentClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityVersionEquipmentRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityWayToPay(BaseModel<?> oldModel) {
        EntityWayToPayClp newModel = new EntityWayToPayClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityWayToPayRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityYearModel(BaseModel<?> oldModel) {
        EntityYearModelClp newModel = new EntityYearModelClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityYearModelRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityYearModelClass(
        BaseModel<?> oldModel) {
        EntityYearModelClassClp newModel = new EntityYearModelClassClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityYearModelClassRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEntityZone(BaseModel<?> oldModel) {
        EntityZoneClp newModel = new EntityZoneClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEntityZoneRemoteModel(oldModel);

        return newModel;
    }
}
