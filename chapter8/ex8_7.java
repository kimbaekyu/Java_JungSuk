package chapter8;
//try-catch 예외 처리 catch블럭
public class ex8_7 {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        }
        catch(Exception e){ //ArithmeticException 대신 Exception을 사용.
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
