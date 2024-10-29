package animals;

public class Domestic extends Animal {

    // constructors
    public Domestic(boolean requiresExercise, boolean isTrained, String ownerName, String petName, int noOfLegs, String foodType, int age, boolean isFemale) {
        super(noOfLegs, foodType, age, isFemale);
        this.setRequiresExercise(requiresExercise);
        this.setTrained(isTrained);
        this.setOwnerName(ownerName);
        this.setPetName(petName);
    }

    public Domestic(){
        this(true, false, "unknown", "unknown", 0, "Royal Canin", 0, true);
    }


    @Override
    public String makeNoise() {
        return "Meowwww!";
    }

    @Override
    public String toString() {
        String base = super.toString();
        base += "\n Does this animal require exercise? " + getIsTrained();
        base += "\n Is this animal trained? " + getIsTrained();
        base += "\n My owner's name is " + getOwnerName();
        base += "\n My name is " + getPetName();
        return base;
    }

    // variables
    private boolean requiresExercise;
    private boolean isTrained;
    private String ownerName;
    private String petName;



    // getters and setters
    public boolean getRequiresExercise() {
        return requiresExercise;
    }

    public void setRequiresExercise(boolean requiresExercise) {
        this.requiresExercise = requiresExercise;
    }

    public boolean getIsTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


}