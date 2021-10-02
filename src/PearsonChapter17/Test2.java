package PearsonChapter17;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("t.dat")); ) {
            output.writeInt(1234);
            output.writeInt(5678);
            output.close();
        }
    }

}
//    After the following program is finished, how many bytes are there in the file t.dat? Show the contents of each byte.

//Each int value takes four bytes. Since two int values are written into the file, the file contains eight bytes. The values are
//        00 00 04 D2 00 00 16 2E
//        The first four bytes are for 1234, which equals to 4D2 in hex, and the second byte is for 5678, which equals to 2246 in hex.


//17.4.3.5
//        For each of the following statements on a DataOutputStream output, how many bytes are sent to the output?
//        output.writeChar('A');
//        output.writeChars("BC");
//        output.writeUTF("DEF");
//        output.writeChar('A'); => 2 bytes
//        output.writeChars("BC"); => 4 bytes
//        output.writeUTF("DEF"); => 2 + 3 bytes (the first two bytes store the number of characters in the string. Each ASCII character takes one byte in UTF)


