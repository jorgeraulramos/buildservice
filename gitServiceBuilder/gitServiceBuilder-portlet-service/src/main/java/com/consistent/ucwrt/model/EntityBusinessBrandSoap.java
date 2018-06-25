package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityBusinessBrandServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityBusinessBrandServiceSoap
 * @generated
 */
public class EntityBusinessBrandSoap implements Serializable {
    private String _businessBrandName;
    private String _descriptionBusinessBrand;

    public EntityBusinessBrandSoap() {
    }

    public static EntityBusinessBrandSoap toSoapModel(EntityBusinessBrand model) {
        EntityBusinessBrandSoap soapModel = new EntityBusinessBrandSoap();

        soapModel.setBusinessBrandName(model.getBusinessBrandName());
        soapModel.setDescriptionBusinessBrand(model.getDescriptionBusinessBrand());

        return soapModel;
    }

    public static EntityBusinessBrandSoap[] toSoapModels(
        EntityBusinessBrand[] models) {
        EntityBusinessBrandSoap[] soapModels = new EntityBusinessBrandSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityBusinessBrandSoap[][] toSoapModels(
        EntityBusinessBrand[][] models) {
        EntityBusinessBrandSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityBusinessBrandSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityBusinessBrandSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityBusinessBrandSoap[] toSoapModels(
        List<EntityBusinessBrand> models) {
        List<EntityBusinessBrandSoap> soapModels = new ArrayList<EntityBusinessBrandSoap>(models.size());

        for (EntityBusinessBrand model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityBusinessBrandSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _businessBrandName;
    }

    public void setPrimaryKey(String pk) {
        setBusinessBrandName(pk);
    }

    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;
    }

    public String getDescriptionBusinessBrand() {
        return _descriptionBusinessBrand;
    }

    public void setDescriptionBusinessBrand(String descriptionBusinessBrand) {
        _descriptionBusinessBrand = descriptionBusinessBrand;
    }
}
