package commands;

import devices.ElectronicDevice;

public class VolumenUpTelevision implements Command {
    

    private ElectronicDevice device;

    public VolumenUpTelevision(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
    device.volumenUp();
    }
    
    @Override
    public void undo() {
    device.volumenDown();
    }

    
}
