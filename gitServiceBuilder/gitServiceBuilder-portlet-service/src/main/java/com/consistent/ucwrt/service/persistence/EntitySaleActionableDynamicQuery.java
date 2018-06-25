package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntitySale;
import com.consistent.ucwrt.service.EntitySaleLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntitySaleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntitySaleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntitySaleLocalServiceUtil.getService());
        setClass(EntitySale.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("saleId");
    }
}
