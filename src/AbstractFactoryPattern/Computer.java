/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author Faruk
 */
public abstract class Computer {
    
    public abstract String getRam();
    
    public abstract String getHdd();
    
    public abstract String getCpu();

    @Override
    public String toString() {
        return "Computer{" +
                "ram:" + getRam() + "\n" + 
                "hdd:" + getHdd()+ "\n" + 
                "cpu:" + getCpu()+ "\n" + 
                '}';
    }
    
    
}
