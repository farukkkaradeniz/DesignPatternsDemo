/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Faruk
 */
public class CarFactory {

    public static Cars getCar(CarsModele model, String carCost, String carModele, Boolean isOil) {
        switch (model) {
            case VOLKSWAGEN:
                return new Volkswagen(carCost, carModele, isOil);
            case MERCEDES:
                return new Mercedes(carCost, carModele, isOil);
            default:
                throw new IllegalStateException("Car Modele did not find. Please check");
        }
    }

}
