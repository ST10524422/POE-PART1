package com.mycompany.registrationlogin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Oratile
 */
public class RegistrationLoginTest {
    
    public RegistrationLoginTest() {
    }
    
    @Test
    public void testMain() {
        System.out.println("Testing main method...");
                
        String[] args = {}; 
        
        try {           
            RegistrationLogin.main(args);
                        
            assertTrue(true); 
            
        } catch (Exception e) {
            
            fail("The main method crashed with error: " + e.getMessage());
        }
    }
}