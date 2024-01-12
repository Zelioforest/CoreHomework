public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int trancgression;
    private int thePowerOfWitchcraft;

    public Hogwarts(String name, String surname, String faculty, int trancgression, int thePowerOfWitchcraft) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.trancgression = trancgression;
        this.thePowerOfWitchcraft = thePowerOfWitchcraft;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty(){
        return faculty;
    }

    public int getTrancgression() {
        return trancgression;
    }

    public int getThePowerOfWitchcraft() {
        return thePowerOfWitchcraft;
    }

    public void setTrancgression(int trancgression) {
        this.trancgression = trancgression;
    }

    public void setThePowerOfWitchcraft(int thePowerOfWitchcraft) {
        this.thePowerOfWitchcraft = thePowerOfWitchcraft;
    }

    public String toString() {
        return "Hogwarts: " +
                "name= " + name + " " + surname +
                ", trancgression= " + trancgression +
                ", thePowerOfWitchcraft= " + thePowerOfWitchcraft + "\n";
    }

    private int sumTalents(){
        return thePowerOfWitchcraft + trancgression;
    }


    public void compareTalents(Hogwarts other){
        if (sumTalents() > other.sumTalents()){
            System.out.println("Hogwarts: " + getName() + " лучше, чем " + other.getName());
        }else {
            System.out.println("Hogwarts: " +  other.getName() + " лучше, чем " + getName());
        }
    }
}
