/**
 * Created by student on 17.3.6.
 */


import java.util.Scanner;

public class Mainn {
    public static void main(String[]args) {

        DB result = new DB();
        Menu menu =  new Menu();
        menu.operationsadd();
        menu.operation("+");


        double n1, n2;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter first number");
        n1 = scannerObject.nextDouble();

        System.out.println("Enter second number");
        n2 = scannerObject.nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();

        //TODO
        //Padarykite Meniu kitame class faile :)

        switch (operation) {
            case "+":

                System.out.printf("Your answer is " + (n1 + n2));
                break;

            case "-":
                System.out.println("Your answer is " + (n1 - n2));
                break;

            case "/":
                System.out.println("Your answer is " + (n1 / n2));
                break;

            case "*":
                System.out.println("Your asnwer is " + (n1 * n2));
                break;

            default:
                System.out.println("Je ne sais pas");

        }
    }
}
