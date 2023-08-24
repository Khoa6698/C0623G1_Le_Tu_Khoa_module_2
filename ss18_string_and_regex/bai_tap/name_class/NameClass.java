package ss17_string_and_regex.bai_tap.name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_REGEX ="^[CAP][0-9]{4}[GHIK]$";

    public NameClass(){
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
