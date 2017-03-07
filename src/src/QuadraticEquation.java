/**
 * Created by geras on 3/7/17.
 */
public class QuadraticEquation {

    public void getEquation (double a, double b, double c){

        double temp1 = Math.sqrt(b * b - 4 * a * c);

        if (temp1 < 0){
            System.out.println("Lygtis neturi sprendinių realiųjų skaičių aibėje.");
        }
        else {
            double root1 = (-b + temp1) / (2 * a);
            double root2 = (-b - temp1) / (2 * a);

            System.out.println("The roots of the Quadratic Equation" + " are " + root1 + " and " + root2);

        }
    }


}
