/**
 * Created by toor on 06.03.17.
 */

public class Main {
    public static void main(String[] args) {
        Container containerTest = new Container();
        int [] s = {1,2,3,4,5,6};
        containerTest.addArrayToContainer(s);
        containerTest.add(12);
        System.out.println(containerTest.getElement(0));
        System.out.print(containerTest.getElement(7));
    }
}
