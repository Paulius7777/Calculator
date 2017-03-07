/**
 * Created by student on 17.3.6.
 */
public class Summinus {
    private double value1;
    private double value2;
    private DB data;

    public Summinus() {
        this.value1 = value1;
        this.value2 = value2;
        this.data = new DB();
    }

    public double sum(double value1, double value2){
        double value = value1 + value2;
        System.out.println("Suma " + value);
        data.add(value);
        return value;
    }
    public void minus(double value1, double value2){
        double value = value1 - value2;
        System.out.println("Minus " + value);
        data.add(value);
    }
    public void multiplay(double value1, double value2){
        double value = value1 * value2;
        System.out.println("Daugyba " + value);
        data.add(value);
    }
    public void diff(double value1, double value2){
        double value = value1 / value2;
        System.out.println("Dalyba " + value);
        data.add(value);
    }

}
