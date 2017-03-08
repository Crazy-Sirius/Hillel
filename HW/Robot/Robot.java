package Robot;

/**
 * Created by toor on 07.03.17.
 */
public class Robot {
    private String name;
    private double x = 0;
    private double y = 0;
    protected double cource = 0;

    public Robot(double x, double y){
        this.x = x;
        this.y = y;

    }
    public Robot(String name){
        this.name = name;

    }
@Override
   public String toString(){
       return "Name is " +name;
   }

   public void printCoordinates(){
       System.out.print("X="+x+", y="+y);
   }

   public void forward(int distance){
       x = x + distance * Math.cos(cource / 180 *2*Math.PI);
       y = y + distance * Math.sin(cource / 180 *2*Math.PI);
   }
    public double getX(){
       return x;
    }

    public double getY(){
        return y;
    }
    public double getCource(){
        return cource;
    }
    public void setCource(int cource){
        this.cource = cource;
    }


}
