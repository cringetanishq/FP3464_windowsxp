public class Temporary extends Contract{
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary(
            double hourlySalary,
            int accumulatedHours
    ){
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getAccumulatedHours() {
        return accumulatedHours;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public void setAccumulatedHours(int accumulatedHours) {
        this.accumulatedHours = accumulatedHours;
    }

    public String toString(){
        return " He/she is a temporary employee with " + getHourlySalary() + "\n hourly salary and he/she has worked for " + getAccumulatedHours() + " hours \n \n";
    }

    @Override
    public double accumulatedSalary() {
        return hourlySalary*accumulatedHours;
    }
}
