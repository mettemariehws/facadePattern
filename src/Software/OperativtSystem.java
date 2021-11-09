package Software;

public class OperativtSystem {

    public OperativtSystem(){}

    public void showWelcomeScreen(){
        System.out.println("Welcome screen");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
