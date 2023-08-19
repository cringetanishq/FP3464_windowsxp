public class Programmer extends Employee {
    private int nbProjects;

    public Programmer(
            String name,
            int birthYear,
            int nbProjects
    ) {
        super(
                name,
                birthYear
        );
        this.nbProjects = nbProjects;
        System.out.println("We have a new employee " + getName() + ", a programmer.");
    }

    public Programmer(
            String name,
            int birthYear,
            double occupationRate,
            int nbProjects
    ) {
        super(
                name,
                birthYear,
                occupationRate
        );
        this.nbProjects = nbProjects;
        System.out.println("We have a new employee " + getName() + ", a programmer.");
    }

    public Programmer(
            String name,
            int birthYear,
            int nbProjects,
            Vehicle vehicle
    ) {
        super(
                name,
                birthYear,
                vehicle
        );
        this.nbProjects = nbProjects;
        System.out.println("We have a new employee " + getName() + ", a programmer.");
    }

    public Programmer(
            String name,
            int birthYear,
            int nbProjects,
            double occupationRate,
            Vehicle vehicle
    ) {
        super(
                name,
                birthYear,
                occupationRate,
                vehicle
        );
        this.nbProjects = nbProjects;
        System.out.println("We have a new employee " + getName() + ", a programmer.");
    }


    //setter
    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }

    //getter
    public int getNbProjects() {
        return nbProjects;
    }

    public String contractInfo() {
        return getName() + " is a Programmer." + super.contractIs().toString();
    }

    public String toString() {
        double annualIncome = contractIs().accumulatedSalary() * 12;
        return super.toString() + "\n" +
                getName() + " has an Occupation rate: " + getOccupationRate() +
                "% and completed " + getNbProjects() +
                " projects.\nHis/Her estimated annual income is " + annualIncome;
    }
}
