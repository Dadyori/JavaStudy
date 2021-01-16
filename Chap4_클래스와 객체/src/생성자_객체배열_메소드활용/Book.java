package 생성자_객체배열_메소드활용;
/* 예제 4-4
public class Book {
    String title;
    String author;

    void show(){
        System.out.println(title+" "+author);
    }

    public Book(String t){
        title=t;
        author="작자미상";
    }

    public Book(String t, String a){
        title=t;
        author=a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자","생텍쥐페리");
        Book loveStory = new Book("춘향전");
        System.out.println(littlePrince.title+" "+littlePrince.author);
        System.out.println(loveStory.title+" "+loveStory.author);
    }
}

 */

public class Book{
    //예제 4-5
    String title;
    String author;

    void show() {
        System.out.println(title+" "+author);
    }

    public Book(){
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Book(String title){
        this(title, "작자미상");
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자","생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
    }

}
