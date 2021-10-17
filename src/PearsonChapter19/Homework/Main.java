package PearsonChapter19.Homework;

//******************************
//        ** Ronald Rajski
//        ** COSC 1174
//        ** Shuffling and Sorting
//        ** October 17, 2021
//********************************

import java.awt.*;
import java.util.ArrayList;

public class Main {

//    sets the list of rectangles
    static ArrayList<Rectangle> rectangles = buildRectangleArray(10);

//    sets the list of Strings

    static ArrayList<String> strings = buildStringArray(10);


//    sets the list of Integers

    static ArrayList<Integer> integers = buildIntegerArray(10);

    public static void main(String[] args) throws Exception {

//        rectangles
        System.out.println("Rectangles before shuffle: " + makePretty(rectangles));
        shuffle(rectangles);
        System.out.println("Rectangles after shuffle: " + makePretty(rectangles));
        sort(rectangles, rectangles.size());








//        strings




//        integers
    }

}

