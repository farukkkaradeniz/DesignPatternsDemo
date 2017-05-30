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
public abstract class Cars {

    public abstract String getCostOfCar();

    public abstract String getCarModel();

    public abstract Boolean getisOilCar();

    @Override
    public String toString() {
        return "cost : " + getCostOfCar() + "\n" + "model : " + getCarModel() + "\n isOil : " + getisOilCar();
    }

}
