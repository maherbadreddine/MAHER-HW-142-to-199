package org.example.e163;


class StringManipulator{
    String str;
    StringManipulator(String str){
        this.str=str;
    }
    final String reverseString(){
        StringBuilder sb = new StringBuilder(str);
        return (sb.reverse().toString());

    }
}
class ArrayManipulator {
    final double avgElements(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (sum / array.length);
    }
}
public class E163FinalKeyword {

    public static void main(String[] args){
        StringManipulator obj1=new StringManipulator("hello");
        System.out.println(obj1.reverseString());
        ArrayManipulator obj2=new ArrayManipulator();
        int [] array={3, 4, 5, 6, 6};
        System.out.println(obj2.avgElements(array));
    }

}