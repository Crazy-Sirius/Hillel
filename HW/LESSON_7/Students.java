/**
 * Created by toor on 06.03.17.
 */
public class Students {
    private int id;
    private String firstName;
    private String lastName;
    private Container marks = new Container();

    public Students(int id, String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        setLastName(lastName);
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void addMarks (int mark){
        this.marks.add(mark);
    }

    public String getFullName(){
        return this.firstName + "  " + this.lastName;
    }

    public int getId(){
        return this.id;
    }
}
