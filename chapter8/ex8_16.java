package chapter8_2;

import java.io.*;
//main메서드에게 예외가 발생했음을 알려서 파일이름을 다시 입력 받도록 하는 예제.
public class ex8_16 {
    public static void main(String[] args){
        try{
            File f = createFile(args[0]);
            System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
        }catch(Exception e) {
            System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
        }
    }
    static File createFile(String fileName) throws Exception{
        if(fileName==null||fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }

}
