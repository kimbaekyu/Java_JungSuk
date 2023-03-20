package chapter8;
//throw 사용 예외처리
public class ex8_9 {
    public static void main(String[] args){
        try{
            Exception e = new Exception("고의로 발생시켯음.");
            throw e;

        }catch (Exception e){
            System.out.println("에러 메시지 : "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
