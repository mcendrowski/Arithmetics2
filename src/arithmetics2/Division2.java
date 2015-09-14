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
public class Division2 implements Calculation2  {
    private double first_number;
    private double second_number;
    private double result;

    public Division2 (double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
//        this.result=this.first_number+this.second_number;
//        System.out.println("Constructor performed.");
    }
    
    

    @Override
    public void calculate() {
        if (this.second_number!=0)
        {this.result=this.first_number/this.second_number;}
    }
    
    @Override
     public String showResult(){
        String text=this.first_number + " / "+this.second_number+" = ";
    
        if (this.second_number!=0){
        text = text+this.result;
    }
        else {
            text = text+ "? --> Dividing by zero is not allowed.";
        }
    return text;
    }
    }
