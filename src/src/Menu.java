import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 17.3.6.
 */
public class Menu {
    private Scanner reader = new Scanner(System.in);
    private ArrayList<String> operations = new ArrayList<String>();
    private Summinus twovalues = new Summinus();
    private SinCos onevalue = new SinCos();
    private QuadraticEquation qe = new QuadraticEquation();
    private DB all = new DB();
    private double sk;
    private double sk2;


    public void operationsadd() {
        operations.add("Suma +");
        operations.add("Atimtis -");
        operations.add("Daugyba *");
        operations.add("Dalyba /");
        operations.add("sin sin");
        operations.add("cos Cos");
        operations.add("sin Sin");
        operations.add("tangent Tan");
        operations.add("cotangent CoTang");
        operations.add("QuadraticEquation eQ");
        operations.add("Last Operation L");

        for (String cell : operations) {
            System.out.println("Operacijos    " + cell);
        }
    }

    public void operation() {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        String operation = op.next();

        switch (operation) {
            case "+":

                twovalues.sum(firstNumber(), secondNumber());
                break;
            case "-":
//
                twovalues.minus(firstNumber(), secondNumber());
                break;

            case "/":

                twovalues.diff(firstNumber(), secondNumber());
                break;

            case "*":

                twovalues.multiplay(firstNumber(), secondNumber());
                break;
            case "Sin":
                onevalue.Sin(firstNumber());
                break;
            case "Cos":
                onevalue.Cos(firstNumber());
                break;
            case "Tan":
                onevalue.Tan(firstNumber());
                break;
            case "CoTang":
                onevalue.CoTang(firstNumber());
                break;
            case "eQ":
                qe.getEquation(firstNumber(),secondNumber(),tridNumber());
            case "L":
                all.getvalues();


            default:
                System.out.println("Je ne sais pas");

        }


    }

    private double tridNumber() {
        System.out.println("Iveskite trecia skaiciu");
        double z = reader.nextDouble();
        return z;
    }

    private double secondNumber() {
        System.out.println("Iveskite antra skaiciu");
        double y = reader.nextDouble();
        return y;
    }

    private double firstNumber() {
        System.out.println("Iveskite skaiciu");
        double x = reader.nextDouble();
        return x;
    }


}


