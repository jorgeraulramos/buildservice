package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityInventory;
import com.consistent.ucwrt.service.EntityInventoryLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityInventoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityInventoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityInventoryLocalServiceUtil.getService());
        setClass(EntityInventory.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.inventoryId");
    }
}
