package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityWayToPay;
import com.consistent.ucwrt.service.EntityWayToPayLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityWayToPayActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityWayToPayActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityWayToPayLocalServiceUtil.getService());
        setClass(EntityWayToPay.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("wayPayId");
    }
}
