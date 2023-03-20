package chapter8;
//main 에서 예외 처리
public class ex8_14 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println("main메서드에서 예외 처리되었습니다.");
            e.printStackTrace();
        }

    }
    static void method1() throws Exception{
        throw new Exception();
    }
}
