public class Syntax {
    public static void main(String[] args) {

        // display content in terminal
        System.out.println("Hello World");
        System.out.println(3 + 3);
        System.out.print("I like java\n");
        System.out.println(4);

        // comments
        /* block (multi-line)comments
        this is all commented */

        // variables
        String str = "text";
        int num = 5;
        float decimalNum = 4.3f;
        char character = 'c';
        boolean fact = true;
        double dub = 4.5;

        System.out.println(str + num + decimalNum + character + dub);
        System.out.println(fact);

        // use 'final' to declare a constant value
        final int constant = 55;

        // to display multiple variables, use +
        System.out.println(str + character);

        // multiple variables of the same type:
        int x = 4, y = 3, z = 22;

        // multiple variables with the same value:
        int a, b, c;
        a = b = c = 49;

        // variables are in camelCase
        String firstName = "John";
        

        // Math class
        Math.max(x, y); // returns which is max
        Math.min(x, y); //returns which is min
        Math.sqrt(c); // returns square root
        Math.abs(-33); // returns absolute value
        Math.random(); // returns a random value between [0.0 and 1.0)
        
        // for more control over the random number: ex 0-100
        int randomNum = (int) (Math.random() * 101);

                            System.out.println(a + b + c + randomNum + constant + z + firstName);

        // Booleans
        int num1 = 10;
        int num2 = 9;
        System.out.println(num1 > num2); // returns true
        System.out.println(num1 == 12); // returns false

        // CONDITIONALS
            // if else
        if (num1 > 5) {
            num1 = 5;
        }
        else if (num < 5) {
            num1 = 0;
        }
        else {
            num1++;
        }

        // short hand if else: ternary operator

        // long hand
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        }
        else {
            System.out.println("Good evening");
        }

        //shorthand
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : 
        "Good evening.";
        System.out.println(result);

        // switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }

        // for-each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) { // the ':' is similar to 'in' 
        System.out.println(i); // "for i in cars" in python
        }

        // looping through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // multidimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int number1 = myNumbers[1][2];
        System.out.println(number1);



    }
}
