package chapter9;
//얕은 복사와 깊은 복사 예제.
//얕은 복사: 원본과 복제본이 같은 객체를 공유하는 복제를 얕은 복사(shallow copy)라고 한다.
//얕은 복사에서는 원본을 변경하면 복사본도 영향을 받는다.
//깊은 복사: 원본이 참조하고 있는 객체까지 복제하는 것을 깊은 복사(deep copy)라고 한다.
//깊은 복사에서는 원본과 복사본이 서로다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다.

class Circle2 implements Cloneable{
    PointCircle p;    //원점
    double r;   //반지름

    Circle2(PointCircle p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle2 shallowCopy(){    //얕은 복사
        Object obj = null;

        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e){}

        return (Circle2)obj;
    }

    public Circle2 deepCopy(){    //얕은 복사
        Object obj = null;

        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e){}

        Circle2 c = (Circle2)obj;
        c.p = new PointCircle(this.p.x, this.p.y);

        return c;
    }

    public String toString(){
        return  "[p=" + p + ", r=" + r + "]";
    }
}

class PointCircle{
    int x, y;

    PointCircle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
public class ex9_9 {
    public static void main(String[] args){
        Circle2 c1 = new Circle2(new PointCircle(1,1), 2.0);
        Circle2 c2 = c1.shallowCopy();
        Circle2 c3 = c1.deepCopy();

        System.out.println("c1= "+c1);
        System.out.println("c2= "+c2);
        System.out.println("c3= "+c3);

        System.out.println("=== c1 PointCircle 변경 ===");

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("=== c1 변경 후 ===");
        System.out.println("c1= "+c1);
        System.out.println("c2= "+c2);
        System.out.println("c3= "+c3);
    }
}
