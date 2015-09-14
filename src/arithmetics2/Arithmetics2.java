/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetics2;

import java.util.Scanner;

/**
 *
 * @author MCENDROWSKI
 */
public class Arithmetics2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first_number;
        int second_number;
        int third_number;
        String mathematical_calculation;
        System.out.println("Input the first number: ");

        Scanner keyboard = new Scanner(System.in);
        first_number = keyboard.nextInt();

        System.out.println("Input the second number: ");

        second_number = keyboard.nextInt();

        System.out.println("Choose mathematical calculation: (A)ddition, (D)eduction, (M)ultiplication, di(V)iding:");

        Scanner keyboard2 = new Scanner(System.in);
        mathematical_calculation = keyboard2.nextLine();

//        if ("A".equalsIgnoreCase(mathematical_calculation)) {
//            Addition2 calc = new Addition2(first_number, second_number);
//        } 
//        else if ("D".equalsIgnoreCase(mathematical_calculation)) {
//            Addition2 calc = new Addition2(first_number, second_number);
//        } 
//        else if ("M".equalsIgnoreCase(mathematical_calculation)) {
//            Addition2 calc = new Addition2(first_number, second_number);
//        } 
//        else if ("V".equalsIgnoreCase(mathematical_calculation)) {
//            Addition2 calc = new Addition2(first_number, second_number);
//        } 
//        else {
//            Addition2 calc = new Addition2(first_number, second_number);
//        }

//             calc.calculate();
//             System.out.println(calc.showResult());
        
        Addition2 calc = new Addition2(first_number, second_number);
        
        PerformCalculation2 pc = new PerformCalculation2(calc);
        pc.calc();
        System.out.println(pc.returnResult());

    }

  
    
    
}