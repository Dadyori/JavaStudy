package Chapter3_실습문제;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String inputStr = scanner.next();
        char inputWord = inputStr.charAt(0);
        int startNum = 'a';
        for (int i=startNum;i<=inputWord;i++){
            for (int j=startNum;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
