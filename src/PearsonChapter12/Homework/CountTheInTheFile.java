package PearsonChapter12.Homework;

//Homework Assignment 2
//PseudoCode


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountTheInTheFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        File file = new File(in.nextLine());
        try {
            Scanner fin = new Scanner(file);
            int count = 0;
            while (fin.hasNext()) {
                if (fin.next().equalsIgnoreCase("the"))
                    ++count;
            }
            System.out.print("Enter output file name: ");
            PrintWriter pw = new PrintWriter(in.nextLine());
            pw.println(count);
            fin.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(file.getAbsolutePath() + " is not found!");
        }
    }
}

