public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, String faculty, int trancgression, int thePowerOfWitchcraft, int nobility, int honor, int bravery) {
        super(name, surname, faculty, trancgression, thePowerOfWitchcraft);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + " Gryffindor: " +
                "nobility= " + nobility +
                ", honor= " + honor +
                ", bravery= " + bravery;
    }

    private int sumTalents(){
        return nobility + honor + bravery;
    }

    public void compareTalents(Gryffindor other){
        if (sumTalents() > other.sumTalents()){
            System.out.println(getFaculty() + ": " + getName() + " лучше, чем " + other.getName());
        }else {
            System.out.println(getFaculty() + ": " + other.getName() + " лучше, чем " + getName());
        }
    }
}

