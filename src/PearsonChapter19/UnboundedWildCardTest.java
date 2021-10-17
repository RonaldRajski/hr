package PearsonChapter19;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardTest {

//    Unbounded wild card in Java Generics
//
//            unbounded wildcards are, as the name suggests, wildcard without and upper or lower bound.  Unbounded wildcard type is specified using the wildcard character (?), for example, List<?>.  This is called a list of unknown type.

//    There are two scenarios where an unbounded wildcard is a useful approach-
//
//    If you are writing a mehod that can be implented using functionality provided in the Object class.
//
//    When the code is using methods in the generic class that doesn't demped on the type parameter. For example, List.size or List.clear, List.isEmpty etc.

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(12,60, 80, 30);
        printElements(intList);

        System.out.println("__________________________");
        List<Double>doubleList = Arrays.asList(10.12, 110.8, 13.2, 12.70);
        printElements(doubleList);

    }

//    Method with Unbounded wildcard
    private static void printElements(List<?>list){
//    private static void printElements(List<Object>list){

        for (Object element: list){
            System.out.println(element);
        }
    }





}
