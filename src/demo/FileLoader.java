package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileLoader {

    private Scanner sc;

    public FileLoader() {

    }

    public ArrayList<Student> getAllStudents(String filePath) {
        ArrayList<Student> allStudents = new ArrayList<>();
        try {
            sc = new Scanner(new FileReader(filePath));
            sc.nextLine();

            while (sc.hasNextLine()){
                String[] values = sc.nextLine().split(";");
                if(values.length<4){
                    System.out.println("Du er rasmus, duh");
                    allStudents.add(new Student(values[0],values[1],values[2]));
                }
                else if(values.length==4){
                    allStudents.add(new Student(values[0],values[1],values[2],values[3]));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return allStudents;
    }

}
