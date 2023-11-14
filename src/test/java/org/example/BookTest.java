/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 000515119
 */
public class BookTest {
    
    public BookTest() {
    }

    @org.junit.jupiter.api.Test
    public void testMarkAsUnavailable() {
        System.out.println("markAsUnavailable");
        Book instance = null;
        instance.markAsUnavailable();
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testMarkAsAvailable() {
        System.out.println("markAsAvailable");
        Book instance = null;
        instance.markAsAvailable();
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        Book instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
