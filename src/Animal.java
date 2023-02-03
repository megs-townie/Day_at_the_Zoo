class Animal {

    //region Variables
    private String species;
    private int maxWeight;
    private String habitat;
    private boolean isEndangered;
    //endregion

    //region Constructor
    public Animal() {
        this.species = "Unknown";
        this.maxWeight = 0;
        this.habitat = "Unknown";
        this.isEndangered = false;
    }

    public Animal(String species, int maxWeight, String habitat, boolean isEndangered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    // endregion

    //region Getters and Setters

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    //endregion

    //region Animal Status

    public void feed() {
        System.out.println(species + " has been fed");
    }

    public void makeSound() {
        System.out.println(species + " makes a sound");
    }

    public String toString() {
        return "I am a " + maxWeight + "lb " + species + " that lives in the " + habitat + ". I am an endangered species: " + isEndangered;
    }
    //endregion
}
