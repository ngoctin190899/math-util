/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngoctin.mathuitl.main;

import com.ngoctin.mathutil.MathUtility;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        // Vi la do xai chung cho nen se l
        //--
//        System.out.println("Ayzo Github");
//        System.out.print("Input a number : ");
//        int number = Integer.parseInt(sc.nextLine());
//        System.out.print("Result : ");
//        System.out.println(MathUtility.getFacotial(number));

        // Test if 6! have right answer or not
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFacotial(n);
        if (actual == expected) {
            System.out.println("Right !");
        } else {
            System.out.println("6! expected : " + expected + ";"
                    + " actual : " + actual);
        }

        // Test if 0! have right answer or not
        n = 0;
        expected = 1;
        actual = MathUtility.getFacotial(n);
        if (actual == expected) {
            System.out.println("Right !");
        } else {
            System.out.println("6! expected : " + expected + ";"
                    + " actual : " + actual);
        }

    }

    // Viet code xong thi phai test code - nguyen tac phai theo
    // Test ngay tung ham, tung class truoc khi rap chung voi class khac
    // Test ngay khi xong ham, xong class
    // Duoc goi la test muc do 1 , muc Unit Test ( test muc don vi code ) 
    // Lam sao de test. Co nhieu cach
    // 1 . Cach 1 : sout(call function()) de in ra kq de xu li ham
    // 2 . Cach 2 : Joptionpane de popup len de kq xu li cua ham` ( J Desktop)
    // 3 . Cach 3 : Ghi ra LOG file, ra 1 trang web 
    // Dung : tuc la ham chay ra 1 gia tri - Actual Value
    // Va ta thay Actual Value khop, bang cai gia tri ma ta mong doi
    // ta tinh truoc bang tay, goi la expected value
    // ham chay dung cho 5!
    // * sai : tui test 6! , expected la 720 , chay thi ra actual = 120
    // ham xu ly sai
    // Cach 4 : May oi so sanh gium va ket luan gium t luon vi ma co 
    // cac phep toan so sanh ma
    // Con nguoi khong can nhin tung dong ket qua ve de luan dung sai
    // May se lo cho
    // Neu tat ca tinh huong chay ham deu dung -> ham dung -> mau xanh
    // Hau het deu dung, co mot cai sai -> ham sai -> mau do
    
    // Do : Chi can mot thang sai
    // Xanh : Tat ca de phai dung
    
    // Muon lam dc dieu nay ta can vien phu tro giup cho java xanh do
    // Dieu nay cung co ben C#, PHP, JS, RUBY , .... 
    // Java : Junit , TestNG
    // C## : NUnit, xUnit, MSTEst
    // PHP : PHPUnit
}
