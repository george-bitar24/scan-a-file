import service.DikoneMouService;
import util.FileUtil;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        DikoneMouService service = new DikoneMouService();
        service.scanFile();

        //
//        String g = "Hello";
//        char[] t = g.toCharArray();
//
//        for (char j:t){
//            System.out.println(j);
//        }

//        See FileUtil.java
//        File file = new File("data\\test.txt");
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        String line = bufferedReader.readLine();
//
//        while (line!=null){

//            int lineCharLength = line.split(" ")[0].toCharArray().length;

//            System.out.println(line);
//            int wordcount = line.split(" ").length;
//            int lengthOfFirstWord = line.split(" ")[0].toCharArray().length;
//            String[] words = line.split(" ");
//
//            for(int i=0; i < wordcount ;i++){
//                if (words[i]=="csdc"){
//
//                }
//            }

//            System.out.println(line + ":words -> " + wordcount);

//            String regex = "^69";
//            String regex2 = "^[0-9]";
//
//            Pattern pattern = Pattern.compile(regex);
//            Pattern pattern2 = Pattern.compile(regex2);
//
//            Matcher matcher = pattern.matcher(line);
//            Matcher matcher2 = pattern2.matcher(line);
//
//            if (matcher.find()){
//                System.out.println("mobile phone");
//            }
//
//            if (matcher2.find() && lineCharLength > 4 && matcher.find()){
//                System.out.println("simple phone");
//            }
//            System.out.println(wordcount);

//
//            line = bufferedReader.readLine();
//        }
//        bufferedReader.close();
//        BufferedReader reader = new BufferedReader
//                (new FileReader(new File("C:\\Users\\Administrator\\Desktop\\credentials.txt")));
//
//        String s = "Hello my little malaka";
//        String[] ss = s.split(" ");
//        String keno = " ";
//        System.out.println(ss[3]+keno+ss[2]+keno+ss[1]+keno+ss[0]);



    }
}