package Hardware;

public class MotherBoard {

    public void startUp(){
        System.out.println("Starting mobo...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mobo started...");

    }

    public void shutDown(){
        System.out.println("Stoping mobo...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mobo off..");

    }
}
