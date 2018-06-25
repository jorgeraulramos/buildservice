package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityMonthlySalesGoal;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityMonthlySalesGoal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoal
 * @generated
 */
public class EntityMonthlySalesGoalCacheModel implements CacheModel<EntityMonthlySalesGoal>,
    Externalizable {
    public int year;
    public String dealerId;
    public String businessBrandName;
    public String descriptionMonthlyGoal;
    public int objectiveAnnual;
    public double januaryGoal;
    public double februaryGoal;
    public double marchGoal;
    public double aprilGoal;
    public double mayGoal;
    public double juneGoal;
    public double julyGoal;
    public double augustGoal;
    public double septemberGoal;
    public double octoberGoal;
    public double novemberGoal;
    public double decemberGoal;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{year=");
        sb.append(year);
        sb.append(", dealerId=");
        sb.append(dealerId);
        sb.append(", businessBrandName=");
        sb.append(businessBrandName);
        sb.append(", descriptionMonthlyGoal=");
        sb.append(descriptionMonthlyGoal);
        sb.append(", objectiveAnnual=");
        sb.append(objectiveAnnual);
        sb.append(", januaryGoal=");
        sb.append(januaryGoal);
        sb.append(", februaryGoal=");
        sb.append(februaryGoal);
        sb.append(", marchGoal=");
        sb.append(marchGoal);
        sb.append(", aprilGoal=");
        sb.append(aprilGoal);
        sb.append(", mayGoal=");
        sb.append(mayGoal);
        sb.append(", juneGoal=");
        sb.append(juneGoal);
        sb.append(", julyGoal=");
        sb.append(julyGoal);
        sb.append(", augustGoal=");
        sb.append(augustGoal);
        sb.append(", septemberGoal=");
        sb.append(septemberGoal);
        sb.append(", octoberGoal=");
        sb.append(octoberGoal);
        sb.append(", novemberGoal=");
        sb.append(novemberGoal);
        sb.append(", decemberGoal=");
        sb.append(decemberGoal);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityMonthlySalesGoal toEntityModel() {
        EntityMonthlySalesGoalImpl entityMonthlySalesGoalImpl = new EntityMonthlySalesGoalImpl();

        entityMonthlySalesGoalImpl.setYear(year);

        if (dealerId == null) {
            entityMonthlySalesGoalImpl.setDealerId(StringPool.BLANK);
        } else {
            entityMonthlySalesGoalImpl.setDealerId(dealerId);
        }

        if (businessBrandName == null) {
            entityMonthlySalesGoalImpl.setBusinessBrandName(StringPool.BLANK);
        } else {
            entityMonthlySalesGoalImpl.setBusinessBrandName(businessBrandName);
        }

        if (descriptionMonthlyGoal == null) {
            entityMonthlySalesGoalImpl.setDescriptionMonthlyGoal(StringPool.BLANK);
        } else {
            entityMonthlySalesGoalImpl.setDescriptionMonthlyGoal(descriptionMonthlyGoal);
        }

        entityMonthlySalesGoalImpl.setObjectiveAnnual(objectiveAnnual);
        entityMonthlySalesGoalImpl.setJanuaryGoal(januaryGoal);
        entityMonthlySalesGoalImpl.setFebruaryGoal(februaryGoal);
        entityMonthlySalesGoalImpl.setMarchGoal(marchGoal);
        entityMonthlySalesGoalImpl.setAprilGoal(aprilGoal);
        entityMonthlySalesGoalImpl.setMayGoal(mayGoal);
        entityMonthlySalesGoalImpl.setJuneGoal(juneGoal);
        entityMonthlySalesGoalImpl.setJulyGoal(julyGoal);
        entityMonthlySalesGoalImpl.setAugustGoal(augustGoal);
        entityMonthlySalesGoalImpl.setSeptemberGoal(septemberGoal);
        entityMonthlySalesGoalImpl.setOctoberGoal(octoberGoal);
        entityMonthlySalesGoalImpl.setNovemberGoal(novemberGoal);
        entityMonthlySalesGoalImpl.setDecemberGoal(decemberGoal);

        entityMonthlySalesGoalImpl.resetOriginalValues();

        return entityMonthlySalesGoalImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        year = objectInput.readInt();
        dealerId = objectInput.readUTF();
        businessBrandName = objectInput.readUTF();
        descriptionMonthlyGoal = objectInput.readUTF();
        objectiveAnnual = objectInput.readInt();
        januaryGoal = objectInput.readDouble();
        februaryGoal = objectInput.readDouble();
        marchGoal = objectInput.readDouble();
        aprilGoal = objectInput.readDouble();
        mayGoal = objectInput.readDouble();
        juneGoal = objectInput.readDouble();
        julyGoal = objectInput.readDouble();
        augustGoal = objectInput.readDouble();
        septemberGoal = objectInput.readDouble();
        octoberGoal = objectInput.readDouble();
        novemberGoal = objectInput.readDouble();
        decemberGoal = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(year);

        if (dealerId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dealerId);
        }

        if (businessBrandName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(businessBrandName);
        }

        if (descriptionMonthlyGoal == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptionMonthlyGoal);
        }

        objectOutput.writeInt(objectiveAnnual);
        objectOutput.writeDouble(januaryGoal);
        objectOutput.writeDouble(februaryGoal);
        objectOutput.writeDouble(marchGoal);
        objectOutput.writeDouble(aprilGoal);
        objectOutput.writeDouble(mayGoal);
        objectOutput.writeDouble(juneGoal);
        objectOutput.writeDouble(julyGoal);
        objectOutput.writeDouble(augustGoal);
        objectOutput.writeDouble(septemberGoal);
        objectOutput.writeDouble(octoberGoal);
        objectOutput.writeDouble(novemberGoal);
        objectOutput.writeDouble(decemberGoal);
    }
}
