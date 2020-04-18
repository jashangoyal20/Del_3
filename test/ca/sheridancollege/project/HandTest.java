/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ca.sheridancollege.project.Card;
import java.util.ArrayList;

/**
 *
 * @author JASHAN GOYAL
 */
public class HandTest {

    private Object Card;
    private Card card;
   
    
    public HandTest() {
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
     * Test of clear method, of class Hand.
     */
    @Test
    public void testClearGood() {
        System.out.println("clear Good");
         ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        Hand instance = new Hand();
        instance.setHand(list);
        boolean expResult = true;
        boolean result = instance.clear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
 @Test
    public void testClearBad() {
        System.out.println("clear Bad");
         ArrayList list=new ArrayList();
//        list.add(1);
//        list.add(2);
        Hand instance = new Hand();
        instance.setHand(list);
        boolean expResult = false;
        boolean result = instance.clear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testClearBoundary() {
        System.out.println("clear Boundary");
         ArrayList list=new ArrayList();
        list.add(1);
        Hand instance = new Hand();
        instance.setHand(list);
        boolean expResult = true;
        boolean result = instance.clear();
        assertEquals(expResult, result);
     
    }
    
    /**
     * Test of continuePlay method, of class Hand.
     */
    @Test
    public void testContinuePlayGood() {
        System.out.println("continuePlayGood");
        int a = 1;
        Hand instance = new Hand();
        boolean expResult = true;
        boolean result = instance.continuePlay(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testContinuePlayBad() {
        System.out.println("continuePlay Bad");
        int a = 0;
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.continuePlay(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
     @Test
    public void testContinuePlayBoundary() {
        System.out.println("continuePlay Boundary");
        int a = 01;
        Hand instance = new Hand();
        boolean expResult = true;
        boolean result = instance.continuePlay(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

  


    
}
