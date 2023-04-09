package chapter9;
//String 클래스와 Date클래스의 toString() 사용 예제
public class ex9_5 {
    public static void main(String[] args){
        String str = new String("KOREA");
        java.util.Date today =  new java.util.Date();

        System.out.println(str);
        //String 클래스의 toString()은 String 인스턴스가 갖고있는 문자열을 반환하도록 오버라이딩.
        System.out.println(str.toString());

        System.out.println(today);
        //Date 클래스의 경우 Date 인스턴스가 갖고 있는  날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩.
        System.out.println(today.toString());
    }
}
