package PearsonChapter17;

public class Test1 {
        public static void main(String[] args)
                throws java.io.IOException {
            try (java.io.PrintWriter output =
                         new java.io.PrintWriter("t.txt") ) {
                output.printf("%s", "1234");
                output.printf("%s", "5678");
                output.close();
            }
        }
    }

//    Java uses Unicode, but Windows uses ASCII. The Unicode is converted to ASCII code when writing a character. After the program is finished, the file will contain eight bytes, each represents an ASCII code. So, the values are
//        31 32 33 34 35 36 37 38
//        Note the ASCII code in hex for character 1 is 31.

