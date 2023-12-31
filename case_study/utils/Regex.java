package case_study.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static boolean regexId(String input) {
        String regex = "^NV-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return !m.matches();
    }

    public static boolean CheckName(String str) {
        StringBuilder stringBuffer = new StringBuilder();
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

        return !str.equals(nameInputValid);
    }

    public static boolean calculateAgeWithJodaTime(Date birthDate) {
        Date now = new Date();
        long timeBetween = now.getTime() - birthDate.getTime();
        double yearsBetween = timeBetween / 3.15576e+10;
        int age = (int) Math.floor(yearsBetween);
        return age < 18;
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

//    public static String covertDateToString(Date birthDate) {
//        String pattern = "dd-MM-yyyy";
//        DateFormat df = new SimpleDateFormat(pattern);
//        birthDate = Calendar.getInstance().getTime();
//        return df.format(birthDate);
//    }

    public static boolean regexIdCard(String input){
        String regex = "^[0-9]{9,12}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return !m.matches();
    }

    public static boolean gmailRegex(String input){
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return !m.matches();
    }

    public static boolean regexPhoneNumberEmployee(String input){
        String regex = "^0[0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return !m.matches();
    }

    public static boolean regexIdCustomer(String input) {
        String regex = "^KH-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return !m.matches();
    }

    public static boolean validate(String string, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        return !m.matches();
    }
    public static boolean checkArea(String input){
        String regex = "^[3-9][0-9]|[1-9]{1}[0-9]{2,}$";
        if(validate(input, regex)){
            System.out.println("Absurd!");
            return true;
        }else {
            if (Double.parseDouble(input)<=30){
                System.out.println("The number you enter must be greater than 30");
                return true;
            }
        }
        return false;
    }

    public static boolean checkPrice(String input){
        String regex = "^\\d{0,8}";
        if(validate(input, regex)){
            System.out.println("Absurd!");
            return false;
        }else {
            if(Double.parseDouble(input)<=0){
                System.out.println("The number you enter must be greater than 0");
                return false;
            }
        }
        return true;
    }

    public static boolean checkLimitPeopleAmount(String input){
        String regex = "^[1-9]{1}|[1][0-9]$";
        if(validate(input, regex)){
            System.out.println("Absurd!");
            return true;
        }else {
            return false;
        }
    }

    public static boolean regexIdFacility(String input) {
        String regex = "^SVLV-[0-9]{4}|SVHO-[0-9]{4}|SVRO-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean regexFreeTranslation(String input){
        String regex = "^[a-zA-z\\\\d\\\\,]+$";
        if(validate(input, regex)){
            System.out.println("Absurd!");
            return false;
        }else {
            return true;
        }
    }

    public static boolean regexIdVilla(String input) {
        String regex = "^SVVL-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean regexIdRoom(String input) {
        String regex = "^SVRO-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean regexIdHouse(String input) {
        String regex = "^SVHO-[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }
}
