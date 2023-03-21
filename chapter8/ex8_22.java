package chapter8_2;
//에외 되던지기(exception re-throwing) 예제
public class ex8_22 {
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    } //main 메서드의 끝

    static void method1() throws Exception{
        try{
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;
        }
    } //method1에서의 끝
}
