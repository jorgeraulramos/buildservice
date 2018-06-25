package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityMonthlySalesGoal;
import com.consistent.ucwrt.service.EntityMonthlySalesGoalLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityMonthlySalesGoalActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityMonthlySalesGoalActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(EntityMonthlySalesGoalLocalServiceUtil.getService());
        setClass(EntityMonthlySalesGoal.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.year");
    }
}
