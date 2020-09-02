/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewinglab.intrestcalculator;

/**
 *
 * @author Ron
 */
public class IntrestCalculator {
    
    public double Investment;
    public double IntrestRate;
    public double Intrest;
     
    public double CalculateIntrest(double investment, double intrestrate)
    {
        Investment = investment;
        IntrestRate = intrestrate;
        
        Intrest = Investment*IntrestRate;
        
        return Investment+Intrest;
    }
}
