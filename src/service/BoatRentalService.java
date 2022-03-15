/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.BoatEntity;
import entity.BoatRentalEntity;

/**
 *
 * @author Gabi
 */
public interface BoatRentalService {
    
    public double daysPrice(BoatRentalEntity newRental);
    
}
