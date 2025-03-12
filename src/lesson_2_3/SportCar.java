package lesson_2_3;

public class SportCar extends CarServ implements MyInterf{

    @Override
    public void CarMethod() {
        System.out.println("from CarMethod");

    }

    @Override
    public void foo() {
        System.out.println("from Scar");

    }
}
