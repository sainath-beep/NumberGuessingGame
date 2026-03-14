import java.util.*;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        set1.add(10);
        set1.add(0);
        set1.add(30);
        Iterator<Integer> it=set1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
