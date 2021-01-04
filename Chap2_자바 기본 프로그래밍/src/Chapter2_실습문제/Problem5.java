package Chapter2_실습문제;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오>>");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 > n2){
            int temp = n2;
            n2 = n1; n1 = temp;
        }
        if (n2 > n3){
            int temp = n3;
            n3 = n2; n2 = temp;
        }

        if (n1+n2>n3){
            System.out.println("삼각형이 됩니다");
        }

        scanner.close();
    }
}
