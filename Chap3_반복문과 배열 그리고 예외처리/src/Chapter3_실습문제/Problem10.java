package Chapter3_실습문제;

public class Problem10 {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int ranNum = (int) (Math.random() * 10 + 1);
                matrix[i][j] = ranNum;
            }
        }

        // 랜덤한 위치에 0를 6개 넣겠다.
        for (int i=0;i<6;i++){
            int index1 = (int)(Math.random()*4);
            int index2 = (int)(Math.random()*4);
            if (matrix[index1][index2]==0){
                i--;
                continue;
            }
            matrix[index1][index2]=0;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
