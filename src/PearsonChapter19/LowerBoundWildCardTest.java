package PearsonChapter19;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardTest {
//    The way Upper bounded wildcard restricts the unkown type to be as specific type or a subtype of that type same way lower bounded wildcard restricts the unkown type to be a specific type or a super type of that type.
//
//    General form of the lower bounded wildcard

//    A lower bounded wildcard is expressed using the wildcard character('?'), followed by the super keyword, followed by its lower bound:

//    <? super bounded_type>

    public static void main(String[] args) {
        List<Object> objList =  new ArrayList<Object>();
        addNumbers(objList);
        List<Integer>intList = new ArrayList<Integer>();
        intList.add(12);
        intList.add(13);
        addNumbers(intList);
    }
//    Method with lower bounded wildcard
    private static void addNumbers(List<? super Integer>list){
        for (int i = 1; i <=10; i++){
            list.add(i);
        }
        System.out.println(list);
    }

}
