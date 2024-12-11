import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // start the application
        boolean appRunning = true;
        int menu = showMenu();
        int result;
        double resultDouble;

        // ask the user to choose from the menu
        while (appRunning) {
            switch (menu) {
                case 0:
                    System.out.println("Good Bye");
                    appRunning = false;
                    break;
                case 1:
                    result = addfunc();
                    System.out.println("the result is " + result);
                    menu = showMenu();
                    break;
                case 2:
                    result = substructfunc();
                    System.out.println("the result is " + result);
                    menu = showMenu();
                    break;
                case 3:
                    result = multiplicationfunc();
                    System.out.println("the result is " + result);
                    menu = showMenu();
                    break;
                case 4:
                    resultDouble = devisionfunc();
                    System.out.println("the result is " + resultDouble);
                    menu = showMenu();
                    break;
                case 5:
                    resultDouble = powerfunc();
                    System.out.println("the result is " + resultDouble);
                    menu = showMenu();
                    break;
                case 6:
                    result = factorialfunc();
                    System.out.println("the result is " + result);
                    menu = showMenu();
                    break;
                case 7:
                    resultDouble = squarefunc();
                    System.out.println("the result is " + resultDouble);
                    menu = showMenu();
                    break;
                case 8:
                    menu = showMenu();
                    break;
            }
        }
    }

    static int showMenu () {
        Scanner scan = new Scanner(System.in);
        // take user input
        try {
            System.out.println("**************************************************");
            System.out.println("************* please choose a number *************");
            System.out.println("**************************************************");
            System.out.println("For Addition choose             =>  1");
            System.out.println("For Substruction choose         =>  2");
            System.out.println("For Multiplication choose       =>  3");
            System.out.println("For Devision choose             =>  4");
            System.out.println("For Power choose                =>  5");
            System.out.println("For Factorials choose           =>  6");
            System.out.println("For Square choose               =>  7");
            System.out.println("To Quit the application choose  =>  0");

            int num = scan.nextInt();
            scan.nextLine();
            return num;
        }
        catch (InputMismatchException e) {
            System.out.println("please enter a valid number");
            return 8;
        }
    }

    // addition functionality
    static int addfunc () {
        int[] nums = getNumbers();
        return nums[0] + nums[1];
    }

    // substruction functionlity
    static int substructfunc () {
        int[] nums = getNumbers();
        return nums[0] - nums[1];
    }

    // multiplication functionlity
    static int multiplicationfunc () {
        int[] nums = getNumbers();
        return nums[0] * nums[1];
    }

    // multiplication functionlity
    static double devisionfunc () {
        int[] nums = getNumbers();

        // check if the user enters a 0
        if ( nums[0] == 0 || nums[1] == 0 ) {
            System.out.println("can't devide by 0, please enter a greater number");
            nums = getNumbers();
        }
        // convert data types from an int to a double
        double n1 = (double) nums[0];
        double n2 = (double) nums[1];
        // make the calculation
        return  n1 / n2;
    }

    // power functionality
    static double powerfunc () {
        int n = getNumber("please enter a numbr");
        return (double) Math.pow(n, 2);
    }

    // power functionality
    static int factorialfunc () {
        int n = getNumber("please enter a numbr");
        for ( int i = n - 1 ; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    // square functionality
    static double squarefunc () {
        int n = getNumber("please enter a numbr");
        return Math.sqrt( (double) n );
    }

    // create function that ask user to enter 2 numbers
    static int[] getNumbers () {
        // ask the user to enter 2 number
        //Scanner scan = new Scanner(System.in);
        int num1 = getNumber("please enter number 1");
        int num2 = getNumber("please enter number 2");

        int[] nums = { num1, num2 };
        return nums;


    }

    // create a function that get only one number
    static int getNumber ( String msg ) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(msg);
            int n = scan.nextInt();
            scan.nextLine();
            return n;
        }
        catch ( InputMismatchException e ) {
            return getNumber("please enter a valid number");
        }

    }

}