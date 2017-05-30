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
public class AbstractFactoryApp {
    
    public static void main(String[] args) {
        
        
        Computer pc = ComputerFactory.getComputer(new PCFactory("ram","hdd","cpu"));
        
        Computer server = ComputerFactory.getComputer(new ServerFactory("Server ram", "Seagete 3 tb 7200 rmp", "Intel i7 7700K"));
        
        System.out.println(pc.toString());
        
        System.out.println(server.toString());
    }
    
}
