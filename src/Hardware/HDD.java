package Hardware;

public class HDD {

    public void startUp(){
        System.out.println("Starting HDD...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HHD on...");

    }

    public void shutDown(){
        System.out.println("Stoping HDD...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HDD off...");
    }

    public void saveData(){
        System.out.println("Saving data to HDD...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Data saved to HDD...");

    }

    public void getData(){
        System.out.println("Fetching data from HDD...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Showing data from HDD...");

    }

}
