package Chapter2_실습문제;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();
        if (n1 > n2){
            int temp = n2;
            n2 = n1; n1 = temp;
        }
        if (n2 > n3){
            int temp = n3;
            n2 = n3; n2 = temp;
        }
        System.out.println(n2);

        scanner.close();
    }
}
