package Chapter3_실습문제;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputArr[] = new int [10];
        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i=0;i<10;i++){
            int inputNum = scanner.nextInt();
            inputArr[i]=inputNum;
        }
        System.out.print("3의 배수는 ");
        for (int i=0;i<10;i++){
            if (inputArr[i]%3==0)
                System.out.print(inputArr[i]+" ");
        }

        scanner.close();
    }
}
