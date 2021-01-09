package Chapter3_실습문제;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str[] = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true){
            System.out.print("가위 바위 보!>>");
            String myPick = scanner.next();
            int n = (int)(Math.random()*3);
            String computerPick = str[n];

            switch(myPick){
                case "그만": System.exit(0);
                case "가위":
                    if(computerPick.equals("가위")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 비겼습니다.");
                        break;
                    }
                    else if(computerPick.equals("바위")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 컴퓨터가 이겼습니다.");
                        break;
                    }
                    else if(computerPick.equals("보")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 사용자가 이겼습니다.");
                        break;
                    }
                case "바위":
                    if(computerPick.equals("가위")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 사용자가 이겼습니다.");
                        break;
                    }
                    else if(computerPick.equals("바위")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 비겼습니다.");
                        break;
                    }
                    else if(computerPick.equals("보")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 컴퓨터가 이겼습니다.");
                        break;
                    }
                case "보":
                    if(computerPick.equals("가위")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 컴퓨터가 이겼습니다.");
                        break;
                    }
                    else if(computerPick.equals("바위")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 사용자가 이겼습니다.");
                        break;
                    }
                    else if(computerPick.equals("보")){
                        System.out.println("사용자 = "+myPick+" , 컴퓨터 = "+computerPick+", 비겼습니다.");
                        break;
                    }
            }

        }


    }
}
