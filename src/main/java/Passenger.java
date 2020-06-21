import java.util.ArrayList;

public class Passenger {

    private String name;
    private ArrayList<Bag> luggage;

    public Passenger(String name){
        this.name = name;
        this.luggage = new ArrayList<Bag>();
    }

    public String getName(){
        return this.name;
    }

    public int bagCount(){
        return this.luggage.size();
    }
}
