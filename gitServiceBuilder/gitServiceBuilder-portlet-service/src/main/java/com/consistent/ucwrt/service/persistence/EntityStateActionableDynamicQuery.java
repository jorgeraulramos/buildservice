package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityState;
import com.consistent.ucwrt.service.EntityStateLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityStateActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityStateActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityStateLocalServiceUtil.getService());
        setClass(EntityState.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("stateId");
    }
}
