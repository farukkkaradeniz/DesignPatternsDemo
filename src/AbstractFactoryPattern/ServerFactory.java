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
public class ServerFactory implements ComputerAbstractFactory{

    String ram,hdd,cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    
    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
    
}
