package PearsonChapter12.HW2;

//******************************************
// * Name: Ronald Rajski
// * Class: COSC 1174
// * Assignment: Counting the Words
// * Date: September 13, 2021
// ******************************************




//
//
//    public String getWorkingDirectory() {
//        return workingDirectory;
//    }
//
//    public void setWorkingDirectory(String workingDirectory) {
//        this.workingDirectory = workingDirectory;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public String getFilePath() {
//        return filePath;
//    }
//
//    public void setFilePath(String filePath) {
//        this.filePath = filePath;
//    }
//
////    Checks to see if string links to a file, creates file oject and passes that to readfile contents. prompts for additional input it it does not exist
//
//    File.open(String newFileName) throws FileNotFoundException{
//        setFileName(newFileName);
//    }
//
//
////    the file
//
//    File file = new File(workingDirectory + "/" + this.fileName);
//
//    try{
//
////        need to display file path to user
//
//        String displayName = file.getPath();
//
////        let the user know we're opening the file
//        prompter.state("opening " + displayName);
//
//        if (file.exists()) {
//            setFilePath(file.getAbsolutePath());
//
//
////        let user know file exists
//            prompter.state("File was opened. Generating report");
//
//            readFileContents(file);
//        } else {
////            initiate catch block with message
//            throw new FileNotFoundException("File does not exist");
//        }
//
//    }catch(FileNotFoundException exception){
////        tell user the error
//        prompter.state(exception.getMessage());
//
////        request a fileName
//
//        String replacementFileName = prompter.state("Enter a file name to oper: ");
//
//
////        recurssion
//        open(replacementFileName);
//
////        need to return file
//        return file;
//    }
//
//
//
//}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {
    Prompter prompt = new Prompter();

    //    sets directory path of files that are reported
    private String workingDirectory;

    //    sets filename so user can read its contents
    private String fileName;

    //sets path to file
    private String FilePath;

    //basic getters and setters

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    public void setWorkingDir(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return this.FilePath;
    }

    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Checks if given string resolves to a file, creates a File object and passes that to
     * readFileContents() if it exists. Prompts for new input if it doesn't exist.
     *
     * @param newFileName sets file to be opened
     * @return file  the File object that was found successfully
     */
    File open(String newFileName) throws FileNotFoundException {
        setFileName(newFileName);

        // the file
        File file = new File(workingDirectory + "/" + this.fileName);
        try {

            /**
             * file path to display to user
             */
            String displayName = file.getPath();

            // let the user know we're opening the file
            prompt.state("\nOpening " + displayName);

            if (file.exists()) {
                setFilePath(file.getPath());

                // okay, the file is there. Let the user know.
                prompt.state("File successfully opened. Generating report.\n");

                readFileContents(file);

            } else {
                // get them to the catch block with a useful message
                throw new FileNotFoundException("File does not exist");
            }

        } catch (FileNotFoundException e) {
            // tell the user what went wrong
            prompt.state(e.getMessage());

            // try to get a new fileName
            String replacementFileName = prompt.state("Enter a filename to open: ");

            // recursion
            open(replacementFileName);
        }

        // return the file
        return file;
    }

//    Reads file contents using Scanner
//    throws FileNotFoundException
//
    ArrayList<String> readFileContents(File file) throws FileNotFoundException {
        /**
         * sets ArrayList to hold all lines returned from scanner
         */
        ArrayList<String> lines = new ArrayList<String>();

        try {
            Scanner fileInput = new Scanner(file);

            //as long as there's a nextLine, keep reading
            while (fileInput.hasNextLine()) {
                // hold the line!
                String line = fileInput.nextLine();
                // add it to the ArrayList above
                lines.add(line);
            }

            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }

//    Displays the directory's contents
//     dirname sets the name of the directory
    File[] showDirectory(String dirName) {
        setWorkingDir(dirName);

        //get the current directory
        File dir = new File(dirName);

        // get all files to list from current directory
        File[] currentDirFiles = dir.listFiles();

        //an ArrayList to hold any of the listed files whose name ends with ".txt"
        ArrayList<String> textFiles = new ArrayList<String>();

        // tell the user what directory they're in
        System.out.printf("%nCurrent Directory:  %s%n", dir.getAbsolutePath());

        // make sure we only count ".txt" files to show file count
        for (File fileObject : currentDirFiles) {
            // get the current file's name
            String currentFileName = fileObject.getName();
            // get currentFileName's last 4 chars
            String lastFourCharacters = currentFileName.substring(currentFileName.length() - 4);
            //if it matches, add it to the ArrayList above
            if (lastFourCharacters.equals(".txt")) {
                textFiles.add(currentFileName);
            }
        }
        System.out.printf("%n%d files in directory%n%n", textFiles.size());

//        for (File f : currentDirFiles) {
//
//            String currentFileName = f.getName();
//            // gets last 4 chars of fileName so we can exclude anything not ending with ".txt"
//            String lastFourCharacters = currentFileName.substring(currentFileName.length() - 4);
//            if (f.isDirectory()) {
//                // System.out.printf("Directory: %20s%n", f.getName());
//                continue;
//            } else if (lastFourCharacters.equals(".txt")) {
//                System.out.printf("File: %20s%n", f.getName());
//            } else {
//                continue;
//            }
//        }
        return currentDirFiles;
    }
}


