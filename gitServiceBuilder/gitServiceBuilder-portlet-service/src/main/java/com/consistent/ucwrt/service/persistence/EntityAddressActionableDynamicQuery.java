package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityAddress;
import com.consistent.ucwrt.service.EntityAddressLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityAddressActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityAddressActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityAddressLocalServiceUtil.getService());
        setClass(EntityAddress.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("addressId");
    }
}
