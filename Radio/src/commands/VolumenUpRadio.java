package commands;

import devices.ElectronicDevice;

public class VolumenUpRadio implements Command {
    

    private ElectronicDevice device;

    public VolumenUpRadio(ElectronicDevice device) {
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