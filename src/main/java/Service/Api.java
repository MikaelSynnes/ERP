/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import DBObjects.User;

/**
 *
 * @author Mikael
 */
@RestController
public class Api{
    
    @RequestMapping("/test")
    public User userTest(){
        
        return new User();
    }
}
