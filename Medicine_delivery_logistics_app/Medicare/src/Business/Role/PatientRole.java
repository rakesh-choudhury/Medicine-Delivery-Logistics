/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Patient.PatientAnalysisJPanel;

/**
 *
 * @author quanp
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        // return new FarmerWorkAreaJPanel(userProcessContainer, account, (PatientOrganization)organization, enterprise,business);
        return new PatientAnalysisJPanel(userProcessContainer, account, (PatientOrganization) organization, enterprise, business);
    }

    @Override
    public String toString() {
        return RoleType.PatientRole.getValue();
    }
}
