/**
 * Created by toor on 06.03.17.
 */
public class Container {
    private int [] container;

    public Container(){
        this.container = new int[1];
        this.container[0] = 0;
    }

    public void add(int elem) {
        int [] tmp = new int[this.container.length+1];
        for (int i =0;  i < container.length ; i++){
            tmp[i] = this.container[i];
        }
        this.container = tmp;
        this.container[this.container.length -1 ] = elem;
    }

    public int getElement (int indexOfElement){
        return this.container[indexOfElement];
    }

    public int getSize(){
        return this.container.length;
    }

    public boolean isElementIn(int elem){
        for (int count : this.container){
            if (count == elem) {
                return true;
            }
        }
        return false;
    }

    public void addArrayToContainer (int [] addCont){
        int arrayLength = container.length;
        int [] tmp = new int[arrayLength + addCont.length];
        int tmpLength = tmp.length;
        for (int i=0; i< tmpLength; i++){
            if (i < this.container.length) {
                tmp[i] = container[i];
            } else {
                tmp[i] = addCont[i - arrayLength];
            }
        }
        container = tmp;
    }
    public void clean(){
        for (int i : container){
            container[i] = 0;
        }
    }
    public int indexOfElement(int elem) {
        for (int i : container) {
            if (elem == container[i]) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Container containerTest = new Container();
        int [] s = {1,2,3,4,5,6};
        containerTest.addArrayToContainer(s);
        containerTest.add(12);
        System.out.println(containerTest.getElement(0));
        System.out.print(containerTest.getElement(7));
    }



}
