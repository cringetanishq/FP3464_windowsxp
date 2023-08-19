enum Gear{
    Automatic, Manual
}

enum CarType{
    Sport, SUV, Hatchback, Minivan, Sedan
}

public class Car extends Vehicle {
    private Gear gear;
    private CarType carType;

    public Car(
            String make,
            String plate,
            String color,
            VehicleType vehicleType,
            Gear gear,
            CarType carType
    ) {
        super(
                make,
                plate,
                color,
                vehicleType
        );
        this.gear = gear;
        this.carType = carType;

    }

    //setters
    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public void setCarType(CarType type) {
        this.carType = type;
    }

    //getters
    public Gear getGear() {
        return gear;
    }

    public CarType getCarType() {
        return carType;
    }
    @Override
    public String toString(){
        System.out.println("Employee has a car");
        return super.toString() + "\n \t -gear type: " + getGear() + "\n \t -type: " + getCarType();
    }
}