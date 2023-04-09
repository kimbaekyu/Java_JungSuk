package chapter9;
//toString() 예제
class Card {
    String kind;
    int number;
    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }


}
public class ex9_4 {
    public static void main(String[] args){
        Card c1 = new Card();
        Card c2 = new Card();
        //Object 클래스의 toString()이 호출됨.
        //출력결과: 클래스이름@16진수 해시코드
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
