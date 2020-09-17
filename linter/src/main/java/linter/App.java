/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(linter("src/main/resources/gates.js"));
    }

    public static String linter(String path) {

        Scanner jsScript = null;
        try {
            jsScript = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("no file found at that path");
        }

        String errors = "";
        int lineCounter = 0;
        while (jsScript.hasNext()) {
            lineCounter++;
            String nextLine = jsScript.nextLine();
            if (nextLine.length() == 0) {
                continue;
            }
            // reference for substring method: https://stackoverflow.com/questions/5163785/how-do-i-get-the-last-character-of-a-string
            if (nextLine.substring(nextLine.length() - 1).equals("{") || nextLine.substring(nextLine.length() - 1).equals("}")) {
                continue;
            }
            if (nextLine.contains("if") || nextLine.contains("else")) {
                continue;
            }
            if (nextLine.substring(nextLine.length() - 1).equals(";")) {
                continue;
            } else {
                if (errors.length() != 0) {
                    errors += "\n";
                }
                errors += "Line " + lineCounter + ": Missing semicolon.";
            }
        }

        return errors;
    }
}