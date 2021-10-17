package PearsonChapter19.Homework;

//******************************
//        ** Ronald Rajski
//        ** COSC 1174
//        ** Shuffling and Sorting
//        ** October 17, 2021
//********************************


import java.util.ArrayList;

public class Main {

//    sets the list of rectangles
    static ArrayList<Rectangle> rectangles = createRectangleArray(10);

//    sets the list of Strings

    static ArrayList<String> strings = createStringArray(10);


//    sets the list of Integers

    static ArrayList<Integer> integers = createIntArray(10);

    public static void main(String[] args) throws Exception {

//        rectangles
        System.out.println("Rectangles before shuffle: " + makeCool(rectangles));
        shuffle(rectangles);
        System.out.println("Rectangles after shuffle: " + makeCool(rectangles));
        sort(rectangles, rectangles.size());
        System.out.println("Rectangles after sorting: " + makeCool(rectangles));

        //        strings

        System.out.println("Strings before shuffle: " + strings.toString());
        shuffle(strings);
        System.out.println("Strings after shuffle: " + strings.toString());
        sort(strings, strings.size());
        System.out.println("Strings after sorting: " + strings.toString());


        //        integers
        System.out.println("Integers before shuffle: " + integers.toString());
        shuffle(integers);
        System.out.println("Integers after shuffle: " + integers.toString());
        sort(integers, integers.size());
        System.out.println("Integers after sorting: " + integers.toString());
    }

//    generates a string for printing objects that are too long to prit in a useful
//        way using the normal toString() method
//        List<E> list of objects to generate a string from the prettified string

    static <E> String makeCool(ArrayList<E>list){
        String cool = "";
        for (E element : list){
            cool +="\n " + element.toString();
        }
        cool += "/n";
        return cool;
    }

//    generates a string representation of a character from the integer
//    -num the interger to generate a string from
//        -return the string
    static String makeString(int num){
        int chrint = num + 64;
        char c = (char) chrint;
        return String.valueOf(c);
    }

//    will create Rectangle objects. Each rectangle will be 1 x 1 unit larger than the
//     * last.
//     * - n  the size of the ArrayList to generate
//     * - return ArrayList<Rectangle>  the generated ArrayList of Rectangle objects
//     */
    static ArrayList<Rectangle> createRectangleArray(int n) {
        ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
        for(int i = 1; i <= n; i++) {
            Rectangle rect = new Rectangle(i, i);
            rects.add(rect);
        }
        return rects;
    }

    /**
     * Generates a list of ten strings.
     - n  the length of the list to generate
     - ArrayList<String>:  the list of strings
     */
    static ArrayList<String> createStringArray(int n) {
        ArrayList<String> created = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            created.add(makeString(i));
        }
        return created;
    }

    /**
      Creates a list of integers of the given size.
      n-  the size of the list to generate
      - ArrayList<Integer>:  the list of integers
     */
    static ArrayList<Integer> createIntArray(int n) {
        ArrayList<Integer> created = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            created.add(i + 1);
        }
        return created;
    }

    /**
     * Sorts the elements of a given list.
      - list<E>  the list of elements to sort
      -n  the size of the list
     */
    public static <E extends Comparable<E>> void sort(ArrayList<E> list, int n) {
        // base case: if the size of the given list is 1, you have reached the end of sorting
        if(n == 1) {
            return;
        }

        // otherwise, iterate over the list
        for(int i = 0; i < n - 1; i++) {

            // compare elements at current index & current index + 1
            // if element at current index is larger than element at
            // next index, swap them
            if(list.get(i).compareTo(list.get(i+1)) > 0) {
                // hold the element to be moved temporarily
                E temp = list.get(i);
                // set index of the former larger element to the smaller element
                list.set(i, list.get(i + 1));
                // set the index of the formerly smaller element to the larger (temp) element
                list.set(i + 1, temp);
            }

            // recursive call with list size decremented
            sort(list, n - 1);
        }
    }

    /**
     * Shuffles the elements of a given list
     - list<E>  the list of elements to shuffle
     */
    public static <E extends Comparable<E>> void shuffle(ArrayList<E> list){
        int n = list.size();
        for(int i = 0; i < n; i++) {
            int j = (int) ((Math.random() * (n - 1)) + 1);
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}



class Rectangle implements Comparable<Rectangle> {
    private int width;
    private int height;
    private int area;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

//    getters and setters

    public int getWidth(){
        return width;
    }

   public void setWidth(int width){
        this.width = width;
   }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }


    public int getArea() {
        return area;
    }

//    end of getters and setters

    /**
     * Returns a usable string representation of the Rectangle object
     */
    public String toString() {
        return String.format("{w: %d, h: %d, a: %d}", getWidth(), getHeight(), getArea());
    }

    /**
     that -Rectangle to compare against
      will return int: < 0 if given Rectangle area is larger,
     *              > 0 if given Rectangle area is smaller,
     *              0 if given Rectangle area is equal
     */
    public int compareTo(Rectangle that) {
        if(getArea() != that.getArea()) {
            return getArea() - that.getArea();
        } else {
            return 0;
        }

    }
}

