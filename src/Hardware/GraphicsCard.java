package Hardware;

public class GraphicsCard {

    public void on(){
        System.out.println("Graphicscard turning on...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Graphicscard on...");
    }

    public void off(){
        System.out.println("Graphicscard turning off..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Graphicscard off...");
    }

    public void displayGraphics(){
        System.out.println("Displaying graphics...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Graphics displayed...");
    }
}
