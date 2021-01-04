package Chapter2_실습문제;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int c1x = scanner.nextInt();
        int c1y = scanner.nextInt();
        int c1r = scanner.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int c2x = scanner.nextInt();
        int c2y = scanner.nextInt();
        int c2r = scanner.nextInt();

        //두 점 사이의 거리
        double distance = Math.sqrt(Math.pow(c2x-c1x,2)+Math.pow(c2y-c1y,2));

        if (distance <= c1r+c2r){
            System.out.println("두 원은 서로 겹친다");
        }

        scanner.close();
    }
}
