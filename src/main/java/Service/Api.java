/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import DBObjects.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mikael
 */
@RestController

public class Api{
    @PersistenceContext
    static EntityManager em;
    /**
     *
     * @return
     */
    @RequestMapping("/test")
    public User userTest(){
        
        User u= new User();
        u.setName("Mikael");
        u.setPassword("Password");
            em.persist(u);
        try{
        
        }catch(Exception e){
            System.out.println("User already Created");
        }
        return u;
    }
    @RequestMapping("login")
    public boolean login(String name, String pass){
        return name.equals("admin")||pass.equals("admin");
    }
    
}
