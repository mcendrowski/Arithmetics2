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
public class Function1 implements Calculation2  {
    private double first_number;
    private double second_number;
    private double result;

    public Function1 (double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
//        this.result=this.first_number+this.second_number;
//        System.out.println("Constructor performed.");
    }
    
    

    @Override
    public void calculate() {
        this.result=3*this.first_number*this.first_number-2*this.first_number*this.second_number+9;
    }
    
    @Override
    public String showResult(){
        return "function 3X*X-2XY+9, f("+this.first_number + ", "+this.second_number+") = "+this.result;
    }
    
}

