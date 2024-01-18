package Test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(223, "ahaitanya", 26));
        arrayList.add(new Student(245, "Rahul", 24));
        arrayList.add(new Student(209, "cjeet", 32));

//        Collections.sort(arrayList);
//
//        for(Student str: arrayList){
//            System.out.println(str);
//        }
        System.out.println();

        Collections.sort(arrayList, Student.compareName);

        for(Student str: arrayList){
            System.out.println(str);
        }
        System.out.println();

        Collections.sort(arrayList, Student.compareRollno);

        for(Student str: arrayList){
            System.out.println(str);
        }
    }
}
