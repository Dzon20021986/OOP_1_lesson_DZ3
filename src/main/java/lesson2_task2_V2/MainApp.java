package lesson2_task2_V2;


import java.util.ArrayList;

public class MainApp {
    @Override
    public String toString() {
        return "MainApp{}";
    }

    public static void main(String[] args) {
        ArrayList<Integer> list;
        list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(3, 7);
        list.add(8);
        list.add(9);

        for (Object o : list)
            System.out.print(" " + o);

        list.remove(2);


        for (Object o : list)
            System.out.print(" " + o);

        for (Object o : list)
            System.out.print(" " +  o.getClass().getName());




    }
}
