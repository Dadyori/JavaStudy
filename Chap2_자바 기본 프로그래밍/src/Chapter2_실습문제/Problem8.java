package Chapter2_실습문제;

import java.util.Scanner;

public class Problem8 {
    //hint
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if ((x >= rectx1 && x<=rectx2) && (y >= recty1 && y <= recty2)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("사각형 왼쪽 상단 모서리 좌표를 입력하시오>>");
        int x1 = scanner.nextInt(); int y1 = scanner.nextInt();
        System.out.print("사각형 오른쪽 하단 모서리 좌표를 입력하시오>>");
        int x2 = scanner.nextInt(); int y2 = scanner.nextInt();

        if (inRect(x1,y1,100,100,200,200) ^ inRect(x2,y2,100,100,200,200)){
            System.out.println("입력받은 사각형은 (100,100), (200,200)으로 이루어진 사각형과 충돌한다");
        }
        scanner.close();
    }
}
