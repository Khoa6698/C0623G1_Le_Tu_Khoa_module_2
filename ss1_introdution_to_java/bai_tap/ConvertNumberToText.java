package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Number you want to convert to letter: ");
        number = scanner.nextInt();

        if (number < 10) {
            System.out.println(ReadOneNumberToString(number));
        } else if (number < 20) {
            System.out.println(ReadTwoNumberToString1(number));
        } else if (number < 100) {
            System.out.println(ReadTwoNumberToString2(number));
        } else {
            System.out.println(ReadTwoNumberToString3(number));
        }
    }

    static String ReadOneNumberToString(int number) {
        String result = "";
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (number >= 0 && number < 10) {
            result = strings[number];
        } else {
            result = " out of ability";
        }
        return result;
    }

    static String ReadTwoNumberToString1(int number) {
        String result = "";

        String[] strings1 = {"Ten", "Eleven", "Twelve", "Thirteen"};
        String[] strings2 = {"Ten", "Eleven", "Twelve", "Thirteen", "four", "five", "six", "seven", "eight", "night"};

        int unit = number % 10;
        if (unit < 3) {
            result = strings1[unit];
        }

        if (unit > 3) {
            result = strings2[unit] + "teen";
        }

        return result;
    }

    static String ReadTwoNumberToString2(int number) {
        String result = "";
        String[] strings2 = {"", "", "twenty", "thirty", "fourty", "fivety", "sixty", "seventy", "eighty", "ninety"};
        String[] strings3 = {"one", "two", "three", "for", "five", "six", "seven", "each", "night"};

        int unit1 = number % 10;
        int unit2 = (number / 10) % 10;


        if (unit2 >= 2) {
            result = strings2[unit2];
        }

        if (unit2 >= 2 && unit1 > 0) {
            result = strings2[unit2] + strings3[unit1 - 1];
        }
        return result;
    }

    static String ReadTwoNumberToString3(int number) {
        String result = "";
        String[] strings4 = {"", "", "twenty", "thirty", "fourty", "fivety", "sixty", "seventy", "eighty", "ninety"};
        String[] strings5 = {"one", "two", "three", "for", "five", "six", "seven", "each", "night"};

        int unit1 = number % 10;
        int unit2 = (number / 10) % 10;
        int unit3 = (number / 100) % 10;


        if (unit3 >= 1 && unit2 < 1 && unit1 < 1) {
            result = strings5[unit3 - 1] + "hundred";
        }

        if (unit3 >= 1 && unit2 >= 0 && unit1 >= 0) {
            result = strings5[unit3 - 1] + "hundred and " + strings4[unit2] + strings5[unit1 - 1];
        }
        return result;
    }
}
