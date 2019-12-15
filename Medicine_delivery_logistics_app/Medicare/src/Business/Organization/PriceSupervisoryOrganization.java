/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.PriceSupervisoryRole;
import Business.Role.TransporterRole;
import java.util.ArrayList;

/**
 *
 * @author AMY
 */
public class PriceSupervisoryOrganization extends Organization {
    public PriceSupervisoryOrganization() {
         
        super(Organization.Type.PriceSupervisory.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PriceSupervisoryRole());
        return roles;
    }
}
