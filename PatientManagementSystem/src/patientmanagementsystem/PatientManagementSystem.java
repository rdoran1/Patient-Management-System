/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import GUI.GUI;
import Model.Patient;
import Model.User;

/**
 *
 * @author rdoran1
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI gui = new GUI();
        gui.setVisible(true);
        
        User example = new Patient("BILL", "SMITH");
        
        
    }
    
}
