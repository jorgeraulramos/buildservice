package com.consistent.ucwrt.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityDealerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityDealerServiceSoap
 * @generated
 */
public class EntityDealerSoap implements Serializable {
    private String _dealerId;
    private String _dealerName;
    private String _guaranteed;
    private String _generalManagerName;
    private String _shareholderName;
    private String _mailShareholder;
    private String _mailGeneralManager;
    private String _businessBrandName;
    private String _zoneName;

    public EntityDealerSoap() {
    }

    public static EntityDealerSoap toSoapModel(EntityDealer model) {
        EntityDealerSoap soapModel = new EntityDealerSoap();

        soapModel.setDealerId(model.getDealerId());
        soapModel.setDealerName(model.getDealerName());
        soapModel.setGuaranteed(model.getGuaranteed());
        soapModel.setGeneralManagerName(model.getGeneralManagerName());
        soapModel.setShareholderName(model.getShareholderName());
        soapModel.setMailShareholder(model.getMailShareholder());
        soapModel.setMailGeneralManager(model.getMailGeneralManager());
        soapModel.setBusinessBrandName(model.getBusinessBrandName());
        soapModel.setZoneName(model.getZoneName());

        return soapModel;
    }

    public static EntityDealerSoap[] toSoapModels(EntityDealer[] models) {
        EntityDealerSoap[] soapModels = new EntityDealerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityDealerSoap[][] toSoapModels(EntityDealer[][] models) {
        EntityDealerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityDealerSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityDealerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityDealerSoap[] toSoapModels(List<EntityDealer> models) {
        List<EntityDealerSoap> soapModels = new ArrayList<EntityDealerSoap>(models.size());

        for (EntityDealer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityDealerSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _dealerId;
    }

    public void setPrimaryKey(String pk) {
        setDealerId(pk);
    }

    public String getDealerId() {
        return _dealerId;
    }

    public void setDealerId(String dealerId) {
        _dealerId = dealerId;
    }

    public String getDealerName() {
        return _dealerName;
    }

    public void setDealerName(String dealerName) {
        _dealerName = dealerName;
    }

    public String getGuaranteed() {
        return _guaranteed;
    }

    public void setGuaranteed(String guaranteed) {
        _guaranteed = guaranteed;
    }

    public String getGeneralManagerName() {
        return _generalManagerName;
    }

    public void setGeneralManagerName(String generalManagerName) {
        _generalManagerName = generalManagerName;
    }

    public String getShareholderName() {
        return _shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        _shareholderName = shareholderName;
    }

    public String getMailShareholder() {
        return _mailShareholder;
    }

    public void setMailShareholder(String mailShareholder) {
        _mailShareholder = mailShareholder;
    }

    public String getMailGeneralManager() {
        return _mailGeneralManager;
    }

    public void setMailGeneralManager(String mailGeneralManager) {
        _mailGeneralManager = mailGeneralManager;
    }

    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;
    }

    public String getZoneName() {
        return _zoneName;
    }

    public void setZoneName(String zoneName) {
        _zoneName = zoneName;
    }
}
