/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.example;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 000515119
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        Book book = null;
        Student instance = null;
        boolean expResult = false;
        boolean result = instance.borrowBook(book);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        Book book = null;
        Student instance = null;
        instance.returnBook(book);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBorrowedBooks() {
        System.out.println("getBorrowedBooks");
        Student instance = null;
        List<Book> expResult = null;
        List<Book> result = instance.getBorrowedBooks();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = null;
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = null;
        instance.setName(name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetBorrowedBooks() {
        System.out.println("setBorrowedBooks");
        List<Book> borrowedBooks = null;
        Student instance = null;
        instance.setBorrowedBooks(borrowedBooks);
        fail("The test case is a prototype.");
    }
    
}
