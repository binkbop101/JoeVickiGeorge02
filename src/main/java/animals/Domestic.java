package animals;

public class Domestic extends Animal {

    // constructors
    public Domestic(boolean requiresExercise, boolean isTrained, String ownerName, String petName) {
        this.setRequiresExercise(requiresExercise);
        this.setTrained(isTrained);
        this.setOwnerName(ownerName);
        this.setPetName(petName);
    }

    public Domestic(){
        this(true, false, "unknown", "unknown");
    }


    // variables
    private boolean requiresExercise;
    private boolean isTrained;
    private String ownerName;
    private String petName;


    // getters and setters
    public boolean isRequiresExercise() {
        return requiresExercise;
    }

    public void setRequiresExercise(boolean requiresExercise) {
        this.requiresExercise = requiresExercise;
    }

    public boolean isTrained() {
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