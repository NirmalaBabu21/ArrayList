import java.util.ArrayList;

public class add
{
    public static void main(String arg[])
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(90);
        list1.add(10);
        list1.add(5);
        System.out.println(list1);
        list1.add(1,1);
        System.out.println(list1);

    }

}