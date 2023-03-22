package com.demo.service;

import com.demo.domain.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class EmailServiceTest {
    public static void testBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    @Before
    public void testBefore() throws Exception {
        System.out.println("Before");
    }

//    @Test(expected = Exception.class)
//    public void test1() throws Exception {
//        Order o = new Order(5, "Food", 25.8);
//        assertFalse(EmailService.getInstance().sendEmail(o));
//    }

    @Test
    public void test2() {
        Order o1 = new Order(5, "Food", 25.8);
        assertTrue(EmailService.getInstance().sendEmail(o1, "Food"));
    }

    @After
    public void testAfter() throws Exception {
        System.out.println("After");
    }

    @AfterClass
    public static void testAfterClass() throws Exception {
        System.out.println("After Class");
    }
}

