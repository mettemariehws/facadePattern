package Hardware;

public class Processor {

    public void startUp(){
        System.out.println("Starting processor...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processor started...");

    }

    public void shutDown(){
        System.out.println("stopping processor...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processor off...");

    }

    public void startCalculation(){
        System.out.println("Processor calculating started...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processor calculation done...");

    }

    public void shutDataFlow(){
        System.out.println("Processor dataflow begins...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processor dataflow done...");

    }
}
