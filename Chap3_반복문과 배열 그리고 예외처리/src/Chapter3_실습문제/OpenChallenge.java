package Chapter3_실습문제;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=1;

        while (true){
            Random r = new Random();
            int ranNum = r.nextInt(100);
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            int bottom=0, top=99;
            while (true){
                System.out.println(bottom+"~"+top);
                System.out.print(count+">>");
                count++;
                int inputNum = scanner.nextInt();
                if (inputNum == ranNum){
                    count=1; bottom=0; top=99;
                    System.out.println("맞았습니다.");
                    System.out.println("다시하시겠습니까(y/n)");
                    String retry = scanner.next();
                    if (retry.equals("n")) System.exit(0);
                    break;
                }else if (inputNum > ranNum){
                    System.out.println("더 낮게");
                    top=inputNum;
                }else {
                    System.out.println("더 높게");
                    bottom=inputNum;
                }
            }
        }
    }
}
