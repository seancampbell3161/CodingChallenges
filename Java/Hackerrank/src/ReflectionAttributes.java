import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

// You have to fill in the incompleted lines so that it prints all the methods of another class called Student in alphabetical order.

public class ReflectionAttributes {

    public class Solution {

        public static void main(String[] args){
            Class student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
}
