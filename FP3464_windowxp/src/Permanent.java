public class Permanent extends Contract {
    private int nbChildren;
    private boolean married;
    private double monthlySalary;
    private int bonusPerChildPerMonth;
    private int accumulatedDays;

    Permanent(
            int nbChildren,
            boolean married,
            double monthlySalary,
            int bonusPerChildPerMonth,
            int accumulatedDays
    ){
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    public void setNbChildren(int nbChildren) {
        this.nbChildren = nbChildren;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setBonusPerChildPerMonth(int bonusPerChildPerMonth) {
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }

    public void setAccumulatedDays(int accumulatedDays) {
        this.accumulatedDays = accumulatedDays;
    }

    public int getNbChildren() {
        return nbChildren;
    }

    public boolean getMarried() {
        return married;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }


    @Override
    public double accumulatedSalary() {
        return accumulatedDays*(monthlySalary+(nbChildren*bonusPerChildPerMonth))/20;
    }

    public String toString(){
        String isMarried;
        if(getMarried()) isMarried = "married";
        else isMarried = "not married";
        return " He/she is " + isMarried +" and he/she has " + getNbChildren() + " children .\nHe/She has worked for " + getAccumulatedDays() + " days and upon contract his/her monthly salary is " + accumulatedSalary() + " \n \n";
    }
}
