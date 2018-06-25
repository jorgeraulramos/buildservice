package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityMunicipality;
import com.consistent.ucwrt.service.EntityMunicipalityLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EntityMunicipalityActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityMunicipalityActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityMunicipalityLocalServiceUtil.getService());
        setClass(EntityMunicipality.class);

        setClassLoader(com.consistent.ucwrt.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("municipalId");
    }
}
