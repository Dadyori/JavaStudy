package Chapter2_실습문제;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>> ");
        int integer = scanner.nextInt();
        int ten = integer/10;
        int one = integer%10;
        if (ten==one){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }

        scanner.close();
    }
}
