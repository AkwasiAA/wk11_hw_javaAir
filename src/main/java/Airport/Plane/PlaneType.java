package Airport.Plane;

public enum PlaneType {

    BOEING777(368, 134800),
    AIRBUSA380(555, 277000),
    EMBRAER190(98, 27750),
    BOMBARDIERGLOBAL7500(19, 27987);

    private final int maxCapacity;
    private final double totalWeight;

    PlaneType(int maxCapacity, double totalWeight){
        this.maxCapacity = maxCapacity;
        this.totalWeight = totalWeight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
