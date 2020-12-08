package org.itstep.task02;

public class Main {
    public static void main(String[] args) {

    }
    public static void getPositiveLessHundredNumber(int num) throws NegativeNumberException{
        if (num < 0){
            throw new NegativeNumberException("Число отрицательно");
        }
        if (num > 100){
            throw new GreatHundredException("Число больше ста");
        }
    }
}
