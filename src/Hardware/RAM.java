package Hardware;

public class RAM {

    public void startUp(){
        System.out.println("Starting RAM...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RAM on...");

    }

    public void shutDown(){

        System.out.println("Stoping RAM...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RAM off...");
    }
}
