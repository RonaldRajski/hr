package PearsonChapter17.HW4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class EncryptDecryptStringByByte {
    private static final String ORIGINAL_INFILE = "plaintext.txt";
    private static final String ENCRYPTED_FILE = "encrypted.txt";
    private static final String DECRYPTED_OUTFILE = "decrypted.txt";

    public static void main(String[] args)
    {
        ArrayList<String> text = readFromFile(ORIGINAL_INFILE);
        encryptAndWrite(text, ENCRYPTED_FILE);
        readDecryptAndWrite(ENCRYPTED_FILE, DECRYPTED_OUTFILE);
    }

    private static String getBinaryOfString(String s)
    {
        int n = s.length();
        String res = "";
        for(int i = 0; i < n; i++)
        {
            int val = Integer.valueOf(s.charAt(i));
            String bin = "";
            while(val > 0)
            {
                if(val % 2 == 1)
                    bin += '1';
                else
                    bin += '0';
                val /= 2;
            }
            bin = reverse(bin);
            res += bin + " ";
        }
        return res;
    }

    private static String reverse(String s)
    {
        char[] chars = s.toCharArray();
        int left, right = 0;
        right = chars.length - 1;

        for (left = 0; left < right; left++, right--)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        return String.valueOf(chars);
    }

    private static ArrayList<String> readFromFile(String filename)
    {
        ArrayList<String> text = new ArrayList<>();
        Scanner fileReader;

        try
        {
            fileReader = new Scanner(new File(filename));
            while(fileReader.hasNextLine())
            {
                text.add(fileReader.nextLine().trim());
            }
            fileReader.close();
        }catch(FileNotFoundException fnfe){
            System.out.println(filename + " cannot be found!");
            System.exit(0);
        }
        return text;
    }

    private static void encryptAndWrite(ArrayList<String> text, String filename)
    {
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(new File(filename));
            pw = new PrintWriter(fw);
            for(String s : text)
            {
                String[] data = s.split(" ");
                String encryptedText = "";
                for(int i = 0; i < data.length; i++)
                {
                    String reversedText = reverse(data[i]);
                    encryptedText += getBinaryOfString(reversedText).trim() + ",";
                }
                pw.write(encryptedText.trim() + System.lineSeparator());
            }

            pw.flush();
            fw.close();
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error in writing encrypted data to " + filename);
            System.exit(0);
        }
    }

    private static void readDecryptAndWrite(String encryptedFile, String decryptedFile)
    {
// read the encrypted text in an arraylist
        ArrayList<String> text = new ArrayList<>();
        Scanner fileReader;
        try
        {
            fileReader = new Scanner(new File(encryptedFile));
            while(fileReader.hasNextLine())
            {
                text.add(fileReader.nextLine().trim());
            }
            fileReader.close();
        }catch(FileNotFoundException fnfe){
            System.out.println(encryptedFile + " cannot be found!");
            System.exit(0);
        }

// decrypt the text and write to the output file
// for decrypting, we need to convert the binary to it's ascii code and then reverse it
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(new File(decryptedFile));
            pw = new PrintWriter(fw);
            for(String s : text)
            {
                String[] data = s.split(",");
                String decryptedText = "";
                for(int i = 0; i < data.length; i++)
                {
// each letters are separated by space, so split each data segment by space
                    String[] binBlocks = data[i].split(" ");
                    String word = "";
                    for(int j = 0; j < binBlocks.length; j++)
                    {
                        int charCode = Integer.parseInt(binBlocks[j], 2);
                        word += new Character((char)charCode).toString();
                    }
                    decryptedText += reverse(word).trim() + " ";
                }
                pw.write(decryptedText.trim() + System.lineSeparator());
            }

            pw.flush();
            fw.close();
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error in writing encrypted data to " + decryptedFile);
            System.exit(0);
        }
    }
}
