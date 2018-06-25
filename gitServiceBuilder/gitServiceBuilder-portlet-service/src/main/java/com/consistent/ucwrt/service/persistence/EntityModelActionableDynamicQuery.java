package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityModel;
import com.consistent.ucwrt.service.EntityModelLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityModelActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityModelActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityModelLocalServiceUtil.getService());
        setClass(EntityModel.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.modelId");
    }
}
