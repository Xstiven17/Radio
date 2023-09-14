import commands.TurnOffTelevision;
import commands.TurnOnTelevision;
import commands.VolumenDownTelevision;
import commands.VolumenUpTelevision;
import devices.ElectronicDevice;
import devices.Television;


public class App{
    public static void main(String[] args) throws Exception{
        ElectronicDevice televisionOne = new Television("LG");
        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.pressUndo();

        VolumenUpTelevision volUpCommand = new VolumenUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        VolumenDownTelevision volDownCommand = new VolumenDownTelevision(televisionOne);
        onPressed = new DeviceButton(volDownCommand);
        onPressed.pressUndo();
    }
}