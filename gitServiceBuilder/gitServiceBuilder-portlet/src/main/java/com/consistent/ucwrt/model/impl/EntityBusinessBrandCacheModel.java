package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityBusinessBrand;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityBusinessBrand in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EntityBusinessBrand
 * @generated
 */
public class EntityBusinessBrandCacheModel implements CacheModel<EntityBusinessBrand>,
    Externalizable {
    public String businessBrandName;
    public String descriptionBusinessBrand;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{businessBrandName=");
        sb.append(businessBrandName);
        sb.append(", descriptionBusinessBrand=");
        sb.append(descriptionBusinessBrand);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EntityBusinessBrand toEntityModel() {
        EntityBusinessBrandImpl entityBusinessBrandImpl = new EntityBusinessBrandImpl();

        if (businessBrandName == null) {
            entityBusinessBrandImpl.setBusinessBrandName(StringPool.BLANK);
        } else {
            entityBusinessBrandImpl.setBusinessBrandName(businessBrandName);
        }

        if (descriptionBusinessBrand == null) {
            entityBusinessBrandImpl.setDescriptionBusinessBrand(StringPool.BLANK);
        } else {
            entityBusinessBrandImpl.setDescriptionBusinessBrand(descriptionBusinessBrand);
        }

        entityBusinessBrandImpl.resetOriginalValues();

        return entityBusinessBrandImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        businessBrandName = objectInput.readUTF();
        descriptionBusinessBrand = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (businessBrandName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(businessBrandName);
        }

        if (descriptionBusinessBrand == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptionBusinessBrand);
        }
    }
}
