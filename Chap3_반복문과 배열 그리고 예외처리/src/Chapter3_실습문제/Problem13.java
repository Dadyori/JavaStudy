package Chapter3_실습문제;

public class Problem13 {
    public static void main(String[] args) {
        int ten=0, one;
        for (int i=3;i<100;i++){
            one = i%10;
            if (i>10) ten = i/10;
            if (one==3 || one==6 || one==9){
                System.out.print(i+" 박수 짝");
                if (ten==3 || ten==6 || ten==9){
                    System.out.print("짝");
                }
                System.out.println();
            }
            else if (ten==3 || ten==6 || ten==9){
                System.out.println(i+" 박수 짝");
            }
        }
    }
}
