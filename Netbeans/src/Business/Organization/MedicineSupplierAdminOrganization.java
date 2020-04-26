/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MarketAdminRole;
import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import java.util.ArrayList;

/**
 *
 * @author quanp
 */
public class MedicineSupplierAdminOrganization extends Organization{

    public MedicineSupplierAdminOrganization() {
        super(Type.MedicineSupplierAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MarketAdminRole());
        return roles;
    }
     
    
}
