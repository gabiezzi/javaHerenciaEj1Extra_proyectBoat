package entity;

public abstract class BoatEntity {
    
    protected String boatRegistration;
    protected double boatLength;
    protected int boatManufacturingYear;

    public BoatEntity(String boatRegistration, double boatLength, int boatManufacturingYear) {
        this.boatRegistration = boatRegistration;
        this.boatLength = boatLength;
        this.boatManufacturingYear = boatManufacturingYear;
    }

    public String getBoatRegistration() {
        return boatRegistration;
    }

    public double getBoatLength() {
        return boatLength;
    }

    public int getBoatManufacturingYear() {
        return boatManufacturingYear;
    }

    public BoatEntity() {
    }

    @Override
    public String toString() {
        return "boatRegistration=" + boatRegistration + ", boatLength=" + boatLength + ", boatManufacturingYear=" + boatManufacturingYear + '}';
    }
    
    
    
    
}