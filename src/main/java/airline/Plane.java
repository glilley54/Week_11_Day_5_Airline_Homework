package airline;

public class Plane {

    private String type;
    private int capacity;
    private int totalWeight;

    public Plane(String type, int capacity, int totalWeight) {
        this.type = type;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
}
