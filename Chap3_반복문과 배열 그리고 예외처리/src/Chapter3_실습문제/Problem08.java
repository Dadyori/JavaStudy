package Chapter3_실습문제;

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇 개? ");
        int arrSize = scanner.nextInt();
        int intArr[] = new int [arrSize];

        for (int i=0;i<arrSize;i++){
            int ranNum = (int)(Math.random()*100+1);
            intArr[i]=ranNum;
            for (int j=0;j<i;j++){
                if(intArr[j]==ranNum) {
                    i--;
                    break;
                }
            }
        }

        for (int i=0;i<arrSize;i++){
            System.out.print(intArr[i]+" ");
        }

        scanner.close();
    }
}
