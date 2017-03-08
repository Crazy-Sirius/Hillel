package Robot;

/**
 * Created by toor on 07.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot(10, 0);
        // r1.x = 10;
        // r1.y = 20;

        //  r1.cource = 15;
        //  r1.forward(20);
        r1.setCource(45);
        r1.forward(100);
        System.out.println("X=" + r1.getX() + ", Y=" + r1.getY());


        NewRobot rb2 = new NewRobot(10, 10, 10);
        rb2.setCource(123);
        rb2.cource =10;
        System.out.println(rb2.getCource());
        System.out.println(r1.toString());
        Robot rbName = new Robot("TErmoS");
        System.out.println(rbName.toString());
        NewRobot newNameRobot = new NewRobot(10,2,33);
        System.out.println(newNameRobot.toString());
    }
}
