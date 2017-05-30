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
public class FactoryPatternApp {
    public static void main(String[] args) {
        
        Cars jetta = CarFactory.getCar(CarsModele.VOLKSWAGEN, "$70.000", "2016", Boolean.TRUE);
        
        Cars amg = CarFactory.getCar(CarsModele.MERCEDES, "$60.000", "2015", Boolean.FALSE);
        
        System.out.println(jetta);
        
        System.out.println(amg);
        
    }
}
