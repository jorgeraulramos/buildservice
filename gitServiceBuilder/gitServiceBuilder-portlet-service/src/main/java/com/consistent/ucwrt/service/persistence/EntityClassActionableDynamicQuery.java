package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityClass;
import com.consistent.ucwrt.service.EntityClassLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityClassActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityClassActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityClassLocalServiceUtil.getService());
        setClass(EntityClass.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("classId");
    }
}
