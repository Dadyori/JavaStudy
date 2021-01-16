package 객체지향과_자바클래스만들기;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    public int getArea(){
        return width*height;
    }
}

public class RectApp {
    //예제 4-2
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); //객체생성
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 "+rect.getArea());
        scanner.close();
    }
}
