/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author Faruk
 */
public class BuilderPatternApp {
    public static void main(String[] args) {
        
        Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setIsEnabledBluetooth(true)
				.setIsEnabledGraphicsCard(true).build();
        
        System.out.println(comp.getCpu());
        
    }
}
