package PearsonChapter17;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }
            try (DataInputStream input = new DataInputStream(new FileInputStream("test.dat"))) {
                while (true)
                    System.out.println(input.readDouble());
            }
        }
        catch(EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

//  17.4.3.1
//          Suppose a file contains an unspecified number of double values that were written to the file using the writeDouble method using a DataOutputStream, how do you write a program to read all these values? How do you detect the end of a file?
//          You can use the readDouble method in the DataInputSteam to read double values and use the EOFException to detect the end of the file

//17.4.3.2
//        How do you check the end of a file in an input stream (FileInputStream, DataInputStream)?
//        If the read() method in InputStream returns -1, it is at the end of the file.
