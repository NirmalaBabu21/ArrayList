import java.util.ArrayList;

public class loop {
    public static void main(String args[])
    {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(80);
        list1.add(70);
        list1.add(60);
        list1.add(50);

        for(int i=0;i<list1.size();i++)
        System.out.print(list1.get(i)+" ");
        System.out.println();
    }
}
