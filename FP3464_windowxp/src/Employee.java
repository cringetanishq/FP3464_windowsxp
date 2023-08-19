import java.time.Year;

public abstract class Employee{
    private final String name;
    private final int birthYear;
    private double occupationRate;
    private Vehicle vehicle;
    private Contract contract;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Employee(String name, int birthYear, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.occupationRate = 100;
        this.vehicle = vehicle;
    }

    public Employee(String name, int birthYear, double occupationRate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
        this.vehicle = vehicle;
    }

    //setter
    //No setName() and setBirthYear() method because it is final
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10) {
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = occupationRate;
        }
    }

    //getters
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void signContract(Contract contract) {
        this.contract = contract;
    }

    public Contract contractIs() {
        return contract;
    }

    public void changeContract(Contract contract) {
        this.contract = contract;
    }

    public abstract String contractInfo();

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Employee has a " + vehicle.getClass().getSimpleName() + "\n" + vehicle.toString() ;
    }
}

