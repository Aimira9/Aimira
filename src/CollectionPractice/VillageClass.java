package CollectionPractice;

public class VillageClass {

    private String name, villageId;
    private long population;
    private long totalArea;

    public VillageClass(String name, String villageId, long population, long totalArea) {
    }

    public void villageInfo() {
        System.out.println(getName() + " " + getVillageId() + " " + getPopulation() + " " + getTotalArea());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(long totalArea) {
        this.totalArea = totalArea;
    }
}







