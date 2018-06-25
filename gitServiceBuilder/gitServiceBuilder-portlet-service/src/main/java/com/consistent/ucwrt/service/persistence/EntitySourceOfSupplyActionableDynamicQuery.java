package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySourceOfSupply;
import com.consistent.ucwrt.service.EntitySourceOfSupplyLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntitySourceOfSupplyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntitySourceOfSupplyActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(EntitySourceOfSupplyLocalServiceUtil.getService());
        setClass(EntitySourceOfSupply.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("sourceSupplyId");
    }
}
