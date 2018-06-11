package DBObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 *
 * @author Mikael
 */
@Entity
public class User {


    @Id
    String name;
    String password;
    
    public User() {
     
    }

    public User(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    } 
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

}
