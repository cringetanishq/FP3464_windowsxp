enum VehicleType{
    Sport, Family, RACE, NOT_FOR_RACE
}

public abstract class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType vehicleType;

    public Vehicle(
            String make,
            String plate,
            String color,
            VehicleType vehicleType
    ) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.vehicleType = vehicleType;
    }
    //setters
    public void setMake(){
        this.make = make;
    }
    public void setPlate(){
        this.plate = plate;
    }
    public void setColor(){
        this.color = color;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    //getters
    public String getMake(){
        return make;
    }
    public String getPlate(){
        return plate;
    }
    public String getColor(){
        return color;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
    public String toString(){
        return "\t -make :" + getMake() + "\n \t -plate: " + getPlate() + "\n \t -color: " + getColor() + "\n \t -category: " + getVehicleType();
    }
}
