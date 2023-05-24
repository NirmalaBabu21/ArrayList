import java.util.ArrayList;
public class delete {
    public static void main(String args[])
    {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(90);
        list1.add(80);
        list1.add(40);
        list1.add(20);

        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);
        System.out.println("Size of ArrayList:"+list1.size());
    }
}
