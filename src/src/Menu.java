import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 17.3.6.
 */
public class Menu {
    private Scanner reader = new Scanner(System.in);
    private ArrayList<String> operations = new ArrayList<String>();
    private summinus twovalues = new summinus();
    private SinCos onevalue = new SinCos();

    public  void operationsadd() {
        operations.add("Suma +");
        operations.add("Atimtis -");
        operations.add("Daugyba *");
        operations.add("Dalyba /");
        operations.add("sin sin");
        operations.add("cos Cos");
        operations.add("sin Sin");
        operations.add("tangent Tan");
        operations.add("cotangent CoTang");

        for (String cell:operations){
            System.out.println("Operacijos    " +cell);
        }
    }
    public void operation(String simbol){
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        String operation = op.next();

        switch (operation) {
            case "+":
                twovalues.sum(reader.nextDouble(), reader.nextDouble());
                break;

            case "-":

                break;

            case "/":
                System.out.println("Your answer is "  );
                break;

            case "*":
                System.out.println("Your asnwer is " );
                break;

            default:
                System.out.println("Je ne sais pas");

        }
    }
}
