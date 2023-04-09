package chapter9;
//hashCode() 예제
public class ex9_3 {
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = new String("abc");

        //String 클래스 역시 Object 클래스의 equals 메서드를 그대로 사용하는 것이 아니라 오버라이딩을 통해 String 인스턴스가 갖는 문자열 값을 비교.
        System.out.println(str1.equals(str2));

        // String클래스는  문자열의 내용이 같으면, 동일한 해쉬코드를 반환하도록 hashCode메서드가 오버라이딩 되어 있음.
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // 반면에 System.identityHashCode(Object x)는 Object 클래스의 hashCode메서드처럼 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환.
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
