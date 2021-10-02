package PearsonChapter17;
import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class Test {

        public static void main(String[] args) {
            try (
                    FileInputStream fis = new FileInputStream("test.dat"); ) {
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
//            catch (FileNotFoundException ex) {
//                ex.printStackTrace();
//
//                Double catcH
//            }
        }
    }


//Why do you have to declare to throw IOException in the method or use a try-catch block to handle IOException for Java I/O programs?
//        Almost all the methods and constructors in Java I/O classes, because there are always some unexpected situation may arise during I/O.

//    What will happen if you attempt to create an input stream on a nonexistent file? What will happen if you attempt to create an output stream on an existing file? Can you append data to an existing file?
//        A FileNotFoundException would occur if you attempt to create an input stream for a nonexistent file. You can append data in an existent file if the output stream is created using new FileOutputStream(filename, true) or new FileOutputStream(File, true). Otherwise, the file is overridden if it already exists.

//How do you append data to an existing text file using java.io.PrintWriter?
//        An instance of FileInputStream can be used as an argument to construct a Scanner and an instance of FileOutputStream can be used as an argument to construct a Formatter. So you can create a Formatter to append text into a file using
//        new Formatter(new FileOutputStream("temp.txt", true));
//        If temp.txt does not exist, it is created. If temp.txt already exists, new data is appended to the file.

//    What is written to a file using writeByte(91) on a FileOutputStream?
//        writeByte(91) writes one byte for number 91 (0x5B in hex, 01011011 in binary) is written to a file using FileOutputStream.





