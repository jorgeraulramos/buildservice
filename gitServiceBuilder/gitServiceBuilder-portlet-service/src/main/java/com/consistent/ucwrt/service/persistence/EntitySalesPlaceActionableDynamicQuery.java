package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySalesPlace;
import com.consistent.ucwrt.service.EntitySalesPlaceLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntitySalesPlaceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntitySalesPlaceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntitySalesPlaceLocalServiceUtil.getService());
        setClass(EntitySalesPlace.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("salesPlaceId");
    }
}
