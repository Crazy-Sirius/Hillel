package Robot;

/**
 * Created by toor on 07.03.17.
 */
public class NewRobot extends Robot {

    public NewRobot(double x, double y, int cource){
        super(x, y);
        this.cource = 20;
    }

    public void goBack(int distance){
        forward(-distance);
    }

    public String toString(){
        return "Pereopredelen";
    }
}
