package Day08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum = 0, n = 0;
        for (int i=1;i<4;i++){
            System.out.print(i+">>");
            try{
                n = scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.nextLine();  //현재 입력 스트림에 남아 있는 토큰 지운다.
                i--; //인덱스 미리 감소
                continue;
            }
            sum+=n;
        }
        System.out.println("합은 "+sum);
        scanner.close();
    }
}
