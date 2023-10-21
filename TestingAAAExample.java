/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingaaaexample;

/**
 *
 * @author Beregszászi István
 */
public class TestingAAAExample {
    
    static double szamolas(double a, double b) {
        return Math.sqrt(Math.abs(a) + Math.log(Math.abs(b * b)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double a = 2, b = 3;
        System.out.println("szamolas = " + szamolas(a, b)); // szamolas = 2.0487129074949033
    }
    
}
