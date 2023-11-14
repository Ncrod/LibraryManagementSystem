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
public class LoanManagerTest {
    
    public LoanManagerTest() {
    }

    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        LoanManager instance = null;
        instance.addBook(book);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student student = null;
        LoanManager instance = null;
        instance.registerStudent(student);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLendBook() {
        System.out.println("lendBook");
        String bookId = "";
        String studentId = "";
        LoanManager instance = null;
        boolean expResult = false;
        boolean result = instance.lendBook(bookId, studentId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReceiveReturnedBook() {
        System.out.println("receiveReturnedBook");
        String bookId = "";
        String studentId = "";
        LoanManager instance = null;
        instance.receiveReturnedBook(bookId, studentId);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        LoanManager instance = null;
        List<Book> expResult = null;
        List<Book> result = instance.getBooks();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        LoanManager instance = null;
        List<Student> expResult = null;
        List<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
