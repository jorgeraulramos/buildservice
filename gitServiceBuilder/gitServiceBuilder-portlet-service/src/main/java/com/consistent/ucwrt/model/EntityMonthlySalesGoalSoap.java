package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.consistent.ucwrt.service.http.EntityMonthlySalesGoalServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.consistent.ucwrt.service.http.EntityMonthlySalesGoalServiceSoap
 * @generated
 */
public class EntityMonthlySalesGoalSoap implements Serializable {
    private int _year;
    private String _dealerId;
    private String _businessBrandName;
    private String _descriptionMonthlyGoal;
    private int _objectiveAnnual;
    private double _januaryGoal;
    private double _februaryGoal;
    private double _marchGoal;
    private double _aprilGoal;
    private double _mayGoal;
    private double _juneGoal;
    private double _julyGoal;
    private double _augustGoal;
    private double _septemberGoal;
    private double _octoberGoal;
    private double _novemberGoal;
    private double _decemberGoal;

    public EntityMonthlySalesGoalSoap() {
    }

    public static EntityMonthlySalesGoalSoap toSoapModel(
        EntityMonthlySalesGoal model) {
        EntityMonthlySalesGoalSoap soapModel = new EntityMonthlySalesGoalSoap();

        soapModel.setYear(model.getYear());
        soapModel.setDealerId(model.getDealerId());
        soapModel.setBusinessBrandName(model.getBusinessBrandName());
        soapModel.setDescriptionMonthlyGoal(model.getDescriptionMonthlyGoal());
        soapModel.setObjectiveAnnual(model.getObjectiveAnnual());
        soapModel.setJanuaryGoal(model.getJanuaryGoal());
        soapModel.setFebruaryGoal(model.getFebruaryGoal());
        soapModel.setMarchGoal(model.getMarchGoal());
        soapModel.setAprilGoal(model.getAprilGoal());
        soapModel.setMayGoal(model.getMayGoal());
        soapModel.setJuneGoal(model.getJuneGoal());
        soapModel.setJulyGoal(model.getJulyGoal());
        soapModel.setAugustGoal(model.getAugustGoal());
        soapModel.setSeptemberGoal(model.getSeptemberGoal());
        soapModel.setOctoberGoal(model.getOctoberGoal());
        soapModel.setNovemberGoal(model.getNovemberGoal());
        soapModel.setDecemberGoal(model.getDecemberGoal());

        return soapModel;
    }

    public static EntityMonthlySalesGoalSoap[] toSoapModels(
        EntityMonthlySalesGoal[] models) {
        EntityMonthlySalesGoalSoap[] soapModels = new EntityMonthlySalesGoalSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityMonthlySalesGoalSoap[][] toSoapModels(
        EntityMonthlySalesGoal[][] models) {
        EntityMonthlySalesGoalSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityMonthlySalesGoalSoap[models.length][models[0].length];
        } else {
            soapModels = new EntityMonthlySalesGoalSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityMonthlySalesGoalSoap[] toSoapModels(
        List<EntityMonthlySalesGoal> models) {
        List<EntityMonthlySalesGoalSoap> soapModels = new ArrayList<EntityMonthlySalesGoalSoap>(models.size());

        for (EntityMonthlySalesGoal model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityMonthlySalesGoalSoap[soapModels.size()]);
    }

    public EntityMonthlySalesGoalPK getPrimaryKey() {
        return new EntityMonthlySalesGoalPK(_year, _dealerId, _businessBrandName);
    }

    public void setPrimaryKey(EntityMonthlySalesGoalPK pk) {
        setYear(pk.year);
        setDealerId(pk.dealerId);
        setBusinessBrandName(pk.businessBrandName);
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int year) {
        _year = year;
    }

    public String getDealerId() {
        return _dealerId;
    }

    public void setDealerId(String dealerId) {
        _dealerId = dealerId;
    }

    public String getBusinessBrandName() {
        return _businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;
    }

    public String getDescriptionMonthlyGoal() {
        return _descriptionMonthlyGoal;
    }

    public void setDescriptionMonthlyGoal(String descriptionMonthlyGoal) {
        _descriptionMonthlyGoal = descriptionMonthlyGoal;
    }

    public int getObjectiveAnnual() {
        return _objectiveAnnual;
    }

    public void setObjectiveAnnual(int objectiveAnnual) {
        _objectiveAnnual = objectiveAnnual;
    }

    public double getJanuaryGoal() {
        return _januaryGoal;
    }

    public void setJanuaryGoal(double januaryGoal) {
        _januaryGoal = januaryGoal;
    }

    public double getFebruaryGoal() {
        return _februaryGoal;
    }

    public void setFebruaryGoal(double februaryGoal) {
        _februaryGoal = februaryGoal;
    }

    public double getMarchGoal() {
        return _marchGoal;
    }

    public void setMarchGoal(double marchGoal) {
        _marchGoal = marchGoal;
    }

    public double getAprilGoal() {
        return _aprilGoal;
    }

    public void setAprilGoal(double aprilGoal) {
        _aprilGoal = aprilGoal;
    }

    public double getMayGoal() {
        return _mayGoal;
    }

    public void setMayGoal(double mayGoal) {
        _mayGoal = mayGoal;
    }

    public double getJuneGoal() {
        return _juneGoal;
    }

    public void setJuneGoal(double juneGoal) {
        _juneGoal = juneGoal;
    }

    public double getJulyGoal() {
        return _julyGoal;
    }

    public void setJulyGoal(double julyGoal) {
        _julyGoal = julyGoal;
    }

    public double getAugustGoal() {
        return _augustGoal;
    }

    public void setAugustGoal(double augustGoal) {
        _augustGoal = augustGoal;
    }

    public double getSeptemberGoal() {
        return _septemberGoal;
    }

    public void setSeptemberGoal(double septemberGoal) {
        _septemberGoal = septemberGoal;
    }

    public double getOctoberGoal() {
        return _octoberGoal;
    }

    public void setOctoberGoal(double octoberGoal) {
        _octoberGoal = octoberGoal;
    }

    public double getNovemberGoal() {
        return _novemberGoal;
    }

    public void setNovemberGoal(double novemberGoal) {
        _novemberGoal = novemberGoal;
    }

    public double getDecemberGoal() {
        return _decemberGoal;
    }

    public void setDecemberGoal(double decemberGoal) {
        _decemberGoal = decemberGoal;
    }
}
