public class WasteContainer {
    private String wasteType;
    private int capacity;
    private int currentLevel;

    public WasteContainer(String wasteType, int capacity, int currentLevel) {
        this.wasteType = wasteType.toLowerCase();
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public String getWasteType() {
        return wasteType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public void emptyContainer() {
        currentLevel = 0;
    }
}