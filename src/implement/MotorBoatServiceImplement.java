/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.BoatEntity;
import entity.MotorBoatEntity;
import entity.SailBoatEntity;
import service.BoatEntityService;

/**
 *
 * @author Gabi
 */
public class MotorBoatServiceImplement implements BoatEntityService {
    
    @Override
    public double addedPrice(BoatEntity newBoat) {
       
        MotorBoatEntity newMotorBoat = (MotorBoatEntity) newBoat;
        
        if (newMotorBoat.getPowerCV()<75&& newMotorBoat.getPowerCV()>=40) {
            
            return 20 ;
        } else if (newMotorBoat.getPowerCV()<140&& newMotorBoat.getPowerCV()>=75) {
            return 30;
        } else if ((newMotorBoat.getPowerCV()<=140&& newMotorBoat.getPowerCV()>=300)) {
            return 40;
        }
         return 0;
    }
    
}
