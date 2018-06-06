/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mikael
 */
@Entity

@Table(name = "HUSER")
public class User implements Serializable {

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
