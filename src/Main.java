import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // start the application
        boolean appRunning = true;
        int menu = showMenu();
        int result;

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
                    System.out.println("devision");
                    menu = showMenu();
                    break;
                case 5:
                    System.out.println("power");
                    menu = showMenu();
                    break;
                case 6:
                    System.out.println("factorial");
                    menu = showMenu();
                    break;
            }
        }


    }

    static int showMenu () {
        System.out.println("**************************************************");
        System.out.println("************* please choose a number *************");
        System.out.println("**************************************************");
        System.out.println("For Addition choose             =>  1");
        System.out.println("For Substruction choose         =>  2");
        System.out.println("For Multiplication choose       =>  3");
        System.out.println("For Devision choose             =>  4");
        System.out.println("For Power choose                =>  5");
        System.out.println("Fro Factorials choose           =>  6");
        System.out.println("To Quit the application choose  =>  0");

        // take user input
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();

        return num;
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

    // create function that ask user to enter 2 numbers
    static int[] getNumbers () {
        // ask the user to enter 2 number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        scan.nextLine();

        int[] nums = { num1, num2 };
        return nums;
    }
}