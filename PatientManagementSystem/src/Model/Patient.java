/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rdoran1
 */
public class Patient extends User{

    public Patient(String Name, String Surname, String Sex, String Age, String Address, String Password) {
        super(Name, Surname, Sex, Age, Address, Password);
    }
    
}
