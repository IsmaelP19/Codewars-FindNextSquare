public class NumberFunTest {

    public static void main(String[] args) {
        Long num1 = 121L;
        Long num2 = 625L;
        Long num3 = 114L;

        System.out.println("Number 1: " + num1);
        System.out.println("findNextSquare(" + num1 + ") --> returns " + NumberFun.findNextSquare(num1));

        System.out.println("\nNumber 2: " + num2);
        System.out.println("findNextSquare(" + num2 + ") --> returns " + NumberFun.findNextSquare(num2));

        System.out.println("\nNumber 3: " + num3);
        System.out.println("findNextSquare(" + num3 + ") --> returns " + NumberFun.findNextSquare(num3));


    }

}
