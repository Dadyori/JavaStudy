package Day03;

import java.util.Scanner;

public class Ex2_10 {
    //합격(80점 이상)인지 판별하는 프로그램
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하시오:");
        int score = scanner.nextInt();
        if (score >= 80){
            System.out.println("축하합니다! 합격입니다.");
        }

        scanner.close();
    }
}
