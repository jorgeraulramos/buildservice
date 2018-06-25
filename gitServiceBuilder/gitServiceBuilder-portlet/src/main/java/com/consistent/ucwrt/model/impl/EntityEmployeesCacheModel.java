package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEmployees;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityEmployees in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployees
 * @generated
 */
public class EntityEmployeesCacheModel implements CacheModel<EntityEmployees>,
    Externalizable {
    public int employeeId;
    public String firstName;
    public String lastName;
    public String secondLastName;
    public String marketStall;
    public String department;
    public String cellPhone;
    public String phone;
    public String email;
    public String certified;
    public long certifiedDate;
    public String certificationNumber;
    public long registrationDate;
    public String status;
    public String comments;
    public String departmentId;
    public String employmentId;
    public String dealerId;
    public String businessBrandName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(39);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", secondLastName=");
        sb.append(secondLastName);
        sb.append(", marketStall=");
        sb.append(marketStall);
        sb.append(", department=");
        sb.append(department);
        sb.append(", cellPhone=");
        sb.append(cellPhone);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", email=");
        sb.append(email);
        sb.append(", certified=");
        sb.append(certified);
        sb.append(", certifiedDate=");
        sb.append(certifiedDate);
        sb.append(", certificationNumber=");
        sb.append(certificationNumber);
        sb.append(", registrationDate=");
        sb.append(registrationDate);
        sb.append(", status=");
        sb.append(status);
        sb.append(", comments=");
        sb.append(comments);
        sb.append(", departmentId=");
        sb.append(departmentId);
        sb.append(", employmentId=");
        sb.append(employmentId);
        sb.append(", dealerId=");
        sb.append(dealerId);
        sb.append(", businessBrandName=");
        sb.append(businessBrandName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityEmployees toEntityModel() {
        EntityEmployeesImpl entityEmployeesImpl = new EntityEmployeesImpl();

        entityEmployeesImpl.setEmployeeId(employeeId);

        if (firstName == null) {
            entityEmployeesImpl.setFirstName(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            entityEmployeesImpl.setLastName(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setLastName(lastName);
        }

        if (secondLastName == null) {
            entityEmployeesImpl.setSecondLastName(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setSecondLastName(secondLastName);
        }

        if (marketStall == null) {
            entityEmployeesImpl.setMarketStall(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setMarketStall(marketStall);
        }

        if (department == null) {
            entityEmployeesImpl.setDepartment(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setDepartment(department);
        }

        if (cellPhone == null) {
            entityEmployeesImpl.setCellPhone(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setCellPhone(cellPhone);
        }

        if (phone == null) {
            entityEmployeesImpl.setPhone(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setPhone(phone);
        }

        if (email == null) {
            entityEmployeesImpl.setEmail(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setEmail(email);
        }

        if (certified == null) {
            entityEmployeesImpl.setCertified(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setCertified(certified);
        }

        if (certifiedDate == Long.MIN_VALUE) {
            entityEmployeesImpl.setCertifiedDate(null);
        } else {
            entityEmployeesImpl.setCertifiedDate(new Date(certifiedDate));
        }

        if (certificationNumber == null) {
            entityEmployeesImpl.setCertificationNumber(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setCertificationNumber(certificationNumber);
        }

        if (registrationDate == Long.MIN_VALUE) {
            entityEmployeesImpl.setRegistrationDate(null);
        } else {
            entityEmployeesImpl.setRegistrationDate(new Date(registrationDate));
        }

        if (status == null) {
            entityEmployeesImpl.setStatus(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setStatus(status);
        }

        if (comments == null) {
            entityEmployeesImpl.setComments(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setComments(comments);
        }

        if (departmentId == null) {
            entityEmployeesImpl.setDepartmentId(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setDepartmentId(departmentId);
        }

        if (employmentId == null) {
            entityEmployeesImpl.setEmploymentId(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setEmploymentId(employmentId);
        }

        if (dealerId == null) {
            entityEmployeesImpl.setDealerId(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setDealerId(dealerId);
        }

        if (businessBrandName == null) {
            entityEmployeesImpl.setBusinessBrandName(StringPool.BLANK);
        } else {
            entityEmployeesImpl.setBusinessBrandName(businessBrandName);
        }

        entityEmployeesImpl.resetOriginalValues();

        return entityEmployeesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readInt();
        firstName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        secondLastName = objectInput.readUTF();
        marketStall = objectInput.readUTF();
        department = objectInput.readUTF();
        cellPhone = objectInput.readUTF();
        phone = objectInput.readUTF();
        email = objectInput.readUTF();
        certified = objectInput.readUTF();
        certifiedDate = objectInput.readLong();
        certificationNumber = objectInput.readUTF();
        registrationDate = objectInput.readLong();
        status = objectInput.readUTF();
        comments = objectInput.readUTF();
        departmentId = objectInput.readUTF();
        employmentId = objectInput.readUTF();
        dealerId = objectInput.readUTF();
        businessBrandName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(employeeId);

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

        if (marketStall == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(marketStall);
        }

        if (department == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(department);
        }

        if (cellPhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cellPhone);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (certified == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(certified);
        }

        objectOutput.writeLong(certifiedDate);

        if (certificationNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(certificationNumber);
        }

        objectOutput.writeLong(registrationDate);

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        if (comments == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(comments);
        }

        if (departmentId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(departmentId);
        }

        if (employmentId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employmentId);
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
