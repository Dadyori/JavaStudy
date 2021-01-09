package Chapter3_실습문제;

public class Problem09 {
    public static void main(String[] args) {
        int matrix [][] = new int [4][4];

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                int ranNum = (int)(Math.random()*10+1);
                matrix[i][j]=ranNum;
            }
        }

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
