public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, String faculty, int trancgression, int thePowerOfWitchcraft, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, faculty, trancgression, thePowerOfWitchcraft);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }


    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + " Slytherin: " +
                " cunning= " + cunning +
                ", determination= " + determination +
                ", ambition= " + ambition +
                ", resourcefulness= " + resourcefulness +
                ", thirstForPower= " + thirstForPower;
    }

    private int sumTalents(){
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }


    public void compareTalents(Slytherin other){
        if (sumTalents() > other.sumTalents()){
            System.out.println("Slytherin: " + getName() + " лучше, чем " + other.getName());
        }else {
            System.out.println("Slytherin: " + other.getName() + " лучше, чем " + getName());
        }
    }
}
