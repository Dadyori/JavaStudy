package Day07;

class CheckTime3_3 {
    //137p
    public static void main(String[] args) {
        //1번 10개의 정수를 저장하는 배열 tenArray을 선언하고 생성하는 코드 작성
        int tenArray[] = new int [10];

        //2번 배열 tenArray의 크기를 어떻게 알아낼 수 있는가?
        System.out.println("tenArray의 크기는 "+tenArray.length+"이다.");

        //3번 배열 tenArray에 1~10까지 저장 후 모든 원소의 값을 더하여 출력하라.
        int sum = 0, forSum=0;
        for(int i=1;i<=tenArray.length;i++) {
            tenArray[i-1] = i;
            sum+=i;
        }

        //for each문 사용해보자
        for (int e : tenArray){
            forSum+=e;
        }
        System.out.println("반복문 내의 합:"+sum+" for-each문 사용하여 구한 합:"+forSum);
    }
}

class CheckTime3_5{
    //145p
    public static void main(String[] args) {
        //2번 int형 원소를 갖는 2*3 크기의 2차원 배열을 생성하라
        int array2D[][] = new int [2][3];

        //4번 다음 그림과 같은 구조와 값을 갖는 비정방형 배열을 생성하라
        int unregularArr[][] = {{0,1,2,3},{4},{5},{6,7,8,9}};
    }
}