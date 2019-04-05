/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marin
 */
public class ProjecteTest {
    
    public ProjecteTest() {
    }

    /**
     * Test of main method, of class Projecte.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of suma method, of class Projecte.
     */
    @Test
    public void testSuma() {
        Projecte p = new Projecte();
        
        assertEquals(5, p.suma(2,3));
    }
    
}
