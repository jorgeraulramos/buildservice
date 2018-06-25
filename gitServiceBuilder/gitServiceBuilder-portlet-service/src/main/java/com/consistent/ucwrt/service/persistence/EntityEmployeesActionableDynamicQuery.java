package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityEmployees;
import com.consistent.ucwrt.service.EntityEmployeesLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityEmployeesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityEmployeesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityEmployeesLocalServiceUtil.getService());
        setClass(EntityEmployees.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employeeId");
    }
}
