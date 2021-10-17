package PearsonChapter19;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardsTest {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(5,20,30);
        System.out.println("sum = " + sumOfElements(intList));
//        compilation error

        List<Double> doubleList = Arrays.asList(50.0, 200.0, 300.0);
        System.out.println("sum = " + sumOfElements(doubleList));
//        compilation error
    }
    //Method with Upper bounded wildcard
    private static double sumOfElements(List<? extends Number>list){
//        this allows the program to run
        double sum = 0.0;
        for(Number num : list)
            sum +=num.doubleValue();
        return sum;
    }


}
