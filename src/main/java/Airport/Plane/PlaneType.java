package Airport.Plane;

public enum PlaneType {

    BOEING777(368, 334300),
    AIRBUSA380(555, 575000),
    EMBRAER190(98, 50300),
    BOMBARDIERGLOBAL7500(19, 52096);

    private final int maxCapacity;
    private final double totalWeight;

    PlaneType(int maxCapacity, double totalWeight){
        this.maxCapacity = maxCapacity;
        this.totalWeight = totalWeight;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}
