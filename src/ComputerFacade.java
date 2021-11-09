import Hardware.*;
import Software.BIOS;
import Software.OperativtSystem;

public class ComputerFacade {
    //--------------|| Hardware ||--------------//
    private GraphicsCard graphicsCard = new GraphicsCard();
    private HDD hdd = new HDD();
    private MotherBoard motherBoard = new MotherBoard();
    private PowerSupply powerSupply = new PowerSupply();
    private Processor processor = new Processor();
    private RAM ram = new RAM();

    //--------------|| Software ||--------------//
    private BIOS bios = new BIOS();
    private OperativtSystem operativtSystem = new OperativtSystem();

    public void turnOn(){

    }

    public void turnOff(){
        System.out.println("Shutting down");
    }
}
