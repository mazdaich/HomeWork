package lesson_3;

import java.io.*;
import java.util.Objects;

public class Book implements Comparable<Book>, Externalizable {
    @Serial
    private static final long serialVersionUID = 2;

    private String name;
    private int pages;
    private int year;
    public Book(){};
    public Book(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {return name;}
    public int getPages() {return pages;}
    public int getYear() {return year;}

    @Override
    public String toString() {
        return "Book{" +
                "name = " + name +
                ", pages = " + pages +
                ", year = " + year + '}';
    }

    // сравниваем объекты. проверяем равны ли ссылки, является ли obj объектом класса Book, сравниваем по параметрам
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Book o) {
        return this.pages - (o.getPages());
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeInt(this.getPages());
        out.writeInt(this.getYear());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        pages = in.readInt();
        year = in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Book book = new Book("java для чайников", 941, 2025);
        try(FileOutputStream path = new FileOutputStream("C:\\lesson_4\\num_2\\Exep_2.2\\book2.csv")){
            ObjectOutputStream outObj = new ObjectOutputStream(path);
            outObj.writeObject(book);
        }
        try(FileInputStream path = new FileInputStream("C:\\lesson_4\\num_2\\Exep_2.2\\book2.csv")){
            ObjectInputStream inputObj = new ObjectInputStream(path);
            Book rb = (Book) inputObj.readObject();
            System.out.println(rb);
        }
    }
}
