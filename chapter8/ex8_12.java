package chapter8;
//throw: 호출한 메서드에게 예외를 전달하여 예외처리를 떠맡김.
public class ex8_12 {
    public static void main(String[] args) throws Exception{
        method1();
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception();
    }
}
