package Chapter3_실습문제;

public class Problem07 {
    public static void main(String[] args) {
        int randomArr[] = new int [10];
        float sum=0;
        for (int i=0;i<10;i++){
            int ranNum = (int)(Math.random()*10+1);
            randomArr[i]=ranNum;
            sum+=ranNum;
        }
        System.out.print("랜덤한 정수들 : ");
        for (int i=0;i<10;i++){
            System.out.print(randomArr[i]+" ");
        }
        System.out.println();
        System.out.println("평균은 "+sum/10);
    }
}
