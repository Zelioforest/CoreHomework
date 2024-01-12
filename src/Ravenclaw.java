public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, String faculty, int trancgression, int thePowerOfWitchcraft, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, surname, faculty, trancgression, thePowerOfWitchcraft);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }


    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + " Ravenclaw: " +
                ", smart= " + smart +
                ", wise= " + wise +
                ", witty= " + witty +
                ", fullOfCreativity= " + fullOfCreativity;
    }

    private int sumTalents(){
        return smart + wise + witty + fullOfCreativity;
    }

    public void compareTalents(Ravenclaw other){
        if (sumTalents() > other.sumTalents()){
            System.out.println("Ravenclaw: " + getName() + " лучше, чем " + other.getName());
        }else {
            System.out.println("Ravenclaw: " + other.getName() + " лучше, чем " + getName());
        }
    }
}
