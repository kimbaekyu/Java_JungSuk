package chapter9;
//공변 반환타입(covariant return type) 예제
//공변 반환타입(covariant return type)의 기능은 오버라이딩할 때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것이다.
//공변 반환타입을 사용하면, 조상의 타입이 아닌, 실제로 반환되는 자손 객체의 타입으로 반환할 수 있어서 번거로운 형변환이 줄어든다는 장점이 있다.
class Point2 implements Cloneable{
    int x, y;

    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x= " + x + ", y= "+y;
    }

    public Point2 clone(){   //반환타입을 Object에서 Point로 변경
        Object obj = null;
        try {
            obj = super.clone();    //clone()은 반드시 예외처리를 해주어야 한다.
        }catch(CloneNotSupportedException e){}
        return (Point2)obj;  //Point타입으로 형변환.
    }
}
public class ex9_7_2 {
    public static void main(String[] args){
        Point2 original = new Point2(3, 5);
        Point2 copy = original.clone();   //clone해서 새로운 객체를 생성

        System.out.println(original);
        System.out.println(copy);
    }
}
