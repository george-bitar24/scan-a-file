package service;

import util.FileUtil;
import util.RegexUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;

public class DikoneMouService {

    private final FileUtil fileUtil = new FileUtil();

    private static final String PHONE_REGEX = "^[0-9]";

    private static final String MOBILE_PHONE_REGEX = "^69";

    public void scanFile() throws IOException {
        BufferedReader myBufferedReader = fileUtil.getBufferedReader();
        String line = myBufferedReader.readLine();
        int totalWords = 0;
        while (line != null){
            countWords(line);
            totalWords += countWords(line);
            minima(line, countWords(line));
            minimaPhone(line);
            minimaMobile(line);
            if (minimaMobile(line).find()){
                System.out.println("mobile phone");
            }
            if (minimaPhone(line).find()){
                System.out.println("simple phone");
            }
            line = myBufferedReader.readLine();
        }
        myBufferedReader.close();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("total words of text file are: " + totalWords);
    }

    private Matcher minimaMobile(String line) {
        return RegexUtil.getMatcher(line, MOBILE_PHONE_REGEX);
    }

    private Matcher minimaPhone(String line) {
        return RegexUtil.getMatcher(line, PHONE_REGEX);
    }

    private void minima(String line, int words) {
        System.out.println(line + ":words -> " + words);
    }

    private int countWords(String line) {
        return line.split(" ").length;
    }

    private int lengthOfFirstWord(String line) {
        return line.split(" ")[0].toCharArray().length;
    }


}
