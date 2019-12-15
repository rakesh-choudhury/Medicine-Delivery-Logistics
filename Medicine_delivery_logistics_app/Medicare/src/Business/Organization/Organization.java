/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author quanp
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {
        SupplierAdmin("Supplier Admin Organization"),
        RawMaterial("RawMaterial Organization"),
        Patient("Patient Organization"),
        ServiceAdmin("Service Admin Organization"),
        HealthCamps("HealthCamps Organization"),
        SupplierInventory("Supplier Inventory Organization"),
        DeliveryAdmin("Delivery Admin Organization"),
        Delivery("Delivery Organization"),
        PriceSupervisory ("PriceSupervisory Organization"),
        MedicineSupplier("MedicineSupplier Organization"),
        MedicineSupplierAdmin("MedicineSupplier Admin Organization"),
        FundingAdmin("Funding Admin Organization"),
        Banking("Banking Organization"),
        HospitalAdmin("Hospital Admin"),       
        Callcentre("Call Centre Organization"),
        Doctor("Doctor Organization"),
        
        MedicineInventory("MedicineInventory Organization"),
        Medicine("Medicine Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
