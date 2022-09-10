
package com.mycompany.strategy.pattern;


public class context{
    private strategy Strategy;
    
    
    public context(strategy Strategy){
        this.Strategy = Strategy;
    }
    public int executestrategy(int num1 , int num2){
        return Strategy.doOperation(num1, num2);
    }
    
}
