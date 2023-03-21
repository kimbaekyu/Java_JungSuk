package chapter8_2;
//try-catch-finally 사용 예제.
public class ex8_18 {
    public static void main(String[] args){
        try{
            startInstall();     //프로그램 설치에 필요한 준비를 한다.
            copyFiles();        //파일들을 복사한다.
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            deleteTempFiles();  //프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall(){
        /* 프로그램 설치에 필요한 준비를 한다. */
    }
    static void copyFiles(){/* 파일들을 복사한다.*/}
    static void deleteTempFiles(){/* 프로그램 설치에 사용된 임시파일들을 삭제한다. */}
}
