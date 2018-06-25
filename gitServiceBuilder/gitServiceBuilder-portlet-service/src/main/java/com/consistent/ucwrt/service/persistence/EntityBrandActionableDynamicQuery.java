package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityBrand;
import com.consistent.ucwrt.service.EntityBrandLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityBrandActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityBrandActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityBrandLocalServiceUtil.getService());
        setClass(EntityBrand.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("brandId");
    }
}
