package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//lines: 43-50
public class RegexUtil {

    public static Matcher getMatcher(String input, String regex){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input);
    }

}
