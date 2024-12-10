import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // start the application
        boolean appRunning = true;
        int menu = showMenu();

        // ask the user to choose from the menu
        while (appRunning) {
            switch (menu) {
                case 0:
                    appRunning = false;
                    break;
                case 1:
                    System.out.println("addition");
                    menu = showMenu();
                    break;
                case 2:
                    System.out.println("substruction");
                    menu = showMenu();
                    break;
                case 3:
                    System.out.println("multiplication");
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
}