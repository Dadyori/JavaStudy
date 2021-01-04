package Day06;

class Problem1_for {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Problem1_while{
    public static void main(String[] args) {
        int line = 0, star = 5;
        while(line < 5){
            while (star > 0){
                star--;
                System.out.print("*");
            }
            System.out.println();
            line++;
            star = 5-line;
        }
    }
}

class Problem1_doWhile{
    public static void main(String[] args) {
        int line = 0, star = 5;
        do {
            do{
                System.out.print("*");
                star--;
            }while(star>0);
            System.out.println();
            line++;
            star=5-line;
        }while(line<5);
    }
}

class Problem2{
    public static void main(String[] args) {
        for(;;);//무한루프
    }
}

class Problem3{
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<=100;i++){
            if (i%3==0){
                sum+=i;
            }
        }
        System.out.println("1부터 100까지 3의 배수의 합은 "+sum+"이다.");
    }
}


