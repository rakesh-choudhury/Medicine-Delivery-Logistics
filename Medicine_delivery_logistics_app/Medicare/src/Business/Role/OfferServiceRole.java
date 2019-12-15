/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HealthCampProvider.CarrierServiceProviderJPanel;
import userinterface.Patient.PatientWorkAreaJPanel;

/**
 *
 * @author quanp
 */
public class OfferServiceRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new PatientWorkAreaJPanel(userProcessContainer, account, (PatientOrganization)organization, enterprise,business);
        return new CarrierServiceProviderJPanel(userProcessContainer, account, organization, enterprise, business);
        
    }
    
        @Override
    public String toString(){
        return RoleType.OfferServiceRole.getValue();
    }
     
    
}
