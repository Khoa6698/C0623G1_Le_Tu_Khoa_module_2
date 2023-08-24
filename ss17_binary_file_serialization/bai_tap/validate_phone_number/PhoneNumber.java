package ss17_string_and_regex.bai_tap.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER = "^[(][0-9]{2}[)][-][(]0[0-9]{9}[)]$";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
