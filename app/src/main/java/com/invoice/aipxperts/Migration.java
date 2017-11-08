package com.invoice.aipxperts;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;
import io.realm.RealmSchema;

/**
 * Created by aipxperts-ubuntu-01 on 15/9/17.
 */
public class Migration implements RealmMigration {

    @Override
    public void migrate(final DynamicRealm realm, long oldVersion, long newVersion) {

        RealmSchema schema = realm.getSchema();

        if (oldVersion == 0) {

            schema.create("CompanyProfile")
                    .addField("UserId", String.class)
                    .addField("UserName", String.class)
                    .addField("UserEmailId", String.class)
                    .addField("UserPhoneNumber", String.class)
                    .addField("Address", String.class)
                    .addField("City", String.class)
                    .addField("State", String.class)
                    .addField("Pincode", String.class)
                    .addField("Country", String.class)
                    .addField("BankName", String.class)
                    .addField("A_CNo", String.class)
                    .addField("BranchName", String.class)
                    .addField("IFSCode", String.class)
                    .addField("CompanyPAN", String.class)
                    .addField("TaxNo", String.class)
                    .addField("GSTNo",String.class);

            schema.create("ClientProfile")
                    .addField("ClientId", String.class)
                    .addField("ClientName", String.class)
                    .addField("ClientEmailId", String.class)
                    .addField("ClientPhoneNumber", String.class)
                    .addField("Address", String.class)
                    .addField("City", String.class)
                    .addField("State", String.class)
                    .addField("Pincode", String.class)
                    .addField("Country",String.class);



            schema.create("ItemDetails")
                    .addField("ItemId", String.class)
                    .addField("ItemName", String.class)
                    .addField("ItemQuantity", String.class)
                    .addField("ItemPrice", String.class)
                    .addField("ItemCategory",Boolean.class)
                    .addField("Tax", String.class);


            schema.create("InVoice")
                    .addField("InvoiceId", String.class)
                    .addField("InvoiceDate", String.class)
                    .addField("AddCustomer", String.class)
                    .addField("AddItem", String.class)
                    .addField("Price",Boolean.class)
                    .addField("Tax", String.class)
                    .addField("Note",String.class)
                    .addField("Photo",String.class);

            oldVersion++;
        }



    }

    @Override
    public int hashCode() {
        return Migration.this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Migration);
    }
}