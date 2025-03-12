package lesson_3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Data.getStudents();

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .distinct()
                .sorted()
                .filter(b -> b.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst().ifPresentOrElse(
                        year -> System.out.println("Год выпуска " + year),
                        () -> System.out.println("Такая книга отсутствует"));
    }
}






























//        List<Book> books1 = Arrays.asList(
//                new Book("Физика", 436, 2023),
//                new Book("Химия", 304, 2023),
//                new Book("Естествознание", 600, 1999),
//                new Book("Оптика", 480, 1991),
//                new Book("Литература", 416, 1996));
//        Student lisa = new Student("Lisa", books1);
//
//        List<Book> books2 = Arrays.asList(
//                new Book("Философия", 354, 2012),
//                new Book("Искуствоведение", 218, 1988),
//                new Book("Информатика", 487, 1995),
//                new Book("Математика", 357, 1991),
//                new Book("Литература", 416, 1996));
//        Student ivan = new Student("Ivan", books2);
//
//        List<Book> books3 = Arrays.asList(
//                new Book("Техника", 198, 2001),
//                new Book("Делопроизводство", 324, 1998),
//                new Book("Безопасность", 100, 1989),
//                new Book("История", 101, 1937),
//                new Book("Экономика", 222, 1995));
//        Student mari = new Student("Mari", books3);
//
//        List<Book> books4 = Arrays.asList(
//                new Book("Языки мира", 654, 2000),
//                new Book("Право", 311, 1992),
//                new Book("Ораторское искусство", 411, 1993),
//                new Book("География", 511, 1994),
//                new Book("Естествознание", 600, 1999));
//        Student arnold = new Student("Arnold", books4);
//
//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(lisa);
//        studentsList.add(ivan);
//        studentsList.add(mari);
//        studentsList.add(arnold);
//
//        for (Student student : studentsList) {
//            System.out.println(student);
//        }

