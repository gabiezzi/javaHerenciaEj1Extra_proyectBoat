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
public final class SailBoatEntity extends BoatEntity {
    
    
    private int mastNumber;

    public SailBoatEntity() {
    }

    public SailBoatEntity(int mastNumber, String boatRegistration, double boatLength, int boatManufacturingYear) {
        super(boatRegistration, boatLength, boatManufacturingYear);
        this.mastNumber = mastNumber;
    }

    public int getMastNumber() {
        return mastNumber;
    }

    public void setMastNumber(int mastNumber) {
        this.mastNumber = mastNumber;
    }

    @Override
    public String toString() {
        return "SailBoatEntity{" + super.toString() +"mastNumber=" + mastNumber + '}';
    }
    
    
}
