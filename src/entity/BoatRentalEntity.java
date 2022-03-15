/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Gabi
 */
public class BoatRentalEntity {

    private String costumerName;
    private int dniName;
    private Date rentalDate;
    private Date returnDate;
    private BoatEntity rentedBoat;
    private boolean mooringPosition;
    private double rentalPrice;

    public BoatRentalEntity(String costumerName, int dniName, Date rentalDate, Date returnDate, boolean mooringPosition) {
        this.costumerName = costumerName;
        this.dniName = dniName;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.rentalPrice = rentalPrice;
    }

    public BoatRentalEntity() {
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public int getDniName() {
        return dniName;
    }

    public void setDniName(int dniName) {
        this.dniName = dniName;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public BoatEntity getRentedBoat() {
        return rentedBoat;
    }

    public void setRentedBoat(BoatEntity rentedBoat) {
        this.rentedBoat = rentedBoat;
    }

    public boolean isMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(boolean mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public double getRentalPrice() {

        return rentalPrice;

    }
    
    public void setRentalPrice(double RentalPrice){
        
        this.rentalPrice = rentalPrice;
        
    }

    @Override
    public String toString() {
        return "BoatRental{" + "costumerName=" + costumerName + ", dniName=" + dniName + ", rentalDate=" + rentalDate + ", returnDate=" + returnDate + ", rentedBoat=" + rentedBoat + ", mooringPosition=" + mooringPosition + '}';
    }

}
