package lesson_4;

import lesson_3.Student;

import java.io.*;

public class A implements Serializable {
    @Serial
    private static final long serialVersionUID = 3;

    public static class C extends A{
        private String name = "ivan";

        private void writeObject() throws IOException {
            throw new NotSerializableException();
        }

        private void readObject () throws Exception {
            throw new NotSerializableException();
        }

     }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        C c = new C();

        try(FileOutputStream output = new FileOutputStream("C:\\lesson_4\\num_1\\Exep_1.1\\stttt.json")){
            ObjectOutputStream outObj = new ObjectOutputStream(output);
            outObj.writeObject(c);
        } catch (IOException e) {
            System.out.println(e);;
        }
        try(FileInputStream input = new FileInputStream("C:\\lesson_4\\num_1\\Exep_1.1\\stttt.json")){
            ObjectInputStream inputObj = new ObjectInputStream(input);
            C inputC = (C) inputObj.readObject();
            System.out.println(inputC);
        }


    }

}
