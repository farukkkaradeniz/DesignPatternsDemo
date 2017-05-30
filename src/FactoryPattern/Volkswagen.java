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
public class Volkswagen extends Cars{
    
    private String carCost;
    
    private String carModele;
    
    private Boolean isCarOil;

    public Volkswagen(String carCost, String carModele, Boolean isCarOil) {
        this.carCost = carCost;
        this.carModele = carModele;
        this.isCarOil = isCarOil;
    }
    
    @Override
    public String getCostOfCar() {
        return this.carCost;
    }

    @Override
    public String getCarModel() {
        return this.carModele;
    }

    @Override
    public Boolean getisOilCar() {
        return this.isCarOil;
    }
    
}
