package ss8_clean_code_refactoring.bai_tap.student_management.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Util {
    private Util() {
    }

    public static Date scanToDate(String input) throws ParseException {
        try (Scanner scanner = new Scanner(input)) {
            String dateString = scanner.next();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.parse(dateString);
        }
    }

    public static boolean isConvertStringToSex(int typeSex) {
        return typeSex == 1;
    }
}

