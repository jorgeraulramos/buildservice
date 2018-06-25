package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityVersionEquipment;
import com.consistent.ucwrt.service.EntityVersionEquipmentLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityVersionEquipmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityVersionEquipmentActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(EntityVersionEquipmentLocalServiceUtil.getService());
        setClass(EntityVersionEquipment.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.equipmentId");
    }
}
