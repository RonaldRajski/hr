package PearsonChapter12.HW2;

//*********************************************
//        *Name: Ronald Rajski
//        * Class: COSC 1174
//        * Assignment: Counting  the Words
//        * Date: September 12, 2021
// ********************************************



import java.util.ArrayList;

//Class used to generate a report from a given array of strings

public class Report {

//    Array to add unique words from a String
    String[] words = new String[100];

//    Array to track occurrences of unique words
    int[] wordInstances = new int[150];


//     ReportData returns ArrayList of String[] of words and word instances

    ReportData generate(ArrayList<String> text) {
//        text sets text to be used for report
        for (String line : text) {

            // split given string and add to array
            // make lowerCase for easier matching
            String[] currentWords = line.toLowerCase().split("\\W+");
            for (String currentWord : currentWords) {
                addWord(currentWord);
            }
        }

        // instantiate new Report object so we can return both words and wordInstances to caller
        ReportData data = new ReportData(words, wordInstances);
        return data;
    }

//    Increments element of wordInstance at given index
    void updateWordInstances(int wordIndex) {
        wordInstances[wordIndex]++;
    }

//    checks to ensure word is unique
    void addWord(String word) {
        // makes word uppercase for  the generated report
        String upWord = word.toUpperCase();

        // set true until false
        boolean isUnique = true;

        // track which occurrance of null the following loop is encountering
        int nullCount = 0;

        // if element at index is not null and matches the given string
        // increment the count at given index in wordInstances

        for (int i = 0; i < words.length; i++) {
            if (words[i] != null && words[i].equals(upWord)) {
                // set unique to false so the next loop is ignored
                isUnique = false;
                // increment count
                wordInstances[i]++;
            }
        }

        // if given string has not been deemed non-unique
        // loop through again and add string at first null occurrance
        if (isUnique == true) {

            // set to 0 so it can be incremented to 1 @ first null
            nullCount = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j] == null) {

                    // pre-increment so it will be 1 before next conditional
                    ++nullCount;

                    // if first null
                    if (nullCount == 1) {
                        // add the word
                        words[j] = upWord;
                        // increment the counter
                        wordInstances[j]++;
                    }
                }
            }
        }
    }

//    testing for printing the report to the console

    void showWords() {
        System.out.printf("%n%-10s %20s%n%n", "Word", "Appearances");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                System.out.printf("%-10s%20d%n", words[i], wordInstances[i]);
            }
        }
    }
}
