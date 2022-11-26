/*
 * Write the following code in your editor below:
 *
 * A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
 * A class named Adder that inherits from a superclass named Arithmetic.
 * Your classes should not be be public.
 */

public class Inheritance2 {

    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}

class Arithmetic {

    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}