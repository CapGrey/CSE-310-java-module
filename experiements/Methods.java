public class Methods {

    static void myMethod() {
        // static means it belongs to the Methods class, and is not an
        // object of the Methods class.
        // void means no return value.
        System.out.println("Executed code.");
    }

    static void passingParameters(String fname) {
        System.out.println(fname + "Refsnes");
    }

    // method overloading is giving multiple methods the same name,
    // but having different parameters passed in.

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod();
        passingParameters("Jenny");
        passingParameters("John");
        int myNum1 = plusMethod(8, 5);
        double myNumw = plusMethod(4.3, 6.26);
        System.out.println(myNum1);
        System.out.println(myNumw);
        System.out.print(plusMethod(myNum1, myNumw));

    }
}
