public enum PlaneType {

    JET(100, 400),
    BOING(300, 1200),
    AIRBUS(500, 2000);

    private final int value;

    PlaneType(int value, int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
