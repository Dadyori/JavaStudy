package Chapter2_실습문제;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int inputNum = scanner.nextInt();
        int ten=inputNum/10, one=inputNum%10, count=0;
        if (ten == 3 || ten == 6 || ten == 9) count++;
        if (one ==3 || one == 6 || one == 9) count++;

        if(count==1) System.out.println("박수짝");
        if(count==2) System.out.println("박수짝짝");

        scanner.close();
    }
}
