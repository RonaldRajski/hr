package PearsonChapter12.HW2;


//******************************************
//        Name-Ronald Rajski
//        Class- LU COSC 1174
//        Assignment: HW2:Counting the words
//        Date: September 12, 2021
//        **********************************

import java.lang.ref.Cleaner;
import java.util.Locale;
import java.util.Scanner;
//Displays information to the user

public class Prompter {
//    initiates Scanner class
    Scanner input = new Scanner(System.in);

//    prompts user with given String
//    param output prints a prompt on a new line
public void state(String output){
    System.out.println("/n" + output);

}

//prompt user with given string
//returns user response

    public String prompt(String output){
        System.out.println(output);
        String response = cleaner(input.next());
        return response;
    }

//    Cleaner cleans up user input strings
public String cleaner(String userInput){
    return userInput.toLowerCase().trim();
}


//    33














}





