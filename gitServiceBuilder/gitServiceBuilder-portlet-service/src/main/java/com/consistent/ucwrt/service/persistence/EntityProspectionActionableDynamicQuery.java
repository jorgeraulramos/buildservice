package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityProspection;
import com.consistent.ucwrt.service.EntityProspectionLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityProspectionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityProspectionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityProspectionLocalServiceUtil.getService());
        setClass(EntityProspection.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("prospectionId");
    }
}
