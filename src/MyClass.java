
public class MyClass{
    private int num;
    private String word;
    final Integer constant = 74;

    MyClass() {
        num = 15;
       word = "Hello";
    }

    MyClass(int num, String word) {

        this.num = num;
        this.word = word;
    }

    public static void main(String[] args){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(99, "www");
        System.out.println(t2.getConstant());
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getConstant() {
        return constant;
    }
}