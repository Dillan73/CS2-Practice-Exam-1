public class Alien {
    private Integer energyLevel;
    private Integer hostilityIndex;

    Alien(Integer energyLevel, Integer hostilityIndex){
        this.energyLevel = energyLevel;
        this.hostilityIndex = hostilityIndex;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer getHostilityIndex() {
        return hostilityIndex;
    }

    public void setHostilityIndex(Integer hostilityIndex) {
        this.hostilityIndex = hostilityIndex;
    }

    void printInfo(){
        System.out.println("This Alien's energy level is: " + energyLevel + " and its hostility index is: " + hostilityIndex);
    }
}
