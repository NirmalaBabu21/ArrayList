import java.util.ArrayList;

public class set {
    public static void main(String args[])
    {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(10);
        list1.add(90);
        list1.add(50);
        System.out.println(list1);

        list1.set(1,85);
        System.out.println(list1);
    }
    
}
