/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngoctin.mathutil.test;

import com.ngoctin.mathutil.MathUtility;
import static com.ngoctin.mathutil.MathUtility.getFacotial;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngoct
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 6; // tui muon test 5! co dung la 120 hay khong ?
        long expected = 720;
        long actual = getFacotial(6);
        assertEquals(expected, actual);
        // Minh test tiep nhung truong hop khac, dung dau vao, dung dau ra
        // khoi can bien trung gian
        assertEquals(720, getFacotial(6));
        assertEquals(24, getFacotial(4));
        assertEquals(6, getFacotial(3));
        assertEquals(1, getFacotial(1));
        assertEquals(1, getFacotial(0));
    }

    // dieu gi xay ra neu ta dua vao tham so ca chon, am hoac > 20
    // theo thiet ke cua ham`, dua vao ca chon se nem ra ngoai le
    // va ta can test xem ngoai le co dc nem ra khong ? neu ra ca` chon
    // ntuc la thay xuat hien ng    oai le neu co ca chon dua vao
    @Test(expected = IllegalArgumentException.class)
    // Co dung la khi lam ham nay nem ra ngoai le ten la IllegalArgument
    // Neu dung no nem ra ngoai le cung ten, code dung roi, xanh thoi
    public void testFactorialGivenWrongArgumentThrowsException() {
        // minh test tinh huong ham nem ra ngoai le neu tham so ca chon.
        // ngoai le la khong phai value de so sanh , khong dung assertEquals()
        // ta phai dung chieu khac. JUnit 4 khac JUnit 5 o cho bat ngoai le
        // Ki` 5 di du thinh mon SWT301 cua? Mr.Hoang The Nguyen : DI ( Dependency Injection / SOLID ) 
        // , Lamda Expression lien quan
        // Junit 5
        getFacotial(-5);
    }
}
