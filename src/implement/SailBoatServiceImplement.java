/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.BoatEntity;
import entity.SailBoatEntity;
import service.BoatEntityService;

/**
 *
 * @author Gabi
 */
public class SailBoatServiceImplement implements BoatEntityService {

    @Override
    public double addedPrice(BoatEntity newBoat) {
       
        SailBoatEntity newSailBoat = (SailBoatEntity) newBoat;
        
        return newSailBoat.getMastNumber()* 10 ;
    }

   
    
}
