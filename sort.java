import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String args[])
    {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(90);
        list1.add(7);
        list1.add(0);
        list1.add(79);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
