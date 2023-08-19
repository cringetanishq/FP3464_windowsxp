public class Manager extends Employee {
    private int nbTravelDays;
    private int nbClients;

    public Manager(
            String name,
            int birthYear,
            int nbTravelDays,
            int nbClients
    ) {
        super(
                name,
                birthYear
        );
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new employee " + getName() + ", a manager.");
    }

    public Manager(
            String name,
            int birthYear,
            int nbTravelDays,
            int nbClients,
            double occupationRate
    ) {
        super(
                name,
                birthYear,
                occupationRate
        );
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new employee " + getName() + ", a manager.");
    }

    public Manager(
            String name,
            int birthYear,
            int nbTravelDays,
            int nbClients,
            Vehicle vehicle
    ) {
        super(
                name,
                birthYear,
                vehicle
        );
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new employee " + getName() + ", a manager.");
    }

    public Manager(
            String name,
            int birthYear,
            double occupationRate,
            int nbTravelDays,
            int nbClients,
            Vehicle vehicle
    ) {
        super(
                name,
                birthYear,
                occupationRate,
                vehicle
        );
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new employee " + getName() + ", a manager.");
    }


    //setter
    public void setNbTravelDays(int nbTravelDays) {
        this.nbTravelDays = nbTravelDays;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    //Getter
    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }


    @Override
    public String contractInfo() {
        return getName() + " is a Manager." + super.contractIs().toString();
    }

    @Override
    public String toString(){
        double annualIncome = contractIs().accumulatedSalary() *12;
        return super.toString() + "\n" +
                getName() + " has an Occupation rate: " + getOccupationRate() +
                "% He/She travelled " + getNbTravelDays() +
                " days and has brought " + getNbClients() +
                " new clients.\nHis/Her estimated annual income is " + annualIncome;
    }
}