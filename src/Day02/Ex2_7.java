package Day02;

public class Ex2_7 {
    public static void main(String[] args) {
        //비교연산
        System.out.println('a'>'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(2 == 3);
        System.out.println(3 != 2);
        System.out.println(!(3!=2));

        //비교연산과 논리 연산 복합
        System.out.println((3>2) && (3 > 4));       //false
        System.out.println((3 != 2) || (-1 > 0));   //true
        System.out.println((3!=2)^(-1>0));          //true (XOR - 서로 다를 때 True)
    }
}
