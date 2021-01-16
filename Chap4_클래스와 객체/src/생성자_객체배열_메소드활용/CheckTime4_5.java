package 생성자_객체배열_메소드활용;

public class CheckTime4_5 {
    public double getSum(double[] sum){
        double resSum = 0;
        for(int i=0;i<sum.length;i++){
            resSum+=sum[i];
        }
        return resSum;
    }
}
