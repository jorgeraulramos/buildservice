package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySuburb;
import com.consistent.ucwrt.service.EntitySuburbLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntitySuburbActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntitySuburbActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntitySuburbLocalServiceUtil.getService());
        setClass(EntitySuburb.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("suburbId");
    }
}
