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
public class Computer {

    private String ram;

    private String cpu;

    private Boolean isEnabledBluetooth;

    private Boolean isEnabledGraphicsCard;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.isEnabledBluetooth = builder.isEnabledBluetooth;
        this.isEnabledGraphicsCard = builder.isEnabledGraphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Boolean getIsEnabledBluetooth() {
        return isEnabledBluetooth;
    }

    public void setIsEnabledBluetooth(Boolean isEnabledBluetooth) {
        this.isEnabledBluetooth = isEnabledBluetooth;
    }

    public Boolean getIsEnabledGraphicsCard() {
        return isEnabledGraphicsCard;
    }

    public void setIsEnabledGraphicsCard(Boolean isEnabledGraphicsCard) {
        this.isEnabledGraphicsCard = isEnabledGraphicsCard;
    }

    public static class ComputerBuilder {

        private String ram;

        private String cpu;

        private Boolean isEnabledBluetooth;

        private Boolean isEnabledGraphicsCard;

        public ComputerBuilder(String ram,String cpu) {
            
            this.ram = ram;
            
            this.cpu = cpu;
            
        }
        
        public ComputerBuilder setIsEnabledBluetooth(Boolean isEnabledBluetooth){
        
            this.isEnabledBluetooth = isEnabledBluetooth;
            
            return this;
            
        }
        
        public ComputerBuilder setIsEnabledGraphicsCard(Boolean isEnabledGraphiscCard){
        
            this.isEnabledGraphicsCard = isEnabledGraphiscCard;
            return this;
            
        }
        
        public Computer build(){
        
            return new Computer(this);
            
        }
        
        

    }

}
