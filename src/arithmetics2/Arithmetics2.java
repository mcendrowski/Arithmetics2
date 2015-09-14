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
 * Program allows to perform any two-argument mathematical operation, earlier defined in modules.
 * Currently there is adding, substracting, mutliplying, dividing and example of a function.
 */
public class Arithmetics2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first_number;
        int second_number;
//        int third_number;
        String mathematical_calculation;
        String tryAgain;

        do {
            System.out.println("Input the first number: ");

            Scanner keyboard = new Scanner(System.in);
            first_number = keyboard.nextInt();

            System.out.println("Input the second number: ");

            second_number = keyboard.nextInt();

            System.out.println("Choose mathematical calculation: (A)dding, (S)ubstraction (M)ultiplication, (D)ivision,function (F1):");

            Scanner keyboard2 = new Scanner(System.in);
            mathematical_calculation = keyboard2.nextLine();
// all the modules are instanciated - I wonder how to instanciate only one.
            Adding2 calc1 = new Adding2(first_number, second_number);
            Substraction2 calc2 = new Substraction2(first_number, second_number);
            Multiplication2 calc3 = new Multiplication2(first_number, second_number);
            Division2 calc4 = new Division2(first_number, second_number);
            Function1 calc5 = new Function1(first_number, second_number);

//        if ("A".equalsIgnoreCase(mathematical_calculation)) {
//            calc = new Addition2(first_number, second_number);
//            
//        } 
//        else if ("D".equalsIgnoreCase(mathematical_calculation)) {
//            calc2 = new Deduction2(first_number, second_number);
//        } 
//        else if ("M".equalsIgnoreCase(mathematical_calculation)) {
//            calc = new Addition2(first_number, second_number);
//        } 
//        else if ("V".equalsIgnoreCase(mathematical_calculation)) {
//            calc = new Addition2(first_number, second_number);
//        } 
//        else {
//            calc2 = new Deduction2(first_number, second_number);
//        }
            // on the basis of a choice, a relevant instance of PerformCalculation2 is created
            // PerformCalculation2 is an abstract layer with two methods: calc - to calculate result and returnResult - to show result with a comment
            PerformCalculation2 pc;
            if ("A".equalsIgnoreCase(mathematical_calculation)) {
                pc = new PerformCalculation2(calc1);

            } else if ("S".equalsIgnoreCase(mathematical_calculation)) {
                pc = new PerformCalculation2(calc2);
            } else if ("M".equalsIgnoreCase(mathematical_calculation)) {
                pc = new PerformCalculation2(calc3);
            } else if ("D".equalsIgnoreCase(mathematical_calculation)) {
                pc = new PerformCalculation2(calc4);
            } else if ("F1".equalsIgnoreCase(mathematical_calculation)) {
                pc = new PerformCalculation2(calc5);
            } else {
                pc = new PerformCalculation2(calc1);
            }

//             calc.calculate();
//             System.out.println(calc.showResult());
//        Addition2 calc = new Addition2(first_number, second_number);
//        PerformCalculation2 pc = new PerformCalculation2(calc2);
            pc.calc();
            System.out.println(pc.returnResult());

            Scanner keyboard3 = new Scanner(System.in);
            System.out.println("Do you want to perform another operation: Y/N");
            tryAgain = keyboard3.nextLine();

        } while ("Y".equalsIgnoreCase(tryAgain));

    }
}
