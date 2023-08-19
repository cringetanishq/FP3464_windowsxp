public class Tester extends Employee{
    private int nbBugs;

    public Tester(
            String name,
            int birthYear,
            int nbBugs
    ) {
        super(
                name,
                birthYear
        );
        this.nbBugs = nbBugs;
        System.out.println("We have a new employee " + getName() + ", a tester.");
    }
    public Tester(
            String name,
            int birthYear,
            int nbBugs,
            double occupationRate
    ) {
        super(
                name,
                birthYear,
                occupationRate
        );
        this.nbBugs = nbBugs;
        System.out.println("We have a new employee " + getName() + ", a tester.");
    }

    public Tester(
            String name,
            int birthYear,
            int nbBugs,
            Vehicle vehicle
    ) {
        super(
                name,
                birthYear,
                vehicle);
        this.nbBugs = nbBugs;
        System.out.println("We have a new employee " + getName() + ", a tester.");
    }

    public Tester(
            String name,
            int birthYear,
            int nbBugs,
            double occupationRate,
            Vehicle vehicle
    ) {
        super(
                name,
                birthYear,
                occupationRate,
                vehicle
        );
        this.nbBugs = nbBugs;
        System.out.println("We have a new employee " + getName() + ", a tester.");
    }

    //setter
    public void setNbBugs(int nbBugs){
        this.nbBugs = nbBugs;
    }
    //getter
    public int getNbBugs(){
        return nbBugs;
    }
    public String toString() {
        double annualIncome = contractIs().accumulatedSalary() * 12;
        return super.toString() + "\n" +
                getName() + " has an Occupation rate: " + getOccupationRate() +
                "% and corrected " + getNbBugs() +
                " bugs.\nHis/Her estimated annual income is " + annualIncome;
    }

    public String contractInfo() {
        return getName() + " is a Tester." + super.contractIs().toString();
    }
}
