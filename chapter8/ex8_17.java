package chapter8_2;
//try-catch-finally가 필요한 경우 예제
public class ex8_17 {
    //deleteTempFiles()는 무조건 실행되어야 하므로 finally를 사용하면 효율적.
    public static void main(String[] args){
        try{
            startInstall();     //프로그램 설치에 필요한 준비를 한다.
            copyFiles();        //파일들을 복사한다.
            deleteTempFiles();  //프로그램 설치에 사용된 임시파일들을 삭제한다.
        }catch (Exception e){
            e.printStackTrace();
            deleteTempFiles();  //프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall(){
        /* 프로그램 설치에 필요한 준비를 한다. */
    }
    static void copyFiles(){/* 파일들을 복사한다.*/}
    static void deleteTempFiles(){/* 프로그램 설치에 사용된 임시파일들을 삭제한다. */}
}
