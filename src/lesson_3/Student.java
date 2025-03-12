package lesson_3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;

    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {return name;}
    public List<Book> getBooks () {return books;}

    @Override
    public String toString() {
      return "Student name: " + name;}

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Mari", new ArrayList<>(List.of(
                new Book("new book", 111, 1999))));

        try(FileOutputStream output = new FileOutputStream("C:\\lesson_4\\num_1\\Exep_1.1\\st1.json")){
            ObjectOutputStream outObj = new ObjectOutputStream(output);
            outObj.writeObject(student);
        }
        try(FileInputStream input = new FileInputStream("C:\\lesson_4\\num_1\\Exep_1.1\\st1.json")){
            ObjectInputStream inputObj = new ObjectInputStream(input);
            Student inputStudent = (Student) inputObj.readObject();
            System.out.println(inputStudent.getBooks());
            System.out.println(inputStudent);
        }
    }
}
