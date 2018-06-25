package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityVersionAuto;
import com.consistent.ucwrt.service.EntityVersionAutoLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityVersionAutoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityVersionAutoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityVersionAutoLocalServiceUtil.getService());
        setClass(EntityVersionAuto.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.versionId");
    }
}
