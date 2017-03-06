package LESSON_8;

import java.awt.*;

/**
 * Created by toor on 06.03.17.
 */
public class ArrayList {
    private Object[] list;
    private int size;

    public ArrayList() {
        this.size = 10;
        this.list = new Object[10];
    }
    public int getSize(Object o){
        return size;
    }

    public int getElIndex(Object o,){
        return this.list.;
    }
    public void setEl(Object o){
        Object[] newList = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        newList[size] = o;
        list = newList;
        size++;

    }

    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        System.out.print(test.list.length);
    }
}
