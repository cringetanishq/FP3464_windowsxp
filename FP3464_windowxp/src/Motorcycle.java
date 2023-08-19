public class Motorcycle extends Vehicle {
    boolean hasSideCar;
    public Motorcycle(
            String make,
            String plate,
            String color,
            VehicleType vehicleType,
            boolean hasSideCar
    ) {
        super(
                make,
                plate,
                color,
                vehicleType
        );
        this.hasSideCar = hasSideCar;
    }
    //setter
    public void setHasSideCar(boolean hasSideCar){
        this.hasSideCar = hasSideCar;
    }
    //getter
    public boolean getHasSideCar(){
        return hasSideCar;
    }

    @Override
    public String toString() {
            System.out.println("Employee has a Motorcycle");
            String hasSideCar;
            if(getHasSideCar()) hasSideCar = ("\t -with sidecar");
            else hasSideCar = ("\t -without sidecar");
            return super.toString() + "\n" + hasSideCar;
    }
}
