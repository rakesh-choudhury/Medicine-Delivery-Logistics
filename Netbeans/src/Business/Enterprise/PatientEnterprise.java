/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rakesh
 */
public class PatientEnterprise extends Enterprise{

    public PatientEnterprise(String name) {
        super(name, EnterpriseType.Patient);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
