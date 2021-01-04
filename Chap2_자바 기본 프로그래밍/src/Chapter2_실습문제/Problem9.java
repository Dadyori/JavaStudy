package Chapter2_실습문제;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double radius = scanner.nextFloat();

        System.out.print("점 입력>>");
        int checkX = scanner.nextInt();
        int checkY = scanner.nextInt();

        double check = Math.sqrt(Math.pow(checkX-x,2)+Math.pow(checkY-y,2));
        if (check <= radius){
            System.out.println("점 ("+checkX+", "+checkY+")는 원 안에 있다.");
        }

        scanner.close();
    }
}
