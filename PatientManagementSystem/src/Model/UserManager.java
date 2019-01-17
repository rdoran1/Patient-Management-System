/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author rdoran1
 */
public class UserManager 
{
   public static UserManager singleton;
   
   private List<User> UserList = new ArrayList<>();
   
   public static UserManager getInstance()
   {
       if(singleton == null)
       {
           singleton = new UserManager();
       }
       
       return singleton;
   }
   
   public boolean register(User user)
   {
       return UserList.add(user);
   }
}
