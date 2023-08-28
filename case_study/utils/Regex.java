package case_study.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean regexIdEmployee(String input) {
        String regex = "^NV-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean CheckNameEmployee(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (ch == ' ' && str.charAt(i) != ' ')
                stringBuffer.append(
                        Character.toUpperCase(str.charAt(i)));
            else
                stringBuffer.append(str.charAt(i));
            ch = str.charAt(i);
        }
        String nameInputValid = stringBuffer.toString().trim();

        return str.equals(nameInputValid);
    }

    public static boolean calculateAgeWithJodaTime(Date birthDate) {
        Date now = new Date();
        long timeBetween = now.getTime() - birthDate.getTime();
        double yearsBetween = timeBetween / 3.15576e+10;
        int age = (int) Math.floor(yearsBetween);
        return age >= 18;
    }

    public static Date covertStringToDate(String birthDate) {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date birthDateUtil = null;
        try {
            birthDateUtil = df.parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return birthDateUtil;
    }

    public static String covertDateToString(Date birthDate) {
        String pattern = "dd-MM-yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        birthDate = Calendar.getInstance().getTime();
        return df.format(birthDate);
    }

    public static boolean regexIdCardEmployee(String input){
        String regex = "^[0-9]{9,12}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean regexPhoneNumberEmployee(String input){
        String regex = "^0[0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

}
