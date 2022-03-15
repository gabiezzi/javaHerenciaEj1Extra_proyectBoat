/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.BoatEntity;
import entity.LuxuryYachtEntity;
import service.BoatEntityService;

/**
 *
 * @author Gabi
 */
public class LuxuryYachtServiceImplement implements BoatEntityService{
    
    MotorBoatServiceImplement newMotorService ;

    public LuxuryYachtServiceImplement() {
    newMotorService = new MotorBoatServiceImplement();
    }

    @Override
    public double addedPrice(BoatEntity newBoat) {
        
        LuxuryYachtEntity newYacht = (LuxuryYachtEntity)newBoat;
        
        return newMotorService.addedPrice(newYacht) + newYacht.getCabinNumbers() * 5 ;

    }
    
    
    
}
