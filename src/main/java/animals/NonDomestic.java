package animals;

public class NonDomestic extends Animal{
    // constructors
    public NonDomestic(boolean eatsHumans, boolean isEndangered, boolean doesHunt, String habitat, int noOfLegs, String foodType, int age, boolean isFemale){
        super(noOfLegs, foodType, age, isFemale);
        this.setEatsHumans(eatsHumans);
        this.setEndangered(isEndangered);
        this.setDoesHunt(doesHunt);
        this.setHabitat(habitat);
    }

    public NonDomestic(){
        this(false, false, true, "unknown", 0, "unknown", 0, true);
    }


    @Override
    public String makeNoise() {
        return "ROARRRRRRR!";
    }

    @Override
    public String toString() {
        String base = super.toString();
        base += "\n Does this animal eat humans? " + getEatsHumans();
        base += "\n Is this animal endangered? " + getEndangered();
        base += "\n Does this animal hunt? " + getDoesHunt();
        base += "\n This animal lives in " + getHabitat();
        return base;
    }


    // variables
    private Boolean eatsHumans;
    private Boolean isEndangered;
    private Boolean doesHunt;
    private String habitat;

    //getters and setters
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Boolean getEatsHumans() {
        return eatsHumans;
    }

    public void setEatsHumans(Boolean eatsHumans) {
        this.eatsHumans = eatsHumans;
    }

    public Boolean getEndangered() {
        return isEndangered;
    }

    public void setEndangered(Boolean endangered) {
        isEndangered = endangered;
    }
    public Boolean getDoesHunt() {
        return doesHunt;
    }

    public void setDoesHunt(Boolean doesHunt) {
        this.doesHunt = doesHunt;
    }
}
