package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityDealer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityDealer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealer
 * @generated
 */
public class EntityDealerCacheModel implements CacheModel<EntityDealer>,
    Externalizable {
    public String dealerId;
    public String dealerName;
    public String guaranteed;
    public String generalManagerName;
    public String shareholderName;
    public String mailShareholder;
    public String mailGeneralManager;
    public String businessBrandName;
    public String zoneName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{dealerId=");
        sb.append(dealerId);
        sb.append(", dealerName=");
        sb.append(dealerName);
        sb.append(", guaranteed=");
        sb.append(guaranteed);
        sb.append(", generalManagerName=");
        sb.append(generalManagerName);
        sb.append(", shareholderName=");
        sb.append(shareholderName);
        sb.append(", mailShareholder=");
        sb.append(mailShareholder);
        sb.append(", mailGeneralManager=");
        sb.append(mailGeneralManager);
        sb.append(", businessBrandName=");
        sb.append(businessBrandName);
        sb.append(", zoneName=");
        sb.append(zoneName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityDealer toEntityModel() {
        EntityDealerImpl entityDealerImpl = new EntityDealerImpl();

        if (dealerId == null) {
            entityDealerImpl.setDealerId(StringPool.BLANK);
        } else {
            entityDealerImpl.setDealerId(dealerId);
        }

        if (dealerName == null) {
            entityDealerImpl.setDealerName(StringPool.BLANK);
        } else {
            entityDealerImpl.setDealerName(dealerName);
        }

        if (guaranteed == null) {
            entityDealerImpl.setGuaranteed(StringPool.BLANK);
        } else {
            entityDealerImpl.setGuaranteed(guaranteed);
        }

        if (generalManagerName == null) {
            entityDealerImpl.setGeneralManagerName(StringPool.BLANK);
        } else {
            entityDealerImpl.setGeneralManagerName(generalManagerName);
        }

        if (shareholderName == null) {
            entityDealerImpl.setShareholderName(StringPool.BLANK);
        } else {
            entityDealerImpl.setShareholderName(shareholderName);
        }

        if (mailShareholder == null) {
            entityDealerImpl.setMailShareholder(StringPool.BLANK);
        } else {
            entityDealerImpl.setMailShareholder(mailShareholder);
        }

        if (mailGeneralManager == null) {
            entityDealerImpl.setMailGeneralManager(StringPool.BLANK);
        } else {
            entityDealerImpl.setMailGeneralManager(mailGeneralManager);
        }

        if (businessBrandName == null) {
            entityDealerImpl.setBusinessBrandName(StringPool.BLANK);
        } else {
            entityDealerImpl.setBusinessBrandName(businessBrandName);
        }

        if (zoneName == null) {
            entityDealerImpl.setZoneName(StringPool.BLANK);
        } else {
            entityDealerImpl.setZoneName(zoneName);
        }

        entityDealerImpl.resetOriginalValues();

        return entityDealerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        dealerId = objectInput.readUTF();
        dealerName = objectInput.readUTF();
        guaranteed = objectInput.readUTF();
        generalManagerName = objectInput.readUTF();
        shareholderName = objectInput.readUTF();
        mailShareholder = objectInput.readUTF();
        mailGeneralManager = objectInput.readUTF();
        businessBrandName = objectInput.readUTF();
        zoneName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (dealerId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dealerId);
        }

        if (dealerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dealerName);
        }

        if (guaranteed == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(guaranteed);
        }

        if (generalManagerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(generalManagerName);
        }

        if (shareholderName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(shareholderName);
        }

        if (mailShareholder == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mailShareholder);
        }

        if (mailGeneralManager == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mailGeneralManager);
        }

        if (businessBrandName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(businessBrandName);
        }

        if (zoneName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(zoneName);
        }
    }
}
