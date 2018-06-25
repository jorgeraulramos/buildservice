package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityYearModelClass;
import com.consistent.ucwrt.service.EntityYearModelClassLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityYearModelClassActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityYearModelClassActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(EntityYearModelClassLocalServiceUtil.getService());
        setClass(EntityYearModelClass.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.classId");
    }
}
