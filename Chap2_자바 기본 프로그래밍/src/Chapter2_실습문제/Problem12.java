package Chapter2_실습문제;

import java.util.Scanner;

class Problem12_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        int a = scanner.nextInt();
        String op = scanner.next();
        int b = scanner.nextInt();

        if (op.equals("+")) System.out.println(a+op+b+"의 계산 결과는 "+(a+b));
        else if (op.equals("-")) System.out.println(a+op+b+"의 계산 결과는 "+(a-b));
        else if (op.equals("*")) System.out.println(a+op+b+"의 계산 결과는 "+(a*b));
        else if (op.equals("/")) System.out.println(a+op+b+"의 계산 결과는 "+(a/b));

        scanner.close();
    }
}

class Problem12_Switch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        int a = scanner.nextInt();
        String op = scanner.next();
        int b = scanner.nextInt();

        switch(op){
            case "+":
                System.out.println(a+op+b+"의 계산 결과는 "+(a+b));
                break;
            case "-":
                System.out.println(a+op+b+"의 계산 결과는 "+(a-b));
                break;
            case "*":
                System.out.println(a+op+b+"의 계산 결과는 "+(a*b));
                break;
            case "/":
                System.out.println(a+op+b+"의 계산 결과는 "+(a/b));
                break;
        }
        scanner.close();
    }
}
