package 생성자_객체배열_메소드활용;

public class Circle {
    int radius;
    String name;

    public Circle() {
        //생성자의 이름은 클래스명과 동일
        //매개변수 없는 기본생성자
        radius =1; name="";
    }

    public Circle(int r, String n){
        //매개변수를 가진 생성자
        radius=r; name=n;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);
    }
}
