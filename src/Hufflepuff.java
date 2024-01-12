public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private  int honest;

    public Hufflepuff(String name, String surname, String faculty, int trancgression, int thePowerOfWitchcraft, int hardworking, int loyal, int honest) {
        super(name, surname, faculty, trancgression, thePowerOfWitchcraft);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }


    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + " Hufflepuff: "  +
                "hardworking= " + hardworking +
                ", loyal= " + loyal +
                ", honest= " + honest;
    }

    private int sumTalents(){
        return hardworking + loyal + honest;
    }

    public void compareTalents(Hufflepuff other){
        if (sumTalents() > other.sumTalents()){
            System.out.println("Hufflepuff: " + getName() + " лучше, чем " + other.getName());
        }else {
            System.out.println("Hufflepuff: " + other.getName() + " лучше, чем " + getName());
        }
    }
}
