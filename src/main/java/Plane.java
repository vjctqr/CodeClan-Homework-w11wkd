public class Plane {

    private PlaneType craft;

    public Plane(PlaneType craft){
        this.craft = craft;
    }

    public PlaneType getCraft(){
        return craft;
    }

    public int getCapacityFromEnum(){
        return this.craft.getCapacity();
    }

    public int getWeightFromEnum(){
        return this.craft.getWeight();
    }



}
