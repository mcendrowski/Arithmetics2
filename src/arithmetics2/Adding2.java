/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetics2;

/**
 *
 * @author MCENDROWSKI
 */
public class Adding2 implements Calculation2  {
    private double first_number;
    private double second_number;
    private double result;

    public Adding2 (double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
//        this.result=this.first_number+this.second_number;
//        System.out.println("Constructor performed.");
    }
    
    

    @Override
    public void calculate() {
        this.result=this.first_number+this.second_number;
    }
    
    @Override
    public String showResult(){
        return this.first_number + " + "+this.second_number+" = "+this.result;
    }
    
}
