
package com.mycompany.strategy.pattern;


public class substract implements strategy{
    @Override
    public int doOperation(int num1 , int num2) {
        return num1 - num2;
    }
    
}
