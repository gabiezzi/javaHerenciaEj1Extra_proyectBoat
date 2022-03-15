/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.BoatEntity;
import entity.BoatRentalEntity;
import entity.LuxuryYachtEntity;
import entity.MotorBoatEntity;
import entity.SailBoatEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import service.BoatRentalService;
import service.OrchestaService;

/**
 *
 * @author Gabi
 */
public class OrchestaServiceImplement implements BoatRentalService, OrchestaService {

    ArrayList<BoatEntity> boats;

    ArrayList<BoatRentalEntity> rents;

    Scanner sc;

    LuxuryYachtServiceImplement newYachtService;

    MotorBoatServiceImplement newMotorService;

    SailBoatServiceImplement newSailService;

    public OrchestaServiceImplement() {

        boats = new ArrayList<BoatEntity>();

        rents = new ArrayList<BoatRentalEntity>();

        sc = new Scanner(System.in);

        newYachtService = new LuxuryYachtServiceImplement();

        newMotorService = new MotorBoatServiceImplement();

        newSailService = new SailBoatServiceImplement();

    }

    public void chargeBoatsList() {

        boats.add(new SailBoatEntity(3, "IDV555", 10, 1999));
        boats.add(new SailBoatEntity(1, "TJJ654", 3, 2019));

        boats.add(new MotorBoatEntity(45, "XCC333", 10, 2019));
        MotorBoatEntity newMotor2 = new MotorBoatEntity(79, "DFH773", 3, 2020);
        boats.add(newMotor2);

        LuxuryYachtEntity newYacht1 = new LuxuryYachtEntity(10,100, "SUB000", 10, 2020);
        LuxuryYachtEntity newYacht2 = new LuxuryYachtEntity(5,120, "ESC666", 12, 2022);
        
        boats.add(newYacht1);
        boats.add(newYacht2);
    }

    public void chargeRents() {

        rents.add(new BoatRentalEntity("Armando", 33434, new Date(122, 2, 11), new Date(122, 3, 11), true));
        rents.get(0).setRentedBoat(boats.get(0));
        rents.add(new BoatRentalEntity("Laura", 33434, new Date(122, 2, 28), new Date(122, 3, 2), true));
        rents.get(1).setRentedBoat(boats.get(1));
        rents.add(new BoatRentalEntity("Gabriel", 33434, new Date(122, 3, 14), new Date(122, 3, 16), true));
        rents.get(2).setRentedBoat(boats.get(2));
        rents.add(new BoatRentalEntity("Fernando", 33434, new Date(122, 3, 11), new Date(122, 6, 11), true));
        rents.get(3).setRentedBoat(boats.get(3));
        rents.add(new BoatRentalEntity("Agustin", 33434, new Date(122, 4, 3), new Date(122, 4, 11), true));
        rents.get(4).setRentedBoat(boats.get(4));
        rents.add(new BoatRentalEntity("Marcos", 33434, new Date(122, 5, 4), new Date(122, 5, 27), true));
        rents.get(5).setRentedBoat(boats.get(5));

    }

    @Override
    public double daysPrice(BoatRentalEntity newRental) {

        long timeDiff = newRental.getReturnDate().getTime() - newRental.getRentalDate().getTime();

        int daysDiff = (int) (timeDiff / (1000 * 60 * 60 * 24));

        System.out.println("the days " + daysDiff);
        return (daysDiff * 2d) + (newRental.getRentedBoat().getBoatLength() * 1d);
    }

    @Override
    public Double selectCostumer(String nameCostumer) {

        
        
        String selectCostumerTitle = "The price of the costumer " + nameCostumer + " is  ";

        for (BoatRentalEntity unitaryRent : rents) {

            if (unitaryRent.getCostumerName().equalsIgnoreCase(nameCostumer)) {

                if (unitaryRent.getRentedBoat() instanceof LuxuryYachtEntity) {
                    LuxuryYachtEntity luxuryYachtEntity = (LuxuryYachtEntity) unitaryRent.getRentedBoat();

                     
                     return daysPrice(unitaryRent) + newYachtService.addedPrice(luxuryYachtEntity);

                } else if (unitaryRent.getRentedBoat() instanceof SailBoatEntity) {
                    SailBoatEntity sailBoatEntity = (SailBoatEntity) unitaryRent.getRentedBoat();

                     return daysPrice(unitaryRent) + newSailService.addedPrice(sailBoatEntity);

                } else if (unitaryRent.getRentedBoat() instanceof MotorBoatEntity) {
                    MotorBoatEntity motorBoatEntity = (MotorBoatEntity) unitaryRent.getRentedBoat();

                    return daysPrice(unitaryRent) + newMotorService.addedPrice(motorBoatEntity);

                }

            }

        }

        return 0d;
    }

    public void menu() {

        chargeBoatsList();
        chargeRents();
        System.out.println("Insert the name costumer;");
        String nameCostumer = sc.next();
        System.out.println("The price is " + selectCostumer(nameCostumer));

    }

}
