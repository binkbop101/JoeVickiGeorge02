package animals;

public abstract class Animal {

    // constructor
    public Animal(int noOfLegs, String foodType, int age, boolean isFemale){
        this.setNoOfLegs(noOfLegs);
        this.setFoodType(foodType);
        this.setAge(age);
        this.setFemale(isFemale);
    }

    public Animal(){
        this(0, "Unknown", 0, false);
    }

    @Override
    public String toString() {
        String info = "This animal has " + this.getNoOfLegs() + " legs";
        info += "\n it eats " + this.getFoodType();
        info += "\n it is " + this.getAge() + " years old";
        info += "\n is it female??..." + this.getIsFemale();
         return info;
    }

    // variables
    private int noOfLegs;
    private String foodType;
    private int age;
    private boolean isFemale;

    // getters and setters
    public int getNoOfLegs() {
        return noOfLegs;
    }
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    public String getFoodType() {
        return foodType;
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean getIsFemale() {
        return isFemale;
    }
    public void setFemale(boolean female) {
        isFemale = female;
    }

    // methods
    public abstract String makeNoise();

    public String eatFood(){
        return "Yummy! I love " + this.getFoodType();
    }

}
