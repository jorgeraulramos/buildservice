package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityInventoryClasification;
import com.consistent.ucwrt.service.EntityInventoryClasificationLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityInventoryClasificationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityInventoryClasificationActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(EntityInventoryClasificationLocalServiceUtil.getService());
        setClass(EntityInventoryClasification.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("inventoryClasificationId");
    }
}
