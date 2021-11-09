package Hardware;

public class PowerSupply {

    public void startSupplyingPower(){
        System.out.println("Starting supplying power");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Supplying power on...");

    }

    public void stopSupplyingPower(){
        System.out.println("Shutdown supplying power");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Supplying power off...");
    }
}
