package commands;

import devices.ElectronicDevice;

public class VolumenDownRadio implements Command {
 
    private ElectronicDevice device;

    public VolumenDownRadio(ElectronicDevice device){
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
