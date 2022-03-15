/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.BoatRentalEntity;

/**
 *
 * @author Gabi
 */
public interface OrchestaService {
    
    public void chargeBoatsList();
    public void chargeRents();
    public double daysPrice(BoatRentalEntity newRental);
    public Double selectCostumer(String nameCostumer);
    public void menu();
    
}
