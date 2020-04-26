/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author quanp
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
         if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);
        
        } else if (type.getValue().equals(Type.HealthCamps.getValue())) {
            organization = new HealthCampsOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Delivery.getValue())) {
            organization = new DeliveryOrganization();
            organizationList.add(organization);
            
        } else if (type.getValue().equals(Type.PriceSupervisory.getValue())) {
            organization = new PriceSupervisoryOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.MedicineSupplier.getValue())) {
            organization = new MedicineSupplierOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Banking.getValue())) {
            organization = new BankingOrganization();
            organizationList.add(organization);
        
        } else if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
      
        } else if (type.getValue().equals(Type.MedicineInventory.getValue())) {
            organization = new MedicineInventoryOrganization();
            organizationList.add(organization);
        } 

        return organization;
    }
}
