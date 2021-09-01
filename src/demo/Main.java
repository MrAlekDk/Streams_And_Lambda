package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        FileLoader fl = new FileLoader();
        ArrayList<Student> students = fl.getAllStudents("resources/Dat20Bstuderende.csv");


        Map<Character, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(student -> student.getOrigin()));

        System.out.println(collect.get('A').size());
        System.out.println(collect.get('B').size());
        System.out.println(collect.get('C').size());
        System.out.println(collect.get('D').size());

        List<Student> sorted = students.stream()
                .sorted(Comparator.comparing(student -> student.getLastname()))
        .collect(Collectors.toList());


        System.out.println("Sorted by last name:");
        sorted.forEach(s -> System.out.println(s.getLastname()));

    }
}
