package org.nocoder.strategy;

/**
 * Demo
 * Created by YANGJINLONG on 2017-9-27.
 */
public class StrategyPatternDemo {
    public static void main(String [] args){
        Context contextAdd = new Context(new OperationAdd());
        System.out.println("1 + 3 = " + contextAdd.executeStrategy(1, 3));

        Context contextSubstract = new Context(new OperationSubstract());
        System.out.println("1 - 3 = "+contextSubstract.executeStrategy(1, 3));

        Context contextMultiply = new Context(new OperationMultiply());
        System.out.println("1 * 3 = "+contextMultiply.executeStrategy(1, 3));
    }
}
