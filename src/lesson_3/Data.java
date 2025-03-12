package lesson_3;

import java.util.ArrayList;
import java.util.List;


public class Data {

    public Data(){};
    private  static List<Student> students = List.of(
            new Student("Lisa", new ArrayList<>(List.of(
                    new Book("Физика", 436, 2023),
                    new Book("Химия", 304, 2023),
                    new Book("Естествознание", 600, 1999),
                    new Book("Оптика", 480, 1991),
                    new Book("Литература", 416, 1996)))),
            new Student("Ivan", new ArrayList<>(List.of(
                    new Book("Философия", 354, 2012),
                    new Book("Искуствоведение", 218, 1988),
                    new Book("Информатика", 487, 1995),
                    new Book("Математика", 357, 1991),
                    new Book("Литература", 416, 1996)))),
            new Student("Mari", new ArrayList<>(List.of(
                    new Book("Техника", 198, 2001),
                    new Book("Делопроизводство", 324, 1998),
                    new Book("Безопасность", 100, 1989),
                    new Book("История", 101, 1937),
                    new Book("Экономика", 222, 1995)))),
            new Student("Arnold", new ArrayList<>(List.of(
                    new Book("Языки мира", 654, 2000),
                    new Book("Право", 311, 1992),
                    new Book("Ораторское искусство", 411, 1993),
                    new Book("География", 511, 1994),
                    new Book("Естествознание", 600, 1999))))
    );

    public static List<Student> getStudents() {
        return students;
    }
}
