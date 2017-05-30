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
public class Server extends Computer{

    private String ram;
    
    private String hdd;
    
    private String cpu;
    
    public Server(String ram,String hdd,String cpu){
    
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        
    }
    
    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
    
}
