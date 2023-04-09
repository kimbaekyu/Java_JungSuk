package chapter9;
//값은 같지만 참조하는 주소가 다를때 equals 사용 예제
//equals 메서드는 결국 두 개의 참조변수가 같은 객체를 참조하고 있는지, 두 참조변수에 저장된 값(주소값)이 같은지 판단하는 기능

public class ex9_1 {
    public static void main(String[] args){
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("v1 == v2");
        else
            System.out.println("v1! = v2");

        v2 = v1;

        if(v1.equals(v2))
            System.out.println("v1 == v2");
        else
            System.out.println("v1! = v2");
    } //main

}
class Value{
    int value;

    Value(int value){
        this.value = value;
    }
}
