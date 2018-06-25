package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEvent;
import com.consistent.ucwrt.service.EntityEventLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityEventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityEventLocalServiceUtil.getService());
        setClass(EntityEvent.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("eventId");
    }
}
