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
public class PerformCalculation2 {
    private Calculation2 calc;

    public PerformCalculation2(Calculation2 calc) {
        this.calc = calc;
    }
    public void calc() {
            this.calc.calculate();
	}
    public String returnResult(){
        return this.calc.showResult();
    }
}
