package Chapter3_실습문제;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int inputNum = scanner.nextInt();
        for (int i=0;i<inputNum;i++) {
            for (int j = inputNum; j > i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
