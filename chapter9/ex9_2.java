package chapter9;
// equals 오버라이딩 예제
// equals:두 참조변수에 저장된 값이 같은지를 판단하는 기능
public class ex9_2 {
    public static void main(String[] args){
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1==p2)
            System.out.println("p1 == p2");
        else
            System.out.println("p1 != p2");
        if(p1.equals(p2))
            System.out.println("p1 == p2");
        else
            System.out.println("p1 != p2");
    }
}

class Person{
    long id;
    // equals 오버라이딩
    public boolean equals(Object obj){
        if(obj instanceof  Person)
            return id == ((Person)obj).id;
        else
            return false;
    }

    Person(long id){
        this.id = id;
    }
}