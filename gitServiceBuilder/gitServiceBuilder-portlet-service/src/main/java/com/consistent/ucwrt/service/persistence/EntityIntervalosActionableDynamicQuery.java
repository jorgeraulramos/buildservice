package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityIntervalos;
import com.consistent.ucwrt.service.EntityIntervalosLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityIntervalosActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityIntervalosActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityIntervalosLocalServiceUtil.getService());
        setClass(EntityIntervalos.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.startKilometer");
    }
}
