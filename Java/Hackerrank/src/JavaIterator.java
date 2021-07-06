import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("###");
        mylist.add("Java");
        mylist.add("4");

        Iterator it = mylist.iterator();

        while(it.hasNext()) {
            Object element = it.next();
            if((String) element == "###") {
                while(it.hasNext()) {
                    System.out.println(it.next());
                }
            }
        }

    }
}
