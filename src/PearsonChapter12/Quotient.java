package PearsonChapter12;


import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Integers:");
        int number1 =  input.nextInt();
        int number2 = input.nextInt();

        try{
            if(number2 == 0)
                throw  new ArithmeticException("Divisor cannot be zero");
            System.out.println(number1 + " / " + number2 + "is" + (number1/number2));
        }
        System.out.println("Divisor cannot be zero");
    }
}
