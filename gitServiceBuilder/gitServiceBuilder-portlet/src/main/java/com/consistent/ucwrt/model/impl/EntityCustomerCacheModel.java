package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityCustomer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityCustomer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityCustomer
 * @generated
 */
public class EntityCustomerCacheModel implements CacheModel<EntityCustomer>,
    Externalizable {
    public int clientId;
    public String firstName;
    public String lastName;
    public String secondLastName;
    public String email;
    public String rfc;
    public String cellPhone;
    public String legalPersonality;
    public String personType;
    public String phone;
    public long registrationDate;
    public String comments;
    public String dealerId;
    public String businessBrandName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{clientId=");
        sb.append(clientId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", secondLastName=");
        sb.append(secondLastName);
        sb.append(", email=");
        sb.append(email);
        sb.append(", rfc=");
        sb.append(rfc);
        sb.append(", cellPhone=");
        sb.append(cellPhone);
        sb.append(", legalPersonality=");
        sb.append(legalPersonality);
        sb.append(", personType=");
        sb.append(personType);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", registrationDate=");
        sb.append(registrationDate);
        sb.append(", comments=");
        sb.append(comments);
        sb.append(", dealerId=");
        sb.append(dealerId);
        sb.append(", businessBrandName=");
        sb.append(businessBrandName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityCustomer toEntityModel() {
        EntityCustomerImpl entityCustomerImpl = new EntityCustomerImpl();

        entityCustomerImpl.setClientId(clientId);

        if (firstName == null) {
            entityCustomerImpl.setFirstName(StringPool.BLANK);
        } else {
            entityCustomerImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            entityCustomerImpl.setLastName(StringPool.BLANK);
        } else {
            entityCustomerImpl.setLastName(lastName);
        }

        if (secondLastName == null) {
            entityCustomerImpl.setSecondLastName(StringPool.BLANK);
        } else {
            entityCustomerImpl.setSecondLastName(secondLastName);
        }

        if (email == null) {
            entityCustomerImpl.setEmail(StringPool.BLANK);
        } else {
            entityCustomerImpl.setEmail(email);
        }

        if (rfc == null) {
            entityCustomerImpl.setRfc(StringPool.BLANK);
        } else {
            entityCustomerImpl.setRfc(rfc);
        }

        if (cellPhone == null) {
            entityCustomerImpl.setCellPhone(StringPool.BLANK);
        } else {
            entityCustomerImpl.setCellPhone(cellPhone);
        }

        if (legalPersonality == null) {
            entityCustomerImpl.setLegalPersonality(StringPool.BLANK);
        } else {
            entityCustomerImpl.setLegalPersonality(legalPersonality);
        }

        if (personType == null) {
            entityCustomerImpl.setPersonType(StringPool.BLANK);
        } else {
            entityCustomerImpl.setPersonType(personType);
        }

        if (phone == null) {
            entityCustomerImpl.setPhone(StringPool.BLANK);
        } else {
            entityCustomerImpl.setPhone(phone);
        }

        if (registrationDate == Long.MIN_VALUE) {
            entityCustomerImpl.setRegistrationDate(null);
        } else {
            entityCustomerImpl.setRegistrationDate(new Date(registrationDate));
        }

        if (comments == null) {
            entityCustomerImpl.setComments(StringPool.BLANK);
        } else {
            entityCustomerImpl.setComments(comments);
        }

        if (dealerId == null) {
            entityCustomerImpl.setDealerId(StringPool.BLANK);
        } else {
            entityCustomerImpl.setDealerId(dealerId);
        }

        if (businessBrandName == null) {
            entityCustomerImpl.setBusinessBrandName(StringPool.BLANK);
        } else {
            entityCustomerImpl.setBusinessBrandName(businessBrandName);
        }

        entityCustomerImpl.resetOriginalValues();

        return entityCustomerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        clientId = objectInput.readInt();
        firstName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        secondLastName = objectInput.readUTF();
        email = objectInput.readUTF();
        rfc = objectInput.readUTF();
        cellPhone = objectInput.readUTF();
        legalPersonality = objectInput.readUTF();
        personType = objectInput.readUTF();
        phone = objectInput.readUTF();
        registrationDate = objectInput.readLong();
        comments = objectInput.readUTF();
        dealerId = objectInput.readUTF();
        businessBrandName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(clientId);

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (secondLastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(secondLastName);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (rfc == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rfc);
        }

        if (cellPhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cellPhone);
        }

        if (legalPersonality == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(legalPersonality);
        }

        if (personType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(personType);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        objectOutput.writeLong(registrationDate);

        if (comments == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(comments);
        }

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
    }
}
