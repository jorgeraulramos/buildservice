package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEquipment;
import com.consistent.ucwrt.service.EntityEquipmentLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityEquipmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityEquipmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityEquipmentLocalServiceUtil.getService());
        setClass(EntityEquipment.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("equipmentId");
    }
}
