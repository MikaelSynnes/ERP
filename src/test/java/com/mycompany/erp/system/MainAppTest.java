/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.erp.system;

import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikael
 */
public class MainAppTest {

    public MainAppTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of start method, of class MainApp.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        MainApp instance = new MainApp();
        String[] args = null;
        MainApp.main(args);

        // TODO review the generated test code and remove the default call to fail.
        String testStringUser = "This is a test";
        String testStringPass = "This is not a test";
        instance.setUsernameInput(testStringUser);
        instance.setPasswordInput(testStringPass);

        if (instance.getUsername().equals(testStringUser)) {
            System.out.println("Test passed");
        } else if (instance.getUsername() == null) {
            fail("inputfield returned null");
        } else {
            fail("output doest not equal input");
        }

        if (instance.getPassword().equals(testStringPass)) {
            System.out.println("Test passed");
        } else if (instance.getPassword() == null) {
            fail("inputfield returned null");
        } else {
            fail("output doest not equal input");
        }

    }

    /**
     * Test of main method, of class MainApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainApp.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }

}
