package Day02;

import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        //2.4 자바에서 키 입력
        /*
        System.in을 통해 사용자로부터 키를 입력받는다 (일련의 바이트 정보)
        키보드에서 입력된 키를 사용자가 원하는 타입으로 변환해주는 Scanner 클래스
         */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String city = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean isSingle = scanner.nextBoolean();

        System.out.println(name+" "+city+" "+age+" "+weight+" "+isSingle);

        /*
        공백을 끼고 있는 문자열을 입력받기 위해서는 nextLime()을 이용한다
        nextLine()은 엔터키가 입력될 때까지 입력받으므로 엔터를 기다리는 용도로도 사용 가능하다
        next()는 엔터를 치더라고 다른 키가 입력될 때 까지 기다린다. (절대 빈 문자열을 리턴하지 않는다.)
         */

        scanner.close(); //객체의 사용을 종료하려면 닫아준다.
        //scanner = new Scanner(system.ln); //닫은 후 다시 입력받을 수 없다.
    }

}
