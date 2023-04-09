package chapter9;
//Card클래스에 toString() 오버라이딩 예제
class Card2 {
    String kind;
    int number;
    Card2(){
        this("SPADE", 1);
    }
    Card2(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
    //오버라이딩 시 Object 클래스에 정의된 toString()의 접근 제어자가 public 이므로, 이를 오버라이딩하는 Card 클래스에서는 toString()의 접근 제어자를 public 으로 함.
    public String toString(){
        return "kind : " +  kind + ", number :  " + number;
    }
}
public class ex9_6 {
    public static void main(String[] args){
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
