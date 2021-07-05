import java.util.*;

public class JavaComparator {

    class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    class sortStudents implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            int gpaCompareValue = String.valueOf(s2.getCgpa()).compareTo(String.valueOf(s1.getCgpa()));

            if(gpaCompareValue == 0) {
                int firstNameCompareValue = s1.getFname().compareTo(s2.getFname());

                if(firstNameCompareValue == 0) {
                    return Integer.toString(s1.getId()).compareTo(Integer.toString(s2.getId()));
                } else {
                    return firstNameCompareValue;
                }
            } else {
                return gpaCompareValue;
            }
        }

    }

    public class Solution
    {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }

            Collections.sort(studentList, new sortStudents());

            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }
    }




}
