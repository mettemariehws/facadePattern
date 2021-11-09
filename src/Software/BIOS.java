package Software;

public class BIOS {

    private OperativtSystem OS;

    public BIOS(){
        OS = new OperativtSystem();
    }

    public void runPowerOnSelfTest(){
        System.out.println("Running power on self test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Power self test complete");
    }

    public void findBootDevice(){
        System.out.println("Finding boot device");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Boot device found");
    }

    public void loadOS(){
        System.out.println("Loading OS");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OS located and loaded");
    }

    public void transControlToOS(){
        System.out.println("Tranfering control to OS");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
