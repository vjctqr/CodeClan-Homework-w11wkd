public enum PlaneType {

    JET(100, 400),
    BOING(300, 1200),
    AIRBUS(500, 2000);

    private final int capacity, weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
