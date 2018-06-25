package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityYearModel;
import com.consistent.ucwrt.service.EntityYearModelLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityYearModelActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityYearModelActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityYearModelLocalServiceUtil.getService());
        setClass(EntityYearModel.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("yearModel");
    }
}
