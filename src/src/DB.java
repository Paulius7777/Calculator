import java.util.ArrayList;

/**
 * Created by student on 17.3.6.
 */
public class DB {
    private ArrayList<Double> values ;

    public DB() {
        this.values = new ArrayList<Double>();
    }

    public void add(double value){

        values.add(value);
    }
    public void getvalues(){
        for(Double cell: this.values){
            System.out.println("Paskutines operacijos" + cell);
        }
    }

}
