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
public class MotorBoatEntity extends BoatEntity {
 
    protected double powerCV;

    public MotorBoatEntity() {
    }

    public MotorBoatEntity(double powerCV, String boatRegistration, double boatLength, int boatManufacturingYear) {
        super(boatRegistration, boatLength, boatManufacturingYear);
        this.powerCV = powerCV;
    }

    public double getPowerCV() {
        return powerCV;
    }

    public void setPowerCV(double powerCV) {
        this.powerCV = powerCV;
    }

    @Override
    public String toString() {
        return "MotorBoatEntity{ "+ super.toString() + " powerCV=" + powerCV + '}';
    }
    
    
}
