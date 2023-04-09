package chapter9;
import java.util.Arrays;
//clone()을 이용해서 배열을 복사하는 예제.
//배열 뿐만 아니라 java.util 패키지의 Vector, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Calendar, Date와 같은 클래스들이 이와 같은 방식으로 복제가 가능.
public class ex9_8 {
    public static void main(String[] args){
        int[] arr ={1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();   // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
