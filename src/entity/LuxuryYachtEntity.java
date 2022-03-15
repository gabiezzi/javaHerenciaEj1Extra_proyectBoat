/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public final class LuxuryYachtEntity extends MotorBoatEntity{
    
    
    private int cabinNumbers;

    public LuxuryYachtEntity() {
    }

    public LuxuryYachtEntity(int cabinNumbers, double powerCV, String boatRegistration, double boatLength, int boatManufacturingYear) {
        super(powerCV, boatRegistration, boatLength, boatManufacturingYear);
        this.cabinNumbers = cabinNumbers;
    }


    public int getCabinNumbers() {
        return cabinNumbers;
    }

    public void setCabinNumbers(int cabinNumbers) {
        this.cabinNumbers = cabinNumbers;
    }

    @Override
    public String toString() {
        return "luxuryYachtEntity{" + super.toString() + "cabinNumbers=" + cabinNumbers + '}';
    }
    
    
    
    
}
