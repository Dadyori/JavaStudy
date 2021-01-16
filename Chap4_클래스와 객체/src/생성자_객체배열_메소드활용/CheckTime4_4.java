package 생성자_객체배열_메소드활용;

class Human {
    String name;
    int age;
    double height, weight;

    public Human(String name){
        this.name = name;
    }
}

public class CheckTime4_4 {
    public static void main(String[] args) {
        Human aHuman = new Human("홍길동");
        aHuman.age = 21;
        aHuman.height = 180.5;
        aHuman.weight = 73.2;

        Human [] humanArr = new Human[5];

    }
}
