package Day02;

import java.util.Scanner;

public class CheckTime {
    public static void main(String[] args) {
        //80p 2.4-2
        System.out.println("정수 두개를 입력하시오");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = num1+num2;
        System.out.println("두 정수의 합은: "+result);

        //93p 2.6
        int x = 2, y = 10, z = 0;
        System.out.println(x++*2+--y-5+x*(y%2));

        System.out.println(8 >> 2);
        System.out.println(-16 >> 2);

        int opr = 4;
        System.out.println(opr++);
    }
}
