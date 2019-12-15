/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author quanp
 */
public abstract class Role {

    public enum RoleType {
        SupplierAdmin("SupplierAdmin"),
        Patients("Patients"),
        ServiceAdmin("ServiceAdmin"),
        OfferServiceRole("Offer Service Role"),
        DeliveryAdminRole("DeliveryAdminRole"),
        TransporterRole("TransporterRole"),
        PriceSupervisoryRole("PriceSupervisoryRole"),
        MedicinesupplierRole("MedicinesupplierRole"),
        HealthCampsAdmin("HealthCampsAdmin"),
        BankingRole("Banking Role"),
        DoctorRole("Doctor Role"),
        HospitalAdminRole("Hospital Admin Role"),
        MedicineInventoryRole("MedicineInventory"),
        SupplierInventoryRole("SupplierInventoryRole"),    
        MarketAdminRole("MedicineSupplierAdminRole"),
        PatientRole("PatientRole"),    
        PatientAdminRole("PatientAdminRole"),
        SystemAdminRole("SystemAdminRole");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
