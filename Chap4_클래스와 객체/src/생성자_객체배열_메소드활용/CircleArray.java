package 생성자_객체배열_메소드활용;

class Circle배열 {
    int radius;
    public Circle배열(int radius){
        this.radius=radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class CircleArray{
    public static void main(String[] args) {
        Circle배열 [] c;
        c = new Circle배열[5];

        for (int i=0;i<5;i++){
            c[i]=new Circle배열(i);
        }

        for (int i=0; i<c.length;i++){
            System.out.print((int)(c[i].getArea())+" ");
        }
    }
}
