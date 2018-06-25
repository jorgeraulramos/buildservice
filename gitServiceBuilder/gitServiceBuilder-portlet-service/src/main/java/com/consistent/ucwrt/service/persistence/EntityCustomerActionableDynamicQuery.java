package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityCustomer;
import com.consistent.ucwrt.service.EntityCustomerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityCustomerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityCustomerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityCustomerLocalServiceUtil.getService());
        setClass(EntityCustomer.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("clientId");
    }
}
