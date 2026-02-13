interface vehicle{

    void start();
    void stop();

}
interface features {
    void fourwheel();
    void metalbody();
}
class car implements vehicle,features{

    public void fourwheel() {
        System.out.println("4");
    }
    public void metalbody() {
        System.out.println("metalbody");
    }
    public void stop() {
        System.out.println("stop");

    }

    public void start() {
        System.out.println("car is start");
    }
}
public class demo {
    public static void main(String[] args) {

        car v1=new car();
        v1.fourwheel();
        v1.metalbody();
        v1.start();
        v1.stop();
    }
}