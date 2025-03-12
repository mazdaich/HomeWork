package lesson_2_3;

public interface MyInterf {

    void foo();
    default void baar(){
        System.out.println("Interf");
    }


}
