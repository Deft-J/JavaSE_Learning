package com.coder.lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;


public class StudentList {
    public static void main(String[] args) {
        String[] names ={"学生1","学生2","学生3","学生4","学生5"};
        Integer[] ages ={16,19,18,14,20};
        BiFunction<String ,Integer ,Student> biFunction=Student::new;
        List<Student> list=createStudent(5,names,ages,biFunction);
        System.out.println("按年龄升序排序：");
        list.sort(Comparator.comparing(Student::getAge));
        list.forEach(System.out::println);
    }
    public static List<Student> createStudent(int x,String[] names,Integer[] ages,
                                              BiFunction<String ,Integer ,Student> function) {
        List<Student> list=new ArrayList<>();
        for (int i = 0; i < x; i++) {
            Student student=function.apply(names[i],ages[i]);
            list.add(student);
        }
        return list;
    }
}
