package Day01;

public class Day01 {
    public static void main(String[] args) {
        //checkTime (2-1)
        System.out.println("Hi");
        //checkTime (2-2)
        int alpha=30;
        System.out.println(alpha);

        //자료형
        String toolName="JDK";
        System.out.println(toolName+1.8);

        //72p 예제 2-2 변수, 리터럴, 상수 활용
        final double PI = 3.14;
        double radius = 10.0;
        double circleArea = radius * radius * PI;

        System.out.println("원의 면적: "+circleArea);

        //checkTime (2-3)
        final int YEAR = 365;
        final int MONTH = 30;
        final int WEEK = 7;
        System.out.println("년:"+YEAR+" 월:"+MONTH+" 주:"+WEEK);
    }
}
