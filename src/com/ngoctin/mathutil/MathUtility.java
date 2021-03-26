/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngoctin.mathutil;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class MathUtility {

    public static long getFacotial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument : n must be between 0 ... 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFacotial(n - 1);
    }
}
