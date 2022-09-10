
package com.mycompany.strategy.pattern;


public class strategyDemo {
    public static void main(String[] args){
        context Context = new context(new add());
        System.out.println("10 + 5 = " + Context.executestrategy(10,5));
        
        Context = new context(new substract());
        System.out.println("10 - 5 = " + Context.executestrategy(10,5));
        
        
        Context = new context(new multiply());
        System.out.println("10 * 5 =" + Context.executestrategy(10,5));
    }
    
}
