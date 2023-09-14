package commands;

import devices.ElectronicDevice;

public class VolumenDownTelevision implements Command {
 
    private ElectronicDevice device;

    public VolumenDownTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
    device.volumenDown();
    }

    @Override
    public void undo() {
    device.volumenUp();
        
    }

}
